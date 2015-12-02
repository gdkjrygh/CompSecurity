.class Lcom/facebook/orca/contacts/picker/bv;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/ad;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bv;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 344
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bv;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/ad;
    .locals 18

    .prologue
    .line 348
    new-instance v2, Lcom/facebook/orca/contacts/divebar/ad;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/contacts/picker/bv;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Landroid/content/Context;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    const-class v4, Lcom/facebook/orca/contacts/divebar/e;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/contacts/divebar/e;

    const-class v5, Lcom/facebook/contacts/a/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/a/d;

    const-class v6, Lcom/facebook/user/e;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/orca/contacts/picker/bv;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Lcom/facebook/orca/g/z;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/orca/contacts/picker/bv;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Lcom/facebook/l/k;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/l/k;

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/contacts/picker/bv;->e()Lcom/facebook/inject/ab;

    move-result-object v9

    const-class v10, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v9, v10}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/fbservice/ops/k;

    const-class v10, Lcom/google/common/d/a/u;

    const-class v11, Lcom/facebook/common/executors/DefaultExecutorService;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10, v11}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/common/d/a/u;

    const-class v11, Ljava/util/concurrent/Executor;

    const-class v12, Lcom/facebook/common/executors/ForUiThread;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11, v12}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/concurrent/Executor;

    const-class v12, Ljava/lang/Boolean;

    const-class v13, Lcom/facebook/orca/annotations/IsPresenceEnabled;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12, v13}, Lcom/facebook/orca/contacts/picker/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v12

    const-class v13, Ljava/lang/Boolean;

    const-class v14, Lcom/facebook/orca/annotations/ShowOtherContactsDivebar;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v14}, Lcom/facebook/orca/contacts/picker/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v13

    const-class v14, Lcom/facebook/user/User;

    const-class v15, Lcom/facebook/auth/annotations/LoggedInUser;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v15}, Lcom/facebook/orca/contacts/picker/bv;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v14

    const-class v15, Lcom/facebook/common/executors/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/common/executors/a;

    const-class v16, Lcom/facebook/contacts/data/k;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/contacts/data/k;

    const-class v17, Lcom/facebook/contacts/data/p;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/bv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/facebook/contacts/data/p;

    invoke-direct/range {v2 .. v17}, Lcom/facebook/orca/contacts/divebar/ad;-><init>(Landroid/content/Context;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/contacts/a/d;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/l/k;Lcom/facebook/fbservice/ops/k;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/common/executors/a;Lcom/facebook/contacts/data/k;Lcom/facebook/contacts/data/p;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 344
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bv;->a()Lcom/facebook/orca/contacts/divebar/ad;

    move-result-object v0

    return-object v0
.end method
