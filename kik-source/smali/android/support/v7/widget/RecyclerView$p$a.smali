.class public final Landroid/support/v7/widget/RecyclerView$p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView$p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/view/animation/Interpolator;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8786
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$p$a;-><init>(B)V

    .line 8787
    return-void
.end method

.method private constructor <init>(B)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 8805
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8771
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    .line 8775
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->f:Z

    .line 8779
    iput v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->g:I

    .line 8806
    iput v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->a:I

    .line 8807
    iput v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->b:I

    .line 8808
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    .line 8809
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->e:Landroid/view/animation/Interpolator;

    .line 8810
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView$p$a;Landroid/support/v7/widget/RecyclerView;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 8761
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    const/4 v1, -0x1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    invoke-static {p1, v0}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;I)V

    iput-boolean v5, p0, Landroid/support/v7/widget/RecyclerView$p$a;->f:Z

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->e:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Scroll duration must be a positive number"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->e:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_5

    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_4

    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->a:I

    iget v2, p0, Landroid/support/v7/widget/RecyclerView$p$a;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$s;->b(II)V

    :goto_1
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->g:I

    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->g:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_3

    const-string v0, "RecyclerView"

    const-string v1, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iput-boolean v5, p0, Landroid/support/v7/widget/RecyclerView$p$a;->f:Z

    goto :goto_0

    :cond_4
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->a:I

    iget v2, p0, Landroid/support/v7/widget/RecyclerView$p$a;->b:I

    iget v3, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v7/widget/RecyclerView$s;->a(III)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->a:I

    iget v2, p0, Landroid/support/v7/widget/RecyclerView$p$a;->b:I

    iget v3, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$p$a;->e:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v7/widget/RecyclerView$s;->a(IIILandroid/view/animation/Interpolator;)V

    goto :goto_1

    :cond_6
    iput v5, p0, Landroid/support/v7/widget/RecyclerView$p$a;->g:I

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 8828
    iput p1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    .line 8829
    return-void
.end method

.method public final a(IIILandroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 8927
    iput p1, p0, Landroid/support/v7/widget/RecyclerView$p$a;->a:I

    .line 8928
    iput p2, p0, Landroid/support/v7/widget/RecyclerView$p$a;->b:I

    .line 8929
    iput p3, p0, Landroid/support/v7/widget/RecyclerView$p$a;->c:I

    .line 8930
    iput-object p4, p0, Landroid/support/v7/widget/RecyclerView$p$a;->e:Landroid/view/animation/Interpolator;

    .line 8931
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->f:Z

    .line 8932
    return-void
.end method

.method final a()Z
    .locals 1

    .prologue
    .line 8832
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p$a;->d:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
