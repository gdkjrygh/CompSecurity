.class final Lcom/roidapp/videolib/core/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/f;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/core/b;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/core/b;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 227
    invoke-static {p1}, Lcom/roidapp/videolib/core/e;->a(I)I

    move-result v0

    return v0
.end method

.method public final a([Ljava/nio/ByteBuffer;J)I
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/videolib/core/e;->a([Ljava/nio/ByteBuffer;J)I

    move-result v0

    .line 261
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final a()J
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    .line 1105
    iget-wide v0, v0, Lcom/roidapp/videolib/core/e;->c:J

    .line 270
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)Lcom/roidapp/videolib/gl/a;
    .locals 4

    .prologue
    .line 246
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    if-nez v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    new-instance v1, Lcom/roidapp/videolib/core/i;

    iget-object v2, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-virtual {p0}, Lcom/roidapp/videolib/core/c;->d()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/roidapp/videolib/core/i;-><init>(Lcom/roidapp/videolib/core/h;I)V

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/b;->a(Lcom/roidapp/videolib/core/b;Lcom/roidapp/videolib/core/i;)Lcom/roidapp/videolib/core/i;

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/core/i;->a(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v0

    .line 253
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    invoke-static {}, Lcom/roidapp/videolib/core/e;->a()[I

    move-result-object v0

    .line 279
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->g()J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->a(Lcom/roidapp/videolib/core/b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->c()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    .line 240
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/videolib/core/c;->g()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v0

    goto :goto_0
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 23

    .prologue
    .line 326
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v2}, Lcom/roidapp/videolib/core/b;->a(Lcom/roidapp/videolib/core/b;)Z

    move-result v2

    if-nez v2, :cond_5

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v2, v2, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget-object v2, v2, Lcom/roidapp/videolib/core/a/a;->o:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 327
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v2}, Lcom/roidapp/videolib/core/b;->e(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_4

    .line 328
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v2, v2, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v3

    .line 329
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v2, v2, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    iget-object v10, v2, Lcom/roidapp/videolib/core/a/a;->o:Ljava/lang/String;

    .line 333
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v2}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    move-object v14, v2

    move v15, v3

    .line 344
    :goto_0
    if-nez v14, :cond_0

    .line 345
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 346
    const/4 v2, 0x0

    .line 446
    :goto_1
    return-object v2

    .line 335
    :catch_0
    move-exception v2

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 336
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v2, v2, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v2

    div-int/lit8 v3, v2, 0x2

    .line 338
    :try_start_1
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v2}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    move-object v14, v2

    move v15, v3

    .line 342
    goto :goto_0

    .line 340
    :catch_1
    move-exception v2

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 341
    const/4 v2, 0x0

    move-object v14, v2

    move v15, v3

    goto :goto_0

    .line 349
    :cond_0
    new-instance v16, Landroid/graphics/Canvas;

    move-object/from16 v0, v16

    invoke-direct {v0, v14}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 350
    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 351
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 353
    new-instance v17, Landroid/text/TextPaint;

    invoke-direct/range {v17 .. v17}, Landroid/text/TextPaint;-><init>()V

    .line 354
    const/high16 v2, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 355
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 356
    const/4 v2, -0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 357
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 358
    const/high16 v2, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "#7b000000"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 360
    new-instance v4, Landroid/text/TextPaint;

    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 361
    const/high16 v2, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 362
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 363
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 364
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 365
    const/high16 v2, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v3}, Lcom/roidapp/videolib/core/b;->f(Lcom/roidapp/videolib/core/b;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->a(FF)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    const-string v6, "#7b000000"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v2, v3, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 367
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 368
    const-string v3, "\u3002."

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v5, v6, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 369
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v11

    .line 370
    const-string v3, "\u3002."

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-virtual {v4, v3, v5, v6, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 371
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v18

    .line 374
    new-instance v3, Landroid/text/SpannableStringBuilder;

    const-string v2, "PhotoGrid"

    invoke-direct {v3, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 375
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/16 v7, 0x11

    invoke-virtual {v3, v2, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 376
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v5, 0x1

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v5, 0x5

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/16 v7, 0x11

    invoke-virtual {v3, v2, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 379
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/roidapp/videolib/core/b;->a(Landroid/text/TextPaint;Ljava/lang/String;)F

    move-result v2

    float-to-int v2, v2

    add-int v5, v2, v18

    .line 380
    int-to-float v2, v15

    const v6, 0x3d734d6a    # 0.0594f

    mul-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v19

    .line 381
    new-instance v2, Landroid/text/StaticLayout;

    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    invoke-direct/range {v2 .. v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 384
    new-instance v7, Landroid/text/SpannableStringBuilder;

    invoke-direct {v7, v10}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 385
    const-string v3, "Directed by "

    invoke-virtual {v10, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0xc

    if-le v3, v4, :cond_1

    .line 386
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v4, 0x0

    const/16 v6, 0xc

    const/16 v8, 0x11

    invoke-virtual {v7, v3, v4, v6, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 387
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v4, 0xc

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v8, 0x11

    invoke-virtual {v7, v3, v4, v6, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 391
    :cond_1
    move-object/from16 v0, v17

    invoke-static {v0, v10}, Lcom/roidapp/videolib/core/b;->a(Landroid/text/TextPaint;Ljava/lang/String;)F

    move-result v3

    float-to-int v3, v3

    add-int v9, v3, v11

    .line 392
    new-instance v6, Landroid/text/StaticLayout;

    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    move-object/from16 v8, v17

    invoke-direct/range {v6 .. v13}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 394
    int-to-float v3, v15

    const v4, 0x3d9652bd    # 0.0734f

    mul-float/2addr v3, v4

    float-to-double v10, v3

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    double-to-int v3, v10

    invoke-virtual {v6}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v4

    mul-int/2addr v3, v4

    .line 397
    int-to-float v4, v15

    const v8, 0x3d9652bd    # 0.0734f

    mul-float/2addr v4, v8

    invoke-virtual {v6}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v4, v8

    invoke-virtual {v6}, Landroid/text/StaticLayout;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float v20, v4, v8

    .line 400
    int-to-float v4, v15

    const v8, 0x3ccccccd    # 0.025f

    mul-float/2addr v4, v8

    div-float v4, v4, v20

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v21

    .line 401
    int-to-float v4, v15

    const/high16 v8, 0x3d000000    # 0.03125f

    mul-float/2addr v4, v8

    div-float v4, v4, v20

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v22

    .line 403
    int-to-float v4, v9

    mul-float v4, v4, v20

    int-to-float v8, v15

    cmpl-float v4, v4, v8

    if-lez v4, :cond_2

    .line 404
    int-to-float v3, v15

    div-float v3, v3, v20

    float-to-double v8, v3

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-int v3, v8

    sub-int v9, v3, v21

    .line 405
    new-instance v6, Landroid/text/StaticLayout;

    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    move-object/from16 v8, v17

    invoke-direct/range {v6 .. v13}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 406
    int-to-float v3, v15

    const v4, 0x3d9652bd    # 0.0734f

    mul-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v6}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v4

    mul-int/2addr v3, v4

    move-object v4, v6

    move v12, v9

    .line 411
    :goto_2
    add-int v3, v3, v19

    move/from16 v0, v22

    int-to-float v6, v0

    mul-float v6, v6, v20

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    add-int v13, v3, v6

    .line 414
    :try_start_2
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    int-to-float v3, v13

    div-float v3, v3, v20

    float-to-int v3, v3

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v12, v3, v6}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    .line 418
    :goto_3
    if-nez v3, :cond_3

    .line 419
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 420
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 407
    :cond_2
    if-ge v9, v5, :cond_6

    move-object v4, v6

    move v12, v5

    .line 408
    goto :goto_2

    .line 416
    :catch_2
    move-exception v3

    const/4 v3, 0x0

    goto :goto_3

    .line 423
    :cond_3
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 424
    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 425
    new-instance v7, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-direct {v7, v8, v9}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v6, v7}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 426
    invoke-virtual {v4, v6}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 427
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 428
    const/4 v7, 0x0

    invoke-virtual {v4}, Landroid/text/StaticLayout;->getHeight()I

    move-result v4

    add-int v4, v4, v22

    int-to-float v4, v4

    invoke-virtual {v6, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 429
    const/4 v7, 0x0

    const/4 v8, 0x0

    sub-int v4, v12, v21

    int-to-float v9, v4

    const/4 v10, 0x0

    move-object/from16 v11, v17

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 430
    sub-int v4, v12, v5

    div-int/lit8 v5, v18, 0x2

    add-int/2addr v4, v5

    int-to-float v4, v4

    move/from16 v0, v22

    int-to-float v5, v0

    invoke-virtual {v6, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 431
    invoke-virtual {v2, v6}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 432
    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    .line 434
    int-to-float v2, v15

    sub-int v4, v12, v21

    int-to-float v4, v4

    mul-float v4, v4, v20

    sub-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 435
    sub-int v4, v15, v13

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    .line 437
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 438
    move/from16 v0, v20

    move/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 439
    invoke-virtual {v5, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 440
    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v3, v5, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 442
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v2, v14}, Lcom/roidapp/videolib/core/b;->b(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 444
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v2}, Lcom/roidapp/videolib/core/b;->e(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto/16 :goto_1

    .line 446
    :cond_5
    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_6
    move-object v4, v6

    move v12, v9

    goto/16 :goto_2
.end method

.method public final f()Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 285
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->d(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v1, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v1, v1, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v1}, Lcom/roidapp/videolib/core/a/a;->d()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v2, v2, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/a/a;->e()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/b;->a(Lcom/roidapp/videolib/core/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 287
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v1}, Lcom/roidapp/videolib/core/b;->d(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 288
    new-instance v1, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 289
    invoke-static {}, Lcom/roidapp/baselib/f/b;->a()Lcom/roidapp/baselib/f/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/f/b;->a(Landroid/graphics/Canvas;)V

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->d(Lcom/roidapp/videolib/core/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->l()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    return-object v0
.end method

.method public final h()[Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->k()[Lcom/roidapp/videolib/b/u;

    move-result-object v0

    return-object v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    invoke-static {v0}, Lcom/roidapp/videolib/core/b;->c(Lcom/roidapp/videolib/core/b;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->d()Z

    move-result v0

    .line 310
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 316
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->n()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lcom/roidapp/videolib/core/c;->a:Lcom/roidapp/videolib/core/b;

    iget-object v0, v0, Lcom/roidapp/videolib/core/b;->i:Lcom/roidapp/videolib/core/a/a;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/a/a;->m()I

    move-result v0

    return v0
.end method
