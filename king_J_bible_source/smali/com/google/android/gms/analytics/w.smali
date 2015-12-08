.class Lcom/google/android/gms/analytics/w;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/j;


# instance fields
.field so:Ljava/lang/String;

.field sp:Ljava/lang/String;

.field uV:Ljava/lang/String;

.field uW:I

.field uX:I


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/analytics/w;->uW:I

    iput v0, p0, Lcom/google/android/gms/analytics/w;->uX:I

    return-void
.end method


# virtual methods
.method public cC()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->so:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cD()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->so:Ljava/lang/String;

    return-object v0
.end method

.method public cE()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->sp:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cF()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->sp:Ljava/lang/String;

    return-object v0
.end method

.method public cG()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->uV:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cH()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/w;->uV:Ljava/lang/String;

    return-object v0
.end method

.method public cI()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/w;->uW:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cJ()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/w;->uW:I

    return v0
.end method

.method public cK()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/analytics/w;->uX:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cL()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/analytics/w;->uX:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
