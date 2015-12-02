.class Lcom/facebook/analytics/o;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/bt;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 232
    iput-object p1, p0, Lcom/facebook/analytics/o;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 232
    invoke-direct {p0, p1}, Lcom/facebook/analytics/o;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/bt;
    .locals 20

    .prologue
    .line 236
    new-instance v3, Lcom/facebook/analytics/bt;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/analytics/o;->e()Lcom/facebook/inject/ab;

    move-result-object v4

    const-class v5, Landroid/content/Context;

    invoke-interface {v4, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/analytics/o;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/analytics/ak;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/ak;

    const-class v7, Lcom/facebook/common/executors/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/executors/a;

    const-class v8, Ljava/util/concurrent/ExecutorService;

    const-class v9, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v9}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ExecutorService;

    const-class v9, Lcom/facebook/common/process/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/common/process/d;

    const-class v10, Lcom/facebook/analytics/a/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/analytics/a/a;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/analytics/o;->e()Lcom/facebook/inject/ab;

    move-result-object v11

    const-class v12, Landroid/os/PowerManager;

    invoke-interface {v11, v12}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/os/PowerManager;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/analytics/o;->e()Lcom/facebook/inject/ab;

    move-result-object v12

    const-class v13, Landroid/app/AlarmManager;

    invoke-interface {v12, v13}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/app/AlarmManager;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/analytics/o;->e()Lcom/facebook/inject/ab;

    move-result-object v13

    const-class v14, Landroid/view/WindowManager;

    invoke-interface {v13, v14}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/WindowManager;

    const-class v14, Lcom/facebook/common/time/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/common/time/a;

    const-class v15, Ljava/lang/Boolean;

    const-class v16, Lcom/facebook/analytics/module/IsPeriodicDeviceStatusEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v15, v1}, Lcom/facebook/analytics/o;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v15

    const-class v16, Ljava/lang/Boolean;

    const-class v17, Lcom/facebook/analytics/module/IsTimeSpentBitArrayLoggingEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/o;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v16

    const-class v17, Ljava/lang/Boolean;

    const-class v18, Lcom/facebook/analytics/module/IsOldTimeSpentLoggingEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/o;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v17

    const-class v18, Lcom/facebook/analytics/i/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/facebook/analytics/i/a;

    const-class v19, Lcom/facebook/analytics/g/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/facebook/analytics/g/a;

    invoke-direct/range {v3 .. v19}, Lcom/facebook/analytics/bt;-><init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/analytics/ak;Lcom/facebook/common/executors/a;Ljava/util/concurrent/ExecutorService;Lcom/facebook/common/process/d;Lcom/facebook/analytics/a/a;Landroid/os/PowerManager;Landroid/app/AlarmManager;Landroid/view/WindowManager;Lcom/facebook/common/time/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/analytics/i/a;Lcom/facebook/analytics/g/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 232
    invoke-virtual {p0}, Lcom/facebook/analytics/o;->a()Lcom/facebook/analytics/bt;

    move-result-object v0

    return-object v0
.end method
