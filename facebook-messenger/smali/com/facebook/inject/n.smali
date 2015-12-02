.class public Lcom/facebook/inject/n;
.super Ljava/lang/Object;
.source "ContextScope.java"

# interfaces
.implements Lcom/facebook/inject/au;


# instance fields
.field private final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/List",
            "<",
            "Landroid/content/Context;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lcom/facebook/inject/o;

    invoke-direct {v0, p0}, Lcom/facebook/inject/o;-><init>(Lcom/facebook/inject/n;)V

    iput-object v0, p0, Lcom/facebook/inject/n;->a:Ljava/lang/ThreadLocal;

    .line 31
    iput-object p1, p0, Lcom/facebook/inject/n;->b:Landroid/content/Context;

    .line 32
    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;Ljavax/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 57
    new-instance v0, Lcom/facebook/inject/p;

    invoke-direct {v0, p0, p2}, Lcom/facebook/inject/p;-><init>(Lcom/facebook/inject/n;Ljavax/inject/a;)V

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/inject/n;->b:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/n;->a(Landroid/content/Context;)V

    .line 40
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/inject/n;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    return-void
.end method

.method public annotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    const-class v0, Lcom/facebook/inject/ContextScoped;

    return-object v0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/inject/n;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 44
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 45
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 47
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 48
    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/inject/n;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 52
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/facebook/inject/n;->b:Landroid/content/Context;

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    goto :goto_0
.end method
