.class public final Lcom/google/android/gms/internal/u;
.super Lcom/google/android/gms/dynamic/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/e",
        "<",
        "Lcom/google/android/gms/internal/ad;",
        ">;"
    }
.end annotation


# static fields
.field private static final er:Lcom/google/android/gms/internal/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/u;

    invoke-direct {v0}, Lcom/google/android/gms/internal/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/u;->er:Lcom/google/android/gms/internal/u;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.AdManagerCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/dynamic/e;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/av;)Lcom/google/android/gms/internal/ac;
    .locals 6

    const v1, 0x3d8024

    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/u;->er:Lcom/google/android/gms/internal/u;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/u;->b(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/av;)Lcom/google/android/gms/internal/ac;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "Using AdManager from the client jar."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    new-instance v5, Lcom/google/android/gms/internal/co;

    const/4 v0, 0x1

    invoke-direct {v5, v1, v1, v0}, Lcom/google/android/gms/internal/co;-><init>(IIZ)V

    new-instance v0, Lcom/google/android/gms/internal/r;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/r;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/co;)V

    :cond_1
    return-object v0
.end method

.method private b(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/av;)Lcom/google/android/gms/internal/ac;
    .locals 7

    const/4 v6, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/c;->g(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/u;->t(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ad;

    const v5, 0x3d8024

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ad;->a(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/aw;I)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ac$a;->f(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ac;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/dynamic/e$a; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not create remote AdManager."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not create remote AdManager."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    goto :goto_0
.end method


# virtual methods
.method protected c(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ad;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ad$a;->g(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ad;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic d(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/u;->c(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ad;

    move-result-object v0

    return-object v0
.end method
