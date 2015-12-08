.class Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$OnScanCompletedListener;


# instance fields
.field final synthetic this$1:Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)V
    .locals 0

    .prologue
    .line 619
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;->this$1:Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 622
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;->this$1:Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mListener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->access$200(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 623
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;->this$1:Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->mHandler:Landroid/os/Handler;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1$1;

    invoke-direct {v1, p0, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask$1;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 631
    :cond_0
    return-void
.end method
