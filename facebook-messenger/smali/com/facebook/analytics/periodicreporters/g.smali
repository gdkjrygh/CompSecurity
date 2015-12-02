.class final Lcom/facebook/analytics/periodicreporters/g;
.super Ljava/lang/Object;
.source "DeviceInfoPeriodicReporter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/analytics/periodicreporters/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/periodicreporters/f;Lcom/facebook/analytics/periodicreporters/f;)I
    .locals 4

    .prologue
    .line 215
    invoke-static {p2}, Lcom/facebook/analytics/periodicreporters/f;->a(Lcom/facebook/analytics/periodicreporters/f;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/facebook/analytics/periodicreporters/f;->a(Lcom/facebook/analytics/periodicreporters/f;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/common/c/b;->a(JJ)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 213
    check-cast p1, Lcom/facebook/analytics/periodicreporters/f;

    check-cast p2, Lcom/facebook/analytics/periodicreporters/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/periodicreporters/g;->a(Lcom/facebook/analytics/periodicreporters/f;Lcom/facebook/analytics/periodicreporters/f;)I

    move-result v0

    return v0
.end method
