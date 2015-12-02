.class Lcom/facebook/k/g;
.super Lcom/facebook/inject/d;
.source "PowerManagementModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/k/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/k/e;


# direct methods
.method private constructor <init>(Lcom/facebook/k/e;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/k/g;->a:Lcom/facebook/k/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/facebook/k/g;-><init>(Lcom/facebook/k/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/k/a;
    .locals 3

    .prologue
    .line 51
    new-instance v2, Lcom/facebook/k/a;

    const-class v0, Lcom/facebook/base/broadcast/j;

    const-class v1, Lcom/facebook/base/broadcast/CrossFbAppBroadcast;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/k/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/broadcast/j;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/k/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/k/a;-><init>(Lcom/facebook/base/broadcast/j;Lcom/facebook/common/time/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/facebook/k/g;->a()Lcom/facebook/k/a;

    move-result-object v0

    return-object v0
.end method
