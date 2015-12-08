.class Lcom/google/android/gms/analytics/w;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/j;


# instance fields
.field tC:Ljava/lang/String;

.field tD:Ljava/lang/String;

.field wj:Ljava/lang/String;

.field wk:I

.field wl:I


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/analytics/w;->wk:I

    iput v0, p0, Lcom/google/android/gms/analytics/w;->wl:I

    return-void
.end method


# virtual methods
.method public cY()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->tC:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cZ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->tC:Ljava/lang/String;

    return-object v0
.end method

.method public da()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->tD:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public db()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->tD:Ljava/lang/String;

    return-object v0
.end method

.method public dc()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->wj:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->wj:Ljava/lang/String;

    return-object v0
.end method

.method public de()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/w;->wk:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public df()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/w;->wk:I

    return v0
.end method

.method public dg()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/analytics/w;->wl:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dh()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/analytics/w;->wl:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
