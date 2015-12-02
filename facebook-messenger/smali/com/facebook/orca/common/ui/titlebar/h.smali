.class Lcom/facebook/orca/common/ui/titlebar/h;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/facebook/orca/contacts/divebar/z;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 806
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 809
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->m(Lcom/facebook/orca/common/ui/titlebar/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 812
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/ui/touch/SwipableLinearLayout;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/i;-><init>(Lcom/facebook/orca/common/ui/titlebar/h;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/ui/touch/SwipableLinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 818
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Z)Z

    .line 820
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 824
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->n(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 825
    return-void
.end method
