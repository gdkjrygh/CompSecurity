.class Lcom/facebook/orca/fbwebrtc/bl;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 376
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bl;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bl;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->d(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 380
    return-void
.end method
