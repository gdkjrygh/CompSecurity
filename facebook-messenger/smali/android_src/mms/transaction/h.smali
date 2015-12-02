.class public Landroid_src/mms/transaction/h;
.super Landroid/content/BroadcastReceiver;
.source "MessagingNotification.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 102
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const-string v0, "fb-mms:MessagingNotification"

    const-string v1, "[MessagingNotification] clear notification: mark all msgs seen"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :cond_0
    return-void
.end method
