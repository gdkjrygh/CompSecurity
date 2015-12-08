.class Lcom/google/android/gms/analytics/aa;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/m;


# instance fields
.field Bj:Ljava/lang/String;

.field Bk:I

.field Bl:I

.field ya:Ljava/lang/String;

.field yb:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/analytics/aa;->Bk:I

    iput v0, p0, Lcom/google/android/gms/analytics/aa;->Bl:I

    return-void
.end method


# virtual methods
.method public eO()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->ya:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eP()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->ya:Ljava/lang/String;

    return-object v0
.end method

.method public eQ()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->yb:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eR()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->yb:Ljava/lang/String;

    return-object v0
.end method

.method public eS()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->Bj:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eT()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->Bj:Ljava/lang/String;

    return-object v0
.end method

.method public eU()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/aa;->Bk:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eV()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/aa;->Bk:I

    return v0
.end method

.method public eW()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/analytics/aa;->Bl:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eX()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/analytics/aa;->Bl:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
