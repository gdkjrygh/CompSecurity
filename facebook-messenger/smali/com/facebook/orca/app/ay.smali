.class Lcom/facebook/orca/app/ay;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/l/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1701
    iput-object p1, p0, Lcom/facebook/orca/app/ay;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1701
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ay;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/l/a;
    .locals 22

    .prologue
    .line 1705
    new-instance v3, Lcom/facebook/orca/l/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    const-class v5, Lcom/facebook/common/executors/DefaultExecutorService;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ExecutorService;

    const-class v5, Lcom/facebook/auth/viewercontext/e;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/auth/viewercontext/e;

    const-class v6, Lcom/facebook/contacts/data/l;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/contacts/data/l;

    const-class v7, Lcom/facebook/orca/f/g;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/f/g;

    const-class v8, Lcom/facebook/orca/f/i;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/f/i;

    const-class v9, Lcom/facebook/orca/app/g;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/app/g;

    const-class v10, Lcom/facebook/orca/notify/av;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/notify/av;

    const-class v11, Lcom/facebook/orca/f/z;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/orca/f/z;

    const-class v12, Lcom/facebook/orca/prefs/av;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/prefs/av;

    const-class v13, Lcom/facebook/orca/prefs/b;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/orca/prefs/b;

    const-class v14, Lcom/facebook/orca/f/l;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/orca/f/l;

    const-class v15, Lcom/facebook/orca/threads/g;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/orca/threads/g;

    const-class v16, Lcom/facebook/orca/f/r;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/orca/app/ay;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/orca/f/r;

    const-class v17, Ljava/lang/Boolean;

    const-class v18, Lcom/facebook/orca/annotations/IsMergeThreadsEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/app/ay;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v17

    const-class v18, Ljava/lang/Boolean;

    const-class v19, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/app/ay;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v18

    const-class v19, Ljava/lang/Boolean;

    const-class v20, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/app/ay;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v19

    const-class v20, Lcom/facebook/orca/threads/FolderName;

    const-class v21, Lcom/facebook/orca/annotations/CurrentFolder;

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/app/ay;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v20

    invoke-direct/range {v3 .. v20}, Lcom/facebook/orca/l/a;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/contacts/data/l;Lcom/facebook/orca/f/g;Lcom/facebook/orca/f/i;Lcom/facebook/orca/app/g;Lcom/facebook/orca/notify/av;Lcom/facebook/orca/f/z;Lcom/facebook/orca/prefs/av;Lcom/facebook/orca/prefs/b;Lcom/facebook/orca/f/l;Lcom/facebook/orca/threads/g;Lcom/facebook/orca/f/r;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1701
    invoke-virtual {p0}, Lcom/facebook/orca/app/ay;->a()Lcom/facebook/orca/l/a;

    move-result-object v0

    return-object v0
.end method
