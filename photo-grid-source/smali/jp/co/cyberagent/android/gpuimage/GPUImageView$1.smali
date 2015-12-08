.class Ljp/co/cyberagent/android/gpuimage/GPUImageView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;)V
    .locals 0

    .prologue
    .line 340
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageView;)Landroid/opengl/GLSurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestLayout()V

    .line 347
    return-void
.end method
