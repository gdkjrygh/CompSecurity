.class Lcom/facebook/orca/fbwebrtc/bc;
.super Landroid/telephony/PhoneStateListener;
.source "WebrtcUiHandler.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/bb;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bc;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bc;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    .line 134
    if-eqz p1, :cond_0

    .line 135
    const/4 v0, 0x1

    .line 137
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bc;->a:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-static {v1}, Lcom/facebook/orca/fbwebrtc/bb;->b(Lcom/facebook/orca/fbwebrtc/bb;)Lcom/facebook/orca/fbwebrtc/ag;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/fbwebrtc/ag;->a(Z)V

    .line 138
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 139
    return-void
.end method
