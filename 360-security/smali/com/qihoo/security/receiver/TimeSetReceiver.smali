.class public Lcom/qihoo/security/receiver/TimeSetReceiver;
.super Lcom/qihoo/security/receiver/BootReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/qihoo/security/receiver/BootReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/receiver/BootReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 21
    return-void
.end method
