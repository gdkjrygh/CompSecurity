.class Lcom/facebook/http/b/c;
.super Lorg/apache/http/entity/HttpEntityWrapper;
.source "ClientGZipContentCompression.java"

# interfaces
.implements Lcom/facebook/http/b/at;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpEntity;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V

    .line 81
    return-void
.end method


# virtual methods
.method public a()Lorg/apache/http/HttpEntity;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/http/b/c;->wrappedEntity:Lorg/apache/http/HttpEntity;

    return-object v0
.end method

.method public getContent()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/http/b/c;->wrappedEntity:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    .line 90
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v1
.end method

.method public getContentLength()J
    .locals 2

    .prologue
    .line 96
    const-wide/16 v0, -0x1

    return-wide v0
.end method
