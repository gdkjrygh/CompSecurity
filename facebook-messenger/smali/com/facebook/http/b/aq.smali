.class public Lcom/facebook/http/b/aq;
.super Ljava/lang/Object;
.source "FbHttpRequestRetryHandler.java"

# interfaces
.implements Lorg/apache/http/client/HttpRequestRetryHandler;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-class v0, Lcom/facebook/http/b/aq;

    sput-object v0, Lcom/facebook/http/b/aq;->a:Ljava/lang/Class;

    .line 58
    const-string v0, "fbandroid_http_aggressive_retry"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/http/b/aq;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/facebook/http/b/aq;->c:Lcom/facebook/prefs/shared/d;

    .line 68
    return-void
.end method

.method private a(Ljava/lang/String;IZ)V
    .locals 3

    .prologue
    .line 149
    sget-object v1, Lcom/facebook/http/b/aq;->a:Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p3, :cond_0

    const-string v0, "] Retrying("

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 151
    return-void

    .line 149
    :cond_0
    const-string v0, "] Not Retrying("

    goto :goto_0
.end method

.method private a(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 93
    if-nez p1, :cond_0

    .line 94
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Exception parameter may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_0
    if-nez p3, :cond_1

    .line 97
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "HTTP context may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_1
    sget-object v2, Lcom/facebook/http/b/aq;->a:Ljava/lang/Class;

    const-string v3, "Exception"

    invoke-static {v2, v3, p1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    const/4 v2, 0x3

    if-le p2, v2, :cond_2

    .line 104
    sget-object v1, Lcom/facebook/http/b/aq;->a:Ljava/lang/Class;

    const-string v2, "Hit retry limit"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 145
    :goto_0
    return v0

    .line 108
    :cond_2
    instance-of v2, p1, Lorg/apache/http/NoHttpResponseException;

    if-eqz v2, :cond_3

    .line 110
    const-string v0, "NoHttpResponseException"

    invoke-direct {p0, v0, p2, v1}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    move v0, v1

    .line 111
    goto :goto_0

    .line 114
    :cond_3
    instance-of v2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v2, :cond_4

    .line 116
    const-string v1, "SSLHandshakeException"

    invoke-direct {p0, v1, p2, v0}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    goto :goto_0

    .line 120
    :cond_4
    iget-object v2, p0, Lcom/facebook/http/b/aq;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/http/b/aq;->c:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/http/b/aq;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v2

    if-eqz v2, :cond_5

    move v0, v1

    .line 124
    :cond_5
    instance-of v2, p1, Ljava/io/InterruptedIOException;

    if-eqz v2, :cond_6

    .line 126
    const-string v1, "InterruptedIOException"

    invoke-direct {p0, v1, p2, v0}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    goto :goto_0

    .line 129
    :cond_6
    instance-of v2, p1, Ljava/net/UnknownHostException;

    if-eqz v2, :cond_7

    .line 131
    const-string v1, "UnknownHostException"

    invoke-direct {p0, v1, p2, v0}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    goto :goto_0

    .line 134
    :cond_7
    instance-of v2, p1, Ljava/net/ConnectException;

    if-eqz v2, :cond_8

    .line 136
    const-string v1, "ConnectException"

    invoke-direct {p0, v1, p2, v0}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    goto :goto_0

    .line 144
    :cond_8
    const-string v0, "Default"

    invoke-direct {p0, v0, p2, v1}, Lcom/facebook/http/b/aq;->a(Ljava/lang/String;IZ)V

    move v0, v1

    .line 145
    goto :goto_0
.end method


# virtual methods
.method public retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
    .locals 3

    .prologue
    .line 75
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/http/b/aq;->a(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z

    move-result v1

    .line 76
    if-eqz v1, :cond_1

    .line 77
    const-string v0, "fb_http_retried_exceptions"

    invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 79
    if-nez v0, :cond_0

    .line 80
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 81
    const-string v2, "fb_http_retried_exceptions"

    invoke-interface {p3, v2, v0}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_1
    return v1
.end method
