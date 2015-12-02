.class Lcom/facebook/auth/broadcast/g;
.super Lcom/facebook/inject/d;
.source "CrossProcessAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/broadcast/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/broadcast/d;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/broadcast/d;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/facebook/auth/broadcast/g;->a:Lcom/facebook/auth/broadcast/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0, p1}, Lcom/facebook/auth/broadcast/g;-><init>(Lcom/facebook/auth/broadcast/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/broadcast/m;
    .locals 4

    .prologue
    .line 85
    new-instance v2, Lcom/facebook/auth/broadcast/m;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/os/Handler;

    const-class v3, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/auth/broadcast/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    invoke-direct {v2, v0, v1}, Lcom/facebook/auth/broadcast/m;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/g;->a()Lcom/facebook/auth/broadcast/m;

    move-result-object v0

    return-object v0
.end method
