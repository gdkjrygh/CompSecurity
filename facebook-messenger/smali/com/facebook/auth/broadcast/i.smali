.class Lcom/facebook/auth/broadcast/i;
.super Lcom/facebook/inject/d;
.source "CrossProcessAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/broadcast/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/broadcast/e;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/auth/broadcast/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/broadcast/k;
    .locals 2

    .prologue
    .line 47
    new-instance v1, Lcom/facebook/auth/broadcast/k;

    const-class v0, Lcom/facebook/auth/login/z;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/z;

    invoke-direct {v1, v0}, Lcom/facebook/auth/broadcast/k;-><init>(Lcom/facebook/auth/login/z;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/i;->a()Lcom/facebook/auth/broadcast/k;

    move-result-object v0

    return-object v0
.end method
