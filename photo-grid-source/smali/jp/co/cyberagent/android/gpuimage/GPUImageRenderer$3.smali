.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteTextureImage()V
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$200(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    .line 267
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteBufferDirectly()V

    .line 268
    return-void
.end method
