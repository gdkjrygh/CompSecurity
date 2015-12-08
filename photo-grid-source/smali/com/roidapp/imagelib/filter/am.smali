.class final Lcom/roidapp/imagelib/filter/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/c/c;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aq;

.field final synthetic b:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/aj;Lcom/roidapp/imagelib/filter/aq;)V
    .locals 0

    .prologue
    .line 634
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    iput-object p2, p0, Lcom/roidapp/imagelib/filter/am;->a:Lcom/roidapp/imagelib/filter/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 638
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x400

    invoke-static {v0, v1, v2, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 639
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/am;->a:Lcom/roidapp/imagelib/filter/aq;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 640
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 641
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 645
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->destroy()V

    .line 646
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    if-eqz v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroy()V

    .line 648
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/am;->b:Lcom/roidapp/imagelib/filter/aj;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/aj;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    .line 650
    :cond_0
    return-void
.end method
