.class public Lorg/apache/cordova/camera/CameraLauncher;
.super Lorg/apache/cordova/CordovaPlugin;
.source "CameraLauncher.java"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# static fields
.field private static final ALLMEDIA:I = 0x2

.field private static final CAMERA:I = 0x1

.field private static final CROP_CAMERA:I = 0x64

.field private static final DATA_URL:I = 0x0

.field private static final FILE_URI:I = 0x1

.field private static final GET_All:Ljava/lang/String; = "Get All"

.field private static final GET_PICTURE:Ljava/lang/String; = "Get Picture"

.field private static final GET_VIDEO:Ljava/lang/String; = "Get Video"

.field private static final JPEG:I = 0x0

.field private static final LOG_TAG:Ljava/lang/String; = "CameraLauncher"

.field private static final NATIVE_URI:I = 0x2

.field private static final PHOTOLIBRARY:I = 0x0

.field private static final PICTURE:I = 0x0

.field private static final PNG:I = 0x1

.field private static final SAVEDPHOTOALBUM:I = 0x2

.field private static final VIDEO:I = 0x1


# instance fields
.field private allowEdit:Z

.field public callbackContext:Lorg/apache/cordova/CallbackContext;

.field private conn:Landroid/media/MediaScannerConnection;

.field private correctOrientation:Z

.field private croppedUri:Landroid/net/Uri;

.field private encodingType:I

.field private imageUri:Landroid/net/Uri;

.field private mQuality:I

.field private mediaType:I

.field private numPics:I

.field private orientationCorrected:Z

.field private saveToPhotoAlbum:Z

.field private scanMe:Landroid/net/Uri;

.field private targetHeight:I

.field private targetWidth:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method public static calculateSampleSize(IIII)I
    .locals 4
    .param p0, "srcWidth"    # I
    .param p1, "srcHeight"    # I
    .param p2, "dstWidth"    # I
    .param p3, "dstHeight"    # I

    .prologue
    .line 832
    int-to-float v2, p0

    int-to-float v3, p1

    div-float v1, v2, v3

    .line 833
    .local v1, "srcAspect":F
    int-to-float v2, p2

    int-to-float v3, p3

    div-float v0, v2, v3

    .line 835
    .local v0, "dstAspect":F
    cmpl-float v2, v1, v0

    if-lez v2, :cond_0

    .line 836
    div-int v2, p0, p2

    .line 838
    :goto_0
    return v2

    :cond_0
    div-int v2, p1, p3

    goto :goto_0
.end method

.method private checkForDuplicateImage(I)V
    .locals 9
    .param p1, "type"    # I

    .prologue
    const/4 v8, 0x0

    .line 885
    const/4 v3, 0x1

    .line 886
    .local v3, "diff":I
    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->whichContentStore()Landroid/net/Uri;

    move-result-object v0

    .line 887
    .local v0, "contentStore":Landroid/net/Uri;
    invoke-direct {p0, v0}, Lorg/apache/cordova/camera/CameraLauncher;->queryImgDB(Landroid/net/Uri;)Landroid/database/Cursor;

    move-result-object v2

    .line 888
    .local v2, "cursor":Landroid/database/Cursor;
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v1

    .line 890
    .local v1, "currentNumOfImages":I
    const/4 v6, 0x1

    if-ne p1, v6, :cond_0

    iget-boolean v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    if-eqz v6, :cond_0

    .line 891
    const/4 v3, 0x2

    .line 895
    :cond_0
    iget v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->numPics:I

    sub-int v6, v1, v6

    if-ne v6, v3, :cond_2

    .line 896
    invoke-interface {v2}, Landroid/database/Cursor;->moveToLast()Z

    .line 897
    const-string v6, "_id"

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 898
    .local v4, "id":I
    const/4 v6, 0x2

    if-ne v3, v6, :cond_1

    .line 899
    add-int/lit8 v4, v4, -0x1

    .line 901
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 902
    .local v5, "uri":Landroid/net/Uri;
    iget-object v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-virtual {v6, v5, v8, v8}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 903
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 905
    .end local v4    # "id":I
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_2
    return-void
.end method

