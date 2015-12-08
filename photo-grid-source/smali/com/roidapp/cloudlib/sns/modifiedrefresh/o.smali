.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 0

    .prologue
    .line 1487
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .prologue
    .line 1490
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F

    move-result v1

    neg-float v1, v1

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    .line 1491
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V

    .line 1492
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V

    .line 1493
    return-void
.end method
