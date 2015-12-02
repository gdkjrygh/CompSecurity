.class public Lcom/qihoo/security/receiver/ScreenUnlockReceiver;
.super Lcom/qihoo/security/receiver/BootReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/qihoo/security/receiver/BootReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 13
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/receiver/BootReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 19
    return-void
.end method
