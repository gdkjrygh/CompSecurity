.class Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->initTexelOffsets()V

    .line 134
    return-void
.end method
