.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/a/a$a;


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
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->c(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->finish()V

    .line 122
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/malware/vo/MaliciousInfo;II)V
    .locals 6

    .prologue
    .line 131
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/g;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/g;->show()V

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c00ed

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v5}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->d(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p1, v5}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/g;->a(Ljava/lang/CharSequence;)V

    .line 140
    :cond_1
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 127
    return-void
.end method
