.class Lcom/facebook/orca/fbwebrtc/bp;
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
    .line 547
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bp;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bp;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->h(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 550
    return-void
.end method
