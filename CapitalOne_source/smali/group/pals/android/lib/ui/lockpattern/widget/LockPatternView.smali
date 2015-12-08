.class public Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;
.super Landroid/view/View;
.source "LockPatternView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;,
        Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;,
        Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;,
        Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;,
        Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    }
.end annotation


# static fields
.field private static final ASPECT_LOCK_HEIGHT:I = 0x2

.field private static final ASPECT_LOCK_WIDTH:I = 0x1

.field private static final ASPECT_SQUARE:I = 0x0

.field private static final MILLIS_PER_CIRCLE_ANIMATING:I = 0x2bc

.field private static final PROFILE_DRAWING:Z = false

.field static final STATUS_BAR_HEIGHT:I = 0x19


# instance fields
.field private accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field private mAnimatingPeriodStart:J

.field private final mArrowMatrix:Landroid/graphics/Matrix;

.field private mAspect:I

.field private mBitmapArrowGreenUp:Landroid/graphics/Bitmap;

.field private mBitmapArrowRedUp:Landroid/graphics/Bitmap;

.field private mBitmapBtnDefault:Landroid/graphics/Bitmap;

.field private mBitmapBtnTouched:Landroid/graphics/Bitmap;

.field private mBitmapCircleDefault:Landroid/graphics/Bitmap;

.field private mBitmapCircleGreen:Landroid/graphics/Bitmap;

.field private mBitmapCircleRed:Landroid/graphics/Bitmap;

.field private mBitmapHeight:I

.field private mBitmapWidth:I

.field private final mCircleMatrix:Landroid/graphics/Matrix;

.field private final mContext:Landroid/content/Context;

.field private final mCurrentPath:Landroid/graphics/Path;

.field private mDiameterFactor:F

.field private mDrawingProfilingStarted:Z

.field private mEnableHapticFeedback:Z

.field private final mErrorLineColor:I

.field private mHitFactor:F

.field private mInProgressX:F

.field private mInProgressY:F

.field private mInStealthMode:Z

.field private mInputEnabled:Z

.field private final mInvalidate:Landroid/graphics/Rect;

.field private final mLineColor:I

.field private mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

.field private final mPadding:I

.field private final mPaddingBottom:I

.field private final mPaddingLeft:I

.field private final mPaddingRight:I

.field private final mPaddingTop:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPathPaint:Landroid/graphics/Paint;

.field private mPattern:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;"
        }
    .end annotation
.end field

.field private mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

