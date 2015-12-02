.class Lcom/facebook/orca/fbwebrtc/z;
.super Ljava/lang/Object;
.source "WebrtcIncallActivity.java"

# interfaces
.implements Lcom/facebook/webrtc/IWebrtcUiInterface;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(I)V
    .locals 0

    .prologue
    .line 213
    return-void
.end method

.method public hideCallUI(IJZ)V
    .locals 3

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;I)Ljava/lang/String;

    move-result-object v0

    .line 244
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    sget-object v2, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-static {v1, v0, v2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 245
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->j(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0, p2, p3}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;J)V

    .line 252
    :goto_0
    return-void

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->finish()V

    goto :goto_0
.end method

.method public showConnectionDetails(ZLjava/lang/String;)V
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->f(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/orca/fbwebrtc/bb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->g(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->h(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    .line 235
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->i(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0, p2, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Ljava/lang/String;Z)V

    .line 239
    return-void
.end method

.method public showOutdatedProtocolAlert(ZJ)V
    .locals 2

    .prologue
    .line 260
    invoke-static {}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->j()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Outgoing call with upgrade alert"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 261
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Z)V

    .line 262
    return-void
.end method

.method public switchToIncomingCallUI(J)V
    .locals 0

    .prologue
    .line 223
    return-void
.end method

.method public switchToRingingUI()V
    .locals 0

    .prologue
    .line 218
    return-void
.end method

.method public switchToStreamingUI()V
    .locals 3

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/z;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    sget v2, Lcom/facebook/o;->webrtc_incall_status_connecting:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/fbwebrtc/ad;->CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 229
    return-void
.end method

.method public updateMuteState(Z)V
    .locals 0

    .prologue
    .line 256
    return-void
.end method
