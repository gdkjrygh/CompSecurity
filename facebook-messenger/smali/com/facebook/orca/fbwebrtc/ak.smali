.class Lcom/facebook/orca/fbwebrtc/ak;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ak;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/ak;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/a;
    .locals 4

    .prologue
    .line 145
    new-instance v3, Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ak;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/os/PowerManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ak;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/net/wifi/WifiManager;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    const-class v2, Lcom/facebook/e/c;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/fbwebrtc/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/e/c;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/a;-><init>(Landroid/os/PowerManager;Landroid/net/wifi/WifiManager;Lcom/facebook/e/c;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 141
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ak;->a()Lcom/facebook/orca/fbwebrtc/a;

    move-result-object v0

    return-object v0
.end method
