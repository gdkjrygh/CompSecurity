.class final Lcom/roidapp/photogrid/release/nh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/gl/f;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ng;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ng;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 254
    invoke-static {p1}, Lcom/roidapp/videolib/core/e;->a(I)I

    move-result v0

    return v0
.end method

.method public final a([Ljava/nio/ByteBuffer;J)I
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 222
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/videolib/core/e;->a([Ljava/nio/ByteBuffer;J)I

    move-result v0

    monitor-exit v1

    .line 225
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    monitor-exit v1

    goto :goto_0

    .line 226
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()J
    .locals 3

    .prologue
    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 233
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->c()J

    move-result-wide v0

    monitor-exit v2

    .line 236
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    monitor-exit v2

    goto :goto_0

    .line 238
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(I)Lcom/roidapp/videolib/gl/a;
    .locals 5

    .prologue
    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;F)F

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->f(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 275
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->g(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    new-instance v2, Lcom/roidapp/videolib/core/i;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nh;->d()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/videolib/core/i;-><init>(Lcom/roidapp/videolib/core/h;I)V

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;Lcom/roidapp/videolib/core/i;)Lcom/roidapp/videolib/core/i;

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->g(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/i;->a()V

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->g(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/core/i;->a(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 282
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()[I
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 244
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 245
    invoke-static {}, Lcom/roidapp/videolib/core/e;->a()[I

    move-result-object v0

    monitor-exit v1

    .line 247
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    .line 249
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->c(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x3a98

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->d(Lcom/roidapp/photogrid/release/ng;)I

    move-result v0

    goto :goto_0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->c(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->e(Lcom/roidapp/photogrid/release/ng;)I

    move-result v0

    goto :goto_0
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 23

    .prologue
    .line 287
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->c(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v2

    if-nez v2, :cond_7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 288
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->h(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->i(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_6

    .line 289
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->j(Lcom/roidapp/photogrid/release/ng;)Z

    .line 290
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->i(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 291
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->i(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 292
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 294
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->k(Lcom/roidapp/photogrid/release/ng;)I

    move-result v3

    .line 297
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v2}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    move-object v14, v2

    move v15, v3

    .line 308
    :goto_0
    if-nez v14, :cond_2

    .line 309
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 310
    const/4 v2, 0x0

    .line 410
    :goto_1
    return-object v2

    .line 299
    :catch_0
    move-exception v2

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 300
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->k(Lcom/roidapp/photogrid/release/ng;)I

    move-result v2

    div-int/lit8 v3, v2, 0x2

    .line 302
    :try_start_1
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v2}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    move-object v14, v2

    move v15, v3

    .line 306
    goto :goto_0

    .line 304
    :catch_1
    move-exception v2

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 305
    const/4 v2, 0x0

    move-object v14, v2

    move v15, v3

    goto :goto_0

    .line 313
    :cond_2
    new-instance v16, Landroid/graphics/Canvas;

    move-object/from16 v0, v16

    invoke-direct {v0, v14}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 314
    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 315
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 317
    new-instance v17, Landroid/text/TextPaint;

    invoke-direct/range {v17 .. v17}, Landroid/text/TextPaint;-><init>()V

    .line 318
    const/high16 v2, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 319
    const/4 v2, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 320
    const/4 v2, -0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 321
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 322
    const/high16 v2, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

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

    .line 324
    new-instance v4, Landroid/text/TextPaint;

    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 325
    const/high16 v2, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 326
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 327
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 328
    const/high16 v2, 0x3f800000    # 1.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v4, v2}, Landroid/text/TextPaint;->setStrokeWidth(F)V

    .line 329
    const/high16 v2, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->l(Lcom/roidapp/photogrid/release/ng;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(FF)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    const-string v6, "#7b000000"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v2, v3, v5, v6}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 331
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 332
    const-string v3, "\u3002."

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v5, v6, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 333
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v10

    .line 334
    const-string v3, "\u3002."

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-virtual {v4, v3, v5, v6, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 335
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v18

    .line 338
    new-instance v3, Landroid/text/SpannableStringBuilder;

    const-string v2, "PhotoGrid"

    invoke-direct {v3, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 339
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/16 v7, 0x11

    invoke-virtual {v3, v2, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 340
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v5, 0x1

    invoke-direct {v2, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v5, 0x5

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/16 v7, 0x11

    invoke-virtual {v3, v2, v5, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 343
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/text/TextPaint;Ljava/lang/String;)F

    move-result v2

    float-to-int v2, v2

    add-int v5, v2, v18

    .line 344
    int-to-float v2, v15

    const v6, 0x3d734d6a    # 0.0594f

    mul-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v19

    .line 345
    new-instance v2, Landroid/text/StaticLayout;

    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    invoke-direct/range {v2 .. v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 348
    new-instance v7, Landroid/text/SpannableStringBuilder;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-direct {v7, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 349
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    const-string v4, "Directed by "

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0xc

    if-le v3, v4, :cond_3

    .line 350
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/4 v4, 0x0

    const/16 v6, 0xc

    const/16 v8, 0x11

    invoke-virtual {v7, v3, v4, v6, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 351
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v4, 0xc

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v8, 0x11

    invoke-virtual {v7, v3, v4, v6, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 355
    :cond_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/text/TextPaint;Ljava/lang/String;)F

    move-result v3

    float-to-int v3, v3

    add-int v9, v3, v10

    .line 356
    new-instance v6, Landroid/text/StaticLayout;

    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    move-object/from16 v8, v17

    invoke-direct/range {v6 .. v13}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 358
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

    .line 361
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

    .line 364
    int-to-float v4, v15

    const v8, 0x3ccccccd    # 0.025f

    mul-float/2addr v4, v8

    div-float v4, v4, v20

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v21

    .line 365
    int-to-float v4, v15

    const/high16 v8, 0x3d000000    # 0.03125f

    mul-float/2addr v4, v8

    div-float v4, v4, v20

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v22

    .line 367
    int-to-float v4, v9

    mul-float v4, v4, v20

    int-to-float v8, v15

    cmpl-float v4, v4, v8

    if-lez v4, :cond_4

    .line 368
    int-to-float v3, v15

    div-float v3, v3, v20

    float-to-double v8, v3

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-int v3, v8

    sub-int v9, v3, v21

    .line 369
    new-instance v6, Landroid/text/StaticLayout;

    sget-object v10, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    move-object/from16 v8, v17

    invoke-direct/range {v6 .. v13}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 370
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

    .line 375
    :goto_2
    add-int v3, v3, v19

    move/from16 v0, v22

    int-to-float v6, v0

    mul-float v6, v6, v20

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    add-int v13, v3, v6

    .line 378
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

    .line 382
    :goto_3
    if-nez v3, :cond_5

    .line 383
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 384
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 371
    :cond_4
    if-ge v9, v5, :cond_8

    move-object v4, v6

    move v12, v5

    .line 372
    goto :goto_2

    .line 380
    :catch_2
    move-exception v3

    const/4 v3, 0x0

    goto :goto_3

    .line 387
    :cond_5
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 388
    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 389
    new-instance v7, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-direct {v7, v8, v9}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v6, v7}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 390
    invoke-virtual {v4, v6}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 391
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 392
    const/4 v7, 0x0

    invoke-virtual {v4}, Landroid/text/StaticLayout;->getHeight()I

    move-result v4

    add-int v4, v4, v22

    int-to-float v4, v4

    invoke-virtual {v6, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 393
    const/4 v7, 0x0

    const/4 v8, 0x0

    sub-int v4, v12, v21

    int-to-float v9, v4

    const/4 v10, 0x0

    move-object/from16 v11, v17

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 394
    sub-int v4, v12, v5

    div-int/lit8 v5, v18, 0x2

    add-int/2addr v4, v5

    int-to-float v4, v4

    move/from16 v0, v22

    int-to-float v5, v0

    invoke-virtual {v6, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 395
    invoke-virtual {v2, v6}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 396
    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    .line 398
    int-to-float v2, v15

    sub-int v4, v12, v21

    int-to-float v4, v4

    mul-float v4, v4, v20

    sub-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 399
    sub-int v4, v15, v13

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    .line 401
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 402
    move/from16 v0, v20

    move/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 403
    invoke-virtual {v5, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 404
    const/4 v2, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v3, v5, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 406
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2, v14}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 408
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->i(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto/16 :goto_1

    .line 410
    :cond_7
    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_8
    move-object v4, v6

    move v12, v9

    goto/16 :goto_2
.end method

.method public final f()Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 415
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;I)I

    .line 416
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;I)I

    .line 418
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->m(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 419
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 420
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 423
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 424
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->o(Lcom/roidapp/photogrid/release/ng;)Z

    .line 427
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_2

    .line 428
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->p(Lcom/roidapp/photogrid/release/ng;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ng;->q(Lcom/roidapp/photogrid/release/ng;)I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 429
    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 430
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 431
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v2, :cond_3

    .line 432
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/an;->a(Landroid/graphics/Canvas;)V

    .line 438
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 440
    :goto_1
    return-object v0

    .line 434
    :cond_3
    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 440
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public final g()Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    return-object v0
.end method

.method public final h()[Lcom/roidapp/videolib/b/u;
    .locals 10

    .prologue
    .line 451
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->c(Lcom/roidapp/photogrid/release/ng;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    const/4 v0, 0x0

    .line 470
    :goto_0
    return-object v0

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    array-length v0, v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nh;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_4

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nh;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    new-array v1, v1, [Lcom/roidapp/videolib/b/u;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    .line 459
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 460
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    sget-object v2, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    if-eq v1, v2, :cond_2

    .line 461
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    aput-object v2, v1, v0

    .line 459
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 463
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v2

    sget-object v3, Lcom/roidapp/videolib/b/u;->e:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v3}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v3

    int-to-double v4, v3

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v6

    sget-object v3, Lcom/roidapp/videolib/b/u;->j:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v3}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v3

    sget-object v8, Lcom/roidapp/videolib/b/u;->e:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v8}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v8

    sub-int/2addr v3, v8

    int-to-double v8, v3

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    add-double/2addr v4, v6

    double-to-int v3, v4

    aget-object v2, v2, v3

    aput-object v2, v1, v0

    goto :goto_2

    .line 467
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/videolib/b/u;)V

    .line 470
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    goto :goto_0
.end method

.method public final i()Z
    .locals 2

    .prologue
    .line 475
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 476
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->d()Z

    move-result v0

    monitor-exit v1

    .line 479
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    .line 480
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->aa:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    return-object v0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nh;->a:Lcom/roidapp/photogrid/release/ng;

    iget v0, v0, Lcom/roidapp/photogrid/release/ng;->ab:I

    return v0
.end method
