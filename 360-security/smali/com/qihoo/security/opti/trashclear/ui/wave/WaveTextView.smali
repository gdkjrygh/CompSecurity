.class public Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;
.super Lcom/qihoo/security/locale/widget/LocaleTextView;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;


# static fields
.field private static final b:Landroid/graphics/Xfermode;


# instance fields
.field private a:I

.field private c:Landroid/graphics/Path;

.field private d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

.field private final e:Landroid/graphics/Path;

.field private f:I

.field private g:I

.field private h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

.field private i:I

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 31
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->b:Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 45
    invoke-direct {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;)V

    .line 30
    const v0, -0xffff01

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a:I

    .line 32
    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c:Landroid/graphics/Path;

    .line 33
    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    .line 34
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    .line 35
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->f:I

    .line 36
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->g:I

    .line 39
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->i:I

    .line 40
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->j:I

    .line 46
    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a(Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    const v0, -0xffff01

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a:I

    .line 32
    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c:Landroid/graphics/Path;

    .line 33
    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    .line 34
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    .line 35
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->f:I

    .line 36
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->g:I

    .line 39
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->i:I

    .line 40
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->j:I

    .line 51
    invoke-direct {p0, p2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a(Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 56
    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/lite/a$a;->WaveTextView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 59
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->i:I

    .line 60
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->j:I

    .line 62
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    :cond_0
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 82
    :goto_0
    if-eqz v1, :cond_0

    .line 83
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v1, v2, :cond_1

    .line 84
    const/4 v0, 0x1

    .line 89
    :cond_0
    if-nez v0, :cond_2

    .line 90
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "WaveTextView should has a WaveView\'s parent as container"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_1
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    .line 92
    :cond_2
    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getLeft()I

    move-result v3

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getTop()I

    move-result v2

    .line 144
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 145
    :goto_0
    if-eqz v1, :cond_1

    move-object v0, v1

    .line 146
    check-cast v0, Landroid/view/View;

    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    add-int/2addr v3, v4

    .line 148
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, v2

    .line 149
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v1, v2, :cond_0

    move v1, v3

    .line 154
    :goto_1
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->f:I

    .line 155
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->g:I

    .line 156
    return-void

    .line 152
    :cond_0
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    move v2, v0

    .line 153
    goto :goto_0

    :cond_1
    move v0, v2

    move v1, v3

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 166
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->postInvalidate()V

    .line 167
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 161
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->postInvalidate()V

    .line 162
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;)V
    .locals 1

    .prologue
    .line 95
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    .line 96
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getWave()Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b()Landroid/graphics/Path;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c:Landroid/graphics/Path;

    .line 97
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getSolid()Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    .line 98
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->b()V

    .line 99
    invoke-virtual {p1, p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setWaveCallback(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;)V

    .line 100
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getWave()Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b()Landroid/graphics/Path;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c:Landroid/graphics/Path;

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getSolid()Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c:Landroid/graphics/Path;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    if-eqz v0, :cond_1

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getWave()Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b()Landroid/graphics/Path;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->h:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getWave()Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a()Landroid/graphics/Path;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 114
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getLeft()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getTop()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    invoke-virtual {v3}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getRight()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->d:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    invoke-virtual {v4}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getBottom()I

    move-result v4

    int-to-float v4, v4

    sget-object v5, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 116
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->f:I

    if-gtz v0, :cond_0

    .line 118
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c()V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->f:I

    neg-int v1, v1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->i:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->g:I

    neg-int v2, v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->j:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->offset(FF)V

    .line 125
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getWidth()I

    move-result v0

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getHeight()I

    move-result v0

    int-to-float v4, v0

    const/16 v6, 0x1f

    move-object v0, p1

    move v1, v7

    move v2, v7

    move-object v5, v8

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v0

    .line 128
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 129
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->b:Landroid/graphics/Xfermode;

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 130
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a:I

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 131
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->e:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 132
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/text/TextPaint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 133
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 137
    :goto_0
    return-void

    .line 135
    :cond_1
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onDraw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 70
    invoke-super/range {p0 .. p5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onLayout(ZIIII)V

    .line 71
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    :cond_0
    :goto_0
    return-void

    .line 74
    :cond_1
    if-eqz p1, :cond_0

    .line 75
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->c()V

    goto :goto_0
.end method

.method public setRevertColor(I)V
    .locals 0

    .prologue
    .line 103
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a:I

    .line 104
    return-void
.end method
