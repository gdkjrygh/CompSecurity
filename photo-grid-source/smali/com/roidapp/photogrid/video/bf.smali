.class final Lcom/roidapp/photogrid/video/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 522
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 523
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x3002

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 525
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-ge p3, v0, :cond_2

    .line 526
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0, p3}, Lcom/roidapp/photogrid/video/f;->b(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 527
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 528
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->license_url:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, ""

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->license_url:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 529
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->f(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 530
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrackPath()Ljava/lang/String;

    move-result-object v1

    .line 531
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " By "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 532
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    .line 533
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    invoke-static {v3, v1, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    :cond_2
    :goto_0
    return-void

    .line 535
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    .line 536
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/video/q;->g(I)V

    goto :goto_0

    .line 539
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bf;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    goto :goto_0
.end method
