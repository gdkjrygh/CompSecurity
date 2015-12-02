.class Lcom/facebook/orca/chatheads/k;
.super Lcom/facebook/n/b;
.source "ChatHeadCloseTargetView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)V
    .locals 0

    .prologue
    .line 483
    iput-object p1, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;Lcom/facebook/orca/chatheads/j;)V
    .locals 0

    .prologue
    .line 483
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/k;-><init>(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    .line 487
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 488
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;F)V

    .line 497
    :cond_0
    :goto_0
    return-void

    .line 489
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 490
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;F)V

    goto :goto_0

    .line 491
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->e(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 492
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    goto :goto_0

    .line 494
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 495
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 501
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-nez v0, :cond_1

    .line 509
    :cond_0
    :goto_0
    return-void

    .line 505
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->j(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 506
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 507
    iget-object v0, p0, Lcom/facebook/orca/chatheads/k;->a:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    goto :goto_0
.end method
