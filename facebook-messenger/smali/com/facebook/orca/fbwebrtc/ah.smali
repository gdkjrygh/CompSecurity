.class Lcom/facebook/orca/fbwebrtc/ah;
.super Ljava/lang/Object;
.source "WebrtcManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ag;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/ag;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ah;->a:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ah;->a:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/orca/fbwebrtc/ag;)V

    .line 353
    return-void
.end method
