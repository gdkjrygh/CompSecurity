.class public Lcom/facebook/inject/a/d;
.super Lcom/facebook/inject/a/h;
.source "LinkedBindingBuilderImpl.java"

# interfaces
.implements Lcom/facebook/inject/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/inject/a/h",
        "<TT;>;",
        "Lcom/facebook/inject/a/c",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/inject/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/h",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/inject/a/h;-><init>(Lcom/facebook/inject/h;)V

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;)Lcom/facebook/inject/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<+TT;>;)",
            "Lcom/facebook/inject/a/g;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    new-instance v1, Lcom/facebook/inject/ar;

    invoke-direct {v1, p1}, Lcom/facebook/inject/ar;-><init>(Lcom/google/inject/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljavax/inject/a;)V

    .line 49
    new-instance v0, Lcom/facebook/inject/a/h;

    iget-object v1, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    invoke-direct {v0, v1}, Lcom/facebook/inject/a/h;-><init>(Lcom/facebook/inject/h;)V

    return-object v0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/facebook/inject/a/g;"
        }
    .end annotation

    .prologue
    .line 37
    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/a/d;->a(Lcom/google/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<+TT;>;)",
            "Lcom/facebook/inject/a/g;"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/h;->a(Ljavax/inject/a;)V

    .line 60
    new-instance v0, Lcom/facebook/inject/a/h;

    iget-object v1, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    invoke-direct {v0, v1}, Lcom/facebook/inject/a/h;-><init>(Lcom/facebook/inject/h;)V

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    new-instance v1, Lcom/facebook/inject/ac;

    invoke-direct {v1, p1}, Lcom/facebook/inject/ac;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljavax/inject/a;)V

    .line 55
    return-void
.end method

.method public b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+TT;>;)",
            "Lcom/facebook/inject/a/g;"
        }
    .end annotation

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    new-instance v1, Lcom/facebook/inject/ar;

    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/inject/ar;-><init>(Lcom/google/inject/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljavax/inject/a;)V

    .line 30
    new-instance v0, Lcom/facebook/inject/a/h;

    iget-object v1, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    invoke-direct {v0, v1}, Lcom/facebook/inject/a/h;-><init>(Lcom/facebook/inject/h;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljavax/inject/a",
            "<+TT;>;>;)",
            "Lcom/facebook/inject/a/g;"
        }
    .end annotation

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    new-instance v1, Lcom/facebook/inject/as;

    invoke-direct {v1, p1}, Lcom/facebook/inject/as;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljavax/inject/a;)V

    .line 66
    new-instance v0, Lcom/facebook/inject/a/h;

    iget-object v1, p0, Lcom/facebook/inject/a/d;->a:Lcom/facebook/inject/h;

    invoke-direct {v0, v1}, Lcom/facebook/inject/a/h;-><init>(Lcom/facebook/inject/h;)V

    return-object v0
.end method
