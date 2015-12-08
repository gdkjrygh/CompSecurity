.class Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field final synthetic val$location:I

.field final synthetic val$point:Landroid/graphics/PointF;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;Landroid/graphics/PointF;I)V
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->val$point:Landroid/graphics/PointF;

    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->val$location:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 247
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 248
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->val$point:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    aput v1, v0, v2

    .line 249
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->val$point:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    aput v1, v0, v3

    .line 250
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;->val$location:I

    invoke-static {v1, v3, v0, v2}, Landroid/opengl/GLES20;->glUniform2fv(II[FI)V

    .line 251
    return-void
.end method
