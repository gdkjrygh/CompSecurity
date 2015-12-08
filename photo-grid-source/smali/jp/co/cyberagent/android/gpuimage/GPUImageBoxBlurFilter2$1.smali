.class Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->initTexelOffsets()V

    .line 92
    return-void
.end method
