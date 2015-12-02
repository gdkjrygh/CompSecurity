.class Lcom/facebook/orca/app/bk;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/a/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 853
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 853
    invoke-direct {p0}, Lcom/facebook/orca/app/bk;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/d;
    .locals 5

    .prologue
    .line 858
    new-instance v3, Lcom/facebook/orca/a/d;

    const-class v0, Lcom/facebook/abtest/qe/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    const-class v2, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/app/bk;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/a/d;-><init>(Lcom/facebook/abtest/qe/c;Lcom/facebook/common/e/h;Ljava/util/concurrent/Executor;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 853
    invoke-virtual {p0}, Lcom/facebook/orca/app/bk;->a()Lcom/facebook/orca/a/d;

    move-result-object v0

    return-object v0
.end method
