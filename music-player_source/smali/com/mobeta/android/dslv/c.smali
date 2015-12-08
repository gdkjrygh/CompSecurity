.class public Lcom/mobeta/android/dslv/c;
.super Landroid/view/ViewGroup;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x30

    iput v0, p0, Lcom/mobeta/android/dslv/c;->a:I

    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/mobeta/android/dslv/c;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/mobeta/android/dslv/c;->a:I

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Lcom/mobeta/android/dslv/c;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget v1, p0, Lcom/mobeta/android/dslv/c;->a:I

    const/16 v2, 0x30

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lcom/mobeta/android/dslv/c;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/mobeta/android/dslv/c;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/mobeta/android/dslv/c;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/mobeta/android/dslv/c;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 6

    const/4 v5, 0x0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-virtual {p0, v5}, Lcom/mobeta/android/dslv/c;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {p0, v5, v1}, Lcom/mobeta/android/dslv/c;->setMeasuredDimension(II)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {p0, v3, p1, v4}, Lcom/mobeta/android/dslv/c;->measureChild(Landroid/view/View;II)V

    :cond_1
    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/mobeta/android/dslv/c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v2, :cond_3

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/mobeta/android/dslv/c;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    goto :goto_1
.end method
