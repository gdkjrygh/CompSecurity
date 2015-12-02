.class Lcom/facebook/analytics/bn;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/service/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/facebook/analytics/bn;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bn;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/service/u;
    .locals 10

    .prologue
    .line 234
    new-instance v0, Lcom/facebook/analytics/service/u;

    const-class v1, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/b/a;

    const-class v2, Lcom/facebook/config/a/c;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/a/c;

    const-class v3, Lcom/facebook/analytics/c/g;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/c/g;

    invoke-virtual {p0}, Lcom/facebook/analytics/bn;->e()Lcom/facebook/inject/ab;

    move-result-object v4

    const-class v5, Landroid/telephony/TelephonyManager;

    invoke-interface {v4, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/TelephonyManager;

    const-class v5, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/device_id/l;

    const-class v6, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v6}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/hardware/k;

    const-class v7, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v7}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/http/protocol/aq;

    const-class v8, Lcom/facebook/analytics/service/v;

    invoke-virtual {p0, v8}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/analytics/service/v;

    const-class v9, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v9}, Lcom/facebook/analytics/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/analytics/service/u;-><init>(Lcom/facebook/config/b/a;Lcom/facebook/config/a/c;Lcom/facebook/analytics/c/g;Landroid/telephony/TelephonyManager;Lcom/facebook/device_id/l;Lcom/facebook/common/hardware/k;Lcom/facebook/http/protocol/aq;Lcom/facebook/analytics/service/v;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 229
    invoke-virtual {p0}, Lcom/facebook/analytics/bn;->a()Lcom/facebook/analytics/service/u;

    move-result-object v0

    return-object v0
.end method
