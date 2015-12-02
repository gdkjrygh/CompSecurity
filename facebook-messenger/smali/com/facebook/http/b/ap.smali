.class public Lcom/facebook/http/b/ap;
.super Ljava/lang/Object;
.source "FbHttpRequestProcessor.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/String;

.field private static final c:Ljava/util/logging/Logger;


# instance fields
.field private final d:Lcom/facebook/http/b/m;

.field private final e:Lcom/facebook/http/b/v;

.field private final f:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            ">;"
        }
    .end annotation
.end field

.field private volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/http/b/ap;

    sput-object v0, Lcom/facebook/http/b/ap;->a:Ljava/lang/Class;

    .line 34
    const-string v0, "OrcaHttpRequestProcessor"

    sput-object v0, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    .line 36
    const-class v0, Lcom/facebook/http/b/ap;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/facebook/http/b/ap;->c:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/b/m;Lcom/facebook/http/b/v;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/facebook/http/b/ap;->d:Lcom/facebook/http/b/m;

    .line 48
    iput-object p2, p0, Lcom/facebook/http/b/ap;->e:Lcom/facebook/http/b/v;

    .line 49
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    .line 50
    return-void
.end method

.method private a(Ljava/lang/String;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;",
            "Lorg/apache/http/HttpResponse;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 240
    :try_start_0
    invoke-interface {p2, p3}, Lorg/apache/http/client/ResponseHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 271
    return-object v0

    .line 241
    :catch_0
    move-exception v0

    .line 242
    invoke-interface {p3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 243
    if-eqz v1, :cond_0

    .line 245
    :try_start_1
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    .line 253
    :cond_0
    :goto_0
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_1

    .line 254
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 246
    :catch_1
    move-exception v1

    .line 249
    sget-object v2, Lcom/facebook/http/b/ap;->c:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "Error consuming content after an exception."

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 258
    :cond_1
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    .line 259
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RuntimeException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 263
    :cond_2
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_3

    .line 264
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "IOException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 268
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Throwable"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    new-instance v1, Ljava/lang/reflect/UndeclaredThrowableException;

    invoke-direct {v1, v0}, Ljava/lang/reflect/UndeclaredThrowableException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .locals 1

    .prologue
    .line 194
    invoke-static {p1}, Lcom/facebook/http/b/ax;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/facebook/http/b/ap;->d:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->a()Lorg/apache/http/client/CookieStore;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/client/CookieStore;->clear()V

    .line 197
    :cond_0
    invoke-static {p1}, Lcom/google/common/base/Throwables;->propagateIfPossible(Ljava/lang/Throwable;)V

    .line 198
    const-class v0, Ljava/io/IOException;

    invoke-static {p1, v0}, Lcom/google/common/base/Throwables;->propagateIfPossible(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 199
    new-instance v0, Ljava/lang/reflect/UndeclaredThrowableException;

    invoke-direct {v0, p1}, Ljava/lang/reflect/UndeclaredThrowableException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;
    .locals 4

    .prologue
    .line 277
    const/4 v0, 0x0

    .line 279
    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v1

    .line 280
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 281
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    move-result v3

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 286
    :cond_0
    return-object v0
.end method

.method private a(Ljava/lang/String;ZLorg/apache/http/HttpResponse;Ljava/lang/Throwable;J)V
    .locals 1
    .param p3    # Lorg/apache/http/HttpResponse;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Throwable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 217
    .line 218
    if-eqz p3, :cond_0

    .line 219
    invoke-interface {p3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    .line 223
    :cond_0
    return-void
.end method

.method private a(Lorg/apache/http/HttpResponse;)V
    .locals 0

    .prologue
    .line 183
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 171
    iget-boolean v0, p0, Lcom/facebook/http/b/ap;->g:Z

    if-eqz v0, :cond_0

    .line 172
    new-instance v0, Ljava/io/IOException;

    const-string v1, "In lame duck mode"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;)TT;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 121
    if-nez p3, :cond_0

    .line 122
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Response handler must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_0
    invoke-direct {p0}, Lcom/facebook/http/b/ap;->d()V

    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 129
    const/4 v2, 0x0

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 133
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/ap;->e:Lcom/facebook/http/b/v;

    invoke-virtual {v0, p2}, Lcom/facebook/http/b/v;->a(Lorg/apache/http/HttpRequest;)V

    .line 136
    iget-object v1, p0, Lcom/facebook/http/b/ap;->d:Lcom/facebook/http/b/m;

    invoke-direct {p0, p2}, Lcom/facebook/http/b/ap;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v3

    const/4 v0, 0x0

    check-cast v0, Lorg/apache/http/protocol/HttpContext;

    invoke-interface {v1, v3, p2, v0}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 137
    :try_start_1
    invoke-direct {p0, v3}, Lcom/facebook/http/b/ap;->a(Lorg/apache/http/HttpResponse;)V

    .line 138
    invoke-direct {p0, p1, p3, v3}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/HttpResponse;)Ljava/lang/Object;

    move-result-object v7

    .line 139
    iget-object v0, p0, Lcom/facebook/http/b/ap;->e:Lcom/facebook/http/b/v;

    invoke-virtual {v0, v3, v7}, Lcom/facebook/http/b/v;->a(Lorg/apache/http/HttpResponse;Ljava/lang/Object;)V

    .line 143
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 144
    if-eqz v0, :cond_1

    .line 146
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 149
    :cond_1
    const/4 v2, 0x1

    .line 155
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v5, v0, v5

    move-object v0, p0

    move-object v1, p1

    .line 158
    invoke-direct/range {v0 .. v6}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;ZLorg/apache/http/HttpResponse;Ljava/lang/Throwable;J)V

    .line 159
    return-object v7

    .line 151
    :catch_0
    move-exception v0

    move-object v3, v4

    .line 153
    :goto_0
    :try_start_2
    invoke-direct {p0, v0}, Lcom/facebook/http/b/ap;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    :catchall_0
    move-exception v1

    move-object v7, v1

    move-object v4, v0

    :goto_1
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v5, v0, v5

    move-object v0, p0

    move-object v1, p1

    .line 158
    invoke-direct/range {v0 .. v6}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;ZLorg/apache/http/HttpResponse;Ljava/lang/Throwable;J)V

    .line 159
    throw v7

    .line 155
    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v3, v4

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v7, v0

    goto :goto_1

    .line 151
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;)Lorg/apache/http/HttpResponse;
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 77
    invoke-direct {p0}, Lcom/facebook/http/b/ap;->d()V

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 79
    const/4 v2, 0x0

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/http/b/ap;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 84
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    iget-object v0, p0, Lcom/facebook/http/b/ap;->e:Lcom/facebook/http/b/v;

    invoke-virtual {v0, p2}, Lcom/facebook/http/b/v;->a(Lorg/apache/http/HttpRequest;)V

    .line 87
    if-eqz p3, :cond_0

    .line 88
    new-instance v0, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 89
    const-string v1, "fb_http_data_category"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, ":"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    :goto_0
    iget-object v1, p0, Lcom/facebook/http/b/ap;->d:Lcom/facebook/http/b/m;

    invoke-direct {p0, p2}, Lcom/facebook/http/b/ap;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v3

    invoke-interface {v1, v3, p2, v0}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 93
    :try_start_1
    iget-object v0, p0, Lcom/facebook/http/b/ap;->e:Lcom/facebook/http/b/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/facebook/http/b/v;->a(Lorg/apache/http/HttpResponse;Ljava/lang/Object;)V

    .line 94
    invoke-direct {p0, v3}, Lcom/facebook/http/b/ap;->a(Lorg/apache/http/HttpResponse;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 95
    const/4 v2, 0x1

    .line 101
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v5, v0, v5

    move-object v0, p0

    move-object v1, p1

    .line 104
    invoke-direct/range {v0 .. v6}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;ZLorg/apache/http/HttpResponse;Ljava/lang/Throwable;J)V

    .line 105
    return-object v3

    .line 97
    :catch_0
    move-exception v0

    .line 99
    :goto_1
    :try_start_2
    invoke-direct {p0, v0}, Lcom/facebook/http/b/ap;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    :catchall_0
    move-exception v1

    move-object v7, v1

    move-object v3, v4

    move-object v4, v0

    :goto_2
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v5, v0, v5

    move-object v0, p0

    move-object v1, p1

    .line 104
    invoke-direct/range {v0 .. v6}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;ZLorg/apache/http/HttpResponse;Ljava/lang/Throwable;J)V

    .line 105
    throw v7

    .line 101
    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v3, v4

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v7, v0

    goto :goto_2

    .line 97
    :catch_1
    move-exception v0

    move-object v4, v3

    goto :goto_1

    :cond_0
    move-object v0, v4

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/http/b/ap;->g:Z

    .line 164
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/http/b/ap;->g:Z

    .line 168
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/http/b/ap;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/client/methods/HttpUriRequest;

    .line 178
    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V

    goto :goto_0

    .line 180
    :cond_0
    return-void
.end method
