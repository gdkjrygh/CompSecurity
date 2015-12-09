.class public Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "TimeoutBroadcastReceiver.java"


# static fields
.field public static final OPCODE_STR:Ljava/lang/String; = "opCode"

.field public static final RESET_TIMER:I = 0x840

.field private static final TAG:Ljava/lang/String; = "TimeoutBroadcastReceiver"

.field private static final timeout_notification_id:I = 0x4d2


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;Landroid/content/Context;)Z
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;
    .param p1, "x1"    # Landroid/content/Context;

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;->isAppOnForeground(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method private isAppOnForeground(Landroid/content/Context;)Z
    .locals 8
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, 0x0

    .line 125
    const-string v6, "activity"

    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 126
    .local v0, "activityManager":Landroid/app/ActivityManager;
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v2

    .line 127
    .local v2, "appProcesses":Ljava/util/List;, "Ljava/util/List<Landroid/app/ActivityManager$RunningAppProcessInfo;>;"
    if-nez v2, :cond_1

    .line 137
    :cond_0
    :goto_0
    return v5

    .line 130
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 131
    .local v4, "packageName":Ljava/lang/String;
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 132
    .local v1, "appProcess":Landroid/app/ActivityManager$RunningAppProcessInfo;
    iget v6, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v7, 0x64

    if-ne v6, v7, :cond_2

    iget-object v6, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 134
    const/4 v5, 0x1

    goto :goto_0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 54
    const-string v2, "TimeoutBroadcastReceiver"

    const-string v3, "Timeout broadcast received, taking appropriate session action"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v2, "opCode"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 58
    .local v0, "opCode":I
    if-eqz v0, :cond_1

    .line 59
    const/16 v2, 0x840

    if-ne v0, v2, :cond_1

    .line 60
    const-string v2, "TimeoutBroadcastReceiver"

    const-string v3, "received - reset timer broadcast"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v2

    const v3, 0x7f080080

    if-ne v2, v3, :cond_0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 63
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/session/SessionManager;->resetTimeout()V

    .line 121
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    new-instance v1, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;

    invoke-direct {v1, p0, p1}, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;-><init>(Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;Landroid/content/Context;)V

    .line 119
    .local v1, "worker":Ljava/lang/Runnable;
    new-instance v2, Ljava/lang/Thread;

    invoke-direct {v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method
