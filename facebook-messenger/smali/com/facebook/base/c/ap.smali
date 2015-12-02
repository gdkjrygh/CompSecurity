.class Lcom/facebook/base/c/ap;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 945
    iput-object p1, p0, Lcom/facebook/base/c/ap;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 945
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ap;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/k;
    .locals 5

    .prologue
    .line 949
    new-instance v4, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0}, Lcom/facebook/base/c/ap;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/base/c/ap;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/net/ConnectivityManager;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {p0}, Lcom/facebook/base/c/ap;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v3, Landroid/net/wifi/WifiManager;

    invoke-interface {v2, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/WifiManager;

    const-class v3, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v3}, Lcom/facebook/base/c/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/base/broadcast/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/common/hardware/k;-><init>(Landroid/content/Context;Landroid/net/ConnectivityManager;Landroid/net/wifi/WifiManager;Lcom/facebook/base/broadcast/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 945
    invoke-virtual {p0}, Lcom/facebook/base/c/ap;->a()Lcom/facebook/common/hardware/k;

    move-result-object v0

    return-object v0
.end method
