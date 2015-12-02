.class Lcom/facebook/orca/d/v;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/orca/d/v;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/v;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/e;
    .locals 7

    .prologue
    .line 176
    new-instance v0, Lcom/facebook/orca/d/e;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/d/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/google/common/d/a/u;

    const-class v3, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/d/v;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/d/a/u;

    const-class v3, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/d/v;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/orca/d/ae;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/d/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/d/ae;

    const-class v5, Landroid/os/Handler;

    const-class v6, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/d/v;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Handler;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/d/e;-><init>(Lcom/facebook/common/executors/a;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/orca/d/ae;Landroid/os/Handler;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 172
    invoke-virtual {p0}, Lcom/facebook/orca/d/v;->a()Lcom/facebook/orca/d/e;

    move-result-object v0

    return-object v0
.end method
