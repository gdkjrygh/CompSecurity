.class Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field final synthetic val$floatValue:F

.field final synthetic val$location:I


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;IF)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;->val$location:I

    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;->val$floatValue:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 201
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;->val$location:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;->val$floatValue:F

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 202
    return-void
.end method
