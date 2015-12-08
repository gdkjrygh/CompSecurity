.class public Lcom/hmobile/swipeview/SwipeView;
.super Landroid/widget/HorizontalScrollView;
.source "SwipeView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;,
        Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;
    }
.end annotation


# static fields
.field private static DEFAULT_SWIPE_THRESHOLD:I


# instance fields
.field private SCREEN_WIDTH:I

.field protected mCallScrollToPageInOnLayout:Z

.field private mContext:Landroid/content/Context;

.field private mCurrentPage:I

.field private mJustInterceptedAndIgnored:Z

.field private mLinearLayout:Landroid/widget/LinearLayout;

.field private mMostlyScrollingInX:Z

.field private mMostlyScrollingInY:Z

.field private mMotionStartX:I

.field private mMotionStartY:I

.field private mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

.field private mOnTouchListener:Landroid/view/View$OnTouchListener;

.field private mPageControl:Lcom/hmobile/swipeview/PageControl;

.field private mPageWidth:I

.field private mSwipeOnTouchListener:Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const/16 v0, 0x3c

    sput v0, Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 47
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    .line 48
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    .line 49
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    .line 50
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    .line 51
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 52
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    .line 53
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .line 56
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    .line 63
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mContext:Landroid/content/Context;

    .line 65
    invoke-direct {p0}, Lcom/hmobile/swipeview/SwipeView;->initSwipeView()V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    .line 48
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    .line 49
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    .line 50
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    .line 51
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 52
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    .line 53
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .line 56
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    .line 73
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mContext:Landroid/content/Context;

    .line 74
    invoke-direct {p0}, Lcom/hmobile/swipeview/SwipeView;->initSwipeView()V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 81
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    .line 48
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    .line 49
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    .line 50
    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    .line 51
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 52
    iput v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    .line 53
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .line 56
    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    .line 82
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mContext:Landroid/content/Context;

    .line 83
    invoke-direct {p0}, Lcom/hmobile/swipeview/SwipeView;->initSwipeView()V

    .line 84
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/swipeview/SwipeView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/swipeview/SwipeView;)Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    return v0
.end method

.method static synthetic access$10(Lcom/hmobile/swipeview/SwipeView;)I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    return v0
.end method

.method static synthetic access$11(Lcom/hmobile/swipeview/SwipeView;Z)V
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    return-void
.end method

.method static synthetic access$12(Lcom/hmobile/swipeview/SwipeView;Z)V
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/swipeview/SwipeView;I)V
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I

    return-void
.end method

.method static synthetic access$3(Lcom/hmobile/swipeview/SwipeView;I)V
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartY:I

    return-void
.end method

