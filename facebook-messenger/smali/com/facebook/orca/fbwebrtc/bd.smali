.class Lcom/facebook/orca/fbwebrtc/bd;
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
    .line 617
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bd;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 619
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bd;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->i(Lcom/facebook/orca/fbwebrtc/bb;)V

    .line 620
    return-void
.end method
