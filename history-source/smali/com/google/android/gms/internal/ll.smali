.class public final Lcom/google/android/gms/internal/ll;
.super Ljava/lang/Object;


# direct methods
.method private static aW(I)Z
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static ig()Z
    .locals 1

    const/16 v0, 0xb

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static ih()Z
    .locals 1

    const/16 v0, 0xc

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static ii()Z
    .locals 1

    const/16 v0, 0xd

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static ij()Z
    .locals 1

    const/16 v0, 0xe

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static ik()Z
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static il()Z
    .locals 1

    const/16 v0, 0x11

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static im()Z
    .locals 1

    const/16 v0, 0x13

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method

.method public static in()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ll;->io()Z

    move-result v0

    return v0
.end method

.method public static io()Z
    .locals 1

    const/16 v0, 0x15

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->aW(I)Z

    move-result v0

    return v0
.end method
