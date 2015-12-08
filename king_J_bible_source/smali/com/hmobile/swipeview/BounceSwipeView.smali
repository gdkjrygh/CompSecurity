.class public Lcom/hmobile/swipeview/BounceSwipeView;
.super Lcom/hmobile/swipeview/SwipeView;
.source "BounceSwipeView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;
    }
.end annotation


# static fields
.field private static final ANIMATION_DURATION:I = 0x78

.field private static final BOUNCING_ON_LEFT:Z = true

.field private static final BOUNCING_ON_RIGHT:Z = false

.field private static final FRAME_DURATION:I = 0x1e

.field private static final NUMBER_OF_FRAMES:I = 0x4


# instance fields
.field private mAtEdge:Z

.field private mAtEdgePreviousPosition:F

.field private mAtEdgeStartPosition:F

.field private mBounceEnabled:Z

.field private mBouncingSide:Z

.field private mContext:Landroid/content/Context;

.field private mCurrentAnimationFrame:I

.field mEaseAnimationFrameHandler:Landroid/os/Handler;

.field private mOnTouchListener:Landroid/view/View$OnTouchListener;

.field private mPaddingChange:I

.field private mPaddingLeft:I

.field private mPaddingRight:I

.field private mPaddingStartValue:I

.field private mSharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/hmobile/swipeview/SwipeView;-><init>(Landroid/content/Context;)V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    .line 39
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mContext:Landroid/content/Context;

    .line 40
    invoke-direct {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->initBounceSwipeView()V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/hmobile/swipeview/SwipeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    .line 46
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mContext:Landroid/content/Context;

    .line 47
    invoke-direct {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->initBounceSwipeView()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/hmobile/swipeview/SwipeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    .line 53
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mContext:Landroid/content/Context;

    .line 54
    invoke-direct {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->initBounceSwipeView()V

    .line 55
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/swipeview/BounceSwipeView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/swipeview/BounceSwipeView;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    return v0
.end method

.method static synthetic access$10(Lcom/hmobile/swipeview/BounceSwipeView;)I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingRight:I

    return v0
.end method

.method static synthetic access$11(Lcom/hmobile/swipeview/BounceSwipeView;)V
    .locals 0

    .prologue
    .line 177
    invoke-direct {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->doBounceBackEaseAnimation()V

    return-void
.end method

.method static synthetic access$12(Lcom/hmobile/swipeview/BounceSwipeView;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I

    return v0
.end method

.method static synthetic access$13(Lcom/hmobile/swipeview/BounceSwipeView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingStartValue:I

    return v0
.end method

.method static synthetic access$14(Lcom/hmobile/swipeview/BounceSwipeView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingChange:I

    return v0
.end method

.method static synthetic access$15(Lcom/hmobile/swipeview/BounceSwipeView;)Z
    .locals 1

    .prologue
    .line 31
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    return v0
.end method

.method static synthetic access$16(Lcom/hmobile/swipeview/BounceSwipeView;I)V
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/swipeview/BounceSwipeView;)Z
    .locals 1

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z

    return v0
.end method

.method static synthetic access$3(Lcom/hmobile/swipeview/BounceSwipeView;Z)V
    .locals 0

    .prologue
    .line 21
    iput-boolean p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdge:Z

    return-void
.end method

.method static synthetic access$4(Lcom/hmobile/swipeview/BounceSwipeView;F)V
    .locals 0

    .prologue
    .line 22
    iput p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgeStartPosition:F

    return-void
.end method

.method static synthetic access$5(Lcom/hmobile/swipeview/BounceSwipeView;F)V
    .locals 0

    .prologue
    .line 23
    iput p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgePreviousPosition:F

    return-void
.end method

.method static synthetic access$6(Lcom/hmobile/swipeview/BounceSwipeView;Z)V
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    return-void
.end method

.method static synthetic access$7(Lcom/hmobile/swipeview/BounceSwipeView;)F
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgePreviousPosition:F

    return v0
.end method

.method static synthetic access$8(Lcom/hmobile/swipeview/BounceSwipeView;)F
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mAtEdgeStartPosition:F

    return v0
.end method

.method static synthetic access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V

    return-void
.end method

.method private doBounceBackEaseAnimation()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 179
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    if-eqz v0, :cond_1

    .line 181
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v0

    iget v1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingLeft:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingChange:I

    .line 182
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingStartValue:I

    .line 190
    :cond_0
    :goto_0
    iput v2, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mCurrentAnimationFrame:I

    .line 192
    iget-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mEaseAnimationFrameHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 193
    iget-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mEaseAnimationFrameHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 194
    return-void

    .line 184
    :cond_1
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    if-nez v0, :cond_0

    .line 186
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v0

    iget v1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingRight:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingChange:I

    .line 187
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingStartValue:I

    goto :goto_0
.end method

.method private initBounceSwipeView()V
    .locals 2

    .prologue
    .line 59
    new-instance v0, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;-><init>(Lcom/hmobile/swipeview/BounceSwipeView;Lcom/hmobile/swipeview/BounceSwipeView$BounceViewOnTouchListener;)V

    invoke-super {p0, v0}, Lcom/hmobile/swipeview/SwipeView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 60
    iget-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 61
    new-instance v0, Lcom/hmobile/swipeview/BounceSwipeView$1;

    invoke-direct {v0, p0}, Lcom/hmobile/swipeview/BounceSwipeView$1;-><init>(Lcom/hmobile/swipeview/BounceSwipeView;)V

    iput-object v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mEaseAnimationFrameHandler:Landroid/os/Handler;

    .line 83
    return-void
.end method


# virtual methods
.method public doAtEdgeAnimation()V
    .locals 4

    .prologue
    .line 203
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getCurrentPage()I

    move-result v0

    if-nez v0, :cond_1

    .line 205
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    .line 206
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v3

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {p0, v0, v1, v2, v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    .line 215
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->doBounceBackEaseAnimation()V

    .line 216
    return-void

    .line 208
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getCurrentPage()I

    move-result v0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPageCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    .line 210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBouncingSide:Z

    .line 211
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingRight()I

    move-result v2

    add-int/lit8 v2, v2, 0x32

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getPaddingBottom()I

    move-result v3

    # invokes: Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V
    invoke-static {p0, v0, v1, v2, v3}, Lcom/hmobile/swipeview/BounceSwipeView;->access$9(Lcom/hmobile/swipeview/BounceSwipeView;IIII)V

    .line 212
    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollX()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    invoke-virtual {p0}, Lcom/hmobile/swipeview/BounceSwipeView;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/hmobile/swipeview/BounceSwipeView;->scrollTo(II)V

    goto :goto_0
.end method

.method public getBounceEnabled()Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    return v0
.end method

.method public setBounceEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mBounceEnabled:Z

    .line 102
    return-void
.end method

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0
    .param p1, "onTouchListener"    # Landroid/view/View$OnTouchListener;

    .prologue
    .line 96
    iput-object p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mOnTouchListener:Landroid/view/View$OnTouchListener;

    .line 97
    return-void
.end method

.method public setPadding(IIII)V
    .locals 0
    .param p1, "left"    # I
    .param p2, "top"    # I
    .param p3, "right"    # I
    .param p4, "bottom"    # I

    .prologue
    .line 88
    iput p1, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingLeft:I

    .line 89
    iput p3, p0, Lcom/hmobile/swipeview/BounceSwipeView;->mPaddingRight:I

    .line 90
    invoke-super {p0, p1, p2, p3, p4}, Lcom/hmobile/swipeview/SwipeView;->setPadding(IIII)V

    .line 91
    return-void
.end method
