.class public Lcom/facebook/analytics/module/a;
.super Ljava/lang/Object;
.source "AnalyticsGatekeeperSetProvider.java"

# interfaces
.implements Lcom/facebook/f/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    const-string v0, "android_analytics_periodic_device_status"

    const-string v1, "messenger_force_full_reliability_logging_android"

    const-string v2, "android_analytics_old_time_spent_logging"

    const-string v3, "android_analytics_time_spent_bit_array_logging"

    invoke-static {v0, v1, v2, v3}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
