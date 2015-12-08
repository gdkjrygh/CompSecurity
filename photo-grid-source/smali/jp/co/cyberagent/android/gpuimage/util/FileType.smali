.class public Ljp/co/cyberagent/android/gpuimage/util/FileType;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytesToHexString([B)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    if-eqz p0, :cond_0

    array-length v0, p0

    if-gtz v0, :cond_1

    .line 54
    :cond_0
    const/4 v0, 0x0

    .line 64
    :goto_0
    return-object v0

    :cond_1
    move v0, v1

    .line 56
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_3

    .line 57
    aget-byte v3, p0, v0

    and-int/lit16 v3, v3, 0xff

    .line 58
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-ge v4, v5, :cond_2

    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getTypeByStream(Ljava/io/FileInputStream;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x4

    .line 74
    new-array v0, v0, [B

    .line 76
    const/4 v1, 0x0

    const/4 v2, 0x4

    :try_start_0
    invoke-virtual {p0, v0, v1, v2}, Ljava/io/FileInputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :goto_0
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/util/FileType;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    .line 81
    const-string v1, "FFD8FF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 82
    const-string v0, "jpg"

    .line 92
    :cond_0
    :goto_1
    return-object v0

    .line 78
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 83
    :cond_1
    const-string v1, "89504E47"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 84
    const-string v0, "png"

    goto :goto_1

    .line 85
    :cond_2
    const-string v1, "47494638"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 86
    const-string v0, "gif"

    goto :goto_1

    .line 87
    :cond_3
    const-string v1, "49492A00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 88
    const-string v0, "tif"

    goto :goto_1

    .line 89
    :cond_4
    const-string v1, "424D"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    const-string v0, "bmp"

    goto :goto_1
.end method
