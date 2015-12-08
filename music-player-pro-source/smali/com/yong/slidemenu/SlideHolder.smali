.class public Lcom/yong/slidemenu/SlideHolder;
.super Landroid/widget/FrameLayout;
.source "SlideHolder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yong/slidemenu/SlideHolder$OnSlideListener;,
        Lcom/yong/slidemenu/SlideHolder$SlideAnimation;
    }
.end annotation


# static fields
.field public static final DIRECTION_LEFT:I = 0x1

.field public static final DIRECTION_RIGHT:I = -0x1

.field protected static final MODE_FINISHED:I = 0x2

.field protected static final MODE_READY:I = 0x0

.field protected static final MODE_SLIDE:I = 0x1


# instance fields
.field private mAlwaysOpened:Z

.field private mCachedBitmap:Landroid/graphics/Bitmap;

.field private mCachedCanvas:Landroid/graphics/Canvas;

.field private mCachedPaint:Landroid/graphics/Paint;

.field private mCloseListener:Landroid/view/animation/Animation$AnimationListener;

.field private mCloseOnRelease:Z

.field private mDirection:I

.field private mDispatchWhenOpened:Z

.field private mEnabled:Z

.field private mEndOffset:I

.field private mFrame:B

.field private mHistoricalX:I

.field private mInterceptTouch:Z

.field private mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

.field private mMenuView:Landroid/view/View;

.field private mMode:I

.field private mOffset:I

.field private mOpenListener:Landroid/view/animation/Animation$AnimationListener;

.field private mStartOffset:I

.field private mWhenReady:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 57
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 40
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 41
    iput v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 43
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 47
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    .line 48
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    .line 49
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    .line 50
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    .line 52
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    .line 353
    iput-byte v1, p0, Lcom/yong/slidemenu/SlideHolder;->mFrame:B

    .line 424
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    .line 425
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 608
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$1;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$1;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    .line 638
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$2;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$2;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    .line 59
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initView()V

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 63
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 41
    iput v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 43
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 47
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    .line 48
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    .line 49
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    .line 50
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    .line 52
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    .line 353
    iput-byte v1, p0, Lcom/yong/slidemenu/SlideHolder;->mFrame:B

    .line 424
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    .line 425
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 608
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$1;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$1;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    .line 638
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$2;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$2;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    .line 65
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initView()V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 41
    iput v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 43
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 47
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    .line 48
    iput-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    .line 49
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    .line 50
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    .line 52
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    .line 353
    iput-byte v1, p0, Lcom/yong/slidemenu/SlideHolder;->mFrame:B

    .line 424
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    .line 425
    iput-boolean v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 608
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$1;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$1;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    .line 638
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$2;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$2;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    .line 71
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initView()V

    .line 72
    return-void
.end method

.method static synthetic access$0(Lcom/yong/slidemenu/SlideHolder;)V
    .locals 0

    .prologue
    .line 591
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->completeOpening()V

    return-void
.end method

.method static synthetic access$1(Lcom/yong/slidemenu/SlideHolder;)V
    .locals 0

    .prologue
    .line 621
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->completeClosing()V

    return-void
.end method

.method static synthetic access$2(Lcom/yong/slidemenu/SlideHolder;I)V
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    return-void
.end method

.method static synthetic access$3(Lcom/yong/slidemenu/SlideHolder;I)V
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    return-void
.end method

.method static synthetic access$4(Lcom/yong/slidemenu/SlideHolder;)Landroid/view/View;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    return-object v0
.end method

.method private completeClosing()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 622
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 623
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->requestLayout()V

    .line 625
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$8;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$8;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->post(Ljava/lang/Runnable;)Z

    .line 633
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    if-eqz v0, :cond_0

    .line 634
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    invoke-interface {v0, v1}, Lcom/yong/slidemenu/SlideHolder$OnSlideListener;->onSlideCompleted(Z)V

    .line 636
    :cond_0
    return-void
.end method

.method private completeOpening()V
    .locals 2

    .prologue
    .line 592
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 593
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->requestLayout()V

    .line 595
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$7;

    invoke-direct {v0, p0}, Lcom/yong/slidemenu/SlideHolder$7;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->post(Ljava/lang/Runnable;)Z

    .line 603
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    if-eqz v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/yong/slidemenu/SlideHolder$OnSlideListener;->onSlideCompleted(Z)V

    .line 606
    :cond_0
    return-void
