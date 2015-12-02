.class Lcom/facebook/orca/compose/o;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/emoji/ai;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 360
    iput-object p1, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 363
    iget-object v0, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Z)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Lcom/facebook/orca/compose/ComposeFragment;Z)V

    .line 365
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/stickers/StickerPopup;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->c(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/ah;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 374
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 375
    iget-object v2, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v2}, Lcom/facebook/orca/compose/ComposeFragment;->d(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 376
    new-instance v2, Landroid/graphics/Rect;

    aget v3, v1, v0

    aget v4, v1, v6

    aget v0, v1, v0

    iget-object v5, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v5}, Lcom/facebook/orca/compose/ComposeFragment;->d(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v0, v5

    aget v1, v1, v6

    iget-object v5, p0, Lcom/facebook/orca/compose/o;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v5}, Lcom/facebook/orca/compose/ComposeFragment;->d(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v1, v5

    invoke-direct {v2, v3, v4, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 381
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    .line 383
    :cond_1
    return v0
.end method
