.class public Lcom/hmobile/common/NotificationHandler;
.super Landroid/app/Activity;
.source "NotificationHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 14
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    invoke-virtual {p0}, Lcom/hmobile/common/NotificationHandler;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "do_action"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 17
    .local v0, "action":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 18
    const-string v2, "Setting"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 19
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/hmobile/common/NotificationHandler;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/hmobile/biblekjv/SettingsActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .local v1, "in":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lcom/hmobile/common/NotificationHandler;->startActivity(Landroid/content/Intent;)V

    .line 28
    .end local v1    # "in":Landroid/content/Intent;
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/hmobile/common/NotificationHandler;->finish()V

    .line 29
    return-void

    .line 22
    :cond_1
    const-string v2, "Dismiss"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 23
    invoke-virtual {p0}, Lcom/hmobile/common/NotificationHandler;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x3e9

    invoke-static {v2, v3}, Lcom/hmobile/common/DailyQouteService;->cancelNotification(Landroid/content/Context;I)V

    goto :goto_0
.end method
