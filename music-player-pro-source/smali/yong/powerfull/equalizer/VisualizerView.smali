.class public Lyong/powerfull/equalizer/VisualizerView;
.super Landroid/view/View;
.source "VisualizerView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field private final ACCELERATION:I

.field private final REFRESH_TIME:I

.field private final TIMES_MAX:I

.field private canDrawLines:Z

.field private error:Z

.field private errorPaint:Landroid/graphics/Paint;

.field private linesArray:[F

.field private linesPaint:Landroid/graphics/Paint;

.field private mBytes:[B

.field private mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private mRect:Landroid/graphics/Rect;

.field private mSpectrumNum:I

.field private mVisualizer:Landroid/media/audiofx/Visualizer;

.field private pointsArray:[F

.field private pointsPaint:Landroid/graphics/Paint;

.field private runnable:Ljava/lang/Runnable;

.field private tempArray:[F

.field private times:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 32
    const/16 v0, 0x64

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->REFRESH_TIME:I

    .line 33
    const/16 v0, 0xa

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->TIMES_MAX:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->ACCELERATION:I

    .line 36
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 37
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    .line 39
    const/16 v0, 0x30

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    .line 40
    iput v2, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    .line 42
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    .line 43
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    .line 45
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    .line 46
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    .line 47
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    .line 48
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    .line 50
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    .line 51
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    .line 52
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    .line 53
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    .line 55
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 199
    new-instance v0, Lyong/powerfull/equalizer/VisualizerView$1;

    invoke-direct {v0, p0}, Lyong/powerfull/equalizer/VisualizerView$1;-><init>(Lyong/powerfull/equalizer/VisualizerView;)V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    .line 60
    invoke-direct {p0}, Lyong/powerfull/equalizer/VisualizerView;->init()V

    .line 61
    iput-object p1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    const/16 v0, 0x64

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->REFRESH_TIME:I

    .line 33
    const/16 v0, 0xa

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->TIMES_MAX:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->ACCELERATION:I

    .line 36
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 37
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    .line 39
    const/16 v0, 0x30

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    .line 40
    iput v2, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    .line 42
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    .line 43
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    .line 45
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    .line 46
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    .line 47
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    .line 48
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    .line 50
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    .line 51
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    .line 52
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    .line 53
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    .line 55
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 199
    new-instance v0, Lyong/powerfull/equalizer/VisualizerView$1;

    invoke-direct {v0, p0}, Lyong/powerfull/equalizer/VisualizerView$1;-><init>(Lyong/powerfull/equalizer/VisualizerView;)V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    .line 67
    invoke-direct {p0}, Lyong/powerfull/equalizer/VisualizerView;->init()V

    .line 68
    iput-object p1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/16 v0, 0x64

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->REFRESH_TIME:I

    .line 33
    const/16 v0, 0xa

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->TIMES_MAX:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->ACCELERATION:I

    .line 36
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 37
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    .line 39
    const/16 v0, 0x30

    iput v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    .line 40
    iput v2, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    .line 42
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    .line 43
    iput-boolean v2, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    .line 45
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    .line 46
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    .line 47
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    .line 48
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    .line 50
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    .line 51
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    .line 52
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    .line 53
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    .line 55
    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 199
    new-instance v0, Lyong/powerfull/equalizer/VisualizerView$1;

    invoke-direct {v0, p0}, Lyong/powerfull/equalizer/VisualizerView$1;-><init>(Lyong/powerfull/equalizer/VisualizerView;)V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    .line 74
    invoke-direct {p0}, Lyong/powerfull/equalizer/VisualizerView;->init()V

    .line 75
    iput-object p1, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    .line 76
    return-void
.end method

.method static synthetic access$0(Lyong/powerfull/equalizer/VisualizerView;)I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    return v0
.end method

.method static synthetic access$1(Lyong/powerfull/equalizer/VisualizerView;)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0}, Lyong/powerfull/equalizer/VisualizerView;->initByte()V

    return-void
.end method

.method static synthetic access$2(Lyong/powerfull/equalizer/VisualizerView;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$3(Lyong/powerfull/equalizer/VisualizerView;I)V
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    return-void
.end method

.method static synthetic access$4(Lyong/powerfull/equalizer/VisualizerView;[B)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1}, Lyong/powerfull/equalizer/VisualizerView;->updateVisualizer([B)V

    return-void
.end method

.method private freeFall(F)F
    .locals 3
    .param p1, "time"    # F

    .prologue
    .line 195
    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v0, v1, v2

    .line 196
    .local v0, "h":F
    return v0
.end method

.method private init()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/high16 v3, 0x40a00000    # 5.0f

    const/16 v2, 0xff

    .line 146
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    .line 147
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    .line 149
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    .line 150
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 151
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 152
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    const/16 v1, 0xe6

    invoke-static {v1, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 154
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    .line 155
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 156
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 157
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    const/16 v1, 0x82

    invoke-static {v1, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    invoke-direct {p0}, Lyong/powerfull/equalizer/VisualizerView;->initByte()V

    .line 160
    return-void
.end method

.method private initByte()V
    .locals 3

    .prologue
    .line 166
    iget v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    new-array v1, v1, [B

    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    .line 167
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    if-lt v0, v1, :cond_0

    .line 170
    return-void

    .line 168
    :cond_0
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    const/4 v2, 0x0

    aput-byte v2, v1, v0

    .line 167
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private updateVisualizer([B)V
    .locals 8
    .param p1, "mbyte"    # [B

    .prologue
    const/4 v4, 0x0

    .line 174
    array-length v3, p1

    div-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    new-array v2, v3, [B

    .line 176
    .local v2, "model":[B
    aget-byte v3, p1, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    .line 177
    const/4 v0, 0x2

    .local v0, "i":I
    const/4 v1, 0x1

    .local v1, "j":I
    :goto_0
    iget v3, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    if-lt v1, v3, :cond_0

    .line 183
    iput-object v2, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    .line 184
    invoke-virtual {p0}, Lyong/powerfull/equalizer/VisualizerView;->invalidate()V

    .line 185
    return-void

    .line 178
    :cond_0
    aget-byte v3, p1, v0

    int-to-double v4, v3

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p1, v3

    int-to-double v6, v3

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-int v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 179
    add-int/lit8 v0, v0, 0x2

    .line 180
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    .line 313
    :try_start_0
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 314
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    :goto_0
    return-void

    .line 315
    :catch_0
    move-exception v0

    .line 317
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/4 v13, 0x0

    .line 218
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 220
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    if-nez v10, :cond_0

    .line 307
    :goto_0
    return-void

    .line 224
    :cond_0
    iget-boolean v10, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    if-eqz v10, :cond_1

    .line 225
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mContext:Landroid/content/Context;

    const v11, 0x7f08009c

    invoke-virtual {v10, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 226
    .local v5, "s":Ljava/lang/String;
    invoke-virtual {p0}, Lyong/powerfull/equalizer/VisualizerView;->getWidth()I

    move-result v10

    div-int/lit8 v10, v10, 0x2

    int-to-float v10, v10

    iget-object v11, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    invoke-virtual {v11, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v11

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    sub-float/2addr v10, v11

    .line 227
    invoke-virtual {p0}, Lyong/powerfull/equalizer/VisualizerView;->getHeight()I

    move-result v11

    div-int/lit8 v11, v11, 0x2

    int-to-float v11, v11

    iget-object v12, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    .line 226
    invoke-virtual {p1, v5, v10, v11, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 231
    .end local v5    # "s":Ljava/lang/String;
    :cond_1
    iget v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    mul-int/lit8 v4, v10, 0x4

    .line 232
    .local v4, "length":I
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    if-eqz v10, :cond_2

    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    array-length v10, v10

    if-ge v10, v4, :cond_3

    .line 233
    :cond_2
    new-array v10, v4, [F

    iput-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    .line 235
    :cond_3
    iget v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    mul-int/lit8 v4, v10, 0x2

    .line 236
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    if-eqz v10, :cond_4

    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    array-length v10, v10

    if-ge v10, v4, :cond_5

    .line 237
    :cond_4
    new-array v10, v4, [F

    iput-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    .line 239
    :cond_5
    iget v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    mul-int/lit8 v4, v10, 0x3

    .line 240
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    if-eqz v10, :cond_6

    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    array-length v10, v10

    if-ge v10, v4, :cond_7

    .line 241
    :cond_6
    new-array v10, v4, [F

    iput-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    .line 242
    const/4 v3, 0x0

    .local v3, "l":I
    :goto_1
    if-lt v3, v4, :cond_9

    .line 250
    .end local v3    # "l":I
    :cond_7
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lyong/powerfull/equalizer/VisualizerView;->getWidth()I

    move-result v11

    invoke-virtual {p0}, Lyong/powerfull/equalizer/VisualizerView;->getHeight()I

    move-result v12

    invoke-virtual {v10, v13, v13, v11, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 265
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    iget v11, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    div-int v0, v10, v11

    .line 266
    .local v0, "baseX":I
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mRect:Landroid/graphics/Rect;

    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 268
    .local v1, "height":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    iget v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mSpectrumNum:I

    if-lt v2, v10, :cond_b

    .line 303
    iget-boolean v10, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    if-eqz v10, :cond_8

    .line 304
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    iget-object v11, p0, Lyong/powerfull/equalizer/VisualizerView;->linesPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v11}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 306
    :cond_8
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    iget-object v11, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v10, v11}, Landroid/graphics/Canvas;->drawPoints([FLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 243
    .end local v0    # "baseX":I
    .end local v1    # "height":I
    .end local v2    # "i":I
    .restart local v3    # "l":I
    :cond_9
    rem-int/lit8 v10, v3, 0x3

    if-nez v10, :cond_a

    .line 242
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 246
    :cond_a
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    const/high16 v11, 0x44800000    # 1024.0f

    aput v11, v10, v3

    goto :goto_3

    .line 269
    .end local v3    # "l":I
    .restart local v0    # "baseX":I
    .restart local v1    # "height":I
    .restart local v2    # "i":I
    :cond_b
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    aget-byte v10, v10, v2

    if-gez v10, :cond_c

    .line 270
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    const/16 v11, 0x7f

    aput-byte v11, v10, v2

    .line 273
    :cond_c
    mul-int v10, v0, v2

    div-int/lit8 v11, v0, 0x2

    add-int v8, v10, v11

    .line 275
    .local v8, "x":I
    iget-boolean v10, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    if-eqz v10, :cond_d

    .line 277
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    mul-int/lit8 v11, v2, 0x4

    int-to-float v12, v8

    aput v12, v10, v11

    .line 278
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    mul-int/lit8 v11, v2, 0x4

    add-int/lit8 v11, v11, 0x1

    int-to-float v12, v1

    aput v12, v10, v11

    .line 279
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    mul-int/lit8 v11, v2, 0x4

    add-int/lit8 v11, v11, 0x2

    int-to-float v12, v8

    aput v12, v10, v11

    .line 280
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->linesArray:[F

    mul-int/lit8 v11, v2, 0x4

    add-int/lit8 v11, v11, 0x3

    iget-object v12, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    aget-byte v12, v12, v2

    sub-int v12, v1, v12

    int-to-float v12, v12

    aput v12, v10, v11

    .line 284
    :cond_d
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->mBytes:[B

    aget-byte v10, v10, v2

    sub-int v10, v1, v10

    add-int/lit8 v9, v10, -0x3

    .line 285
    .local v9, "y":I
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x1

    aget v10, v10, v11

    int-to-float v11, v9

    cmpl-float v10, v10, v11

    if-lez v10, :cond_e

    .line 286
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    int-to-float v12, v8

    aput v12, v10, v11

    .line 287
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x1

    int-to-float v12, v9

    aput v12, v10, v11

    .line 288
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x2

    const/4 v12, 0x0

    aput v12, v10, v11

    .line 289
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    mul-int/lit8 v11, v2, 0x2

    int-to-float v12, v8

    aput v12, v10, v11

    .line 290
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    mul-int/lit8 v11, v2, 0x2

    add-int/lit8 v11, v11, 0x1

    int-to-float v12, v9

    aput v12, v10, v11

    .line 268
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 292
    :cond_e
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    int-to-float v12, v8

    aput v12, v10, v11

    .line 293
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x2

    aget v7, v10, v11

    .line 294
    .local v7, "ti":F
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x1

    aget v10, v10, v11

    invoke-direct {p0, v7}, Lyong/powerfull/equalizer/VisualizerView;->freeFall(F)F

    move-result v11

    add-float v6, v10, v11

    .line 295
    .local v6, "temp":F
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x2

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v7, v12

    aput v7, v10, v11

    .line 296
    int-to-float v10, v9

    cmpl-float v10, v6, v10

    if-lez v10, :cond_f

    int-to-float v6, v9

    .line 297
    :cond_f
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v11, v2, 0x3

    add-int/lit8 v11, v11, 0x1

    aput v6, v10, v11

    .line 298
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    mul-int/lit8 v11, v2, 0x2

    int-to-float v12, v8

    aput v12, v10, v11

    .line 299
    iget-object v10, p0, Lyong/powerfull/equalizer/VisualizerView;->pointsArray:[F

    mul-int/lit8 v11, v2, 0x2

    add-int/lit8 v11, v11, 0x1

    iget-object v12, p0, Lyong/powerfull/equalizer/VisualizerView;->tempArray:[F

    mul-int/lit8 v13, v2, 0x3

    add-int/lit8 v13, v13, 0x1

    aget v12, v12, v13

    aput v12, v10, v11

    goto :goto_4
.end method

.method public releaseVisualizerFx()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 136
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    if-nez v0, :cond_0

    .line 142
    :goto_0
    return-void

    .line 139
    :cond_0
    iput-boolean v1, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    .line 140
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 141
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public setupVisualizerFx(I)V
    .locals 8
    .param p1, "audioSessionId"    # I

    .prologue
    const/16 v7, 0xff

    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 85
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lyong/powerfull/equalizer/VisualizerView;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 86
    iput-boolean v6, p0, Lyong/powerfull/equalizer/VisualizerView;->canDrawLines:Z

    .line 87
    iput-boolean v3, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    .line 88
    iput v3, p0, Lyong/powerfull/equalizer/VisualizerView;->times:I

    .line 90
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    if-eqz v1, :cond_0

    .line 91
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v1, v3}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 92
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v1}, Landroid/media/audiofx/Visualizer;->release()V

    .line 93
    const/4 v1, 0x0

    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 98
    :cond_0
    :try_start_0
    new-instance v1, Landroid/media/audiofx/Visualizer;

    invoke-direct {v1, p1}, Landroid/media/audiofx/Visualizer;-><init>(I)V

    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    .line 100
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object v2

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/media/audiofx/Visualizer;->setCaptureSize(I)I

    .line 105
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    new-instance v2, Lyong/powerfull/equalizer/VisualizerView$2;

    invoke-direct {v2, p0}, Lyong/powerfull/equalizer/VisualizerView$2;-><init>(Lyong/powerfull/equalizer/VisualizerView;)V

    .line 120
    invoke-static {}, Landroid/media/audiofx/Visualizer;->getMaxCaptureRate()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 105
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/media/audiofx/Visualizer;->setDataCaptureListener(Landroid/media/audiofx/Visualizer$OnDataCaptureListener;IZZ)I

    .line 121
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->mVisualizer:Landroid/media/audiofx/Visualizer;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :goto_0
    return-void

    .line 122
    :catch_0
    move-exception v0

    .line 124
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    .line 125
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    const/16 v2, 0xe6

    invoke-static {v2, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    iget-object v1, p0, Lyong/powerfull/equalizer/VisualizerView;->errorPaint:Landroid/graphics/Paint;

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 127
    iput-boolean v6, p0, Lyong/powerfull/equalizer/VisualizerView;->error:Z

    .line 128
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
