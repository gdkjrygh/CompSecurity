.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

.field final synthetic b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 0

    .prologue
    .line 548
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iput-object p2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 552
    if-eqz p2, :cond_0

    .line 553
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->t(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    .line 558
    return-void

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
