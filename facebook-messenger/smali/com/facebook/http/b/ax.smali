.class public Lcom/facebook/http/b/ax;
.super Ljava/lang/Object;
.source "ProtocolExceptions.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Z
    .locals 2

    .prologue
    .line 15
    invoke-static {p0}, Lcom/facebook/http/b/ax;->f(Ljava/lang/Throwable;)Lorg/apache/http/client/HttpResponseException;

    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v0

    const/16 v1, 0x191

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Ljava/lang/Throwable;Ljava/lang/Class;)Z
    .locals 2

    .prologue
    .line 38
    move-object v0, p0

    .line 39
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 41
    const/4 v0, 0x1

    .line 45
    :goto_1
    return v0

    .line 43
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static b(Ljava/lang/Throwable;)Z
    .locals 3

    .prologue
    .line 20
    invoke-static {p0}, Lcom/facebook/http/b/ax;->f(Ljava/lang/Throwable;)Lorg/apache/http/client/HttpResponseException;

    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v1

    const/16 v2, 0x190

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c(Ljava/lang/Throwable;)Z
    .locals 3

    .prologue
    .line 25
    invoke-static {p0}, Lcom/facebook/http/b/ax;->f(Ljava/lang/Throwable;)Lorg/apache/http/client/HttpResponseException;

    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v1

    const/16 v2, 0x1f4

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lorg/apache/http/client/HttpResponseException;->getStatusCode()I

    move-result v0

    const/16 v1, 0x258

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    .line 30
    const-class v0, Ljava/io/IOException;

    invoke-static {p0, v0}, Lcom/facebook/http/b/ax;->a(Ljava/lang/Throwable;Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    .line 34
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-static {p0, v0}, Lcom/facebook/http/b/ax;->a(Ljava/lang/Throwable;Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public static f(Ljava/lang/Throwable;)Lorg/apache/http/client/HttpResponseException;
    .locals 2

    .prologue
    .line 49
    move-object v0, p0

    .line 50
    :goto_0
    if-eqz v0, :cond_1

    .line 51
    instance-of v1, v0, Lorg/apache/http/client/HttpResponseException;

    if-eqz v1, :cond_0

    .line 52
    check-cast v0, Lorg/apache/http/client/HttpResponseException;

    .line 56
    :goto_1
    return-object v0

    .line 54
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
