.class Lcom/facebook/device_id/e;
.super Lcom/facebook/inject/d;
.source "DeviceIdModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/device_id/b;


# direct methods
.method private constructor <init>(Lcom/facebook/device_id/b;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/device_id/e;->a:Lcom/facebook/device_id/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/device_id/b;Lcom/facebook/device_id/c;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lcom/facebook/device_id/e;-><init>(Lcom/facebook/device_id/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;
    .locals 7

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    const-class v1, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v1}, Lcom/facebook/device_id/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/device_id/l;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/device_id/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0}, Lcom/facebook/device_id/e;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Landroid/content/Context;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/device_id/e;->e()Lcom/facebook/inject/ab;

    move-result-object v4

    const-class v5, Landroid/app/AlarmManager;

    invoke-interface {v4, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/AlarmManager;

    const-class v5, Lcom/facebook/device_id/g;

    invoke-virtual {p0, v5}, Lcom/facebook/device_id/e;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/device_id/a;

    invoke-virtual {p0, v6}, Lcom/facebook/device_id/e;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;-><init>(Lcom/facebook/device_id/l;Lcom/facebook/common/time/a;Landroid/content/Context;Landroid/app/AlarmManager;Ljavax/inject/a;Ljava/util/Set;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/facebook/device_id/e;->a()Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    move-result-object v0

    return-object v0
.end method
