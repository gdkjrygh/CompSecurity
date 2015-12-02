.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j()V
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
    .line 272
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 276
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 277
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 278
    return-void
.end method
