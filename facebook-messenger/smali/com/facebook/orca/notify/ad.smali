.class Lcom/facebook/orca/notify/ad;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 199
    iput-object p1, p0, Lcom/facebook/orca/notify/ad;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 199
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/ad;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/j;
    .locals 12

    .prologue
    .line 204
    new-instance v0, Lcom/facebook/orca/notify/j;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsInAppNotificationsEnabled;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/notify/ad;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/a/a;

    const-class v3, Lcom/facebook/orca/emoji/z;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/emoji/z;

    const-class v4, Lcom/facebook/orca/threadview/do;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/threadview/do;

    const-class v5, Lcom/facebook/orca/threads/r;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/threads/r;

    const-class v6, Ljava/util/concurrent/ExecutorService;

    const-class v7, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ExecutorService;

    const-class v7, Ljava/util/concurrent/ExecutorService;

    const-class v8, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/ExecutorService;

    const-class v8, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/v/f;

    const-class v9, Lcom/facebook/i/a/a/f;

    const-class v10, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/i/a/a/f;

    const-class v10, Landroid/content/ComponentName;

    const-class v11, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/ComponentName;

    const-class v11, Lcom/facebook/b/a/b;

    invoke-virtual {p0, v11}, Lcom/facebook/orca/notify/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/b/a/b;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/orca/notify/j;-><init>(Ljavax/inject/a;Lcom/facebook/config/a/a;Lcom/facebook/orca/emoji/z;Lcom/facebook/orca/threadview/do;Lcom/facebook/orca/threads/r;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lcom/facebook/common/v/f;Lcom/facebook/i/a/a/f;Landroid/content/ComponentName;Lcom/facebook/b/a/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0}, Lcom/facebook/orca/notify/ad;->a()Lcom/facebook/orca/notify/j;

    move-result-object v0

    return-object v0
.end method
