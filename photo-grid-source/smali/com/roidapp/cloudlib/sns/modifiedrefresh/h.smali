.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->start()V

    .line 183
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;->onRefresh()V

    .line 201
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;I)I

    .line 202
    return-void

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->stop()V

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->g(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V

    goto :goto_0

    .line 197
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;IZ)V

    goto :goto_0
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 175
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 171
    return-void
.end method
