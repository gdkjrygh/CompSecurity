.class public Lcom/kik/cards/web/usermedia/PhotoPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/web/usermedia/PhotoPlugin$a;,
        Lcom/kik/cards/web/usermedia/PhotoPlugin$c;,
        Lcom/kik/cards/web/usermedia/PhotoPlugin$b;
    }
.end annotation


# static fields
.field private static b:Ljava/util/Map;

.field private static final m:Lorg/c/b;


# instance fields
.field private a:Z

.field private d:Lcom/kik/m/q;

.field private e:Lcom/kik/cards/web/usermedia/c;

.field private f:Lcom/kik/cards/web/usermedia/c;

.field private g:Lcom/kik/cards/web/usermedia/i;

.field private h:Ljava/lang/String;

.field private i:Lcom/kik/cards/web/usermedia/j;

.field private j:Lcom/kik/cards/web/usermedia/a;

.field private k:Landroid/content/Context;

.field private l:Lcom/kik/cards/web/browser/BrowserPlugin$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 88
    sput-object v0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b:Ljava/util/Map;

    const-string v1, "jpg"

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget-object v0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b:Ljava/util/Map;

    const-string v1, "png"

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b:Ljava/util/Map;

    const-string v1, "jpeg"

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    const-string v0, "CardsWebNotification"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/usermedia/c;Lcom/kik/cards/web/usermedia/c;Lcom/kik/cards/web/usermedia/i;Lcom/kik/cards/web/usermedia/j;Lcom/kik/cards/web/usermedia/a;Landroid/content/Context;Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V
    .locals 1

    .prologue
    .line 260
    const-string v0, "Photo"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a:Z

    .line 261
    iput-object p7, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->h:Ljava/lang/String;

    .line 262
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->e:Lcom/kik/cards/web/usermedia/c;

    .line 263
    iput-object p2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->f:Lcom/kik/cards/web/usermedia/c;

    .line 264
    iput-object p3, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->g:Lcom/kik/cards/web/usermedia/i;

    .line 265
    iput-object p4, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->i:Lcom/kik/cards/web/usermedia/j;

    .line 266
    iput-object p5, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->j:Lcom/kik/cards/web/usermedia/a;

    .line 267
    iput-object p6, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->k:Landroid/content/Context;

    .line 268
    new-instance v0, Lcom/kik/m/q;

    invoke-direct {v0}, Lcom/kik/m/q;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->d:Lcom/kik/m/q;

    .line 269
    iput-object p8, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->l:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 270
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->k:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;IIILjava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 50
    invoke-static/range {p0 .. p6}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;IIILjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V
    .locals 4

    .prologue
    .line 414
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 416
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 417
    if-eqz p2, :cond_0

    .line 418
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 419
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 426
    :catch_0
    move-exception v0

    .line 427
    sget-object v2, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    const-string v3, "Failed to fire result"

    invoke-interface {v2, v3, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 430
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, p1, v1}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    invoke-interface {p0, v0}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 431
    return-void

    .line 423
    :cond_0
    :try_start_1
    const-string v0, "photoIds"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method static synthetic b(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Lcom/kik/m/q;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->d:Lcom/kik/m/q;

    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;IIILjava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 540
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 541
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 544
    :try_start_0
    const-string v0, "source"

    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 545
    const-string v0, "id"

    invoke-virtual {v7, v0, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 551
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v7

    .line 649
    :goto_1
    return-object v0

    .line 547
    :catch_0
    move-exception v0

    .line 548
    sget-object v3, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    const-string v4, "Error processing photo event source and index params"

    invoke-interface {v3, v4, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 555
    :cond_1
    const-string v8, ""

    .line 556
    :try_start_1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 566
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 568
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 571
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 573
    invoke-static {v0, p5, p4}, Lcom/kik/m/k;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 575
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 577
    if-eqz v3, :cond_3

    .line 579
    invoke-static {v3, p5, p4}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 581
    if-eqz v0, :cond_3

    .line 583
    if-eq v3, v0, :cond_2

    .line 584
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4

    .line 590
    :cond_2
    :try_start_2
    new-instance v3, Landroid/media/ExifInterface;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 591
    const-string v2, "Orientation"

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4

    move-result v2

    .line 592
    packed-switch v2, :pswitch_data_0

    .line 608
    :goto_2
    :pswitch_0
    :try_start_3
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 609
    int-to-float v1, v1

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 611
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 613
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 614
    invoke-virtual {v0, p2, p3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 615
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 616
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 617
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 620
    if-eqz v2, :cond_3

    .line 621
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 622
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 623
    invoke-static {v2}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v2

    .line 625
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    if-ne p2, v0, :cond_4

    .line 626
    const-string v0, "image/jpeg"

    .line 632
    :goto_3
    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    .line 633
    const-string v1, "url"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "data:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ";base64,"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    :goto_4
    move-object v0, v7

    .line 649
    goto/16 :goto_1

    .line 594
    :pswitch_1
    const/16 v1, -0x5a

    .line 595
    goto :goto_2

    .line 597
    :pswitch_2
    const/16 v1, -0xb4

    .line 598
    goto :goto_2

    .line 600
    :pswitch_3
    const/16 v1, 0x5a

    goto :goto_2

    .line 604
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_2

    .line 639
    :catch_2
    move-exception v0

    .line 640
    sget-object v1, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    const-string v2, "Error processing photo event data-url"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 628
    :cond_4
    :try_start_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    if-ne p2, v0, :cond_5

    .line 629
    const-string v0, "image/png"
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_3

    .line 642
    :catch_3
    move-exception v0

    .line 643
    sget-object v1, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    const-string v2, "Generic error processing photo event data-url"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    .line 645
    :catch_4
    move-exception v0

    .line 646
    sget-object v1, Lcom/kik/cards/web/usermedia/PhotoPlugin;->m:Lorg/c/b;

    const-string v2, "Out Of memory"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_5
    move-object v0, v8

    goto :goto_3

    .line 592
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic c(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Lcom/kik/cards/web/usermedia/j;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->i:Lcom/kik/cards/web/usermedia/j;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Z
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a:Z

    return v0
.end method


# virtual methods
.method protected final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 397
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "photo"

    invoke-direct {v0, v1, p1}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 398
    return-void
.end method

.method protected final b(Ljava/lang/String;)Lcom/kik/cards/web/usermedia/c;
    .locals 1

    .prologue
    .line 274
    const-string v0, "camera"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->f:Lcom/kik/cards/web/usermedia/c;

    .line 278
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->e:Lcom/kik/cards/web/usermedia/c;

    goto :goto_0
.end method

.method public getPhoto(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 11
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/16 v4, 0x19

    const/16 v6, 0x500

    const/4 v5, 0x0

    .line 459
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->l:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 460
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 465
    :goto_0
    return-object v0

    .line 463
    :cond_0
    const-string v0, "quality"

    const-wide v2, 0x3fe6666660000000L    # 0.699999988079071

    invoke-virtual {p2, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    const/16 v1, 0x64

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v9

    const-string v0, "maxResults"

    invoke-virtual {p2, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    const-string v0, "minResults"

    invoke-virtual {p2, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    const-string v0, "maxHeight"

    invoke-virtual {p2, v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    const-string v0, "maxWidth"

    invoke-virtual {p2, v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    const-string v0, "targetFormat"

    const-string v1, "jpg"

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "autoSave"

    invoke-virtual {p2, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    sget-object v1, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap$CompressFormat;

    move-object v6, v0

    :goto_1
    const-string v0, "source"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "camera"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "gallery"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->g:Lcom/kik/cards/web/usermedia/i;

    invoke-interface {v0}, Lcom/kik/cards/web/usermedia/i;->a()Lcom/kik/g/p;

    move-result-object v0

    move-object v10, v0

    :goto_2
    new-instance v0, Lcom/kik/cards/web/usermedia/d;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lcom/kik/cards/web/usermedia/d;-><init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Lcom/kik/cards/web/plugin/a;IIZLandroid/graphics/Bitmap$CompressFormat;III)V

    invoke-virtual {v10, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 465
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_0

    .line 463
    :cond_2
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    move-object v10, v0

    goto :goto_2
.end method

.method public savePhoto(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 472
    iget-boolean v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a:Z

    if-eqz v0, :cond_0

    .line 473
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1a4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 522
    :goto_0
    return-object v0

    .line 478
    :cond_0
    const-string v0, "url"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 482
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a:Z

    .line 484
    iget-object v1, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin;->j:Lcom/kik/cards/web/usermedia/a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/usermedia/a;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v1

    .line 485
    new-instance v2, Lcom/kik/cards/web/usermedia/g;

    invoke-direct {v2, p0, p1, v0}, Lcom/kik/cards/web/usermedia/g;-><init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 522
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method
