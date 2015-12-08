.class public final Lkik/android/widget/c;
.super Lkik/android/widget/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/c$1;,
        Lkik/android/widget/c$a;
    }
.end annotation


# static fields
.field private static final r:I

.field private static final s:I

.field private static final t:I


# instance fields
.field private c:Landroid/graphics/Point;

.field private d:I

.field private e:Landroid/graphics/Point;

.field private f:Landroid/graphics/Point;

.field private g:Landroid/graphics/Point;

.field private h:Landroid/graphics/Path;

.field private i:[I

.field private j:[I

.field private k:[I

.field private final l:Landroid/graphics/Matrix;

.field private m:I

.field private n:I

.field private o:I

.field private final p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/ColorFilter;

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    const/16 v0, 0x12

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/c;->r:I

    .line 64
    const/4 v0, 0x6

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/c;->s:I

    .line 65
    const/16 v0, 0xd

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/c;->t:I

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 70
    invoke-direct {p0, p1}, Lkik/android/widget/p;-><init>(Landroid/graphics/Bitmap;)V

    .line 27
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/widget/c;->e:Landroid/graphics/Point;

    .line 28
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/widget/c;->f:Landroid/graphics/Point;

    .line 29
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lkik/android/widget/c;->g:Landroid/graphics/Point;

    .line 30
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    .line 31
    new-array v0, v3, [I

    const v1, 0x10100a1

    aput v1, v0, v2

    iput-object v0, p0, Lkik/android/widget/c;->i:[I

    .line 32
    new-array v0, v3, [I

    const v1, 0x101009c

    aput v1, v0, v2

    iput-object v0, p0, Lkik/android/widget/c;->j:[I

    .line 33
    new-array v0, v3, [I

    const v1, 0x10100a7

    aput v1, v0, v2

    iput-object v0, p0, Lkik/android/widget/c;->k:[I

    .line 34
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lkik/android/widget/c;->l:Landroid/graphics/Matrix;

    .line 35
    iput v2, p0, Lkik/android/widget/c;->m:I

    .line 40
    new-instance v0, Lkik/android/widget/d;

    invoke-direct {v0, p0}, Lkik/android/widget/d;-><init>(Lkik/android/widget/c;)V

    iput-object v0, p0, Lkik/android/widget/c;->p:Landroid/graphics/Paint;

    .line 47
    new-instance v0, Landroid/graphics/LightingColorFilter;

    const v1, -0x444445

    invoke-direct {v0, v1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    iput-object v0, p0, Lkik/android/widget/c;->q:Landroid/graphics/ColorFilter;

    .line 66
    const v0, 0x7f0d000a

    invoke-static {v0}, Lkik/android/chat/KikApplication;->d(I)I

    move-result v0

    iput v0, p0, Lkik/android/widget/c;->u:I

    .line 71
    iput p2, p0, Lkik/android/widget/c;->d:I

    .line 72
    return-void
.end method

.method public static a()I
    .locals 1

    .prologue
    .line 54
    sget v0, Lkik/android/widget/c;->s:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 76
    if-eqz p1, :cond_0

    iget v0, p0, Lkik/android/widget/c;->d:I

    if-eq p1, v0, :cond_0

    .line 77
    iput p1, p0, Lkik/android/widget/c;->d:I

    .line 78
    invoke-virtual {p0}, Lkik/android/widget/c;->invalidateSelf()V

    .line 80
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 84
    iput p1, p0, Lkik/android/widget/c;->n:I

    .line 85
    iput p2, p0, Lkik/android/widget/c;->o:I

    .line 86
    invoke-virtual {p0}, Lkik/android/widget/c;->invalidateSelf()V

    .line 87
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 98
    invoke-super {p0, p1, p2}, Lkik/android/widget/p;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    .line 99
    return-void
.end method

.method protected final a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lkik/android/widget/c;->p:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, v0}, Lkik/android/widget/c;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 260
    return-void
.end method

.method protected final a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    .line 115
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lkik/android/widget/c;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 117
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 119
    iget v1, v3, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lkik/android/widget/c;->n:I

    add-int/2addr v1, v2

    iget v2, v3, Landroid/graphics/Rect;->top:I

    iget v5, v3, Landroid/graphics/Rect;->right:I

    iget v6, p0, Lkik/android/widget/c;->o:I

    sub-int/2addr v5, v6

    iget v6, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v3, v1, v2, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 125
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/c;->getIntrinsicWidth()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/c;->getIntrinsicHeight()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 127
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/c;->getIntrinsicWidth()I

    move-result v1

    .line 128
    invoke-virtual {p0}, Lkik/android/widget/c;->getIntrinsicHeight()I

    move-result v5

    .line 129
    invoke-virtual {p2}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v6

    .line 131
    if-eqz v6, :cond_1

    .line 133
    iget-object v2, p0, Lkik/android/widget/c;->l:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 137
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v2

    mul-int/2addr v2, v1

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v7

    mul-int/2addr v7, v5

    if-le v2, v7, :cond_5

    .line 138
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    int-to-float v5, v5

    div-float/2addr v2, v5

    .line 139
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    int-to-float v1, v1

    mul-float/2addr v1, v2

    sub-float v1, v5, v1

    mul-float/2addr v1, v8

    .line 146
    :goto_0
    iget-object v5, p0, Lkik/android/widget/c;->l:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 147
    iget-object v2, p0, Lkik/android/widget/c;->l:Landroid/graphics/Matrix;

    add-float/2addr v1, v8

    float-to-int v1, v1

    iget v5, p0, Lkik/android/widget/c;->n:I

    add-int/2addr v1, v5

    int-to-float v1, v1

    add-float/2addr v0, v8

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 148
    iget-object v0, p0, Lkik/android/widget/c;->l:Landroid/graphics/Matrix;

    invoke-virtual {v6, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 152
    :cond_1
    iget-object v0, p0, Lkik/android/widget/c;->i:[I

    invoke-virtual {p0}, Lkik/android/widget/c;->getState()[I

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/c;->j:[I

    invoke-virtual {p0}, Lkik/android/widget/c;->getState()[I

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/c;->k:[I

    invoke-virtual {p0}, Lkik/android/widget/c;->getState()[I

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 153
    :cond_2
    iget-object v0, p0, Lkik/android/widget/c;->q:Landroid/graphics/ColorFilter;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 160
    :goto_1
    sget-object v0, Lkik/android/widget/c$1;->a:[I

    iget v1, p0, Lkik/android/widget/c;->d:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 176
    :goto_2
    iget v0, p0, Lkik/android/widget/c;->d:I

    sget v1, Lkik/android/widget/c$a;->c:I

    if-eq v0, v1, :cond_3

    .line 177
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 178
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 179
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lkik/android/widget/c;->e:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lkik/android/widget/c;->e:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 180
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lkik/android/widget/c;->f:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lkik/android/widget/c;->f:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 181
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lkik/android/widget/c;->g:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lkik/android/widget/c;->g:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 182
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 183
    iget-object v0, p0, Lkik/android/widget/c;->h:Landroid/graphics/Path;

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 185
    :cond_3
    iget v0, p0, Lkik/android/widget/c;->u:I

    int-to-float v0, v0

    iget v1, p0, Lkik/android/widget/c;->u:I

    int-to-float v1, v1

    invoke-virtual {p1, v4, v0, v1, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 187
    iget v0, p0, Lkik/android/widget/c;->m:I

    if-eqz v0, :cond_4

    .line 188
    iget v0, p0, Lkik/android/widget/c;->m:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 190
    :cond_4
    return-void

    .line 142
    :cond_5
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 143
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    int-to-float v5, v5

    mul-float/2addr v5, v2

    sub-float/2addr v1, v5

    mul-float/2addr v1, v8

    move v9, v1

    move v1, v0

    move v0, v9

    goto/16 :goto_0

    .line 156
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    goto :goto_1

    .line 162
    :pswitch_0
    iget v0, v3, Landroid/graphics/Rect;->top:I

    sget v1, Lkik/android/widget/c;->r:I

    add-int/2addr v0, v1

    .line 163
    iget-object v1, p0, Lkik/android/widget/c;->e:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Point;->set(II)V

    .line 164
    iget-object v1, p0, Lkik/android/widget/c;->f:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    sget v5, Lkik/android/widget/c;->s:I

    add-int/2addr v2, v5

    sget v5, Lkik/android/widget/c;->t:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v0

    invoke-virtual {v1, v2, v5}, Landroid/graphics/Point;->set(II)V

    .line 165
    iget-object v1, p0, Lkik/android/widget/c;->g:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    sget v3, Lkik/android/widget/c;->s:I

    add-int/2addr v2, v3

    sget v3, Lkik/android/widget/c;->t:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Point;->set(II)V

    .line 166
    iget v0, v4, Landroid/graphics/RectF;->left:F

    sget v1, Lkik/android/widget/c;->s:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->left:F

    goto/16 :goto_2

    .line 169
    :pswitch_1
    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    sget v1, Lkik/android/widget/c;->r:I

    sub-int/2addr v0, v1

    .line 170
    iget-object v1, p0, Lkik/android/widget/c;->e:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Point;->set(II)V

    .line 171
    iget-object v1, p0, Lkik/android/widget/c;->f:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->right:I

    sget v5, Lkik/android/widget/c;->s:I

    sub-int/2addr v2, v5

    sget v5, Lkik/android/widget/c;->t:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v0

    invoke-virtual {v1, v2, v5}, Landroid/graphics/Point;->set(II)V

    .line 172
    iget-object v1, p0, Lkik/android/widget/c;->g:Landroid/graphics/Point;

    iget v2, v3, Landroid/graphics/Rect;->right:I

    sget v3, Lkik/android/widget/c;->s:I

    sub-int/2addr v2, v3

    sget v3, Lkik/android/widget/c;->t:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Point;->set(II)V

    .line 173
    iget v0, v4, Landroid/graphics/RectF;->right:F

    sget v1, Lkik/android/widget/c;->s:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, v4, Landroid/graphics/RectF;->right:F

    goto/16 :goto_2

    .line 160
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/graphics/Point;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    .line 109
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/widget/c;->u:I

    .line 92
    invoke-virtual {p0}, Lkik/android/widget/c;->invalidateSelf()V

    .line 93
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 194
    iput p1, p0, Lkik/android/widget/c;->m:I

    .line 195
    return-void
.end method

.method protected final b(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lkik/android/widget/c;->p:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, v0}, Lkik/android/widget/c;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 266
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .prologue
    .line 237
    invoke-super {p0}, Lkik/android/widget/p;->getIntrinsicHeight()I

    move-result v0

    .line 238
    if-nez v0, :cond_0

    iget-object v1, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    if-lez v1, :cond_0

    .line 239
    iget-object v0, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 241
    :cond_0
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .prologue
    .line 248
    invoke-super {p0}, Lkik/android/widget/p;->getIntrinsicWidth()I

    move-result v0

    .line 249
    if-nez v0, :cond_0

    iget-object v1, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    if-lez v1, :cond_0

    .line 250
    iget-object v0, p0, Lkik/android/widget/c;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    .line 252
    :cond_0
    return v0
.end method

.method public final isStateful()Z
    .locals 1

    .prologue
    .line 208
    const/4 v0, 0x1

    return v0
.end method

.method protected final onStateChange([I)Z
    .locals 1

    .prologue
    .line 229
    invoke-virtual {p0}, Lkik/android/widget/c;->invalidateSelf()V

    .line 230
    invoke-super {p0, p1}, Lkik/android/widget/p;->onStateChange([I)Z

    move-result v0

    return v0
.end method

.method public final setState([I)Z
    .locals 1

    .prologue
    .line 271
    invoke-super {p0, p1}, Lkik/android/widget/p;->setState([I)Z

    move-result v0

    return v0
.end method
