.class Lcom/facebook/bugreporter/t;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/bugreporter/t;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/t;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/g;
    .locals 12

    .prologue
    .line 87
    new-instance v0, Lcom/facebook/bugreporter/g;

    const-class v1, Landroid/content/res/Resources;

    invoke-virtual {p0, v1}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    const-class v2, Lcom/google/common/d/a/u;

    const-class v3, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/d/a/u;

    const-class v3, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/bugreporter/m;

    invoke-virtual {p0, v4}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/bugreporter/m;

    const-class v5, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v5}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/e/h;

    const-class v6, Lcom/facebook/bugreporter/l;

    invoke-virtual {p0, v6}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/bugreporter/l;

    const-class v7, Lcom/facebook/bugreporter/c;

    invoke-virtual {p0, v7}, Lcom/facebook/bugreporter/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v7

    const-class v8, Lcom/facebook/bugreporter/z;

    invoke-virtual {p0, v8}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/bugreporter/z;

    const-class v9, Lcom/facebook/ui/i/g;

    invoke-virtual {p0, v9}, Lcom/facebook/bugreporter/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/ui/i/g;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/t;->e()Lcom/facebook/inject/ab;

    move-result-object v10

    const-class v11, Landroid/net/ConnectivityManager;

    invoke-interface {v10, v11}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/net/ConnectivityManager;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/bugreporter/g;-><init>(Landroid/content/res/Resources;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/bugreporter/m;Lcom/facebook/common/e/h;Lcom/facebook/bugreporter/l;Ljava/util/Set;Lcom/facebook/bugreporter/z;Lcom/facebook/ui/i/g;Landroid/net/ConnectivityManager;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/facebook/bugreporter/t;->a()Lcom/facebook/bugreporter/g;

    move-result-object v0

    return-object v0
.end method
