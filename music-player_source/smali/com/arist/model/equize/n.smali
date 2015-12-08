.class public final Lcom/arist/model/equize/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/audiofx/Visualizer$OnDataCaptureListener;


# instance fields
.field private a:I

.field private b:Landroid/media/audiofx/Visualizer;

.field private c:Lcom/arist/model/equize/o;

.field private d:Z


# direct methods
.method public constructor <init>(I)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/arist/model/equize/n;->d:Z

    iput p1, p0, Lcom/arist/model/equize/n;->a:I

    const-string v0, "VisualizerHandler"

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    new-instance v0, Landroid/media/audiofx/Visualizer;

    iget v1, p0, Lcom/arist/model/equize/n;->a:I

    invoke-direct {v0, v1}, Landroid/media/audiofx/Visualizer;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object v1

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setCaptureSize(I)I

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getMaxCaptureRate()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v1, v2, v3}, Landroid/media/audiofx/Visualizer;->setDataCaptureListener(Landroid/media/audiofx/Visualizer$OnDataCaptureListener;IZZ)I

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/arist/model/equize/o;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/n;->c:Lcom/arist/model/equize/o;

    return-void
.end method

.method public final a(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/arist/model/equize/n;->d:Z

    invoke-virtual {p0}, Lcom/arist/model/equize/n;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/n;->c:Lcom/arist/model/equize/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/n;->c:Lcom/arist/model/equize/o;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/arist/model/equize/o;->a([B)V

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/model/equize/n;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Lcom/arist/model/equize/n;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Visualizer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/model/equize/n;->b:Landroid/media/audiofx/Visualizer;

    :cond_0
    return-void
.end method

.method public final onFftDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/n;->c:Lcom/arist/model/equize/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/n;->c:Lcom/arist/model/equize/o;

    invoke-interface {v0, p2}, Lcom/arist/model/equize/o;->a([B)V

    :cond_0
    return-void
.end method

.method public final onWaveFormDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 0

    return-void
.end method
