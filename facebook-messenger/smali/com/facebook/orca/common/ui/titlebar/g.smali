.class Lcom/facebook/orca/common/ui/titlebar/g;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 771
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/g;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 774
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/g;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->l(Lcom/facebook/orca/common/ui/titlebar/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v0

    const-string v1, "tap_outside"

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 776
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/g;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->j()V

    .line 777
    return-void
.end method
