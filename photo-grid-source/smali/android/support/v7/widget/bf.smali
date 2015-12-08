.class public final Landroid/support/v7/widget/bf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/support/v4/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/ArrayMap",
            "<",
            "Landroid/support/v7/widget/bi;",
            "Landroid/support/v7/widget/at;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroid/support/v4/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/ArrayMap",
            "<",
            "Landroid/support/v7/widget/bi;",
            "Landroid/support/v7/widget/at;",
            ">;"
        }
    .end annotation
.end field

.field c:Landroid/support/v4/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/ArrayMap",
            "<",
            "Ljava/lang/Long;",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field e:I

.field private f:I

.field private g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private h:I

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 8928
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8930
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/bf;->f:I

    .line 8931
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    .line 8933
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    .line 8936
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    .line 8939
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    .line 8946
    iput v1, p0, Landroid/support/v7/widget/bf;->e:I

    .line 8951
    iput v1, p0, Landroid/support/v7/widget/bf;->h:I

    .line 8957
    iput v1, p0, Landroid/support/v7/widget/bf;->i:I

    .line 8959
    iput-boolean v1, p0, Landroid/support/v7/widget/bf;->j:Z

    .line 8961
    iput-boolean v1, p0, Landroid/support/v7/widget/bf;->k:Z

    .line 8963
    iput-boolean v1, p0, Landroid/support/v7/widget/bf;->l:Z

    .line 8965
    iput-boolean v1, p0, Landroid/support/v7/widget/bf;->m:Z

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/bf;I)I
    .locals 1

    .prologue
    .line 8928
    iget v0, p0, Landroid/support/v7/widget/bf;->i:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/bf;->i:I

    return v0
.end method

.method static synthetic a(Landroid/support/v7/widget/bf;)Z
    .locals 1

    .prologue
    .line 8928
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->m:Z

    return v0
.end method

.method static synthetic a(Landroid/support/v7/widget/bf;Z)Z
    .locals 0

    .prologue
    .line 8928
    iput-boolean p1, p0, Landroid/support/v7/widget/bf;->j:Z

    return p1
.end method

.method static synthetic b(Landroid/support/v7/widget/bf;I)I
    .locals 0

    .prologue
    .line 8928
    iput p1, p0, Landroid/support/v7/widget/bf;->h:I

    return p1
.end method

.method static synthetic b(Landroid/support/v7/widget/bf;)Z
    .locals 1

    .prologue
    .line 8928
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->l:Z

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/bf;Z)Z
    .locals 0

    .prologue
    .line 8928
    iput-boolean p1, p0, Landroid/support/v7/widget/bf;->k:Z

    return p1
.end method

.method static synthetic c(Landroid/support/v7/widget/bf;I)I
    .locals 0

    .prologue
    .line 8928
    iput p1, p0, Landroid/support/v7/widget/bf;->f:I

    return p1
.end method

.method static synthetic c(Landroid/support/v7/widget/bf;)Z
    .locals 1

    .prologue
    .line 8928
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->j:Z

    return v0
.end method

.method static synthetic c(Landroid/support/v7/widget/bf;Z)Z
    .locals 0

    .prologue
    .line 8928
    iput-boolean p1, p0, Landroid/support/v7/widget/bf;->l:Z

    return p1
.end method

.method static synthetic d(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 8928
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/bf;->i:I

    return v0
.end method

.method static synthetic d(Landroid/support/v7/widget/bf;Z)Z
    .locals 0

    .prologue
    .line 8928
    iput-boolean p1, p0, Landroid/support/v7/widget/bf;->m:Z

    return p1
.end method

.method static synthetic e(Landroid/support/v7/widget/bf;)Z
    .locals 1

    .prologue
    .line 8928
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->k:Z

    return v0
.end method


# virtual methods
.method final a(Landroid/support/v7/widget/bi;)V
    .locals 3

    .prologue
    .line 9104
    iget-object v0, p0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9105
    iget-object v0, p0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9106
    iget-object v0, p0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_0

    .line 9107
    iget-object v1, p0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    .line 10118
    invoke-virtual {v1}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 10119
    invoke-virtual {v1, v0}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_1

    .line 10120
    invoke-virtual {v1, v0}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;

    .line 9109
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    iget-object v1, p1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9111
    return-void

    .line 10118
    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 9127
    iget-object v0, p0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9128
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 8978
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->k:Z

    return v0
.end method

.method final b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 9131
    iget-object v0, p0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9132
    iget-object v0, p0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9134
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 8989
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->m:Z

    return v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 9053
    iget v0, p0, Landroid/support/v7/widget/bf;->f:I

    return v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 9062
    iget v0, p0, Landroid/support/v7/widget/bf;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()I
    .locals 2

    .prologue
    .line 9098
    iget-boolean v0, p0, Landroid/support/v7/widget/bf;->k:Z

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/bf;->h:I

    iget v1, p0, Landroid/support/v7/widget/bf;->i:I

    sub-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Landroid/support/v7/widget/bf;->e:I

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9138
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State{mTargetPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroid/support/v7/widget/bf;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPreLayoutHolderMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPostLayoutHolderMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/bf;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/bf;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mPreviousLayoutItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/bf;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDeletedInvisibleItemCountSincePreviousLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/bf;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStructureChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/widget/bf;->j:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mInPreLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/widget/bf;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mRunSimpleAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/widget/bf;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mRunPredictiveAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/widget/bf;->m:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
