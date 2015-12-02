.class Lcom/facebook/i/a/a/i;
.super Ljava/lang/Object;
.source "StatefulPeerManagerImpl.java"

# interfaces
.implements Lcom/facebook/i/a/q;
.implements Lcom/facebook/i/a/r;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/a/g;


# direct methods
.method private constructor <init>(Lcom/facebook/i/a/a/g;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a/h;)V
    .locals 0

    .prologue
    .line 215
    invoke-direct {p0, p1}, Lcom/facebook/i/a/a/i;-><init>(Lcom/facebook/i/a/a/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/i/a/a;)V
    .locals 10

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v9, 0x0

    .line 263
    iget-object v0, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v0, v0, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    const-string v1, "onPeerDisconnected from peer: %s, self: %s"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v3, v2, v9

    iget-object v3, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v3}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;

    move-result-object v3

    invoke-interface {v3}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v3, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    monitor-enter v3

    .line 272
    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v0}, Lcom/facebook/i/a/a/g;->e(Lcom/facebook/i/a/a/g;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 273
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 275
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/i/a/a/b;

    .line 276
    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->a()V

    .line 277
    iget-object v2, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v2}, Lcom/facebook/i/a/a/g;->f(Lcom/facebook/i/a/a/g;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/SortedSet;

    .line 278
    if-nez v2, :cond_1

    .line 279
    iget-object v2, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v2, v2, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    const-string v5, "Invalid state: there should be roles for base uri %s when %s disconnected."

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    iget-object v8, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v8, v6, v7

    invoke-static {v2, v5, v6}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v2, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v2}, Lcom/facebook/i/a/a/g;->g(Lcom/facebook/i/a/a/g;)Lcom/facebook/common/e/h;

    move-result-object v2

    iget-object v5, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v5, v5, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid state: there should be roles for base uri "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " when "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v6, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, " disconnected."

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v5, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 297
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 290
    :cond_1
    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/SortedSet;->remove(Ljava/lang/Object;)Z

    .line 291
    invoke-interface {v2}, Ljava/util/SortedSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 292
    iget-object v2, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v2}, Lcom/facebook/i/a/a/g;->f(Lcom/facebook/i/a/a/g;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 296
    :cond_2
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1}, Lcom/facebook/i/a/a/g;->e(Lcom/facebook/i/a/a/g;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/b;

    .line 300
    iget-object v2, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-virtual {v0}, Lcom/facebook/i/a/a/b;->c()Landroid/net/Uri;

    move-result-object v0

    const-string v3, "disconnected"

    invoke-static {v0, v3}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v2, v0, v9}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a/g;Landroid/net/Uri;Z)V

    goto :goto_1

    .line 304
    :cond_3
    return-void
.end method

.method public a(Lcom/facebook/i/a/a;Landroid/os/Message;)V
    .locals 7

    .prologue
    const/4 v3, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 219
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 220
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a/g;)Ljava/lang/ClassLoader;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 221
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a/g;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 223
    :cond_0
    iget v1, p2, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 243
    :goto_0
    return-void

    .line 225
    :pswitch_0
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v1, v1, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    const-string v2, "Receive message MSG_CLONE_PEER_ON_CONNECTED from peer %s, self: %s"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v4}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;

    move-result-object v4

    invoke-interface {v4}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v4

    iget-object v4, v4, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v3, v6

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1, p1, v0}, Lcom/facebook/i/a/a/g;->a(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a;Landroid/os/Bundle;)V

    goto :goto_0

    .line 234
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v1, v1, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    const-string v2, "Receive message MSG_SET_STATE from peer %s, self: %s"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v4}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;

    move-result-object v4

    invoke-interface {v4}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v4

    iget-object v4, v4, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v3, v6

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1, p1, v0}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;Lcom/facebook/i/a/a;Landroid/os/Bundle;)V

    goto :goto_0

    .line 223
    :pswitch_data_0
    .packed-switch 0x3b9aca00
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V
    .locals 5

    .prologue
    .line 247
    iget-object v0, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    iget-object v0, v0, Lcom/facebook/i/a/a/g;->a:Ljava/lang/Class;

    const-string v1, "onPeerConnected to peer: %s, self: %s, Direction: %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v4}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;

    move-result-object v4

    invoke-interface {v4}, Lcom/facebook/i/a/b;->b()Lcom/facebook/i/a/a;

    move-result-object v4

    iget-object v4, v4, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v0}, Lcom/facebook/i/a/a/g;->c(Lcom/facebook/i/a/a/g;)Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v0}, Lcom/facebook/i/a/a/g;->d(Lcom/facebook/i/a/a/g;)Landroid/os/Message;

    move-result-object v0

    .line 257
    iget-object v1, p0, Lcom/facebook/i/a/a/i;->a:Lcom/facebook/i/a/a/g;

    invoke-static {v1}, Lcom/facebook/i/a/a/g;->b(Lcom/facebook/i/a/a/g;)Lcom/facebook/i/a/b;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Lcom/facebook/i/a/b;->a(Lcom/facebook/i/a/a;Landroid/os/Message;)V

    .line 259
    :cond_0
    return-void
.end method
