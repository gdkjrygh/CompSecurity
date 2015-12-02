.class Lcom/facebook/orca/fbwebrtc/ar;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/ag;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ar;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 108
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/ar;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/ag;
    .locals 14

    .prologue
    .line 112
    new-instance v0, Lcom/facebook/orca/fbwebrtc/ag;

    const-class v1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    const-class v2, Landroid/support/v4/a/e;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/a/e;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/breakpad/BreakpadManager;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/breakpad/BreakpadManager;

    const-class v5, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/push/mqtt/v;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/IsVoipEnabledForUser;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/fbwebrtc/ar;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/orca/annotations/IsVoipWifiCallingOnly;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/fbwebrtc/ar;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Lcom/facebook/orca/fbwebrtc/az;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/fbwebrtc/az;

    const-class v9, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/fbwebrtc/bb;

    const-class v10, Lcom/facebook/orca/fbwebrtc/n;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/fbwebrtc/n;

    const-class v11, Lcom/facebook/orca/fbwebrtc/ae;

    invoke-virtual {p0, v11}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/orca/fbwebrtc/ae;

    const-class v12, Lcom/facebook/e/c;

    invoke-virtual {p0, v12}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/e/c;

    const-class v13, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v13}, Lcom/facebook/orca/fbwebrtc/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct/range {v0 .. v13}, Lcom/facebook/orca/fbwebrtc/ag;-><init>(Landroid/telephony/TelephonyManager;Landroid/support/v4/a/e;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/breakpad/BreakpadManager;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/fbwebrtc/az;Lcom/facebook/orca/fbwebrtc/bb;Lcom/facebook/orca/fbwebrtc/n;Lcom/facebook/orca/fbwebrtc/ae;Lcom/facebook/e/c;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ar;->a()Lcom/facebook/orca/fbwebrtc/ag;

    move-result-object v0

    return-object v0
.end method
