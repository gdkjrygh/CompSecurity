.class Lcom/facebook/orca/fbwebrtc/ao;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ao;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 195
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/ao;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/n;
    .locals 7

    .prologue
    .line 199
    new-instance v0, Lcom/facebook/orca/fbwebrtc/n;

    const-class v1, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/fbwebrtc/ao;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsVoipWifiCallingOnly;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/fbwebrtc/ao;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsVoipP2PDisabledForUser;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/fbwebrtc/ao;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/ShouldSendIceAfterAnswer;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/fbwebrtc/ao;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/orca/fbwebrtc/m;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/fbwebrtc/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/fbwebrtc/m;

    const-class v6, Lcom/facebook/e/c;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/fbwebrtc/ao;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/e/c;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/fbwebrtc/n;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/fbwebrtc/m;Lcom/facebook/e/c;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 195
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ao;->a()Lcom/facebook/orca/fbwebrtc/n;

    move-result-object v0

    return-object v0
.end method
