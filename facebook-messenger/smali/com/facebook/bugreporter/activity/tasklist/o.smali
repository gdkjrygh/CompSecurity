.class Lcom/facebook/bugreporter/activity/tasklist/o;
.super Lcom/facebook/inject/d;
.source "TaskListModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/tasklist/j;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/o;->a:Lcom/facebook/bugreporter/activity/tasklist/j;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/o;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/activity/tasklist/c;
    .locals 5

    .prologue
    .line 33
    new-instance v3, Lcom/facebook/bugreporter/activity/tasklist/c;

    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    const-class v1, Lcom/facebook/bugreporter/activity/tasklist/e;

    invoke-virtual {p0, v1}, Lcom/facebook/bugreporter/activity/tasklist/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/bugreporter/activity/tasklist/e;

    const-class v2, Lcom/google/common/d/a/u;

    const-class v4, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/bugreporter/activity/tasklist/o;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/d/a/u;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/bugreporter/activity/tasklist/c;-><init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/bugreporter/activity/tasklist/e;Lcom/google/common/d/a/u;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/o;->a()Lcom/facebook/bugreporter/activity/tasklist/c;

    move-result-object v0

    return-object v0
.end method
