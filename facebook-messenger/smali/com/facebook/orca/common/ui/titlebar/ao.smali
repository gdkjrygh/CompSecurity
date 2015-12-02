.class Lcom/facebook/orca/common/ui/titlebar/ao;
.super Lcom/facebook/n/b;
.source "TitleBarDivebarButtonOverlay.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ac;

.field private final b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ac;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 456
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    .line 457
    iput-object p2, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->b:Landroid/view/View;

    .line 458
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 462
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 463
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setViewCachingEnabled(Z)V

    .line 464
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 468
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    .line 469
    cmpg-float v2, v1, v0

    if-gez v2, :cond_0

    .line 471
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 473
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->b:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 474
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->b:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 475
    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 479
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->h(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    .line 480
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->i(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 481
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->j(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 485
    :cond_0
    :goto_0
    return-void

    .line 482
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->k(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ao;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->l(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    goto :goto_0
.end method
