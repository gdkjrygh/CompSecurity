.class public Lcom/facebook/auth/viewercontext/f;
.super Ljava/lang/Object;
.source "ViewerContextManagerImpl.java"

# interfaces
.implements Lcom/facebook/auth/viewercontext/e;


# instance fields
.field private final a:Lcom/facebook/auth/b/a;

.field private final b:Landroid/content/Context;

.field private c:Lcom/facebook/auth/viewercontext/ViewerContext;

.field private d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/auth/viewercontext/ViewerContext;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/a;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lcom/facebook/auth/viewercontext/g;

    invoke-direct {v0, p0}, Lcom/facebook/auth/viewercontext/g;-><init>(Lcom/facebook/auth/viewercontext/f;)V

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/f;->d:Ljava/lang/ThreadLocal;

    .line 40
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/f;->a:Lcom/facebook/auth/b/a;

    .line 41
    iput-object p2, p0, Lcom/facebook/auth/viewercontext/f;->b:Landroid/content/Context;

    .line 42
    return-void
.end method

.method private e()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 79
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 80
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 85
    :goto_0
    return-object v0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->e:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->e:Lcom/facebook/auth/viewercontext/ViewerContext;

    goto :goto_0

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->a:Lcom/facebook/auth/b/a;

    invoke-interface {v0}, Lcom/facebook/auth/b/a;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->e:Lcom/facebook/auth/viewercontext/ViewerContext;

    return-object v0
.end method

.method public a(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Application;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot override viewer context on the application context"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 65
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/f;->e:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 66
    return-void

    .line 61
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    return-object v0
.end method

.method public b(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    return-void
.end method

.method public c()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0}, Lcom/facebook/auth/viewercontext/f;->e()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/facebook/auth/viewercontext/f;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-nez v1, :cond_0

    .line 72
    iput-object v0, p0, Lcom/facebook/auth/viewercontext/f;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 74
    :cond_0
    return-object v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/f;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 96
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 97
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 99
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 100
    return-void
.end method
