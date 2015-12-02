.class Lcom/facebook/orca/fbwebrtc/bk;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 368
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bk;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    .line 371
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bk;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->d(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 372
    const/4 v0, 0x1

    return v0
.end method
