.class public Lcom/facebook/orca/chatheads/ak;
.super Ljava/lang/Object;
.source "ChatHeadViewStack.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/common/executors/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/threads/model/b;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/messages/threads/model/b;",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "only updated on ui thread; can be read on other threads"
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    .line 47
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    .line 48
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 49
    return-void
.end method


# virtual methods
.method a(I)Lcom/facebook/orca/chatheads/ag;
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/model/b;

    .line 218
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    return-object v0
.end method

.method a(Lcom/facebook/messages/threads/model/b;)Lcom/facebook/orca/chatheads/ag;
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 204
    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 207
    :cond_0
    return-object v0
.end method

.method a()V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 112
    return-void
.end method

.method a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 75
    return-void

    .line 74
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/chatheads/ag;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 59
    invoke-virtual {p2}, Lcom/facebook/orca/chatheads/ag;->getPendingThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v3

    invoke-interface {v0, v3, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v3, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v3

    if-ne v0, v3, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 63
    return-void

    :cond_0
    move v0, v2

    .line 59
    goto :goto_0

    :cond_1
    move v1, v2

    .line 62
    goto :goto_1
.end method

.method a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 86
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/b;->b()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 91
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getPendingThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    if-ne v1, p2, :cond_0

    move v1, v2

    :goto_0
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 94
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    .line 95
    iget-object v4, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 99
    iget-object v4, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v4, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    :goto_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 103
    return-void

    :cond_0
    move v1, v3

    .line 91
    goto :goto_0

    :cond_1
    move v2, v3

    .line 102
    goto :goto_1
.end method

.method a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 133
    if-ltz p2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v0

    if-ge p2, v0, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 136
    if-eq v0, p2, :cond_1

    .line 138
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 142
    :goto_1
    return v1

    :cond_0
    move v0, v2

    .line 133
    goto :goto_0

    :cond_1
    move v1, v2

    .line 142
    goto :goto_1
.end method

.method b()I
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    return v0
.end method

.method b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)Z

    move-result v0

    return v0
.end method

.method c()Z
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z
    .locals 2

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;
    .locals 1

    .prologue
    .line 181
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/b;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    return-object v0
.end method

.method d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 192
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method e()Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 236
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ak;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/model/b;

    .line 238
    iget-object v3, p0, Lcom/facebook/orca/chatheads/ak;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 240
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