.end method

.method private finishSlide()V
    .locals 4

    .prologue
    .line 652
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v1, v2

    if-lez v1, :cond_3

    .line 653
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-le v1, v2, :cond_1

    .line 654
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v2, v3

    if-le v1, v2, :cond_0

    .line 655
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 657
    :cond_0
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v1, v1

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    int-to-float v2, v2

    invoke-direct {v0, p0, v1, v2}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 658
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 659
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    .line 685
    :goto_0
    return-void

    .line 661
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_1
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    mul-int/2addr v2, v3

    if-ge v1, v2, :cond_2

    .line 662
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 664
    :cond_2
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v1, v1

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    int-to-float v2, v2

    invoke-direct {v0, p0, v1, v2}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 665
    .restart local v0    # "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 666
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 669
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_3
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    mul-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-ge v1, v2, :cond_5

    .line 670
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v2, v3

    if-ge v1, v2, :cond_4

    .line 671
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 673
    :cond_4
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v1, v1

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    int-to-float v2, v2

    invoke-direct {v0, p0, v1, v2}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 674
    .restart local v0    # "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 675
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 677
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_5
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    mul-int/2addr v2, v3

    if-le v1, v2, :cond_6

    .line 678
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 680
    :cond_6
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v1, v1

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    int-to-float v2, v2

    invoke-direct {v0, p0, v1, v2}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 681
    .restart local v0    # "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 682
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method private handleTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v6, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 486
    iget-object v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_1

    .line 487
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPage()I

    move-result v4

    if-eqz v4, :cond_1

    .line 536
    :cond_0
    :goto_0
    return v2

    .line 491
    :cond_1
    iget-boolean v4, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    if-nez v4, :cond_2

    move v2, v3

    .line 492
    goto :goto_0

    .line 495
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 497
    .local v1, "x":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    if-nez v4, :cond_3

    .line 499
    float-to-int v3, v1

    iput v3, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    goto :goto_0

    .line 504
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    if-ne v4, v6, :cond_6

    .line 506
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    int-to-float v4, v4

    sub-float v0, v1, v4

    .line 508
    .local v0, "diff":F
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    int-to-float v4, v4

    mul-float/2addr v4, v0

    const/high16 v5, 0x42480000    # 50.0f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_4

    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-eqz v4, :cond_5

    .line 509
    :cond_4
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    int-to-float v4, v4

    mul-float/2addr v4, v0

    const/high16 v5, -0x3db80000    # -50.0f

    cmpg-float v4, v4, v5

    if-gez v4, :cond_8

    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v4, v6, :cond_8

    .line 510
    :cond_5
    float-to-int v4, v1

    iput v4, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    .line 512
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initSlideMode()V

    .line 526
    .end local v0    # "diff":F
    :cond_6
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    if-ne v4, v2, :cond_a

    .line 527
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v4, v2, :cond_7

    .line 528
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->finishSlide()V

    .line 531
    :cond_7
    iput-boolean v3, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    move v2, v3

    .line 533
    goto :goto_0

    .line 513
    .restart local v0    # "diff":F
    :cond_8
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v4, v2, :cond_9

    .line 514
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v4, v4

    add-float/2addr v4, v0

    float-to-int v4, v4

    iput v4, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 516
    float-to-int v4, v1

    iput v4, p0, Lcom/yong/slidemenu/SlideHolder;->mHistoricalX:I

    .line 518
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->isSlideAllowed()Z

    move-result v4

    if-nez v4, :cond_6

    .line 519
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->finishSlide()V

    goto :goto_1

    :cond_9
    move v2, v3

    .line 522
    goto :goto_0

    .line 536
    .end local v0    # "diff":F
    :cond_a
    iget v4, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-eq v4, v2, :cond_0

    move v2, v3

    goto :goto_0
.end method

