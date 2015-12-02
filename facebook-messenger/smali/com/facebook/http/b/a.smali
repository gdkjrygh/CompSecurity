.class public Lcom/facebook/http/b/a;
.super Ljava/lang/Object;
.source "ClientGZipContentCompression.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    return-void
.end method

.method public static a()Lorg/apache/http/HttpRequestInterceptor;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/http/b/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/http/b/d;-><init>(Lcom/facebook/http/b/b;)V

    return-object v0
.end method

.method public static b()Lorg/apache/http/HttpResponseInterceptor;
    .locals 2

    .prologue
    .line 44
    new-instance v0, Lcom/facebook/http/b/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/http/b/e;-><init>(Lcom/facebook/http/b/b;)V

    return-object v0
.end method
