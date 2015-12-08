.class public final Lkik/android/widget/cs;
.super Lkik/android/widget/w;
.source "SourceFile"


# instance fields
.field protected a:Landroid/graphics/Bitmap;

.field protected b:Landroid/graphics/Bitmap;

.field private c:I

.field private final d:I

.field private e:J

.field private final f:Ljava/lang/String;

.field private g:Landroid/graphics/Paint;

.field private h:D

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 26
    invoke-direct {p0}, Lkik/android/widget/w;-><init>()V

    .line 13
    iput v3, p0, Lkik/android/widget/cs;->c:I

    .line 17
    const/16 v0, 0x12c

    iput v0, p0, Lkik/android/widget/cs;->d:I

    .line 20
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iput-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/cs;->h:D

    .line 22
    iput v2, p0, Lkik/android/widget/cs;->i:I

    .line 23
    iput v2, p0, Lkik/android/widget/cs;->j:I

    .line 27
    iput-object p2, p0, Lkik/android/widget/cs;->f:Ljava/lang/String;

    .line 28
    iput-object p1, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    .line 29
    iput v3, p0, Lkik/android/widget/cs;->c:I

    .line 30
    invoke-direct {p0, p1}, Lkik/android/widget/cs;->a(Landroid/graphics/Bitmap;)V

    .line 31
    invoke-virtual {p0}, Lkik/android/widget/cs;->invalidateSelf()V

    .line 32
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 179
    if-nez p1, :cond_0

    .line 180
    iput v0, p0, Lkik/android/widget/cs;->i:I

    .line 181
    iput v0, p0, Lkik/android/widget/cs;->j:I

    .line 187
    :goto_0
    return-void

    .line 184
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lkik/android/widget/cs;->i:I

    .line 185
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lkik/android/widget/cs;->j:I

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 36
    iput-object p2, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    .line 37
    iput-object p1, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/widget/cs;->c:I

    .line 39
    invoke-direct {p0, p2}, Lkik/android/widget/cs;->a(Landroid/graphics/Bitmap;)V

    .line 40
    invoke-virtual {p0}, Lkik/android/widget/cs;->invalidateSelf()V

    .line 41
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/16 v7, 0xff

    const/4 v6, 0x0

    .line 90
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 154
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    iget v0, p0, Lkik/android/widget/cs;->c:I

    packed-switch v0, :pswitch_data_0

    .line 144
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 145
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_9

    .line 147
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 95
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/cs;->e:J

    .line 96
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/widget/cs;->c:I

    .line 97
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 98
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 99
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 101
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/cs;->invalidateSelf()V

    goto :goto_0

    .line 104
    :pswitch_1
    iget-wide v0, p0, Lkik/android/widget/cs;->e:J

    const-wide/16 v2, 0x12c

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    .line 106
    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-gtz v2, :cond_5

    .line 107
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/widget/cs;->c:I

    .line 110
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 112
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 114
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 120
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lkik/android/widget/cs;->invalidateSelf()V

    goto :goto_0

    .line 116
    :cond_4
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 117
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 118
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 123
    :cond_5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x4072c00000000000L    # 300.0

    div-double/2addr v0, v4

    sub-double v0, v2, v0

    iput-wide v0, p0, Lkik/android/widget/cs;->h:D

    .line 125
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    .line 126
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 127
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 130
    :cond_6
    iget-wide v0, p0, Lkik/android/widget/cs;->h:D

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/cs;->h:D

    .line 132
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    const-wide v2, 0x406fe00000000000L    # 255.0

    iget-wide v4, p0, Lkik/android/widget/cs;->h:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 133
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_8

    .line 134
    iget-object v0, p0, Lkik/android/widget/cs;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 140
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lkik/android/widget/cs;->invalidateSelf()V

    goto/16 :goto_0

    .line 136
    :cond_8
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    .line 137
    iget-object v0, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 138
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_2

    .line 149
    :cond_9
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lkik/android/widget/cs;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/cs;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/cs;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 192
    iget v0, p0, Lkik/android/widget/cs;->i:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 198
    iget v0, p0, Lkik/android/widget/cs;->j:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .prologue
    .line 164
    const/4 v0, -0x3

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    .prologue
    .line 170
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 175
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .prologue
    .line 78
    invoke-super {p0, p1, p2}, Lkik/android/widget/w;->setVisible(ZZ)Z

    move-result v0

    return v0
.end method
