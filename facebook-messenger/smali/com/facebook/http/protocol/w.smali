.class public Lcom/facebook/http/protocol/w;
.super Ljava/lang/Object;
.source "BatchComponentRunner.java"


# instance fields
.field private final a:Lcom/facebook/http/protocol/am;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/am;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/http/protocol/w;->a:Lcom/facebook/http/protocol/am;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/v;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/http/protocol/w;->a(Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/l;)V

    .line 33
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/l;)V
    .locals 7
    .param p3    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/v;",
            ">;",
            "Lcom/facebook/http/protocol/l;",
            ")V"
        }
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/http/protocol/w;->a:Lcom/facebook/http/protocol/am;

    invoke-interface {v0}, Lcom/facebook/http/protocol/am;->a()Lcom/facebook/http/protocol/j;

    move-result-object v2

    .line 50
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 51
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/v;

    .line 52
    invoke-interface {v0}, Lcom/facebook/http/protocol/v;->a()Ljava/util/List;

    move-result-object v4

    .line 53
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/y;

    .line 55
    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    goto :goto_0

    .line 60
    :cond_1
    invoke-interface {v2, p1, p3}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;Lcom/facebook/http/protocol/l;)V

    .line 63
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 64
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/v;

    .line 65
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v4

    .line 66
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/y;

    .line 67
    invoke-virtual {v0}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 70
    :cond_2
    invoke-interface {v1, v4}, Lcom/facebook/http/protocol/v;->a(Ljava/util/Map;)V

    goto :goto_1

    .line 72
    :cond_3
    return-void
.end method
