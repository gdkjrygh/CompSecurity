.class public Lkik/android/widget/ResizeEventList;
.super Lkik/android/widget/TransparentListView;
.source "SourceFile"


# instance fields
.field a:[I

.field private b:Lkik/android/util/cu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Lkik/android/widget/TransparentListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ArrayAdapter;Z)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 85
    instance-of v0, p1, Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 86
    check-cast v0, Lcom/kik/view/adapters/au;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/au;->a(Z)V

    .line 89
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 90
    invoke-virtual {p0}, Lkik/android/widget/ResizeEventList;->getFirstVisiblePosition()I

    move-result v2

    move v0, v1

    .line 91
    :goto_0
    invoke-virtual {p0}, Lkik/android/widget/ResizeEventList;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 92
    invoke-virtual {p0, v0}, Lkik/android/widget/ResizeEventList;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 93
    add-int v3, v2, v0

    .line 94
    invoke-virtual {p1, v3}, Landroid/widget/ArrayAdapter;->getItemId(I)J

    move-result-wide v6

    .line 95
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v9

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-direct {v3, v4, v8, v9, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 102
    instance-of v0, p1, Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 103
    check-cast v0, Lcom/kik/view/adapters/au;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/au;->a(Z)V

    .line 107
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/ResizeEventList;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    .line 108
    new-instance v0, Lkik/android/widget/dh;

    move-object v1, p0

    move v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lkik/android/widget/dh;-><init>(Lkik/android/widget/ResizeEventList;Landroid/view/ViewTreeObserver;ZLandroid/widget/ArrayAdapter;Ljava/util/HashMap;)V

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 191
    return-void
.end method

.method public final a(Lkik/android/util/cu;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lkik/android/widget/ResizeEventList;->b:Lkik/android/util/cu;

    .line 48
    return-void
.end method

.method protected getBottomFadingEdgeStrength()F
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method protected getTopFadingEdgeStrength()F
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    return v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x1

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 53
    invoke-super {p0, p1}, Lkik/android/widget/TransparentListView;->onDraw(Landroid/graphics/Canvas;)V

    .line 54
    iget-object v0, p0, Lkik/android/widget/ResizeEventList;->a:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ResizeEventList;->b:Lkik/android/util/cu;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lkik/android/widget/ResizeEventList;->b:Lkik/android/util/cu;

    iget-object v1, p0, Lkik/android/widget/ResizeEventList;->a:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Lkik/android/widget/ResizeEventList;->a:[I

    const/4 v3, 0x3

    aget v2, v2, v3

    invoke-interface {v0, v1, v2}, Lkik/android/util/cu;->a(II)V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/ResizeEventList;->a:[I

    .line 58
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 38
    invoke-super {p0, p1, p2, p3, p4}, Lkik/android/widget/TransparentListView;->onSizeChanged(IIII)V

    .line 42
    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 v1, 0x1

    aput p2, v0, v1

    const/4 v1, 0x2

    aput p3, v0, v1

    const/4 v1, 0x3

    aput p4, v0, v1

    iput-object v0, p0, Lkik/android/widget/ResizeEventList;->a:[I

    .line 43
    return-void
.end method
