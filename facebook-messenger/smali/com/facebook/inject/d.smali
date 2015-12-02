.class public abstract Lcom/facebook/inject/d;
.super Ljava/lang/Object;
.source "AbstractProvider.java"

# interfaces
.implements Lcom/facebook/inject/ab;
.implements Lcom/facebook/inject/ak;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/inject/ab;",
        "Lcom/facebook/inject/ak",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/inject/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TS;>;)TS;"
        }
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;)TS;"
        }
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)TS;"
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    .line 23
    return-void
.end method

.method public b(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TS;>;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method protected c()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;)",
            "Ljava/util/Set",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljava/util/Set",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TS;>;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->c(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0}, Lcom/facebook/inject/t;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;)",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<TS;>;>;"
        }
    .end annotation

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->d(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<TS;>;>;"
        }
    .end annotation

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/inject/t;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/inject/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->d(Lcom/google/inject/a;)Z

    move-result v0

    return v0
.end method

.method public e()Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0}, Lcom/facebook/inject/t;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->e(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TS;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljavax/inject/a",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/inject/t;->e(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/Class;)Lcom/facebook/inject/ab;
    .locals 1
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
    .line 113
    iget-object v0, p0, Lcom/facebook/inject/d;->a:Lcom/facebook/inject/t;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->f(Ljava/lang/Class;)Lcom/facebook/inject/ab;

    move-result-object v0

    return-object v0
.end method
