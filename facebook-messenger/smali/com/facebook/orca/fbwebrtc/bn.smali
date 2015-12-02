.class Lcom/facebook/orca/fbwebrtc/bn;
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
    .line 423
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bn;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 426
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bn;->a:Lcom/facebook/orca/fbwebrtc/bb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;Z)Z

    .line 427
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bn;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->e(Lcom/facebook/orca/fbwebrtc/bb;)I

    move-result v0

    if-nez v0, :cond_0

    .line 429
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bn;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->f(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 431
    :cond_0
    return-void
.end method
