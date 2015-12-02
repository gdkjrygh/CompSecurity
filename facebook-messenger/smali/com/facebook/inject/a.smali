.class public abstract Lcom/facebook/inject/a;
.super Lcom/facebook/inject/t;
.source "AbstractInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 31
    invoke-virtual {p0, p1}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 21
    invoke-virtual {p0, p1}, Lcom/facebook/inject/a;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 26
    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract b(Lcom/google/inject/a;)Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end method

.method public b(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 36
    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 41
    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/inject/a;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 51
    invoke-static {p1, p2}, Lcom/facebook/inject/a;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public abstract c(Lcom/google/inject/a;)Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end method

.method public d(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/inject/a;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {p1, p2}, Lcom/facebook/inject/a;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 66
    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->c(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 72
    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a;->c(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/Class;)Lcom/facebook/inject/ab;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/ab;"
        }
    .end annotation

    .prologue
    .line 77
    return-object p0
.end method
