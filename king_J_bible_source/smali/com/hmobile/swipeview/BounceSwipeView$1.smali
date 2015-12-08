.class Lcom/hmobile/swipeview/BounceSwipeView$1;
.super Landroid/os/Handler;
.source "BounceSwipeView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/swipeview/BounceSwipeView;->initBounceSwipeView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/swipeview/BounceSwipeView;


# direct methods
.method constructor <init>(Lcom/hmobile/swipeview/BounceSwipeView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    .line 61
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 65
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I
    invoke-static {v1}, Lcom/hmobile/swipeview/BounceSwipeView;->access$12(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingStartValue:I
    invoke-static {v2}, Lcom/hmobile/swipeview/BounceSwipeView;->access$13(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingChange:I
    invoke-static {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$14(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v1, v2, v3, v4}, Lcom/hmobile/swipeview/AnimationUtil;->quadraticOutEase(FFFF)I

    move-result v0

    .line 67
    .local v0, "newPadding":I
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z
    invoke-static {v1}, Lcom/hmobile/swipeview/BounceSwipeView;->access$15(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 69
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v2}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v4

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {v1, v0, v2, v3, v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    .line 76
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I
    invoke-static {v1}, Lcom/hmobile/swipeview/BounceSwipeView;->access$12(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lcom/hmobile/swipeview/BounceSwipeView;->access$16(Lcom/hmobile/swipeview/BounceSwipeView;I)V

    .line 77
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I
    invoke-static {v1}, Lcom/hmobile/swipeview/BounceSwipeView;->access$12(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v1

    const/4 v2, 0x4

    if-gt v1, v2, :cond_1

    .line 79
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v1, v1, Lcom/hmobile/swipeview/BounceSwipeView;->mEaseAnimationFrameHandler:Landroid/os/Handler;

    const/4 v2, 0x0

    const-wide/16 v4, 0x1e

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 81
    :cond_1
    return-void

    .line 71
    :cond_2
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z
    invoke-static {v1}, Lcom/hmobile/swipeview/BounceSwipeView;->access$15(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    iget-object v1, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v2}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v2

    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$1;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v4

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {v1, v2, v3, v0, v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    goto :goto_0
.end method
