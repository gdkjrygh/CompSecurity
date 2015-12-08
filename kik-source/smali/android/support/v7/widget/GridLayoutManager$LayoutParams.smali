.class public Landroid/support/v7/widget/GridLayoutManager$LayoutParams;
.super Landroid/support/v7/widget/RecyclerView$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/GridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 862
    invoke-direct {p0, v0, v0}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 863
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 858
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 859
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 870
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 871
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .prologue
    .line 866
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 853
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    .line 855
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    .line 867
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I
    .locals 1

    .prologue
    .line 846
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return v0
.end method

.method static synthetic a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I
    .locals 0

    .prologue
    .line 846
    iput p1, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return p1
.end method

.method static synthetic b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I
    .locals 1

    .prologue
    .line 846
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I
    .locals 0

    .prologue
    .line 846
    iput p1, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 891
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->e:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 901
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->f:I

    return v0
.end method
