.class Lcom/facebook/orca/fbwebrtc/at;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/ax;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/at;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 184
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/at;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/ax;
    .locals 4

    .prologue
    .line 189
    new-instance v2, Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/at;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/at;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v3, Landroid/app/NotificationManager;

    invoke-interface {v1, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/fbwebrtc/ax;-><init>(Landroid/content/Context;Landroid/app/NotificationManager;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/at;->a()Lcom/facebook/orca/fbwebrtc/ax;

    move-result-object v0

    return-object v0
.end method
