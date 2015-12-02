.class Lcom/facebook/orca/fbwebrtc/aa;
.super Lcom/facebook/fbservice/ops/ac;
.source "WebrtcIncallActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 502
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/aa;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 505
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/aa;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 506
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/aa;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 507
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    .line 511
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/aa;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 512
    invoke-static {}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->j()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Failed to fetch contact %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/aa;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v4}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->k(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 502
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/fbwebrtc/aa;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
