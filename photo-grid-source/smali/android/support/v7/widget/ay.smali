.class public final Landroid/support/v7/widget/ay;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;>;"
        }
    .end annotation
.end field

.field private b:Landroid/util/SparseIntArray;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3990
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3991
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/ay;->a:Landroid/util/SparseArray;

    .line 3993
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/ay;->b:Landroid/util/SparseIntArray;

    .line 3994
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/ay;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/support/v7/widget/bi;
    .locals 3

    .prologue
    .line 4013
    iget-object v0, p0, Landroid/support/v7/widget/ay;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 4014
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4015
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    .line 4016
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/bi;

    .line 4017
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4020
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method final a(Landroid/support/v7/widget/al;Landroid/support/v7/widget/al;)V
    .locals 1

    .prologue
    .line 4066
    if-eqz p1, :cond_0

    .line 11049
    iget v0, p0, Landroid/support/v7/widget/ay;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/ay;->c:I

    .line 4069
    :cond_0
    iget v0, p0, Landroid/support/v7/widget/ay;->c:I

    if-nez v0, :cond_1

    .line 11999
    iget-object v0, p0, Landroid/support/v7/widget/ay;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 4072
    :cond_1
    if-eqz p2, :cond_2

    .line 12045
    iget v0, p0, Landroid/support/v7/widget/ay;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/ay;->c:I

    .line 4075
    :cond_2
    return-void
.end method

.method public final a(Landroid/support/v7/widget/bi;)V
    .locals 4

    .prologue
    .line 4035
    .line 9106
    iget v1, p1, Landroid/support/v7/widget/bi;->e:I

    .line 10078
    iget-object v0, p0, Landroid/support/v7/widget/ay;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 10079
    if-nez v0, :cond_0

    .line 10080
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10081
    iget-object v2, p0, Landroid/support/v7/widget/ay;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 10082
    iget-object v2, p0, Landroid/support/v7/widget/ay;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v2

    if-gez v2, :cond_0

    .line 10083
    iget-object v2, p0, Landroid/support/v7/widget/ay;->b:Landroid/util/SparseIntArray;

    const/4 v3, 0x5

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 4037
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/ay;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v1, v2, :cond_1

    .line 4042
    :goto_0
    return-void

    .line 4040
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->q()V

    .line 4041
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
