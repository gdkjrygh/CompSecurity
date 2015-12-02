.class Lcom/facebook/orca/common/ui/titlebar/an;
.super Lcom/facebook/n/b;
.source "TitleBarDivebarButtonOverlay.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ac;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 488
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ac;Lcom/facebook/orca/common/ui/titlebar/ad;)V
    .locals 0

    .prologue
    .line 488
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/an;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 491
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setViewCachingEnabled(Z)V

    .line 492
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    .line 496
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    .line 497
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/high16 v2, 0x42b40000    # 90.0f

    mul-float/2addr v2, v0

    invoke-static {v1, v2}, Lcom/a/c/a;->d(Landroid/view/View;F)V

    .line 498
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {v1, v2}, Lcom/a/c/a;->g(Landroid/view/View;F)V

    .line 501
    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->m(Lcom/facebook/orca/common/ui/titlebar/ac;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 502
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/orca/common/ui/titlebar/ac;Z)Z

    .line 503
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->n(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    .line 505
    :cond_0
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 509
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/an;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->o(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 510
    return-void
.end method
