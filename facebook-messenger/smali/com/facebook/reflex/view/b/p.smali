.class public Lcom/facebook/reflex/view/b/p;
.super Ljava/lang/Object;
.source "ViewUpdater.java"


# instance fields
.field private a:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet",
            "<",
            "Lcom/facebook/reflex/view/b/s;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet",
            "<",
            "Lcom/facebook/reflex/view/b/r;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet",
            "<",
            "Lcom/facebook/reflex/view/b/s;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet",
            "<",
            "Lcom/facebook/reflex/view/b/r;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/j;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 28
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->a:Ljava/util/LinkedHashSet;

    .line 29
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->b:Ljava/util/LinkedHashSet;

    .line 30
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->c:Ljava/util/LinkedHashSet;

    .line 31
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->d:Ljava/util/LinkedHashSet;

    .line 33
    new-instance v0, Lcom/facebook/reflex/view/b/q;

    invoke-direct {v0, p0, p1}, Lcom/facebook/reflex/view/b/q;-><init>(Lcom/facebook/reflex/view/b/p;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->e:Landroid/view/ViewGroup;

    .line 43
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->e:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 44
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->e:Landroid/view/ViewGroup;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v2}, Lcom/facebook/reflex/j;->a(Landroid/view/ViewGroup;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    return-void

    :cond_0
    move v0, v1

    .line 27
    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 65
    iget-object v1, p0, Lcom/facebook/reflex/view/b/p;->a:Ljava/util/LinkedHashSet;

    .line 66
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->c:Ljava/util/LinkedHashSet;

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->a:Ljava/util/LinkedHashSet;

    .line 67
    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/s;

    .line 68
    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/s;->a()V

    .line 71
    iget-object v3, p0, Lcom/facebook/reflex/view/b/p;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v0}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->clear()V

    .line 74
    iput-object v1, p0, Lcom/facebook/reflex/view/b/p;->c:Ljava/util/LinkedHashSet;

    .line 75
    return-void
.end method

.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 54
    return-void
.end method

.method public a(Lcom/facebook/reflex/view/b/s;)V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 49
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->a:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 50
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 78
    iget-object v1, p0, Lcom/facebook/reflex/view/b/p;->b:Ljava/util/LinkedHashSet;

    .line 79
    iget-object v0, p0, Lcom/facebook/reflex/view/b/p;->d:Ljava/util/LinkedHashSet;

    iput-object v0, p0, Lcom/facebook/reflex/view/b/p;->b:Ljava/util/LinkedHashSet;

    .line 80
    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 81
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->e()V

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->clear()V

    .line 84
    iput-object v1, p0, Lcom/facebook/reflex/view/b/p;->d:Ljava/util/LinkedHashSet;

    .line 85
    return-void
.end method
