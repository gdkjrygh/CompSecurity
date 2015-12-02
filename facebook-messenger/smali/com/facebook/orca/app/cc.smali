.class Lcom/facebook/orca/app/cc;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/l/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1365
    iput-object p1, p0, Lcom/facebook/orca/app/cc;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1365
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cc;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/l/k;
    .locals 12

    .prologue
    .line 1369
    new-instance v0, Lcom/facebook/l/k;

    invoke-virtual {p0}, Lcom/facebook/orca/app/cc;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/push/mqtt/v;

    const-class v3, Lcom/facebook/user/e;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cc;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/IsPresenceEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/app/cc;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Lcom/google/common/d/a/u;

    const-class v7, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/common/d/a/u;

    const-class v7, Ljava/util/concurrent/Executor;

    const-class v8, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/Executor;

    const-class v8, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/prefs/shared/d;

    const-class v9, Landroid/support/v4/a/e;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/app/cc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/support/v4/a/e;

    const-class v10, Ljava/lang/Boolean;

    const-class v11, Lcom/facebook/orca/annotations/IsMusicPresenceEnabled;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/orca/app/cc;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/facebook/l/k;-><init>(Landroid/content/Context;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/common/executors/a;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/prefs/shared/d;Landroid/support/v4/a/e;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1365
    invoke-virtual {p0}, Lcom/facebook/orca/app/cc;->a()Lcom/facebook/l/k;

    move-result-object v0

    return-object v0
.end method
