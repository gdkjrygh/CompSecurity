.class public final Lkik/android/util/ct;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/StringBuilder;

.field private static b:Ljava/util/Formatter;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sput-object v0, Lkik/android/util/ct;->a:Ljava/lang/StringBuilder;

    .line 53
    new-instance v0, Ljava/util/Formatter;

    sget-object v1, Lkik/android/util/ct;->a:Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    sput-object v0, Lkik/android/util/ct;->b:Ljava/util/Formatter;

    return-void
.end method

.method private static a(Lcom/googlecode/mp4parser/authoring/Track;DZ)D
    .locals 13

    .prologue
    .line 404
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v0

    array-length v0, v0

    new-array v6, v0, [D

    .line 405
    const-wide/16 v4, 0x0

    .line 406
    const-wide/16 v2, 0x0

    .line 407
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 408
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v1

    aget-wide v8, v1, v0

    .line 410
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v1

    const-wide/16 v10, 0x1

    add-long/2addr v10, v4

    invoke-static {v1, v10, v11}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v1

    if-ltz v1, :cond_0

    .line 412
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v1

    const-wide/16 v10, 0x1

    add-long/2addr v10, v4

    invoke-static {v1, v10, v11}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v1

    aput-wide v2, v6, v1

    .line 414
    :cond_0
    long-to-double v8, v8

    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v10

    long-to-double v10, v10

    div-double/2addr v8, v10

    add-double/2addr v2, v8

    .line 415
    const-wide/16 v8, 0x1

    add-long/2addr v4, v8

    .line 407
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 418
    :cond_1
    const-wide/16 v2, 0x0

    .line 419
    array-length v5, v6

    const/4 v0, 0x0

    move v4, v0

    :goto_1
    if-ge v4, v5, :cond_4

    aget-wide v0, v6, v4

    .line 420
    cmpl-double v7, v0, p1

    if-lez v7, :cond_3

    .line 421
    if-eqz p3, :cond_2

    .line 430
    :goto_2
    return-wide v0

    :cond_2
    move-wide v0, v2

    .line 425
    goto :goto_2

    .line 419
    :cond_3
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-wide v2, v0

    goto :goto_1

    .line 430
    :cond_4
    add-int/lit8 v0, v5, -0x1

    aget-wide v0, v6, v0

    goto :goto_2
.end method

.method public static a(Landroid/media/MediaMetadataRetriever;I)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .prologue
    .line 436
    invoke-virtual {p0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    .line 441
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 444
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;)J
    .locals 3

    .prologue
    const-wide/16 v0, -0x1

    .line 290
    if-nez p1, :cond_1

    .line 314
    :cond_0
    :goto_0
    return-wide v0

    .line 295
    :cond_1
    const/16 v2, 0xa

    invoke-static {v2}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 296
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 298
    :try_start_0
    invoke-virtual {v2, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 304
    const/16 v0, 0x9

    invoke-static {v2, v0}, Lkik/android/util/ct;->b(Landroid/media/MediaMetadataRetriever;I)J

    move-result-wide v0

    .line 305
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_0

    .line 308
    :cond_2
    invoke-static {p0, p1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/MediaPlayer;

    move-result-object v2

    .line 309
    if-eqz v2, :cond_0

    .line 310
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-long v0, v0

    .line 311
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->release()V

    goto :goto_0

    .line 302
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private static a(II)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 238
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 241
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/16 v1, 0x60

    .line 143
    if-nez p1, :cond_0

    .line 144
    const/4 v0, 0x0

    .line 202
    :goto_0
    return-object v0

    .line 147
    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 151
    :try_start_0
    invoke-static {p1}, Lkik/android/VideoContentProvider;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, p0, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    invoke-static {v3}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 164
    if-nez v0, :cond_1

    .line 165
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkik/android/util/ct;->a(Ljava/lang/String;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 168
    :cond_1
    if-nez v0, :cond_2

    .line 175
    const/16 v2, 0xe

    :try_start_1
    invoke-static {v2}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 176
    const/16 v2, 0x13

    invoke-static {v3, v2}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v2

    .line 177
    const/16 v4, 0x12

    invoke-static {v3, v4}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v4

    .line 179
    if-le v2, v4, :cond_3

    .line 180
    mul-int/lit8 v4, v4, 0x60

    div-int v2, v4, v2

    .line 189
    :goto_1
    invoke-static {v2, v1}, Lkik/android/util/ct;->a(II)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 196
    :cond_2
    :goto_2
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_0

    .line 153
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 157
    invoke-static {p1, v2}, Lkik/android/util/ct;->a(Ljava/lang/String;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 184
    :cond_3
    mul-int/lit8 v2, v2, 0x60

    :try_start_2
    div-int/2addr v2, v4
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move v5, v2

    move v2, v1

    move v1, v5

    .line 185
    goto :goto_1

    .line 191
    :catch_1
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 199
    :cond_4
    invoke-static {p1, v2}, Lkik/android/util/ct;->a(Ljava/lang/String;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_5
    move v2, v1

    goto :goto_1
.end method

.method private static a(Landroid/media/MediaMetadataRetriever;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .prologue
    .line 121
    const-wide/16 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 129
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Z)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 215
    const/4 v0, 0x0

    .line 217
    const/4 v1, 0x1

    :try_start_0
    invoke-static {p0, v1}, Landroid/media/ThumbnailUtils;->createVideoThumbnail(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 223
    :goto_0
    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 225
    const/16 v1, 0x60

    const/16 v2, 0x60

    :try_start_1
    invoke-static {v1, v2}, Lkik/android/util/ct;->a(II)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 232
    :cond_0
    :goto_1
    return-object v0

    .line 219
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 227
    :catch_1
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public static a(I)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 58
    div-int/lit16 v1, p0, 0x3e8

    .line 60
    rem-int/lit8 v0, v1, 0x3c

    .line 61
    div-int/lit8 v2, v1, 0x3c

    rem-int/lit8 v2, v2, 0x3c

    .line 62
    div-int/lit16 v1, v1, 0xe10

    .line 64
    if-nez v0, :cond_0

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 69
    :cond_0
    sget-object v3, Lkik/android/util/ct;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 70
    if-lez v1, :cond_1

    .line 71
    sget-object v3, Lkik/android/util/ct;->b:Ljava/util/Formatter;

    const-string v4, "%d:%02d:%02d"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v8

    invoke-virtual {v3, v4, v5}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0

    .line 74
    :goto_0
    return-object v0

    :cond_1
    sget-object v1, Lkik/android/util/ct;->b:Ljava/util/Formatter;

    const-string v3, "%d:%02d"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-virtual {v1, v3, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;FF)Ljava/lang/String;
    .locals 25

    .prologue
    .line 325
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/googlecode/mp4parser/authoring/container/mp4/MovieCreator;->build(Ljava/lang/String;)Lcom/googlecode/mp4parser/authoring/Movie;

    move-result-object v18

    .line 327
    invoke-virtual/range {v18 .. v18}, Lcom/googlecode/mp4parser/authoring/Movie;->getTracks()Ljava/util/List;

    move-result-object v7

    .line 328
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/authoring/Movie;->setTracks(Ljava/util/List;)V

    .line 331
    move/from16 v0, p2

    float-to-double v10, v0

    .line 332
    move/from16 v0, p3

    float-to-double v2, v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double v8, v2, v4

    .line 334
    const/4 v3, 0x0

    .line 339
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/Track;

    .line 340
    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v4

    array-length v4, v4

    if-lez v4, :cond_8

    .line 341
    if-eqz v3, :cond_0

    .line 346
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "The startTime has already been corrected by another track with SyncSample. Not Supported."

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 394
    :catch_0
    move-exception v2

    :goto_1
    invoke-static {v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 397
    const/16 p1, 0x0

    :goto_2
    return-object p1

    .line 348
    :cond_0
    const/4 v3, 0x0

    :try_start_1
    invoke-static {v2, v10, v11, v3}, Lkik/android/util/ct;->a(Lcom/googlecode/mp4parser/authoring/Track;DZ)D

    move-result-wide v4

    .line 349
    const/4 v3, 0x1

    invoke-static {v2, v8, v9, v3}, Lkik/android/util/ct;->a(Lcom/googlecode/mp4parser/authoring/Track;DZ)D

    move-result-wide v2

    .line 350
    const/4 v6, 0x1

    :goto_3
    move-wide v8, v2

    move-wide v10, v4

    move v3, v6

    .line 352
    goto :goto_0

    .line 354
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/googlecode/mp4parser/authoring/Track;

    .line 355
    const-wide/16 v14, 0x0

    .line 356
    const-wide/16 v16, 0x0

    .line 357
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 358
    const-wide/16 v4, -0x1

    .line 359
    const-wide/16 v6, -0x1

    .line 361
    const/4 v2, 0x0

    move-wide/from16 v23, v12

    move-wide v12, v14

    move-wide/from16 v14, v23

    :goto_5
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v20

    move-object/from16 v0, v20

    array-length v0, v0

    move/from16 v20, v0

    move/from16 v0, v20

    if-ge v2, v0, :cond_4

    .line 362
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v20

    aget-wide v20, v20, v2

    .line 364
    cmpl-double v22, v16, v14

    if-lez v22, :cond_2

    cmpg-double v22, v16, v10

    if-gtz v22, :cond_2

    move-wide v4, v12

    .line 368
    :cond_2
    cmpl-double v14, v16, v14

    if-lez v14, :cond_3

    cmpg-double v14, v16, v8

    if-gtz v14, :cond_3

    move-wide v6, v12

    .line 373
    :cond_3
    move-wide/from16 v0, v20

    long-to-double v14, v0

    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v20

    move-wide/from16 v0, v20

    long-to-double v0, v0

    move-wide/from16 v20, v0

    div-double v14, v14, v20

    add-double v14, v14, v16

    .line 374
    const-wide/16 v20, 0x1

    add-long v12, v12, v20

    .line 361
    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v23, v16

    move-wide/from16 v16, v14

    move-wide/from16 v14, v23

    goto :goto_5

    .line 376
    :cond_4
    new-instance v12, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;

    const/4 v2, 0x1

    new-array v13, v2, [Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v14, 0x0

    new-instance v2, Lcom/googlecode/mp4parser/authoring/tracks/CroppedTrack;

    invoke-direct/range {v2 .. v7}, Lcom/googlecode/mp4parser/authoring/tracks/CroppedTrack;-><init>(Lcom/googlecode/mp4parser/authoring/Track;JJ)V

    aput-object v2, v13, v14

    invoke-direct {v12, v13}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;-><init>([Lcom/googlecode/mp4parser/authoring/Track;)V

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Lcom/googlecode/mp4parser/authoring/Movie;->addTrack(Lcom/googlecode/mp4parser/authoring/Track;)V

    goto :goto_4

    .line 394
    :catch_1
    move-exception v2

    goto/16 :goto_1

    .line 378
    :cond_5
    new-instance v2, Lcom/googlecode/mp4parser/authoring/builder/DefaultMp4Builder;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/authoring/builder/DefaultMp4Builder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/authoring/builder/DefaultMp4Builder;->build(Lcom/googlecode/mp4parser/authoring/Movie;)Lcom/coremedia/iso/boxes/Container;

    move-result-object v3

    .line 380
    const-string v2, "/moov/"

    invoke-static {v3, v2}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/coremedia/iso/boxes/Container;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v2, "/moov/"

    invoke-static {v3, v2}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/coremedia/iso/boxes/Container;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v2, "/moov/"

    invoke-static {v3, v2}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/coremedia/iso/boxes/Container;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/MovieBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/MovieBox;->getMovieHeaderBox()Lcom/coremedia/iso/boxes/MovieHeaderBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getDuration()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_7

    .line 381
    :cond_6
    const/16 p1, 0x0

    goto/16 :goto_2

    .line 385
    :cond_7
    new-instance v2, Ljava/io/FileOutputStream;

    move-object/from16 v0, p1

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v4

    .line 387
    invoke-interface {v3, v4}, Lcom/coremedia/iso/boxes/Container;->writeContainer(Ljava/nio/channels/WritableByteChannel;)V

    .line 389
    invoke-virtual {v4}, Ljava/nio/channels/FileChannel;->close()V

    .line 390
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :cond_8
    move-wide v4, v10

    move v6, v3

    move-wide v2, v8

    goto/16 :goto_3
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lkik/a/e/i;Lkik/a/e/v;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 473
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move v0, v2

    .line 499
    :goto_0
    return v0

    .line 476
    :cond_1
    invoke-interface {p2, p1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    .line 477
    if-eqz v0, :cond_2

    invoke-interface {p2, v0}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    if-eq v0, v1, :cond_3

    :cond_2
    move v0, v2

    .line 478
    goto :goto_0

    .line 481
    :cond_3
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 482
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 484
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    move v0, v2

    .line 485
    goto :goto_0

    .line 488
    :cond_5
    const v3, 0x7f090368

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    .line 489
    const-string v4, "kik.chat.video.prefetch"

    invoke-interface {p3, v4, v3}, Lkik/a/e/v;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 490
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 491
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-ne v0, v1, :cond_7

    move v0, v1

    .line 492
    goto :goto_0

    .line 495
    :cond_6
    const v0, 0x7f090367

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    .line 496
    goto :goto_0

    :cond_7
    move v0, v2

    .line 499
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 80
    if-nez p0, :cond_1

    .line 87
    :cond_0
    :goto_0
    return v0

    .line 83
    :cond_1
    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 84
    if-ltz v1, :cond_0

    .line 87
    sget-object v0, Lkik/android/widget/GalleryWidget;->a:Ljava/util/HashSet;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;J)Z
    .locals 5

    .prologue
    .line 505
    const/16 v0, 0x12

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 506
    invoke-static {p0}, Lkik/android/util/ak;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 513
    :goto_0
    const-wide/32 v2, 0xf00000

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const-wide/32 v0, 0x1d4c0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 509
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 510
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_0

    .line 513
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static b(Landroid/media/MediaMetadataRetriever;I)J
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .prologue
    .line 451
    invoke-virtual {p0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    .line 456
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 459
    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 98
    if-nez p0, :cond_0

    .line 110
    :goto_0
    return-object v0

    .line 101
    :cond_0
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 103
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    invoke-static {v1}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 107
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 252
    if-nez p0, :cond_0

    .line 279
    :goto_0
    return v0

    .line 257
    :cond_0
    const/16 v1, 0xa

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 258
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 260
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    const/16 v0, 0x9

    invoke-static {v1, v0}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v0

    .line 267
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_0

    .line 271
    :cond_1
    :try_start_1
    new-instance v1, Landroid/media/MediaPlayer;

    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    .line 272
    invoke-virtual {v1, p0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    goto :goto_0

    .line 264
    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0
.end method
