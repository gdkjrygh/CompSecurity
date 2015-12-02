.class Lcom/facebook/orca/notify/ah;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/av;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/facebook/orca/notify/ah;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/ah;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/av;
    .locals 13

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/orca/notify/av;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ah;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/notify/as;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/notify/as;

    const-class v3, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/v/a;

    const-class v4, Lcom/facebook/orca/notify/am;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/notify/ah;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/auth/b/b;

    const-class v7, Ljava/lang/String;

    const-class v8, Lcom/facebook/orca/annotations/MessagesForegroundProviderUri;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-class v8, Lcom/facebook/analytics/cn;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/analytics/cn;

    const-class v9, Ljava/lang/Boolean;

    const-class v10, Lcom/facebook/orca/annotations/IsSmsNotifyEnabled;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/orca/notify/ah;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    const-class v10, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/push/c2dm/y;

    const-class v11, Lcom/facebook/i/a/a/f;

    const-class v12, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v11, v12}, Lcom/facebook/orca/notify/ah;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/i/a/a/f;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/orca/notify/av;-><init>(Landroid/content/Context;Lcom/facebook/orca/notify/as;Lcom/facebook/common/v/a;Ljava/util/Set;Lcom/facebook/common/executors/a;Lcom/facebook/auth/b/b;Ljava/lang/String;Lcom/facebook/analytics/cn;Ljavax/inject/a;Lcom/facebook/push/c2dm/y;Lcom/facebook/i/a/a/f;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/facebook/orca/notify/ah;->a()Lcom/facebook/orca/notify/av;

    move-result-object v0

    return-object v0
.end method
