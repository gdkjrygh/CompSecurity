.class final Landroid/support/v7/widget/am;
.super Landroid/database/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/database/Observable",
        "<",
        "Landroid/support/v7/widget/an;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 8824
    invoke-direct {p0}, Landroid/database/Observable;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 8834
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8835
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/an;

    invoke-virtual {v0}, Landroid/support/v7/widget/an;->a()V

    .line 8834
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8837
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 8844
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8845
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/an;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/an;->a(II)V

    .line 8844
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8847
    :cond_0
    return-void
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 8864
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 8865
    iget-object v0, p0, Landroid/support/v7/widget/am;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/an;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/an;->b(II)V

    .line 8864
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 8867
    :cond_0
    return-void
.end method
