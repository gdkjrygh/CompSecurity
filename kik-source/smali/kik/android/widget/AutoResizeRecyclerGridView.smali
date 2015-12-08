.class public Lkik/android/widget/AutoResizeRecyclerGridView;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"


# instance fields
.field h:Landroid/support/v7/widget/GridLayoutManager$b;

.field private i:I

.field private j:I

.field private k:Landroid/support/v7/widget/GridLayoutManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    new-instance v0, Lkik/android/widget/b;

    invoke-direct {v0, p0}, Lkik/android/widget/b;-><init>(Lkik/android/widget/AutoResizeRecyclerGridView;)V

    iput-object v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    .line 22
    if-eqz p2, :cond_0

    .line 23
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 28
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 29
    const/4 v1, -0x1

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->i:I

    .line 30
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->j:I

    .line 31
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    :cond_0
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-direct {v0}, Landroid/support/v7/widget/GridLayoutManager;-><init>()V

    iput-object v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->k:Landroid/support/v7/widget/GridLayoutManager;

    .line 35
    iget-object v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->k:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0, v0}, Lkik/android/widget/AutoResizeRecyclerGridView;->a(Landroid/support/v7/widget/RecyclerView$i;)V

    .line 36
    return-void

    .line 23
    nop

    :array_0
    .array-data 4
        0x1010117
        0x7f010001
    .end array-data
.end method

.method static synthetic a(Lkik/android/widget/AutoResizeRecyclerGridView;)I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->j:I

    return v0
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 40
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->onMeasure(II)V

    .line 41
    iget v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->i:I

    if-lez v0, :cond_0

    .line 42
    const/4 v0, 0x1

    invoke-virtual {p0}, Lkik/android/widget/AutoResizeRecyclerGridView;->getMeasuredWidth()I

    move-result v1

    iget v2, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->i:I

    div-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 43
    iget-object v1, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->k:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(I)V

    .line 44
    iget-object v0, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->k:Landroid/support/v7/widget/GridLayoutManager;

    iget-object v1, p0, Lkik/android/widget/AutoResizeRecyclerGridView;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/GridLayoutManager$b;)V

    .line 46
    :cond_0
    return-void
.end method
