.class final Lcom/roidapp/photogrid/video/ao;
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
    .line 854
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/ao;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 858
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 859
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ao;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->h(I)V

    .line 860
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 861
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 862
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->C(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    .line 863
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ao;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->y(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 864
    return-void
.end method
