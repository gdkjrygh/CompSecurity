.class final Lcom/roidapp/photogrid/release/eb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 462
    iput-object p1, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 466
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 467
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->A:Z

    if-eqz v0, :cond_1

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->A:Z

    .line 474
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v2

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v0

    if-nez v0, :cond_2

    .line 486
    :cond_1
    :goto_0
    return-void

    .line 480
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v0, v2

    .line 482
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    neg-float v2, v2

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 483
    const-wide/16 v2, 0x320

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 485
    iget-object v1, p0, Lcom/roidapp/photogrid/release/eb;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method
