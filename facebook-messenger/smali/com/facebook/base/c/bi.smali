.class Lcom/facebook/base/c/bi;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/ab;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 531
    iput-object p1, p0, Lcom/facebook/base/c/bi;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 531
    invoke-direct {p0, p1}, Lcom/facebook/base/c/bi;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/ab;
    .locals 3

    .prologue
    .line 535
    new-instance v1, Lcom/facebook/common/hardware/ab;

    invoke-virtual {p0}, Lcom/facebook/base/c/bi;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/net/wifi/WifiManager;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-direct {v1, v0}, Lcom/facebook/common/hardware/ab;-><init>(Landroid/net/wifi/WifiManager;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 531
    invoke-virtual {p0}, Lcom/facebook/base/c/bi;->a()Lcom/facebook/common/hardware/ab;

    move-result-object v0

    return-object v0
.end method
