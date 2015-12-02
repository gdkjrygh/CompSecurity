.class Lcom/facebook/analytics/af;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/periodicreporters/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/facebook/analytics/af;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 525
    invoke-direct {p0, p1}, Lcom/facebook/analytics/af;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/periodicreporters/m;
    .locals 6

    .prologue
    .line 530
    new-instance v0, Lcom/facebook/analytics/periodicreporters/m;

    invoke-virtual {p0}, Lcom/facebook/analytics/af;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/ak;

    const-class v3, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/base/a/d;

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/process/d;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/periodicreporters/m;-><init>(Landroid/content/Context;Lcom/facebook/analytics/ak;Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/process/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 525
    invoke-virtual {p0}, Lcom/facebook/analytics/af;->a()Lcom/facebook/analytics/periodicreporters/m;

    move-result-object v0

    return-object v0
.end method
