.class Lcom/facebook/i/a/i;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/os/Message;

.field final synthetic b:Lcom/facebook/i/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/facebook/i/a/i;->b:Lcom/facebook/i/a/d;

    iput-object p2, p0, Lcom/facebook/i/a/i;->a:Landroid/os/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 261
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 262
    iget-object v0, p0, Lcom/facebook/i/a/i;->b:Lcom/facebook/i/a/d;

    invoke-static {v0}, Lcom/facebook/i/a/d;->l(Lcom/facebook/i/a/d;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a;

    .line 264
    :try_start_0
    iget-object v1, v0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    iget-object v4, p0, Lcom/facebook/i/a/i;->a:Landroid/os/Message;

    invoke-virtual {v1, v4}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 265
    :catch_0
    move-exception v1

    .line 266
    instance-of v4, v1, Landroid/os/DeadObjectException;

    if-eqz v4, :cond_0

    .line 267
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 269
    :cond_0
    iget-object v4, p0, Lcom/facebook/i/a/i;->b:Lcom/facebook/i/a/d;

    invoke-static {v4}, Lcom/facebook/i/a/d;->k(Lcom/facebook/i/a/d;)Lcom/facebook/common/e/h;

    move-result-object v4

    const-class v5, Lcom/facebook/i/a/b;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "RemoteException occurred when sending the message to peer "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v0, v0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v5, v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 276
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a;

    .line 277
    iget-object v2, p0, Lcom/facebook/i/a/i;->b:Lcom/facebook/i/a/d;

    invoke-static {v2, v0}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V

    goto :goto_1

    .line 279
    :cond_2
    return-void
.end method
