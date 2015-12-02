.class public Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;
.super Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$1;,
        Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;,
        Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;
    }
.end annotation


# instance fields
.field b:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

.field c:I

.field private final d:I

.field private final e:I

.field private f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private j:I

.field private final k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

.field private final l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private q:Lcom/nineoldandroids/a/k;

.field private final r:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .prologue
    const/16 v6, 0x50

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->m:I

    .line 35
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->n:I

    .line 36
    iput v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->o:I

    .line 37
    iput v6, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->p:I

    .line 205
    const/high16 v0, 0x40e00000    # 7.0f

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->r:F

    .line 207
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->c:I

    .line 62
    invoke-virtual {p0, v4}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setOrientation(I)V

    .line 64
    sget-object v0, Lcom/qihoo/security/lite/a$a;->WaveView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 65
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->d:I

    .line 66
    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->e:I

    .line 67
    invoke-virtual {v0, v5, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->a:I

    .line 68
    const/4 v1, 0x3

    invoke-virtual {v0, v1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    .line 69
    const/4 v1, 0x6

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->g:I

    .line 70
    const/4 v1, 0x5

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->h:I

    .line 71
    const/4 v1, 0x7

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->i:I

    .line 72
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->h:I

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->g:I

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->i:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(III)V

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->d:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(I)V

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->e:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b(I)V

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e()V

    .line 80
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->c()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->a(Landroid/graphics/Paint;)V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->d()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->b(Landroid/graphics/Paint;)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->addView(Landroid/view/View;)V

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->addView(Landroid/view/View;)V

    .line 87
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setProgress(I)V

    .line 88
    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    int-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->j:I

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 144
    if-eqz v1, :cond_0

    move-object v0, v1

    .line 145
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->j:I

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->q:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->q:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 298
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setProgress(I)V

    .line 299
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->c:I

    .line 300
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(Z)V

    .line 114
    :cond_0
    return-void
.end method

.method public getProgress()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    return v0
.end method

.method public getSolid()Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->l:Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;

    return-object v0
.end method

.method public getWave()Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    return-object v0
.end method

.method protected onMeasure(II)V
    .locals 0

    .prologue
    .line 118
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->onMeasure(II)V

    .line 119
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 161
    check-cast p1, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;

    .line 162
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 163
    iget v0, p1, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;->a:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setProgress(I)V

    .line 164
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 153
    invoke-super {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 154
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;

    invoke-direct {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 155
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$SavedState;->a:I

    .line 156
    return-object v1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 135
    invoke-super {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->onWindowFocusChanged(Z)V

    .line 136
    if-eqz p1, :cond_0

    .line 137
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->b()V

    .line 139
    :cond_0
    return-void
.end method

.method public setAboveWaveColor(I)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(I)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e()V

    .line 93
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->postInvalidate()V

    .line 94
    return-void
.end method

.method public setBelowWaveColor(I)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->b(I)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->e()V

    .line 99
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->postInvalidate()V

    .line 100
    return-void
.end method

.method public setProgress(I)V
    .locals 1

    .prologue
    const/16 v0, 0x3e8

    .line 103
    if-le p1, v0, :cond_1

    :goto_0
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->f:I

    .line 104
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->b()V

    .line 105
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->b:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->b:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;->a(I)V

    .line 108
    :cond_0
    return-void

    :cond_1
    move v0, p1

    .line 103
    goto :goto_0
.end method

.method public setWaveCallback(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;)V
    .locals 1

    .prologue
    .line 48
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->b:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->k:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView$a;)V

    .line 52
    :cond_0
    return-void
.end method
