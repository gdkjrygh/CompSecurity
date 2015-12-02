.class Lcom/facebook/orca/fbwebrtc/be;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 648
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/be;->c:Lcom/facebook/orca/fbwebrtc/bb;

    iput-boolean p2, p0, Lcom/facebook/orca/fbwebrtc/be;->a:Z

    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/be;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 650
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/be;->c:Lcom/facebook/orca/fbwebrtc/bb;

    iget-boolean v1, p0, Lcom/facebook/orca/fbwebrtc/be;->a:Z

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/be;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;ZLjava/lang/String;)V

    .line 651
    return-void
.end method
