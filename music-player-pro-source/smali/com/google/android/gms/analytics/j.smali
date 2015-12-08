.class public Lcom/google/android/gms/analytics/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/o;


# instance fields
.field private final yo:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/j;->yo:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/analytics/j;->yo:Ljava/util/Set;

    const/16 v1, 0x12e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/analytics/j;->yo:Ljava/util/Set;

    const/16 v1, 0x194

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/analytics/j;->yo:Ljava/util/Set;

    const/16 v1, 0x1f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public eb()I
    .locals 1

    const/16 v0, 0x7f4

    return v0
.end method

.method public ec()I
    .locals 1

    const/16 v0, 0x2000

    return v0
.end method

.method public ed()I
    .locals 1

    const/16 v0, 0x2000

    return v0
.end method

.method public ee()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public ef()J
    .locals 2

    const-wide/16 v0, 0xe10

    return-wide v0
.end method

.method public eg()Ljava/lang/String;
    .locals 1

    const-string v0, "/collect"

    return-object v0
.end method

.method public eh()Ljava/lang/String;
    .locals 1

    const-string v0, "/batch"

    return-object v0
.end method

.method public ei()Lcom/google/android/gms/analytics/i;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/i;->yx:Lcom/google/android/gms/analytics/i;

    return-object v0
.end method

.method public ej()Lcom/google/android/gms/analytics/l;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/l;->yJ:Lcom/google/android/gms/analytics/l;

    return-object v0
.end method

.method public ek()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/analytics/j;->yo:Ljava/util/Set;

    return-object v0
.end method
