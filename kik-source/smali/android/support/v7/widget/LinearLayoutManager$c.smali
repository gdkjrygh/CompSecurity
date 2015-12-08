.class final Landroid/support/v7/widget/LinearLayoutManager$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


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


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1858
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1877
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->a:Z

    .line 1918
    iput v1, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 1925
    iput-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->i:Z

    .line 1936
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method final a(Landroid/support/v7/widget/RecyclerView$m;)Landroid/view/View;
    .locals 5

    .prologue
    .line 1952
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 1953
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_0

    iget v3, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 1957
    :goto_1
    return-object v0

    .line 1953
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 1955
    :cond_2
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$m;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1956
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    iget v2, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 8

    .prologue
    .line 1987
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v3, 0x0

    const v2, 0x7fffffff

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v5, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    if-eq v0, p1, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v1

    iget v6, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    sub-int/2addr v1, v6

    iget v6, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    mul-int/2addr v1, v6

    if-ltz v1, :cond_3

    if-ge v1, v2, :cond_3

    if-eqz v1, :cond_1

    move v7, v1

    move-object v1, v0

    move v0, v7

    :goto_1
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v3, v1

    move v2, v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    .line 1988
    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    :goto_2
    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 1990
    return-void

    .line 1988
    :cond_2
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    goto :goto_2

    :cond_3
    move v0, v2

    move-object v1, v3

    goto :goto_1
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$q;)Z
    .locals 2

    .prologue
    .line 1942
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
