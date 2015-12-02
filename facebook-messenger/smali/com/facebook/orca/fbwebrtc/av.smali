.class Lcom/facebook/orca/fbwebrtc/av;
.super Lcom/facebook/inject/d;
.source "WebrtcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/fbwebrtc/bb;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/ai;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/av;->a:Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/fbwebrtc/ai;Lcom/facebook/orca/fbwebrtc/aj;)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/av;-><init>(Lcom/facebook/orca/fbwebrtc/ai;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/fbwebrtc/bb;
    .locals 20

    .prologue
    .line 156
    new-instance v3, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/av;->e()Lcom/facebook/inject/ab;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    invoke-interface {v4, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const-class v5, Lcom/facebook/c/s;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/c/s;

    const-class v6, Lcom/facebook/orca/fbwebrtc/ax;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/fbwebrtc/ax;

    const-class v7, Lcom/facebook/push/mqtt/v;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/push/mqtt/v;

    const-class v8, Lcom/facebook/prefs/shared/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/prefs/shared/d;

    const-class v9, Lcom/facebook/orca/fbwebrtc/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/av;->e()Lcom/facebook/inject/ab;

    move-result-object v10

    const-class v11, Landroid/media/AudioManager;

    invoke-interface {v10, v11}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/media/AudioManager;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/av;->e()Lcom/facebook/inject/ab;

    move-result-object v11

    const-class v12, Landroid/os/Vibrator;

    invoke-interface {v11, v12}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/os/Vibrator;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/av;->e()Lcom/facebook/inject/ab;

    move-result-object v12

    const-class v13, Landroid/telephony/TelephonyManager;

    invoke-interface {v12, v13}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/telephony/TelephonyManager;

    const-class v13, Ljava/util/concurrent/Executor;

    const-class v14, Lcom/facebook/common/executors/ForUiThread;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v14}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/concurrent/Executor;

    const-class v14, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v15, Lcom/facebook/common/executors/ForUiThread;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v15}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v15, Lcom/facebook/common/time/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/common/time/a;

    const-class v16, Lcom/facebook/common/executors/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/common/executors/a;

    const-class v17, Landroid/support/v4/a/e;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/support/v4/a/e;

    const-class v18, Landroid/os/Handler;

    const-class v19, Lcom/facebook/common/executors/ForUiThread;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/av;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroid/os/Handler;

    invoke-direct/range {v3 .. v18}, Lcom/facebook/orca/fbwebrtc/bb;-><init>(Landroid/content/Context;Lcom/facebook/c/s;Lcom/facebook/orca/fbwebrtc/ax;Lcom/facebook/push/mqtt/v;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/fbwebrtc/a;Landroid/media/AudioManager;Landroid/os/Vibrator;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/time/a;Lcom/facebook/common/executors/a;Landroid/support/v4/a/e;Landroid/os/Handler;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/av;->a()Lcom/facebook/orca/fbwebrtc/bb;

    move-result-object v0

    return-object v0
.end method
