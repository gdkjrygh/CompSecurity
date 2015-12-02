.class Lcom/facebook/contacts/s;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/service/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 587
    iput-object p1, p0, Lcom/facebook/contacts/s;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 587
    invoke-direct {p0, p1}, Lcom/facebook/contacts/s;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/service/c;
    .locals 21

    .prologue
    .line 591
    new-instance v2, Lcom/facebook/contacts/service/c;

    const-class v3, Lcom/facebook/http/protocol/aq;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/facebook/contacts/s;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/contacts/g/f;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/g/f;

    const-class v5, Lcom/facebook/contacts/g/j;

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/g/j;

    const-class v6, Lcom/facebook/contacts/g/h;

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/contacts/g/h;

    const-class v7, Lcom/facebook/contacts/g/b;

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/contacts/g/b;

    const-class v8, Lcom/facebook/contacts/g/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/contacts/g/a;

    const-class v9, Lcom/facebook/contacts/g/d;

    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/contacts/g/d;

    const-class v10, Lcom/facebook/contacts/g/e;

    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/contacts/g/e;

    const-class v11, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    const-class v12, Lcom/facebook/contacts/service/a;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/contacts/service/a;

    const-class v13, Lcom/facebook/contacts/a/b;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/contacts/a/b;

    const-class v14, Lcom/facebook/contacts/data/l;

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/contacts/data/l;

    const-class v15, Lcom/facebook/contacts/data/m;

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/facebook/contacts/data/m;

    const-class v16, Lcom/facebook/contacts/data/b;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/facebook/contacts/data/b;

    const-class v17, Lcom/facebook/base/broadcast/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/facebook/base/broadcast/a;

    const-class v18, Lcom/facebook/contacts/data/k;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/facebook/contacts/data/k;

    const-class v19, Lcom/facebook/common/time/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/facebook/common/time/a;

    const-class v20, Lcom/facebook/analytics/a;

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/facebook/analytics/a;

    invoke-direct/range {v2 .. v20}, Lcom/facebook/contacts/service/c;-><init>(Ljavax/inject/a;Lcom/facebook/contacts/g/f;Lcom/facebook/contacts/g/j;Lcom/facebook/contacts/g/h;Lcom/facebook/contacts/g/b;Lcom/facebook/contacts/g/a;Lcom/facebook/contacts/g/d;Lcom/facebook/contacts/g/e;Lcom/facebook/contacts/database/AddressBookPeriodicRunner;Lcom/facebook/contacts/service/a;Lcom/facebook/contacts/a/b;Lcom/facebook/contacts/data/l;Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/data/b;Lcom/facebook/base/broadcast/a;Lcom/facebook/contacts/data/k;Lcom/facebook/common/time/a;Lcom/facebook/analytics/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 587
    invoke-virtual {p0}, Lcom/facebook/contacts/s;->a()Lcom/facebook/contacts/service/c;

    move-result-object v0

    return-object v0
.end method
