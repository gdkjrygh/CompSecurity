.class final Landroid/support/v7/widget/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:Z

.field j:I

.field k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1850
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1869
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/y;->a:Z

    .line 1910
    iput v1, p0, Landroid/support/v7/widget/y;->h:I

    .line 1917
    iput-boolean v1, p0, Landroid/support/v7/widget/y;->i:Z

    .line 1928
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method final a(Landroid/support/v7/widget/az;)Landroid/view/View;
    .locals 5

    .prologue
    .line 1944
    iget-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 2960
    iget-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 2961
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 2962
    iget-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 2963
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2966
    iget v3, p0, Landroid/support/v7/widget/y;->d:I

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    if-ne v3, v4, :cond_0

    .line 2967
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/y;->a(Landroid/support/v7/widget/bi;)V

    .line 2968
    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    :goto_1
    return-object v0

    .line 2961
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2971
    :cond_1
    const/4 v0, 0x0

    .line 1945
    goto :goto_1

    .line 1947
    :cond_2
    iget v0, p0, Landroid/support/v7/widget/y;->d:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/az;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1948
    iget v1, p0, Landroid/support/v7/widget/y;->d:I

    iget v2, p0, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Landroid/support/v7/widget/y;->d:I

    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/bi;)V
    .locals 8

    .prologue
    .line 1979
    .line 2985
    iget-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 2986
    const/4 v3, 0x0

    .line 2987
    const v2, 0x7fffffff

    .line 2991
    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v5, :cond_0

    .line 2992
    iget-object v0, p0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 2993
    if-eq v0, p1, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    if-nez v1, :cond_3

    .line 2996
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v1

    iget v6, p0, Landroid/support/v7/widget/y;->d:I

    sub-int/2addr v1, v6

    iget v6, p0, Landroid/support/v7/widget/y;->e:I

    mul-int/2addr v1, v6

    .line 2998
    if-ltz v1, :cond_3

    .line 3001
    if-ge v1, v2, :cond_3

    .line 3004
    if-eqz v1, :cond_1

    move v7, v1

    move-object v1, v0

    move v0, v7

    .line 2991
    :goto_1
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v3, v1

    move v2, v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    .line 1980
    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    :goto_2
    iput v0, p0, Landroid/support/v7/widget/y;->d:I

    .line 1982
    return-void

    .line 1980
    :cond_2
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v0

    goto :goto_2

    :cond_3
    move v0, v2

    move-object v1, v3

    goto :goto_1
.end method

.method final a(Landroid/support/v7/widget/bf;)Z
    .locals 2

    .prologue
    .line 1934
    iget v0, p0, Landroid/support/v7/widget/y;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/y;->d:I

    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->e()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
