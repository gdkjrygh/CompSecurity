.class Lcom/facebook/analytics/bi;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/periodicreporters/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/facebook/analytics/bi;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 268
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bi;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/periodicreporters/d;
    .locals 4

    .prologue
    .line 273
    new-instance v3, Lcom/facebook/analytics/periodicreporters/d;

    const-class v0, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/analytics/bq;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/bq;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/analytics/periodicreporters/d;-><init>(Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/bq;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 268
    invoke-virtual {p0}, Lcom/facebook/analytics/bi;->a()Lcom/facebook/analytics/periodicreporters/d;

    move-result-object v0

    return-object v0
.end method
