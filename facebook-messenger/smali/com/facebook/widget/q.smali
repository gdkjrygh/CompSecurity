.class public Lcom/facebook/widget/q;
.super Ljava/lang/Object;
.source "RecyclableViewHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/widget/g;Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 20
    instance-of v0, p1, Lcom/facebook/widget/j;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    move-object v0, p1

    .line 21
    check-cast v0, Lcom/facebook/widget/j;

    invoke-interface {v0}, Lcom/facebook/widget/j;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 23
    const/4 v0, 0x1

    .line 25
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
