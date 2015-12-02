.class public Lcom/facebook/orca/chatheads/ck;
.super Lcom/facebook/orca/chatheads/dv;
.source "ChatHeadsMiniTouchProxyWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/WindowManager;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ck;->a(Landroid/content/res/Resources;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 22
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ck;->c(Z)V

    .line 23
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ck;->b(Z)V

    .line 24
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ck;->a(Landroid/view/View;)V

    .line 25
    return-void
.end method

.method private static a(Landroid/content/res/Resources;)Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    .line 46
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v1, Lcom/facebook/g;->chat_head_width:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lcom/facebook/g;->chat_head_dock_overshoot_x:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sub-int/2addr v1, v2

    sget v2, Lcom/facebook/g;->chat_head_height:I

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    sget v3, Lcom/facebook/orca/chatheads/ck;->a:I

    const/16 v4, 0x300

    const/4 v5, -0x2

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 56
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 58
    return-object v0
.end method


# virtual methods
.method public setX(I)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-super {p0, v0}, Lcom/facebook/orca/chatheads/dv;->setX(I)V

    .line 42
    return-void
.end method
