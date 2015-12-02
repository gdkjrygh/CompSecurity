.class Lcom/facebook/orca/protocol/ai;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 456
    iput-object p1, p0, Lcom/facebook/orca/protocol/ai;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 456
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/ai;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/a;
    .locals 38

    .prologue
    .line 460
    new-instance v3, Lcom/facebook/orca/protocol/a;

    const-class v4, Lcom/facebook/http/protocol/i;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/http/protocol/i;

    const-class v5, Lcom/facebook/orca/protocol/methods/n;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/protocol/methods/n;

    const-class v6, Lcom/facebook/orca/protocol/methods/l;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/protocol/methods/l;

    const-class v7, Lcom/facebook/orca/protocol/methods/j;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/protocol/methods/j;

    const-class v8, Lcom/facebook/orca/protocol/methods/o;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/protocol/methods/o;

    const-class v9, Lcom/facebook/orca/protocol/methods/s;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/protocol/methods/s;

    const-class v10, Lcom/facebook/orca/protocol/methods/i;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/protocol/methods/i;

    const-class v11, Lcom/facebook/orca/protocol/methods/al;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/orca/protocol/methods/al;

    const-class v12, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    const-class v13, Lcom/facebook/orca/protocol/methods/k;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/orca/protocol/methods/k;

    const-class v14, Lcom/facebook/orca/protocol/methods/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/orca/protocol/methods/a;

    const-class v15, Lcom/facebook/orca/protocol/methods/e;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/orca/protocol/methods/e;

    const-class v16, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    const-class v17, Lcom/facebook/orca/protocol/methods/ab;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/facebook/orca/protocol/methods/ab;

    const-class v18, Lcom/facebook/orca/protocol/methods/af;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/facebook/orca/protocol/methods/af;

    const-class v19, Lcom/facebook/orca/protocol/methods/w;

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/facebook/orca/protocol/methods/w;

    const-class v20, Lcom/facebook/orca/protocol/methods/h;

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/facebook/orca/protocol/methods/h;

    const-class v21, Lcom/facebook/orca/protocol/methods/g;

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/facebook/orca/protocol/methods/g;

    const-class v22, Lcom/facebook/orca/protocol/methods/ay;

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/facebook/orca/protocol/methods/ay;

    const-class v23, Lcom/facebook/orca/protocol/methods/aw;

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Lcom/facebook/orca/protocol/methods/aw;

    const-class v24, Lcom/facebook/orca/protocol/methods/v;

    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Lcom/facebook/orca/protocol/methods/v;

    const-class v25, Lcom/facebook/orca/protocol/methods/ax;

    move-object/from16 v0, p0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lcom/facebook/orca/protocol/methods/ax;

    const-class v26, Lcom/facebook/orca/protocol/methods/ao;

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lcom/facebook/orca/protocol/methods/ao;

    const-class v27, Lcom/facebook/orca/protocol/methods/az;

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Lcom/facebook/orca/protocol/methods/az;

    const-class v28, Lcom/facebook/orca/protocol/methods/ae;

    move-object/from16 v0, p0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Lcom/facebook/orca/protocol/methods/ae;

    const-class v29, Lcom/facebook/analytics/cn;

    move-object/from16 v0, p0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v29

    check-cast v29, Lcom/facebook/analytics/cn;

    const-class v30, Lcom/facebook/push/mqtt/bx;

    move-object/from16 v0, p0

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Lcom/facebook/push/mqtt/bx;

    const-class v31, Lcom/facebook/orca/a/j;

    move-object/from16 v0, p0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v31

    const-class v32, Lcom/facebook/common/time/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v32

    check-cast v32, Lcom/facebook/common/time/a;

    const-class v33, Lcom/facebook/ui/media/b/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Lcom/facebook/ui/media/b/a;

    const-class v34, Lcom/facebook/orca/j/c;

    move-object/from16 v0, p0

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v34

    check-cast v34, Lcom/facebook/orca/j/c;

    const-class v35, Lcom/facebook/orca/photos/b/k;

    move-object/from16 v0, p0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v35

    check-cast v35, Lcom/facebook/orca/photos/b/k;

    const-class v36, Ljava/lang/Boolean;

    const-class v37, Lcom/facebook/orca/annotations/IsNewPhotoUploadEnabled;

    move-object/from16 v0, p0

    move-object/from16 v1, v36

    move-object/from16 v2, v37

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/protocol/ai;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v36

    invoke-direct/range {v3 .. v36}, Lcom/facebook/orca/protocol/a;-><init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/n;Lcom/facebook/orca/protocol/methods/l;Lcom/facebook/orca/protocol/methods/j;Lcom/facebook/orca/protocol/methods/o;Lcom/facebook/orca/protocol/methods/s;Lcom/facebook/orca/protocol/methods/i;Lcom/facebook/orca/protocol/methods/al;Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;Lcom/facebook/orca/protocol/methods/k;Lcom/facebook/orca/protocol/methods/a;Lcom/facebook/orca/protocol/methods/e;Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;Lcom/facebook/orca/protocol/methods/ab;Lcom/facebook/orca/protocol/methods/af;Lcom/facebook/orca/protocol/methods/w;Lcom/facebook/orca/protocol/methods/h;Lcom/facebook/orca/protocol/methods/g;Lcom/facebook/orca/protocol/methods/ay;Lcom/facebook/orca/protocol/methods/aw;Lcom/facebook/orca/protocol/methods/v;Lcom/facebook/orca/protocol/methods/ax;Lcom/facebook/orca/protocol/methods/ao;Lcom/facebook/orca/protocol/methods/az;Lcom/facebook/orca/protocol/methods/ae;Lcom/facebook/analytics/cn;Lcom/facebook/push/mqtt/bx;Ljavax/inject/a;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/b/a;Lcom/facebook/orca/j/c;Lcom/facebook/orca/photos/b/k;Ljavax/inject/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 456
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/ai;->a()Lcom/facebook/orca/protocol/a;

    move-result-object v0

    return-object v0
.end method
