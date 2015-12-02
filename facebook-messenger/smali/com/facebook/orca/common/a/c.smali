.class public Lcom/facebook/orca/common/a/c;
.super Ljava/lang/Object;
.source "RectUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 3

    .prologue
    .line 15
    invoke-virtual {p0, p2}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 17
    :goto_0
    if-eq v0, p1, :cond_0

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 18
    check-cast v0, Landroid/view/View;

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method
