.class public final Lcom/kik/sdkutils/a/a;
.super Landroid/graphics/drawable/Drawable;
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


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x1

    .line 31
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 15
    iput v2, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 19
    const/16 v0, 0x258

    iput v0, p0, Lcom/kik/sdkutils/a/a;->d:I

    .line 22
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iput-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/kik/sdkutils/a/a;->h:D

    .line 32
    iput-object p2, p0, Lcom/kik/sdkutils/a/a;->f:Ljava/lang/String;

    .line 33
    iput-object p1, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    .line 34
    iput v2, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 35
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    .line 36
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 67
    iput-object p1, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    .line 68
    const/4 v0, 0x3

    iput v0, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 69
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    .line 70
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 40
    iput-object p2, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    .line 41
    iput-object p1, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 43
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    .line 44
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

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
    const/4 v4, 0x0

    const/16 v7, 0xff

    const/4 v6, 0x0

    .line 86
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 150
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    iget v0, p0, Lcom/kik/sdkutils/a/a;->c:I

    packed-switch v0, :pswitch_data_0

    .line 140
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 141
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_9

    .line 142
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 143
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 91
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kik/sdkutils/a/a;->e:J

    .line 92
    const/4 v0, 0x2

    iput v0, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 93
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 94
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 95
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 97
    :cond_2
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    goto :goto_0

    .line 100
    :pswitch_1
    iget-wide v0, p0, Lcom/kik/sdkutils/a/a;->e:J

    const-wide/16 v2, 0x258

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    .line 102
    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    if-gtz v2, :cond_5

    .line 103
    const/4 v0, 0x3

    iput v0, p0, Lcom/kik/sdkutils/a/a;->c:I

    .line 106
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 108
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 109
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 110
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 116
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    goto :goto_0

    .line 112
    :cond_4
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 113
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 114
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 119
    :cond_5
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x4082c00000000000L    # 600.0

    div-double/2addr v0, v4

    sub-double v0, v2, v0

    iput-wide v0, p0, Lcom/kik/sdkutils/a/a;->h:D

    .line 121
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    .line 122
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 123
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 126
    :cond_6
    iget-wide v0, p0, Lcom/kik/sdkutils/a/a;->h:D

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/kik/sdkutils/a/a;->h:D

    .line 128
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    const-wide v2, 0x406fe00000000000L    # 255.0

    iget-wide v4, p0, Lcom/kik/sdkutils/a/a;->h:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 129
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_8

    .line 130
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 136
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->invalidateSelf()V

    goto/16 :goto_0

    .line 132
    :cond_8
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    .line 133
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 134
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_2

    .line 145
    :cond_9
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/kik/sdkutils/a/a;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/sdkutils/a/a;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v6, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 89
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
    .line 176
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 177
    :cond_0
    const/16 v0, 0x9c

    .line 180
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 188
    :cond_0
    const/16 v0, 0x64

    .line 191
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method

.method public final getMinimumHeight()I
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/16 v0, 0x9c

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public final getMinimumWidth()I
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/16 v0, 0x64

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/sdkutils/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method

.method public final getOpacity()I
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    .prologue
    .line 166
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 171
    return-void
.end method
