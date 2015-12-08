.class public final Lcom/google/android/gms/analytics/j;
.super Lcom/google/android/gms/analytics/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/i",
        "<",
        "Lcom/google/android/gms/analytics/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/analytics/i;-><init>()V

    const-string v0, "&t"

    const-string v1, "screenview"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/j;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/analytics/i;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
