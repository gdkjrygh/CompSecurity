.class public Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;
.super Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;
.source "360Security"


# static fields
.field private static e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;-><init>()V

    return-void
.end method

.method public static i()Z
    .locals 1

    .prologue
    .line 34
    sget-boolean v0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->e:Z

    return v0
.end method


# virtual methods
.method protected c()I
    .locals 1

    .prologue
    .line 39
    const v0, 0x7f0c011a

    return v0
.end method

.method protected d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    invoke-static {p0}, Lcom/qihoo/security/malware/db/a;->g(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected e()V
    .locals 3

    .prologue
    .line 49
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "com.qihoo.action.MONITOR_UPDATE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 50
    const-string/jumbo v1, "com.qihoo.action.MONITOR_DIALOG_FORCE_FINISH"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 51
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->c:Landroid/support/v4/content/g;

    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 52
    return-void
.end method

.method protected f()V
    .locals 2

    .prologue
    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->c:Landroid/support/v4/content/g;

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    return-void

    .line 58
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected g()I
    .locals 1

    .prologue
    .line 67
    const v0, 0x7f020073

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 23
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->e:Z

    .line 25
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 29
    invoke-super {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->onDestroy()V

    .line 30
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->e:Z

    .line 31
    return-void
.end method
