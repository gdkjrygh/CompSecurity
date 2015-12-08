.class public Lcom/plugin/gcm/PushHandlerActivity;
.super Landroid/app/Activity;
.source "PushHandlerActivity.java"


# static fields
.field private static TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const-string v0, "PushHandlerActivity"

    sput-object v0, Lcom/plugin/gcm/PushHandlerActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private forceMainActivityReload()V
    .locals 3

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/plugin/gcm/PushHandlerActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 61
    .local v1, "pm":Landroid/content/pm/PackageManager;
    invoke-virtual {p0}, Lcom/plugin/gcm/PushHandlerActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 62
    .local v0, "launchIntent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/plugin/gcm/PushHandlerActivity;->startActivity(Landroid/content/Intent;)V

    .line 63
    return-void
.end method

.method private processPushBundle(Z)V
    .locals 4
    .param p1, "isPushPluginActive"    # Z

    .prologue
    const/4 v2, 0x0

    .line 43
    invoke-virtual {p0}, Lcom/plugin/gcm/PushHandlerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 45
    .local v0, "extras":Landroid/os/Bundle;
    if-eqz v0, :cond_1

    .line 46
    const-string v3, "pushBundle"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 48
    .local v1, "originalExtras":Landroid/os/Bundle;
    const-string v3, "foreground"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 49
    const-string v3, "coldstart"

    if-nez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    invoke-static {v1}, Lcom/plugin/gcm/PushPlugin;->sendExtras(Landroid/os/Bundle;)V

    .line 53
    .end local v1    # "originalExtras":Landroid/os/Bundle;
    :cond_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    sget-object v1, Lcom/plugin/gcm/PushHandlerActivity;->TAG:Ljava/lang/String;

    const-string v2, "onCreate"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    invoke-static {}, Lcom/plugin/gcm/PushPlugin;->isActive()Z

    move-result v0

    .line 28
    .local v0, "isPushPluginActive":Z
    invoke-direct {p0, v0}, Lcom/plugin/gcm/PushHandlerActivity;->processPushBundle(Z)V

    .line 30
    invoke-virtual {p0}, Lcom/plugin/gcm/PushHandlerActivity;->finish()V

    .line 32
    if-nez v0, :cond_0

    .line 33
    invoke-direct {p0}, Lcom/plugin/gcm/PushHandlerActivity;->forceMainActivityReload()V

    .line 35
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 67
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 68
    const-string v1, "notification"

    invoke-virtual {p0, v1}, Lcom/plugin/gcm/PushHandlerActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 69
    .local v0, "notificationManager":Landroid/app/NotificationManager;
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 70
    return-void
.end method
