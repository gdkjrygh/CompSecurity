.class Lcom/facebook/zero/s;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/server/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lcom/facebook/zero/s;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 249
    invoke-direct {p0, p1}, Lcom/facebook/zero/s;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/server/d;
    .locals 3

    .prologue
    .line 253
    new-instance v2, Lcom/facebook/zero/server/d;

    const-class v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-class v1, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/hardware/k;

    invoke-direct {v2, v0, v1}, Lcom/facebook/zero/server/d;-><init>(Landroid/telephony/TelephonyManager;Lcom/facebook/common/hardware/k;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 249
    invoke-virtual {p0}, Lcom/facebook/zero/s;->a()Lcom/facebook/zero/server/d;

    move-result-object v0

    return-object v0
.end method
