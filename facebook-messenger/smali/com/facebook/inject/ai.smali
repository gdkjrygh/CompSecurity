.class Lcom/facebook/inject/ai;
.super Ljava/lang/Object;
.source "MultiBinder.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/util/Set",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/inject/ah;


# direct methods
.method constructor <init>(Lcom/facebook/inject/ah;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/inject/ai;->a:Lcom/facebook/inject/ah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 46
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v1

    .line 47
    iget-object v0, p0, Lcom/facebook/inject/ai;->a:Lcom/facebook/inject/ah;

    invoke-static {v0}, Lcom/facebook/inject/ah;->a(Lcom/facebook/inject/ah;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 48
    iget-object v3, p0, Lcom/facebook/inject/ai;->a:Lcom/facebook/inject/ah;

    invoke-static {v3}, Lcom/facebook/inject/ah;->b(Lcom/facebook/inject/ah;)Lcom/facebook/inject/t;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 50
    :cond_0
    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/inject/ai;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
