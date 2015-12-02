.class public Lcom/facebook/orca/g/p;
.super Ljava/lang/Object;
.source "DbMessageCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->i()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/g/p;->a:Ljava/util/Map;

    .line 23
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/g/p;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/g/p;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 40
    return-void
.end method

.method a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    :goto_0
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/g/p;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/g/p;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 44
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 46
    invoke-static {v0}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/orca/g/p;->a()V

    .line 55
    return-void
.end method
