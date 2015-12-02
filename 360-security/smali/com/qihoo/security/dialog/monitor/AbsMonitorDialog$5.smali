.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;
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
    .line 294
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/16 v2, 0x37e9

    .line 297
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->finish()V

    .line 298
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 303
    :goto_0
    return-void

    .line 301
    :cond_0
    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0
.end method
