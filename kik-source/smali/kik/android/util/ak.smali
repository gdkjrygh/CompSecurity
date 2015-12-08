.class public final Lkik/android/util/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# direct methods
.method public static a(Landroid/media/MediaExtractor;Z)I
    .locals 4

    .prologue
    .line 140
    if-eqz p1, :cond_0

    const-string v0, "video/"

    .line 141
    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 142
    invoke-virtual {p0, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v2

    .line 143
    const-string v3, "mime"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 149
    :goto_2
    return v1

    .line 140
    :cond_0
    const-string v0, "audio/"

    goto :goto_0

    .line 141
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 149
    :cond_2
    const/4 v1, -0x1

    goto :goto_2
.end method

.method public static a(Ljava/lang/String;)J
    .locals 8

    .prologue
    .line 165
    invoke-static {p0}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    .line 166
    invoke-static {p0}, Lkik/android/util/ak;->b(Ljava/lang/String;)I

    move-result v2

    .line 167
    invoke-static {p0}, Lkik/android/util/ak;->d(Ljava/lang/String;)I

    move-result v3

    .line 168
    long-to-double v0, v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v4

    int-to-double v4, v2

    const-wide/high16 v6, 0x4020000000000000L    # 8.0

    div-double/2addr v4, v6

    mul-double/2addr v0, v4

    int-to-double v2, v3

    add-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method public static a(Landroid/media/MediaExtractor;Landroid/media/MediaMuxer;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 31
    if-eqz p1, :cond_0

    if-gez p2, :cond_1

    .line 48
    :cond_0
    return-void

    .line 35
    :cond_1
    const/high16 v0, 0x40000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 36
    new-instance v1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 37
    invoke-virtual {p0, p2}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 39
    :goto_0
    invoke-virtual {p0, v0, v6}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v2

    if-ltz v2, :cond_0

    .line 40
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v4

    iput-wide v4, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 41
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v3

    iput v3, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 42
    iput v6, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 43
    iput v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 44
    invoke-virtual {p1, p2, v0, v1}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 46
    invoke-virtual {p0}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 6

    .prologue
    const v0, 0xea600

    .line 192
    invoke-static {p0}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v1

    int-to-double v2, v1

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    .line 193
    invoke-static {p0}, Lkik/android/util/ak;->d(Ljava/lang/String;)I

    move-result v1

    .line 195
    const v4, 0xe49249

    sub-int v1, v4, v1

    .line 198
    int-to-double v4, v1

    div-double v2, v4, v2

    double-to-int v1, v2

    mul-int/lit8 v1, v1, 0x8

    .line 199
    if-le v1, v0, :cond_0

    .line 203
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 213
    new-instance v2, Landroid/media/MediaExtractor;

    invoke-direct {v2}, Landroid/media/MediaExtractor;-><init>()V

    .line 215
    :try_start_0
    invoke-virtual {v2, p0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 221
    invoke-static {v2, v0}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Z)I

    move-result v3

    .line 222
    if-gez v3, :cond_1

    .line 233
    :cond_0
    :goto_0
    return v0

    .line 226
    :cond_1
    invoke-static {v2, v1}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Z)I

    move-result v3

    .line 227
    if-lez v3, :cond_2

    .line 228
    if-gez v3, :cond_3

    move v2, v1

    :goto_1
    if-eqz v2, :cond_0

    :cond_2
    move v0, v1

    .line 233
    goto :goto_0

    .line 228
    :cond_3
    invoke-virtual {v2, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v2

    const-string v3, "mime"

    invoke-virtual {v2, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "audio/mp4a-latm"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    .line 218
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static d(Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 57
    new-instance v2, Landroid/media/MediaExtractor;

    invoke-direct {v2}, Landroid/media/MediaExtractor;-><init>()V

    .line 59
    :try_start_0
    invoke-virtual {v2, p0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    invoke-static {v2, v1}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Z)I

    move-result v0

    .line 66
    if-gez v0, :cond_0

    .line 78
    :goto_0
    return v1

    .line 62
    :catch_0
    move-exception v0

    const/4 v1, -0x1

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v2, v0}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 70
    const/high16 v0, 0x40000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    move v0, v1

    .line 73
    :goto_1
    invoke-virtual {v2, v3, v1}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v4

    if-ltz v4, :cond_1

    .line 74
    add-int/2addr v0, v4

    .line 75
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_1

    :cond_1
    move v1, v0

    .line 78
    goto :goto_0
.end method
