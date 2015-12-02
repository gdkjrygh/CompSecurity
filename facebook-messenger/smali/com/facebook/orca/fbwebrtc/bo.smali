.class Lcom/facebook/orca/fbwebrtc/bo;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;I)V
    .locals 0

    .prologue
    .line 535
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bo;->b:Lcom/facebook/orca/fbwebrtc/bb;

    iput p2, p0, Lcom/facebook/orca/fbwebrtc/bo;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 537
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bo;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->g(Lcom/facebook/orca/fbwebrtc/bb;)Lcom/facebook/webrtc/IWebrtcUiInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 538
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bo;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->g(Lcom/facebook/orca/fbwebrtc/bb;)Lcom/facebook/webrtc/IWebrtcUiInterface;

    move-result-object v0

    iget v1, p0, Lcom/facebook/orca/fbwebrtc/bo;->a:I

    invoke-interface {v0, v1}, Lcom/facebook/webrtc/IWebrtcUiInterface;->handleError(I)V

    .line 540
    :cond_0
    return-void
.end method
