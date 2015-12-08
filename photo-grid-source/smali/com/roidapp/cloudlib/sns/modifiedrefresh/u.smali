.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;II)V
    .locals 0

    .prologue
    .line 626
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->a:I

    iput p3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->b:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    .prologue
    .line 629
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->a:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->b:I

    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;->a:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 632
    return-void
.end method
