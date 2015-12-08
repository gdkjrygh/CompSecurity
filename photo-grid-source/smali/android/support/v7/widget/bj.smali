.class public final Landroid/support/v7/widget/bj;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "SourceFile"


# instance fields
.field final a:Landroid/support/v7/widget/RecyclerView;

.field final b:Landroid/support/v4/view/AccessibilityDelegateCompat;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    .line 79
    new-instance v0, Landroid/support/v7/widget/bk;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/bk;-><init>(Landroid/support/v7/widget/bj;)V

    iput-object v0, p0, Landroid/support/v7/widget/bj;->b:Landroid/support/v4/view/AccessibilityDelegateCompat;

    .line 35
    iput-object p1, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    .line 36
    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 66
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 67
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 10039
    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    .line 67
    if-nez v0, :cond_0

    .line 68
    check-cast p1, Landroid/support/v7/widget/RecyclerView;

    .line 69
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/au;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 73
    :cond_0
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, -0x1

    const/4 v4, 0x1

    .line 56
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 57
    const-class v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 9039
    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    .line 58
    if-nez v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 59
    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    .line 9304
    iget-object v1, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v2, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    .line 9334
    iget-object v3, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9336
    :cond_0
    const/16 v3, 0x2000

    invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 9337
    invoke-virtual {p2, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V

    .line 9339
    :cond_1
    iget-object v3, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v4}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v4}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 9341
    :cond_2
    const/16 v3, 0x1000

    invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 9342
    invoke-virtual {p2, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V

    .line 9344
    :cond_3
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    invoke-static {v3, v0, v6, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;->obtain(IIZI)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;

    move-result-object v0

    .line 9350
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionInfo(Ljava/lang/Object;)V

    .line 61
    :cond_4
    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .prologue
    const/4 v5, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 44
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v2

    .line 8546
    :cond_0
    :goto_0
    return v1

    .line 8039
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    .line 47
    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Landroid/support/v7/widget/bj;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v4

    .line 8507
    iget-object v0, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v0, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    .line 8523
    iget-object v0, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 8527
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    move v3, v1

    .line 8545
    :goto_1
    if-nez v3, :cond_2

    if-eqz v0, :cond_0

    .line 8548
    :cond_2
    iget-object v1, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0, v3}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    move v1, v2

    .line 48
    goto :goto_0

    .line 8529
    :sswitch_0
    iget-object v0, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v5}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 8530
    invoke-virtual {v4}, Landroid/support/v7/widget/au;->t()I

    move-result v0

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->v()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->x()I

    move-result v3

    sub-int/2addr v0, v3

    neg-int v0, v0

    .line 8532
    :goto_2
    iget-object v3, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v5}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 8533
    invoke-virtual {v4}, Landroid/support/v7/widget/au;->s()I

    move-result v3

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->u()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->w()I

    move-result v5

    sub-int/2addr v3, v5

    neg-int v3, v3

    move v6, v3

    move v3, v0

    move v0, v6

    goto :goto_1

    .line 8537
    :sswitch_1
    iget-object v0, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v2}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 8538
    invoke-virtual {v4}, Landroid/support/v7/widget/au;->t()I

    move-result v0

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->v()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->x()I

    move-result v3

    sub-int/2addr v0, v3

    .line 8540
    :goto_3
    iget-object v3, v4, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3, v2}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 8541
    invoke-virtual {v4}, Landroid/support/v7/widget/au;->s()I

    move-result v3

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->u()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->w()I

    move-result v5

    sub-int/2addr v3, v5

    move v6, v3

    move v3, v0

    move v0, v6

    goto :goto_1

    :cond_3
    move v3, v0

    move v0, v1

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_2

    .line 8527
    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_1
        0x2000 -> :sswitch_0
    .end sparse-switch
.end method
