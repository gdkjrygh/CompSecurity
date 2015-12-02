.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 507
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iput-object p2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 511
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-static {v0, v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 512
    return-void
.end method
