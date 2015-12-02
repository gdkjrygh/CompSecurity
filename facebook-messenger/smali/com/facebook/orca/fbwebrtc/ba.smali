.class Lcom/facebook/orca/fbwebrtc/ba;
.super Lcom/facebook/fbservice/ops/ac;
.source "WebrtcSignalingHandler.java"


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/orca/fbwebrtc/az;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/az;J)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ba;->b:Lcom/facebook/orca/fbwebrtc/az;

    iput-wide p2, p0, Lcom/facebook/orca/fbwebrtc/ba;->a:J

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 6

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ba;->b:Lcom/facebook/orca/fbwebrtc/az;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/az;->a(Lcom/facebook/orca/fbwebrtc/az;)Lcom/facebook/orca/fbwebrtc/ag;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/fbwebrtc/ba;->a:J

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "GRAPH"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;ILjava/lang/String;)V

    .line 96
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ba;->b:Lcom/facebook/orca/fbwebrtc/az;

    invoke-static {v0, p1}, Lcom/facebook/orca/fbwebrtc/az;->a(Lcom/facebook/orca/fbwebrtc/az;Lcom/facebook/fbservice/service/ServiceException;)I

    move-result v4

    .line 100
    invoke-static {}, Lcom/facebook/orca/fbwebrtc/az;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Failed to send message to peer. errorCode=%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ba;->b:Lcom/facebook/orca/fbwebrtc/az;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/az;->a(Lcom/facebook/orca/fbwebrtc/az;)Lcom/facebook/orca/fbwebrtc/ag;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/fbwebrtc/ba;->a:J

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v5, "GRAPH"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;ILjava/lang/String;)V

    .line 102
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 92
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/fbwebrtc/ba;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
