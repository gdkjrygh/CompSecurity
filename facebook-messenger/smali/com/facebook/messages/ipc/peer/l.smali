.class public Lcom/facebook/messages/ipc/peer/l;
.super Lcom/facebook/i/a/a/b;
.source "ThreadUnreadCountPeerRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/common/u/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/u/c",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    invoke-direct {p0, v0, p1}, Lcom/facebook/i/a/a/b;-><init>(Landroid/net/Uri;I)V

    .line 32
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    .line 38
    new-instance v0, Lcom/facebook/common/u/c;

    invoke-direct {v0}, Lcom/facebook/common/u/c;-><init>()V

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->c:Lcom/facebook/common/u/c;

    .line 39
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->c:Lcom/facebook/common/u/c;

    const-string v1, "peer://msg_notification_unread_count/clear_thread/{thread_id}"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->c:Lcom/facebook/common/u/c;

    const-string v1, "peer://msg_notification_unread_count/thread/{thread_id}"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 69
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
    .locals 3

    .prologue
    .line 112
    :try_start_0
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->c:Lcom/facebook/common/u/c;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;)Lcom/facebook/common/u/i;

    move-result-object v1

    .line 113
    if-eqz v1, :cond_1

    .line 114
    const/4 v2, 0x1

    iget-object v0, v1, Lcom/facebook/common/u/i;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v2, v0, :cond_1

    .line 115
    iget-object v0, v1, Lcom/facebook/common/u/i;->b:Landroid/os/Bundle;

    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 117
    if-eqz v0, :cond_1

    .line 118
    iget-object v1, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    if-nez v1, :cond_0

    .line 119
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 121
    :cond_0
    iget-object v1, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lcom/facebook/common/u/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :cond_1
    :goto_0
    return-void

    .line 125
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 49
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 50
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 51
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/l;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 54
    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 5
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 73
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->p:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v2

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    move v2, v1

    .line 78
    goto :goto_0

    .line 82
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->c:Lcom/facebook/common/u/c;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/common/u/c;->a(Ljava/lang/String;)Lcom/facebook/common/u/i;

    move-result-object v3

    .line 83
    if-eqz v3, :cond_0

    .line 84
    iget-object v0, v3, Lcom/facebook/common/u/i;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 86
    :pswitch_0
    iget-object v0, v3, Lcom/facebook/common/u/i;->b:Landroid/os/Bundle;

    const-string v3, "thread_id"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v3, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    move v2, v0

    .line 88
    goto :goto_0

    :cond_3
    move v0, v2

    .line 87
    goto :goto_1

    .line 91
    :pswitch_1
    iget-object v0, v3, Lcom/facebook/common/u/i;->b:Landroid/os/Bundle;

    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 92
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 93
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 94
    if-nez v0, :cond_4

    .line 95
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    .line 96
    iget-object v4, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    :cond_4
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/facebook/common/u/d; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    goto :goto_0

    .line 84
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 59
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/l;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 61
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 62
    iget-object v4, p0, Lcom/facebook/messages/ipc/peer/l;->b:Ljava/util/Map;

    invoke-static {v3}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v3

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 64
    :cond_0
    return-void
.end method
