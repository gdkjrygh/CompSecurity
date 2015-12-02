.class Lcom/facebook/orca/fbwebrtc/au;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/az;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/au;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 129
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/au;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/az;
    .locals 5

    .prologue
    .line 133
    new-instance v3, Lcom/facebook/orca/fbwebrtc/az;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v1, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/fbwebrtc/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/ops/k;

    const-class v2, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/fbwebrtc/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/push/mqtt/v;

    const-class v4, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/fbwebrtc/au;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/facebook/orca/fbwebrtc/az;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/fbservice/ops/k;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 129
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/au;->a()Lcom/facebook/orca/fbwebrtc/az;

    move-result-object v0

    return-object v0
.end method
