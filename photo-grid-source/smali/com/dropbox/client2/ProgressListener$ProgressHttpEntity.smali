.class public Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;
.super Lorg/apache/http/entity/HttpEntityWrapper;
.source "SourceFile"


# instance fields
.field private final length:J

.field private final listener:Lcom/dropbox/client2/ProgressListener;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpEntity;Lcom/dropbox/client2/ProgressListener;)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V

    .line 71
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'listener\' is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    iput-object p2, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->listener:Lcom/dropbox/client2/ProgressListener;

    .line 73
    invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->length:J

    .line 74
    return-void
.end method

.method static synthetic access$000(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)Lcom/dropbox/client2/ProgressListener;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->listener:Lcom/dropbox/client2/ProgressListener;

    return-object v0
.end method

.method static synthetic access$100(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->length:J

    return-wide v0
.end method


# virtual methods
.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->wrappedEntity:Lorg/apache/http/HttpEntity;

    new-instance v1, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;

    invoke-direct {v1, p0, p1}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;-><init>(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;Ljava/io/OutputStream;)V

    invoke-interface {v0, v1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 79
    return-void
.end method
