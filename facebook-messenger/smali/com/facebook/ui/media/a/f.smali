.class Lcom/facebook/ui/media/a/f;
.super Lcom/facebook/ui/media/a/c;
.source "MediaDownloader.java"


# instance fields
.field private final a:Lorg/apache/http/HttpEntity;

.field private final b:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Lorg/apache/http/HttpEntity;)V
    .locals 1

    .prologue
    .line 129
    sget-object v0, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/a/c;-><init>(Lcom/facebook/ui/media/a/d;)V

    .line 130
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/HttpEntity;

    iput-object v0, p0, Lcom/facebook/ui/media/a/f;->a:Lorg/apache/http/HttpEntity;

    .line 131
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/a/f;->b:Ljava/io/InputStream;

    .line 132
    return-void
.end method


# virtual methods
.method public b()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/ui/media/a/f;->b:Ljava/io/InputStream;

    return-object v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/ui/media/a/f;->b:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/media/a/f;->a:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :goto_0
    return-void

    .line 144
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/ui/media/a/f;->a:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    return-wide v0
.end method
