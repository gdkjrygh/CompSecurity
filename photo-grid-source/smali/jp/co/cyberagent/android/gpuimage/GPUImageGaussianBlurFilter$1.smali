.class Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageGaussianBlurFilter;->initTexelOffsets()V

    .line 113
    return-void
.end method
