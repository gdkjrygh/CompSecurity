.class Lcom/facebook/orca/fbwebrtc/bg;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;Z)V
    .locals 0

    .prologue
    .line 737
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bg;->b:Lcom/facebook/orca/fbwebrtc/bb;

    iput-boolean p2, p0, Lcom/facebook/orca/fbwebrtc/bg;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 739
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bg;->b:Lcom/facebook/orca/fbwebrtc/bb;

    iget-boolean v1, p0, Lcom/facebook/orca/fbwebrtc/bg;->a:Z

    invoke-static {v0, v1}, Lcom/facebook/orca/fbwebrtc/bb;->b(Lcom/facebook/orca/fbwebrtc/bb;Z)V

    .line 740
    return-void
.end method
