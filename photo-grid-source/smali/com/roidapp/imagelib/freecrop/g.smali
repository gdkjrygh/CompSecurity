.class final Lcom/roidapp/imagelib/freecrop/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/freecrop/e;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/freecrop/e;)V
    .locals 0

    .prologue
    .line 371
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .prologue
    .line 374
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "FreeCropFrag/onGlobalLayout"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 376
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->getWidth()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;I)I

    .line 377
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/freecrop/e;->b(Lcom/roidapp/imagelib/freecrop/e;I)I

    .line 379
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->f(Lcom/roidapp/imagelib/freecrop/e;)I

    move-result v0

    .line 380
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->g(Lcom/roidapp/imagelib/freecrop/e;)I

    move-result v1

    .line 382
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    new-instance v3, Lcom/roidapp/imagelib/freecrop/d;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v5}, Lcom/roidapp/imagelib/freecrop/e;->h(Lcom/roidapp/imagelib/freecrop/e;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-direct {v3, v4, v5, v0, v1}, Lcom/roidapp/imagelib/freecrop/d;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V

    invoke-static {v2, v3}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Lcom/roidapp/imagelib/freecrop/d;)Lcom/roidapp/imagelib/freecrop/d;

    .line 383
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->i(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/d;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/d;->a(Lcom/roidapp/imagelib/freecrop/FreeCropView;)V

    .line 384
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->i(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Lcom/roidapp/imagelib/freecrop/l;)V

    .line 385
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->j(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/Magnifier;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v1}, Lcom/roidapp/imagelib/freecrop/e;->i(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Lcom/roidapp/imagelib/freecrop/l;)V

    .line 386
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/g;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->e(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/freecrop/FreeCropView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    .line 387
    return-void
.end method
