.class public final Lcom/roidapp/baselib/c/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/FileInputStream;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v1, 0x0

    .line 74
    new-array v2, v7, [B

    .line 76
    const/4 v0, 0x0

    const/4 v3, 0x4

    :try_start_0
    invoke-virtual {p0, v2, v0, v3}, Ljava/io/FileInputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1052
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move v0, v1

    .line 1056
    :goto_1
    if-ge v0, v7, :cond_1

    .line 1057
    aget-byte v4, v2, v0

    and-int/lit16 v4, v4, 0xff

    .line 1058
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    .line 1059
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x2

    if-ge v5, v6, :cond_0

    .line 1060
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1062
    :cond_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 78
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 1064
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    .line 81
    const-string v1, "FFD8FF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 82
    const-string v0, "jpg"

    .line 92
    :cond_2
    :goto_2
    return-object v0

    .line 83
    :cond_3
    const-string v1, "89504E47"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 84
    const-string v0, "png"

    goto :goto_2

    .line 85
    :cond_4
    const-string v1, "47494638"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 86
    const-string v0, "gif"

    goto :goto_2

    .line 87
    :cond_5
    const-string v1, "49492A00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 88
    const-string v0, "tif"

    goto :goto_2

    .line 89
    :cond_6
    const-string v1, "424D"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 90
    const-string v0, "bmp"

    goto :goto_2
.end method
