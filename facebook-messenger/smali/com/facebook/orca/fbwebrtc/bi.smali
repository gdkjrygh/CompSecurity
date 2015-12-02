.class Lcom/facebook/orca/fbwebrtc/bi;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 788
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 792
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->k(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v1}, Lcom/facebook/orca/fbwebrtc/bb;->j(Lcom/facebook/orca/fbwebrtc/bb;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 793
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->l(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 794
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->k(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bi;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v1}, Lcom/facebook/orca/fbwebrtc/bb;->j(Lcom/facebook/orca/fbwebrtc/bb;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 795
    return-void
.end method
