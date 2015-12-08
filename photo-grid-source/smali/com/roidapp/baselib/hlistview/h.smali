.class final Lcom/roidapp/baselib/hlistview/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/g;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/g;)V
    .locals 0

    .prologue
    .line 3681
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 3685
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d(Lcom/roidapp/baselib/hlistview/AbsHListView;)I

    move-result v0

    .line 3686
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v1, v1, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->e(Lcom/roidapp/baselib/hlistview/AbsHListView;)Landroid/view/VelocityTracker;

    move-result-object v1

    .line 3687
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/g;->a(Lcom/roidapp/baselib/hlistview/g;)Lcom/roidapp/baselib/hlistview/ad;

    move-result-object v2

    .line 3688
    if-eqz v1, :cond_0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    .line 3703
    :cond_0
    :goto_0
    return-void

    .line 3692
    :cond_1
    const/16 v3, 0x3e8

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v4, v4, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->f(Lcom/roidapp/baselib/hlistview/AbsHListView;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 3693
    invoke-virtual {v1, v0}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    neg-float v0, v0

    .line 3695
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v3, v3, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->g(Lcom/roidapp/baselib/hlistview/AbsHListView;)I

    move-result v3

    int-to-float v3, v3

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_2

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/hlistview/ad;->a(F)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3697
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const-wide/16 v2, 0x28

    invoke-virtual {v0, p0, v2, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 3699
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 3700
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x3

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3701
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/h;->a:Lcom/roidapp/baselib/hlistview/g;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    goto :goto_0
.end method
