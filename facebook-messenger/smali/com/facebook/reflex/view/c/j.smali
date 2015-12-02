.class public Lcom/facebook/reflex/view/c/j;
.super Ljava/lang/Object;
.source "ListAdapterWrapper.java"

# interfaces
.implements Lcom/facebook/reflex/view/c/s;


# instance fields
.field private final a:Lcom/facebook/reflex/view/c/i;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/view/c/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/view/c/i;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    .line 27
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    .line 28
    return-void
.end method

.method private a(Landroid/view/View;)Lcom/facebook/reflex/view/c/k;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/k;

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/view/c/k;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 53
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/k;

    .line 56
    :goto_1
    return-object v0

    .line 51
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/k;

    goto :goto_1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/i;->a()I

    move-result v0

    return v0
.end method

.method public a(I)Lcom/facebook/reflex/view/b/r;
    .locals 3

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/i;->a(I)Landroid/view/View;

    move-result-object v0

    .line 38
    instance-of v1, v0, Lcom/facebook/reflex/view/b/r;

    if-eqz v1, :cond_0

    .line 39
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 46
    :goto_0
    return-object v0

    .line 41
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/j;->a(Landroid/view/View;)Lcom/facebook/reflex/view/c/k;

    move-result-object v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    new-instance v1, Lcom/facebook/reflex/view/c/k;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/facebook/reflex/view/c/k;-><init>(Lcom/facebook/reflex/view/c/j;Landroid/content/Context;)V

    .line 45
    :cond_1
    invoke-virtual {v1, v0}, Lcom/facebook/reflex/view/c/k;->a(Landroid/view/View;)V

    move-object v0, v1

    .line 46
    goto :goto_0
.end method

.method public a(Landroid/database/DataSetObserver;)V
    .locals 1
    .param p1    # Landroid/database/DataSetObserver;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/i;->a(Landroid/database/DataSetObserver;)V

    .line 87
    return-void
.end method

.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 3

    .prologue
    .line 61
    instance-of v0, p1, Lcom/facebook/reflex/view/c/k;

    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    move-object v0, p1

    check-cast v0, Lcom/facebook/reflex/view/c/k;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/view/c/k;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/reflex/view/c/i;->a(Landroid/view/View;)V

    .line 63
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    check-cast p1, Lcom/facebook/reflex/view/c/k;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    :goto_0
    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    check-cast p1, Landroid/view/View;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/i;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/i;->b()V

    .line 73
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->a:Lcom/facebook/reflex/view/c/i;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/i;->c()V

    .line 78
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/k;

    .line 79
    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/k;->removeAllViewsInLayout()V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 82
    return-void
.end method
