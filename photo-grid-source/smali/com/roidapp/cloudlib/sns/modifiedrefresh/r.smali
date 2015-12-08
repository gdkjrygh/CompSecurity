.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/r;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 0

    .prologue
    .line 554
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/r;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .prologue
    .line 557
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/r;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V

    .line 558
    return-void
.end method
