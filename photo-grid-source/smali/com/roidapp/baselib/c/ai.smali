.class public final Lcom/roidapp/baselib/c/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/Stack",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .prologue
    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 18
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 19
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 21
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public final a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 26
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 27
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Ljava/util/Stack;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 29
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 54
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 56
    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    .line 54
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 61
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 65
    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0, p2}, Ljava/util/Stack;->remove(I)Ljava/lang/Object;

    .line 68
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v4/app/Fragment;)[I
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 71
    const/4 v0, 0x2

    new-array v3, v0, [I

    fill-array-data v3, :array_0

    move v1, v2

    .line 72
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 74
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/Stack;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 75
    aput v1, v3, v2

    .line 76
    const/4 v1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/Stack;->indexOf(Ljava/lang/Object;)I

    move-result v0

    aput v0, v3, v1

    .line 80
    :cond_0
    return-object v3

    .line 72
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 71
    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method

.method public final b(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 42
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 43
    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 50
    :goto_0
    return-object v0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 50
    goto :goto_0
.end method

.method public final b(ILandroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 34
    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 36
    iget-object v1, p0, Lcom/roidapp/baselib/c/ai;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    return-void
.end method
