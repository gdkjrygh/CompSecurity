.class final Lcom/roidapp/photogrid/video/an;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

.field final synthetic b:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V
    .locals 0

    .prologue
    .line 801
    iput-object p1, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 806
    if-eqz p1, :cond_0

    .line 807
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 808
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->B(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    .line 809
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-nez v0, :cond_1

    .line 825
    :goto_0
    return-void

    .line 813
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "before trackPath "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->f(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 815
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrackPath()Ljava/lang/String;

    move-result-object v0

    .line 816
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " By "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 818
    iget-object v2, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    .line 819
    iget-object v2, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    invoke-static {v2, v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 822
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/video/an;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/an;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->g(I)V

    goto/16 :goto_0
.end method
