.class public Lcom/facebook/analytics/service/r;
.super Ljava/lang/Object;
.source "DefaultHoneyAnalyticsPeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/service/t;


# instance fields
.field private final a:Lcom/facebook/fbservice/ops/k;

.field private final b:Lcom/facebook/analytics/ak;

.field private final c:Z

.field private d:Lcom/facebook/fbservice/ops/n;


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/ops/k;Lcom/facebook/analytics/ak;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/analytics/service/r;->a:Lcom/facebook/fbservice/ops/k;

    .line 34
    iput-object p2, p0, Lcom/facebook/analytics/service/r;->b:Lcom/facebook/analytics/ak;

    .line 36
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    double-to-int v0, v0

    const v1, 0x7fffffff

    mul-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/analytics/service/r;->c:Z

    .line 38
    return-void

    .line 36
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/analytics/service/r;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/facebook/analytics/service/r;->d:Lcom/facebook/fbservice/ops/n;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/analytics/service/r;->d:Lcom/facebook/fbservice/ops/n;

    if-eqz v0, :cond_1

    .line 66
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/service/r;->b:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/analytics/service/r;->b:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-eq v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/facebook/analytics/service/r;->c:Z

    if-eqz v0, :cond_0

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/facebook/analytics/service/r;->a:Lcom/facebook/fbservice/ops/k;

    sget-object v1, Lcom/facebook/analytics/service/m;->a:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/service/r;->d:Lcom/facebook/fbservice/ops/n;

    .line 55
    iget-object v0, p0, Lcom/facebook/analytics/service/r;->d:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/analytics/service/s;

    invoke-direct {v1, p0}, Lcom/facebook/analytics/service/s;-><init>(Lcom/facebook/analytics/service/r;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method
