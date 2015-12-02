.class public Lcom/facebook/base/broadcast/n;
.super Lcom/facebook/base/broadcast/b;
.source "PermissionBasedFbBroadcastManager.java"


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/base/broadcast/b;-><init>()V

    .line 19
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/facebook/base/broadcast/n;->a:Landroid/content/Context;

    .line 20
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/base/broadcast/n;->b:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method protected a(Landroid/content/BroadcastReceiver;)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/base/broadcast/n;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 32
    return-void
.end method

.method protected a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/base/broadcast/n;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/base/broadcast/n;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, v1, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 27
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/base/broadcast/n;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/base/broadcast/n;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 37
    return-void
.end method
