.class public final Lkik/android/widget/v;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field protected a:Landroid/graphics/Bitmap;

.field protected b:Landroid/graphics/Bitmap;

.field private c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private h:J

.field private final i:Ljava/lang/String;

.field private j:Landroid/graphics/Paint;

.field private k:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0, v0}, Lkik/android/widget/v;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x1

    .line 33
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 17
    iput v3, p0, Lkik/android/widget/v;->c:I

    .line 18
    iput v2, p0, Lkik/android/widget/v;->d:I

    .line 19
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/widget/v;->e:I

    .line 20
    iput v3, p0, Lkik/android/widget/v;->f:I

    .line 21
    const/16 v0, 0x1f4

    iput v0, p0, Lkik/android/widget/v;->g:I

    .line 25
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/widget/v;->k:D

    .line 34
    iput-object p2, p0, Lkik/android/widget/v;->i:Ljava/lang/String;

    .line 35
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    .line 36
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 37
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 38
    iput-object p1, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    .line 39
    iput v3, p0, Lkik/android/widget/v;->c:I

    .line 40
    invoke-virtual {p0}, Lkik/android/widget/v;->invalidateSelf()V

    .line 41
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/16 v7, 0xff

    const/4 v6, 0x0

    .line 55
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 118
    :cond_0
    :goto_0
    return-void

    .line 59
    :cond_1
    iget v0, p0, Lkik/android/widget/v;->c:I

    packed-switch v0, :pswitch_data_0

    .line 108
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_9

    .line 109
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 110
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 61
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/v;->h:J

    .line 62
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/widget/v;->c:I

    .line 63
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 64
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 65
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 67
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/v;->invalidateSelf()V

    goto :goto_0

    .line 70
    :pswitch_1
    iget-wide v0, p0, Lkik/android/widget/v;->h:J

    const-wide/16 v2, 0x1f4

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    .line 72
    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-gtz v2, :cond_5

    .line 73
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/widget/v;->c:I

    .line 76
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 78
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 79
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 85
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lkik/android/widget/v;->invalidateSelf()V

    goto :goto_0

    .line 81
    :cond_4
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 82
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 83
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 88
    :cond_5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x407f400000000000L    # 500.0

    div-double/2addr v0, v4

    sub-double v0, v2, v0

    iput-wide v0, p0, Lkik/android/widget/v;->k:D

    .line 90
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    .line 91
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 92
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 95
    :cond_6
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    const-wide v2, 0x406fe00000000000L    # 255.0

    iget-wide v4, p0, Lkik/android/widget/v;->k:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 96
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_8

    .line 97
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 103
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lkik/android/widget/v;->invalidateSelf()V

    goto/16 :goto_0

    .line 99
    :cond_8
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    .line 100
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 101
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_2

    .line 112
    :cond_9
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 114
    iget-object v0, p0, Lkik/android/widget/v;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkik/android/widget/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/v;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 59
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 145
    :cond_0
    const/16 v0, 0x9c

    .line 148
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 156
    :cond_0
    const/16 v0, 0x64

    .line 159
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method

.method public final getMinimumHeight()I
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/16 v0, 0x9c

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public final getMinimumWidth()I
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/16 v0, 0x64

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/widget/v;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method

.method public final getOpacity()I
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    .prologue
    .line 134
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 139
    return-void
.end method
