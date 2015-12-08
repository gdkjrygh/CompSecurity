.class final Lcom/roidapp/cloudlib/instagram/j;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/j;->d:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    iput-object p2, p0, Lcom/roidapp/cloudlib/instagram/j;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/instagram/j;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roidapp/cloudlib/instagram/j;->c:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 256
    const/4 v2, 0x0

    .line 258
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/j;->a:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/j;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Ljava/lang/String;Ljava/io/OutputStream;)Z

    move-result v0

    .line 260
    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/j;->d:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;)Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lcom/roidapp/cloudlib/instagram/k;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/instagram/k;-><init>(Lcom/roidapp/cloudlib/instagram/j;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 277
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 284
    :cond_1
    :goto_0
    return-void

    .line 280
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 272
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 274
    if-eqz v1, :cond_1

    .line 276
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 277
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 280
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 274
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_2

    .line 276
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 277
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 281
    :cond_2
    :goto_3
    throw v0

    .line 280
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 274
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 272
    :catch_4
    move-exception v0

    goto :goto_1
.end method
