.class public final Lcom/google/android/gms/analytics/h;
.super Lcom/google/android/gms/analytics/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/i",
        "<",
        "Lcom/google/android/gms/analytics/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/analytics/i;-><init>()V

    const-string v0, "&t"

    const-string v1, "event"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/analytics/h;-><init>()V

    .line 1000
    const-string v0, "&ec"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    .line 2000
    const-string v0, "&ea"

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/analytics/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    .line 0
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/analytics/i;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
