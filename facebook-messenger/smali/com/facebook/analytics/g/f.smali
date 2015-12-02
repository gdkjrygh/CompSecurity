.class public Lcom/facebook/analytics/g/f;
.super Ljava/lang/Object;
.source "SampleRatioThrottlingPolicy.java"

# interfaces
.implements Lcom/facebook/analytics/g/e;


# instance fields
.field private a:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/g/f;->a:Ljava/util/Random;

    .line 40
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/am;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 44
    const-string v1, "throttle_sample"

    invoke-interface {p1, v1}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    :try_start_0
    const-string v1, "throttle_sample"

    invoke-interface {p1, v1}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v1

    .line 53
    iget-object v3, p0, Lcom/facebook/analytics/g/f;->a:Ljava/util/Random;

    invoke-virtual {v3}, Ljava/util/Random;->nextDouble()D

    move-result-wide v3

    cmpg-double v1, v3, v1

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    .line 55
    :cond_0
    :goto_0
    return v0

    .line 48
    :catch_0
    move-exception v1

    .line 49
    const-string v2, "Invalid throttle duration tag."

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
