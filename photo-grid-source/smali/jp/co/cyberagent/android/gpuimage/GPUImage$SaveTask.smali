.class Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final mBitmap:Landroid/graphics/Bitmap;

.field private final mFileName:Ljava/lang/String;

.field private final mFolderName:Ljava/lang/String;

.field private final mHandler:Landroid/os/Handler;

.field private final mListener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;

.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;)V
    .locals 1

    .prologue
    .line 593
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 594
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mBitmap:Landroid/graphics/Bitmap;

    .line 595
    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mFolderName:Ljava/lang/String;

    .line 596
    iput-object p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mFileName:Ljava/lang/String;

    .line 597
    iput-object p5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;

    .line 598
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mHandler:Landroid/os/Handler;

    .line 599
    return-void
.end method

.method static synthetic access$200(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;

    return-object v0
.end method

.method static synthetic access$300(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private saveImage(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 609
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 611
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 613
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 614
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p3, v0, v2, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 615
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$100(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v3

    const/4 v1, 0x0

    new-instance v3, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;

    invoke-direct {v3, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)V

    invoke-static {v0, v2, v1, v3}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 636
    :goto_0
    return-void

    .line 634
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 583
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .prologue
    .line 603
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getBitmapWithFilterApplied(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 604
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mFolderName:Ljava/lang/String;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mFileName:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->saveImage(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 605
    const/4 v0, 0x0

    return-object v0
.end method
