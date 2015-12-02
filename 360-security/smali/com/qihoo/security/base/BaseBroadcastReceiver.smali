.class public abstract Lcom/qihoo/security/base/BaseBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# instance fields
.field protected a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 21
    if-eqz p2, :cond_0

    .line 22
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/base/BaseBroadcastReceiver;->a:Ljava/lang/String;

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/base/BaseBroadcastReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 25
    :cond_0
    return-void
.end method
