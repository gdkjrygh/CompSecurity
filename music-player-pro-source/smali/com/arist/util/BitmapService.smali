.class public Lcom/arist/util/BitmapService;
.super Ljava/lang/Object;
.source "BitmapService.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static copyBitmap(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "source"    # Ljava/lang/String;
    .param p1, "des"    # Ljava/lang/String;

    .prologue
    .line 126
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    invoke-static {p0}, Lcom/arist/util/BitmapService;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 130
    .local v0, "bmpSrc":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_0

    .line 133
    invoke-static {v0, p1}, Lcom/arist/util/BitmapService;->save(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static copyCachBmp(Ljava/lang/String;)V
    .locals 4
    .param p0, "musicPath"    # Ljava/lang/String;

    .prologue
    .line 137
    .line 138
    const-string v1, ".mp3"

    const-string v2, ".jpg"

    .line 137
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 139
    .local v0, "downLoadMusicAblumStr":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/arist/util/Constant;->BASE_ABLUM_CACHES_PATH:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    sget-object v3, Lcom/arist/util/Constant;->BASE_ABLUM_PATH:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 139
    invoke-static {v1, v2}, Lcom/arist/util/BitmapService;->copyBitmap(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public static getBitmap(Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;
    .locals 6
    .param p0, "res"    # Landroid/content/res/Resources;
    .param p1, "resId"    # I
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 59
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 60
    .local v1, "opts":Landroid/graphics/BitmapFactory$Options;
    const/4 v5, 0x1

    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 61
    invoke-static {p0, p1, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 62
    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int v3, v5, p2

    .line 63
    .local v3, "x":I
    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int v4, v5, p3

    .line 64
    .local v4, "y":I
    if-le v3, v4, :cond_0

    move v2, v3

    .line 65
    .local v2, "scale":I
    :goto_0
    const/4 v5, 0x0

    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 66
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 67
    invoke-static {p0, p1, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 73
    .end local v1    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v2    # "scale":I
    .end local v3    # "x":I
    .end local v4    # "y":I
    :goto_1
    return-object v0

    .restart local v1    # "opts":Landroid/graphics/BitmapFactory$Options;
    .restart local v3    # "x":I
    .restart local v4    # "y":I
    :cond_0
    move v2, v4

    .line 64
    goto :goto_0

    .line 71
    .end local v1    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v3    # "x":I
    .end local v4    # "y":I
    :catch_0
    move-exception v5

    .line 73
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 17
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 2
    .param p0, "path"    # Ljava/lang/String;
    .param p1, "scale"    # I

    .prologue
    .line 21
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 22
    .local v0, "opts":Landroid/graphics/BitmapFactory$Options;
    iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 23
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method public static getBitmap(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 5
    .param p0, "path"    # Ljava/lang/String;
    .param p1, "width"    # I
    .param p2, "height"    # I

    .prologue
    .line 28
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 29
    .local v0, "opts":Landroid/graphics/BitmapFactory$Options;
    const/4 v4, 0x1

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 30
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 31
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int v2, v4, p1

    .line 32
    .local v2, "x":I
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int v3, v4, p2

    .line 33
    .local v3, "y":I
    if-le v2, v3, :cond_0

    move v1, v2

    .line 34
    .local v1, "scale":I
    :goto_0
    invoke-static {p0, v1}, Lcom/arist/util/BitmapService;->getBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 37
    .end local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v1    # "scale":I
    .end local v2    # "x":I
    .end local v3    # "y":I
    :goto_1
    return-object v4

    .restart local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "x":I
    .restart local v3    # "y":I
    :cond_0
    move v1, v3

    .line 33
    goto :goto_0

    .line 35
    .end local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v2    # "x":I
    .end local v3    # "y":I
    :catch_0
    move-exception v4

    .line 37
    const/4 v4, 0x0

    goto :goto_1
.end method

.method public static getBitmap([B)Landroid/graphics/Bitmap;
    .locals 2
    .param p0, "data"    # [B

    .prologue
    .line 77
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getBitmap([BI)Landroid/graphics/Bitmap;
    .locals 3
    .param p0, "data"    # [B
    .param p1, "scale"    # I

    .prologue
    .line 82
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 83
    .local v0, "opts":Landroid/graphics/BitmapFactory$Options;
    iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 84
    const/4 v1, 0x0

    array-length v2, p0

    invoke-static {p0, v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 87
    .end local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    :goto_0
    return-object v1

    .line 85
    :catch_0
    move-exception v1

    .line 87
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getBitmap([BII)Landroid/graphics/Bitmap;
    .locals 6
    .param p0, "data"    # [B
    .param p1, "width"    # I
    .param p2, "height"    # I

    .prologue
    .line 92
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 93
    .local v0, "opts":Landroid/graphics/BitmapFactory$Options;
    const/4 v4, 0x1

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 94
    const/4 v4, 0x0

    array-length v5, p0

    invoke-static {p0, v4, v5, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 95
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int v2, v4, p1

    .line 96
    .local v2, "x":I
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int v3, v4, p2

    .line 97
    .local v3, "y":I
    if-le v2, v3, :cond_0

    move v1, v2

    .line 98
    .local v1, "scale":I
    :goto_0
    invoke-static {p0, v1}, Lcom/arist/util/BitmapService;->getBitmap([BI)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 101
    .end local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v1    # "scale":I
    .end local v2    # "x":I
    .end local v3    # "y":I
    :goto_1
    return-object v4

    .restart local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .restart local v2    # "x":I
    .restart local v3    # "y":I
    :cond_0
    move v1, v3

    .line 97
    goto :goto_0

    .line 99
    .end local v0    # "opts":Landroid/graphics/BitmapFactory$Options;
    .end local v2    # "x":I
    .end local v3    # "y":I
    :catch_0
    move-exception v4

    .line 101
    const/4 v4, 0x0

    goto :goto_1
.end method

.method public static readBitMap(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    .locals 4
    .param p0, "res"    # Landroid/content/res/Resources;
    .param p1, "resId"    # I

    .prologue
    const/4 v3, 0x1

    .line 47
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 48
    .local v1, "opt":Landroid/graphics/BitmapFactory$Options;
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 49
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 50
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 52
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    .line 53
    .local v0, "is":Ljava/io/InputStream;
    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    return-object v2
.end method

.method public static save(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 5
    .param p0, "bm"    # Landroid/graphics/Bitmap;
    .param p1, "savePath"    # Ljava/lang/String;

    .prologue
    .line 106
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 123
    .end local v1    # "file":Ljava/io/File;
    :goto_0
    return-void

    .line 109
    .restart local v1    # "file":Ljava/io/File;
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 110
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 112
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 113
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 115
    :cond_2
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 116
    .local v2, "out":Ljava/io/FileOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {p0, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 117
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 118
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "out":Ljava/io/FileOutputStream;
    :catch_0
    move-exception v0

    .line 119
    .local v0, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 120
    .end local v0    # "e":Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 121
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
