.class final Lcom/roidapp/imagelib/retouch/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/n;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImageLoadDone(Ljava/lang/Throwable;II)V
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/n;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x402

    invoke-static {v0, v1, p2, p3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 203
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/n;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 204
    return-void
.end method
