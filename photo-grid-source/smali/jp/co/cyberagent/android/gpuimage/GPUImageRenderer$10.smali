.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field final synthetic val$bitmap:Landroid/graphics/Bitmap;

.field final synthetic val$recycle:Z


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/graphics/Bitmap;Z)V
    .locals 0

    .prologue
    .line 389
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$bitmap:Landroid/graphics/Bitmap;

    iput-boolean p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$recycle:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 402
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v1, 0x0

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mAddedPadding:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$1102(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 405
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$bitmap:Landroid/graphics/Bitmap;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v2

    iget-boolean v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$recycle:Z

    invoke-static {v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/OpenGlUtils;->loadTexture(Landroid/graphics/Bitmap;IZ)I

    move-result v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$402(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 410
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v0

    sput v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mSrcTexId:I

    .line 411
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$002(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 412
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->val$bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I
    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$102(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I

    .line 413
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # invokes: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->adjustImageScaling()V
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$500(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    .line 414
    return-void
.end method
