.class public Lcom/roidapp/imagelib/filter/n;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Lcom/roidapp/imagelib/c/b;

.field protected c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field protected d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

.field protected final e:Lcom/roidapp/imagelib/c/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 73
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/n;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    .line 75
    new-instance v0, Lcom/roidapp/imagelib/filter/q;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/filter/q;-><init>(Lcom/roidapp/imagelib/filter/n;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/n;->e:Lcom/roidapp/imagelib/c/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/n;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    :goto_0
    return-void

    .line 39
    :cond_0
    new-instance v0, Lcom/roidapp/imagelib/c/b;

    new-instance v1, Lcom/roidapp/baselib/b/i;

    const v2, 0x3e19999a    # 0.15f

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v4

    long-to-float v3, v4

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/b/i;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/c/b;-><init>(Lcom/roidapp/baselib/b/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/n;->b:Lcom/roidapp/imagelib/c/b;

    .line 40
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/n;->b:Lcom/roidapp/imagelib/c/b;

    new-instance v1, Lcom/roidapp/imagelib/filter/o;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/o;-><init>(Lcom/roidapp/imagelib/filter/n;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/c/b;->a(Lcom/roidapp/imagelib/c/f;)V

    goto :goto_0
.end method

.method protected a(I)V
    .locals 0

    .prologue
    .line 116
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/n;->b:Lcom/roidapp/imagelib/c/b;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/n;->b:Lcom/roidapp/imagelib/c/b;

    new-instance v1, Lcom/roidapp/imagelib/filter/p;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/p;-><init>(Lcom/roidapp/imagelib/filter/n;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/c/b;->a(Lcom/roidapp/imagelib/c/c;)V

    .line 71
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 34
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 35
    return-void
.end method
