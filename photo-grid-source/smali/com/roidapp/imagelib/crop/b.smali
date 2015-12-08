.class final Lcom/roidapp/imagelib/crop/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/a;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 96
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 97
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/a;->a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 98
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-static {v2}, Lcom/roidapp/imagelib/crop/a;->c(Lcom/roidapp/imagelib/crop/a;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lcom/roidapp/imagelib/crop/c;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/imagelib/crop/c;-><init>(Lcom/roidapp/imagelib/crop/b;Landroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 112
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/b;->a:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/a;->e:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 117
    return-void

    .line 113
    :catch_0
    move-exception v0

    .line 114
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
