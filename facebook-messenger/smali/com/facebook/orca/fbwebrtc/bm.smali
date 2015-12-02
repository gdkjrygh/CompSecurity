.class Lcom/facebook/orca/fbwebrtc/bm;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 383
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bm;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bm;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->c(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/media/MediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bm;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->c(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 389
    :cond_0
    return-void
.end method
