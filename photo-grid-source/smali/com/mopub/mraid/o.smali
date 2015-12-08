.class final Lcom/mopub/mraid/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Lcom/mopub/mraid/MraidController;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidController;Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 522
    iput-object p1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    iput-object p2, p0, Lcom/mopub/mraid/o;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/mopub/mraid/o;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 525
    iget-object v0, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->d(Lcom/mopub/mraid/MraidController;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 526
    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v1

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v1, v2, v0}, Lcom/mopub/mraid/ah;->a(II)V

    .line 529
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 530
    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->i(Lcom/mopub/mraid/MraidController;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 531
    if-nez v1, :cond_1

    .line 558
    :cond_0
    :goto_0
    return-void

    .line 534
    :cond_1
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 535
    iget-object v2, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v2}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v2

    aget v3, v0, v6

    aget v4, v0, v7

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/mopub/mraid/ah;->a(IIII)V

    .line 539
    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->j(Lcom/mopub/mraid/MraidController;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->getLocationOnScreen([I)V

    .line 540
    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v1

    aget v2, v0, v6

    aget v3, v0, v7

    iget-object v4, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v4}, Lcom/mopub/mraid/MraidController;->j(Lcom/mopub/mraid/MraidController;)Landroid/widget/FrameLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v5}, Lcom/mopub/mraid/MraidController;->j(Lcom/mopub/mraid/MraidController;)Landroid/widget/FrameLayout;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/mopub/mraid/ah;->c(IIII)V

    .line 544
    iget-object v1, p0, Lcom/mopub/mraid/o;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 545
    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v1

    aget v2, v0, v6

    aget v0, v0, v7

    iget-object v3, p0, Lcom/mopub/mraid/o;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/mopub/mraid/o;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/mopub/mraid/ah;->b(IIII)V

    .line 550
    iget-object v0, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->c(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge;->notifyScreenMetrics(Lcom/mopub/mraid/ah;)V

    .line 551
    iget-object v0, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->b(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 552
    iget-object v0, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->b(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/MraidBridge;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mraid/o;->c:Lcom/mopub/mraid/MraidController;

    invoke-static {v1}, Lcom/mopub/mraid/MraidController;->h(Lcom/mopub/mraid/MraidController;)Lcom/mopub/mraid/ah;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge;->notifyScreenMetrics(Lcom/mopub/mraid/ah;)V

    .line 555
    :cond_2
    iget-object v0, p0, Lcom/mopub/mraid/o;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 556
    iget-object v0, p0, Lcom/mopub/mraid/o;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto/16 :goto_0
.end method
