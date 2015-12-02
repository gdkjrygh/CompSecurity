.class Lcom/facebook/push/mqtt/bz;
.super Ljava/lang/Object;
.source "MqttPushServiceClientManager.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/bx;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/bx;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/push/mqtt/bz;->a:Lcom/facebook/push/mqtt/bx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/bx;Lcom/facebook/push/mqtt/by;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bz;-><init>(Lcom/facebook/push/mqtt/bx;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/push/mqtt/bz;->a:Lcom/facebook/push/mqtt/bx;

    invoke-static {v0, p2}, Lcom/facebook/push/mqtt/bx;->a(Lcom/facebook/push/mqtt/bx;Landroid/os/IBinder;)V

    .line 41
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/push/mqtt/bz;->a:Lcom/facebook/push/mqtt/bx;

    invoke-static {v0}, Lcom/facebook/push/mqtt/bx;->a(Lcom/facebook/push/mqtt/bx;)V

    .line 46
    return-void
.end method
