.class Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final mFileName:Ljava/lang/String;

.field private final mFolderName:Ljava/lang/String;

.field private final mHandler:Landroid/os/Handler;

.field private final mHeight:I

.field private final mListener:Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;

.field private final mWidth:I

.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 547
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 548
    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mFolderName:Ljava/lang/String;

    .line 549
    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mFileName:Ljava/lang/String;

    .line 550
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mWidth:I

    .line 551
    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mHeight:I

    .line 552
    iput-object p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;

    .line 553
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mHandler:Landroid/os/Handler;

    .line 554
    return-void
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    .locals 1

    .prologue
    .line 538
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 539
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mFolderName:Ljava/lang/String;

    .line 540
    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mFileName:Ljava/lang/String;

    .line 541
    iput p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mWidth:I

    .line 542
    iput p5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mHeight:I

    .line 543
    iput-object p6, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;

    .line 544
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mHandler:Landroid/os/Handler;

    .line 545
    return-void
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 534
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, v4

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V

    .line 535
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 559
    :try_start_0
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mWidth:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mWidth:I

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mHeight:I

    invoke-virtual {v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->capture(II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 565
    :goto_0
    return-object v0

    .line 559
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->capture()Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 563
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 565
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 524
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->doInBackground([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 570
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;

    invoke-interface {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;->onPictureSaved(Landroid/graphics/Bitmap;)V

    .line 571
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 524
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->onPostExecute(Landroid/graphics/Bitmap;)V

    return-void
.end method
