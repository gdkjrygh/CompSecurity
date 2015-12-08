.class public final Landroid/support/v7/widget/RecyclerView$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field private a:Landroid/util/SparseArray;

.field private b:Landroid/util/SparseIntArray;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 4035
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4036
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$l;->a:Landroid/util/SparseArray;

    .line 4038
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$l;->b:Landroid/util/SparseIntArray;

    .line 4039
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 3

    .prologue
    .line 4058
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$l;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 4059
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4060
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    .line 4061
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$t;

    .line 4062
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4065
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$a;Landroid/support/v7/widget/RecyclerView$a;)V
    .locals 1

    .prologue
    .line 4114
    if-eqz p1, :cond_0

    .line 4115
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    .line 4117
    :cond_0
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    if-nez v0, :cond_1

    .line 4118
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$l;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 4120
    :cond_1
    if-eqz p2, :cond_2

    .line 4121
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$l;->c:I

    .line 4123
    :cond_2
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 4

    .prologue
    .line 4080
    iget v1, p1, Landroid/support/v7/widget/RecyclerView$t;->e:I

    .line 4081
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$l;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$l;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$l;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v2

    if-gez v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$l;->b:Landroid/util/SparseIntArray;

    const/4 v3, 0x5

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 4082
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$l;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v1, v2, :cond_1

    .line 4090
    :goto_0
    return-void

    .line 4088
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->o()V

    .line 4089
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
