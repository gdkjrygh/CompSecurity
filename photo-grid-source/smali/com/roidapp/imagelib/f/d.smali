.class public final Lcom/roidapp/imagelib/f/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x6

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 54
    .line 2284
    const-string v0, "matrix("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2285
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v3

    .line 2286
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v7, :cond_6

    .line 2287
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 2288
    const/16 v0, 0x9

    new-array v4, v0, [F

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v5

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v6

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v8

    const/4 v5, 0x3

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v5

    const/4 v5, 0x4

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v6, 0x3

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v5

    const/4 v5, 0x5

    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v4, v5

    aput v1, v4, v7

    const/4 v0, 0x7

    aput v1, v4, v0

    const/16 v0, 0x8

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v4, v0

    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->setValues([F)V

    move-object v0, v2

    .line 2358
    :goto_0
    return-object v0

    .line 2304
    :cond_0
    const-string v0, "translate("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2305
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v2

    .line 2306
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 2307
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 2309
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v6, :cond_8

    .line 2310
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 2312
    :goto_1
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 2313
    invoke-virtual {v1, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move-object v0, v1

    .line 2314
    goto :goto_0

    .line 2316
    :cond_1
    const-string v0, "scale("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2317
    invoke-virtual {p0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v2

    .line 2318
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 2319
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 2321
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v6, :cond_2

    .line 2322
    invoke-static {v2}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 2324
    :cond_2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 2325
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto/16 :goto_0

    .line 2328
    :cond_3
    const-string v0, "skewX("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2329
    invoke-virtual {p0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v0

    .line 2330
    invoke-static {v0}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_6

    .line 2331
    invoke-static {v0}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 2332
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 2333
    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postSkew(FF)Z

    goto/16 :goto_0

    .line 2336
    :cond_4
    const-string v0, "skewY("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2337
    invoke-virtual {p0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v0

    .line 2338
    invoke-static {v0}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_6

    .line 2339
    invoke-static {v0}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 2340
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 2341
    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postSkew(FF)Z

    goto/16 :goto_0

    .line 2344
    :cond_5
    const-string v0, "rotate("

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2345
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v3

    .line 2346
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 2347
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 2350
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v8, :cond_7

    .line 2351
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 2352
    invoke-static {v3}, Lcom/roidapp/imagelib/f/f;->a(Lcom/roidapp/imagelib/f/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move v0, v2

    .line 2354
    :goto_2
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 2355
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2356
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 2357
    neg-float v0, v0

    neg-float v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    move-object v0, v2

    .line 2358
    goto/16 :goto_0

    .line 2361
    :cond_6
    const/4 v0, 0x0

    .line 54
    goto/16 :goto_0

    :cond_7
    move v0, v1

    goto :goto_2

    :cond_8
    move v0, v1

    goto/16 :goto_1
.end method

.method public static a(Landroid/content/res/Resources;I)Lcom/roidapp/imagelib/f/b;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 89
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/f/d;->a(Ljava/io/InputStream;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/roidapp/imagelib/f/b;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/InputStream;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/roidapp/imagelib/f/b;
    .locals 4

    .prologue
    .line 179
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 180
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    .line 181
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    .line 183
    new-instance v1, Landroid/graphics/Picture;

    invoke-direct {v1}, Landroid/graphics/Picture;-><init>()V

    .line 184
    new-instance v2, Lcom/roidapp/imagelib/f/h;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/roidapp/imagelib/f/h;-><init>(Landroid/graphics/Picture;B)V

    .line 1793
    iput-object p1, v2, Lcom/roidapp/imagelib/f/h;->h:Ljava/lang/Integer;

    .line 1794
    iput-object p2, v2, Lcom/roidapp/imagelib/f/h;->i:Ljava/lang/Integer;

    .line 1798
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/imagelib/f/h;->j:Z

    .line 187
    invoke-interface {v0, v2}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 188
    new-instance v3, Lorg/xml/sax/InputSource;

    invoke-direct {v3, p0}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v0, v3}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V

    .line 190
    new-instance v0, Lcom/roidapp/imagelib/f/b;

    iget-object v3, v2, Lcom/roidapp/imagelib/f/h;->e:Landroid/graphics/RectF;

    invoke-direct {v0, v1, v3}, Lcom/roidapp/imagelib/f/b;-><init>(Landroid/graphics/Picture;Landroid/graphics/RectF;)V

    .line 191
    iget-object v1, v2, Lcom/roidapp/imagelib/f/h;->f:Landroid/graphics/Path;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/f/b;->a(Landroid/graphics/Path;)V

    .line 193
    iget-object v1, v2, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    .line 194
    iget-object v1, v2, Lcom/roidapp/imagelib/f/h;->g:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/f/b;->a(Landroid/graphics/RectF;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    :cond_0
    return-object v0

    .line 197
    :catch_0
    move-exception v0

    .line 198
    new-instance v1, Lcom/roidapp/imagelib/f/c;

    invoke-direct {v1, v0}, Lcom/roidapp/imagelib/f/c;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method static synthetic a(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 1

    .prologue
    .line 54
    invoke-static {p0, p1, p2}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    invoke-static {p0, p1}, Lcom/roidapp/imagelib/f/d;->d(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 21

    .prologue
    .line 54
    .line 4386
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v17

    .line 4387
    new-instance v18, Lcom/roidapp/imagelib/f/a;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/f/a;-><init>(Ljava/lang/CharSequence;)V

    .line 4388
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->a()V

    .line 4389
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 4390
    const/4 v9, 0x0

    .line 4391
    const/4 v8, 0x0

    .line 4392
    const/4 v7, 0x0

    .line 4393
    const/4 v6, 0x0

    .line 4394
    const/4 v5, 0x0

    .line 4395
    const/4 v4, 0x0

    .line 4396
    const/4 v3, 0x0

    move v10, v4

    move v11, v5

    move v12, v7

    move v13, v8

    move v14, v9

    move v4, v6

    .line 4397
    :goto_0
    move-object/from16 v0, v18

    iget v5, v0, Lcom/roidapp/imagelib/f/a;->a:I

    move/from16 v0, v17

    if-ge v5, v0, :cond_d

    .line 4398
    move-object/from16 v0, v18

    iget v5, v0, Lcom/roidapp/imagelib/f/a;->a:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 4399
    packed-switch v5, :pswitch_data_0

    .line 4423
    :cond_0
    :pswitch_0
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->b()V

    move/from16 v16, v5

    move v9, v5

    .line 4428
    :goto_1
    const/4 v3, 0x0

    .line 4429
    sparse-switch v16, :sswitch_data_0

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    .line 4560
    :goto_2
    if-nez v10, :cond_1

    move v5, v7

    move v6, v8

    .line 4564
    :cond_1
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->a()V

    move v10, v3

    move v11, v4

    move v12, v6

    move v13, v7

    move v14, v8

    move v4, v5

    move v3, v9

    .line 4565
    goto :goto_0

    .line 4412
    :pswitch_1
    const/16 v6, 0x6d

    if-eq v3, v6, :cond_2

    const/16 v6, 0x4d

    if-ne v3, v6, :cond_3

    .line 4413
    :cond_2
    add-int/lit8 v5, v3, -0x1

    int-to-char v5, v5

    move/from16 v16, v5

    move v9, v3

    .line 4414
    goto :goto_1

    .line 4415
    :cond_3
    const/16 v6, 0x63

    if-eq v3, v6, :cond_4

    const/16 v6, 0x43

    if-ne v3, v6, :cond_5

    :cond_4
    move/from16 v16, v3

    move v9, v3

    .line 4417
    goto :goto_1

    .line 4418
    :cond_5
    const/16 v6, 0x6c

    if-eq v3, v6, :cond_6

    const/16 v6, 0x4c

    if-ne v3, v6, :cond_0

    :cond_6
    move/from16 v16, v3

    move v9, v3

    .line 4420
    goto :goto_1

    .line 4432
    :sswitch_0
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v6

    .line 4433
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v5

    .line 4434
    const/16 v7, 0x6d

    move/from16 v0, v16

    if-ne v0, v7, :cond_7

    .line 4435
    add-float/2addr v11, v6

    .line 4436
    add-float/2addr v10, v5

    .line 4437
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 4438
    add-float/2addr v14, v6

    .line 4439
    add-float/2addr v13, v5

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    goto :goto_2

    .line 4443
    :cond_7
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Path;->moveTo(FF)V

    move v10, v3

    move v7, v5

    move v8, v6

    move v3, v5

    move v5, v4

    move v4, v6

    move v6, v12

    .line 4447
    goto :goto_2

    .line 4451
    :sswitch_1
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 4452
    invoke-virtual {v2, v11, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4457
    const/4 v3, 0x1

    move v4, v11

    move v5, v10

    move v6, v11

    move v7, v10

    move v8, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    .line 4458
    goto :goto_2

    .line 4462
    :sswitch_2
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v7

    .line 4463
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v8

    .line 4464
    const/16 v5, 0x6c

    move/from16 v0, v16

    if-ne v0, v5, :cond_8

    .line 4465
    invoke-virtual {v2, v7, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 4466
    add-float/2addr v14, v7

    .line 4467
    add-float/2addr v13, v8

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    goto/16 :goto_2

    .line 4469
    :cond_8
    invoke-virtual {v2, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v4

    move v6, v12

    move v4, v11

    move/from16 v19, v3

    move v3, v10

    move/from16 v10, v19

    move/from16 v20, v8

    move v8, v7

    move/from16 v7, v20

    .line 4473
    goto/16 :goto_2

    .line 4477
    :sswitch_3
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v7

    .line 4478
    const/16 v5, 0x68

    move/from16 v0, v16

    if-ne v0, v5, :cond_9

    .line 4479
    const/4 v5, 0x0

    invoke-virtual {v2, v7, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 4480
    add-float/2addr v14, v7

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    goto/16 :goto_2

    .line 4482
    :cond_9
    invoke-virtual {v2, v7, v13}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v4

    move v6, v12

    move v8, v7

    move v7, v13

    move v4, v11

    move/from16 v19, v3

    move v3, v10

    move/from16 v10, v19

    .line 4485
    goto/16 :goto_2

    .line 4489
    :sswitch_4
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v8

    .line 4490
    const/16 v5, 0x76

    move/from16 v0, v16

    if-ne v0, v5, :cond_a

    .line 4491
    const/4 v5, 0x0

    invoke-virtual {v2, v5, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 4492
    add-float/2addr v13, v8

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    goto/16 :goto_2

    .line 4494
    :cond_a
    invoke-virtual {v2, v14, v8}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v4

    move v6, v12

    move v7, v8

    move v4, v11

    move v8, v14

    move/from16 v19, v3

    move v3, v10

    move/from16 v10, v19

    .line 4497
    goto/16 :goto_2

    .line 4501
    :sswitch_5
    const/4 v12, 0x1

    .line 4502
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v3

    .line 4503
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v4

    .line 4504
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v5

    .line 4505
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v6

    .line 4506
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v7

    .line 4507
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v8

    .line 4508
    const/16 v15, 0x63

    move/from16 v0, v16

    if-ne v0, v15, :cond_b

    .line 4509
    add-float/2addr v3, v14

    .line 4510
    add-float/2addr v5, v14

    .line 4511
    add-float/2addr v7, v14

    .line 4512
    add-float/2addr v4, v13

    .line 4513
    add-float/2addr v6, v13

    .line 4514
    add-float/2addr v8, v13

    .line 4516
    :cond_b
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v3, v10

    move v4, v11

    move v10, v12

    move/from16 v19, v6

    move v6, v5

    move/from16 v5, v19

    move/from16 v20, v8

    move v8, v7

    move/from16 v7, v20

    .line 4521
    goto/16 :goto_2

    .line 4525
    :sswitch_6
    const/4 v15, 0x1

    .line 4526
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v5

    .line 4527
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v6

    .line 4528
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v7

    .line 4529
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v8

    .line 4530
    const/16 v3, 0x73

    move/from16 v0, v16

    if-ne v0, v3, :cond_c

    .line 4531
    add-float/2addr v5, v14

    .line 4532
    add-float/2addr v7, v14

    .line 4533
    add-float/2addr v6, v13

    .line 4534
    add-float/2addr v8, v13

    .line 4536
    :cond_c
    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v14

    sub-float/2addr v3, v12

    .line 4537
    const/high16 v12, 0x40000000    # 2.0f

    mul-float/2addr v12, v13

    sub-float v4, v12, v4

    .line 4538
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v3, v10

    move v4, v11

    move v10, v15

    move/from16 v19, v6

    move v6, v5

    move/from16 v5, v19

    move/from16 v20, v8

    move v8, v7

    move/from16 v7, v20

    .line 4543
    goto/16 :goto_2

    .line 4547
    :sswitch_7
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    .line 4548
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    .line 4549
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    .line 4550
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    .line 4551
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    .line 4552
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v14

    .line 4553
    invoke-virtual/range {v18 .. v18}, Lcom/roidapp/imagelib/f/a;->c()F

    move-result v13

    move v5, v4

    move v6, v12

    move v7, v13

    move v8, v14

    move v4, v11

    move/from16 v19, v10

    move v10, v3

    move/from16 v3, v19

    .line 4555
    goto/16 :goto_2

    .line 54
    :cond_d
    return-object v2

    .line 4399
    :pswitch_data_0
    .packed-switch 0x2b
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 4429
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_7
        0x43 -> :sswitch_5
        0x48 -> :sswitch_3
        0x4c -> :sswitch_2
        0x4d -> :sswitch_0
        0x53 -> :sswitch_6
        0x56 -> :sswitch_4
        0x5a -> :sswitch_1
        0x61 -> :sswitch_7
        0x63 -> :sswitch_5
        0x68 -> :sswitch_3
        0x6c -> :sswitch_2
        0x6d -> :sswitch_0
        0x73 -> :sswitch_6
        0x76 -> :sswitch_4
        0x7a -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;
    .locals 1

    .prologue
    .line 54
    .line 2594
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/roidapp/imagelib/f/d;->b(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v0

    .line 54
    return-object v0
.end method

.method private static b(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 3

    .prologue
    .line 598
    invoke-static {p0, p1}, Lcom/roidapp/imagelib/f/d;->d(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    .line 599
    if-nez v0, :cond_0

    .line 606
    :goto_0
    return-object p2

    .line 602
    :cond_0
    const-string v1, "px"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 603
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 606
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 204
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 206
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v4, v2

    move v0, v1

    move v3, v1

    .line 208
    :goto_0
    if-ge v4, v5, :cond_4

    .line 209
    if-eqz v0, :cond_0

    move v0, v1

    .line 208
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 213
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 214
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 251
    :sswitch_0
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 253
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_3

    .line 255
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 256
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    const/16 v3, 0x2d

    if-ne v7, v3, :cond_2

    move v3, v4

    .line 258
    goto :goto_1

    .line 237
    :sswitch_1
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 240
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 241
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/f/f;

    invoke-direct {v0, v6, v4}, Lcom/roidapp/imagelib/f/f;-><init>(Ljava/util/ArrayList;I)V

    .line 280
    :goto_2
    return-object v0

    .line 260
    :cond_2
    add-int/lit8 v0, v4, 0x1

    move v3, v0

    move v0, v2

    .line 263
    goto :goto_1

    .line 264
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 270
    :cond_4
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 271
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 274
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 280
    :cond_5
    new-instance v0, Lcom/roidapp/imagelib/f/f;

    invoke-direct {v0, v6, v3}, Lcom/roidapp/imagelib/f/f;-><init>(Ljava/util/ArrayList;I)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    .line 214
    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0x20 -> :sswitch_0
        0x29 -> :sswitch_1
        0x2c -> :sswitch_0
        0x2d -> :sswitch_0
        0x41 -> :sswitch_1
        0x43 -> :sswitch_1
        0x48 -> :sswitch_1
        0x4c -> :sswitch_1
        0x4d -> :sswitch_1
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x54 -> :sswitch_1
        0x56 -> :sswitch_1
        0x5a -> :sswitch_1
        0x61 -> :sswitch_1
        0x63 -> :sswitch_1
        0x68 -> :sswitch_1
        0x6c -> :sswitch_1
        0x6d -> :sswitch_1
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x74 -> :sswitch_1
        0x76 -> :sswitch_1
        0x7a -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic c(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/roidapp/imagelib/f/f;
    .locals 3

    .prologue
    .line 3574
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    .line 3575
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 3576
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3577
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/f/d;->c(Ljava/lang/String;)Lcom/roidapp/imagelib/f/f;

    move-result-object v0

    :goto_1
    return-object v0

    .line 3575
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3580
    :cond_1
    const/4 v0, 0x0

    .line 54
    goto :goto_1
.end method

.method private static d(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 584
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v1

    .line 585
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 586
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 587
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v0

    .line 590
    :goto_1
    return-object v0

    .line 585
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 590
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
