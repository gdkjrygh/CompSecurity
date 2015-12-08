.class public final Lkik/android/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/p$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;

.field private static b:Ljava/util/Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-string v0, "AndroidPhotoHandler"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/p;->a:Lorg/c/b;

    .line 79
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Lkik/android/p;->b:Ljava/util/Vector;

    return-void
.end method

.method public static a(Ljava/lang/String;Lkik/a/z;)Lkik/android/net/d;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 180
    const/4 v2, -0x1

    .line 183
    :try_start_0
    new-instance v0, Lkik/android/net/a/i;

    invoke-direct {v0, p0, p1}, Lkik/android/net/a/i;-><init>(Ljava/lang/String;Lkik/a/z;)V

    .line 184
    invoke-virtual {v0}, Lkik/android/net/a/i;->a()V

    .line 185
    invoke-static {v0}, Lkik/android/p;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 187
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    .line 188
    const/16 v3, 0xc8

    if-ne v2, v3, :cond_1

    .line 191
    const-string v3, "Content-Length"

    invoke-interface {v0, v3}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v3

    .line 192
    array-length v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_0

    .line 211
    :goto_0
    return-object v1

    .line 197
    :cond_0
    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 198
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/h;->a(Lorg/apache/http/HttpEntity;)[B

    move-result-object v0

    .line 200
    if-eqz v0, :cond_2

    array-length v3, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v6, v3

    cmp-long v3, v6, v4

    if-nez v3, :cond_2

    :goto_1
    move-object v1, v0

    move v0, v2

    .line 211
    :goto_2
    new-instance v2, Lkik/android/net/d;

    invoke-direct {v2, v1, v0}, Lkik/android/net/d;-><init>(Ljava/lang/Object;I)V

    move-object v1, v2

    goto :goto_0

    .line 206
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected response code while downloading picture: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " at url: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v2

    .line 212
    goto :goto_2

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_2

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;Lkik/a/f/k;ZLkik/a/e/v;)Lkik/android/p$a;
    .locals 3

    .prologue
    .line 226
    invoke-static {p0, p2, p4}, Lkik/android/p;->b(Ljava/lang/Object;Lkik/a/f/k;Lkik/a/e/v;)Lkik/android/net/a/j;

    move-result-object v1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Lkik/a/f/k;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "?g="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p3, :cond_1

    const-string v0, "&silent=1"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/net/a/j;->setURI(Ljava/net/URI;)V

    :cond_0
    invoke-static {v1}, Lkik/android/p;->a(Lkik/android/net/a/j;)Lkik/android/p$a;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;Lkik/a/f/k;Lkik/a/e/v;)Lkik/android/p$a;
    .locals 1

    .prologue
    .line 232
    invoke-static {p0, p1, p2}, Lkik/android/p;->b(Ljava/lang/Object;Lkik/a/f/k;Lkik/a/e/v;)Lkik/android/net/a/j;

    move-result-object v0

    invoke-static {v0}, Lkik/android/p;->a(Lkik/android/net/a/j;)Lkik/android/p$a;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lkik/android/net/a/j;)Lkik/android/p$a;
    .locals 3

    .prologue
    .line 252
    new-instance v1, Lkik/android/p$a;

    invoke-direct {v1}, Lkik/android/p$a;-><init>()V

    .line 253
    const/4 v0, -0x1

    .line 255
    invoke-static {p0}, Lkik/android/p;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 256
    if-eqz v2, :cond_0

    .line 257
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    .line 260
    :cond_0
    iput v0, v1, Lkik/android/p$a;->a:I

    .line 261
    return-object v1
.end method

.method private static a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 4

    .prologue
    .line 316
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 317
    new-instance v1, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v1}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 318
    const-string v2, "http.agent"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 319
    const-string v3, "User-Agent"

    invoke-interface {p0, v3, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    invoke-interface {v0, p0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/Object;Lkik/a/f/k;Lkik/a/e/v;)Lkik/android/net/a/j;
    .locals 4

    .prologue
    .line 276
    check-cast p0, Ljava/io/File;

    .line 277
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    new-array v0, v0, [B

    .line 279
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 280
    invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 281
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 283
    invoke-interface {p1}, Lkik/a/f/k;->e()Ljava/lang/String;

    move-result-object v1

    .line 287
    invoke-static {p2}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v2

    .line 295
    new-instance v3, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v3, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 297
    new-instance v0, Lkik/android/net/a/j;

    invoke-direct {v0, v1, v2}, Lkik/android/net/a/j;-><init>(Ljava/lang/String;Lkik/a/z;)V

    .line 299
    const-string v1, "User-Agent"

    const-string v2, "Content"

    invoke-static {v2}, Lkik/android/util/DeviceUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/net/a/j;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-virtual {v0, v3}, Lkik/android/net/a/j;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 305
    invoke-virtual {v0}, Lkik/android/net/a/j;->a()V

    .line 306
    return-object v0
.end method
