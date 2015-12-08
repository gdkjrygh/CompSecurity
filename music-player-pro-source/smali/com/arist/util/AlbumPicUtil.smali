.class public Lcom/arist/util/AlbumPicUtil;
.super Ljava/lang/Object;
.source "AlbumPicUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createReflectedImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 26
    .param p0, "originalImage"    # Landroid/graphics/Bitmap;

    .prologue
    .line 81
    const/16 v24, 0x4

    .line 82
    .local v24, "reflectionGap":I
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 83
    .local v4, "width":I
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v22

    .line 84
    .local v22, "height":I
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 85
    .local v6, "matrix":Landroid/graphics/Matrix;
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v6, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 86
    const/4 v2, 0x0

    .line 87
    div-int/lit8 v3, v22, 0x2

    div-int/lit8 v5, v22, 0x2

    const/4 v7, 0x0

    move-object/from16 v1, p0

    .line 86
    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v25

    .line 89
    .local v25, "reflectionImage":Landroid/graphics/Bitmap;
    div-int/lit8 v1, v22, 0x2

    add-int v1, v1, v22

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 88
    invoke-static {v4, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 90
    .local v21, "bitmapWithReflection":Landroid/graphics/Bitmap;
    new-instance v7, Landroid/graphics/Canvas;

    move-object/from16 v0, v21

    invoke-direct {v7, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 91
    .local v7, "canvas":Landroid/graphics/Canvas;
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 92
    new-instance v12, Landroid/graphics/Paint;

    invoke-direct {v12}, Landroid/graphics/Paint;-><init>()V

    .line 93
    .local v12, "defaultPaint":Landroid/graphics/Paint;
    const/4 v8, 0x0

    move/from16 v0, v22

    int-to-float v9, v0

    int-to-float v10, v4

    add-int/lit8 v1, v22, 0x4

    int-to-float v11, v1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 94
    const/4 v1, 0x0

    add-int/lit8 v2, v22, 0x4

    int-to-float v2, v2

    const/4 v3, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 95
    new-instance v23, Landroid/graphics/Paint;

    invoke-direct/range {v23 .. v23}, Landroid/graphics/Paint;-><init>()V

    .line 96
    .local v23, "paint":Landroid/graphics/Paint;
    new-instance v13, Landroid/graphics/LinearGradient;

    const/4 v14, 0x0

    .line 97
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v15, v1

    const/16 v16, 0x0

    invoke-virtual/range {v21 .. v21}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 98
    add-int/lit8 v1, v1, 0x4

    int-to-float v0, v1

    move/from16 v17, v0

    const v18, 0x70ffffff

    const v19, 0xffffff

    .line 99
    sget-object v20, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 96
    invoke-direct/range {v13 .. v20}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 100
    .local v13, "shader":Landroid/graphics/LinearGradient;
    move-object/from16 v0, v23

    invoke-virtual {v0, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 101
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 102
    const/4 v15, 0x0

    move/from16 v0, v22

    int-to-float v0, v0

    move/from16 v16, v0

    int-to-float v0, v4

    move/from16 v17, v0

    invoke-virtual/range {v21 .. v21}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 103
    add-int/lit8 v1, v1, 0x4

    int-to-float v0, v1

    move/from16 v18, v0

    move-object v14, v7

    move-object/from16 v19, v23

    .line 102
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 104
    return-object v21
.end method

.method public static getAlbumArtString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "albumId"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x0

    .line 31
    :try_start_0
    const-string v8, "content://media/external/audio/albums"

    .line 32
    .local v8, "mUriAlbums":Ljava/lang/String;
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "album_art"

    aput-object v1, v2, v0

    .line 33
    .local v2, "projection":[Ljava/lang/String;
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 33
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 36
    .local v7, "cur":Landroid/database/Cursor;
    const/4 v6, 0x0

    .line 37
    .local v6, "album_art":Ljava/lang/String;
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 38
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 39
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 41
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    const/4 v7, 0x0

    .line 47
    .end local v2    # "projection":[Ljava/lang/String;
    .end local v6    # "album_art":Ljava/lang/String;
    .end local v7    # "cur":Landroid/database/Cursor;
    .end local v8    # "mUriAlbums":Ljava/lang/String;
    :goto_0
    return-object v6

    .line 45
    :catch_0
    move-exception v0

    move-object v6, v9

    .line 47
    goto :goto_0
.end method

.method public static getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;
    .locals 7
    .param p0, "music"    # Lcom/arist/entity/Music;

    .prologue
    const/16 v6, 0x5a

    .line 57
    if-nez p0, :cond_0

    .line 58
    const/4 v0, 0x0

    .line 71
    :goto_0
    return-object v0

    .line 60
    :cond_0
    sget-object v3, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    invoke-virtual {p0}, Lcom/arist/entity/Music;->getAlbumId()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 60
    invoke-static {v3, v4}, Lcom/arist/util/AlbumPicUtil;->getAlbumArtString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 62
    .local v2, "str":Ljava/lang/String;
    const/4 v0, 0x0

    .line 63
    .local v0, "bmp":Landroid/graphics/Bitmap;
    if-eqz v2, :cond_1

    .line 64
    invoke-static {v2, v6, v6}, Lcom/arist/util/BitmapService;->getBitmap(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 65
    goto :goto_0

    .line 67
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v4, Lcom/arist/util/Constant;->BASE_ABLUM_PATH:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 68
    invoke-virtual {p0}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 69
    .local v1, "savePath":Ljava/lang/String;
    invoke-static {v1}, Lcom/arist/util/BitmapService;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method
