.class Lcom/facebook/orca/fbwebrtc/as;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/aw;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/as;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 238
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/as;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/aw;
    .locals 2

    .prologue
    .line 243
    new-instance v1, Lcom/facebook/orca/fbwebrtc/aw;

    const-class v0, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-direct {v1, v0}, Lcom/facebook/orca/fbwebrtc/aw;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 238
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/as;->a()Lcom/facebook/orca/fbwebrtc/aw;

    move-result-object v0

    return-object v0
.end method
