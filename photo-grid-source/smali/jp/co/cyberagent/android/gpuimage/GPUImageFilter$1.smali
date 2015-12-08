.class Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field final synthetic val$intValue:I

.field final synthetic val$location:I


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;II)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;->val$location:I

    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;->val$intValue:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 192
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;->val$location:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;->val$intValue:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 193
    return-void
.end method
