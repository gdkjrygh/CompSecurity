.class public final Lcom/google/android/gms/deviceconnection/features/a;
.super Lcom/google/android/gms/common/data/d;

# interfaces
.implements Lcom/google/android/gms/deviceconnection/features/DeviceFeature;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/d;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method


# virtual methods
.method public getFeatureName()Ljava/lang/String;
    .locals 1

    const-string v0, "feature_name"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/deviceconnection/features/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastConnectionTimestampMillis()J
    .locals 2

    const-string v0, "last_connection_timestamp"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/deviceconnection/features/a;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/internal/jv;->h(Ljava/lang/Object;)Lcom/google/android/gms/internal/jv$a;

    move-result-object v0

    const-string v1, "FeatureName"

    invoke-virtual {p0}, Lcom/google/android/gms/deviceconnection/features/a;->getFeatureName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/jv$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/jv$a;

    move-result-object v0

    const-string v1, "Timestamp"

    invoke-virtual {p0}, Lcom/google/android/gms/deviceconnection/features/a;->getLastConnectionTimestampMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/jv$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/jv$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jv$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
