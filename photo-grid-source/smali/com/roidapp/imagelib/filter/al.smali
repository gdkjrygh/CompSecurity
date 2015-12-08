.class final Lcom/roidapp/imagelib/filter/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/aj;)V
    .locals 0

    .prologue
    .line 538
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/al;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImageLoadDone(Ljava/lang/Throwable;II)V
    .locals 2

    .prologue
    .line 542
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/al;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x402

    invoke-static {v0, v1, p2, p3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 543
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/al;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 544
    return-void
.end method
