.class public Lcom/facebook/inject/a/h;
.super Ljava/lang/Object;
.source "ScopedBindingBuilderImpl.java"

# interfaces
.implements Lcom/facebook/inject/a/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/inject/a/g;"
    }
.end annotation


# instance fields
.field protected final a:Lcom/facebook/inject/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/inject/h",
            "<TT;>;"
        }
    .end annotation
.end field


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
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    .line 23
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 28
    return-void
.end method

.method public a(Ljava/lang/Class;Lcom/facebook/inject/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    invoke-virtual {v0, p2}, Lcom/facebook/inject/h;->a(Lcom/facebook/inject/f;)V

    .line 61
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 39
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 44
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    sget-object v1, Lcom/facebook/inject/f;->LESS_EAGER_ON_UI_THREAD:Lcom/facebook/inject/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Lcom/facebook/inject/f;)V

    .line 45
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 50
    return-void
.end method

.method public d(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/inject/a/h;->a:Lcom/facebook/inject/h;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/h;->a(Ljava/lang/Class;)V

    .line 55
    return-void
.end method
