.class final Lcom/roidapp/imagelib/retouch/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 275
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 276
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 295
    :cond_0
    :goto_0
    return v2

    .line 278
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 281
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 283
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 284
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 285
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->o(Lcom/roidapp/imagelib/retouch/m;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPressed(Z)V

    goto :goto_0

    .line 289
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/m;->n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 290
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 291
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/p;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->o(Lcom/roidapp/imagelib/retouch/m;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setPressed(Z)V

    goto :goto_0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
