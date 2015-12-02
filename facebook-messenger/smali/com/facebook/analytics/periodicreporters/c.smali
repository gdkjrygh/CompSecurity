.class Lcom/facebook/analytics/periodicreporters/c;
.super Ljava/lang/Object;
.source "AnalyticsAlarmReceiver.java"

# interfaces
.implements Lcom/facebook/c/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/periodicreporters/b;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 4

    .prologue
    .line 37
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v2

    .line 38
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    .line 39
    const-class v1, Lcom/facebook/analytics/periodicreporters/k;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/periodicreporters/k;

    .line 41
    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {v2, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    .line 43
    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/periodicreporters/k;->b(J)Lcom/facebook/analytics/ca;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 45
    return-void
.end method
