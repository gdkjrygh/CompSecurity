.class Ljp/co/cyberagent/android/gpuimage/GPUImage$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;)V
    .locals 0

    .prologue
    .line 423
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 427
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    monitor-enter v1

    .line 428
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    .line 429
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 430
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
