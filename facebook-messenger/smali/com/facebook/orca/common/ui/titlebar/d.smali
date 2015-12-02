.class Lcom/facebook/orca/common/ui/titlebar/d;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/c;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/c;)V
    .locals 0

    .prologue
    .line 622
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 625
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->b(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 627
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->a:Lcom/facebook/orca/common/ui/titlebar/m;

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne v0, v1, :cond_2

    .line 628
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/ui/touch/SwipableLinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/touch/SwipableLinearLayout;->bringToFront()V

    .line 629
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->c(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->b()V

    .line 631
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->d(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 638
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 639
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 642
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->g(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/l;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 643
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->g(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/l;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v1, v1, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v1}, Lcom/facebook/orca/common/ui/titlebar/a;->h(Lcom/facebook/orca/common/ui/titlebar/a;)Lcom/facebook/orca/common/ui/titlebar/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/l;->b(Lcom/facebook/orca/common/ui/titlebar/m;)V

    .line 645
    :cond_1
    return-void

    .line 634
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->e(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 635
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/d;->a:Lcom/facebook/orca/common/ui/titlebar/c;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/c;->c:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->f(Lcom/facebook/orca/common/ui/titlebar/a;)V

    goto :goto_0
.end method
