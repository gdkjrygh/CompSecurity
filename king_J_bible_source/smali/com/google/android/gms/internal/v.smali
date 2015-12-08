.class public Lcom/google/android/gms/internal/v;
.super Lcom/google/android/gms/internal/ap$a;

# interfaces
.implements Lcom/google/android/gms/internal/az;
.implements Lcom/google/android/gms/internal/bc;
.implements Lcom/google/android/gms/internal/bk;
.implements Lcom/google/android/gms/internal/cf;
.implements Lcom/google/android/gms/internal/ci;
.implements Lcom/google/android/gms/internal/cr$a;
.implements Lcom/google/android/gms/internal/dl;
.implements Lcom/google/android/gms/internal/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/v$b;,
        Lcom/google/android/gms/internal/v$a;
    }
.end annotation


# instance fields
.field private final kA:Lcom/google/android/gms/internal/x;

.field private final kB:Lcom/google/android/gms/internal/aa;

.field private kC:Z

.field private final kD:Landroid/content/ComponentCallbacks;

.field private final ky:Lcom/google/android/gms/internal/bq;

.field private final kz:Lcom/google/android/gms/internal/v$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Lcom/google/android/gms/internal/bq;Lcom/google/android/gms/internal/dx;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ap$a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/v$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/v$1;-><init>(Lcom/google/android/gms/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/v;->kD:Landroid/content/ComponentCallbacks;

    new-instance v0, Lcom/google/android/gms/internal/v$b;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/v$b;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Lcom/google/android/gms/internal/dx;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p4, p0, Lcom/google/android/gms/internal/v;->ky:Lcom/google/android/gms/internal/bq;

    new-instance v0, Lcom/google/android/gms/internal/x;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/x;-><init>(Lcom/google/android/gms/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    new-instance v0, Lcom/google/android/gms/internal/aa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/aa;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/v;->kB:Lcom/google/android/gms/internal/aa;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use AdRequest.Builder.addTestDevice(\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/dv;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\") to get test ads on this device."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/dq;->i(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->S()V

    return-void
.end method

.method private S()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kD:Landroid/content/ComponentCallbacks;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    :cond_0
    return-void
.end method

.method private T()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kD:Landroid/content/ComponentCallbacks;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/v$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to load ad: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ao;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ad()V
    .locals 2

    const-string v0, "Ad closing."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ao;->onAdClosed()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ae()V
    .locals 2

    const-string v0, "Ad leaving application."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ao;->onAdLeftApplication()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private af()V
    .locals 2

    const-string v0, "Ad opening."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ao;->onAdOpened()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ag()V
    .locals 2

    const-string v0, "Ad finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ao;->onAdLoaded()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ah()Z
    .locals 5

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.permission.INTERNET"

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/dq;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    const-string v3, "Missing internet permission in AndroidManifest.xml."

    const-string v4, "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />"

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/internal/dv;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/dq;->h(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    const-string v3, "Missing AdActivity with android:configChanges in AndroidManifest.xml."

    const-string v4, "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />"

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/internal/dv;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move v0, v1

    :cond_3
    if-nez v0, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/v$a;->setVisibility(I)V

    :cond_4
    return v0
.end method

.method private ai()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/di;->bl()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ne:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v2, v2, Lcom/google/android/gms/internal/dh;->ne:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/dq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v0, v0, Lcom/google/android/gms/internal/bj;->ne:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v5, v5, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v5, v5, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v5, v5, Lcom/google/android/gms/internal/bj;->ne:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/dh;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method

.method private aj()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->destroy()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    :cond_0
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/v$a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private b(Z)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging Impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/di;->bk()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->nf:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v2, v2, Lcom/google/android/gms/internal/dh;->nf:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/dq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v0, v0, Lcom/google/android/gms/internal/bj;->nf:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v4, v4, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v5, v4, Lcom/google/android/gms/internal/bj;->nf:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/dh;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->nx:Lcom/google/android/gms/internal/bi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->nx:Lcom/google/android/gms/internal/bi;

    iget-object v0, v0, Lcom/google/android/gms/internal/bi;->na:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v4, v4, Lcom/google/android/gms/internal/dh;->nx:Lcom/google/android/gms/internal/bi;

    iget-object v5, v4, Lcom/google/android/gms/internal/bi;->na:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/dh;Ljava/lang/String;ZLjava/util/List;)V

    goto/16 :goto_0
.end method

.method private b(Lcom/google/android/gms/internal/dh;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/dh;->po:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->getView()Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->d(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/v$a;->getNextView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/v$a;->removeView(Landroid/view/View;)V

    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->b(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->getChildCount()I

    move-result v0

    if-le v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->showNext()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Lcom/google/android/gms/internal/dz;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/google/android/gms/internal/dz;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    if-eqz v0, :cond_4

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->destroy()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setVisibility(I)V

    move v0, v2

    :goto_3
    return v0

    :catch_0
    move-exception v0

    const-string v2, "Could not get View from mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v2, "Could not add mediation view to view hierarchy."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :cond_5
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    iget-object v3, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/ak;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->removeAllViews()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    iget v3, v3, Lcom/google/android/gms/internal/ak;->widthPixels:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/v$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    iget v3, v3, Lcom/google/android/gms/internal/ak;->heightPixels:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/v$a;->setMinimumHeight(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->b(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/v$a;->removeView(Landroid/view/View;)V

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v0, "Could not destroy previous mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private c(Lcom/google/android/gms/internal/ah;)Lcom/google/android/gms/internal/cx$a;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/v$a;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/v$a;->getLocationOnScreen([I)V

    aget v3, v0, v2

    aget v4, v0, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v7, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v7, v7, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/v$a;->getWidth()I

    move-result v7

    iget-object v8, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v8, v8, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/v$a;->getHeight()I

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v9, v9, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/v$a;->isShown()Z

    move-result v9

    if-eqz v9, :cond_0

    add-int v9, v3, v7

    if-lez v9, :cond_0

    add-int v9, v4, v8

    if-lez v9, :cond_0

    iget v9, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    if-gt v3, v9, :cond_0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    if-gt v4, v0, :cond_0

    move v0, v1

    :goto_1
    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    const-string v2, "x"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "y"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "width"

    invoke-virtual {v1, v2, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "height"

    invoke-virtual {v1, v2, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "visible"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/dj;->bs()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    new-instance v2, Lcom/google/android/gms/internal/di;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    invoke-direct {v2, v7, v3}, Lcom/google/android/gms/internal/di;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/di;->f(Lcom/google/android/gms/internal/ah;)V

    invoke-static {p0, v7}, Lcom/google/android/gms/internal/dj;->a(Lcom/google/android/gms/internal/dl;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    new-instance v0, Lcom/google/android/gms/internal/cx$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v2, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v2, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/dj;->qK:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v9, v2, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    move-object v2, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/cx$a;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/dx;Landroid/os/Bundle;)V

    return-object v0

    :catch_0
    move-exception v3

    move-object v6, v0

    goto/16 :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_2
.end method


# virtual methods
.method public P()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ai()V

    return-void
.end method

.method public Q()Lcom/google/android/gms/dynamic/d;
    .locals 1

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public R()Lcom/google/android/gms/internal/ak;
    .locals 1

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    return-object v0
.end method

.method public U()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ae()V

    return-void
.end method

.method public V()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kB:Lcom/google/android/gms/internal/aa;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aa;->d(Lcom/google/android/gms/internal/dh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->aj()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/v;->kC:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ad()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/di;->bm()V

    return-void
.end method

.method public W()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->b(Z)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/v;->kC:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->af()V

    return-void
.end method

.method public X()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/v;->P()V

    return-void
.end method

.method public Y()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/v;->V()V

    return-void
.end method

.method public Z()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/v;->U()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ak;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p1, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/ak;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/v$a;->getNextView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget v1, p1, Lcom/google/android/gms/internal/ak;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    iget v1, p1, Lcom/google/android/gms/internal/ak;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/v$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->requestLayout()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ao;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p1, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ar;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p1, v0, Lcom/google/android/gms/internal/v$b;->kQ:Lcom/google/android/gms/internal/ar;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/co;)V
    .locals 1

    const-string v0, "setInAppPurchaseListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p1, v0, Lcom/google/android/gms/internal/v$b;->kR:Lcom/google/android/gms/internal/co;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/dh;)V
    .locals 8

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x3

    const/4 v6, -0x2

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object v7, v0, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    if-eq v0, v6, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$b;->ak()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dj;->b(Ljava/util/HashSet;)V

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    iget-object v0, v0, Lcom/google/android/gms/internal/ah;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    iget-object v0, v0, Lcom/google/android/gms/internal/ah;->extras:Landroid/os/Bundle;

    const-string v1, "_noRefresh"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v1, :cond_5

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dq;->a(Landroid/webkit/WebView;)V

    :cond_2
    :goto_2
    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    if-ne v0, v5, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v0, v0, Lcom/google/android/gms/internal/bj;->ng:Ljava/util/List;

    if-eqz v0, :cond_3

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v2, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-object v5, v2, Lcom/google/android/gms/internal/bj;->ng:Ljava/util/List;

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/dh;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    if-eq v0, v6, :cond_8

    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->a(I)V

    goto :goto_0

    :cond_4
    move v0, v4

    goto :goto_1

    :cond_5
    if-nez v0, :cond_2

    iget-wide v0, p1, Lcom/google/android/gms/internal/dh;->ni:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    iget-wide v2, p1, Lcom/google/android/gms/internal/dh;->ni:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/x;->a(Lcom/google/android/gms/internal/ah;J)V

    goto :goto_2

    :cond_6
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-wide v0, v0, Lcom/google/android/gms/internal/bj;->ni:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    iget-object v2, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget-wide v2, v2, Lcom/google/android/gms/internal/bj;->ni:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/x;->a(Lcom/google/android/gms/internal/ah;J)V

    goto :goto_2

    :cond_7
    iget-boolean v0, p1, Lcom/google/android/gms/internal/dh;->po:Z

    if-nez v0, :cond_2

    iget v0, p1, Lcom/google/android/gms/internal/dh;->errorCode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->pg:Lcom/google/android/gms/internal/ah;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/x;->d(Lcom/google/android/gms/internal/ah;)V

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_a

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/v;->b(Lcom/google/android/gms/internal/dh;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/v;->a(I)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/v$a;->a(Lcom/google/android/gms/internal/v$a;)Lcom/google/android/gms/internal/dr;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->pt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dr;->t(Ljava/lang/String;)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->nA:Lcom/google/android/gms/internal/bl;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->nA:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/bl;->a(Lcom/google/android/gms/internal/bk;)V

    :cond_b
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->nA:Lcom/google/android/gms/internal/bl;

    if-eqz v0, :cond_c

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->nA:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/bl;->a(Lcom/google/android/gms/internal/bk;)V

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kB:Lcom/google/android/gms/internal/aa;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aa;->d(Lcom/google/android/gms/internal/dh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object p1, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->qu:Lcom/google/android/gms/internal/ak;

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    iget-wide v2, p1, Lcom/google/android/gms/internal/dh;->qv:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/di;->h(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    iget-wide v2, p1, Lcom/google/android/gms/internal/dh;->qw:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/di;->i(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ak;->lT:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/di;->m(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kP:Lcom/google/android/gms/internal/di;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/dh;->po:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/di;->n(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_e

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/v;->b(Z)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kS:Lcom/google/android/gms/internal/dm;

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    new-instance v1, Lcom/google/android/gms/internal/dm;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kH:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/dm;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kS:Lcom/google/android/gms/internal/dm;

    :cond_f
    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_12

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget v0, v0, Lcom/google/android/gms/internal/bj;->nj:I

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->qt:Lcom/google/android/gms/internal/bj;

    iget v4, v1, Lcom/google/android/gms/internal/bj;->nk:I

    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kS:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/dm;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_11

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_11

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ea;->bP()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p1, Lcom/google/android/gms/internal/dh;->qs:Lorg/json/JSONObject;

    if-eqz v0, :cond_11

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kB:Lcom/google/android/gms/internal/aa;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/aa;->a(Lcom/google/android/gms/internal/ak;Lcom/google/android/gms/internal/dh;)Lcom/google/android/gms/internal/ab;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ea;->bP()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_11

    new-instance v1, Lcom/google/android/gms/internal/w;

    iget-object v2, p1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/w;-><init>(Lcom/google/android/gms/internal/dz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/y;)V

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bE()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ag()V

    goto/16 :goto_0

    :cond_12
    move v0, v4

    goto :goto_3
.end method

.method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kR:Lcom/google/android/gms/internal/co;

    if-nez v0, :cond_0

    const-string v0, "InAppPurchaseListener is not set"

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kR:Lcom/google/android/gms/internal/co;

    new-instance v1, Lcom/google/android/gms/internal/cm;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v3, v3, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/cm;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/co;->a(Lcom/google/android/gms/internal/cn;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/util/HashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/di;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/v$b;->a(Ljava/util/HashSet;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ah;)Z
    .locals 12

    const/4 v10, 0x1

    const/4 v2, 0x0

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_1

    const-string v0, "An ad request is already in progress. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_2

    const-string v0, "An interstitial is already loading. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ah()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Starting ad request."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/x;->cancel()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/v;->c(Lcom/google/android/gms/internal/ah;)Lcom/google/android/gms/internal/cx$a;

    move-result-object v11

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v3, Lcom/google/android/gms/internal/v$b;->kJ:Lcom/google/android/gms/internal/l;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v5, v3, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;ZZLcom/google/android/gms/internal/l;Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/dz;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p0

    move-object v4, p0

    move v5, v10

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;ZLcom/google/android/gms/internal/bc;)V

    move-object v3, v7

    :goto_1
    iget-object v6, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v1, Lcom/google/android/gms/internal/v$b;->kJ:Lcom/google/android/gms/internal/l;

    iget-object v4, p0, Lcom/google/android/gms/internal/v;->ky:Lcom/google/android/gms/internal/bq;

    move-object v1, v11

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/cr;->a(Landroid/content/Context;Lcom/google/android/gms/internal/cx$a;Lcom/google/android/gms/internal/l;Lcom/google/android/gms/internal/dz;Lcom/google/android/gms/internal/bq;Lcom/google/android/gms/internal/cr$a;)Lcom/google/android/gms/internal/do;

    move-result-object v0

    iput-object v0, v6, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    move v2, v10

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/dz;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/google/android/gms/internal/dz;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;)V

    :cond_4
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v3

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move v8, v2

    move-object v9, p0

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;ZLcom/google/android/gms/internal/bc;)V

    move-object v3, v0

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/v$a;->removeView(Landroid/view/View;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v4, v3, Lcom/google/android/gms/internal/v$b;->kJ:Lcom/google/android/gms/internal/l;

    iget-object v3, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v5, v3, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;ZZLcom/google/android/gms/internal/l;Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/dz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v1, v1, Lcom/google/android/gms/internal/ak;->lU:[Lcom/google/android/gms/internal/ak;

    if-nez v1, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->b(Landroid/view/View;)V

    goto :goto_2
.end method

.method public aa()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/v;->W()V

    return-void
.end method

.method public ab()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mediation adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v1, v1, Lcom/google/android/gms/internal/dh;->nz:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/v;->b(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->ag()V

    return-void
.end method

.method public ac()V
    .locals 3

    const-string v0, "recordManualImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->pq:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, v1, Lcom/google/android/gms/internal/dx;->rq:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v2, v2, Lcom/google/android/gms/internal/dh;->pq:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/dq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/ah;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/dq;->by()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/v;->kC:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/v;->a(Lcom/google/android/gms/internal/ah;)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "Ad is not visible. Not refreshing ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->x(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/x;->d(Lcom/google/android/gms/internal/ah;)V

    goto :goto_0
.end method

.method public destroy()V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->T()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kL:Lcom/google/android/gms/internal/ao;

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kQ:Lcom/google/android/gms/internal/ar;

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/x;->cancel()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/v;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kG:Lcom/google/android/gms/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/v$a;->removeAllViews()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->destroy()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public isReady()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "info"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kQ:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kQ:Lcom/google/android/gms/internal/ar;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ar;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public pause()V
    .locals 1

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dq;->a(Landroid/webkit/WebView;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->pause()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/x;->pause()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not pause mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public resume()V
    .locals 1

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dq;->b(Landroid/webkit/WebView;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->resume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kA:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/x;->resume()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not resume mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 8

    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ak;->lT:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot call showInterstitial on a banner ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-nez v0, :cond_1

    const-string v0, "The interstitial has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bL()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "The interstitial is already showing."

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->p(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ea;->bP()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->qs:Lorg/json/JSONObject;

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kB:Lcom/google/android/gms/internal/aa;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kN:Lcom/google/android/gms/internal/ak;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/aa;->a(Lcom/google/android/gms/internal/ak;Lcom/google/android/gms/internal/dh;)Lcom/google/android/gms/internal/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v1, v1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ea;->bP()Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    new-instance v1, Lcom/google/android/gms/internal/w;

    iget-object v2, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v2, v2, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v2, v2, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/w;-><init>(Lcom/google/android/gms/internal/dz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/y;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/dh;->po:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->ny:Lcom/google/android/gms/internal/br;

    invoke-interface {v0}, Lcom/google/android/gms/internal/br;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/v;->aj()V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ce;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v4, v1, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget v5, v1, Lcom/google/android/gms/internal/dh;->orientation:I

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v6, v1, Lcom/google/android/gms/internal/v$b;->kK:Lcom/google/android/gms/internal/dx;

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v7, v1, Lcom/google/android/gms/internal/dh;->pt:Ljava/lang/String;

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/dz;ILcom/google/android/gms/internal/dx;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/v$b;->kI:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ce;)V

    goto/16 :goto_0
.end method

.method public stopLoading()V
    .locals 2

    const-string v0, "stopLoading must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/fq;->aj(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/v;->kz:Lcom/google/android/gms/internal/v$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kM:Lcom/google/android/gms/internal/do;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/do;->cancel()V

    :cond_1
    return-void
.end method
