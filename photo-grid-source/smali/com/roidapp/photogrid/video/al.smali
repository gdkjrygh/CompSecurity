.class final Lcom/roidapp/photogrid/video/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

.field final synthetic b:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V
    .locals 0

    .prologue
    .line 773
    iput-object p1, p0, Lcom/roidapp/photogrid/video/al;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/al;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 777
    iget-object v0, p0, Lcom/roidapp/photogrid/video/al;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->license_url:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 778
    iget-object v0, p0, Lcom/roidapp/photogrid/video/al;->b:Lcom/roidapp/photogrid/video/TrackSelector;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    iget-object v3, p0, Lcom/roidapp/photogrid/video/al;->a:Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->license_url:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->startActivity(Landroid/content/Intent;)V

    .line 779
    :cond_0
    return-void
.end method
