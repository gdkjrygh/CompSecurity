.class public Lcom/facebook/analytics/c/e;
.super Lcom/facebook/d/c/a;
.source "AnalyticsPropertyUtil.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/d/c/a",
        "<",
        "Lcom/facebook/analytics/c/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/c/a;)V
    .locals 1

    .prologue
    .line 13
    const-string v0, "analytics_db_properties"

    invoke-direct {p0, p1, v0}, Lcom/facebook/d/c/a;-><init>(Lcom/google/common/base/Supplier;Ljava/lang/String;)V

    .line 14
    return-void
.end method
