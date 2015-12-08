.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;
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
    .line 290
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 294
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 295
    new-array v0, v4, [I

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v1

    aput v1, v0, v3

    invoke-static {v4, v0, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 298
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$402(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 302
    :cond_0
    return-void
.end method
