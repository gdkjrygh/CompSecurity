.class public Lcom/facebook/f/e;
.super Ljava/lang/Object;
.source "GatekeeperProviderUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Set;)Lcom/google/common/a/fi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/f/f;",
            ">;)",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 21
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 22
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/f/f;

    .line 23
    invoke-interface {v0}, Lcom/facebook/f/f;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
