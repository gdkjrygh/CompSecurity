.class Lcom/facebook/base/c/be;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/google/common/d/a/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 841
    iput-object p1, p0, Lcom/facebook/base/c/be;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 841
    invoke-direct {p0, p1}, Lcom/facebook/base/c/be;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/v;
    .locals 2

    .prologue
    .line 845
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 846
    new-instance v1, Lcom/facebook/common/executors/j;

    invoke-direct {v1, v0}, Lcom/facebook/common/executors/j;-><init>(Landroid/os/Handler;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 841
    invoke-virtual {p0}, Lcom/facebook/base/c/be;->a()Lcom/google/common/d/a/v;

    move-result-object v0

    return-object v0
.end method
