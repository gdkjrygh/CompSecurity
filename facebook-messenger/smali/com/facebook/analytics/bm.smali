.class Lcom/facebook/analytics/bm;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/periodicreporters/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Lcom/facebook/analytics/bm;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 296
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bm;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/periodicreporters/k;
    .locals 12

    .prologue
    .line 301
    new-instance v0, Lcom/facebook/analytics/periodicreporters/k;

    invoke-virtual {p0}, Lcom/facebook/analytics/bm;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/base/a/d;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    const-class v4, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/TelephonyManager;

    const-class v5, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/PackageManager;

    const-class v6, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v6}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/hardware/k;

    const-class v7, Lcom/facebook/e/c;

    invoke-virtual {p0, v7}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/e/c;

    const-class v8, Lcom/facebook/common/hardware/a;

    invoke-virtual {p0, v8}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/hardware/a;

    const-class v9, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v9}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/analytics/ak;

    const-class v10, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v10}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/common/e/h;

    const-class v11, Lcom/facebook/analytics/i/a;

    invoke-virtual {p0, v11}, Lcom/facebook/analytics/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/analytics/i/a;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/analytics/periodicreporters/k;-><init>(Landroid/content/Context;Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Landroid/telephony/TelephonyManager;Landroid/content/pm/PackageManager;Lcom/facebook/common/hardware/k;Lcom/facebook/e/c;Lcom/facebook/common/hardware/a;Lcom/facebook/analytics/ak;Lcom/facebook/common/e/h;Lcom/facebook/analytics/i/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 296
    invoke-virtual {p0}, Lcom/facebook/analytics/bm;->a()Lcom/facebook/analytics/periodicreporters/k;

    move-result-object v0

    return-object v0
.end method
