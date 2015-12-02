.class Lcom/facebook/zero/ui/j;
.super Ljava/lang/Object;
.source "ExtraChargesDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/zero/ui/ExtraChargesDialog;


# direct methods
.method constructor <init>(Lcom/facebook/zero/ui/ExtraChargesDialog;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Lcom/facebook/zero/ui/ExtraChargesDialog;)Lcom/facebook/zero/ui/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->d(Lcom/facebook/zero/ui/ExtraChargesDialog;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-virtual {v2}, Lcom/facebook/zero/ui/ExtraChargesDialog;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v2}, Lcom/facebook/zero/ui/ExtraChargesDialog;->c(Lcom/facebook/zero/ui/ExtraChargesDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "zero_extra_charges_dialog_confirm"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "dialogName"

    iget-object v3, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v3}, Lcom/facebook/zero/ui/ExtraChargesDialog;->b(Lcom/facebook/zero/ui/ExtraChargesDialog;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 160
    iget-object v0, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Lcom/facebook/zero/ui/ExtraChargesDialog;)Lcom/facebook/zero/ui/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v1}, Lcom/facebook/zero/ui/ExtraChargesDialog;->e(Lcom/facebook/zero/ui/ExtraChargesDialog;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/zero/ui/k;->a(Landroid/os/Parcelable;)V

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/ui/j;->a:Lcom/facebook/zero/ui/ExtraChargesDialog;

    invoke-static {v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->g(Lcom/facebook/zero/ui/ExtraChargesDialog;)V

    .line 163
    return-void
.end method
