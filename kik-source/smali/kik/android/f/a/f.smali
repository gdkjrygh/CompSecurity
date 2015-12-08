.class public final Lkik/android/f/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:I

.field private static final d:[Lkik/a/d/a/a$c;

.field private static final e:Ljava/util/Map;

.field private static final f:Lorg/c/b;

.field private static o:Lkik/android/f/a/f;


# instance fields
.field private g:Ljava/util/Hashtable;

.field private h:Lkik/a/d/a/a;

.field private i:J

.field private j:Z

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;

.field private m:[B

.field private n:Z

.field private p:Lkik/a/e/t;

.field private q:Lkik/a/e/v;

.field private r:Lcom/kik/l/ab;

.field private s:Lkik/a/f/k;

.field private t:Lcom/kik/cache/ad;

.field private u:Lkik/a/e/q;

.field private v:Lkik/android/util/ar;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 116
    const v0, 0x2dc6c0

    sput v0, Lkik/android/f/a/f;->a:I

    .line 117
    const v0, 0x493e0

    sput v0, Lkik/android/f/a/f;->b:I

    .line 118
    const/16 v0, 0x2710

    sput v0, Lkik/android/f/a/f;->c:I

    .line 133
    const/4 v0, 0x5

    new-array v0, v0, [Lkik/a/d/a/a$c;

    const/4 v1, 0x0

    sget-object v2, Lkik/a/d/a/a$c;->c:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lkik/a/d/a/a$c;->d:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    sput-object v0, Lkik/android/f/a/f;->d:[Lkik/a/d/a/a$c;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 143
    sput-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->c:Lkik/a/d/a/a$c;

    sget-object v2, Lkik/android/gifs/a/f$a;->a:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    sget-object v2, Lkik/android/gifs/a/f$a;->b:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    sget-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    sget-object v2, Lkik/android/gifs/a/f$a;->c:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->d:Lkik/a/d/a/a$c;

    sget-object v2, Lkik/android/gifs/a/f$a;->g:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    sget-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    sget-object v2, Lkik/android/gifs/a/f$a;->d:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "PlatformHelper"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/f/a/f;->f:Lorg/c/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/android/f/a/f;->g:Ljava/util/Hashtable;

    .line 198
    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 1490
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 1491
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 1492
    const/high16 v0, 0x42400000    # 48.0f

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 1493
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 1494
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1495
    const/4 v6, 0x1

    move-object v0, p0

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1496
    return-object v0
.end method

.method static synthetic a(Lkik/android/f/a/f;)Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lkik/android/f/a/f;->t:Lcom/kik/cache/ad;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/kik/f/a/a/c;)Lcom/kik/f/a/a/a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1776
    if-nez p1, :cond_0

    move-object v0, v2

    .line 1785
    :goto_0
    return-object v0

    :cond_0
    move v0, v1

    .line 1779
    :goto_1
    invoke-virtual {p1}, Lcom/kik/f/a/a/c;->b()I

    move-result v3

    if-ge v0, v3, :cond_5

    .line 1780
    invoke-virtual {p1, v0}, Lcom/kik/f/a/a/c;->a(I)Lcom/kik/f/a/a/a;

    move-result-object v3

    .line 1781
    invoke-virtual {v3}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    :cond_1
    invoke-virtual {v3}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "cards"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_4

    move-object v0, v3

    .line 1782
    goto :goto_0

    :cond_3
    move v4, v1

    .line 1781
    goto :goto_2

    .line 1779
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move-object v0, v2

    .line 1785
    goto :goto_0
.end method

.method public static a(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1485
    invoke-virtual {p0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Intent;)Lkik/a/d/a/a;
    .locals 14

    .prologue
    const/4 v4, 0x0

    .line 1501
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 1503
    const-string v0, "com.kik.platform.content.EXTRA_CONTENT_ID"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1504
    if-nez v1, :cond_0

    .line 1505
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1508
    :cond_0
    const-string v0, "com.kik.platform.content.EXTRA_APP_ID"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1510
    const-string v0, "com.kik.platform.content.EXTRA_EXTRA_HASH"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 1511
    if-nez v0, :cond_2

    new-instance v8, Ljava/util/Hashtable;

    invoke-direct {v8}, Ljava/util/Hashtable;-><init>()V

    .line 1513
    :goto_0
    const-string v0, "com.kik.platform.content.EXTRA_STRING_HASH"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 1514
    if-nez v0, :cond_3

    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    .line 1519
    :goto_1
    const-string v0, "allow-forward"

    const/4 v3, 0x1

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 1520
    const-string v3, "allow-forward"

    if-eqz v0, :cond_4

    const-string v0, "true"

    :goto_2
    invoke-virtual {v6, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1522
    new-instance v7, Ljava/util/Vector;

    invoke-direct {v7}, Ljava/util/Vector;-><init>()V

    .line 1523
    invoke-virtual {v6}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 1525
    :cond_1
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1526
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1527
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v10, "[a-zA-Z0-9\\-\\._]*"

    invoke-virtual {v3, v10}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1528
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1511
    :cond_2
    new-instance v8, Ljava/util/Hashtable;

    invoke-direct {v8, v0}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V

    goto :goto_0

    .line 1514
    :cond_3
    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6, v0}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V

    goto :goto_1

    .line 1520
    :cond_4
    const-string v0, "false"

    goto :goto_2

    .line 1532
    :cond_5
    invoke-virtual {v7}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1533
    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 1535
    :cond_6
    const-string v0, "file-size"

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 1536
    invoke-virtual {p0, v1}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1537
    if-eqz v0, :cond_7

    .line 1538
    const-string v3, "file-url"

    invoke-virtual {v6, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1540
    :cond_7
    :try_start_0
    const-string v0, "com.kik.platform.content.EXTRA_LOCAL_FILE_URI"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    const-string v3, "content:"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "file:///data/data/kik.android/thirdpartyfiles/"

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    :goto_5
    if-eqz v3, :cond_b

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    .line 1543
    :goto_6
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    .line 1544
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_c

    .line 1545
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Cannot attach file because it does not exist!"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1552
    :catch_0
    move-exception v0

    move-object v0, v4

    .line 1553
    :cond_8
    if-eqz v0, :cond_9

    .line 1557
    const-string v3, "int-file-url-local"

    invoke-virtual {v6, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1558
    const-string v0, "int-file-state"

    const-string v3, "0"

    invoke-virtual {v6, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1559
    const-string v0, "int-chunk-progress"

    const-string v3, "0"

    invoke-virtual {v6, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1563
    :cond_9
    const-string v0, "com.kik.platform.content.EXTRA_IMAGE_HASH"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 1564
    new-instance v7, Ljava/util/Hashtable;

    invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V

    .line 1565
    if-eqz v0, :cond_d

    .line 1566
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 1567
    :cond_a
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1568
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1570
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "icon"

    if-eq v4, v5, :cond_a

    .line 1571
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lkik/a/d/d;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v5, v0}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v7, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_b
    move-object v3, v4

    .line 1540
    goto :goto_6

    .line 1547
    :cond_c
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v10

    const-wide/32 v12, 0x989680

    cmp-long v3, v10, v12

    if-lez v3, :cond_8

    .line 1548
    new-instance v0, Ljava/io/IOException;

    const-string v3, "File too large! Cannot exceed 10000000 bytes"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1576
    :cond_d
    const-string v0, "com.kik.platform.content.EXTRA_URIS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 1577
    const-string v0, "com.kik.platform.content.EXTRA_URI_PLATFORMS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 1578
    const-string v0, "com.kik.platform.content.EXTRA_URI_PRIORITIES"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 1580
    new-instance v0, Lkik/a/d/a/a;

    const-string v3, "2"

    invoke-direct/range {v0 .. v8}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    .line 1582
    return-object v0

    :cond_e
    move-object v3, v0

    goto/16 :goto_5
.end method

.method public static a()Lkik/android/f/a/f;
    .locals 1

    .prologue
    .line 202
    sget-object v0, Lkik/android/f/a/f;->o:Lkik/android/f/a/f;

    if-nez v0, :cond_0

    .line 203
    new-instance v0, Lkik/android/f/a/f;

    invoke-direct {v0}, Lkik/android/f/a/f;-><init>()V

    sput-object v0, Lkik/android/f/a/f;->o:Lkik/android/f/a/f;

    .line 205
    :cond_0
    sget-object v0, Lkik/android/f/a/f;->o:Lkik/android/f/a/f;

    return-object v0
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 1475
    if-nez p0, :cond_0

    .line 1480
    :goto_0
    return-void

    .line 1479
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Landroid/app/Activity;IZLkik/a/e/r;)V
    .locals 3

    .prologue
    .line 1440
    if-nez p1, :cond_0

    .line 1471
    :goto_0
    return-void

    .line 1445
    :cond_0
    const/4 v0, 0x0

    .line 1447
    if-eqz p0, :cond_1

    .line 1448
    const/4 v0, 0x0

    invoke-interface {p4, p0, v0}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 1451
    :cond_1
    if-eqz v0, :cond_3

    .line 1452
    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1453
    new-instance v1, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 1454
    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 1456
    invoke-static {v1, p1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0

    .line 1459
    :cond_2
    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    .line 1460
    invoke-virtual {v1, p3}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 1463
    invoke-static {v1, p1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0

    .line 1467
    :cond_3
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    .line 1468
    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 1469
    invoke-static {v0, p1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/kik/g/p;I)V
    .locals 4

    .prologue
    .line 584
    if-nez p1, :cond_0

    .line 586
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 617
    :goto_0
    return-void

    .line 589
    :cond_0
    invoke-static {p1}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 590
    invoke-static {p1}, Lkik/android/f/a/f;->i(Ljava/lang/String;)J

    move-result-wide v0

    .line 591
    int-to-long v2, p3

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 592
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 595
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Image too large."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 599
    :cond_2
    invoke-static {p1}, Lkik/a/h/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 600
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Image url is invalid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 604
    :cond_3
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    new-instance v1, Lkik/android/f/a/q;

    invoke-direct {v1, p0, p1, v0}, Lkik/android/f/a/q;-><init>(Lkik/android/f/a/f;Ljava/lang/String;Lcom/kik/g/p;)V

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v1, v2}, Lkik/android/f/a/q;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    new-instance v1, Lkik/android/f/a/g;

    invoke-direct {v1, p0, p3, p2}, Lkik/android/f/a/g;-><init>(Lkik/android/f/a/f;ILcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lkik/a/d/a/a;Landroid/content/Context;Lkik/a/e/v;)Z
    .locals 6

    .prologue
    .line 1112
    invoke-virtual {p2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p3, p4}, Lkik/android/util/e;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkik/a/e/v;)Ljava/io/File;

    move-result-object v1

    .line 1113
    if-nez v1, :cond_0

    .line 1115
    const/4 v0, 0x0

    .line 1148
    :goto_0
    return v0

    .line 1117
    :cond_0
    invoke-virtual {p2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    .line 1118
    if-nez v0, :cond_1

    .line 1119
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1121
    :cond_1
    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1122
    if-eqz v0, :cond_2

    .line 1123
    const-string v2, "file-url"

    invoke-virtual {p2, v2, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    :cond_2
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    .line 1128
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_5

    .line 1129
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Cannot attach file because it does not exist!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1136
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    .line 1137
    :cond_3
    if-eqz v0, :cond_4

    .line 1141
    const-string v2, "int-file-url-local"

    invoke-virtual {p2, v2, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    const-string v0, "int-file-state"

    const-string v2, "0"

    invoke-virtual {p2, v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1143
    const-string v0, "int-chunk-progress"

    const-string v2, "0"

    invoke-virtual {p2, v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1144
    const-string v0, "file-size"

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1147
    :cond_4
    invoke-virtual {p2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->f(Ljava/lang/String;)V

    .line 1148
    const/4 v0, 0x1

    goto :goto_0

    .line 1131
    :cond_5
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/32 v4, 0x989680

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    .line 1132
    new-instance v0, Ljava/io/IOException;

    const-string v2, "File too large! Cannot exceed 10000000 bytes"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
.end method

.method private a(Lkik/a/d/a/a;Landroid/content/Context;)Z
    .locals 9

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 1157
    invoke-virtual {p1}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v1

    .line 1158
    invoke-static {v1}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1247
    :cond_0
    :goto_0
    return v0

    .line 1161
    :cond_1
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {p2, v2}, Lkik/android/util/ct;->a(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide v4

    .line 1162
    const-wide/32 v6, 0x1d4c0

    cmp-long v2, v4, v6

    if-gtz v2, :cond_0

    .line 1167
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1168
    iget-object v2, p0, Lkik/android/f/a/f;->u:Lkik/a/e/q;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lkik/a/e/q;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 1169
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_8

    .line 1175
    const/16 v2, 0x12

    :try_start_0
    invoke-static {v2}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v6

    .line 1179
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 1180
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1181
    const/16 v1, 0x400

    :try_start_2
    new-array v3, v1, [B

    move v1, v0

    .line 1183
    :goto_1
    invoke-virtual {v4, v3}, Ljava/io/InputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_3

    .line 1184
    const/high16 v8, 0xf00000

    if-le v1, v8, :cond_2

    if-nez v6, :cond_2

    .line 1186
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1187
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1189
    :cond_2
    const/4 v8, 0x0

    :try_start_3
    invoke-virtual {v2, v3, v8, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 1190
    add-int/2addr v1, v7

    goto :goto_1

    .line 1194
    :cond_3
    const-string v1, "preview"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    if-nez v1, :cond_4

    .line 1195
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1196
    if-eqz v1, :cond_5

    .line 1197
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v6, 0x50

    invoke-static {v1, v3, v6}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    .line 1198
    if-eqz v1, :cond_4

    .line 1199
    new-instance v3, Lkik/a/d/o;

    invoke-direct {v3, v1}, Lkik/a/d/o;-><init>([B)V

    .line 1200
    const-string v1, "preview"

    invoke-virtual {p1, v1, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 1210
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    const/16 v1, 0x12

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v3

    .line 1211
    if-eqz v3, :cond_6

    .line 1213
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/ak;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1214
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1215
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto/16 :goto_0

    .line 1204
    :cond_5
    :try_start_4
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1206
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto/16 :goto_0

    .line 1220
    :cond_6
    if-nez v3, :cond_a

    .line 1221
    :try_start_5
    iget-object v1, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v6, v7}, Lcom/kik/l/ab;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 1223
    :goto_2
    if-eqz v1, :cond_9

    .line 1224
    iget-object v1, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Lcom/kik/l/ab;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1225
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 1227
    :cond_7
    iget-object v1, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Lcom/kik/l/ab;->f(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(Ljava/io/File;)V

    .line 1233
    :goto_3
    invoke-virtual {p1, v3}, Lkik/a/d/a/a;->a(Z)V

    .line 1234
    sget v1, Lkik/a/d/a/a$a;->b:I

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(I)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1241
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1246
    :cond_8
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->f(Ljava/lang/String;)V

    .line 1247
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 1230
    :cond_9
    :try_start_6
    invoke-virtual {p1, v5}, Lkik/a/d/a/a;->a(Ljava/io/File;)V
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_3

    .line 1236
    :catch_0
    move-exception v1

    move-object v3, v4

    :goto_4
    move-object v4, v3

    :goto_5
    :try_start_7
    invoke-static {v1}, Lkik/android/util/bx;->b(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1238
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto/16 :goto_0

    .line 1241
    :catchall_0
    move-exception v0

    move-object v2, v3

    move-object v4, v3

    :goto_6
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1242
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    throw v0

    .line 1241
    :catchall_1
    move-exception v0

    move-object v2, v3

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_6

    .line 1236
    :catch_1
    move-exception v1

    move-object v2, v3

    move-object v4, v3

    goto :goto_5

    :catch_2
    move-exception v1

    move-object v2, v3

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v1

    move-object v2, v3

    goto :goto_4

    :catch_5
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    goto :goto_4

    :cond_a
    move v1, v0

    goto :goto_2
.end method

.method static synthetic a(Lkik/android/f/a/f;Ljava/lang/String;Lkik/a/d/a/a;Landroid/content/Context;Lkik/a/e/v;)Z
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1, p2, p3, p4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Lkik/a/d/a/a;Landroid/content/Context;Lkik/a/e/v;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lkik/android/f/a/f;Lkik/a/d/a/a;Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static c(Lkik/a/d/a/a;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1798
    if-nez p0, :cond_1

    .line 1802
    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v1, "com.kik.ext.camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "com.kik.ext.gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    invoke-virtual {p0}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, "image"

    invoke-virtual {p0, v1}, Lkik/a/d/a/a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static d(Lkik/a/d/a/a;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1809
    if-nez p0, :cond_1

    .line 1813
    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v1, "com.kik.ext.video-camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "com.kik.ext.video-gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {p0}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static i(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 621
    invoke-static {p0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 622
    if-eqz v0, :cond_0

    .line 624
    :try_start_0
    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 625
    array-length v0, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v0

    .line 631
    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/kik/KikMessageParcelable;Landroid/support/v4/app/Fragment;ILkik/a/e/r;)Lcom/kik/g/p;
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 1253
    new-instance v7, Lcom/kik/g/p;

    invoke-direct {v7}, Lcom/kik/g/p;-><init>()V

    .line 1254
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 1255
    invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v3, p0, Lkik/android/f/a/f;->t:Lcom/kik/cache/ad;

    invoke-static {v0, p1, v3}, Lkik/android/f/a/ae;->a(Landroid/app/Activity;Lcom/kik/cards/web/kik/KikMessageParcelable;Lcom/kik/cache/ad;)Lcom/kik/g/p;

    move-result-object v8

    .line 1258
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 1259
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 1320
    :goto_0
    instance-of v0, p2, Lkik/android/chat/fragment/KikCardBrowserFragment;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 1321
    check-cast v0, Lkik/android/chat/fragment/KikCardBrowserFragment;

    .line 1322
    new-instance v1, Lkik/android/f/a/i;

    invoke-direct {v1, p0, v8, v0, p2}, Lkik/android/f/a/i;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/android/chat/fragment/KikCardBrowserFragment;Landroid/support/v4/app/Fragment;)V

    invoke-virtual {v2, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1341
    :cond_0
    new-instance v0, Lkik/android/f/a/k;

    invoke-direct {v0, p0, v7}, Lkik/android/f/a/k;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1362
    new-instance v0, Lkik/android/f/a/l;

    move-object v1, p0

    move-object v3, p4

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lkik/android/f/a/l;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/a/e/r;Landroid/support/v4/app/Fragment;IZLcom/kik/g/p;)V

    invoke-virtual {v8, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1435
    return-object v7

    .line 1262
    :cond_1
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->g:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 1263
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->g:Ljava/lang/String;

    invoke-interface {p4, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    .line 1264
    if-eqz v0, :cond_2

    .line 1265
    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 1268
    :cond_2
    iget-object v0, p1, Lcom/kik/cards/web/kik/KikMessageParcelable;->g:Ljava/lang/String;

    invoke-interface {p4, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 1269
    new-instance v1, Lkik/android/f/a/ad;

    invoke-direct {v1, p0, v2}, Lkik/android/f/a/ad;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 1289
    :cond_3
    invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->m()Lcom/kik/g/l;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/kik/g/l;->a(Lcom/kik/g/p;)J

    move-result-wide v4

    .line 1291
    new-instance v0, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    .line 1292
    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    move-result-object v3

    invoke-virtual {v3, v4, v5}, Lkik/android/chat/fragment/SendToFragment$a;->a(J)Lkik/android/chat/fragment/SendToFragment$a;

    move-result-object v3

    invoke-virtual {v3, p3}, Lkik/android/chat/fragment/SendToFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 1296
    invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v0, v3}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    .line 1297
    new-instance v3, Lkik/android/f/a/h;

    invoke-direct {v3, p0, v2}, Lkik/android/f/a/h;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move v6, v1

    goto/16 :goto_0
.end method

.method public final a(Ljava/lang/String;Lkik/android/gifs/a/f;Lcom/kik/cache/ad;Landroid/graphics/Bitmap;)Lcom/kik/g/p;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 747
    :try_start_0
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 748
    new-instance v3, Lkik/a/d/a/a;

    const-string v2, "com.kik.ext.gif"

    invoke-direct {v3, v2}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;)V

    .line 749
    const-string v2, "layout"

    sget-object v4, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v4}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {p1, v2, v4}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {p3, v2, v4}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;Z)Lcom/kik/g/p;

    move-result-object v2

    const-wide/16 v4, 0x7d0

    invoke-static {v2, v4, v5}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v2

    .line 754
    new-instance v4, Lkik/android/f/a/r;

    invoke-direct {v4, p0, v3, v1, p4}, Lkik/android/f/a/r;-><init>(Lkik/android/f/a/f;Lkik/a/d/a/a;Lcom/kik/g/p;Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 772
    const-string v2, "icon"

    new-instance v4, Lkik/a/d/d;

    const v5, 0x7f02012f

    invoke-static {v5}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v3, v2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 773
    const-string v2, "allow-forward"

    const-string v4, "true"

    invoke-virtual {v3, v2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    const-string v2, "true"

    invoke-virtual {v3, v2}, Lkik/a/d/a/a;->j(Ljava/lang/String;)V

    .line 775
    const-string v2, "true"

    invoke-virtual {v3, v2}, Lkik/a/d/a/a;->k(Ljava/lang/String;)V

    .line 776
    const-string v2, "true"

    invoke-virtual {v3, v2}, Lkik/a/d/a/a;->i(Ljava/lang/String;)V

    .line 777
    const-string v2, "true"

    invoke-virtual {v3, v2}, Lkik/a/d/a/a;->l(Ljava/lang/String;)V

    .line 779
    sget-object v4, Lkik/android/f/a/f;->d:[Lkik/a/d/a/a$c;

    array-length v5, v4

    move v2, v0

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v6, v4, v2

    .line 784
    sget-object v0, Lkik/android/f/a/f;->e:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/f$a;

    invoke-virtual {p2, v0}, Lkik/android/gifs/a/f;->a(Lkik/android/gifs/a/f$a;)Lkik/android/gifs/a/e;

    move-result-object v0

    .line 785
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/android/gifs/a/e;->a()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 786
    invoke-virtual {v0}, Lkik/android/gifs/a/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v7, "video"

    invoke-virtual {v3, v0, v7, v6}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;Lkik/a/d/a/a$c;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 783
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 793
    :goto_1
    return-object v0

    .line 791
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 793
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Lkik/a/d/a/a;Landroid/app/Activity;Lkik/a/e/r;Lkik/a/e/v;)Lcom/kik/g/p;
    .locals 12

    .prologue
    .line 902
    new-instance v5, Lcom/kik/g/p;

    invoke-direct {v5}, Lcom/kik/g/p;-><init>()V

    .line 903
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 905
    new-instance v7, Lcom/kik/g/p;

    invoke-direct {v7}, Lcom/kik/g/p;-><init>()V

    .line 907
    new-instance v0, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    .line 909
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    .line 910
    invoke-static {v0, p2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    .line 911
    new-instance v1, Lkik/android/f/a/t;

    invoke-direct {v1, p0, v2}, Lkik/android/f/a/t;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 934
    new-instance v3, Lcom/kik/g/p;

    invoke-direct {v3}, Lcom/kik/g/p;-><init>()V

    invoke-virtual {p1}, Lkik/a/d/a/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lkik/a/d/a/a;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v0, 0x0

    invoke-virtual {p1}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_1
    const/4 v9, 0x3

    if-ge v0, v9, :cond_0

    new-instance v9, Lcom/kik/g/p;

    invoke-direct {v9}, Lcom/kik/g/p;-><init>()V

    sget v10, Lkik/android/f/a/f;->c:I

    int-to-long v10, v10

    invoke-static {v9, v10, v11}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    sget v9, Lkik/android/f/a/f;->b:I

    invoke-direct {p0, v4, v0, v9}, Lkik/android/f/a/f;->a(Ljava/lang/String;Lcom/kik/g/p;I)V

    const/4 v0, 0x1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    sget v4, Lkik/android/f/a/f;->b:I

    invoke-direct {p0, v6, v0, v4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Lcom/kik/g/p;I)V

    const/4 v0, 0x2

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    sget v4, Lkik/android/f/a/f;->a:I

    invoke-direct {p0, v1, v0, v4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Lcom/kik/g/p;I)V

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    const/4 v1, 0x1

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v1

    const/4 v0, 0x2

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    invoke-static {v1, v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v0

    new-instance v1, Lkik/android/f/a/s;

    invoke-direct {v1, p0, v3}, Lkik/android/f/a/s;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/aq;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v0, Lkik/android/f/a/u;

    invoke-direct {v0, p0, v7, p1, p2}, Lkik/android/f/a/u;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;Lkik/a/d/a/a;Landroid/app/Activity;)V

    invoke-virtual {v3, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 977
    new-instance v0, Lkik/android/f/a/w;

    invoke-direct {v0, p0, v7, p2, v5}, Lkik/android/f/a/w;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;Landroid/app/Activity;Lcom/kik/g/p;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1022
    new-instance v0, Lkik/android/f/a/z;

    move-object v1, p0

    move-object v3, p2

    move-object/from16 v4, p4

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lkik/android/f/a/z;-><init>(Lkik/android/f/a/f;Lcom/kik/g/p;Landroid/app/Activity;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/r;)V

    invoke-virtual {v7, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1102
    return-object v5

    :cond_1
    move-object v1, v0

    goto/16 :goto_0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 223
    if-nez p1, :cond_0

    .line 238
    :goto_0
    return-object v0

    .line 229
    :cond_0
    :try_start_0
    const-string v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 234
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 235
    const/4 v2, 0x0

    array-length v3, v1

    invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 236
    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 237
    iget-object v1, p0, Lkik/android/f/a/f;->g:Ljava/util/Hashtable;

    invoke-virtual {v1, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 231
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Landroid/app/Activity;Landroid/content/Intent;)Lkik/a/d/a/a;
    .locals 10

    .prologue
    const v9, 0x7f09010d

    const v8, 0x7f09005f

    const v7, 0x7f020124

    const v6, 0x7f020043

    .line 305
    invoke-virtual {p1}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object v3

    .line 306
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 308
    invoke-direct {p0, p2}, Lkik/android/f/a/f;->a(Landroid/content/Intent;)Lkik/a/d/a/a;

    move-result-object v5

    .line 309
    const-string v0, "app-pkg"

    invoke-virtual {v5, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v2, ""

    .line 312
    const/4 v1, 0x0

    .line 313
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 314
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 315
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "com.kik.platform.content.EXTRA_APP_ID"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    const-string v3, "com.kik.ext.camera"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 317
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 318
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 358
    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 359
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 360
    const-string v3, "icon"

    new-instance v4, Lkik/a/d/d;

    invoke-static {v1}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v6

    invoke-direct {v4, v6}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v5, v3, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 361
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eq v1, v0, :cond_0

    .line 362
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 366
    :cond_0
    invoke-static {v2}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 367
    const-string v0, "app-name"

    invoke-virtual {v5, v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    :cond_1
    return-object v5

    .line 320
    :cond_2
    const-string v3, "com.kik.ext.gallery"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 321
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 322
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_0

    .line 324
    :cond_3
    const-string v3, "com.kik.ext.video-camera"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 325
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 326
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_0

    .line 328
    :cond_4
    const-string v3, "com.kik.ext.video-gallery"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 329
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 330
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    :goto_1
    move-object v2, v1

    .line 332
    goto/16 :goto_0

    .line 335
    :cond_5
    invoke-virtual {p1}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 336
    if-eqz v0, :cond_6

    .line 338
    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 346
    :goto_2
    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v4, v3, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v2

    goto/16 :goto_0

    .line 340
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 347
    goto :goto_2

    :catch_1
    move-exception v0

    :cond_6
    move-object v0, v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto/16 :goto_0

    :cond_7
    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    :cond_8
    move-object v0, v1

    goto/16 :goto_0
.end method

.method public final a(Landroid/app/Activity;Ljava/io/File;Lkik/a/e/v;)Lkik/a/d/a/a;
    .locals 10

    .prologue
    const v9, 0x7f09001f

    const/4 v8, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 675
    :try_start_0
    new-instance v1, Lkik/a/d/a/a;

    const-string v3, "com.kik.ext.gallery"

    invoke-direct {v1, v3}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;)V

    move v4, v2

    move-object v3, v0

    .line 680
    :goto_0
    sget-object v5, Lkik/android/util/e;->a:[I

    array-length v5, v5

    if-lt v4, v5, :cond_0

    .line 682
    new-instance v4, Ljava/lang/Throwable;

    const-string v5, "Gallery content message: All gallery resolutions failed to send"

    invoke-direct {v4, v5}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    move-object v4, v3

    .line 693
    :goto_1
    if-nez v4, :cond_1

    .line 694
    const v1, 0x7f09001f

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 735
    :goto_2
    return-object v0

    .line 686
    :cond_0
    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    sget-object v6, Lkik/android/util/e;->a:[I

    aget v6, v6, v4

    invoke-static {p2, v3, v5, v6, p3}, Lkik/android/util/e;->a(Ljava/io/File;Ljava/lang/String;ZILkik/a/e/v;)Ljava/io/File;

    move-result-object v3

    .line 687
    if-nez v3, :cond_5

    .line 688
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 698
    :cond_1
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkik/android/util/u;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 699
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/r;->a(Ljava/lang/String;)I

    move-result v5

    .line 700
    if-ltz v5, :cond_2

    .line 701
    invoke-static {v3, v5}, Lkik/android/util/r;->b(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 703
    :cond_2
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v6, 0x50

    invoke-static {v3, v5, v6}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v3

    .line 704
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "gallery message preview size:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v3, :cond_4

    :goto_3
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 706
    const-string v2, "preview"

    new-instance v5, Lkik/a/d/o;

    invoke-direct {v5, v3}, Lkik/a/d/o;-><init>([B)V

    invoke-virtual {v1, v2, v5}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 707
    const-string v2, "icon"

    new-instance v3, Lkik/a/d/d;

    const v5, 0x7f020124

    invoke-static {v5}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v3, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 708
    const-string v2, "allow-forward"

    const-string v3, "true"

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    const-string v2, "file-name"

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    const-string v2, "file-size"

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 715
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 720
    :goto_4
    if-eqz v2, :cond_3

    .line 721
    :try_start_2
    const-string v3, "int-file-url-local"

    invoke-virtual {v1, v3, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    const-string v2, "int-file-state"

    const-string v3, "0"

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 723
    const-string v2, "int-chunk-progress"

    const-string v3, "0"

    invoke-virtual {v1, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 726
    if-eqz v2, :cond_3

    .line 727
    const-string v3, "file-url"

    invoke-virtual {v1, v3, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    move-object v0, v1

    .line 730
    goto/16 :goto_2

    .line 704
    :cond_4
    array-length v2, v3

    goto :goto_3

    .line 717
    :catch_0
    move-exception v2

    invoke-static {v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-object v2, v0

    goto :goto_4

    .line 732
    :catch_1
    move-exception v1

    .line 733
    invoke-static {p1, v9, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 734
    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    :cond_5
    move-object v4, v3

    goto/16 :goto_1
.end method

.method public final a(Landroid/app/Activity;Ljava/lang/String;JLjava/lang/String;)Lkik/a/d/a/a;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 495
    new-instance v1, Lkik/a/d/a/a;

    const-string v0, "com.kik.ext.video-camera"

    invoke-direct {v1, v0, p5}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 498
    invoke-static {p1, p2}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 500
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x5a

    invoke-static {v0, v3, v4}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v3

    .line 501
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "video message preview size:"

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v3, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 503
    const-string v0, "preview"

    new-instance v4, Lkik/a/d/o;

    invoke-direct {v4, v3}, Lkik/a/d/o;-><init>([B)V

    invoke-virtual {v1, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 504
    const-string v0, "icon"

    new-instance v3, Lkik/a/d/d;

    const v4, 0x7f020043

    invoke-static {v4}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v4}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v4}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v4

    invoke-direct {v3, v4}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 505
    const-string v0, "allow-forward"

    const-string v3, "true"

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v0, "layout"

    sget-object v3, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v3}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    const-string v0, "file-content-type"

    const-string v3, "video/mp4"

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    const-string v0, "file-name"

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    const-string v0, "file-size"

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    invoke-virtual {v1, p3, p4}, Lkik/a/d/a/a;->a(J)Ljava/lang/String;

    .line 513
    const/4 v0, 0x0

    .line 515
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 520
    :goto_1
    if-eqz v0, :cond_0

    .line 521
    const-string v2, "int-file-url-local"

    invoke-virtual {v1, v2, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    const-string v0, "int-file-state"

    const-string v2, "0"

    invoke-virtual {v1, v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    const-string v0, "int-chunk-progress"

    const-string v2, "0"

    invoke-virtual {v1, v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 526
    if-eqz v0, :cond_0

    .line 527
    const-string v2, "file-url"

    invoke-virtual {v1, v2, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    :cond_0
    return-object v1

    .line 501
    :cond_1
    array-length v0, v3

    goto/16 :goto_0

    .line 517
    :catch_0
    move-exception v2

    invoke-static {v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Landroid/app/Activity;[BLkik/a/e/v;)Lkik/a/d/a/a;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 452
    new-instance v2, Lkik/a/d/a/a;

    const-string v0, "com.kik.ext.camera"

    invoke-direct {v2, v0}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;)V

    .line 453
    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p3}, Lkik/android/util/e;->a([BLjava/lang/String;Lkik/a/e/v;)Ljava/io/File;

    move-result-object v3

    .line 454
    if-nez v3, :cond_0

    .line 455
    const v0, 0x7f090134

    const/4 v2, 0x1

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move-object v0, v1

    .line 489
    :goto_0
    return-object v0

    .line 460
    :cond_0
    const/16 v0, 0x190

    invoke-static {p2, v0}, Lkik/android/util/u;->b([BI)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 461
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x50

    invoke-static {v0, v4, v5}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v4

    .line 462
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v0, "camera message preview size:"

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v4, :cond_2

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    const-string v0, "preview"

    new-instance v5, Lkik/a/d/o;

    invoke-direct {v5, v4}, Lkik/a/d/o;-><init>([B)V

    invoke-virtual {v2, v0, v5}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 465
    const-string v0, "icon"

    new-instance v4, Lkik/a/d/d;

    const v5, 0x7f020043

    invoke-static {v5}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 466
    const-string v0, "allow-forward"

    const-string v4, "true"

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    const-string v0, "file-content-type"

    const-string v4, "image/jpeg"

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    const-string v0, "file-name"

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    const-string v0, "file-size"

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 479
    :goto_2
    if-eqz v1, :cond_1

    .line 480
    const-string v0, "int-file-url-local"

    invoke-virtual {v2, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    const-string v0, "int-file-state"

    const-string v1, "0"

    invoke-virtual {v2, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    const-string v0, "int-chunk-progress"

    const-string v1, "0"

    invoke-virtual {v2, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 485
    if-eqz v0, :cond_1

    .line 486
    const-string v1, "file-url"

    invoke-virtual {v2, v1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move-object v0, v2

    .line 489
    goto/16 :goto_0

    .line 462
    :cond_2
    array-length v0, v4

    goto :goto_1

    .line 476
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;JZLcom/kik/l/ab;)Lkik/a/d/a/a;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 799
    new-instance v2, Lkik/a/d/a/a;

    const-string v0, "com.kik.ext.video-gallery"

    invoke-direct {v2, v0}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;)V

    .line 800
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 802
    invoke-static {p1, p2}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 803
    invoke-static {v0}, Lkik/android/util/r;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 805
    if-eqz v0, :cond_0

    .line 806
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x5a

    invoke-static {v0, v4, v5}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v4

    .line 807
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v0, "video message preview size:"

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v4, :cond_4

    move v0, v1

    :goto_0
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 808
    const-string v0, "preview"

    new-instance v5, Lkik/a/d/o;

    invoke-direct {v5, v4}, Lkik/a/d/o;-><init>([B)V

    invoke-virtual {v2, v0, v5}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 810
    :cond_0
    const-string v0, "icon"

    new-instance v4, Lkik/a/d/d;

    const v5, 0x7f020124

    invoke-static {v5}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 811
    const-string v0, "allow-forward"

    const-string v4, "true"

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 812
    const-string v0, "layout"

    sget-object v4, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v4}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 814
    const-string v0, "file-name"

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 815
    const-string v0, "file-size"

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 816
    invoke-virtual {v2, p3, p4}, Lkik/a/d/a/a;->a(J)Ljava/lang/String;

    .line 818
    invoke-virtual {v2, p5}, Lkik/a/d/a/a;->a(Z)V

    .line 820
    const/4 v0, 0x0

    .line 822
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 827
    :goto_1
    if-eqz v0, :cond_1

    .line 828
    const-string v4, "int-file-url-local"

    invoke-virtual {v2, v4, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 829
    const-string v0, "int-file-state"

    const-string v4, "0"

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    const-string v0, "int-chunk-progress"

    const-string v4, "0"

    invoke-virtual {v2, v0, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/f/a/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 833
    if-eqz v0, :cond_1

    .line 834
    const-string v4, "file-url"

    invoke-virtual {v2, v4, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    :cond_1
    if-nez p5, :cond_2

    .line 840
    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p6, v0, v1}, Lcom/kik/l/ab;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 841
    iget-object v0, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/kik/l/ab;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 842
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 845
    :cond_2
    if-eqz v1, :cond_3

    .line 846
    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p6, v0}, Lcom/kik/l/ab;->f(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 847
    if-eqz v0, :cond_3

    .line 848
    invoke-virtual {v2, v0}, Lkik/a/d/a/a;->a(Ljava/io/File;)V

    .line 851
    :cond_3
    return-object v2

    .line 807
    :cond_4
    array-length v0, v4

    goto/16 :goto_0

    .line 824
    :catch_0
    move-exception v4

    invoke-static {v4}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkik/a/e/v;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    const v6, 0x7f090134

    const/4 v5, 0x1

    .line 535
    new-instance v3, Lcom/kik/platform/g;

    invoke-direct {v3, p3}, Lcom/kik/platform/g;-><init>(Ljava/lang/String;)V

    .line 538
    const/4 v0, 0x0

    move-object v1, v2

    .line 540
    :goto_0
    sget-object v4, Lkik/android/util/e;->a:[I

    array-length v4, v4

    if-lt v0, v4, :cond_2

    .line 542
    new-instance v0, Ljava/lang/Throwable;

    const-string v4, "sendPicContentMessage: All gallery resolutions failed to send"

    invoke-direct {v0, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 552
    :cond_0
    if-eqz v1, :cond_3

    .line 554
    :try_start_0
    invoke-virtual {v3, p2}, Lcom/kik/platform/g;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 562
    :try_start_1
    invoke-virtual {v3, v1}, Lcom/kik/platform/g;->b(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 570
    if-eqz p4, :cond_1

    .line 571
    invoke-virtual {p0, p4}, Lkik/android/f/a/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 573
    :cond_1
    invoke-static {p1, v3, v2}, Lcom/kik/platform/a;->a(Landroid/app/Activity;Lcom/kik/platform/g;Ljava/lang/String;)V

    .line 579
    :goto_1
    return-void

    .line 546
    :cond_2
    invoke-virtual {v3}, Lcom/kik/platform/g;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lkik/android/util/e;->a:[I

    aget v4, v4, v0

    invoke-static {p2, v1, p5, v4, p6}, Lkik/android/util/e;->a(Ljava/io/File;Ljava/lang/String;ZILkik/a/e/v;)Ljava/io/File;

    move-result-object v1

    .line 547
    if-nez v1, :cond_0

    .line 548
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 557
    :catch_0
    move-exception v0

    invoke-static {p1, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 565
    :catch_1
    move-exception v0

    invoke-static {p1, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 576
    :cond_3
    invoke-static {p1, v6, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method

.method public final a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lkik/android/f/a/f;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/f;->l:Ljava/util/List;

    if-ne v0, p1, :cond_0

    .line 281
    invoke-virtual {p0}, Lkik/android/f/a/f;->b()V

    .line 283
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/a/a;J)V
    .locals 2

    .prologue
    .line 264
    iget-object v0, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lkik/android/f/a/f;->i:J

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    .line 265
    invoke-virtual {p0}, Lkik/android/f/a/f;->b()V

    .line 267
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/a/a;Z[B)V
    .locals 2

    .prologue
    .line 1602
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/f/a/f;->i:J

    .line 1603
    iput-object p1, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    .line 1604
    iput-object p3, p0, Lkik/android/f/a/f;->m:[B

    .line 1606
    iput-boolean p2, p0, Lkik/android/f/a/f;->j:Z

    .line 1607
    return-void
.end method

.method public final a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/f/k;Lkik/a/e/t;Lcom/kik/cache/ad;Lkik/a/e/q;Lkik/android/util/ar;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lkik/android/f/a/f;->q:Lkik/a/e/v;

    .line 212
    iput-object p2, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    .line 213
    iput-object p3, p0, Lkik/android/f/a/f;->s:Lkik/a/f/k;

    .line 214
    iput-object p4, p0, Lkik/android/f/a/f;->p:Lkik/a/e/t;

    .line 215
    iput-object p2, p0, Lkik/android/f/a/f;->r:Lcom/kik/l/ab;

    .line 216
    iput-object p5, p0, Lkik/android/f/a/f;->t:Lcom/kik/cache/ad;

    .line 217
    iput-object p6, p0, Lkik/android/f/a/f;->u:Lkik/a/e/q;

    .line 218
    iput-object p7, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    .line 219
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 300
    iput-boolean p1, p0, Lkik/android/f/a/f;->n:Z

    .line 301
    return-void
.end method

.method public final a(Ljava/lang/String;J)Z
    .locals 2

    .prologue
    .line 1656
    const-wide/32 v0, 0xf00000

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    .line 1657
    const/4 v0, 0x1

    .line 1661
    :goto_0
    return v0

    .line 1660
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    const-string v1, "kik.android.internal.platform.settings.upload"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1661
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 244
    if-nez p1, :cond_0

    .line 245
    const/4 v0, 0x0

    .line 248
    :goto_0
    return-object v0

    .line 247
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/f;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 253
    iput-object v1, p0, Lkik/android/f/a/f;->k:Ljava/lang/String;

    .line 254
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    .line 255
    iput-object v1, p0, Lkik/android/f/a/f;->l:Ljava/util/List;

    .line 256
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1646
    iput-object p1, p0, Lkik/android/f/a/f;->l:Ljava/util/List;

    .line 1647
    return-void
.end method

.method public final b(Lkik/a/d/a/a;)Z
    .locals 4

    .prologue
    .line 1666
    iget-object v0, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    const-string v1, "int-file-url-local"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1667
    iget-object v1, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    const-string v2, "file-size"

    invoke-virtual {v1, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1668
    iget-object v2, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    const-string v3, "int-file-state"

    invoke-virtual {v2, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1669
    if-eqz v1, :cond_1

    const-string v3, "1"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1672
    invoke-virtual {p1}, Lkik/a/d/a/a;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1673
    invoke-static {v0}, Lkik/android/util/ak;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 1679
    :goto_0
    iget-object v2, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0, v1}, Lkik/android/f/a/f;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 1681
    :goto_1
    return v0

    .line 1676
    :cond_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0

    .line 1681
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lkik/android/f/a/f;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/f;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    invoke-virtual {p0}, Lkik/android/f/a/f;->b()V

    .line 274
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 293
    iget-boolean v0, p0, Lkik/android/f/a/f;->n:Z

    return v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lkik/android/f/a/f;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 1611
    iget-boolean v0, p0, Lkik/android/f/a/f;->j:Z

    return v0
.end method

.method public final e()Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 1616
    iget-object v0, p0, Lkik/android/f/a/f;->h:Lkik/a/d/a/a;

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1641
    iput-object p1, p0, Lkik/android/f/a/f;->k:Ljava/lang/String;

    .line 1642
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1686
    iget-object v0, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    const-string v1, "kik.android.internal.platform.settings.upload"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1687
    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1688
    return-void
.end method

.method public final f()[B
    .locals 1

    .prologue
    .line 1621
    iget-object v0, p0, Lkik/android/f/a/f;->m:[B

    return-object v0
.end method

.method public final g()J
    .locals 2

    .prologue
    .line 1626
    iget-wide v0, p0, Lkik/android/f/a/f;->i:J

    return-wide v0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 1692
    iget-object v0, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    const-string v1, "kik.android.internal.platform.settings.launch"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1693
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1636
    iget-object v0, p0, Lkik/android/f/a/f;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 1704
    iget-object v0, p0, Lkik/android/f/a/f;->q:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 1705
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 1706
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 1707
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lkik/android/f/a/f;->s:Lkik/a/f/k;

    invoke-interface {v2}, Lkik/a/f/k;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?k="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lkik/android/f/a/f;->p:Lkik/a/e/t;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "b#YXa*ubr9da"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1710
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .prologue
    .line 1651
    iget-object v0, p0, Lkik/android/f/a/f;->l:Ljava/util/List;

    return-object v0
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 1769
    iget-object v0, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    const-string v1, "kik.android.internal.platform.settings.upload"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1770
    iget-object v0, p0, Lkik/android/f/a/f;->v:Lkik/android/util/ar;

    const-string v1, "kik.android.internal.platform.settings.launch"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1771
    return-void
.end method
