.class Lcom/facebook/orca/fbwebrtc/bh;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:J

.field final synthetic c:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;ZJ)V
    .locals 0

    .prologue
    .line 755
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bh;->c:Lcom/facebook/orca/fbwebrtc/bb;

    iput-boolean p2, p0, Lcom/facebook/orca/fbwebrtc/bh;->a:Z

    iput-wide p3, p0, Lcom/facebook/orca/fbwebrtc/bh;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 757
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bh;->c:Lcom/facebook/orca/fbwebrtc/bb;

    iget-boolean v1, p0, Lcom/facebook/orca/fbwebrtc/bh;->a:Z

    iget-wide v2, p0, Lcom/facebook/orca/fbwebrtc/bh;->b:J

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;ZJ)V

    .line 758
    return-void
.end method
