.class public Lcom/facebook/reflex/view/b/j;
.super Landroid/graphics/Canvas;
.source "EmptyCanvas.java"


# static fields
.field private static a:Lcom/facebook/reflex/view/b/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/graphics/Canvas;-><init>()V

    .line 32
    return-void
.end method

.method public static a()Lcom/facebook/reflex/view/b/j;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/reflex/view/b/j;->a:Lcom/facebook/reflex/view/b/j;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lcom/facebook/reflex/view/b/j;

    invoke-direct {v0}, Lcom/facebook/reflex/view/b/j;-><init>()V

    sput-object v0, Lcom/facebook/reflex/view/b/j;->a:Lcom/facebook/reflex/view/b/j;

    .line 27
    :cond_0
    sget-object v0, Lcom/facebook/reflex/view/b/j;->a:Lcom/facebook/reflex/view/b/j;

    return-object v0
.end method


# virtual methods
.method public clipPath(Landroid/graphics/Path;)Z
    .locals 1

    .prologue
    .line 187
    const/4 v0, 0x1

    return v0
.end method

.method public clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
    .locals 1

    .prologue
    .line 182
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(FFFF)Z
    .locals 1

    .prologue
    .line 172
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(FFFFLandroid/graphics/Region$Op;)Z
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(IIII)Z
    .locals 1

    .prologue
    .line 177
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(Landroid/graphics/Rect;)Z
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z
    .locals 1

    .prologue
    .line 152
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(Landroid/graphics/RectF;)Z
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x1

    return v0
.end method

.method public clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x1

    return v0
.end method

.method public clipRegion(Landroid/graphics/Region;)Z
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x1

    return v0
.end method

.method public clipRegion(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z
    .locals 1

    .prologue
    .line 192
    const/4 v0, 0x1

    return v0
.end method

.method public concat(Landroid/graphics/Matrix;)V
    .locals 0

    .prologue
    .line 133
    return-void
.end method

.method public drawARGB(IIII)V
    .locals 0

    .prologue
    .line 229
    return-void
.end method

.method public drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 305
    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 320
    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 347
    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 330
    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 325
    return-void
.end method

.method public drawBitmap([IIIFFIIZLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 336
    return-void
.end method

.method public drawBitmap([IIIIIIIZLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 342
    return-void
.end method

.method public drawBitmapMesh(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 353
    return-void
.end method

.method public drawCircle(FFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 299
    return-void
.end method

.method public drawColor(I)V
    .locals 0

    .prologue
    .line 234
    return-void
.end method

.method public drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .prologue
    .line 239
    return-void
.end method

.method public drawLine(FFFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 264
    return-void
.end method

.method public drawLines([FIILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 269
    return-void
.end method

.method public drawLines([FLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 274
    return-void
.end method

.method public drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 294
    return-void
.end method

.method public drawPaint(Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 244
    return-void
.end method

.method public drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 315
    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;)V
    .locals 0

    .prologue
    .line 406
    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;Landroid/graphics/Rect;)V
    .locals 0

    .prologue
    .line 416
    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;Landroid/graphics/RectF;)V
    .locals 0

    .prologue
    .line 411
    return-void
.end method

.method public drawPoint(FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 259
    return-void
.end method

.method public drawPoints([FIILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 249
    return-void
.end method

.method public drawPoints([FLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 254
    return-void
.end method

.method public drawPosText(Ljava/lang/String;[FLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 390
    return-void
.end method

.method public drawPosText([CII[FLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 385
    return-void
.end method

.method public drawRGB(III)V
    .locals 0

    .prologue
    .line 224
    return-void
.end method

.method public drawRect(FFFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 289
    return-void
.end method

.method public drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 284
    return-void
.end method

.method public drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 279
    return-void
.end method

.method public drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 310
    return-void
.end method

.method public drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 380
    return-void
.end method

.method public drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 370
    return-void
.end method

.method public drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 375
    return-void
.end method

.method public drawText([CIIFFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 365
    return-void
.end method

.method public drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 401
    return-void
.end method

.method public drawTextOnPath([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 396
    return-void
.end method

.method public drawVertices(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 360
    return-void
.end method

.method public getClipBounds(Landroid/graphics/Rect;)Z
    .locals 1

    .prologue
    .line 218
    const/4 v0, 0x1

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    return v0
.end method

.method public getMatrix(Landroid/graphics/Matrix;)V
    .locals 0

    .prologue
    .line 143
    return-void
.end method

.method public getSaveCount()I
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x1

    return v0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public isHardwareAccelerated()Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return v0
.end method

.method public isOpaque()Z
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x1

    return v0
.end method

.method public quickReject(FFFFLandroid/graphics/Canvas$EdgeType;)Z
    .locals 1

    .prologue
    .line 213
    const/4 v0, 0x0

    return v0
.end method

.method public quickReject(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z
    .locals 1

    .prologue
    .line 207
    const/4 v0, 0x0

    return v0
.end method

.method public quickReject(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z
    .locals 1

    .prologue
    .line 202
    const/4 v0, 0x0

    return v0
.end method

.method public restore()V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method public restoreToCount(I)V
    .locals 0

    .prologue
    .line 108
    return-void
.end method

.method public rotate(F)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public save()I
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x1

    return v0
.end method

.method public save(I)I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x1

    return v0
.end method

.method public saveLayer(FFFFLandroid/graphics/Paint;I)I
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x1

    return v0
.end method

.method public saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x1

    return v0
.end method

.method public saveLayerAlpha(FFFFII)I
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x1

    return v0
.end method

.method public saveLayerAlpha(Landroid/graphics/RectF;II)I
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x1

    return v0
.end method

.method public scale(FF)V
    .locals 0

    .prologue
    .line 118
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 46
    return-void
.end method

.method public setMatrix(Landroid/graphics/Matrix;)V
    .locals 0

    .prologue
    .line 138
    return-void
.end method

.method public skew(FF)V
    .locals 0

    .prologue
    .line 128
    return-void
.end method

.method public translate(FF)V
    .locals 0

    .prologue
    .line 113
    return-void
.end method