.method static synthetic access$4(Lcom/hmobile/swipeview/SwipeView;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I

    return v0
.end method

.method static synthetic access$5(Lcom/hmobile/swipeview/SwipeView;)I
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartY:I

    return v0
.end method

.method static synthetic access$6(Lcom/hmobile/swipeview/SwipeView;Z)V
    .locals 0

    .prologue
    .line 49
    iput-boolean p1, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    return-void
.end method

.method static synthetic access$7(Lcom/hmobile/swipeview/SwipeView;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$8(Lcom/hmobile/swipeview/SwipeView;)I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    return v0
.end method

.method static synthetic access$9()I
    .locals 1

    .prologue
    .line 40
    sget v0, Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I

    return v0
.end method

.method private detectMostlyScrollingDirection(Landroid/view/MotionEvent;)V
    .locals 6
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v5, 0x1

    const/high16 v4, 0x40a00000    # 5.0f

    .line 432
    iget-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    if-nez v2, :cond_0

    .line 436
    iget v2, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 437
    .local v0, "xDistance":F
    iget v2, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartY:I

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 439
    .local v1, "yDistance":F
    add-float v2, v0, v4

    cmpl-float v2, v1, v2

    if-lez v2, :cond_1

    .line 440
    iput-boolean v5, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    .line 445
    .end local v0    # "xDistance":F
    .end local v1    # "yDistance":F
    :cond_0
    :goto_0
    return-void

    .line 441
    .restart local v0    # "xDistance":F
    .restart local v1    # "yDistance":F
    :cond_1
    add-float v2, v1, v4

    cmpl-float v2, v0, v2

    if-lez v2, :cond_0

    .line 442
    iput-boolean v5, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    goto :goto_0
.end method

.method private initSwipeView()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    .line 87
    const-string v1, "uk.co.jasonfry.android.tools.ui.SwipeView"

    .line 88
    const-string v2, "Initialising SwipeView"

    .line 87
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    .line 90
    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 91
    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 92
    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 91
    invoke-super {p0, v1, v4, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 94
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/hmobile/swipeview/SwipeView;->setSmoothScrollingEnabled(Z)V

    .line 95
    invoke-virtual {p0, v3}, Lcom/hmobile/swipeview/SwipeView;->setHorizontalFadingEdgeEnabled(Z)V

    .line 96
    invoke-virtual {p0, v3}, Lcom/hmobile/swipeview/SwipeView;->setHorizontalScrollBarEnabled(Z)V

    .line 98
    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mContext:Landroid/content/Context;

    .line 99
    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 98
    check-cast v1, Landroid/view/WindowManager;

    .line 99
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 100
    .local v0, "display":Landroid/view/Display;
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/hmobile/swipeview/SwipeView;->SCREEN_WIDTH:I

    .line 101
    iget v1, p0, Lcom/hmobile/swipeview/SwipeView;->SCREEN_WIDTH:I

    iput v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    .line 102
    iput v3, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 104
    new-instance v1, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;-><init>(Lcom/hmobile/swipeview/SwipeView;Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;)V

    iput-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mSwipeOnTouchListener:Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;

    .line 105
    iget-object v1, p0, Lcom/hmobile/swipeview/SwipeView;->mSwipeOnTouchListener:Lcom/hmobile/swipeview/SwipeView$SwipeOnTouchListener;

    invoke-super {p0, v1}, Landroid/widget/HorizontalScrollView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 106
    return-void
.end method

.method private scrollToPage(IZ)V
    .locals 3
    .param p1, "page"    # I
    .param p2, "smooth"    # Z

    .prologue
    const/4 v1, 0x0

    .line 269
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 270
    .local v0, "oldPage":I
    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->getPageCount()I

    move-result v2

    if-lt p1, v2, :cond_3

    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->getPageCount()I

    move-result v2

    if-lez v2, :cond_3

    .line 271
    add-int/lit8 p1, p1, -0x1

    .line 276
    :cond_0
    :goto_0
    if-eqz p2, :cond_4

    .line 277
    iget v2, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    mul-int/2addr v2, p1

    invoke-virtual {p0, v2, v1}, Lcom/hmobile/swipeview/SwipeView;->smoothScrollTo(II)V

    .line 281
    :goto_1
    iput p1, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 283
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    if-eqz v2, :cond_1

    if-eq v0, p1, :cond_1

    .line 284
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    invoke-interface {v2, v0, p1}, Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;->onPageChanged(II)V

    .line 286
    :cond_1
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    if-eqz v2, :cond_2

    if-eq v0, p1, :cond_2

    .line 287
    iget-object v2, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    invoke-virtual {v2, p1}, Lcom/hmobile/swipeview/PageControl;->setCurrentPage(I)V

    .line 290
    :cond_2
    iget-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    if-eqz v2, :cond_5

    :goto_2
    iput-boolean v1, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    .line 291
    return-void

    .line 272
    :cond_3
    if-gez p1, :cond_0

    .line 273
    const/4 p1, 0x0

    goto :goto_0

    .line 279
    :cond_4
    iget v2, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    mul-int/2addr v2, p1

    invoke-virtual {p0, v2, v1}, Lcom/hmobile/swipeview/SwipeView;->scrollTo(II)V

    goto :goto_1

    .line 290
    :cond_5
    const/4 v1, 0x1

    goto :goto_2
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 1
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 135
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lcom/hmobile/swipeview/SwipeView;->addView(Landroid/view/View;I)V

    .line 136
    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 3
    .param p1, "child"    # Landroid/view/View;
    .param p2, "index"    # I

    .prologue
    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-nez v1, :cond_0

    .line 145
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 150
    .local v0, "params":Landroid/view/ViewGroup$LayoutParams;
    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/hmobile/swipeview/SwipeView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 151
    return-void

    .line 147
    .end local v0    # "params":Landroid/view/ViewGroup$LayoutParams;
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 148
    .restart local v0    # "params":Landroid/view/ViewGroup$LayoutParams;
    iget v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1, "child"    # Landroid/view/View;
    .param p2, "index"    # I
    .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 167
    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->requestLayout()V

    .line 168
    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->invalidate()V

    .line 169
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 170
    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .param p1, "child"    # Landroid/view/View;
    .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 159
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Lcom/hmobile/swipeview/SwipeView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 160
    return-void
.end method

.method public calculatePageSize(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 2
    .param p1, "childLayoutParams"    # Landroid/view/ViewGroup$MarginLayoutParams;

    .prologue
    .line 321
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 322
    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    add-int/2addr v0, v1

    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    .line 321
    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/SwipeView;->setPageWidth(I)I

    move-result v0

    return v0
.end method

.method public getChildContainer()Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public getCurrentPage()I
    .locals 1

    .prologue
    .line 232
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    return v0
.end method

.method public getOnPageChangedListener()Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;
    .locals 1

    .prologue
    .line 402
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    return-object v0
.end method

.method public getPageControl()Lcom/hmobile/swipeview/PageControl;
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    return-object v0
.end method

.method public getPageCount()I
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/hmobile/swipeview/SwipeView;->mLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getPageWidth()I
    .locals 1

    .prologue
    .line 331
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    return v0
.end method

.method public getSwipeThreshold()I
    .locals 1

    .prologue
    .line 212
    sget v0, Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 407
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 409
    .local v0, "result":Z
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_2

    .line 410
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartX:I

    .line 411
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/hmobile/swipeview/SwipeView;->mMotionStartY:I

    .line 412
    iget-boolean v3, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    if-nez v3, :cond_0

    .line 413
    iput-boolean v1, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    .line 414
    iput-boolean v1, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    .line 420
    :cond_0
    :goto_0
    iget-boolean v3, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInY:Z

    if-eqz v3, :cond_3

    move v0, v1

    .line 428
    .end local v0    # "result":Z
    :cond_1
    :goto_1
    return v0

    .line 416
    .restart local v0    # "result":Z
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 417
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/SwipeView;->detectMostlyScrollingDirection(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 423
    :cond_3
    iget-boolean v1, p0, Lcom/hmobile/swipeview/SwipeView;->mMostlyScrollingInX:Z

    if-eqz v1, :cond_1

    .line 424
    iput-boolean v2, p0, Lcom/hmobile/swipeview/SwipeView;->mJustInterceptedAndIgnored:Z

    move v0, v2

    .line 425
    goto :goto_1
.end method

.method protected onLayout(ZIIII)V
    .locals 1
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .prologue
    .line 177
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 178
    iget-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    if-eqz v0, :cond_0

    .line 179
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    invoke-virtual {p0, v0}, Lcom/hmobile/swipeview/SwipeView;->scrollToPage(I)V

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCallScrollToPageInOnLayout:Z

    .line 182
    :cond_0
    return-void
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1
    .param p1, "direction"    # I
    .param p2, "previouslyFocusedRect"    # Landroid/graphics/Rect;

    .prologue
    .line 120
    const/4 v0, 0x0

    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 113
    const/4 v0, 0x1

    return v0
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .param p1, "child"    # Landroid/view/View;
    .param p2, "focused"    # Landroid/view/View;

    .prologue
    .line 127
    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->requestFocus()Z

    .line 128
    return-void
.end method

.method public scrollToPage(I)V
    .locals 1
    .param p1, "page"    # I

    .prologue
    .line 255
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/hmobile/swipeview/SwipeView;->scrollToPage(IZ)V

    .line 256
    return-void
.end method

.method public setCurrentPage(I)V
    .locals 0
    .param p1, "page"    # I

    .prologue
    .line 236
    iput p1, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    .line 237
    return-void
.end method

.method public setOnPageChangedListener(Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;)V
    .locals 0
    .param p1, "onPageChangedListener"    # Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .prologue
    .line 393
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mOnPageChangedListener:Lcom/hmobile/swipeview/SwipeView$OnPageChangedListener;

    .line 394
    return-void
.end method

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0
    .param p1, "onTouchListener"    # Landroid/view/View$OnTouchListener;

    .prologue
    .line 189
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;

    .line 190
    return-void
.end method

.method public setPageControl(Lcom/hmobile/swipeview/PageControl;)V
    .locals 1
    .param p1, "pageControl"    # Lcom/hmobile/swipeview/PageControl;

    .prologue
    .line 342
    iput-object p1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageControl:Lcom/hmobile/swipeview/PageControl;

    .line 344
    invoke-virtual {p0}, Lcom/hmobile/swipeview/SwipeView;->getPageCount()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/hmobile/swipeview/PageControl;->setPageCount(I)V

    .line 345
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->mCurrentPage:I

    invoke-virtual {p1, v0}, Lcom/hmobile/swipeview/PageControl;->setCurrentPage(I)V

    .line 347
    new-instance v0, Lcom/hmobile/swipeview/SwipeView$1;

    invoke-direct {v0, p0}, Lcom/hmobile/swipeview/SwipeView$1;-><init>(Lcom/hmobile/swipeview/SwipeView;)V

    invoke-virtual {p1, v0}, Lcom/hmobile/swipeview/PageControl;->setOnPageControlClickListener(Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;)V

    .line 356
    return-void
.end method

.method public setPageWidth(I)I
    .locals 2
    .param p1, "pageWidth"    # I

    .prologue
    .line 304
    iput p1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    .line 305
    iget v0, p0, Lcom/hmobile/swipeview/SwipeView;->SCREEN_WIDTH:I

    iget v1, p0, Lcom/hmobile/swipeview/SwipeView;->mPageWidth:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public setSwipeThreshold(I)V
    .locals 0
    .param p1, "swipeThreshold"    # I

    .prologue
    .line 223
    sput p1, Lcom/hmobile/swipeview/SwipeView;->DEFAULT_SWIPE_THRESHOLD:I

    .line 224
    return-void
.end method

.method public smoothScrollToPage(I)V
    .locals 1
    .param p1, "page"    # I

    .prologue
    .line 265
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/hmobile/swipeview/SwipeView;->scrollToPage(IZ)V

    .line 266
    return-void
.end method
