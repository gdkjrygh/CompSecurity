.class public final Lcom/google/android/gms/internal/ck;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ck$a;,
        Lcom/google/android/gms/internal/ck$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ck$b;)V
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/bn;->by()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ck$b;->a(Landroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ck$a;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ck$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ck$b;)V

    goto :goto_0
.end method