.field private mPatternDrawLookup:[[Z

.field private mPatternInProgress:Z

.field private mSquareHeight:F

.field private mSquareWidth:F

.field private final mStrokeAlpha:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 260
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 261
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v12, 0x2

    const/high16 v8, -0x40800000    # -1.0f

    const/4 v11, 0x3

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 264
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    iput-boolean v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mDrawingProfilingStarted:Z

    .line 66
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    .line 67
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    .line 80
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0x9

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    .line 88
    filled-new-array {v11, v11}, [I

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[Z

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    .line 94
    iput v8, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 95
    iput v8, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 99
    sget-object v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .line 100
    iput-boolean v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    .line 101
    iput-boolean v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    .line 102
    iput-boolean v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    .line 103
    iput-boolean v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 105
    const/16 v6, 0x87

    const/16 v7, 0xba

    const/16 v8, 0xe7

    invoke-static {v6, v7, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mLineColor:I

    .line 106
    const/16 v6, 0xcf

    const/16 v7, 0x41

    const/16 v8, 0x49

    invoke-static {v6, v7, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mErrorLineColor:I

    .line 107
    const v6, 0x3ecccccd    # 0.4f

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mDiameterFactor:F

    .line 108
    const/16 v6, 0xff

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mStrokeAlpha:I

    .line 109
    const v6, 0x3f19999a    # 0.6f

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mHitFactor:F

    .line 123
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCurrentPath:Landroid/graphics/Path;

    .line 124
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInvalidate:Landroid/graphics/Rect;

    .line 130
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    .line 131
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    .line 133
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPadding:I

    .line 134
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaddingLeft:I

    .line 135
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaddingRight:I

    .line 136
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaddingTop:I

    .line 137
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaddingBottom:I

    .line 266
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mContext:Landroid/content/Context;

    .line 271
    const-string v1, ""

    .line 273
    .local v1, "aspect":Ljava/lang/String;
    const-string v6, "square"

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 274
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAspect:I

    .line 283
    :goto_0
    invoke-virtual {p0, v10}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setClickable(Z)V

    .line 285
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    invoke-virtual {v6, v10}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 286
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    invoke-virtual {v6, v10}, Landroid/graphics/Paint;->setDither(Z)V

    .line 287
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    iget v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mLineColor:I

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 288
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    const/16 v7, 0xff

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 289
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 290
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 291
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 294
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_btn_code_lock_default_holo:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnDefault:Landroid/graphics/Bitmap;

    .line 295
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_btn_code_lock_touched_holo:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnTouched:Landroid/graphics/Bitmap;

    .line 296
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_indicator_code_lock_point_area_default_holo:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleDefault:Landroid/graphics/Bitmap;

    .line 297
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_indicator_code_lock_point_area_green_holo:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleGreen:Landroid/graphics/Bitmap;

    .line 298
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_indicator_code_lock_point_area_red_holo:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleRed:Landroid/graphics/Bitmap;

    .line 300
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_indicator_code_lock_drag_direction_green_up:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapArrowGreenUp:Landroid/graphics/Bitmap;

    .line 301
    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$drawable;->alp_indicator_code_lock_drag_direction_red_up:I

    invoke-direct {p0, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getBitmapFor(I)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapArrowRedUp:Landroid/graphics/Bitmap;

    .line 304
    const/4 v6, 0x5

    new-array v3, v6, [Landroid/graphics/Bitmap;

    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnDefault:Landroid/graphics/Bitmap;

    aput-object v6, v3, v9

    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnTouched:Landroid/graphics/Bitmap;

    aput-object v6, v3, v10

    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleDefault:Landroid/graphics/Bitmap;

    aput-object v6, v3, v12

    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleGreen:Landroid/graphics/Bitmap;

    aput-object v6, v3, v11

    const/4 v6, 0x4

    iget-object v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleRed:Landroid/graphics/Bitmap;

    aput-object v7, v3, v6

    .line 307
    .local v3, "bitmaps":[Landroid/graphics/Bitmap;
    move-object v0, v3

    .local v0, "arr$":[Landroid/graphics/Bitmap;
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_1
    if-ge v4, v5, :cond_3

    aget-object v2, v0, v4

    .line 308
    .local v2, "bitmap":Landroid/graphics/Bitmap;
    iget v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    .line 309
    iget v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    .line 307
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 275
    .end local v0    # "arr$":[Landroid/graphics/Bitmap;
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v3    # "bitmaps":[Landroid/graphics/Bitmap;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    :cond_0
    const-string v6, "lock_width"

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 276
    iput v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAspect:I

    goto/16 :goto_0

    .line 277
    :cond_1
    const-string v6, "lock_height"

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 278
    iput v12, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAspect:I

    goto/16 :goto_0

    .line 280
    :cond_2
    iput v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAspect:I

    goto/16 :goto_0

    .line 312
    .restart local v0    # "arr$":[Landroid/graphics/Bitmap;
    .restart local v3    # "bitmaps":[Landroid/graphics/Bitmap;
    .restart local v4    # "i$":I
    .restart local v5    # "len$":I
    :cond_3
    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mContext:Landroid/content/Context;

    const-string v7, "accessibility"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/accessibility/AccessibilityManager;

    iput-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    .line 313
    return-void
.end method

.method private addCellToPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;)V
    .locals 3
    .param p1, "newCell"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .prologue
    .line 658
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    invoke-virtual {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v1

    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    .line 659
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyCellAdded()V

    .line 661
    return-void
.end method

.method private checkForNewHit(FF)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .locals 4
    .param p1, "x"    # F
    .param p2, "y"    # F

    .prologue
    const/4 v2, 0x0

    .line 666
    invoke-direct {p0, p2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getRowHit(F)I

    move-result v1

    .line 667
    .local v1, "rowHit":I
    if-gez v1, :cond_1

    .line 678
    :cond_0
    :goto_0
    return-object v2

    .line 670
    :cond_1
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getColumnHit(F)I

    move-result v0

    .line 671
    .local v0, "columnHit":I
    if-ltz v0, :cond_0

    .line 675
    iget-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    aget-object v3, v3, v1

    aget-boolean v3, v3, v0

    if-nez v3, :cond_0

    .line 678
    invoke-static {v1, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->of(II)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v2

    goto :goto_0
.end method

.method private clearPatternDrawLookup()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    .line 526
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v4, :cond_1

    .line 527
    const/4 v1, 0x0

    .local v1, "j":I
    :goto_1
    if-ge v1, v4, :cond_0

    .line 528
    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    aget-object v2, v2, v0

    const/4 v3, 0x0

    aput-boolean v3, v2, v1

    .line 527
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 526
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 531
    .end local v1    # "j":I
    :cond_1
    return-void
.end method

.method private detectAndAddHit(FF)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .locals 13
    .param p1, "x"    # F
    .param p2, "y"    # F

    .prologue
    const/4 v12, 0x2

    const/4 v10, -0x1

    const/4 v9, 0x1

    .line 618
    invoke-direct {p0, p1, p2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->checkForNewHit(FF)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v0

    .line 619
    .local v0, "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    if-eqz v0, :cond_7

    .line 622
    const/4 v4, 0x0

    .line 623
    .local v4, "fillInGapCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget-object v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    .line 624
    .local v7, "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_3

    .line 625
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 626
    .local v6, "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v8, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    iget v11, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    sub-int v2, v8, v11

    .line 627
    .local v2, "dRow":I
    iget v8, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    iget v11, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    sub-int v1, v8, v11

    .line 629
    .local v1, "dColumn":I
    iget v5, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    .line 630
    .local v5, "fillInRow":I
    iget v3, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    .line 632
    .local v3, "fillInColumn":I
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-ne v8, v12, :cond_0

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-eq v8, v9, :cond_0

    .line 633
    iget v11, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    if-lez v2, :cond_6

    move v8, v9

    :goto_0
    add-int v5, v11, v8

    .line 636
    :cond_0
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-ne v8, v12, :cond_2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-eq v8, v9, :cond_2

    .line 637
    iget v8, v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    if-lez v1, :cond_1

    move v10, v9

    :cond_1
    add-int v3, v8, v10

    .line 640
    :cond_2
    invoke-static {v5, v3}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->of(II)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v4

    .line 643
    .end local v1    # "dColumn":I
    .end local v2    # "dRow":I
    .end local v3    # "fillInColumn":I
    .end local v5    # "fillInRow":I
    .end local v6    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_3
    if-eqz v4, :cond_4

    iget-object v8, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    iget v10, v4, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    aget-object v8, v8, v10

    iget v10, v4, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    aget-boolean v8, v8, v10

    if-nez v8, :cond_4

    .line 644
    invoke-direct {p0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->addCellToPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;)V

    .line 646
    :cond_4
    invoke-direct {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->addCellToPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;)V

    .line 647
    iget-boolean v8, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    if-eqz v8, :cond_5

    .line 648
    const/4 v8, 0x3

    invoke-virtual {p0, v9, v8}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->performHapticFeedback(II)Z

    .line 654
    .end local v0    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v4    # "fillInGapCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v7    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :cond_5
    :goto_1
    return-object v0

    .restart local v0    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v1    # "dColumn":I
    .restart local v2    # "dRow":I
    .restart local v3    # "fillInColumn":I
    .restart local v4    # "fillInGapCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v5    # "fillInRow":I
    .restart local v6    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v7    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :cond_6
    move v8, v10

    .line 633
    goto :goto_0

    .line 654
    .end local v1    # "dColumn":I
    .end local v2    # "dRow":I
    .end local v3    # "fillInColumn":I
    .end local v4    # "fillInGapCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v5    # "fillInRow":I
    .end local v6    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v7    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :cond_7
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private drawArrow(Landroid/graphics/Canvas;FFLgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;)V
    .locals 22
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .param p2, "leftX"    # F
    .param p3, "topY"    # F
    .param p4, "start"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .param p5, "end"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .prologue
    .line 1124
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    move-object/from16 v18, v0

    sget-object v19, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_0

    const/4 v10, 0x1

    .line 1126
    .local v10, "green":Z
    :goto_0
    move-object/from16 v0, p5

    iget v9, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    .line 1127
    .local v9, "endRow":I
    move-object/from16 v0, p4

    iget v14, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    .line 1128
    .local v14, "startRow":I
    move-object/from16 v0, p5

    iget v8, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    .line 1129
    .local v8, "endColumn":I
    move-object/from16 v0, p4

    iget v13, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    .line 1132
    .local v13, "startColumn":I
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v18, v0

    move/from16 v0, v18

    float-to-int v0, v0

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    move/from16 v19, v0

    sub-int v18, v18, v19

    div-int/lit8 v11, v18, 0x2

    .line 1133
    .local v11, "offsetX":I
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    move/from16 v18, v0

    move/from16 v0, v18

    float-to-int v0, v0

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    move/from16 v19, v0

    sub-int v18, v18, v19

    div-int/lit8 v12, v18, 0x2

    .line 1140
    .local v12, "offsetY":I
    if-eqz v10, :cond_1

    move-object/from16 v0, p0

    iget-object v5, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapArrowGreenUp:Landroid/graphics/Bitmap;

    .line 1141
    .local v5, "arrow":Landroid/graphics/Bitmap;
    :goto_1
    move-object/from16 v0, p0

    iget v7, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    .line 1142
    .local v7, "cellWidth":I
    move-object/from16 v0, p0

    iget v6, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    .line 1146
    .local v6, "cellHeight":I
    sub-int v18, v9, v14

    move/from16 v0, v18

    int-to-double v0, v0

    move-wide/from16 v18, v0

    sub-int v20, v8, v13

    move/from16 v0, v20

    int-to-double v0, v0

    move-wide/from16 v20, v0

    invoke-static/range {v18 .. v21}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    .line 1147
    .local v17, "theta":F
    move/from16 v0, v17

    float-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    const/high16 v19, 0x42b40000    # 90.0f

    add-float v4, v18, v19

    .line 1150
    .local v4, "angle":F
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    div-float v18, v18, v19

    const/high16 v19, 0x3f800000    # 1.0f

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->min(FF)F

    move-result v15

    .line 1151
    .local v15, "sx":F
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    div-float v18, v18, v19

    const/high16 v19, 0x3f800000    # 1.0f

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->min(FF)F

    move-result v16

    .line 1152
    .local v16, "sy":F
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    int-to-float v0, v11

    move/from16 v19, v0

    add-float v19, v19, p2

    int-to-float v0, v12

    move/from16 v20, v0

    add-float v20, v20, p3

    invoke-virtual/range {v18 .. v20}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1155
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    move/from16 v19, v0

    div-int/lit8 v19, v19, 0x2

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    move/from16 v20, v0

    div-int/lit8 v20, v20, 0x2

    move/from16 v0, v20

    int-to-float v0, v0

    move/from16 v20, v0

    invoke-virtual/range {v18 .. v20}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1156
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    move/from16 v1, v16

    invoke-virtual {v0, v15, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 1157
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    move/from16 v19, v0

    move/from16 v0, v19

    neg-int v0, v0

    move/from16 v19, v0

    div-int/lit8 v19, v19, 0x2

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    move/from16 v20, v0

    move/from16 v0, v20

    neg-int v0, v0

    move/from16 v20, v0

    div-int/lit8 v20, v20, 0x2

    move/from16 v0, v20

    int-to-float v0, v0

    move/from16 v20, v0

    invoke-virtual/range {v18 .. v20}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1158
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    int-to-float v0, v7

    move/from16 v19, v0

    const/high16 v20, 0x40000000    # 2.0f

    div-float v19, v19, v20

    int-to-float v0, v6

    move/from16 v20, v0

    const/high16 v21, 0x40000000    # 2.0f

    div-float v20, v20, v21

    move-object/from16 v0, v18

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v0, v4, v1, v2}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 1162
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v19

    sub-int v19, v7, v19

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    const/high16 v20, 0x40000000    # 2.0f

    div-float v19, v19, v20

    const/16 v20, 0x0

    invoke-virtual/range {v18 .. v20}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1166
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mArrowMatrix:Landroid/graphics/Matrix;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v19, v0

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v5, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1167
    return-void

    .line 1124
    .end local v4    # "angle":F
    .end local v5    # "arrow":Landroid/graphics/Bitmap;
    .end local v6    # "cellHeight":I
    .end local v7    # "cellWidth":I
    .end local v8    # "endColumn":I
    .end local v9    # "endRow":I
    .end local v10    # "green":Z
    .end local v11    # "offsetX":I
    .end local v12    # "offsetY":I
    .end local v13    # "startColumn":I
    .end local v14    # "startRow":I
    .end local v15    # "sx":F
    .end local v16    # "sy":F
    .end local v17    # "theta":F
    :cond_0
    const/4 v10, 0x0

    goto/16 :goto_0

    .line 1140
    .restart local v8    # "endColumn":I
    .restart local v9    # "endRow":I
    .restart local v10    # "green":Z
    .restart local v11    # "offsetX":I
    .restart local v12    # "offsetY":I
    .restart local v13    # "startColumn":I
    .restart local v14    # "startRow":I
    :cond_1
    move-object/from16 v0, p0

    iget-object v5, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapArrowRedUp:Landroid/graphics/Bitmap;

    goto/16 :goto_1
.end method

.method private drawCircle(Landroid/graphics/Canvas;IIZ)V
    .locals 13
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .param p2, "leftX"    # I
    .param p3, "topY"    # I
    .param p4, "partOfPattern"    # Z

    .prologue
    .line 1180
    if-eqz p4, :cond_0

    iget-boolean v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    if-eqz v10, :cond_1

    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v11, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-eq v10, v11, :cond_1

    .line 1182
    :cond_0
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleDefault:Landroid/graphics/Bitmap;

    .line 1183
    .local v4, "outerCircle":Landroid/graphics/Bitmap;
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnDefault:Landroid/graphics/Bitmap;

    .line 1200
    .local v1, "innerCircle":Landroid/graphics/Bitmap;
    :goto_0
    iget v9, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    .line 1201
    .local v9, "width":I
    iget v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    .line 1203
    .local v0, "height":I
    iget v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    .line 1204
    .local v6, "squareWidth":F
    iget v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    .line 1206
    .local v5, "squareHeight":F
    int-to-float v10, v9

    sub-float v10, v6, v10

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v10, v11

    float-to-int v2, v10

    .line 1207
    .local v2, "offsetX":I
    int-to-float v10, v0

    sub-float v10, v5, v10

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v10, v11

    float-to-int v3, v10

    .line 1210
    .local v3, "offsetY":I
    iget v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    iget v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    int-to-float v11, v11

    div-float/2addr v10, v11

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v10, v11}, Ljava/lang/Math;->min(FF)F

    move-result v7

    .line 1211
    .local v7, "sx":F
    iget v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    iget v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    int-to-float v11, v11

    div-float/2addr v10, v11

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v10, v11}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 1213
    .local v8, "sy":F
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    add-int v11, p2, v2

    int-to-float v11, v11

    add-int v12, p3, v3

    int-to-float v12, v12

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1214
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    iget v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    iget v12, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    div-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1215
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v10, v7, v8}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 1216
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    iget v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    neg-int v11, v11

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    iget v12, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapHeight:I

    neg-int v12, v12

    div-int/lit8 v12, v12, 0x2

    int-to-float v12, v12

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1218
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    iget-object v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v10, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1219
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCircleMatrix:Landroid/graphics/Matrix;

    iget-object v11, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v10, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1220
    return-void

    .line 1184
    .end local v0    # "height":I
    .end local v1    # "innerCircle":Landroid/graphics/Bitmap;
    .end local v2    # "offsetX":I
    .end local v3    # "offsetY":I
    .end local v4    # "outerCircle":Landroid/graphics/Bitmap;
    .end local v5    # "squareHeight":F
    .end local v6    # "squareWidth":F
    .end local v7    # "sx":F
    .end local v8    # "sy":F
    .end local v9    # "width":I
    :cond_1
    iget-boolean v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    if-eqz v10, :cond_2

    .line 1186
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleGreen:Landroid/graphics/Bitmap;

    .line 1187
    .restart local v4    # "outerCircle":Landroid/graphics/Bitmap;
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnTouched:Landroid/graphics/Bitmap;

    .restart local v1    # "innerCircle":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 1188
    .end local v1    # "innerCircle":Landroid/graphics/Bitmap;
    .end local v4    # "outerCircle":Landroid/graphics/Bitmap;
    :cond_2
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v11, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v10, v11, :cond_3

    .line 1190
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleDefault:Landroid/graphics/Bitmap;

    .line 1191
    .restart local v4    # "outerCircle":Landroid/graphics/Bitmap;
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleRed:Landroid/graphics/Bitmap;

    .restart local v1    # "innerCircle":Landroid/graphics/Bitmap;
    goto :goto_0

    .line 1192
    .end local v1    # "innerCircle":Landroid/graphics/Bitmap;
    .end local v4    # "outerCircle":Landroid/graphics/Bitmap;
    :cond_3
    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v11, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-eq v10, v11, :cond_4

    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v11, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Animate:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v10, v11, :cond_5

    .line 1194
    :cond_4
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapCircleGreen:Landroid/graphics/Bitmap;

    .line 1195
    .restart local v4    # "outerCircle":Landroid/graphics/Bitmap;
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapBtnTouched:Landroid/graphics/Bitmap;

    .restart local v1    # "innerCircle":Landroid/graphics/Bitmap;
    goto/16 :goto_0

    .line 1197
    .end local v1    # "innerCircle":Landroid/graphics/Bitmap;
    .end local v4    # "outerCircle":Landroid/graphics/Bitmap;
    :cond_5
    new-instance v10, Ljava/lang/IllegalStateException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "unknown display mode "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    iget-object v12, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v10
.end method

.method private getBitmapFor(I)Landroid/graphics/Bitmap;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 316
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private getCenterXForColumn(I)F
    .locals 3
    .param p1, "column"    # I

    .prologue
    .line 967
    const/4 v0, 0x0

    int-to-float v1, p1

    iget v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private getCenterYForRow(I)F
    .locals 3
    .param p1, "row"    # I

    .prologue
    .line 971
    const/4 v0, 0x0

    int-to-float v1, p1

    iget v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private getColumnHit(F)I
    .locals 8
    .param p1, "x"    # F

    .prologue
    .line 712
    iget v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    .line 713
    .local v4, "squareWidth":F
    iget v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mHitFactor:F

    mul-float v1, v4, v5

    .line 715
    .local v1, "hitSize":F
    const/4 v5, 0x0

    sub-float v6, v4, v1

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float v3, v5, v6

    .line 716
    .local v3, "offset":F
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    const/4 v5, 0x3

    if-ge v2, v5, :cond_1

    .line 718
    int-to-float v5, v2

    mul-float/2addr v5, v4

    add-float v0, v3, v5

    .line 719
    .local v0, "hitLeft":F
    cmpl-float v5, p1, v0

    if-ltz v5, :cond_0

    add-float v5, v0, v1

    cmpg-float v5, p1, v5

    if-gtz v5, :cond_0

    .line 723
    .end local v0    # "hitLeft":F
    .end local v2    # "i":I
    :goto_1
    return v2

    .line 716
    .restart local v0    # "hitLeft":F
    .restart local v2    # "i":I
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 723
    .end local v0    # "hitLeft":F
    :cond_1
    const/4 v2, -0x1

    goto :goto_1
.end method

.method private getRowHit(F)I
    .locals 8
    .param p1, "y"    # F

    .prologue
    .line 690
    iget v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    .line 691
    .local v4, "squareHeight":F
    iget v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mHitFactor:F

    mul-float v0, v4, v5

    .line 693
    .local v0, "hitSize":F
    const/4 v5, 0x0

    sub-float v6, v4, v0

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float v3, v5, v6

    .line 694
    .local v3, "offset":F
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    const/4 v5, 0x3

    if-ge v2, v5, :cond_1

    .line 696
    int-to-float v5, v2

    mul-float/2addr v5, v4

    add-float v1, v3, v5

    .line 697
    .local v1, "hitTop":F
    cmpl-float v5, p1, v1

    if-ltz v5, :cond_0

    add-float v5, v1, v0

    cmpg-float v5, p1, v5

    if-gtz v5, :cond_0

    .line 701
    .end local v1    # "hitTop":F
    .end local v2    # "i":I
    :goto_1
    return v2

    .line 694
    .restart local v1    # "hitTop":F
    .restart local v2    # "i":I
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 701
    .end local v1    # "hitTop":F
    :cond_1
    const/4 v2, -0x1

    goto :goto_1
.end method

.method private handleActionDown(Landroid/view/MotionEvent;)V
    .locals 11
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    .line 934
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->resetPattern()V

    .line 935
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 936
    .local v5, "x":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 937
    .local v6, "y":F
    invoke-direct {p0, v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->detectAndAddHit(FF)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v1

    .line 938
    .local v1, "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    if-eqz v1, :cond_1

    .line 939
    const/4 v7, 0x1

    iput-boolean v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 940
    sget-object v7, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    iput-object v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .line 941
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyPatternStarted()V

    .line 946
    :goto_0
    if-eqz v1, :cond_0

    .line 947
    iget v7, v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    invoke-direct {p0, v7}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v2

    .line 948
    .local v2, "startX":F
    iget v7, v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    invoke-direct {p0, v7}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v3

    .line 950
    .local v3, "startY":F
    iget v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    div-float v4, v7, v8

    .line 951
    .local v4, "widthOffset":F
    iget v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    div-float v0, v7, v8

    .line 953
    .local v0, "heightOffset":F
    sub-float v7, v2, v4

    float-to-int v7, v7

    sub-float v8, v3, v0

    float-to-int v8, v8

    add-float v9, v2, v4

    float-to-int v9, v9

    add-float v10, v3, v0

    float-to-int v10, v10

    invoke-virtual {p0, v7, v8, v9, v10}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate(IIII)V

    .line 956
    .end local v0    # "heightOffset":F
    .end local v2    # "startX":F
    .end local v3    # "startY":F
    .end local v4    # "widthOffset":F
    :cond_0
    iput v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 957
    iput v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 964
    return-void

    .line 943
    :cond_1
    const/4 v7, 0x0

    iput-boolean v7, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 944
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyPatternCleared()V

    goto :goto_0
.end method

.method private handleActionMove(Landroid/view/MotionEvent;)V
    .locals 31
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 786
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v8

    .line 787
    .local v8, "historySize":I
    const/4 v10, 0x0

    .local v10, "i":I
    :goto_0
    add-int/lit8 v27, v8, 0x1

    move/from16 v0, v27

    if-ge v10, v0, :cond_d

    .line 788
    if-ge v10, v8, :cond_3

    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalX(I)F

    move-result v25

    .line 789
    .local v25, "x":F
    :goto_1
    if-ge v10, v8, :cond_4

    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalY(I)F

    move-result v26

    .line 790
    .local v26, "y":F
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    move-result v18

    .line 791
    .local v18, "patternSizePreHitDetect":I
    move-object/from16 v0, p0

    move/from16 v1, v25

    move/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->detectAndAddHit(FF)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    move-result-object v9

    .line 792
    .local v9, "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    move-result v17

    .line 793
    .local v17, "patternSize":I
    if-eqz v9, :cond_0

    const/16 v27, 0x1

    move/from16 v0, v17

    move/from16 v1, v27

    if-ne v0, v1, :cond_0

    .line 794
    const/16 v27, 0x1

    move/from16 v0, v27

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 795
    invoke-direct/range {p0 .. p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyPatternStarted()V

    .line 798
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    move/from16 v27, v0

    sub-float v27, v25, v27

    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 799
    .local v5, "dx":F
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    move/from16 v27, v0

    sub-float v27, v26, v27

    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 800
    .local v6, "dy":F
    add-float v27, v5, v6

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v28, v0

    const v29, 0x3c23d70a    # 0.01f

    mul-float v28, v28, v29

    cmpl-float v27, v27, v28

    if-lez v27, :cond_2

    .line 801
    move-object/from16 v0, p0

    iget v14, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 802
    .local v14, "oldX":F
    move-object/from16 v0, p0

    iget v15, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 804
    .local v15, "oldY":F
    move/from16 v0, v25

    move-object/from16 v1, p0

    iput v0, v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 805
    move/from16 v0, v26

    move-object/from16 v1, p0

    iput v0, v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 807
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    move/from16 v27, v0

    if-eqz v27, :cond_c

    if-lez v17, :cond_c

    .line 808
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    move-object/from16 v16, v0

    .line 809
    .local v16, "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v27, v0

    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mDiameterFactor:F

    move/from16 v28, v0

    mul-float v27, v27, v28

    const/high16 v28, 0x3f000000    # 0.5f

    mul-float v19, v27, v28

    .line 811
    .local v19, "radius":F
    add-int/lit8 v27, v17, -0x1

    move-object/from16 v0, v16

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 813
    .local v12, "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v0, v12, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v21

    .line 814
    .local v21, "startX":F
    iget v0, v12, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v22

    .line 821
    .local v22, "startY":F
    move-object/from16 v0, p0

    iget-object v11, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInvalidate:Landroid/graphics/Rect;

    .line 823
    .local v11, "invalidateRect":Landroid/graphics/Rect;
    cmpg-float v27, v21, v25

    if-gez v27, :cond_5

    .line 824
    move/from16 v13, v21

    .line 825
    .local v13, "left":F
    move/from16 v20, v25

    .line 831
    .local v20, "right":F
    :goto_3
    cmpg-float v27, v22, v26

    if-gez v27, :cond_6

    .line 832
    move/from16 v23, v22

    .line 833
    .local v23, "top":F
    move/from16 v4, v26

    .line 841
    .local v4, "bottom":F
    :goto_4
    sub-float v27, v13, v19

    move/from16 v0, v27

    float-to-int v0, v0

    move/from16 v27, v0

    sub-float v28, v23, v19

    move/from16 v0, v28

    float-to-int v0, v0

    move/from16 v28, v0

    add-float v29, v20, v19

    move/from16 v0, v29

    float-to-int v0, v0

    move/from16 v29, v0

    add-float v30, v4, v19

    move/from16 v0, v30

    float-to-int v0, v0

    move/from16 v30, v0

    move/from16 v0, v27

    move/from16 v1, v28

    move/from16 v2, v29

    move/from16 v3, v30

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 844
    cmpg-float v27, v21, v14

    if-gez v27, :cond_7

    .line 845
    move/from16 v13, v21

    .line 846
    move/from16 v20, v14

    .line 852
    :goto_5
    cmpg-float v27, v22, v15

    if-gez v27, :cond_8

    .line 853
    move/from16 v23, v22

    .line 854
    move v4, v15

    .line 862
    :goto_6
    sub-float v27, v13, v19

    move/from16 v0, v27

    float-to-int v0, v0

    move/from16 v27, v0

    sub-float v28, v23, v19

    move/from16 v0, v28

    float-to-int v0, v0

    move/from16 v28, v0

    add-float v29, v20, v19

    move/from16 v0, v29

    float-to-int v0, v0

    move/from16 v29, v0

    add-float v30, v4, v19

    move/from16 v0, v30

    float-to-int v0, v0

    move/from16 v30, v0

    move/from16 v0, v27

    move/from16 v1, v28

    move/from16 v2, v29

    move/from16 v3, v30

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Rect;->union(IIII)V

    .line 867
    if-eqz v9, :cond_1

    .line 868
    iget v0, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v21

    .line 869
    iget v0, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v22

    .line 871
    const/16 v27, 0x2

    move/from16 v0, v17

    move/from16 v1, v27

    if-lt v0, v1, :cond_b

    .line 873
    add-int/lit8 v27, v17, -0x1

    sub-int v28, v17, v18

    sub-int v27, v27, v28

    move-object/from16 v0, v16

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    .end local v9    # "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    check-cast v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 874
    .restart local v9    # "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v0, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v14

    .line 875
    iget v0, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v15

    .line 877
    cmpg-float v27, v21, v14

    if-gez v27, :cond_9

    .line 878
    move/from16 v13, v21

    .line 879
    move/from16 v20, v14

    .line 885
    :goto_7
    cmpg-float v27, v22, v15

    if-gez v27, :cond_a

    .line 886
    move/from16 v23, v22

    .line 887
    move v4, v15

    .line 897
    :goto_8
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v27, v0

    const/high16 v28, 0x40000000    # 2.0f

    div-float v24, v27, v28

    .line 898
    .local v24, "widthOffset":F
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    move/from16 v27, v0

    const/high16 v28, 0x40000000    # 2.0f

    div-float v7, v27, v28

    .line 900
    .local v7, "heightOffset":F
    sub-float v27, v13, v24

    move/from16 v0, v27

    float-to-int v0, v0

    move/from16 v27, v0

    sub-float v28, v23, v7

    move/from16 v0, v28

    float-to-int v0, v0

    move/from16 v28, v0

    add-float v29, v20, v24

    move/from16 v0, v29

    float-to-int v0, v0

    move/from16 v29, v0

    add-float v30, v4, v7

    move/from16 v0, v30

    float-to-int v0, v0

    move/from16 v30, v0

    move/from16 v0, v27

    move/from16 v1, v28

    move/from16 v2, v29

    move/from16 v3, v30

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 904
    .end local v7    # "heightOffset":F
    .end local v24    # "widthOffset":F
    :cond_1
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate(Landroid/graphics/Rect;)V

    .line 787
    .end local v4    # "bottom":F
    .end local v11    # "invalidateRect":Landroid/graphics/Rect;
    .end local v12    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v13    # "left":F
    .end local v14    # "oldX":F
    .end local v15    # "oldY":F
    .end local v16    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    .end local v19    # "radius":F
    .end local v20    # "right":F
    .end local v21    # "startX":F
    .end local v22    # "startY":F
    .end local v23    # "top":F
    :cond_2
    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 788
    .end local v5    # "dx":F
    .end local v6    # "dy":F
    .end local v9    # "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v17    # "patternSize":I
    .end local v18    # "patternSizePreHitDetect":I
    .end local v25    # "x":F
    .end local v26    # "y":F
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v25

    goto/16 :goto_1

    .line 789
    .restart local v25    # "x":F
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v26

    goto/16 :goto_2

    .line 827
    .restart local v5    # "dx":F
    .restart local v6    # "dy":F
    .restart local v9    # "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v11    # "invalidateRect":Landroid/graphics/Rect;
    .restart local v12    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v14    # "oldX":F
    .restart local v15    # "oldY":F
    .restart local v16    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    .restart local v17    # "patternSize":I
    .restart local v18    # "patternSizePreHitDetect":I
    .restart local v19    # "radius":F
    .restart local v21    # "startX":F
    .restart local v22    # "startY":F
    .restart local v26    # "y":F
    :cond_5
    move/from16 v13, v25

    .line 828
    .restart local v13    # "left":F
    move/from16 v20, v21

    .restart local v20    # "right":F
    goto/16 :goto_3

    .line 835
    :cond_6
    move/from16 v23, v26

    .line 836
    .restart local v23    # "top":F
    move/from16 v4, v22

    .restart local v4    # "bottom":F
    goto/16 :goto_4

    .line 848
    :cond_7
    move v13, v14

    .line 849
    move/from16 v20, v21

    goto/16 :goto_5

    .line 856
    :cond_8
    move/from16 v23, v15

    .line 857
    move/from16 v4, v22

    goto/16 :goto_6

    .line 881
    :cond_9
    move v13, v14

    .line 882
    move/from16 v20, v21

    goto :goto_7

    .line 889
    :cond_a
    move/from16 v23, v15

    .line 890
    move/from16 v4, v22

    goto :goto_8

    .line 893
    :cond_b
    move/from16 v20, v21

    move/from16 v13, v21

    .line 894
    move/from16 v4, v22

    move/from16 v23, v22

    goto :goto_8

    .line 906
    .end local v4    # "bottom":F
    .end local v11    # "invalidateRect":Landroid/graphics/Rect;
    .end local v12    # "lastCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v13    # "left":F
    .end local v16    # "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    .end local v19    # "radius":F
    .end local v20    # "right":F
    .end local v21    # "startX":F
    .end local v22    # "startY":F
    .end local v23    # "top":F
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    goto :goto_9

    .line 910
    .end local v5    # "dx":F
    .end local v6    # "dy":F
    .end local v9    # "hitCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v14    # "oldX":F
    .end local v15    # "oldY":F
    .end local v17    # "patternSize":I
    .end local v18    # "patternSizePreHitDetect":I
    .end local v25    # "x":F
    .end local v26    # "y":F
    :cond_d
    return-void
.end method

.method private handleActionUp(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 920
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 921
    const/4 v0, 0x0

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 922
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyPatternDetected()V

    .line 923
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    .line 931
    :cond_0
    return-void
.end method

.method private notifyCellAdded()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    .line 433
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    if-eqz v4, :cond_0

    .line 434
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-interface {v4, v5}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternCellAdded(Ljava/util/List;)V

    .line 436
    :cond_0
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-static {v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToStringValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    .line 437
    .local v3, "patternValue":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "key"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 439
    .local v0, "audiofilename":Ljava/lang/String;
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    .line 446
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v7, :cond_4

    .line 447
    iget-object v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 448
    const-string v4, "isAccessibilityEnabled"

    const-string v5, "true"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    :try_start_0
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getContext()Landroid/content/Context;

    move-result-object v5

    const-class v4, Lgroup/pals/android/lib/ui/lockpattern/R$raw;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v5, v4}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v2

    .line 453
    .local v2, "mediaPlayer":Landroid/media/MediaPlayer;
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2

    .line 477
    .end local v2    # "mediaPlayer":Landroid/media/MediaPlayer;
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    .line 478
    return-void

    .line 442
    :cond_3
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v7, :cond_1

    goto :goto_0

    .line 454
    :catch_0
    move-exception v1

    .line 456
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    const-string v4, "LockPatternView"

    const-string v5, "IllegalArgumentException in MediaPlayer attempt to play tone for pattern for accessibility"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 457
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v1

    .line 459
    .local v1, "e":Ljava/lang/IllegalAccessException;
    const-string v4, "LockPatternView"

    const-string v5, "IllegalAccessException in MediaPlayer attempt to play tone for pattern for accessibility"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 460
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v1

    .line 462
    .local v1, "e":Ljava/lang/NoSuchFieldException;
    const-string v4, "LockPatternView"

    const-string v5, "NoSuchFieldException in MediaPlayer attempt to play tone for pattern for accessibility"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 466
    .end local v1    # "e":Ljava/lang/NoSuchFieldException;
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 467
    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->sendAccessibilityEvent(I)V

    goto :goto_1
.end method

.method private notifyPatternCleared()V
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    invoke-interface {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternCleared()V

    .line 502
    :cond_0
    sget v0, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_lockscreen_access_pattern_cleared:I

    invoke-virtual {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->sendAccessEvent(I)V

    .line 503
    return-void
.end method

.method private notifyPatternDetected()V
    .locals 2

    .prologue
    .line 492
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    if-eqz v0, :cond_0

    .line 493
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternDetected(Ljava/util/List;)V

    .line 496
    :cond_0
    return-void
.end method

.method private notifyPatternStarted()V
    .locals 3

    .prologue
    .line 481
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    if-eqz v1, :cond_0

    .line 482
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    invoke-interface {v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;->onPatternStart()V

    .line 484
    :cond_0
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-static {v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToStringValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 486
    .local v0, "patternValue":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pattern started at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 487
    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->sendAccessibilityEvent(I)V

    .line 489
    return-void
.end method

.method private resetPattern()V
    .locals 1

    .prologue
    .line 516
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 517
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPatternDrawLookup()V

    .line 518
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    iput-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .line 519
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    .line 520
    return-void
.end method

.method private resolveMeasured(II)I
    .locals 3
    .param p1, "measureSpec"    # I
    .param p2, "desired"    # I

    .prologue
    .line 558
    const/4 v0, 0x0

    .line 559
    .local v0, "result":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 560
    .local v1, "specSize":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    .line 569
    move v0, v1

    .line 571
    :goto_0
    return v0

    .line 562
    :sswitch_0
    move v0, p2

    .line 563
    goto :goto_0

    .line 565
    :sswitch_1
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 566
    goto :goto_0

    .line 560
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public clearPattern()V
    .locals 0

    .prologue
    .line 509
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->resetPattern()V

    .line 510
    return-void
.end method

.method public disableInput()V
    .locals 1

    .prologue
    .line 538
    const/4 v0, 0x0

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    .line 539
    return-void
.end method

.method public enableInput()V
    .locals 1

    .prologue
    .line 545
    const/4 v0, 0x1

    iput-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    .line 546
    return-void
.end method

.method public getDisplayMode()Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;
    .locals 1

    .prologue
    .line 417
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    return-object v0
.end method

.method public getPattern()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;"
        }
    .end annotation

    .prologue
    .line 429
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method protected getSuggestedMinimumHeight()I
    .locals 1

    .prologue
    .line 583
    iget v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    mul-int/lit8 v0, v0, 0x3

    return v0
.end method

.method protected getSuggestedMinimumWidth()I
    .locals 1

    .prologue
    .line 577
    iget v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mBitmapWidth:I

    mul-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public isInStealthMode()Z
    .locals 1

    .prologue
    .line 323
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    return v0
.end method

.method public isTactileFeedbackEnabled()Z
    .locals 1

    .prologue
    .line 330
    iget-boolean v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 38
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 976
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    move-object/from16 v29, v0

    .line 977
    .local v29, "pattern":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->size()I

    move-result v13

    .line 978
    .local v13, "count":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    move-object/from16 v16, v0

    .line 980
    .local v16, "drawLookup":[[Z
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Animate:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v4, v5, :cond_2

    .line 985
    add-int/lit8 v4, v13, 0x1

    mul-int/lit16 v0, v4, 0x2bc

    move/from16 v26, v0

    .line 986
    .local v26, "oneCycle":I
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    move-object/from16 v0, p0

    iget-wide v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAnimatingPeriodStart:J

    move-wide/from16 v36, v0

    sub-long v4, v4, v36

    long-to-int v4, v4

    rem-int v32, v4, v26

    .line 987
    .local v32, "spotInCycle":I
    move/from16 v0, v32

    div-int/lit16 v0, v0, 0x2bc

    move/from16 v24, v0

    .line 989
    .local v24, "numCircles":I
    invoke-direct/range {p0 .. p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPatternDrawLookup()V

    .line 990
    const/16 v20, 0x0

    .local v20, "i":I
    :goto_0
    move/from16 v0, v20

    move/from16 v1, v24

    if-ge v0, v1, :cond_0

    .line 991
    move-object/from16 v0, v29

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 992
    .local v8, "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    invoke-virtual {v8}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v4

    aget-object v4, v16, v4

    invoke-virtual {v8}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v5

    const/16 v35, 0x1

    aput-boolean v35, v4, v5

    .line 990
    add-int/lit8 v20, v20, 0x1

    goto :goto_0

    .line 997
    .end local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_0
    if-lez v24, :cond_9

    move/from16 v0, v24

    if-ge v0, v13, :cond_9

    const/16 v22, 0x1

    .line 999
    .local v22, "needToUpdateInProgressPoint":Z
    :goto_1
    if-eqz v22, :cond_1

    .line 1000
    move/from16 v0, v32

    rem-int/lit16 v4, v0, 0x2bc

    int-to-float v4, v4

    const/high16 v5, 0x442f0000    # 700.0f

    div-float v30, v4, v5

    .line 1003
    .local v30, "percentageOfNextCircle":F
    add-int/lit8 v4, v24, -0x1

    move-object/from16 v0, v29

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 1004
    .local v14, "currentCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v4, v14, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v11

    .line 1005
    .local v11, "centerX":F
    iget v4, v14, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v12

    .line 1007
    .local v12, "centerY":F
    move-object/from16 v0, v29

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 1008
    .local v23, "nextCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    move-object/from16 v0, v23

    iget v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v4

    sub-float/2addr v4, v11

    mul-float v18, v30, v4

    .line 1009
    .local v18, "dx":F
    move-object/from16 v0, v23

    iget v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v4

    sub-float/2addr v4, v12

    mul-float v19, v30, v4

    .line 1010
    .local v19, "dy":F
    add-float v4, v11, v18

    move-object/from16 v0, p0

    iput v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 1011
    add-float v4, v12, v19

    move-object/from16 v0, p0

    iput v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 1014
    .end local v11    # "centerX":F
    .end local v12    # "centerY":F
    .end local v14    # "currentCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v18    # "dx":F
    .end local v19    # "dy":F
    .end local v23    # "nextCell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v30    # "percentageOfNextCircle":F
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    .line 1017
    .end local v20    # "i":I
    .end local v22    # "needToUpdateInProgressPoint":Z
    .end local v24    # "numCircles":I
    .end local v26    # "oneCycle":I
    .end local v32    # "spotInCycle":I
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    move/from16 v34, v0

    .line 1018
    .local v34, "squareWidth":F
    move-object/from16 v0, p0

    iget v0, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    move/from16 v33, v0

    .line 1020
    .local v33, "squareHeight":F
    move-object/from16 v0, p0

    iget v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mDiameterFactor:F

    mul-float v4, v4, v34

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v31, v4, v5

    .line 1021
    .local v31, "radius":F
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    move/from16 v0, v31

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1023
    move-object/from16 v0, p0

    iget-object v15, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mCurrentPath:Landroid/graphics/Path;

    .line 1024
    .local v15, "currentPath":Landroid/graphics/Path;
    invoke-virtual {v15}, Landroid/graphics/Path;->rewind()V

    .line 1027
    const/16 v28, 0x0

    .line 1028
    .local v28, "paddingTop":I
    const/16 v27, 0x0

    .line 1045
    .local v27, "paddingLeft":I
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    if-eqz v4, :cond_3

    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v4, v5, :cond_a

    :cond_3
    const/16 v17, 0x1

    .line 1050
    .local v17, "drawPath":Z
    :goto_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v4

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_b

    const/16 v25, 0x1

    .line 1051
    .local v25, "oldFlag":Z
    :goto_3
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1053
    if-eqz v17, :cond_4

    .line 1054
    const/16 v20, 0x0

    .restart local v20    # "i":I
    :goto_4
    add-int/lit8 v4, v13, -0x1

    move/from16 v0, v20

    if-ge v0, v4, :cond_4

    .line 1055
    move-object/from16 v0, v29

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 1056
    .restart local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    add-int/lit8 v4, v20, 0x1

    move-object/from16 v0, v29

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 1061
    .local v9, "next":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v4, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    aget-object v4, v16, v4

    iget v5, v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    aget-boolean v4, v4, v5

    if-nez v4, :cond_c

    .line 1072
    .end local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v9    # "next":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v20    # "i":I
    :cond_4
    if-eqz v17, :cond_8

    .line 1073
    const/4 v10, 0x0

    .line 1074
    .local v10, "anyCircles":Z
    const/16 v20, 0x0

    .restart local v20    # "i":I
    :goto_5
    move/from16 v0, v20

    if-ge v0, v13, :cond_5

    .line 1075
    move-object/from16 v0, v29

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 1080
    .restart local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget v4, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    aget-object v4, v16, v4

    iget v5, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    aget-boolean v4, v4, v5

    if-nez v4, :cond_d

    .line 1095
    .end local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    if-nez v4, :cond_6

    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Animate:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v4, v5, :cond_7

    :cond_6
    if-eqz v10, :cond_7

    .line 1096
    move-object/from16 v0, p0

    iget v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    move-object/from16 v0, p0

    iget v5, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    invoke-virtual {v15, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1099
    :cond_7
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne v4, v5, :cond_f

    .line 1101
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget v5, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mErrorLineColor:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 1107
    :goto_6
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v15, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1110
    .end local v10    # "anyCircles":Z
    .end local v20    # "i":I
    :cond_8
    const/16 v20, 0x0

    .restart local v20    # "i":I
    :goto_7
    const/4 v4, 0x3

    move/from16 v0, v20

    if-ge v0, v4, :cond_11

    .line 1111
    const/4 v4, 0x0

    move/from16 v0, v20

    int-to-float v5, v0

    mul-float v5, v5, v33

    add-float v7, v4, v5

    .line 1114
    .local v7, "topY":F
    const/16 v21, 0x0

    .local v21, "j":I
    :goto_8
    const/4 v4, 0x3

    move/from16 v0, v21

    if-ge v0, v4, :cond_10

    .line 1115
    const/4 v4, 0x0

    move/from16 v0, v21

    int-to-float v5, v0

    mul-float v5, v5, v34

    add-float v6, v4, v5

    .line 1116
    .local v6, "leftX":F
    float-to-int v4, v6

    float-to-int v5, v7

    aget-object v35, v16, v20

    aget-boolean v35, v35, v21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v35

    invoke-direct {v0, v1, v4, v5, v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->drawCircle(Landroid/graphics/Canvas;IIZ)V

    .line 1114
    add-int/lit8 v21, v21, 0x1

    goto :goto_8

    .line 997
    .end local v6    # "leftX":F
    .end local v7    # "topY":F
    .end local v15    # "currentPath":Landroid/graphics/Path;
    .end local v17    # "drawPath":Z
    .end local v21    # "j":I
    .end local v25    # "oldFlag":Z
    .end local v27    # "paddingLeft":I
    .end local v28    # "paddingTop":I
    .end local v31    # "radius":F
    .end local v33    # "squareHeight":F
    .end local v34    # "squareWidth":F
    .restart local v24    # "numCircles":I
    .restart local v26    # "oneCycle":I
    .restart local v32    # "spotInCycle":I
    :cond_9
    const/16 v22, 0x0

    goto/16 :goto_1

    .line 1045
    .end local v20    # "i":I
    .end local v24    # "numCircles":I
    .end local v26    # "oneCycle":I
    .end local v32    # "spotInCycle":I
    .restart local v15    # "currentPath":Landroid/graphics/Path;
    .restart local v27    # "paddingLeft":I
    .restart local v28    # "paddingTop":I
    .restart local v31    # "radius":F
    .restart local v33    # "squareHeight":F
    .restart local v34    # "squareWidth":F
    :cond_a
    const/16 v17, 0x0

    goto/16 :goto_2

    .line 1050
    .restart local v17    # "drawPath":Z
    :cond_b
    const/16 v25, 0x0

    goto/16 :goto_3

    .line 1065
    .restart local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v9    # "next":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v20    # "i":I
    .restart local v25    # "oldFlag":Z
    :cond_c
    const/4 v4, 0x0

    iget v5, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    int-to-float v5, v5

    mul-float v5, v5, v34

    add-float v6, v4, v5

    .line 1066
    .restart local v6    # "leftX":F
    const/4 v4, 0x0

    iget v5, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    int-to-float v5, v5

    mul-float v5, v5, v33

    add-float v7, v4, v5

    .restart local v7    # "topY":F
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    .line 1068
    invoke-direct/range {v4 .. v9}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->drawArrow(Landroid/graphics/Canvas;FFLgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;)V

    .line 1054
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_4

    .line 1083
    .end local v6    # "leftX":F
    .end local v7    # "topY":F
    .end local v9    # "next":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .restart local v10    # "anyCircles":Z
    :cond_d
    const/4 v10, 0x1

    .line 1085
    iget v4, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->column:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v11

    .line 1086
    .restart local v11    # "centerX":F
    iget v4, v8, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->row:I

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v12

    .line 1087
    .restart local v12    # "centerY":F
    if-nez v20, :cond_e

    .line 1088
    invoke-virtual {v15, v11, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1074
    :goto_9
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_5

    .line 1090
    :cond_e
    invoke-virtual {v15, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_9

    .line 1105
    .end local v8    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    .end local v11    # "centerX":F
    .end local v12    # "centerY":F
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPathPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget v5, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mLineColor:I

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    goto/16 :goto_6

    .line 1110
    .end local v10    # "anyCircles":Z
    .restart local v7    # "topY":F
    .restart local v21    # "j":I
    :cond_10
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_7

    .line 1120
    .end local v7    # "topY":F
    .end local v21    # "j":I
    :cond_11
    move-object/from16 v0, p0

    iget-object v4, v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPaint:Landroid/graphics/Paint;

    move/from16 v0, v25

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1121
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 588
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getSuggestedMinimumWidth()I

    move-result v1

    .line 589
    .local v1, "minimumWidth":I
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getSuggestedMinimumHeight()I

    move-result v0

    .line 590
    .local v0, "minimumHeight":I
    invoke-direct {p0, p1, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->resolveMeasured(II)I

    move-result v3

    .line 591
    .local v3, "viewWidth":I
    invoke-direct {p0, p2, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->resolveMeasured(II)I

    move-result v2

    .line 593
    .local v2, "viewHeight":I
    iget v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAspect:I

    packed-switch v4, :pswitch_data_0

    .line 604
    :goto_0
    invoke-virtual {p0, v3, v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setMeasuredDimension(II)V

    .line 605
    return-void

    .line 595
    :pswitch_0
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    move v3, v2

    .line 596
    goto :goto_0

    .line 598
    :pswitch_1
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 599
    goto :goto_0

    .line 601
    :pswitch_2
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_0

    .line 593
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3
    .param p1, "state"    # Landroid/os/Parcelable;

    .prologue
    .line 1231
    move-object v0, p1

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;

    .line 1232
    .local v0, "ss":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1233
    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Correct:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->getSerializedPattern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->stringToPattern(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;Ljava/util/List;)V

    .line 1234
    invoke-static {}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->values()[Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    move-result-object v1

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->getDisplayMode()I

    move-result v2

    aget-object v1, v1, v2

    iput-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .line 1235
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->isInputEnabled()Z

    move-result v1

    iput-boolean v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    .line 1236
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->isInStealthMode()Z

    move-result v1

    iput-boolean v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    .line 1237
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;->isTactileFeedbackEnabled()Z

    move-result v1

    iput-boolean v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    .line 1238
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 8

    .prologue
    .line 1224
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 1225
    .local v1, "superState":Landroid/os/Parcelable;
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;

    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-static {v2}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v3}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->ordinal()I

    move-result v3

    iget-boolean v4, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    iget-boolean v5, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    iget-boolean v6, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$SavedState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;IZZZLgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$1;)V

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 4
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "oldw"    # I
    .param p4, "oldh"    # I

    .prologue
    const/high16 v3, 0x40400000    # 3.0f

    .line 550
    add-int/lit8 v2, p1, 0x0

    add-int/lit8 v1, v2, 0x0

    .line 551
    .local v1, "width":I
    int-to-float v2, v1

    div-float/2addr v2, v3

    iput v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareWidth:F

    .line 553
    add-int/lit8 v2, p2, 0x0

    add-int/lit8 v0, v2, 0x0

    .line 554
    .local v0, "height":I
    int-to-float v2, v0

    div-float/2addr v2, v3

    iput v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mSquareHeight:F

    .line 555
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 753
    iget-boolean v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInputEnabled:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move v0, v1

    .line 779
    :goto_0
    return v0

    .line 757
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    move v0, v1

    .line 779
    goto :goto_0

    .line 759
    :pswitch_0
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->handleActionDown(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 762
    :pswitch_1
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->handleActionUp(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 765
    :pswitch_2
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->handleActionMove(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 768
    :pswitch_3
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->resetPattern()V

    .line 769
    iput-boolean v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternInProgress:Z

    .line 770
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->notifyPatternCleared()V

    goto :goto_0

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public sendAccessEvent(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 913
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 914
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->sendAccessibilityEvent(I)V

    .line 915
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 916
    return-void
.end method

.method public setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V
    .locals 4
    .param p1, "displayMode"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .prologue
    .line 394
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDisplayMode:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    .line 395
    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Animate:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    if-ne p1, v1, :cond_1

    .line 396
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 397
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "you must have a pattern to animate if you want to set the display mode to animate"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 400
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mAnimatingPeriodStart:J

    .line 401
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 402
    .local v0, "first":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v1

    invoke-direct {p0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterXForColumn(I)F

    move-result v1

    iput v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressX:F

    .line 403
    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v1

    invoke-direct {p0, v1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getCenterYForRow(I)F

    move-result v1

    iput v1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInProgressY:F

    .line 404
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPatternDrawLookup()V

    .line 406
    .end local v0    # "first":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_1
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->invalidate()V

    .line 407
    return-void
.end method

.method public setInStealthMode(Z)V
    .locals 0
    .param p1, "inStealthMode"    # Z

    .prologue
    .line 341
    iput-boolean p1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mInStealthMode:Z

    .line 342
    return-void
.end method

.method public setOnPatternListener(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;)V
    .locals 0
    .param p1, "onPatternListener"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    .prologue
    .line 362
    iput-object p1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mOnPatternListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    .line 363
    return-void
.end method

.method public setPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;Ljava/util/List;)V
    .locals 5
    .param p1, "displayMode"    # Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 375
    .local p2, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 376
    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPattern:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 377
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPatternDrawLookup()V

    .line 378
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;

    .line 379
    .local v0, "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mPatternDrawLookup:[[Z

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getRow()I

    move-result v3

    aget-object v2, v2, v3

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;->getColumn()I

    move-result v3

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    goto :goto_0

    .line 382
    .end local v0    # "cell":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
    :cond_0
    invoke-virtual {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    .line 383
    return-void
.end method

.method public setTactileFeedbackEnabled(Z)V
    .locals 0
    .param p1, "tactileFeedbackEnabled"    # Z

    .prologue
    .line 352
    iput-boolean p1, p0, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->mEnableHapticFeedback:Z

    .line 353
    return-void
.end method
