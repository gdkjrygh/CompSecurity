.class public Lcom/facebook/analytics/bx;
.super Lcom/facebook/base/activity/a;
.source "DefaultAnalyticsLogger.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/bt;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 731
    iput-object p1, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 735
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    check-cast p1, Lcom/facebook/base/activity/h;

    invoke-static {v0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V

    .line 736
    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/content/res/Configuration;)V
    .locals 3

    .prologue
    .line 763
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    iget-object v1, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;)Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;IZ)V

    .line 764
    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 768
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-virtual {v0}, Lcom/facebook/analytics/bt;->d()V

    .line 769
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 740
    iget-object v1, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    move-object v0, p1

    check-cast v0, Lcom/facebook/base/activity/h;

    invoke-static {v1, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V

    .line 741
    instance-of v0, p1, Lcom/facebook/analytics/ci;

    if-nez v0, :cond_0

    .line 742
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Ljava/lang/String;)Ljava/lang/String;

    .line 744
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-static {v0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Landroid/content/Context;)V

    .line 745
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;Landroid/content/Context;)V

    .line 746
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    iget-object v1, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;)Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;IZ)V

    .line 747
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 751
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    sget-object v1, Lcom/facebook/analytics/h/e;->BACKGROUNDED:Lcom/facebook/analytics/h/e;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/h/e;Z)V

    .line 753
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    check-cast p1, Lcom/facebook/base/activity/h;

    invoke-static {v0, p1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V

    .line 754
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 758
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    check-cast p1, Lcom/facebook/base/activity/h;

    invoke-static {v0, p1}, Lcom/facebook/analytics/bt;->d(Lcom/facebook/analytics/bt;Lcom/facebook/base/activity/h;)V

    .line 759
    return-void
.end method

.method public e(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 773
    iget-object v0, p0, Lcom/facebook/analytics/bx;->a:Lcom/facebook/analytics/bt;

    invoke-virtual {v0}, Lcom/facebook/analytics/bt;->d()V

    .line 774
    return-void
.end method
