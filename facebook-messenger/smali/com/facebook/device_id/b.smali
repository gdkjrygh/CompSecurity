.class public Lcom/facebook/device_id/b;
.super Lcom/facebook/inject/c;
.source "DeviceIdModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 62
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 20
    const-class v0, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/device_id/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/device_id/f;-><init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    const-class v0, Lcom/facebook/device_id/g;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/device_id/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/device_id/d;-><init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 25
    const-class v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/device_id/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/device_id/e;-><init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 28
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/device_id/b;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/device_id/l;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 31
    const-class v0, Lcom/facebook/auth/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 34
    const-class v0, Lcom/facebook/device_id/a;

    invoke-virtual {p0, v0}, Lcom/facebook/device_id/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 36
    return-void
.end method
