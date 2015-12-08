.class Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;
.super Ljava/lang/Object;
.source "SwipeView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/swipeview/SwipeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SwipeOnTouchListener"
.end annotation


# instance fields
.field private mDistanceX:I

.field private mFirstMotionEvent:Z

.field private mPreviousDirection:I

.field private mSendingDummyMotionEvent:Z

.field final synthetic this$0:Lcom/hmobile/swipeview/SwipeView;


# direct methods
.method private constructor <init>(Lcom/hmobile/swipeview/SwipeView;)V
    .locals 1

    .prologue
    .line 447
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mSendingDummyMotionEvent:Z

    .line 451
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mFirstMotionEvent:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/hmobile/swipeview/SwipeView;Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;)V
    .locals 0

    .prologue
    .line 447
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;-><init>(Lcom/hmobile/swipeview/SwipeView;)V

    return-void
.end method

.method private actionDown(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v2, 0x0

    .line 520
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v0, v1}, Lcom/hmobile/swipeview/SwipeView;->access$2(Lcom/hmobile/swipeview/SwipeView;I)V

    .line 521
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v0, v1}, Lcom/hmobile/swipeview/SwipeView;->access$3(Lcom/hmobile/swipeview/SwipeView;I)V

    .line 522
    iput-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mFirstMotionEvent:Z

    .line 523
    return v2
.end method

