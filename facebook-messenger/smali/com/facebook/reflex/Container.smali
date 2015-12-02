.class public Lcom/facebook/reflex/Container;
.super Lcom/facebook/reflex/Widget;
.source "Container.java"


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/Widget;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    .line 14
    invoke-direct {p0}, Lcom/facebook/reflex/Container;->initialize()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/Container;->a(I)V

    .line 15
    return-void
.end method

.method private native addChild(Lcom/facebook/reflex/Widget;)V
.end method

.method private native initialize()I
.end method

.method private native nativeSetChildren([Ljava/lang/Object;)V
.end method

.method private native nativeSetMaskToBounds(Z)V
.end method

.method private native removeChild(Lcom/facebook/reflex/Widget;)V
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 18
    invoke-super {p0}, Lcom/facebook/reflex/Widget;->a()V

    .line 19
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/Widget;

    .line 20
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->a()V

    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/reflex/Widget;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 32
    if-eqz p1, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 33
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 34
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    invoke-virtual {p0}, Lcom/facebook/reflex/Container;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p1}, Lcom/facebook/reflex/Widget;->a()V

    .line 38
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/reflex/Container;->addChild(Lcom/facebook/reflex/Widget;)V

    .line 39
    return-void

    :cond_1
    move v0, v2

    .line 32
    goto :goto_0

    :cond_2
    move v1, v2

    .line 33
    goto :goto_1
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/Widget;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    :goto_0
    return-void

    .line 69
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/Container;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/Widget;

    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 73
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->b()V

    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/Widget;

    .line 78
    iget-object v2, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 80
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->a()V

    goto :goto_2

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 86
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 88
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/reflex/Container;->nativeSetChildren([Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0, p1}, Lcom/facebook/reflex/Container;->nativeSetMaskToBounds(Z)V

    .line 104
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 25
    invoke-super {p0}, Lcom/facebook/reflex/Widget;->b()V

    .line 26
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/Widget;

    .line 27
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->b()V

    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/reflex/Widget;)Z
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/facebook/reflex/Widget;)V
    .locals 1

    .prologue
    .line 92
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 93
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 94
    iget-object v0, p0, Lcom/facebook/reflex/Container;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {p0}, Lcom/facebook/reflex/Container;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {p1}, Lcom/facebook/reflex/Widget;->b()V

    .line 98
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/reflex/Container;->removeChild(Lcom/facebook/reflex/Widget;)V

    .line 99
    return-void

    .line 92
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
