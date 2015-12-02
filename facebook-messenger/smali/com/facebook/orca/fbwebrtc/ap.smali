.class Lcom/facebook/orca/fbwebrtc/ap;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/ae;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ap;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 175
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/ap;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/ae;
    .locals 2

    .prologue
    .line 179
    new-instance v1, Lcom/facebook/orca/fbwebrtc/ae;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    invoke-direct {v1, v0}, Lcom/facebook/orca/fbwebrtc/ae;-><init>(Lcom/facebook/analytics/av;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 175
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ap;->a()Lcom/facebook/orca/fbwebrtc/ae;

    move-result-object v0

    return-object v0
.end method
