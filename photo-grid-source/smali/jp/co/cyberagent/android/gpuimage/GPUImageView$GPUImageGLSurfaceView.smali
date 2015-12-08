.class Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 480
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 481
    invoke-direct {p0, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 482
    return-void
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 484
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 485
    invoke-direct {p0, p2, p3}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 486
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    .line 490
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    if-eqz v0, :cond_0

    .line 491
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    iget v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;->width:I

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, v1, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    iget v1, v1, Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;->height:I

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-super {p0, v0, v1}, Landroid/opengl/GLSurfaceView;->onMeasure(II)V

    .line 496
    :goto_0
    return-void

    .line 494
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/opengl/GLSurfaceView;->onMeasure(II)V

    goto :goto_0
.end method
