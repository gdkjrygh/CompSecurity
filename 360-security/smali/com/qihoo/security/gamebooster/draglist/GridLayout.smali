.class public Lcom/qihoo/security/gamebooster/draglist/GridLayout;
.super Landroid/view/ViewGroup;
.source "360Security"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    .line 42
    return-void
.end method

.method private a(Landroid/view/View;IIII)V
    .locals 2

    .prologue
    .line 82
    add-int v0, p2, p4

    add-int v1, p3, p5

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 83
    return-void
.end method


# virtual methods
.method public getColums()I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    return v0
.end method

.method public getRows()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->b:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .prologue
    .line 65
    .line 69
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->d:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    div-int v4, v0, v1

    .line 70
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildCount()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 71
    invoke-virtual {p0, v6}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 72
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    div-int v0, v6, v0

    .line 73
    iget v2, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    rem-int v2, v6, v2

    .line 74
    iget v3, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->c:I

    mul-int/2addr v3, v0

    .line 75
    mul-int v0, v2, v4

    iget v2, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->d:I

    add-int/2addr v2, v0

    .line 76
    iget v5, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->c:I

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a(Landroid/view/View;IIII)V

    .line 70
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 79
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 46
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 48
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->c:I

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 49
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->d:I

    mul-int/lit8 v0, v0, 0x2

    sub-int v0, v3, v0

    iget v5, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    div-int/2addr v0, v5

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->e:I

    .line 50
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->e:I

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    move v0, v1

    .line 51
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildCount()I

    move-result v6

    if-ge v0, v6, :cond_0

    .line 52
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 53
    invoke-virtual {v6, v5, v4}, Landroid/view/View;->measure(II)V

    .line 51
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildCount()I

    move-result v0

    iget v4, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    rem-int/2addr v0, v4

    if-nez v0, :cond_1

    move v0, v2

    .line 56
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getChildCount()I

    move-result v4

    iget v5, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    div-int/2addr v4, v5

    if-eqz v0, :cond_2

    :goto_2
    add-int v0, v4, v1

    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 58
    iget v2, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->c:I

    mul-int/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 59
    invoke-virtual {p0, v3, v0}, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->setMeasuredDimension(II)V

    .line 61
    return-void

    :cond_1
    move v0, v1

    .line 55
    goto :goto_1

    :cond_2
    move v1, v2

    .line 56
    goto :goto_2
.end method

.method public setColums(I)V
    .locals 0

    .prologue
    .line 25
    iput p1, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->a:I

    .line 26
    return-void
.end method

.method public setRowHeight(I)V
    .locals 0

    .prologue
    .line 17
    iput p1, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->c:I

    .line 18
    return-void
.end method

.method public setRows(I)V
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/qihoo/security/gamebooster/draglist/GridLayout;->b:I

    .line 34
    return-void
.end method
