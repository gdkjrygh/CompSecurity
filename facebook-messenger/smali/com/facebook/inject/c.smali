.class public abstract Lcom/facebook/inject/c;
.super Ljava/lang/Object;
.source "AbstractModule.java"

# interfaces
.implements Lcom/facebook/inject/ag;


# instance fields
.field private a:Lcom/facebook/inject/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/a/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/a/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->a(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;
    .locals 2
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
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/e;->c(Lcom/google/inject/a;)Lcom/facebook/inject/aj;

    move-result-object v0

    return-object v0
.end method

.method protected abstract a()V
.end method

.method public final a(Lcom/facebook/inject/e;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    .line 23
    invoke-virtual {p0}, Lcom/facebook/inject/c;->a()V

    .line 24
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 0

    .prologue
    .line 34
    return-void
.end method

.method protected a(Ljava/lang/Class;Lcom/facebook/inject/au;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/au;",
            ")V"
        }
    .end annotation

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1, p2}, Lcom/facebook/inject/e;->a(Ljava/lang/Class;Lcom/facebook/inject/au;)V

    .line 173
    return-void
.end method

.method protected b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/a/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    return-object v0
.end method

.method protected b(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/a/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->b(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 2
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
            ">;)V"
        }
    .end annotation

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/e;->d(Lcom/google/inject/a;)V

    .line 127
    return-void
.end method

.method protected c(Ljava/lang/Class;)Lcom/facebook/inject/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    return-object v0
.end method

.method protected d(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->d(Ljava/lang/Class;)V

    .line 118
    return-void
.end method

.method protected e(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->e(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 145
    return-void
.end method

.method protected f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;)",
            "Lcom/facebook/inject/a/e;"
        }
    .end annotation

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/inject/c;->a:Lcom/facebook/inject/e;

    invoke-interface {v0, p1}, Lcom/facebook/inject/e;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    move-result-object v0

    return-object v0
.end method
