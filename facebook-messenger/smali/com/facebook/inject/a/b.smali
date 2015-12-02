.class public Lcom/facebook/inject/a/b;
.super Lcom/facebook/inject/a/d;
.source "AnnotatedBindingBuilderImpl.java"

# interfaces
.implements Lcom/facebook/inject/a/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/inject/a/d",
        "<TT;>;",
        "Lcom/facebook/inject/a/a",
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
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/inject/a/d;-><init>(Lcom/facebook/inject/h;)V

    .line 18
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/facebook/inject/a/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/inject/a/b;->a:Lcom/facebook/inject/h;

    iget-object v1, p0, Lcom/facebook/inject/a/b;->a:Lcom/facebook/inject/h;

    invoke-virtual {v1}, Lcom/facebook/inject/h;->a()Lcom/google/inject/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/a;->a()Lcom/google/inject/f;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/inject/a;->a(Lcom/google/inject/f;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Lcom/google/inject/a;)V

    .line 23
    new-instance v0, Lcom/facebook/inject/a/d;

    iget-object v1, p0, Lcom/facebook/inject/a/b;->a:Lcom/facebook/inject/h;

    invoke-direct {v0, v1}, Lcom/facebook/inject/a/d;-><init>(Lcom/facebook/inject/h;)V

    return-object v0
.end method
