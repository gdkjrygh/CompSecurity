.class public Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# instance fields
.field public a:I

.field b:F

.field c:Z

.field d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1665
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 1651
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1666
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1657
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1651
    iput v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1659
    invoke-static {}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->c()[I

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 1660
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1661
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1662
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 1679
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1651
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1680
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 1683
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1651
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1684
    return-void
.end method

.method public constructor <init>(Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;)V
    .locals 1

    .prologue
    .line 1674
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1651
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1675
    iget v0, p1, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->a:I

    .line 1676
    return-void
.end method
