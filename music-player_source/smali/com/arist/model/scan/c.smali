.class final Lcom/arist/model/scan/c;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/arist/model/scan/MediaScanService;


# direct methods
.method constructor <init>(Lcom/arist/model/scan/MediaScanService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    const/4 v3, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x2

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    if-eqz v0, :cond_2

    array-length v1, v0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    invoke-static {v1, v0}, Lcom/arist/model/scan/MediaScanService;->a(Lcom/arist/model/scan/MediaScanService;[Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->a(Lcom/arist/model/scan/MediaScanService;)V

    goto :goto_0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    iget v0, p1, Landroid/os/Message;->arg1:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p1, Landroid/os/Message;->arg2:I

    div-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    goto :goto_0

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->a(Lcom/arist/model/scan/MediaScanService;)V

    goto :goto_0

    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/arist/model/scan/MediaScanService;->a(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/arist/model/scan/c;->a:Lcom/arist/model/scan/MediaScanService;

    invoke-virtual {v0}, Lcom/arist/model/scan/MediaScanService;->stopSelf()V

    goto :goto_0
.end method
