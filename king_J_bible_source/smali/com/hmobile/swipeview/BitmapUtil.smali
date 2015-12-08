.class public final Lcom/hmobile/swipeview/BitmapUtil;
.super Ljava/lang/Object;
.source "BitmapUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createScaledImage(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 16
    .param p0, "sourceFile"    # Ljava/lang/String;
    .param p1, "destinationFile"    # Ljava/lang/String;
    .param p2, "desiredWidth"    # I
    .param p3, "desiredHeight"    # I

    .prologue
    .line 140
    new-instance v11, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v11}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 141
    .local v11, "options":Landroid/graphics/BitmapFactory$Options;
    const/4 v2, 0x1

    iput-boolean v2, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 142
    move-object/from16 v0, p0

    invoke-static {v0, v11}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 144
    iget v15, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 145
    .local v15, "srcWidth":I
    iget v14, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 147
    .local v14, "srcHeight":I
    move/from16 v0, p2

    if-le v0, v15, :cond_0

    .line 149
    move/from16 p2, v15

    .line 152
    :cond_0
    const/4 v10, 0x1

    .line 153
    .local v10, "inSampleSize":I
    :goto_0
    div-int/lit8 v2, v15, 0x2

    move/from16 v0, p2

    if-gt v2, v0, :cond_1

    .line 160
    move/from16 v0, p2

    int-to-float v2, v0

    int-to-float v3, v15

    div-float v8, v2, v3

    .line 162
    .local v8, "desiredScale":F
    const/4 v2, 0x0

    iput-boolean v2, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 163
    const/4 v2, 0x0

    iput-boolean v2, v11, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 164
    iput v10, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 165
    const/4 v2, 0x0

    iput-boolean v2, v11, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 166
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v2, v11, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 167
    move-object/from16 v0, p0

    invoke-static {v0, v11}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 169
    .local v1, "sampledSrcBitmap":Landroid/graphics/Bitmap;
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 170
    .local v6, "matrix":Landroid/graphics/Matrix;
    invoke-virtual {v6, v8, v8}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 171
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 172
    .local v13, "scaledBitmap":Landroid/graphics/Bitmap;
    const/4 v1, 0x0

    .line 176
    :try_start_0
    new-instance v12, Ljava/io/FileOutputStream;

    move-object/from16 v0, p1

    invoke-direct {v12, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 177
    .local v12, "out":Ljava/io/FileOutputStream;
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x55

    invoke-virtual {v13, v2, v3, v12}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    const/4 v13, 0x0

    .line 184
    .end local v12    # "out":Ljava/io/FileOutputStream;
    :goto_1
    return-void

    .line 155
    .end local v1    # "sampledSrcBitmap":Landroid/graphics/Bitmap;
    .end local v6    # "matrix":Landroid/graphics/Matrix;
    .end local v8    # "desiredScale":F
    .end local v13    # "scaledBitmap":Landroid/graphics/Bitmap;
    :cond_1
    div-int/lit8 v15, v15, 0x2

    .line 156
    div-int/lit8 v14, v14, 0x2

    .line 157
    mul-int/lit8 v10, v10, 0x2

    goto :goto_0

    .line 180
    .restart local v1    # "sampledSrcBitmap":Landroid/graphics/Bitmap;
    .restart local v6    # "matrix":Landroid/graphics/Matrix;
    .restart local v8    # "desiredScale":F
    .restart local v13    # "scaledBitmap":Landroid/graphics/Bitmap;
    :catch_0
    move-exception v9

    .line 182
    .local v9, "e":Ljava/io/IOException;
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method public static cropToSquare(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4
    .param p0, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    const/4 v3, 0x0

    .line 68
    if-eqz p0, :cond_0

    .line 70
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 72
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-static {p0, v0, v3, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 80
    .end local p0    # "bitmap":Landroid/graphics/Bitmap;
    :cond_0
    :goto_0
    return-object p0

    .line 74
    .restart local p0    # "bitmap":Landroid/graphics/Bitmap;
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 76
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-static {p0, v3, v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0
.end method

.method public static decodeFile(Ljava/io/File;IZ)Landroid/graphics/Bitmap;
    .locals 9
    .param p0, "file"    # Ljava/io/File;
    .param p1, "size"    # I
    .param p2, "square"    # Z

    .prologue
    const/4 v6, 0x0

    .line 29
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 30
    .local v0, "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    const/4 v7, 0x1

    iput-boolean v7, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 31
    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v8, 0x0

    invoke-static {v7, v8, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 34
    .local v1, "bitmapSize":Landroid/graphics/Bitmap;
    if-lez p1, :cond_1

    .line 36
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .local v5, "width_tmp":I
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 37
    .local v3, "height_tmp":I
    const/4 v4, 0x1

    .line 40
    .local v4, "scale":I
    :goto_0
    div-int/lit8 v7, v5, 0x2

    if-lt v7, p1, :cond_0

    div-int/lit8 v7, v3, 0x2

    if-ge v7, p1, :cond_2

    .line 47
    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .end local v0    # "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 48
    .restart local v0    # "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 49
    const/4 v7, 0x1

    iput-boolean v7, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz p2, :cond_3

    .line 53
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-static {v7}, Lcom/hmobile/swipeview/BitmapUtil;->cropToSquare(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 63
    .end local v0    # "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    .end local v1    # "bitmapSize":Landroid/graphics/Bitmap;
    .end local v3    # "height_tmp":I
    .end local v4    # "scale":I
    .end local v5    # "width_tmp":I
    :cond_1
    :goto_1
    return-object v6

    .line 42
    .restart local v0    # "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    .restart local v1    # "bitmapSize":Landroid/graphics/Bitmap;
    .restart local v3    # "height_tmp":I
    .restart local v4    # "scale":I
    .restart local v5    # "width_tmp":I
    :cond_2
    div-int/lit8 v5, v5, 0x2

    .line 43
    div-int/lit8 v3, v3, 0x2

    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 38
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    goto :goto_1

    .line 59
    .end local v0    # "bitmapOptions":Landroid/graphics/BitmapFactory$Options;
    .end local v1    # "bitmapSize":Landroid/graphics/Bitmap;
    .end local v3    # "height_tmp":I
    .end local v4    # "scale":I
    .end local v5    # "width_tmp":I
    :catch_0
    move-exception v2

    .line 61
    .local v2, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_1
.end method

.method public static decodeFile(Ljava/lang/String;IZ)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "filepath"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "square"    # Z

    .prologue
    .line 21
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1, p2}, Lcom/hmobile/swipeview/BitmapUtil;->decodeFile(Ljava/io/File;IZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getThumbnail(Landroid/content/ContentResolver;J)Landroid/graphics/Bitmap;
    .locals 13
    .param p0, "contentResolver"    # Landroid/content/ContentResolver;
    .param p1, "id"    # J

    .prologue
    .line 85
    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 86
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "_data"

    aput-object v4, v2, v3

    .line 87
    const-string v3, "_id=?"

    .line 88
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v4, v6

    .line 89
    const/4 v5, 0x0

    move-object v0, p0

    .line 85
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 91
    .local v7, "cursor":Landroid/database/Cursor;
    if-eqz v7, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_2

    .line 93
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 94
    const/4 v1, 0x0

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 95
    .local v10, "filepath":Ljava/lang/String;
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 96
    const/4 v11, 0x0

    .line 100
    .local v11, "rotation":I
    :try_start_0
    new-instance v8, Landroid/media/ExifInterface;

    invoke-direct {v8, v10}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 101
    .local v8, "exifInterface":Landroid/media/ExifInterface;
    const-string v1, "Orientation"

    const/4 v2, 0x0

    invoke-virtual {v8, v1, v2}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v9

    .line 103
    .local v9, "exifRotation":I
    if-eqz v9, :cond_0

    .line 105
    packed-switch v9, :pswitch_data_0

    .line 121
    .end local v8    # "exifInterface":Landroid/media/ExifInterface;
    .end local v9    # "exifRotation":I
    :cond_0
    :goto_0
    :pswitch_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, p1, p2, v1, v2}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 123
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v11, :cond_1

    .line 125
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 126
    .local v5, "matrix":Landroid/graphics/Matrix;
    int-to-float v1, v11

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 127
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 134
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    .end local v5    # "matrix":Landroid/graphics/Matrix;
    .end local v10    # "filepath":Ljava/lang/String;
    .end local v11    # "rotation":I
    :cond_1
    :goto_1
    return-object v0

    .line 108
    .restart local v8    # "exifInterface":Landroid/media/ExifInterface;
    .restart local v9    # "exifRotation":I
    .restart local v10    # "filepath":Ljava/lang/String;
    .restart local v11    # "rotation":I
    :pswitch_1
    const/16 v11, 0xb4

    .line 109
    goto :goto_0

    .line 111
    :pswitch_2
    const/16 v11, 0x10e

    .line 112
    goto :goto_0

    .line 114
    :pswitch_3
    const/16 v11, 0x5a

    goto :goto_0

    .line 134
    .end local v8    # "exifInterface":Landroid/media/ExifInterface;
    .end local v9    # "exifRotation":I
    .end local v10    # "filepath":Ljava/lang/String;
    .end local v11    # "rotation":I
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 119
    .restart local v10    # "filepath":Ljava/lang/String;
    .restart local v11    # "rotation":I
    :catch_0
    move-exception v1

    goto :goto_0

    .line 105
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
