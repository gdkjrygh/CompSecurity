.class public Lcom/facebook/orca/chatheads/bz;
.super Ljava/lang/Object;
.source "ChatHeadsForegroundState.java"


# instance fields
.field private final a:Landroid/app/Service;

.field private b:Z


# direct methods
.method constructor <init>(Landroid/app/Service;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    .line 31
    return-void
.end method


# virtual methods
.method a()V
    .locals 6

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/bz;->b:Z

    if-eqz v0, :cond_0

    .line 57
    :goto_0
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/bz;->b:Z

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    invoke-virtual {v0}, Landroid/app/Service;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 41
    sget v1, Lcom/facebook/o;->preference_notifications_chat_heads_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 42
    sget v2, Lcom/facebook/o;->app_name_long:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 46
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v3, v3

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 49
    new-instance v3, Landroid/support/v4/app/ap;

    iget-object v4, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    invoke-direct {v3, v4}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/facebook/h;->chat_heads_notification_icon:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ap;->b(I)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->b()Landroid/app/Notification;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    const/16 v2, 0x2716

    invoke-virtual {v1, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    goto :goto_0
.end method

.method b()V
    .locals 2

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/bz;->b:Z

    if-nez v0, :cond_0

    .line 67
    :goto_0
    return-void

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bz;->a:Landroid/app/Service;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Service;->stopForeground(Z)V

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/bz;->b:Z

    goto :goto_0
.end method