.method private cleanup(ILandroid/net/Uri;Landroid/net/Uri;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "imageType"    # I
    .param p2, "oldImage"    # Landroid/net/Uri;
    .param p3, "newImage"    # Landroid/net/Uri;
    .param p4, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 861
    if-eqz p4, :cond_0

    .line 862
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->recycle()V

    .line 866
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/cordova/camera/FileHelper;->stripFileProtocol(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 868
    invoke-direct {p0, p1}, Lorg/apache/cordova/camera/CameraLauncher;->checkForDuplicateImage(I)V

    .line 870
    iget-boolean v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    .line 871
    invoke-direct {p0, p3}, Lorg/apache/cordova/camera/CameraLauncher;->scanForGallery(Landroid/net/Uri;)V

    .line 874
    :cond_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 875
    return-void
.end method

.method private createCaptureFile(I)Ljava/io/File;
    .locals 4
    .param p1, "encodingType"    # I

    .prologue
    .line 228
    const/4 v0, 0x0

    .line 229
    .local v0, "photo":Ljava/io/File;
    if-nez p1, :cond_0

    .line 230
    new-instance v0, Ljava/io/File;

    .end local v0    # "photo":Ljava/io/File;
    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".Pic.jpg"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .restart local v0    # "photo":Ljava/io/File;
    :goto_0
    return-object v0

    .line 231
    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 232
    new-instance v0, Ljava/io/File;

    .end local v0    # "photo":Ljava/io/File;
    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".Pic.png"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .restart local v0    # "photo":Ljava/io/File;
    goto :goto_0

    .line 234
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Encoding Type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getImageOrientation(Landroid/net/Uri;)I
    .locals 8
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v1, 0x0

    .line 643
    const/4 v7, 0x0

    .line 644
    .local v7, "rotate":I
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "orientation"

    aput-object v0, v2, v1

    .line 646
    .local v2, "cols":[Ljava/lang/String;
    :try_start_0
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 648
    .local v6, "cursor":Landroid/database/Cursor;
    if-eqz v6, :cond_0

    .line 649
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 650
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 651
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 656
    .end local v6    # "cursor":Landroid/database/Cursor;
    :cond_0
    :goto_0
    return v7

    .line 653
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private getRotatedBitmap(ILandroid/graphics/Bitmap;Lorg/apache/cordova/camera/ExifHelper;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1, "rotate"    # I
    .param p2, "bitmap"    # Landroid/graphics/Bitmap;
    .param p3, "exif"    # Lorg/apache/cordova/camera/ExifHelper;

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 668
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 669
    .local v5, "matrix":Landroid/graphics/Matrix;
    const/16 v0, 0xb4

    if-ne p1, v0, :cond_0

    .line 670
    int-to-float v0, p1

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 677
    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 678
    invoke-virtual {p3}, Lorg/apache/cordova/camera/ExifHelper;->resetOrientation()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 688
    :goto_1
    return-object p2

    .line 672
    :cond_0
    int-to-float v0, p1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {v5, v0, v1, v2}, Landroid/graphics/Matrix;->setRotate(FFF)V

    goto :goto_0

    .line 680
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private getScaledBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10
    .param p1, "imageUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    const/4 v3, 0x0

    .line 745
    iget v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-gtz v4, :cond_1

    iget v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-gtz v4, :cond_1

    .line 746
    iget-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {p1, v3}, Lorg/apache/cordova/camera/FileHelper;->getInputStreamFromUriString(Ljava/lang/String;Lorg/apache/cordova/CordovaInterface;)Ljava/io/InputStream;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 771
    :cond_0
    :goto_0
    return-object v3

    .line 750
    :cond_1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 751
    .local v0, "options":Landroid/graphics/BitmapFactory$Options;
    iput-boolean v8, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 752
    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {p1, v4}, Lorg/apache/cordova/camera/FileHelper;->getInputStreamFromUriString(Ljava/lang/String;Lorg/apache/cordova/CordovaInterface;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 755
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eqz v4, :cond_0

    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-eqz v4, :cond_0

    .line 761
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {p0, v4, v5}, Lorg/apache/cordova/camera/CameraLauncher;->calculateAspectRatio(II)[I

    move-result-object v2

    .line 764
    .local v2, "widthHeight":[I
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 765
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    iget v7, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    invoke-static {v4, v5, v6, v7}, Lorg/apache/cordova/camera/CameraLauncher;->calculateSampleSize(IIII)I

    move-result v4

    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 766
    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {p1, v4}, Lorg/apache/cordova/camera/FileHelper;->getInputStreamFromUriString(Ljava/lang/String;Lorg/apache/cordova/CordovaInterface;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 767
    .local v1, "unscaledBitmap":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_0

    .line 771
    aget v3, v2, v9

    aget v4, v2, v8

    invoke-static {v1, v3, v4, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v3

    goto :goto_0
.end method

.method private getTempDirectoryPath()Ljava/lang/String;
    .locals 3

    .prologue
    .line 171
    const/4 v0, 0x0

    .line 174
    .local v0, "cache":Ljava/io/File;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    new-instance v0, Ljava/io/File;

    .end local v0    # "cache":Ljava/io/File;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/Android/data/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 176
    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/cache/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 184
    .restart local v0    # "cache":Ljava/io/File;
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 185
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 180
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method private getUriFromMediaStore()Landroid/net/Uri;
    .locals 6

    .prologue
    .line 719
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 720
    .local v3, "values":Landroid/content/ContentValues;
    const-string v4, "mime_type"

    const-string v5, "image/jpeg"

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 723
    :try_start_0
    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v4, v5, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 733
    :goto_0
    return-object v2

    .line 724
    :catch_0
    move-exception v0

    .line 725
    .local v0, "e":Ljava/lang/RuntimeException;
    const-string v4, "CameraLauncher"

    const-string v5, "Can\'t write to external media storage."

    invoke-static {v4, v5}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    :try_start_1
    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    sget-object v5, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v4, v5, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .local v2, "uri":Landroid/net/Uri;
    goto :goto_0

    .line 728
    .end local v2    # "uri":Landroid/net/Uri;
    :catch_1
    move-exception v1

    .line 729
    .local v1, "ex":Ljava/lang/RuntimeException;
    const-string v4, "CameraLauncher"

    const-string v5, "Can\'t write to internal media storage."

    invoke-static {v4, v5}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    const/4 v2, 0x0

    goto :goto_0
.end method

.method private ouputModifiedBitmap(Landroid/graphics/Bitmap;Landroid/net/Uri;)Ljava/lang/String;
    .locals 7
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;
    .param p2, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 450
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/modified.jpg"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 452
    .local v2, "modifiedPath":Ljava/lang/String;
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 453
    .local v3, "os":Ljava/io/OutputStream;
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    invoke-virtual {p1, v5, v6, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 454
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 457
    iget-object v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {p2, v5}, Lorg/apache/cordova/camera/FileHelper;->getRealPath(Landroid/net/Uri;Lorg/apache/cordova/CordovaInterface;)Ljava/lang/String;

    move-result-object v4

    .line 458
    .local v4, "realPath":Ljava/lang/String;
    new-instance v1, Lorg/apache/cordova/camera/ExifHelper;

    invoke-direct {v1}, Lorg/apache/cordova/camera/ExifHelper;-><init>()V

    .line 459
    .local v1, "exif":Lorg/apache/cordova/camera/ExifHelper;
    if-eqz v4, :cond_1

    iget v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    if-nez v5, :cond_1

    .line 461
    :try_start_0
    invoke-virtual {v1, v4}, Lorg/apache/cordova/camera/ExifHelper;->createInFile(Ljava/lang/String;)V

    .line 462
    invoke-virtual {v1}, Lorg/apache/cordova/camera/ExifHelper;->readExifData()V

    .line 463
    iget-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-eqz v5, :cond_0

    iget-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->orientationCorrected:Z

    if-eqz v5, :cond_0

    .line 464
    invoke-virtual {v1}, Lorg/apache/cordova/camera/ExifHelper;->resetOrientation()V

    .line 466
    :cond_0
    invoke-virtual {v1, v2}, Lorg/apache/cordova/camera/ExifHelper;->createOutFile(Ljava/lang/String;)V

    .line 467
    invoke-virtual {v1}, Lorg/apache/cordova/camera/ExifHelper;->writeExifData()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    :cond_1
    :goto_0
    return-object v2

    .line 468
    :catch_0
    move-exception v0

    .line 469
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private performCrop(Landroid/net/Uri;)V
    .locals 8
    .param p1, "picUri"    # Landroid/net/Uri;

    .prologue
    .line 301
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.android.camera.action.CROP"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 303
    .local v1, "cropIntent":Landroid/content/Intent;
    const-string v2, "image/*"

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 305
    const-string v2, "crop"

    const-string v3, "true"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 307
    iget v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-lez v2, :cond_0

    .line 308
    const-string v2, "outputX"

    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 310
    :cond_0
    iget v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-lez v2, :cond_1

    .line 311
    const-string v2, "outputY"

    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 313
    :cond_1
    iget v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-lez v2, :cond_2

    iget v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-lez v2, :cond_2

    iget v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-ne v2, v3, :cond_2

    .line 314
    const-string v2, "aspectX"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 315
    const-string v2, "aspectY"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 318
    :cond_2
    new-instance v2, Ljava/io/File;

    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 319
    const-string v2, "output"

    iget-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 323
    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    if-eqz v2, :cond_3

    .line 324
    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    const/16 v3, 0x64

    invoke-interface {v2, p0, v1, v3}, Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    .end local v1    # "cropIntent":Landroid/content/Intent;
    :cond_3
    :goto_0
    return-void

    .line 327
    :catch_0
    move-exception v0

    .line 328
    .local v0, "anfe":Landroid/content/ActivityNotFoundException;
    const-string v2, "CameraLauncher"

    const-string v3, "Crop operation not supported on this device"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 330
    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private processResultFromCamera(ILandroid/content/Intent;)V
    .locals 14
    .param p1, "destType"    # I
    .param p2, "intent"    # Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 341
    const/4 v6, 0x0

    .line 344
    .local v6, "rotate":I
    new-instance v2, Lorg/apache/cordova/camera/ExifHelper;

    invoke-direct {v2}, Lorg/apache/cordova/camera/ExifHelper;-><init>()V

    .line 346
    .local v2, "exif":Lorg/apache/cordova/camera/ExifHelper;
    :try_start_0
    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    if-nez v8, :cond_2

    .line 347
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/.Pic.jpg"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lorg/apache/cordova/camera/ExifHelper;->createInFile(Ljava/lang/String;)V

    .line 348
    invoke-virtual {v2}, Lorg/apache/cordova/camera/ExifHelper;->readExifData()V

    .line 349
    invoke-virtual {v2}, Lorg/apache/cordova/camera/ExifHelper;->getOrientation()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 359
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 360
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    const/4 v7, 0x0

    .line 363
    .local v7, "uri":Landroid/net/Uri;
    if-nez p1, :cond_5

    .line 364
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->imageUri:Landroid/net/Uri;

    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lorg/apache/cordova/camera/FileHelper;->stripFileProtocol(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v8}, Lorg/apache/cordova/camera/CameraLauncher;->getScaledBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 365
    if-nez v0, :cond_1

    .line 367
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v8

    const-string v9, "data"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    check-cast v0, Landroid/graphics/Bitmap;

    .line 371
    .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
    :cond_1
    if-nez v0, :cond_3

    .line 372
    const-string v8, "CameraLauncher"

    const-string v9, "I either have a null image path or bitmap"

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    const-string v8, "Unable to create bitmap!"

    invoke-virtual {p0, v8}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    .line 446
    :goto_1
    return-void

    .line 350
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    .end local v7    # "uri":Landroid/net/Uri;
    :cond_2
    :try_start_1
    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_0

    .line 351
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/.Pic.png"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lorg/apache/cordova/camera/ExifHelper;->createInFile(Ljava/lang/String;)V

    .line 352
    invoke-virtual {v2}, Lorg/apache/cordova/camera/ExifHelper;->readExifData()V

    .line 353
    invoke-virtual {v2}, Lorg/apache/cordova/camera/ExifHelper;->getOrientation()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v6

    goto :goto_0

    .line 355
    :catch_0
    move-exception v1

    .line 356
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 377
    .end local v1    # "e":Ljava/io/IOException;
    .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v7    # "uri":Landroid/net/Uri;
    :cond_3
    if-eqz v6, :cond_4

    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-eqz v8, :cond_4

    .line 378
    invoke-direct {p0, v6, v0, v2}, Lorg/apache/cordova/camera/CameraLauncher;->getRotatedBitmap(ILandroid/graphics/Bitmap;Lorg/apache/cordova/camera/ExifHelper;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 381
    :cond_4
    invoke-virtual {p0, v0}, Lorg/apache/cordova/camera/CameraLauncher;->processPicture(Landroid/graphics/Bitmap;)V

    .line 382
    const/4 v8, 0x0

    invoke-direct {p0, v8}, Lorg/apache/cordova/camera/CameraLauncher;->checkForDuplicateImage(I)V

    .line 444
    :goto_2
    const/4 v8, 0x1

    iget-object v9, p0, Lorg/apache/cordova/camera/CameraLauncher;->imageUri:Landroid/net/Uri;

    invoke-direct {p0, v8, v9, v7, v0}, Lorg/apache/cordova/camera/CameraLauncher;->cleanup(ILandroid/net/Uri;Landroid/net/Uri;Landroid/graphics/Bitmap;)V

    .line 445
    const/4 v0, 0x0

    .line 446
    goto :goto_1

    .line 386
    :cond_5
    const/4 v8, 0x1

    if-eq p1, v8, :cond_6

    const/4 v8, 0x2

    if-ne p1, v8, :cond_e

    .line 387
    :cond_6
    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    if-eqz v8, :cond_7

    .line 388
    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getUriFromMediaStore()Landroid/net/Uri;

    move-result-object v4

    .line 391
    .local v4, "inputUri":Landroid/net/Uri;
    :try_start_2
    new-instance v8, Ljava/io/File;

    iget-object v9, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {v4, v9}, Lorg/apache/cordova/camera/FileHelper;->getRealPath(Landroid/net/Uri;Lorg/apache/cordova/CordovaInterface;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v7

    .line 399
    .end local v4    # "inputUri":Landroid/net/Uri;
    :goto_3
    if-nez v7, :cond_8

    .line 400
    const-string v8, "Error capturing image - no media storage found."

    invoke-virtual {p0, v8}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1

    .line 392
    .restart local v4    # "inputUri":Landroid/net/Uri;
    :catch_1
    move-exception v1

    .line 393
    .local v1, "e":Ljava/lang/NullPointerException;
    const/4 v7, 0x0

    goto :goto_3

    .line 396
    .end local v1    # "e":Ljava/lang/NullPointerException;
    .end local v4    # "inputUri":Landroid/net/Uri;
    :cond_7
    new-instance v8, Ljava/io/File;

    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->getTempDirectoryPath()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ".jpg"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v7

    goto :goto_3

    .line 405
    :cond_8
    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_9

    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_9

    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    const/16 v9, 0x64

    if-ne v8, v9, :cond_9

    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-nez v8, :cond_9

    .line 407
    invoke-direct {p0, v7}, Lorg/apache/cordova/camera/CameraLauncher;->writeUncompressedImage(Landroid/net/Uri;)V

    .line 409
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_2

    .line 411
    :cond_9
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->imageUri:Landroid/net/Uri;

    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lorg/apache/cordova/camera/FileHelper;->stripFileProtocol(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v8}, Lorg/apache/cordova/camera/CameraLauncher;->getScaledBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 413
    if-eqz v6, :cond_a

    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-eqz v8, :cond_a

    .line 414
    invoke-direct {p0, v6, v0, v2}, Lorg/apache/cordova/camera/CameraLauncher;->getRotatedBitmap(ILandroid/graphics/Bitmap;Lorg/apache/cordova/camera/ExifHelper;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 418
    :cond_a
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v8}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v5

    .line 419
    .local v5, "os":Ljava/io/OutputStream;
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget v9, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    invoke-virtual {v0, v8, v9, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 420
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    .line 423
    iget v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    if-nez v8, :cond_b

    .line 425
    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    if-eqz v8, :cond_c

    .line 426
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {v7, v8}, Lorg/apache/cordova/camera/FileHelper;->getRealPath(Landroid/net/Uri;Lorg/apache/cordova/CordovaInterface;)Ljava/lang/String;

    move-result-object v3

    .line 430
    .local v3, "exifPath":Ljava/lang/String;
    :goto_4
    invoke-virtual {v2, v3}, Lorg/apache/cordova/camera/ExifHelper;->createOutFile(Ljava/lang/String;)V

    .line 431
    invoke-virtual {v2}, Lorg/apache/cordova/camera/ExifHelper;->writeExifData()V

    .line 433
    .end local v3    # "exifPath":Ljava/lang/String;
    :cond_b
    iget-boolean v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->allowEdit:Z

    if-eqz v8, :cond_d

    .line 434
    invoke-direct {p0, v7}, Lorg/apache/cordova/camera/CameraLauncher;->performCrop(Landroid/net/Uri;)V

    goto/16 :goto_2

    .line 428
    :cond_c
    invoke-virtual {v7}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    .restart local v3    # "exifPath":Ljava/lang/String;
    goto :goto_4

    .line 437
    .end local v3    # "exifPath":Ljava/lang/String;
    :cond_d
    iget-object v8, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 441
    .end local v5    # "os":Ljava/io/OutputStream;
    :cond_e
    new-instance v8, Ljava/lang/IllegalStateException;

    invoke-direct {v8}, Ljava/lang/IllegalStateException;-><init>()V

    throw v8
.end method

.method private processResultFromGallery(ILandroid/content/Intent;)V
    .locals 18
    .param p1, "destType"    # I
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 482
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v14

    .line 483
    .local v14, "uri":Landroid/net/Uri;
    if-nez v14, :cond_0

    .line 484
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    if-eqz v3, :cond_1

    .line 485
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 491
    :cond_0
    const/4 v13, 0x0

    .line 495
    .local v13, "rotate":I
    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    if-eqz v3, :cond_2

    .line 496
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v14}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 571
    .end local v13    # "rotate":I
    :goto_0
    return-void

    .line 487
    :cond_1
    const-string v3, "null data from photo library"

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0

    .line 501
    .restart local v13    # "rotate":I
    :cond_2
    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_4

    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_4

    const/4 v3, 0x1

    move/from16 v0, p1

    if-eq v0, v3, :cond_3

    const/4 v3, 0x2

    move/from16 v0, p1

    if-ne v0, v3, :cond_4

    :cond_3
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-nez v3, :cond_4

    .line 503
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v14}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 505
    :cond_4
    invoke-virtual {v14}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v15

    .line 507
    .local v15, "uriString":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-static {v15, v3}, Lorg/apache/cordova/camera/FileHelper;->getMimeType(Ljava/lang/String;Lorg/apache/cordova/CordovaInterface;)Ljava/lang/String;

    move-result-object v10

    .line 509
    .local v10, "mimeType":Ljava/lang/String;
    const-string v3, "image/jpeg"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "image/png"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 510
    const-string v3, "CameraLauncher"

    const-string v4, "I either have a null image path or bitmap"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 511
    const-string v3, "Unable to retrieve path to picture!"

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0

    .line 514
    :cond_5
    const/4 v2, 0x0

    .line 516
    .local v2, "bitmap":Landroid/graphics/Bitmap;
    :try_start_0
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lorg/apache/cordova/camera/CameraLauncher;->getScaledBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 520
    :goto_1
    if-nez v2, :cond_6

    .line 521
    const-string v3, "CameraLauncher"

    const-string v4, "I either have a null image path or bitmap"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 522
    const-string v3, "Unable to create bitmap!"

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0

    .line 517
    :catch_0
    move-exception v9

    .line 518
    .local v9, "e":Ljava/io/IOException;
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 526
    .end local v9    # "e":Ljava/io/IOException;
    :cond_6
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-eqz v3, :cond_7

    .line 527
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lorg/apache/cordova/camera/CameraLauncher;->getImageOrientation(Landroid/net/Uri;)I

    move-result v13

    .line 528
    if-eqz v13, :cond_7

    .line 529
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 530
    .local v7, "matrix":Landroid/graphics/Matrix;
    int-to-float v3, v13

    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 532
    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x1

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 533
    const/4 v3, 0x1

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->orientationCorrected:Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 541
    .end local v7    # "matrix":Landroid/graphics/Matrix;
    :cond_7
    :goto_2
    if-nez p1, :cond_a

    .line 542
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lorg/apache/cordova/camera/CameraLauncher;->processPicture(Landroid/graphics/Bitmap;)V

    .line 564
    :cond_8
    :goto_3
    if-eqz v2, :cond_9

    .line 565
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 566
    const/4 v2, 0x0

    .line 568
    :cond_9
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 534
    .restart local v7    # "matrix":Landroid/graphics/Matrix;
    :catch_1
    move-exception v12

    .line 535
    .local v12, "oom":Ljava/lang/OutOfMemoryError;
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->orientationCorrected:Z

    goto :goto_2

    .line 546
    .end local v7    # "matrix":Landroid/graphics/Matrix;
    .end local v12    # "oom":Ljava/lang/OutOfMemoryError;
    :cond_a
    const/4 v3, 0x1

    move/from16 v0, p1

    if-eq v0, v3, :cond_b

    const/4 v3, 0x2

    move/from16 v0, p1

    if-ne v0, v3, :cond_8

    .line 548
    :cond_b
    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-lez v3, :cond_c

    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-gtz v3, :cond_d

    :cond_c
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    if-eqz v3, :cond_e

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->orientationCorrected:Z

    if-eqz v3, :cond_e

    .line 551
    :cond_d
    :try_start_2
    move-object/from16 v0, p0

    invoke-direct {v0, v2, v14}, Lorg/apache/cordova/camera/CameraLauncher;->ouputModifiedBitmap(Landroid/graphics/Bitmap;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v11

    .line 554
    .local v11, "modifiedPath":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "file://"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    move-wide/from16 v0, v16

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    .line 555
    .end local v11    # "modifiedPath":Ljava/lang/String;
    :catch_2
    move-exception v9

    .line 556
    .local v9, "e":Ljava/lang/Exception;
    invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V

    .line 557
    const-string v3, "Error retrieving image."

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_3

    .line 561
    .end local v9    # "e":Ljava/lang/Exception;
    :cond_e
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v14}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_3
.end method

.method private queryImgDB(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 6
    .param p1, "contentStore"    # Landroid/net/Uri;

    .prologue
    const/4 v3, 0x0

    .line 848
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "_id"

    aput-object v4, v2, v1

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private scanForGallery(Landroid/net/Uri;)V
    .locals 2
    .param p1, "newImage"    # Landroid/net/Uri;

    .prologue
    .line 952
    iput-object p1, p0, Lorg/apache/cordova/camera/CameraLauncher;->scanMe:Landroid/net/Uri;

    .line 953
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    .line 954
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 956
    :cond_0
    new-instance v0, Landroid/media/MediaScannerConnection;

    iget-object v1, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    iput-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    .line 957
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    .line 958
    return-void
.end method

.method private whichContentStore()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 912
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 913
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 915
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0
.end method

.method private writeUncompressedImage(Landroid/net/Uri;)V
    .locals 5
    .param p1, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 701
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->imageUri:Landroid/net/Uri;

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/cordova/camera/FileHelper;->stripFileProtocol(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 702
    .local v1, "fis":Ljava/io/FileInputStream;
    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v3

    .line 703
    .local v3, "os":Ljava/io/OutputStream;
    const/16 v4, 0x1000

    new-array v0, v4, [B

    .line 705
    .local v0, "buffer":[B
    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    .local v2, "len":I
    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    .line 706
    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 708
    :cond_0
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 709
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 710
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 711
    return-void
.end method


# virtual methods
.method public calculateAspectRatio(II)[I
    .locals 12
    .param p1, "origWidth"    # I
    .param p2, "origHeight"    # I

    .prologue
    .line 782
    iget v1, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    .line 783
    .local v1, "newWidth":I
    iget v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    .line 786
    .local v0, "newHeight":I
    if-gtz v1, :cond_1

    if-gtz v0, :cond_1

    .line 787
    move v1, p1

    .line 788
    move v0, p2

    .line 815
    :cond_0
    :goto_0
    const/4 v7, 0x2

    new-array v6, v7, [I

    .line 816
    .local v6, "retval":[I
    const/4 v7, 0x0

    aput v1, v6, v7

    .line 817
    const/4 v7, 0x1

    aput v0, v6, v7

    .line 818
    return-object v6

    .line 791
    .end local v6    # "retval":[I
    :cond_1
    if-lez v1, :cond_2

    if-gtz v0, :cond_2

    .line 792
    mul-int v7, v1, p2

    div-int v0, v7, p1

    goto :goto_0

    .line 795
    :cond_2
    if-gtz v1, :cond_3

    if-lez v0, :cond_3

    .line 796
    mul-int v7, v0, p1

    div-int v1, v7, p2

    goto :goto_0

    .line 805
    :cond_3
    int-to-double v8, v1

    int-to-double v10, v0

    div-double v2, v8, v10

    .line 806
    .local v2, "newRatio":D
    int-to-double v8, p1

    int-to-double v10, p2

    div-double v4, v8, v10

    .line 808
    .local v4, "origRatio":D
    cmpl-double v7, v4, v2

    if-lez v7, :cond_4

    .line 809
    mul-int v7, v1, p2

    div-int v0, v7, p1

    goto :goto_0

    .line 810
    :cond_4
    cmpg-double v7, v4, v2

    if-gez v7, :cond_0

    .line 811
    mul-int v7, v0, p1

    div-int v1, v7, p2

    goto :goto_0
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 9
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x2

    const/4 v7, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 109
    iput-object p3, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    .line 111
    const-string v6, "takePicture"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 112
    const/4 v3, 0x1

    .line 113
    .local v3, "srcType":I
    const/4 v0, 0x1

    .line 114
    .local v0, "destType":I
    iput-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    .line 115
    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    .line 116
    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    .line 117
    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    .line 118
    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    .line 119
    const/16 v6, 0x50

    iput v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    .line 121
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    .line 122
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getInt(I)I

    move-result v0

    .line 123
    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    .line 124
    const/4 v5, 0x3

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    .line 125
    const/4 v5, 0x4

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    .line 126
    const/4 v5, 0x5

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    .line 127
    const/4 v5, 0x6

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    iput v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    .line 128
    const/4 v5, 0x7

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v5

    iput-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->allowEdit:Z

    .line 129
    const/16 v5, 0x8

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v5

    iput-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->correctOrientation:Z

    .line 130
    const/16 v5, 0x9

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v5

    iput-boolean v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->saveToPhotoAlbum:Z

    .line 134
    iget v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-ge v5, v4, :cond_0

    .line 135
    iput v7, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    .line 137
    :cond_0
    iget v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-ge v5, v4, :cond_1

    .line 138
    iput v7, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    .line 142
    :cond_1
    if-ne v3, v4, :cond_3

    .line 143
    :try_start_0
    iget v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    invoke-virtual {p0, v0, v5}, Lorg/apache/cordova/camera/CameraLauncher;->takePicture(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :cond_2
    :goto_0
    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v5, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v2, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 158
    .local v2, "r":Lorg/apache/cordova/PluginResult;
    invoke-virtual {v2, v4}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 159
    invoke-virtual {p3, v2}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 163
    .end local v0    # "destType":I
    .end local v2    # "r":Lorg/apache/cordova/PluginResult;
    .end local v3    # "srcType":I
    :goto_1
    return v4

    .line 145
    .restart local v0    # "destType":I
    .restart local v3    # "srcType":I
    :cond_3
    if-eqz v3, :cond_4

    if-ne v3, v8, :cond_2

    .line 146
    :cond_4
    :try_start_1
    iget v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->encodingType:I

    invoke-virtual {p0, v3, v0, v5}, Lorg/apache/cordova/camera/CameraLauncher;->getImage(III)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 149
    :catch_0
    move-exception v1

    .line 151
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    const-string v5, "Illegal Argument Exception"

    invoke-virtual {p3, v5}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 152
    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v5, Lorg/apache/cordova/PluginResult$Status;->ERROR:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v2, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 153
    .restart local v2    # "r":Lorg/apache/cordova/PluginResult;
    invoke-virtual {p3, v2}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_1

    .end local v0    # "destType":I
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    .end local v2    # "r":Lorg/apache/cordova/PluginResult;
    .end local v3    # "srcType":I
    :cond_5
    move v4, v5

    .line 163
    goto :goto_1
.end method

.method public failPicture(Ljava/lang/String;)V
    .locals 1
    .param p1, "err"    # Ljava/lang/String;

    .prologue
    .line 948
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 949
    return-void
.end method

.method public getImage(III)V
    .locals 6
    .param p1, "srcType"    # I
    .param p2, "returnType"    # I
    .param p3, "encodingType"    # I

    .prologue
    const/4 v5, 0x1

    .line 250
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 251
    .local v0, "intent":Landroid/content/Intent;
    const-string v2, "Get Picture"

    .line 252
    .local v2, "title":Ljava/lang/String;
    const/4 v3, 0x0

    iput-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 253
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    if-nez v3, :cond_6

    .line 254
    const-string v3, "image/*"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    iget-boolean v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->allowEdit:Z

    if-eqz v3, :cond_5

    .line 256
    const-string v3, "android.intent.action.PICK"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const-string v3, "crop"

    const-string v4, "true"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-lez v3, :cond_0

    .line 259
    const-string v3, "outputX"

    iget v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    :cond_0
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-lez v3, :cond_1

    .line 262
    const-string v3, "outputY"

    iget v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 264
    :cond_1
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-lez v3, :cond_2

    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    if-lez v3, :cond_2

    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetWidth:I

    iget v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->targetHeight:I

    if-ne v3, v4, :cond_2

    .line 265
    const-string v3, "aspectX"

    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 266
    const-string v3, "aspectY"

    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 268
    :cond_2
    invoke-direct {p0, p3}, Lorg/apache/cordova/camera/CameraLauncher;->createCaptureFile(I)Ljava/io/File;

    move-result-object v1

    .line 269
    .local v1, "photo":Ljava/io/File;
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 270
    const-string v3, "output"

    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 288
    .end local v1    # "photo":Ljava/io/File;
    :cond_3
    :goto_0
    iget-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    if-eqz v3, :cond_4

    .line 289
    iget-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v4

    add-int/lit8 v5, p1, 0x1

    mul-int/lit8 v5, v5, 0x10

    add-int/2addr v5, p2

    add-int/lit8 v5, v5, 0x1

    invoke-interface {v3, p0, v4, v5}, Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V

    .line 292
    :cond_4
    return-void

    .line 272
    :cond_5
    const-string v3, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 273
    const-string v3, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 275
    :cond_6
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    if-ne v3, v5, :cond_7

    .line 276
    const-string v3, "video/*"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 277
    const-string v2, "Get Video"

    .line 278
    const-string v3, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 279
    const-string v3, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 280
    :cond_7
    iget v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->mediaType:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    .line 283
    const-string v3, "*/*"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 284
    const-string v2, "Get All"

    .line 285
    const-string v3, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 286
    const-string v3, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v5, -0x1

    .line 584
    div-int/lit8 v3, p1, 0x10

    add-int/lit8 v2, v3, -0x1

    .line 585
    .local v2, "srcType":I
    rem-int/lit8 v3, p1, 0x10

    add-int/lit8 v0, v3, -0x1

    .line 587
    .local v0, "destType":I
    const/16 v3, 0x64

    if-ne p1, v3, :cond_0

    .line 588
    if-ne p2, v5, :cond_2

    .line 590
    iget-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    iget-object v4, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 591
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 592
    const/4 v3, 0x0

    iput-object v3, p0, Lorg/apache/cordova/camera/CameraLauncher;->croppedUri:Landroid/net/Uri;

    .line 606
    :cond_0
    :goto_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_6

    .line 608
    if-ne p2, v5, :cond_4

    .line 610
    :try_start_0
    invoke-direct {p0, v0, p3}, Lorg/apache/cordova/camera/CameraLauncher;->processResultFromCamera(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 640
    :cond_1
    :goto_1
    return-void

    .line 595
    :cond_2
    if-nez p2, :cond_3

    .line 596
    const-string v3, "Camera cancelled."

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0

    .line 601
    :cond_3
    const-string v3, "Did not complete!"

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0

    .line 611
    :catch_0
    move-exception v1

    .line 612
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 613
    const-string v3, "Error capturing image."

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1

    .line 618
    .end local v1    # "e":Ljava/io/IOException;
    :cond_4
    if-nez p2, :cond_5

    .line 619
    const-string v3, "Camera cancelled."

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1

    .line 624
    :cond_5
    const-string v3, "Did not complete!"

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1

    .line 629
    :cond_6
    if-eqz v2, :cond_7

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 630
    :cond_7
    if-ne p2, v5, :cond_8

    if-eqz p3, :cond_8

    .line 631
    invoke-direct {p0, v0, p3}, Lorg/apache/cordova/camera/CameraLauncher;->processResultFromGallery(ILandroid/content/Intent;)V

    goto :goto_1

    .line 633
    :cond_8
    if-nez p2, :cond_9

    .line 634
    const-string v3, "Selection cancelled."

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1

    .line 637
    :cond_9
    const-string v3, "Selection did not complete!"

    invoke-virtual {p0, v3}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public onMediaScannerConnected()V
    .locals 4

    .prologue
    .line 962
    :try_start_0
    iget-object v1, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->scanMe:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "image/*"

    invoke-virtual {v1, v2, v3}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 967
    :goto_0
    return-void

    .line 963
    :catch_0
    move-exception v0

    .line 964
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "CameraLauncher"

    const-string v2, "Can\'t scan file in MediaScanner after taking picture"

    invoke-static {v1, v2}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "uri"    # Landroid/net/Uri;

    .prologue
    .line 970
    iget-object v0, p0, Lorg/apache/cordova/camera/CameraLauncher;->conn:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 971
    return-void
.end method

.method public processPicture(Landroid/graphics/Bitmap;)V
    .locals 7
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 925
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 927
    .local v2, "jpeg_data":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget v6, p0, Lorg/apache/cordova/camera/CameraLauncher;->mQuality:I

    invoke-virtual {p1, v5, v6, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 928
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 929
    .local v0, "code":[B
    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v4

    .line 930
    .local v4, "output":[B
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    .line 931
    .local v3, "js_out":Ljava/lang/String;
    iget-object v5, p0, Lorg/apache/cordova/camera/CameraLauncher;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v5, v3}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 932
    const/4 v3, 0x0

    .line 933
    const/4 v4, 0x0

    .line 939
    .end local v0    # "code":[B
    .end local v3    # "js_out":Ljava/lang/String;
    .end local v4    # "output":[B
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 940
    return-void

    .line 936
    :catch_0
    move-exception v1

    .line 937
    .local v1, "e":Ljava/lang/Exception;
    const-string v5, "Error compressing image."

    invoke-virtual {p0, v5}, Lorg/apache/cordova/camera/CameraLauncher;->failPicture(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public takePicture(II)V
    .locals 4
    .param p1, "returnType"    # I
    .param p2, "encodingType"    # I

    .prologue
    .line 204
    invoke-direct {p0}, Lorg/apache/cordova/camera/CameraLauncher;->whichContentStore()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/apache/cordova/camera/CameraLauncher;->queryImgDB(Landroid/net/Uri;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v2

    iput v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->numPics:I

    .line 207
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 210
    .local v0, "intent":Landroid/content/Intent;
    invoke-direct {p0, p2}, Lorg/apache/cordova/camera/CameraLauncher;->createCaptureFile(I)Ljava/io/File;

    move-result-object v1

    .line 211
    .local v1, "photo":Ljava/io/File;
    const-string v2, "output"

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 212
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->imageUri:Landroid/net/Uri;

    .line 214
    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    if-eqz v2, :cond_0

    .line 215
    iget-object v2, p0, Lorg/apache/cordova/camera/CameraLauncher;->cordova:Lorg/apache/cordova/CordovaInterface;

    add-int/lit8 v3, p1, 0x20

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v2, p0, v0, v3}, Lorg/apache/cordova/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/CordovaPlugin;Landroid/content/Intent;I)V

    .line 219
    :cond_0
    return-void
.end method
