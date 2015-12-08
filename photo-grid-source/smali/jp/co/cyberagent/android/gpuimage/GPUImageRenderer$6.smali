.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;
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
    .line 307
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 311
    new-array v0, v3, [I

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v1

    aput v1, v0, v2

    invoke-static {v3, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 314
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v1, -0x1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$402(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 315
    return-void
.end method
