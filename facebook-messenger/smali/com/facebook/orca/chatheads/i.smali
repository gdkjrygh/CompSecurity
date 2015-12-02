.class public Lcom/facebook/orca/chatheads/i;
.super Ljava/lang/Object;
.source "ChatHeadCanonicalThreadMap.java"


# instance fields
.field private final a:Lcom/google/common/a/av;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/av",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {}, Lcom/google/common/a/ee;->e()Lcom/google/common/a/ee;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    .line 23
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    .line 50
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->g()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/common/a/av;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :cond_0
    :goto_0
    return-void

    .line 52
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-interface {v0}, Lcom/google/common/a/av;->b()Lcom/google/common/a/av;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/common/a/av;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-interface {v0, p1}, Lcom/google/common/a/av;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-interface {v0, p1}, Lcom/google/common/a/av;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 34
    invoke-static {p2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 35
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "%s already associated with thread %s, attempting to associcate with %s"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p1, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object p2, v3, v0

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-interface {v0, p1, p2}, Lcom/google/common/a/av;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    return-void
.end method

.method b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 2

    .prologue
    .line 65
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    :cond_0
    :goto_0
    return-object p1

    .line 68
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/chatheads/i;->a:Lcom/google/common/a/av;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->g()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/common/a/av;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 70
    if-eqz v0, :cond_0

    .line 71
    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object p1

    goto :goto_0
.end method