.method private actionMove(Landroid/view/MotionEvent;)Z
    .locals 19
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 527
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$4(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    sub-int v17, v2, v3

    .line 530
    .local v17, "newDistance":I
    if-gez v17, :cond_1

    .line 532
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    add-int/lit8 v2, v2, 0x4

    move/from16 v0, v17

    if-gt v2, v0, :cond_0

    const/16 v16, 0x1

    .line 552
    .local v16, "newDirection":I
    :goto_0
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mPreviousDirection:I

    move/from16 v0, v16

    if-eq v0, v2, :cond_3

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mFirstMotionEvent:Z

    if-nez v2, :cond_3

    .line 559
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-static {v2, v3}, Lcom/hmobile/swipeview/SwipeView;->access$2(Lcom/hmobile/swipeview/SwipeView;I)V

    .line 560
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$4(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    sub-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    .line 565
    :goto_1
    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mPreviousDirection:I

    .line 567
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$1(Lcom/hmobile/swipeview/SwipeView;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 573
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mSendingDummyMotionEvent:Z

    .line 574
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    move-object/from16 v18, v0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    .line 575
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/4 v6, 0x0

    .line 576
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I
    invoke-static {v7}, Lcom/hmobile/swipeview/SwipeView;->access$4(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v7

    int-to-float v7, v7

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mMotionStartY:I
    invoke-static {v8}, Lcom/hmobile/swipeview/SwipeView;->access$5(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPressure()F

    move-result v9

    .line 577
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSize()F

    move-result v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v11

    .line 578
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v13

    .line 579
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v15

    .line 574
    invoke-static/range {v2 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/hmobile/swipeview/SwipeView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 580
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/hmobile/swipeview/SwipeView;->access$6(Lcom/hmobile/swipeview/SwipeView;Z)V

    .line 582
    const/4 v2, 0x1

    .line 584
    :goto_2
    return v2

    .line 532
    .end local v16    # "newDirection":I
    :cond_0
    const/16 v16, -0x1

    goto/16 :goto_0

    .line 542
    :cond_1
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    add-int/lit8 v2, v2, -0x4

    move/from16 v0, v17

    if-gt v2, v0, :cond_2

    const/16 v16, 0x1

    .restart local v16    # "newDirection":I
    :goto_3
    goto/16 :goto_0

    .end local v16    # "newDirection":I
    :cond_2
    const/16 v16, -0x1

    goto :goto_3

    .line 562
    .restart local v16    # "newDirection":I
    :cond_3
    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    goto :goto_1

    .line 584
    :cond_4
    const/4 v2, 0x0

    goto :goto_2
.end method

.method private actionUp(Landroid/view/MotionEvent;)Z
    .locals 9
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-virtual {v4}, Lcom/hmobile/swipeview/SwipeView;->getScrollX()I

    move-result v4

    int-to-float v2, v4

    .line 589
    .local v2, "fingerUpPosition":F
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$7(Lcom/hmobile/swipeview/SwipeView;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    div-int/2addr v4, v5

    int-to-float v3, v4

    .line 590
    .local v3, "numberOfPages":F
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v4

    int-to-float v4, v4

    div-float v1, v2, v4

    .line 591
    .local v1, "fingerUpPage":F
    const/4 v0, 0x0

    .line 593
    .local v0, "edgePosition":F
    iget v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mPreviousDirection:I

    if-ne v4, v8, :cond_3

    .line 595
    iget v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    # getter for: Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I
    invoke-static {}, Lcom/hmobile/swipeview/SwipeView;->access$9()I

    move-result v5

    if-le v4, v5, :cond_1

    .line 598
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v4

    int-to-float v4, v4

    sub-float v5, v3, v6

    cmpg-float v4, v4, v5

    if-gez v4, :cond_0

    .line 604
    add-float v4, v1, v6

    float-to-int v4, v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 646
    :goto_0
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    float-to-int v5, v0

    iget-object v6, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v6}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v6

    div-int/2addr v5, v6

    invoke-virtual {v4, v5}, Lcom/hmobile/swipeview/SwipeView;->smoothScrollToPage(I)V

    .line 647
    iput-boolean v8, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mFirstMotionEvent:Z

    .line 648
    iput v7, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    .line 649
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-static {v4, v7}, Lcom/hmobile/swipeview/SwipeView;->access$11(Lcom/hmobile/swipeview/SwipeView;Z)V

    .line 650
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    invoke-static {v4, v7}, Lcom/hmobile/swipeview/SwipeView;->access$12(Lcom/hmobile/swipeview/SwipeView;Z)V

    .line 652
    return v8

    .line 606
    :cond_0
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 608
    goto :goto_0

    .line 610
    :cond_1
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v4, v4

    sub-float v5, v3, v6

    cmpl-float v4, v4, v5

    if-nez v4, :cond_2

    .line 617
    add-float v4, v1, v6

    float-to-int v4, v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 618
    goto :goto_0

    .line 620
    :cond_2
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 624
    goto :goto_0

    .line 626
    :cond_3
    iget v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mDistanceX:I

    # getter for: Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I
    invoke-static {}, Lcom/hmobile/swipeview/SwipeView;->access$9()I

    move-result v5

    neg-int v5, v5

    if-ge v4, v5, :cond_4

    .line 628
    float-to-int v4, v1

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 629
    goto :goto_0

    .line 631
    :cond_4
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v4

    if-nez v4, :cond_5

    .line 637
    float-to-int v4, v1

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    .line 638
    goto :goto_0

    .line 640
    :cond_5
    iget-object v4, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I
    invoke-static {v4}, Lcom/hmobile/swipeview/SwipeView;->access$10(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v4

    iget-object v5, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I
    invoke-static {v5}, Lcom/hmobile/swipeview/SwipeView;->access$8(Lcom/hmobile/swipeview/SwipeView;)I

    move-result v5

    mul-int/2addr v4, v5

    int-to-float v0, v4

    goto/16 :goto_0
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 454
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$0(Lcom/hmobile/swipeview/SwipeView;)Landroid/view/View$OnTouchListener;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$1(Lcom/hmobile/swipeview/SwipeView;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 455
    :cond_0
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$0(Lcom/hmobile/swipeview/SwipeView;)Landroid/view/View$OnTouchListener;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mSendingDummyMotionEvent:Z

    if-eqz v2, :cond_3

    .line 474
    :cond_1
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->this$0:Lcom/hmobile/swipeview/SwipeView;

    # getter for: Lcom/hmobile/swipeview/SwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v2}, Lcom/hmobile/swipeview/SwipeView;->access$0(Lcom/hmobile/swipeview/SwipeView;)Landroid/view/View$OnTouchListener;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 475
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 490
    invoke-direct {p0, p2}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->actionUp(Landroid/view/MotionEvent;)Z

    .line 516
    :cond_2
    :goto_0
    return v0

    .line 496
    :cond_3
    iget-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mSendingDummyMotionEvent:Z

    if-eqz v0, :cond_4

    .line 502
    iput-boolean v1, p0, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->mSendingDummyMotionEvent:Z

    move v0, v1

    .line 503
    goto :goto_0

    .line 506
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 516
    goto :goto_0

    .line 508
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->actionDown(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 511
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->actionMove(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 514
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;->actionUp(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 506
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
