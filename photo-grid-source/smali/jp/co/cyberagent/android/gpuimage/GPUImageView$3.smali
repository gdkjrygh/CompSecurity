.class Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field final synthetic val$height:I

.field final synthetic val$pixelMirroredArray:[I

.field final synthetic val$waiter:Ljava/util/concurrent/Semaphore;

.field final synthetic val$width:I


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;II[ILjava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$height:I

    iput-object p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$pixelMirroredArray:[I

    iput-object p5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$waiter:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 425
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$height:I

    mul-int/2addr v1, v2

    invoke-static {v1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v6

    .line 426
    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$height:I

    const/16 v4, 0x1908

    const/16 v5, 0x1401

    move v1, v0

    invoke-static/range {v0 .. v6}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 427
    invoke-virtual {v6}, Ljava/nio/IntBuffer;->array()[I

    move-result-object v3

    move v1, v0

    .line 430
    :goto_0
    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$height:I

    if-ge v1, v2, :cond_1

    move v2, v0

    .line 431
    :goto_1
    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    if-ge v2, v4, :cond_0

    .line 432
    iget-object v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$pixelMirroredArray:[I

    iget v5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$height:I

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1

    iget v6, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    mul-int/2addr v5, v6

    add-int/2addr v5, v2

    iget v6, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$width:I

    mul-int/2addr v6, v1

    add-int/2addr v6, v2

    aget v6, v3, v6

    aput v6, v4, v5

    .line 431
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 430
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 435
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;->val$waiter:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 436
    return-void
.end method
