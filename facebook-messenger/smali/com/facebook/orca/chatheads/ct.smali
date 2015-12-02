.class Lcom/facebook/orca/chatheads/ct;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/al;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ct;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ct;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/al;
    .locals 23

    .prologue
    .line 156
    new-instance v3, Lcom/facebook/orca/chatheads/al;

    const-class v4, Landroid/content/Context;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const-class v5, Lcom/facebook/orca/chatheads/ae;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/chatheads/ct;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/prefs/shared/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Lcom/facebook/c/s;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/c/s;

    const-class v8, Landroid/view/WindowManager;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/WindowManager;

    const-class v9, Landroid/os/PowerManager;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/os/PowerManager;

    const-class v10, Lcom/facebook/common/hardware/q;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/common/hardware/q;

    const-class v11, Landroid/app/KeyguardManager;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/app/KeyguardManager;

    const-class v12, Lcom/facebook/orca/f/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/f/a;

    const-class v13, Lcom/facebook/orca/chatheads/by;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/orca/chatheads/by;

    const-class v14, Lcom/facebook/orca/threads/q;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/orca/threads/q;

    const-class v15, Lcom/facebook/common/executors/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/common/executors/a;

    const-class v16, Lcom/facebook/n/j;

    const-class v17, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/n/j;

    const-class v17, Lcom/facebook/orca/chatheads/eb;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/facebook/orca/chatheads/eb;

    const-class v18, Lcom/facebook/orca/chatheads/b/k;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/facebook/orca/chatheads/b/k;

    const-class v19, Lcom/facebook/i/a/a/f;

    const-class v20, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/facebook/i/a/a/f;

    const-class v20, Landroid/content/ComponentName;

    const-class v21, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Landroid/content/ComponentName;

    const-class v21, Lcom/facebook/common/e/h;

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/facebook/common/e/h;

    const-class v22, Lcom/facebook/orca/chatheads/cz;

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ct;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/facebook/orca/chatheads/cz;

    invoke-direct/range {v3 .. v22}, Lcom/facebook/orca/chatheads/al;-><init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;Landroid/view/WindowManager;Landroid/os/PowerManager;Lcom/facebook/common/hardware/q;Landroid/app/KeyguardManager;Lcom/facebook/orca/f/a;Lcom/facebook/orca/chatheads/by;Lcom/facebook/orca/threads/q;Lcom/facebook/common/executors/a;Lcom/facebook/n/j;Lcom/facebook/orca/chatheads/eb;Lcom/facebook/orca/chatheads/b/k;Lcom/facebook/i/a/a/f;Landroid/content/ComponentName;Lcom/facebook/common/e/h;Lcom/facebook/orca/chatheads/cz;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ct;->a()Lcom/facebook/orca/chatheads/al;

    move-result-object v0

    return-object v0
.end method
