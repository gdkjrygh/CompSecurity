.class Lcom/facebook/base/c/n;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 895
    iput-object p1, p0, Lcom/facebook/base/c/n;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 895
    invoke-direct {p0, p1}, Lcom/facebook/base/c/n;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/f;
    .locals 4

    .prologue
    .line 899
    new-instance v2, Lcom/facebook/common/hardware/f;

    invoke-virtual {p0}, Lcom/facebook/base/c/n;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/telephony/TelephonyManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v3, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/base/c/n;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v2, v0, v1}, Lcom/facebook/common/hardware/f;-><init>(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/ExecutorService;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 895
    invoke-virtual {p0}, Lcom/facebook/base/c/n;->a()Lcom/facebook/common/hardware/f;

    move-result-object v0

    return-object v0
.end method
