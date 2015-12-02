.class Lcom/facebook/base/c/m;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 520
    iput-object p1, p0, Lcom/facebook/base/c/m;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 520
    invoke-direct {p0, p1}, Lcom/facebook/base/c/m;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/e;
    .locals 3

    .prologue
    .line 524
    new-instance v2, Lcom/facebook/common/hardware/e;

    invoke-virtual {p0}, Lcom/facebook/base/c/m;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/telephony/TelephonyManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/common/hardware/e;-><init>(Landroid/telephony/TelephonyManager;Lcom/facebook/common/time/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 520
    invoke-virtual {p0}, Lcom/facebook/base/c/m;->a()Lcom/facebook/common/hardware/e;

    move-result-object v0

    return-object v0
.end method
