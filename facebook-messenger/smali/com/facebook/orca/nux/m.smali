.class Lcom/facebook/orca/nux/m;
.super Ljava/lang/Object;
.source "ThreadListNuxController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/orca/nux/m;->a:Lcom/facebook/orca/nux/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/orca/nux/m;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/orca/nux/k;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "find_contacts_accept_btn"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/nux/m;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->b(Lcom/facebook/orca/nux/k;)V

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/nux/m;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->c(Lcom/facebook/orca/nux/k;)V

    .line 215
    return-void
.end method
