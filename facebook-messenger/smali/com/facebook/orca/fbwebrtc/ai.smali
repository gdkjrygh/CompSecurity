.class public Lcom/facebook/orca/fbwebrtc/ai;
.super Lcom/facebook/inject/c;
.source "WebrtcModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 257
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsVoipEnabledForUser;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 54
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsVoipP2PDisabledForUser;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 57
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsVoipShowFreeCallDisclaimer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 60
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsVoipWifiCallingOnly;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/e;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 63
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShouldSendIceAfterAnswer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 66
    const-class v0, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ar;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/ar;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 69
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 71
    const-class v0, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/av;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/av;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 74
    const-class v0, Lcom/facebook/orca/fbwebrtc/az;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/au;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/au;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 77
    const-class v0, Lcom/facebook/orca/fbwebrtc/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ao;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/ao;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 80
    const-class v0, Lcom/facebook/orca/fbwebrtc/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ap;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/ap;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 83
    const-class v0, Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/at;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/at;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 86
    const-class v0, Lcom/facebook/orca/fbwebrtc/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/al;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/al;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 89
    const-class v0, Lcom/facebook/orca/fbwebrtc/l;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/am;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/am;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 92
    const-class v0, Lcom/facebook/orca/fbwebrtc/aw;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/as;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/as;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 94
    const-class v0, Lcom/facebook/push/mqtt/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/aw;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 96
    const-class v0, Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ak;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/ak;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 99
    const-class v0, Lcom/facebook/orca/fbwebrtc/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/an;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/an;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 102
    const-class v0, Lcom/facebook/orca/fbwebrtc/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/fbwebrtc/aq;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/fbwebrtc/aq;-><init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 104
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ai;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/fbwebrtc/af;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 106
    return-void
.end method
