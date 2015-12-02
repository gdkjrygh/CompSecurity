.class public Lcom/facebook/base/broadcast/m;
.super Lcom/facebook/base/broadcast/b;
.source "LocalFbBroadcastManager.java"


# instance fields
.field private final a:Landroid/support/v4/a/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/base/broadcast/b;-><init>()V

    .line 19
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/broadcast/m;->a:Landroid/support/v4/a/e;

    .line 21
    return-void
.end method


# virtual methods
.method protected a(Landroid/content/BroadcastReceiver;)V
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/base/broadcast/m;->a:Landroid/support/v4/a/e;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 37
    return-void
.end method

.method protected a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/base/broadcast/m;->a:Landroid/support/v4/a/e;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 32
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/base/broadcast/m;->a:Landroid/support/v4/a/e;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 26
    return-void
.end method

.method protected b()Z
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    return v0
.end method
