.class public Landroid/support/v7/widget/GridLayoutManager$LayoutParams;
.super Landroid/support/v7/widget/RecyclerView$LayoutParams;
.source "SourceFile"


# instance fields
.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 859
    invoke-direct {p0, v0, v0}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 850
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 852
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 860
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 855
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 850
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 852
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 856
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 867
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 850
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 852
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 868
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 863
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 850
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 852
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 864
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I
    .locals 1

    .prologue
    .line 843
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return v0
.end method

.method static synthetic a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I
    .locals 0

    .prologue
    .line 843
    iput p1, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return p1
.end method

.method static synthetic b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I
    .locals 1

    .prologue
    .line 843
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I
    .locals 0

    .prologue
    .line 843
    iput p1, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 888
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 898
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return v0
.end method
