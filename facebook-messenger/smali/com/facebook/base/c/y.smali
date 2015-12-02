.class Lcom/facebook/base/c/y;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/base/a/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 704
    iput-object p1, p0, Lcom/facebook/base/c/y;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 704
    invoke-direct {p0, p1}, Lcom/facebook/base/c/y;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/a/k;
    .locals 9

    .prologue
    .line 708
    new-instance v0, Lcom/facebook/base/a/k;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/base/c;

    const-class v3, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    const-class v3, Lcom/facebook/base/d;

    const-class v4, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v4, Lcom/facebook/base/c;

    const-class v5, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    const-class v5, Lcom/facebook/base/d;

    const-class v6, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v5

    const-class v6, Lcom/facebook/base/c;

    const-class v7, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v6

    const-class v7, Lcom/facebook/base/d;

    const-class v8, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/base/c/y;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/base/a/k;-><init>(Lcom/facebook/common/executors/a;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 704
    invoke-virtual {p0}, Lcom/facebook/base/c/y;->a()Lcom/facebook/base/a/k;

    move-result-object v0

    return-object v0
.end method
