.class Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;
.super Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;
.source "SourceFile"


# instance fields
.field private final mImageFile:Ljava/io/File;

.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V
    .locals 0

    .prologue
    .line 697
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 698
    invoke-direct {p0, p1, p2, p4}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    .line 699
    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;->mImageFile:Ljava/io/File;

    .line 700
    return-void
.end method


# virtual methods
.method protected decode(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 704
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;->mImageFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 706
    if-eqz v0, :cond_1

    .line 707
    const/4 v3, 0x0

    .line 709
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;->mImageFile:Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 710
    :try_start_1
    invoke-static {v2}, Ljp/co/cyberagent/android/gpuimage/util/FileType;->getTypeByStream(Ljava/io/FileInputStream;)Ljava/lang/String;

    move-result-object v1

    .line 711
    const-string v3, "gif"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 712
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 713
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v1

    .line 721
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 726
    :cond_1
    :goto_0
    return-object v0

    .line 717
    :catch_0
    move-exception v1

    move-object v2, v3

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 720
    if-eqz v2, :cond_1

    .line 721
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 724
    :catch_1
    move-exception v1

    goto :goto_0

    .line 719
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 720
    :goto_2
    if-eqz v2, :cond_2

    .line 721
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 723
    :cond_2
    :goto_3
    throw v0

    .line 724
    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 719
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 717
    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method protected getImageOrientation()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 731
    new-instance v1, Landroid/media/ExifInterface;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;->mImageFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 732
    const-string v2, "Orientation"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v1

    .line 733
    packed-switch v1, :pswitch_data_0

    .line 743
    :goto_0
    :pswitch_0
    return v0

    .line 737
    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_0

    .line 739
    :pswitch_2
    const/16 v0, 0xb4

    goto :goto_0

    .line 741
    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_0

    .line 733
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
