.class public final Lcom/google/android/gms/internal/dw;
.super Lcom/google/android/gms/dynamic/g;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/dw$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/g",
        "<",
        "Lcom/google/android/gms/internal/dy;",
        ">;"
    }
.end annotation


# static fields
.field private static final sy:Lcom/google/android/gms/internal/dw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/dw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/dw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/dw;->sy:Lcom/google/android/gms/internal/dw;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.AdOverlayCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/dynamic/g;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/app/Activity;)Lcom/google/android/gms/internal/dx;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/dw;->c(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Using AdOverlay from the client jar."

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/dp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/dp;-><init>(Landroid/app/Activity;)V

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/dw;->sy:Lcom/google/android/gms/internal/dw;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/dw;->d(Landroid/app/Activity;)Lcom/google/android/gms/internal/dx;
    :try_end_0
    .catch Lcom/google/android/gms/internal/dw$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dw$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->W(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Landroid/app/Activity;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dw$a;
        }
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/dw$a;

    const-string v1, "Ad overlay requires the useClientJar flag in intent extras."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dw$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private d(Landroid/app/Activity;)Lcom/google/android/gms/internal/dx;
    .locals 3

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/dw;->L(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dy;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/dy;->b(Lcom/google/android/gms/dynamic/d;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dx$a;->r(Landroid/os/IBinder;)Lcom/google/android/gms/internal/dx;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Could not create remote AdOverlay."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/gr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v2, "Could not create remote AdOverlay."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/gr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected synthetic d(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/dw;->q(Landroid/os/IBinder;)Lcom/google/android/gms/internal/dy;

    move-result-object v0

    return-object v0
.end method

.method protected q(Landroid/os/IBinder;)Lcom/google/android/gms/internal/dy;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/dy$a;->s(Landroid/os/IBinder;)Lcom/google/android/gms/internal/dy;

    move-result-object v0

    return-object v0
.end method
