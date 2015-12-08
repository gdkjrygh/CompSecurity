.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field final synthetic val$filter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->val$filter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 277
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$800(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 278
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->val$filter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    # setter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$802(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 279
    if-eqz v0, :cond_0

    .line 280
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    .line 282
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$800(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->init()V

    .line 283
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$800(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 284
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$800(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$900(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I
    invoke-static {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->access$1000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 285
    return-void
.end method