.method private initSlideMode()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 549
    iput-boolean v4, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 551
    invoke-virtual {p0, v5}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 553
    .local v0, "v":Landroid/view/View;
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-nez v1, :cond_1

    .line 554
    iput v4, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    .line 555
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    invoke-virtual {p0, v4}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/2addr v1, v2

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    .line 561
    :goto_0
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 563
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 564
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-eq v1, v2, :cond_2

    .line 565
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 566
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 565
    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    .line 567
    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    .line 572
    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 574
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 575
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 577
    iput v5, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 579
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 580
    return-void

    .line 557
    :cond_1
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    invoke-virtual {p0, v4}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/2addr v1, v2

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    .line 558
    iput v4, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    goto :goto_0

    .line 569
    :cond_2
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v4, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1
.end method

.method private initView()V
    .locals 2

    .prologue
    .line 75
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedPaint:Landroid/graphics/Paint;

    .line 77
    return-void
.end method

.method private isReadyForSlide()Z
    .locals 1

    .prologue
    .line 328
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isSlideAllowed()Z
    .locals 3

    .prologue
    .line 583
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v0, v1

    if-lez v0, :cond_0

    .line 584
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 585
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    mul-int/2addr v1, v2

    if-ge v0, v1, :cond_2

    .line 586
    :cond_0
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    if-nez v0, :cond_1

    .line 587
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    mul-int/2addr v1, v2

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 588
    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mStartOffset:I

    mul-int/2addr v1, v2

    .line 583
    if-le v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public close()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 232
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v2, :cond_0

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v2, v1, :cond_1

    .line 233
    :cond_0
    const/4 v1, 0x0

    .line 255
    :goto_0
    return v1

    .line 236
    :cond_1
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->isReadyForSlide()Z

    move-result v2

    if-nez v2, :cond_2

    .line 237
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    new-instance v3, Lcom/yong/slidemenu/SlideHolder$5;

    invoke-direct {v3, p0}, Lcom/yong/slidemenu/SlideHolder$5;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-interface {v2, v3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 247
    :cond_2
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initSlideMode()V

    .line 249
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v2, v2

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    int-to-float v3, v3

    invoke-direct {v0, p0, v2, v3}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 250
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 251
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    .line 253
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->invalidate()V

    goto :goto_0
.end method

.method public closeImmediately()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 259
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v2, :cond_0

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v2, v0, :cond_2

    :cond_0
    move v0, v1

    .line 282
    :cond_1
    :goto_0
    return v0

    .line 263
    :cond_2
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->isReadyForSlide()Z

    move-result v2

    if-nez v2, :cond_3

    .line 264
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    new-instance v2, Lcom/yong/slidemenu/SlideHolder$6;

    invoke-direct {v2, p0}, Lcom/yong/slidemenu/SlideHolder$6;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-interface {v1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 274
    :cond_3
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 275
    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 276
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->requestLayout()V

    .line 278
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    if-eqz v2, :cond_1

    .line 279
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    invoke-interface {v2, v1}, Lcom/yong/slidemenu/SlideHolder$OnSlideListener;->onSlideCompleted(Z)V

    goto :goto_0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 12
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 359
    :try_start_0
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v0, v3, :cond_3

    .line 360
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 361
    .local v6, "main":Landroid/view/View;
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 366
    invoke-virtual {v6}, Landroid/view/View;->isDirty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 368
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v6, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 385
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 386
    .local v7, "menu":Landroid/view/View;
    invoke-virtual {v7}, Landroid/view/View;->getScrollX()I

    move-result v10

    .line 387
    .local v10, "scrollX":I
    invoke-virtual {v7}, Landroid/view/View;->getScrollY()I

    move-result v11

    .line 389
    .local v11, "scrollY":I
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 391
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    if-ne v0, v3, :cond_2

    .line 392
    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v3, v0

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v4, v0

    sget-object v5, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 401
    :goto_1
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 402
    neg-int v0, v10

    int-to-float v0, v0

    neg-int v1, v11

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 404
    invoke-virtual {v7, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 406
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 408
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedBitmap:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v1, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 422
    .end local v6    # "main":Landroid/view/View;
    .end local v7    # "menu":Landroid/view/View;
    .end local v10    # "scrollX":I
    .end local v11    # "scrollY":I
    :goto_2
    return-void

    .line 375
    .restart local v6    # "main":Landroid/view/View;
    :cond_1
    iget-byte v0, p0, Lcom/yong/slidemenu/SlideHolder;->mFrame:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/yong/slidemenu/SlideHolder;->mFrame:B

    rem-int/lit8 v0, v0, 0x5

    if-nez v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 377
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mCachedCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v6, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 416
    .end local v6    # "main":Landroid/view/View;
    :catch_0
    move-exception v0

    goto :goto_2

    .line 394
    .restart local v6    # "main":Landroid/view/View;
    .restart local v7    # "menu":Landroid/view/View;
    .restart local v10    # "scrollX":I
    .restart local v11    # "scrollY":I
    :cond_2
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v9

    .line 395
    .local v9, "menuWidth":I
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    .line 397
    .local v8, "menuLeft":I
    add-int v0, v8, v9

    iget v1, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    add-int/2addr v0, v1

    const/4 v1, 0x0

    .line 398
    add-int v2, v8, v9

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 397
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    goto :goto_1

    .line 410
    .end local v6    # "main":Landroid/view/View;
    .end local v7    # "menu":Landroid/view/View;
    .end local v8    # "menuLeft":I
    .end local v9    # "menuWidth":I
    .end local v10    # "scrollX":I
    .end local v11    # "scrollY":I
    :cond_3
    iget-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-nez v0, :cond_4

    .line 411
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 414
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v7, 0x0

    const/4 v4, 0x1

    .line 429
    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    if-eqz v5, :cond_0

    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    if-nez v5, :cond_1

    :cond_0
    iget v5, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-eqz v5, :cond_2

    .line 430
    :cond_1
    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-eqz v5, :cond_4

    .line 431
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    .line 479
    :cond_3
    :goto_0
    return v4

    .line 434
    :cond_4
    iget v5, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    const/4 v6, 0x2

    if-eq v5, v6, :cond_6

    .line 435
    invoke-virtual {p0, p1}, Lcom/yong/slidemenu/SlideHolder;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 437
    iget v5, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-eq v5, v4, :cond_5

    .line 438
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 440
    :cond_5
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 441
    .local v1, "cancelEvent":Landroid/view/MotionEvent;
    const/4 v5, 0x3

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->setAction(I)V

    .line 442
    invoke-super {p0, v1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 443
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0

    .line 448
    .end local v1    # "cancelEvent":Landroid/view/MotionEvent;
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 450
    .local v0, "action":I
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 451
    .local v3, "rect":Landroid/graphics/Rect;
    invoke-virtual {p0, v7}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 452
    .local v2, "menu":Landroid/view/View;
    invoke-virtual {v2, v3}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 454
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v3, v5, v6}, Landroid/graphics/Rect;->contains(II)Z

    move-result v5

    if-nez v5, :cond_9

    .line 455
    if-ne v0, v4, :cond_7

    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    if-eqz v5, :cond_7

    .line 456
    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    if-nez v5, :cond_7

    .line 457
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->close()Z

    .line 458
    iput-boolean v7, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 468
    :goto_1
    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    if-eqz v5, :cond_3

    .line 469
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 460
    :cond_7
    if-nez v0, :cond_8

    .line 461
    iget-boolean v5, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    if-nez v5, :cond_8

    .line 462
    iput-boolean v4, p0, Lcom/yong/slidemenu/SlideHolder;->mCloseOnRelease:Z

    .line 465
    :cond_8
    invoke-virtual {p0, p1}, Lcom/yong/slidemenu/SlideHolder;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 474
    :cond_9
    invoke-virtual {p0, p1}, Lcom/yong/slidemenu/SlideHolder;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 476
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    invoke-virtual {p1, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 477
    invoke-virtual {v2, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0
.end method

.method public getMenuOffset()I
    .locals 1

    .prologue
    .line 142
    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    return v0
.end method

.method public isAllowedInterceptTouch()Z
    .locals 1

    .prologue
    .line 112
    iget-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    return v0
.end method

.method public isDispatchTouchWhenOpened()Z
    .locals 1

    .prologue
    .line 126
    iget-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 86
    iget-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    return v0
.end method

.method public isOpened()Z
    .locals 2

    .prologue
    .line 150
    iget-boolean v0, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 12
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .prologue
    .line 287
    const/4 v4, 0x0

    .line 288
    .local v4, "parentLeft":I
    const/4 v6, 0x0

    .line 289
    .local v6, "parentTop":I
    sub-int v5, p4, p2

    .line 290
    .local v5, "parentRight":I
    sub-int v3, p5, p3

    .line 292
    .local v3, "parentBottom":I
    const/4 v8, 0x0

    invoke-virtual {p0, v8}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 293
    .local v1, "menu":Landroid/view/View;
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 295
    .local v2, "menuWidth":I
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_1

    .line 296
    const/4 v8, 0x0

    const/4 v9, 0x0

    add-int/lit8 v10, v2, 0x0

    invoke-virtual {v1, v8, v9, v10, v3}, Landroid/view/View;->layout(IIII)V

    .line 303
    :goto_0
    iget-boolean v8, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-eqz v8, :cond_3

    .line 304
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_2

    .line 305
    iput v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    .line 315
    :cond_0
    :goto_1
    const/4 v8, 0x1

    invoke-virtual {p0, v8}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 316
    .local v0, "main":Landroid/view/View;
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    add-int/lit8 v8, v8, 0x0

    const/4 v9, 0x0

    iget v10, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    add-int/lit8 v10, v10, 0x0

    .line 317
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    add-int/2addr v10, v11

    .line 316
    invoke-virtual {v0, v8, v9, v10, v3}, Landroid/view/View;->layout(IIII)V

    .line 319
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->invalidate()V

    .line 322
    :goto_2
    iget-object v8, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    invoke-interface {v8}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Runnable;

    .local v7, "rn":Ljava/lang/Runnable;
    if-nez v7, :cond_5

    .line 325
    return-void

    .line 299
    .end local v0    # "main":Landroid/view/View;
    .end local v7    # "rn":Ljava/lang/Runnable;
    :cond_1
    sub-int v8, v5, v2

    const/4 v9, 0x0

    invoke-virtual {v1, v8, v9, v5, v3}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 307
    :cond_2
    const/4 v8, 0x0

    iput v8, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    goto :goto_1

    .line 309
    :cond_3
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    const/4 v9, 0x2

    if-ne v8, v9, :cond_4

    .line 310
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    mul-int/2addr v8, v2

    iput v8, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    goto :goto_1

    .line 311
    :cond_4
    iget v8, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-nez v8, :cond_0

    .line 312
    const/4 v8, 0x0

    iput v8, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    goto :goto_1

    .line 323
    .restart local v0    # "main":Landroid/view/View;
    .restart local v7    # "rn":Ljava/lang/Runnable;
    :cond_5
    invoke-interface {v7}, Ljava/lang/Runnable;->run()V

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 4
    .param p1, "wSp"    # I
    .param p2, "hSp"    # I

    .prologue
    const/4 v3, 0x1

    .line 333
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    .line 335
    iget-boolean v2, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-eqz v2, :cond_0

    .line 336
    invoke-virtual {p0, v3}, Lcom/yong/slidemenu/SlideHolder;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 338
    .local v1, "main":Landroid/view/View;
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 339
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {p0, v2, p1, p2}, Lcom/yong/slidemenu/SlideHolder;->measureChild(Landroid/view/View;II)V

    .line 340
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 342
    .local v0, "lp":Landroid/widget/FrameLayout$LayoutParams;
    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    if-ne v2, v3, :cond_1

    .line 343
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 350
    .end local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    .end local v1    # "main":Landroid/view/View;
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 351
    return-void

    .line 345
    .restart local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    .restart local v1    # "main":Landroid/view/View;
    :cond_1
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 541
    invoke-direct {p0, p1}, Lcom/yong/slidemenu/SlideHolder;->handleTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 543
    .local v0, "handled":Z
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->invalidate()V

    .line 545
    return v0
.end method

.method public open()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 178
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v2

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v2, :cond_0

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v2, v1, :cond_1

    .line 179
    :cond_0
    const/4 v1, 0x0

    .line 201
    :goto_0
    return v1

    .line 182
    :cond_1
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->isReadyForSlide()Z

    move-result v2

    if-nez v2, :cond_2

    .line 183
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    new-instance v3, Lcom/yong/slidemenu/SlideHolder$3;

    invoke-direct {v3, p0}, Lcom/yong/slidemenu/SlideHolder$3;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-interface {v2, v3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 193
    :cond_2
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->initSlideMode()V

    .line 195
    new-instance v0, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOffset:I

    int-to-float v2, v2

    iget v3, p0, Lcom/yong/slidemenu/SlideHolder;->mEndOffset:I

    int-to-float v3, v3

    invoke-direct {v0, p0, v2, v3}, Lcom/yong/slidemenu/SlideHolder$SlideAnimation;-><init>(Lcom/yong/slidemenu/SlideHolder;FF)V

    .line 196
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mOpenListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 197
    invoke-virtual {p0, v0}, Lcom/yong/slidemenu/SlideHolder;->startAnimation(Landroid/view/animation/Animation;)V

    .line 199
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->invalidate()V

    goto :goto_0
.end method

.method public openImmediately()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 205
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v2

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    if-nez v2, :cond_0

    iget v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    if-ne v2, v0, :cond_2

    :cond_0
    move v0, v1

    .line 228
    :cond_1
    :goto_0
    return v0

    .line 209
    :cond_2
    invoke-direct {p0}, Lcom/yong/slidemenu/SlideHolder;->isReadyForSlide()Z

    move-result v2

    if-nez v2, :cond_3

    .line 210
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mWhenReady:Ljava/util/Queue;

    new-instance v2, Lcom/yong/slidemenu/SlideHolder$4;

    invoke-direct {v2, p0}, Lcom/yong/slidemenu/SlideHolder$4;-><init>(Lcom/yong/slidemenu/SlideHolder;)V

    invoke-interface {v1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 220
    :cond_3
    iget-object v2, p0, Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 221
    const/4 v1, 0x2

    iput v1, p0, Lcom/yong/slidemenu/SlideHolder;->mMode:I

    .line 222
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->requestLayout()V

    .line 224
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    if-eqz v1, :cond_1

    .line 225
    iget-object v1, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    invoke-interface {v1, v0}, Lcom/yong/slidemenu/SlideHolder$OnSlideListener;->onSlideCompleted(Z)V

    goto :goto_0
.end method

.method public setAllowInterceptTouch(Z)V
    .locals 0
    .param p1, "allow"    # Z

    .prologue
    .line 108
    iput-boolean p1, p0, Lcom/yong/slidemenu/SlideHolder;->mInterceptTouch:Z

    .line 109
    return-void
.end method

.method public setAlwaysOpened(Z)V
    .locals 0
    .param p1, "opened"    # Z

    .prologue
    .line 136
    iput-boolean p1, p0, Lcom/yong/slidemenu/SlideHolder;->mAlwaysOpened:Z

    .line 138
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->requestLayout()V

    .line 139
    return-void
.end method

.method public setDirection(I)V
    .locals 0
    .param p1, "direction"    # I

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->closeImmediately()Z

    .line 98
    iput p1, p0, Lcom/yong/slidemenu/SlideHolder;->mDirection:I

    .line 99
    return-void
.end method

.method public setDispatchTouchWhenOpened(Z)V
    .locals 0
    .param p1, "dispatch"    # Z

    .prologue
    .line 122
    iput-boolean p1, p0, Lcom/yong/slidemenu/SlideHolder;->mDispatchWhenOpened:Z

    .line 123
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    .line 81
    iput-boolean p1, p0, Lcom/yong/slidemenu/SlideHolder;->mEnabled:Z

    .line 82
    return-void
.end method

.method public setOnSlideListener(Lcom/yong/slidemenu/SlideHolder$OnSlideListener;)V
    .locals 0
    .param p1, "lis"    # Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    .prologue
    .line 146
    iput-object p1, p0, Lcom/yong/slidemenu/SlideHolder;->mListener:Lcom/yong/slidemenu/SlideHolder$OnSlideListener;

    .line 147
    return-void
.end method

.method public toggle()V
    .locals 1

    .prologue
    .line 162
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->close()Z

    .line 167
    :goto_0
    return-void

    .line 165
    :cond_0
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->open()Z

    goto :goto_0
.end method

.method public toggle(Z)V
    .locals 0
    .param p1, "immediately"    # Z

    .prologue
    .line 154
    if-eqz p1, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->toggleImmediately()V

    .line 159
    :goto_0
    return-void

    .line 157
    :cond_0
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->toggle()V

    goto :goto_0
.end method

.method public toggleImmediately()V
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->closeImmediately()Z

    .line 175
    :goto_0
    return-void

    .line 173
    :cond_0
    invoke-virtual {p0}, Lcom/yong/slidemenu/SlideHolder;->openImmediately()Z

    goto :goto_0
.end method
