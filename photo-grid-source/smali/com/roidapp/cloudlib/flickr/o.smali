.class final Lcom/roidapp/cloudlib/flickr/o;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 327
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/o;->d:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    iput-object p2, p0, Lcom/roidapp/cloudlib/flickr/o;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/flickr/o;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roidapp/cloudlib/flickr/o;->c:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 330
    const/4 v2, 0x0

    .line 332
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/o;->a:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/o;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Ljava/lang/String;Ljava/io/OutputStream;)Z

    move-result v0

    .line 334
    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/o;->d:Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lcom/roidapp/cloudlib/flickr/p;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/p;-><init>(Lcom/roidapp/cloudlib/flickr/o;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 348
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 349
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 356
    :cond_1
    :goto_0
    return-void

    .line 352
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 344
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 346
    if-eqz v1, :cond_1

    .line 348
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 349
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 352
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 346
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_2

    .line 348
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 349
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 353
    :cond_2
    :goto_3
    throw v0

    .line 352
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 346
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 344
    :catch_4
    move-exception v0

    goto :goto_1
.end method
