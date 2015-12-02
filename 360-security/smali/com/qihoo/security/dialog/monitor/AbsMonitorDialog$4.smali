.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 280
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v3, 0x37e8

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Z)Z

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    .line 286
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 292
    :goto_0
    return-void

    .line 290
    :cond_0
    invoke-static {v3}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0
.end method
