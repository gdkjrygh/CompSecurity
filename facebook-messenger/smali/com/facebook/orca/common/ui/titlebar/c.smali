.class Lcom/facebook/orca/common/ui/titlebar/c;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/a/a/b;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/m;

.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/common/ui/titlebar/m;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 611
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    iput-object p2, p0, Lcom/facebook/orca/common/ui/titlebar/c;->a:Lcom/facebook/orca/common/ui/titlebar/m;

    iput-object p3, p0, Lcom/facebook/orca/common/ui/titlebar/c;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/a;)V
    .locals 0

    .prologue
    .line 614
    return-void
.end method

.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 618
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/a/a/ak;)Lcom/a/a/ak;

    .line 619
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/c;->a:Lcom/facebook/orca/common/ui/titlebar/m;

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Lcom/facebook/orca/common/ui/titlebar/m;)V

    .line 621
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/ui/touch/SwipableLinearLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 622
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/ui/touch/SwipableLinearLayout;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/d;-><init>(Lcom/facebook/orca/common/ui/titlebar/c;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/touch/SwipableLinearLayout;->post(Ljava/lang/Runnable;)Z

    .line 648
    :cond_0
    return-void
.end method

.method public c(Lcom/a/a/a;)V
    .locals 0

    .prologue
    .line 652
    return-void
.end method

.method public d(Lcom/a/a/a;)V
    .locals 0

    .prologue
    .line 656
    return-void
.end method
