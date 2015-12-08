.class final Lcom/roidapp/photogrid/video/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/MusicPlayerService;

.field private b:Landroid/media/MediaPlayer;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/video/MusicPlayerService;Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 245
    iput-object p1, p0, Lcom/roidapp/photogrid/video/l;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    .line 246
    iput-object p2, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    .line 247
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 253
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 256
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    :cond_0
    :goto_0
    return-void

    .line 259
    :catch_0
    move-exception v0

    .line 260
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "runnable System Player Error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    .line 267
    :cond_1
    :goto_1
    iput-object v3, p0, Lcom/roidapp/photogrid/video/l;->b:Landroid/media/MediaPlayer;

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
