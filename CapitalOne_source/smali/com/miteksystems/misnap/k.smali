.class final Lcom/miteksystems/misnap/k;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/miteksystems/misnap/MitekAnalyzer;

.field private b:[B

.field private c:I

.field private d:I

.field private e:I

.field private f:D

.field private g:D

.field private h:Ljava/lang/String;


# direct methods
.method constructor <init>(ILorg/json/JSONObject;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Lcom/miteksystems/misnap/k;->c:I

    :try_start_0
    const-string v0, "Name"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/k;->h:Ljava/lang/String;

    new-instance v0, Lcom/miteksystems/misnap/MitekAnalyzer;

    const-string v1, "CameraViewfinderMinFill"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "CameraDegreesThreshold"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "CameraBrightness"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "CameraSharpness"

    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "CameraViewfinderMinHorizontalFill"

    invoke-virtual {p2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "Name"

    invoke-virtual {p2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/miteksystems/misnap/MitekAnalyzer;-><init>(IIIIILjava/lang/String;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/k;->a:Lcom/miteksystems/misnap/MitekAnalyzer;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    sget v0, Lcom/miteksystems/misnap/R$drawable;->test1080p_20:I

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/k;->a(I)V

    :cond_0
    :goto_1
    invoke-direct {p0}, Lcom/miteksystems/misnap/k;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/k;->b:[B

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    sget v0, Lcom/miteksystems/misnap/R$drawable;->test720p_20:I

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/k;->a(I)V

    goto :goto_1

    :cond_2
    if-nez p1, :cond_0

    sget v0, Lcom/miteksystems/misnap/R$drawable;->testvga_20:I

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/k;->a(I)V

    goto :goto_1
.end method

.method private a(I)V
    .locals 4

    const/4 v1, 0x0

    sget v0, Lcom/miteksystems/misnap/R$drawable;->test1080p_20:I

    if-ne p1, v0, :cond_1

    const-string v0, "res/drawable/test1080p_20.jpg"

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/miteksystems/misnap/k;->d:I

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/miteksystems/misnap/k;->e:I

    iget-object v1, p0, Lcom/miteksystems/misnap/k;->a:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget v2, p0, Lcom/miteksystems/misnap/k;->d:I

    iget v3, p0, Lcom/miteksystems/misnap/k;->e:I

    invoke-virtual {v1, v0, v2, v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->a(Landroid/graphics/Bitmap;II)[B

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/k;->b:[B

    :cond_0
    return-void

    :cond_1
    sget v0, Lcom/miteksystems/misnap/R$drawable;->test720p_20:I

    if-ne p1, v0, :cond_2

    const-string v0, "res/drawable/test720p_20.jpg"

    goto :goto_0

    :cond_2
    sget v0, Lcom/miteksystems/misnap/R$drawable;->testvga_20:I

    if-ne p1, v0, :cond_3

    const-string v0, "res/drawable/testvga_20.jpg"

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method private b()V
    .locals 18

    const-wide/16 v6, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    move v10, v2

    move-wide v12, v4

    move-wide v14, v6

    :goto_0
    move-object/from16 v0, p0

    iget v2, v0, Lcom/miteksystems/misnap/k;->c:I

    if-lt v10, v2, :cond_0

    move-object/from16 v0, p0

    iget v2, v0, Lcom/miteksystems/misnap/k;->c:I

    int-to-double v2, v2

    div-double v2, v14, v2

    const-wide v4, 0x412e848000000000L    # 1000000.0

    div-double/2addr v2, v4

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/miteksystems/misnap/k;->f:D

    move-object/from16 v0, p0

    iget v2, v0, Lcom/miteksystems/misnap/k;->c:I

    int-to-double v2, v2

    div-double v2, v12, v2

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/miteksystems/misnap/k;->g:D

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v16

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/miteksystems/misnap/k;->a:Lcom/miteksystems/misnap/MitekAnalyzer;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/miteksystems/misnap/k;->b:[B

    move-object/from16 v0, p0

    iget v4, v0, Lcom/miteksystems/misnap/k;->d:I

    move-object/from16 v0, p0

    iget v5, v0, Lcom/miteksystems/misnap/k;->e:I

    invoke-virtual {v2, v3, v4, v5}, Lcom/miteksystems/misnap/MitekAnalyzer;->a([BII)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/miteksystems/misnap/k;->a:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->o()Landroid/graphics/Rect;

    move-result-object v8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/miteksystems/misnap/k;->a:Lcom/miteksystems/misnap/MitekAnalyzer;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/miteksystems/misnap/k;->b:[B

    move-object/from16 v0, p0

    iget v4, v0, Lcom/miteksystems/misnap/k;->d:I

    iget v5, v8, Landroid/graphics/Rect;->left:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    iget v7, v8, Landroid/graphics/Rect;->right:I

    iget v9, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v9

    iget v9, v8, Landroid/graphics/Rect;->bottom:I

    iget v8, v8, Landroid/graphics/Rect;->top:I

    sub-int v8, v9, v8

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/miteksystems/misnap/k;->h:Ljava/lang/String;

    invoke-virtual/range {v2 .. v9}, Lcom/miteksystems/misnap/MitekAnalyzer;->a([BIIIIILjava/lang/String;)I

    move-result v2

    int-to-double v2, v2

    add-double v4, v12, v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long v2, v2, v16

    long-to-double v2, v2

    add-double v6, v14, v2

    add-int/lit8 v2, v10, 0x1

    move v10, v2

    move-wide v12, v4

    move-wide v14, v6

    goto :goto_0
.end method


# virtual methods
.method final a()D
    .locals 2

    iget-wide v0, p0, Lcom/miteksystems/misnap/k;->f:D

    return-wide v0
.end method
