.class Lcom/facebook/push/mqtt/ab;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/aa;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/aa;)V
    .locals 0

    .prologue
    .line 672
    iput-object p1, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 675
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "connectionEstablished runnable"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 676
    iget-object v0, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->b(Lcom/facebook/push/mqtt/v;)Lcom/facebook/mqtt/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    invoke-static {v1}, Lcom/facebook/push/mqtt/aa;->a(Lcom/facebook/push/mqtt/aa;)Lcom/facebook/mqtt/b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 678
    iget-object v0, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/push/mqtt/v;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 679
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/push/mqtt/v;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 680
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 681
    iget-object v1, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v1, v1, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v1, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/v;Lcom/google/common/a/es;)V

    .line 682
    iget-object v0, p0, Lcom/facebook/push/mqtt/ab;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->d(Lcom/facebook/push/mqtt/v;)V

    .line 684
    :cond_0
    return-void

    .line 680
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
