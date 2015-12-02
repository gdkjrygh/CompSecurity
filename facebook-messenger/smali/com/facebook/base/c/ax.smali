.class Lcom/facebook/base/c/ax;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 502
    iput-object p1, p0, Lcom/facebook/base/c/ax;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 502
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ax;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/q;
    .locals 4

    .prologue
    .line 505
    new-instance v2, Lcom/facebook/common/hardware/q;

    invoke-virtual {p0}, Lcom/facebook/base/c/ax;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/base/c/ax;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v3, Landroid/os/PowerManager;

    invoke-interface {v1, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    invoke-direct {v2, v0, v1}, Lcom/facebook/common/hardware/q;-><init>(Landroid/content/Context;Landroid/os/PowerManager;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 502
    invoke-virtual {p0}, Lcom/facebook/base/c/ax;->a()Lcom/facebook/common/hardware/q;

    move-result-object v0

    return-object v0
.end method
