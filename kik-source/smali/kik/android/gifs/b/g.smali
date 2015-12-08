.class public final Lkik/android/gifs/b/g;
.super Lkik/android/gifs/b/c;
.source "SourceFile"


# instance fields
.field private final c:Lcom/kik/l/ab;


# direct methods
.method protected constructor <init>(Ljava/lang/String;ILcom/kik/l/ab;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Lkik/android/gifs/b/c;-><init>(Ljava/lang/String;I)V

    .line 22
    iput-object p3, p0, Lkik/android/gifs/b/g;->c:Lcom/kik/l/ab;

    .line 23
    return-void
.end method

.method private static a(Lcom/ndmob/relay/RelayNative;I)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 82
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 84
    new-instance v0, Lkik/android/gifs/b/b;

    invoke-direct {v0}, Lkik/android/gifs/b/b;-><init>()V

    .line 85
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, v0, Lkik/android/gifs/b/b;->a:Ljava/util/List;

    .line 89
    const-string v0, "frame_width"

    invoke-virtual {p0, v0}, Lcom/ndmob/relay/RelayNative;->extractMetadata(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 90
    const-string v1, "frame_height"

    invoke-virtual {p0, v1}, Lcom/ndmob/relay/RelayNative;->extractMetadata(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 92
    mul-int/2addr v1, p1

    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Lcom/ndmob/relay/RelayNative;->renderBitmapStrip(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    :goto_0
    return-object v0

    .line 96
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .prologue
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/android/gifs/b/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lkik/android/gifs/b/g;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final d()Lkik/android/gifs/b/b;
    .locals 12

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 28
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 30
    new-instance v5, Lcom/ndmob/relay/RelayNative;

    invoke-direct {v5}, Lcom/ndmob/relay/RelayNative;-><init>()V

    .line 32
    :try_start_0
    iget-object v1, p0, Lkik/android/gifs/b/g;->a:Ljava/lang/String;

    invoke-virtual {v5, v1}, Lcom/ndmob/relay/RelayNative;->setDataSource(Ljava/lang/String;)V

    .line 34
    const-string v1, "duration"

    invoke-virtual {v5, v1}, Lcom/ndmob/relay/RelayNative;->extractMetadata(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 35
    const-string v4, "frame_count"

    invoke-virtual {v5, v4}, Lcom/ndmob/relay/RelayNative;->extractMetadata(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 36
    div-int v7, v1, v6

    .line 38
    iget-object v1, p0, Lkik/android/gifs/b/g;->c:Lcom/kik/l/ab;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/gifs/b/g;->c:Lcom/kik/l/ab;

    invoke-direct {p0}, Lkik/android/gifs/b/g;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/kik/l/ab;->g(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_0
    invoke-static {v5, v6}, Lkik/android/gifs/b/g;->a(Lcom/ndmob/relay/RelayNative;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget v8, p0, Lkik/android/gifs/b/g;->b:I

    if-le v4, v8, :cond_5

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    div-int v9, v3, v6

    if-le v8, v9, :cond_6

    iget v4, p0, Lkik/android/gifs/b/g;->b:I

    iget v3, p0, Lkik/android/gifs/b/g;->b:I

    mul-int/2addr v3, v9

    div-int/2addr v3, v8

    :goto_1
    mul-int/2addr v3, v6

    const/4 v8, 0x1

    invoke-static {v1, v4, v3, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_2
    iget-object v3, p0, Lkik/android/gifs/b/g;->c:Lcom/kik/l/ab;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lkik/android/gifs/b/g;->c:Lcom/kik/l/ab;

    invoke-direct {p0}, Lkik/android/gifs/b/g;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Lcom/kik/l/ab;->b(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    :cond_3
    move-object v3, v1

    .line 39
    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lkik/android/gifs/b/g;->c()Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_7

    .line 40
    :cond_4
    invoke-virtual {v5}, Lcom/ndmob/relay/RelayNative;->release()V

    .line 51
    :goto_2
    return-object v0

    .line 38
    :cond_5
    :try_start_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    div-int/2addr v4, v6

    iget v8, p0, Lkik/android/gifs/b/g;->b:I

    if-gt v4, v8, :cond_1

    move v3, v2

    goto :goto_0

    :cond_6
    iget v3, p0, Lkik/android/gifs/b/g;->b:I

    iget v4, p0, Lkik/android/gifs/b/g;->b:I

    mul-int/2addr v4, v8

    div-int/2addr v4, v9

    goto :goto_1

    .line 43
    :cond_7
    new-instance v1, Lkik/android/gifs/b/b;

    invoke-direct {v1}, Lkik/android/gifs/b/b;-><init>()V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    div-int/2addr v8, v6

    :goto_3
    if-ge v2, v6, :cond_9

    new-instance v9, Lkik/android/gifs/b/a;

    invoke-direct {v9}, Lkik/android/gifs/b/a;-><init>()V

    const/4 v10, 0x0

    mul-int v11, v2, v8

    invoke-static {v3, v10, v11, v4, v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v10

    iput-object v10, v9, Lkik/android/gifs/b/a;->a:Landroid/graphics/Bitmap;

    iput v7, v9, Lkik/android/gifs/b/a;->b:I

    iget-object v10, v1, Lkik/android/gifs/b/b;->a:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lkik/android/gifs/b/g;->c()Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v9

    if-eqz v9, :cond_8

    .line 51
    :goto_4
    invoke-virtual {v5}, Lcom/ndmob/relay/RelayNative;->release()V

    goto :goto_2

    .line 43
    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    move-object v0, v1

    goto :goto_4

    .line 48
    :catch_0
    move-exception v1

    :goto_5
    invoke-virtual {v5}, Lcom/ndmob/relay/RelayNative;->release()V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Lcom/ndmob/relay/RelayNative;->release()V

    throw v0

    :catch_1
    move-exception v1

    goto :goto_5
.end method
