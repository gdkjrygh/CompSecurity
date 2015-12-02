.class Lcom/facebook/orca/fbwebrtc/aq;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/aq;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/aq;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/af;
    .locals 2

    .prologue
    .line 252
    new-instance v1, Lcom/facebook/orca/fbwebrtc/af;

    const-class v0, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-direct {v1, v0}, Lcom/facebook/orca/fbwebrtc/af;-><init>(Lcom/facebook/orca/fbwebrtc/ag;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/aq;->a()Lcom/facebook/orca/fbwebrtc/af;

    move-result-object v0

    return-object v0
.end method
