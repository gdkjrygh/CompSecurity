.class final Lcom/roidapp/photogrid/video/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/video/ab;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 450
    iput-object p1, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    .prologue
    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v0, p1, :cond_0

    .line 454
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x1003

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 457
    :cond_0
    return-void
.end method

.method public final a(IILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 470
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v0, p1, :cond_0

    .line 471
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->y(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 473
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 474
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x1001

    invoke-virtual {v1, v2, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 476
    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 4

    .prologue
    .line 461
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->x(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v0, p1, :cond_0

    .line 462
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->y(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 463
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 464
    iget-object v0, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/be;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x1002

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 466
    :cond_0
    return-void
.end method
