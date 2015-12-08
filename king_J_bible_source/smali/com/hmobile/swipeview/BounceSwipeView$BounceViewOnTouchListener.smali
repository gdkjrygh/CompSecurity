.class Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;
.super Ljava/lang/Object;
.source "BounceSwipeView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/swipeview/BounceSwipeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BounceViewOnTouchListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/swipeview/BounceSwipeView;


# direct methods
.method private constructor <init>(Lcom/hmobile/swipeview/BounceSwipeView;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/hmobile/swipeview/BounceSwipeView;Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;-><init>(Lcom/hmobile/swipeview/BounceSwipeView;)V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "view"    # Landroid/view/View;
    .param p2, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 113
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$0(Lcom/hmobile/swipeview/BounceSwipeView;)Landroid/view/View$OnTouchListener;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$0(Lcom/hmobile/swipeview/BounceSwipeView;)Landroid/view/View$OnTouchListener;

    move-result-object v4

    invoke-interface {v4, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 173
    :goto_0
    return v2

    .line 118
    :cond_0
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$1(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 120
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :cond_1
    :goto_1
    move v2, v3

    .line 173
    goto :goto_0

    .line 123
    :pswitch_0
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getPageCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getPageWidth()I

    move-result v5

    mul-int/2addr v4, v5

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getPageWidth()I

    move-result v5

    rem-int/lit8 v5, v5, 0x2

    sub-int v0, v4, v5

    .line 124
    .local v0, "maxScrollAmount":I
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollX()I

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$2(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollX()I

    move-result v4

    if-ne v4, v0, :cond_4

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$2(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 126
    :cond_3
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v4, v2}, Lcom/hmobile/swipeview/BounceSwipeView;->access$3(Lcom/hmobile/swipeview/BounceSwipeView;Z)V

    .line 127
    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-static {v2, v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$4(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    .line 128
    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-static {v2, v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$5(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    goto :goto_1

    .line 130
    :cond_4
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollX()I

    move-result v4

    if-nez v4, :cond_5

    .line 132
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-static {v3, v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$5(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    .line 133
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v3, v2}, Lcom/hmobile/swipeview/BounceSwipeView;->access$6(Lcom/hmobile/swipeview/BounceSwipeView;Z)V

    .line 134
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgePreviousPosition:F
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$7(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgeStartPosition:F
    invoke-static {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->access$8(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v5

    sub-float/2addr v4, v5

    float-to-int v4, v4

    div-int/lit8 v4, v4, 0x2

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v5

    iget-object v6, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v6}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v6

    iget-object v7, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v7}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v7

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {v3, v4, v5, v6, v7}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    goto/16 :goto_0

    .line 137
    :cond_5
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollX()I

    move-result v4

    if-lt v4, v0, :cond_7

    .line 139
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-static {v4, v5}, Lcom/hmobile/swipeview/BounceSwipeView;->access$5(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    .line 140
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v4, v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$6(Lcom/hmobile/swipeview/BounceSwipeView;Z)V

    .line 142
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgeStartPosition:F
    invoke-static {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$8(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v3

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgePreviousPosition:F
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$7(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v4

    sub-float/2addr v3, v4

    float-to-int v3, v3

    div-int/lit8 v1, v3, 0x2

    .line 143
    .local v1, "newRightPadding":I
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingRight:I
    invoke-static {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$10(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v3

    if-lt v1, v3, :cond_6

    .line 145
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v5

    iget-object v6, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v6}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v6

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {v3, v4, v5, v1, v6}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    .line 152
    :goto_2
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    int-to-float v4, v0

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgeStartPosition:F
    invoke-static {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->access$8(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v5

    iget-object v6, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgePreviousPosition:F
    invoke-static {v6}, Lcom/hmobile/swipeview/BounceSwipeView;->access$7(Lcom/hmobile/swipeview/BounceSwipeView;)F

    move-result v6

    sub-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    float-to-int v4, v4

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollY()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/hmobile/swipeview/BounceSwipeView;->scrollTo(II)V

    goto/16 :goto_0

    .line 149
    :cond_6
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v5}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v5

    iget-object v6, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingRight:I
    invoke-static {v6}, Lcom/hmobile/swipeview/BounceSwipeView;->access$10(Lcom/hmobile/swipeview/BounceSwipeView;)I

    move-result v6

    iget-object v7, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-virtual {v7}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v7

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {v3, v4, v5, v6, v7}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    goto :goto_2

    .line 157
    .end local v1    # "newRightPadding":I
    :cond_7
    iget-object v2, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v2, v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$3(Lcom/hmobile/swipeview/BounceSwipeView;Z)V

    goto/16 :goto_1

    .line 162
    .end local v0    # "maxScrollAmount":I
    :pswitch_1
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # getter for: Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z
    invoke-static {v4}, Lcom/hmobile/swipeview/BounceSwipeView;->access$2(Lcom/hmobile/swipeview/BounceSwipeView;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 164
    iget-object v4, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v4, v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$3(Lcom/hmobile/swipeview/BounceSwipeView;Z)V

    .line 165
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v3, v5}, Lcom/hmobile/swipeview/BounceSwipeView;->access$5(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    .line 166
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    invoke-static {v3, v5}, Lcom/hmobile/swipeview/BounceSwipeView;->access$4(Lcom/hmobile/swipeview/BounceSwipeView;F)V

    .line 167
    iget-object v3, p0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;->this$0:Lcom/hmobile/swipeview/BounceSwipeView;

    # invokes: Lcom/hmobile/swipeview/BounceSwipeView;->doBounceBackEaseAnimation()V
    invoke-static {v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$11(Lcom/hmobile/swipeview/BounceSwipeView;)V

    goto/16 :goto_0

    .line 120
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
