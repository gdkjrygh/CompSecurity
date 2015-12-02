.class Lcom/facebook/device_id/j;
.super Ljava/lang/Object;
.source "UniqueDeviceIdBroadcastSender.java"

# interfaces
.implements Lcom/facebook/device_id/h;


# instance fields
.field final synthetic a:Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;


# direct methods
.method constructor <init>(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/device_id/j;->a:Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/device_id/i;)V
    .locals 6

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/device_id/j;->a:Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-static {v0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)Lcom/facebook/device_id/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/device_id/l;->d()Lcom/facebook/device_id/i;

    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lcom/facebook/device_id/i;->b()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/facebook/device_id/i;->b()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 104
    invoke-static {}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a()Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device id Changed from: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "to: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/device_id/j;->a:Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-static {v0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)Lcom/facebook/device_id/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/device_id/l;->a(Lcom/facebook/device_id/i;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/device_id/j;->a:Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-static {v0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->b(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/device_id/a;

    .line 107
    invoke-interface {v0, v1, p1}, Lcom/facebook/device_id/a;->a(Lcom/facebook/device_id/i;Lcom/facebook/device_id/i;)V

    goto :goto_0

    .line 111
    :cond_0
    return-void
.end method
