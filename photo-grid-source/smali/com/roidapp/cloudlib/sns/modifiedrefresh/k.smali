.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 0

    .prologue
    .line 1408
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .prologue
    .line 1413
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1414
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    neg-int v0, v0

    .line 1419
    :goto_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v0, v1

    .line 1420
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 1421
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;IZ)V

    .line 1422
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(F)V

    .line 1423
    return-void

    .line 1416
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F

    move-result v0

    float-to-int v0, v0

    neg-int v0, v0

    goto :goto_0
.end method
