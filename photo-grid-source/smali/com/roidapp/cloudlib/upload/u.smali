.class final Lcom/roidapp/cloudlib/upload/u;
.super Lcom/roidapp/cloudlib/upload/v;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/util/concurrent/CountDownLatch;

.field final synthetic h:Lcom/roidapp/cloudlib/upload/UploadPhotoService;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .prologue
    .line 295
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/u;->h:Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    iput-object p2, p0, Lcom/roidapp/cloudlib/upload/u;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/upload/u;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/roidapp/cloudlib/upload/u;->c:Z

    iput-object p5, p0, Lcom/roidapp/cloudlib/upload/u;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/roidapp/cloudlib/upload/u;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/roidapp/cloudlib/upload/u;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/roidapp/cloudlib/upload/u;->g:Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/cloudlib/upload/v;-><init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;B)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->i:Ljava/lang/String;

    .line 299
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->b:Ljava/lang/String;

    const-string v1, "facebook"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 300
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/upload/u;->c:Z

    if-nez v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->a:Ljava/lang/String;

    const/16 v1, 0x3c0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/upload/w;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->i:Ljava/lang/String;

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->h:Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/u;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/u;->d:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/roidapp/cloudlib/upload/u;->c:Z

    iget-object v4, p0, Lcom/roidapp/cloudlib/upload/u;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/upload/u;->j:Z

    .line 309
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->g:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 310
    return-void

    .line 304
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->b:Ljava/lang/String;

    const-string v1, "twitter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->a:Ljava/lang/String;

    const/16 v1, 0x400

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/upload/w;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->i:Ljava/lang/String;

    .line 306
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/u;->h:Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/u;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/u;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/u;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/upload/UploadPhotoService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/upload/u;->j:Z

    goto :goto_0
.end method
