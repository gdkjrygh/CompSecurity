.class public Lcom/facebook/inject/aj;
.super Ljava/lang/Object;
.source "MultiBinding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<+TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/inject/aj;->a:Lcom/google/inject/a;

    .line 21
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/aj;->b:Ljava/util/Set;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Lcom/google/inject/a;)Lcom/facebook/inject/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<+TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/inject/aj;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    return-object p0
.end method

.method public a(Ljava/lang/Class;)Lcom/facebook/inject/aj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/inject/aj;->b:Ljava/util/Set;

    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    return-object p0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;
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
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 34
    invoke-static {p1, p2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/inject/aj;->a(Lcom/google/inject/a;)Lcom/facebook/inject/aj;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<+TT;>;>;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/inject/aj;->b:Ljava/util/Set;

    return-object v0
.end method
