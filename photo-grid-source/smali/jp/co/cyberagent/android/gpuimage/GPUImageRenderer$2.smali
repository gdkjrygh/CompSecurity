.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field final synthetic val$camera:Landroid/hardware/Camera;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->val$camera:Landroid/hardware/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 244
    new-array v0, v1, [I

    .line 245
    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 246
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    new-instance v2, Landroid/graphics/SurfaceTexture;

    aget v0, v0, v3

    invoke-direct {v2, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;
    invoke-static {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$602(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/graphics/SurfaceTexture;)Landroid/graphics/SurfaceTexture;

    .line 248
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->val$camera:Landroid/hardware/Camera;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$600(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 249
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->val$camera:Landroid/hardware/Camera;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 250
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->val$camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 251
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;->val$camera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->cameraParams:Landroid/hardware/Camera$Parameters;
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$702(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Parameters;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 257
    :goto_0
    return-void

    .line 253
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 255
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
