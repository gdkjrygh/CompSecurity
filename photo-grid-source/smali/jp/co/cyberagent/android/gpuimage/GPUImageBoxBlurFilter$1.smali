.class Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter;->initTexelOffsets()V

    .line 100
    return-void
.end method
