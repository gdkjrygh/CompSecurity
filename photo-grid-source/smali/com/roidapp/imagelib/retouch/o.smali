.class final Lcom/roidapp/imagelib/retouch/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v3, 0x32

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 239
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    :goto_0
    return-void

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->f(Lcom/roidapp/imagelib/retouch/m;)V

    .line 241
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->g(Lcom/roidapp/imagelib/retouch/m;)V

    .line 242
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->h(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->h(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 244
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->i(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/ac;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/retouch/ac;->b(I)V

    .line 245
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->j(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/v;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/retouch/v;->b(I)V

    .line 246
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 247
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->l(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 248
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/retouch/l;->a(Z)V

    goto :goto_0

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->h(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 251
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->i(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/ac;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/retouch/ac;->b(I)V

    .line 252
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->j(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/v;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/retouch/v;->b(I)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 254
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->m(Lcom/roidapp/imagelib/retouch/m;)V

    .line 255
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/l;->a(Z)V

    .line 256
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/o;->a:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->l(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method
