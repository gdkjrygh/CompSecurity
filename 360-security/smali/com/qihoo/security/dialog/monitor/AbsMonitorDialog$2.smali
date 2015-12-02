.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 148
    if-nez p2, :cond_0

    .line 164
    :goto_0
    return-void

    .line 152
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 156
    const-string/jumbo v1, "com.qihoo.action.MONITOR_UPDATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    goto :goto_0

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->finish()V

    goto :goto_0
.end method
