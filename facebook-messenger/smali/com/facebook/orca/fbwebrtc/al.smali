.class Lcom/facebook/orca/fbwebrtc/al;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/al;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 209
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/al;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/i;
    .locals 10

    .prologue
    .line 214
    new-instance v0, Lcom/facebook/orca/fbwebrtc/i;

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/s;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/push/mqtt/v;

    const-class v4, Lcom/facebook/orca/fbwebrtc/ae;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/fbwebrtc/ae;

    const-class v5, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/fbwebrtc/ag;

    const-class v6, Lcom/facebook/e/c;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/fbwebrtc/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/e/c;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/orca/annotations/IsVoipShowFreeCallDisclaimer;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/fbwebrtc/al;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/orca/annotations/IsVoipWifiCallingOnly;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/fbwebrtc/al;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/fbwebrtc/i;-><init>(Lcom/facebook/c/s;Lcom/facebook/prefs/shared/d;Lcom/facebook/push/mqtt/v;Lcom/facebook/orca/fbwebrtc/ae;Lcom/facebook/orca/fbwebrtc/ag;Lcom/facebook/e/c;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 209
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/al;->a()Lcom/facebook/orca/fbwebrtc/i;

    move-result-object v0

    return-object v0
.end method
