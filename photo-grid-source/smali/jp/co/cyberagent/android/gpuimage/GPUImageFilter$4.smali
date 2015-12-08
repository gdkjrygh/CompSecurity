.class Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field final synthetic val$arrayValue:[F

.field final synthetic val$location:I


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V
    .locals 0

    .prologue
    .line 216
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;->val$location:I

    iput-object p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;->val$arrayValue:[F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 219
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;->val$location:I

    const/4 v1, 0x1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;->val$arrayValue:[F

    invoke-static {v2}, Ljava/nio/FloatBuffer;->wrap([F)Ljava/nio/FloatBuffer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glUniform3fv(IILjava/nio/FloatBuffer;)V

    .line 220
    return-void
.end method
