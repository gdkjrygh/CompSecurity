.class public final Landroid/support/v7/widget/be;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/view/animation/Interpolator;

.field private e:Z

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8705
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/be;-><init>(B)V

    .line 8706
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 8724
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8694
    iput-boolean v0, p0, Landroid/support/v7/widget/be;->e:Z

    .line 8698
    iput v0, p0, Landroid/support/v7/widget/be;->f:I

    .line 8725
    iput v0, p0, Landroid/support/v7/widget/be;->a:I

    .line 8726
    iput v0, p0, Landroid/support/v7/widget/be;->b:I

    .line 8727
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/be;->c:I

    .line 8728
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/be;->d:Landroid/view/animation/Interpolator;

    .line 8729
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/be;Landroid/support/v7/widget/RecyclerView;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 8682
    .line 9731
    iget-boolean v0, p0, Landroid/support/v7/widget/be;->e:Z

    if-eqz v0, :cond_5

    .line 9756
    iget-object v0, p0, Landroid/support/v7/widget/be;->d:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/be;->c:I

    if-gtz v0, :cond_0

    .line 9757
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9759
    :cond_0
    iget v0, p0, Landroid/support/v7/widget/be;->c:I

    if-gtz v0, :cond_1

    .line 9760
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Scroll duration must be a positive number"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9733
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/be;->d:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_4

    .line 9734
    iget v0, p0, Landroid/support/v7/widget/be;->c:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_3

    .line 9735
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->w(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bh;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/be;->a:I

    iget v2, p0, Landroid/support/v7/widget/be;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/bh;->b(II)V

    .line 9742
    :goto_0
    iget v0, p0, Landroid/support/v7/widget/be;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/be;->f:I

    .line 9743
    iget v0, p0, Landroid/support/v7/widget/be;->f:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_2

    .line 9746
    const-string v0, "RecyclerView"

    const-string v1, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 9749
    :cond_2
    iput-boolean v5, p0, Landroid/support/v7/widget/be;->e:Z

    :goto_1
    return-void

    .line 9737
    :cond_3
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->w(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bh;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/be;->a:I

    iget v2, p0, Landroid/support/v7/widget/be;->b:I

    iget v3, p0, Landroid/support/v7/widget/be;->c:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v7/widget/bh;->a(III)V

    goto :goto_0

    .line 9740
    :cond_4
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->w(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bh;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/be;->a:I

    iget v2, p0, Landroid/support/v7/widget/be;->b:I

    iget v3, p0, Landroid/support/v7/widget/be;->c:I

    iget-object v4, p0, Landroid/support/v7/widget/be;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v7/widget/bh;->a(IIILandroid/view/animation/Interpolator;)V

    goto :goto_0

    .line 9751
    :cond_5
    iput v5, p0, Landroid/support/v7/widget/be;->f:I

    goto :goto_1
.end method


# virtual methods
.method public final a(IIILandroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 8815
    iput p1, p0, Landroid/support/v7/widget/be;->a:I

    .line 8816
    iput p2, p0, Landroid/support/v7/widget/be;->b:I

    .line 8817
    iput p3, p0, Landroid/support/v7/widget/be;->c:I

    .line 8818
    iput-object p4, p0, Landroid/support/v7/widget/be;->d:Landroid/view/animation/Interpolator;

    .line 8819
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/be;->e:Z

    .line 8820
    return-void
.end method
