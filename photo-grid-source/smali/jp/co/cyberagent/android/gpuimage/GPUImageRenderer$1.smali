.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field final synthetic val$camera:Landroid/hardware/Camera;

.field final synthetic val$data:[B

.field final synthetic val$previewSize:Landroid/hardware/Camera$Size;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera$Size;[BLandroid/hardware/Camera;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$data:[B

    iput-object p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$camera:Landroid/hardware/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 207
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$100(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$100(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    if-eq v0, v1, :cond_1

    .line 208
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteTextureImage()V
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$200(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    .line 209
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteBufferDirectly()V

    .line 212
    :cond_1
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljava/nio/IntBuffer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 213
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v1, v2

    invoke-static {v1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$302(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljava/nio/IntBuffer;)Ljava/nio/IntBuffer;

    .line 215
    :cond_2
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$data:[B

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;
    invoke-static {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljava/nio/IntBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/IntBuffer;->array()[I

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;->YUVtoRBGA([BII[I)V

    .line 217
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljava/nio/IntBuffer;

    move-result-object v1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v3

    invoke-static {v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/OpenGlUtils;->loadTexture(Ljava/nio/IntBuffer;Landroid/hardware/Camera$Size;I)I

    move-result v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$402(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 218
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    sput v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mSrcTexId:I

    .line 219
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$camera:Landroid/hardware/Camera;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$data:[B

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 221
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    if-eq v0, v1, :cond_3

    .line 222
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$002(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 223
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->val$previewSize:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$102(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 224
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->adjustImageScaling()V
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$500(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    :cond_3
    :goto_0
    return-void

    .line 227
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 228
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

    if-eqz v0, :cond_3

    .line 229
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

    invoke-interface {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;->onPreviewFailed()V

    goto :goto_0
.end method
