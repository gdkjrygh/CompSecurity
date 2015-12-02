.class Lcom/facebook/i/a/j;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/a;

.field final synthetic b:Landroid/os/Message;

.field final synthetic c:Lcom/facebook/i/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/facebook/i/a/j;->c:Lcom/facebook/i/a/d;

    iput-object p2, p0, Lcom/facebook/i/a/j;->a:Lcom/facebook/i/a/a;

    iput-object p3, p0, Lcom/facebook/i/a/j;->b:Landroid/os/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 291
    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/j;->a:Lcom/facebook/i/a/a;

    iget-object v0, v0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/facebook/i/a/j;->b:Landroid/os/Message;

    invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    :goto_0
    return-void

    .line 292
    :catch_0
    move-exception v0

    .line 293
    instance-of v1, v0, Landroid/os/DeadObjectException;

    if-eqz v1, :cond_0

    .line 294
    iget-object v0, p0, Lcom/facebook/i/a/j;->c:Lcom/facebook/i/a/d;

    iget-object v1, p0, Lcom/facebook/i/a/j;->a:Lcom/facebook/i/a/a;

    invoke-static {v0, v1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V

    goto :goto_0

    .line 296
    :cond_0
    iget-object v1, p0, Lcom/facebook/i/a/j;->c:Lcom/facebook/i/a/d;

    invoke-static {v1}, Lcom/facebook/i/a/d;->k(Lcom/facebook/i/a/d;)Lcom/facebook/common/e/h;

    move-result-object v1

    const-class v2, Lcom/facebook/i/a/b;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RemoteException occurred when sending the message to peer "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/i/a/j;->a:Lcom/facebook/i/a/a;

    iget-object v4, v4, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
