.class Lcom/facebook/orca/fbwebrtc/am;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/am;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 226
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/am;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/l;
    .locals 4

    .prologue
    .line 231
    new-instance v3, Lcom/facebook/orca/fbwebrtc/l;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/fbwebrtc/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/fbwebrtc/bb;

    const-class v2, Lcom/facebook/c/s;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/fbwebrtc/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/c/s;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/l;-><init>(Landroid/content/Context;Lcom/facebook/orca/fbwebrtc/bb;Lcom/facebook/c/s;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 226
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/am;->a()Lcom/facebook/orca/fbwebrtc/l;

    move-result-object v0

    return-object v0
.end method
