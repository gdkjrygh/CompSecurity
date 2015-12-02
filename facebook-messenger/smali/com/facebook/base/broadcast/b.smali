.class public abstract Lcom/facebook/base/broadcast/b;
.super Ljava/lang/Object;
.source "BaseFbBroadcastManager.java"

# interfaces
.implements Lcom/facebook/base/broadcast/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/broadcast/k;
    .locals 1

    .prologue
    .line 163
    new-instance v0, Lcom/facebook/base/broadcast/d;

    invoke-direct {v0, p0}, Lcom/facebook/base/broadcast/d;-><init>(Lcom/facebook/base/broadcast/b;)V

    return-object v0
.end method

.method protected abstract a(Landroid/content/BroadcastReceiver;)V
.end method

.method protected abstract a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)V
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 30
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/base/broadcast/b;->a(Landroid/content/Intent;)V

    .line 32
    return-void
.end method

.method protected b()Z
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x1

    return v0
.end method
