.class final Lcom/roidapp/imagelib/filter/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/c/c;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/n;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/n;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/p;->a:Lcom/roidapp/imagelib/filter/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 59
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/p;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/n;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->destroy()V

    .line 64
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/p;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/p;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroy()V

    .line 66
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/p;->a:Lcom/roidapp/imagelib/filter/n;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/n;->d:Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    .line 68
    :cond_0
    return-void
.end method
