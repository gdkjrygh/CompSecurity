.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;
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
    .line 515
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iput-object p2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    .line 519
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 520
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v1, v1, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->n(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 522
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v1, v1, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->p(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0120

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v5, v5, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v5}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->o(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v5

    iget-object v6, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v6, v6, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v7, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v7, v7, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-object v8, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v8, v8, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v5, v6, v7, v8}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 525
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 526
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->notifyDataSetChanged()V

    .line 527
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;->b:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    iget-object v0, v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    .line 528
    return-void
.end method
