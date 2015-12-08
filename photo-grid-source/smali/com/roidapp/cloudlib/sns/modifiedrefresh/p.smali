.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;
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
    .line 205
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    .line 216
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->start()V

    .line 220
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->m(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;->h()V

    .line 238
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;I)I

    .line 239
    return-void

    .line 227
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->stop()V

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->p(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V

    goto :goto_0

    .line 234
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;IZ)V

    goto :goto_0
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 212
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 208
    return-void
.end method
