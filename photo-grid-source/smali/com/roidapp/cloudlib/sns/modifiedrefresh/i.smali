.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;
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
    .line 1289
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .prologue
    .line 1297
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->r(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    .line 1300
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1304
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1293
    return-void
.end method
