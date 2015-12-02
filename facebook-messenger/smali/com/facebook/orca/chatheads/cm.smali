.class public Lcom/facebook/orca/chatheads/cm;
.super Lcom/facebook/orca/chatheads/dv;
.source "ChatHeadsMiniWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Lcom/facebook/orca/chatheads/cl;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Landroid/view/WindowManager;Landroid/content/res/Resources;)V
    .locals 1

    .prologue
    .line 25
    invoke-static {p2}, Lcom/facebook/orca/chatheads/cm;->a(Landroid/content/res/Resources;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 26
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cm;->c(Z)V

    .line 27
    sget v0, Lcom/facebook/g;->chat_head_width:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/cm;->b:I

    .line 28
    sget v0, Lcom/facebook/g;->chat_head_dock_overshoot_x:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/cm;->c:I

    .line 29
    return-void
.end method

.method private static a(Landroid/content/res/Resources;)Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    const/4 v1, -0x2

    .line 79
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v3, Lcom/facebook/orca/chatheads/cm;->a:I

    const/16 v4, 0x300

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 88
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 90
    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .prologue
    .line 60
    if-eqz p1, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    iget v1, p0, Lcom/facebook/orca/chatheads/cm;->c:I

    neg-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->setChatHeadsOffsetX(I)V

    .line 62
    const/4 v0, -0x2

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cm;->c(I)V

    .line 67
    :goto_0
    return-void

    .line 64
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->setChatHeadsOffsetX(I)V

    .line 65
    iget v0, p0, Lcom/facebook/orca/chatheads/cm;->b:I

    iget v1, p0, Lcom/facebook/orca/chatheads/cm;->c:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cm;->c(I)V

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 70
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->a(I)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    const v1, 0x3f19999a    # 0.6f

    const/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/cl;->a(FI)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public setX(I)V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-super {p0, v0}, Lcom/facebook/orca/chatheads/dv;->setX(I)V

    .line 45
    return-void
.end method
