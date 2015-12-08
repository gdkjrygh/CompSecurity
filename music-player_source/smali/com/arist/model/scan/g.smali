.class final Lcom/arist/model/scan/g;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/arist/model/scan/MusicScanProgressView;


# direct methods
.method constructor <init>(Lcom/arist/model/scan/MusicScanProgressView;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    const-wide/16 v4, 0xf

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget v1, v0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    add-float/2addr v1, v2

    iput v1, v0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget v1, v0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    const/high16 v2, 0x43b40000    # 360.0f

    rem-float/2addr v1, v2

    iput v1, v0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->invalidate()V

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget-boolean v0, v0, Lcom/arist/model/scan/MusicScanProgressView;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget-object v0, v0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget-boolean v0, v0, Lcom/arist/model/scan/MusicScanProgressView;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget v0, v0, Lcom/arist/model/scan/MusicScanProgressView;->a:F

    const/high16 v1, 0x43870000    # 270.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iget-object v0, v0, Lcom/arist/model/scan/MusicScanProgressView;->h:Landroid/os/Handler;

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/arist/model/scan/g;->a:Lcom/arist/model/scan/MusicScanProgressView;

    iput-boolean v3, v0, Lcom/arist/model/scan/MusicScanProgressView;->f:Z

    goto :goto_0
.end method
