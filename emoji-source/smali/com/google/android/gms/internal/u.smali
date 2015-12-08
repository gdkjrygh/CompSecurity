.class public Lcom/google/android/gms/internal/u;
.super Lcom/google/android/gms/internal/aq$a;

# interfaces
.implements Lcom/google/android/gms/internal/ba;
.implements Lcom/google/android/gms/internal/bd;
.implements Lcom/google/android/gms/internal/bf;
.implements Lcom/google/android/gms/internal/bn;
.implements Lcom/google/android/gms/internal/ci;
.implements Lcom/google/android/gms/internal/cl;
.implements Lcom/google/android/gms/internal/dm$a;
.implements Lcom/google/android/gms/internal/ej;
.implements Lcom/google/android/gms/internal/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/u$c;,
        Lcom/google/android/gms/internal/u$b;,
        Lcom/google/android/gms/internal/u$a;
    }
.end annotation


# instance fields
.field private final kB:Lcom/google/android/gms/internal/bt;

.field private final kC:Lcom/google/android/gms/internal/u$c;

.field private final kD:Lcom/google/android/gms/internal/y;

.field private final kE:Lcom/google/android/gms/internal/ab;

.field private kF:Z

.field private final kG:Landroid/content/ComponentCallbacks;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/al;Ljava/lang/String;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/ev;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/aq$a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/u$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/u$1;-><init>(Lcom/google/android/gms/internal/u;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u;->kG:Landroid/content/ComponentCallbacks;

    new-instance v0, Lcom/google/android/gms/internal/u$c;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/u$c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/al;Ljava/lang/String;Lcom/google/android/gms/internal/ev;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p4, p0, Lcom/google/android/gms/internal/u;->kB:Lcom/google/android/gms/internal/bt;

    new-instance v0, Lcom/google/android/gms/internal/y;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/y;-><init>(Lcom/google/android/gms/internal/u;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    new-instance v0, Lcom/google/android/gms/internal/ab;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ab;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    invoke-static {p1}, Lcom/google/android/gms/internal/eo;->n(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->W()V

    return-void
.end method

.method private W()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kG:Landroid/content/ComponentCallbacks;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    :cond_0
    return-void
.end method

.method private X()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kG:Landroid/content/ComponentCallbacks;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

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

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ap;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ah()V
    .locals 2

    const-string v0, "Ad closing."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ap;->onAdClosed()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ai()V
    .locals 2

    const-string v0, "Ad leaving application."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ap;->onAdLeftApplication()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private aj()V
    .locals 2

    const-string v0, "Ad opening."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ap;->onAdOpened()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private ak()V
    .locals 2

    const-string v0, "Ad finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ap;->onAdLoaded()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private al()Z
    .locals 5

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.permission.INTERNET"

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/eo;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    const-string v3, "Missing internet permission in AndroidManifest.xml."

    const-string v4, "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />"

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/internal/et;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/al;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/eo;->m(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    const-string v3, "Missing AdActivity with android:configChanges in AndroidManifest.xml."

    const-string v4, "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />"

    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/internal/et;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/al;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move v0, v1

    :cond_3
    if-nez v0, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/u$a;->setVisibility(I)V

    :cond_4
    return v0
.end method

.method private am()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->bC()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nt:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v2, v2, Lcom/google/android/gms/internal/ef;->nt:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/eo;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v0, v0, Lcom/google/android/gms/internal/bm;->nt:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v5, v5, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v5, v5, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v5, v5, Lcom/google/android/gms/internal/bm;->nt:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/br;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ef;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method

.method private an()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->destroy()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    :cond_0
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/u$a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/ef;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ef;->qg:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->getView()Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->e(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/u$a;->getNextView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/u$a;->removeView(Landroid/view/View;)V

    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->b(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->getChildCount()I

    move-result v0

    if-le v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->showNext()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Lcom/google/android/gms/internal/ex;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/google/android/gms/internal/ex;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    if-eqz v0, :cond_4

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->destroy()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setVisibility(I)V

    move v0, v2

    :goto_3
    return v0

    :catch_0
    move-exception v0

    const-string v2, "Could not get View from mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v2, "Could not add mediation view to view hierarchy."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_3

    :cond_5
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    iget-object v3, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ex;->a(Lcom/google/android/gms/internal/al;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->removeAllViews()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    iget v3, v3, Lcom/google/android/gms/internal/al;->widthPixels:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/u$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    iget v3, v3, Lcom/google/android/gms/internal/al;->heightPixels:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/u$a;->setMinimumHeight(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->b(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/u$a;->removeView(Landroid/view/View;)V

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v0, "Could not destroy previous mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private c(Lcom/google/android/gms/internal/ai;)Lcom/google/android/gms/internal/ds$a;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/u$a;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/u$a;->getLocationOnScreen([I)V

    aget v3, v0, v2

    aget v4, v0, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v7, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v7, v7, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/u$a;->getWidth()I

    move-result v7

    iget-object v8, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v8, v8, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/u$a;->getHeight()I

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v9, v9, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/u$a;->isShown()Z

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
    invoke-static {}, Lcom/google/android/gms/internal/eh;->bI()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    new-instance v2, Lcom/google/android/gms/internal/eg;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    invoke-direct {v2, v7, v3}, Lcom/google/android/gms/internal/eg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/eg;->f(Lcom/google/android/gms/internal/ai;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-static {v0, p0, v7}, Lcom/google/android/gms/internal/eh;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ej;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    new-instance v0, Lcom/google/android/gms/internal/ds$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v2, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v2, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/eh;->rQ:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v9, v2, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    move-object v2, p1

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ds$a;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ai;Lcom/google/android/gms/internal/al;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ev;Landroid/os/Bundle;)V

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

.method private c(Z)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging Impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->bB()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nu:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v2, v2, Lcom/google/android/gms/internal/ef;->nu:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/eo;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v0, v0, Lcom/google/android/gms/internal/bm;->nu:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v4, v4, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v5, v4, Lcom/google/android/gms/internal/bm;->nu:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/br;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ef;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nM:Lcom/google/android/gms/internal/bl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nM:Lcom/google/android/gms/internal/bl;

    iget-object v0, v0, Lcom/google/android/gms/internal/bl;->np:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v4, v4, Lcom/google/android/gms/internal/ef;->nM:Lcom/google/android/gms/internal/bl;

    iget-object v5, v4, Lcom/google/android/gms/internal/bl;->np:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/br;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ef;Ljava/lang/String;ZLjava/util/List;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public U()Lcom/google/android/gms/dynamic/d;
    .locals 1

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->h(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    return-object v0
.end method

.method public V()Lcom/google/android/gms/internal/al;
    .locals 1

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    return-object v0
.end method

.method public Y()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->ai()V

    return-void
.end method

.method public Z()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab;->d(Lcom/google/android/gms/internal/ef;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->an()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u;->kF:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->ah()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->bD()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/al;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ex;->a(Lcom/google/android/gms/internal/al;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/u$a;->getNextView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget v1, p1, Lcom/google/android/gms/internal/al;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    iget v1, p1, Lcom/google/android/gms/internal/al;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->requestLayout()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ap;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/as;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kW:Lcom/google/android/gms/internal/as;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/dc;)V
    .locals 1

    const-string v0, "setInAppPurchaseListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kY:Lcom/google/android/gms/internal/dc;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/dg;Ljava/lang/String;)V
    .locals 4

    const-string v0, "setPlayStorePurchaseParams must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    new-instance v1, Lcom/google/android/gms/internal/cz;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/cz;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kZ:Lcom/google/android/gms/internal/cz;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kX:Lcom/google/android/gms/internal/dg;

    invoke-static {}, Lcom/google/android/gms/internal/eh;->bM()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/cs;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kX:Lcom/google/android/gms/internal/dg;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kZ:Lcom/google/android/gms/internal/cz;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/cs;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/dg;Lcom/google/android/gms/internal/cz;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cs;->start()V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ef;)V
    .locals 8

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x3

    const/4 v6, -0x2

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object v7, v0, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    if-eq v0, v6, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$c;->aq()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eh;->b(Ljava/util/HashSet;)V

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    iget-object v0, v0, Lcom/google/android/gms/internal/ai;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    iget-object v0, v0, Lcom/google/android/gms/internal/ai;->extras:Landroid/os/Bundle;

    const-string v1, "_noRefresh"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v1, :cond_5

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->a(Landroid/webkit/WebView;)V

    :cond_2
    :goto_2
    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    if-ne v0, v5, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v0, v0, Lcom/google/android/gms/internal/bm;->nv:Ljava/util/List;

    if-eqz v0, :cond_3

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v2, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-object v5, v2, Lcom/google/android/gms/internal/bm;->nv:Ljava/util/List;

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/br;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ef;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    if-eq v0, v6, :cond_8

    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->a(I)V

    goto :goto_0

    :cond_4
    move v0, v4

    goto :goto_1

    :cond_5
    if-nez v0, :cond_2

    iget-wide v0, p1, Lcom/google/android/gms/internal/ef;->nx:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ef;->nx:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/y;->a(Lcom/google/android/gms/internal/ai;J)V

    goto :goto_2

    :cond_6
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    if-eqz v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-wide v0, v0, Lcom/google/android/gms/internal/bm;->nx:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    iget-object v2, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget-wide v2, v2, Lcom/google/android/gms/internal/bm;->nx:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/y;->a(Lcom/google/android/gms/internal/ai;J)V

    goto :goto_2

    :cond_7
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ef;->qg:Z

    if-nez v0, :cond_2

    iget v0, p1, Lcom/google/android/gms/internal/ef;->errorCode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->pX:Lcom/google/android/gms/internal/ai;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/y;->d(Lcom/google/android/gms/internal/ai;)V

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_a

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/u;->b(Lcom/google/android/gms/internal/ef;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/u;->a(I)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/u$a;->a(Lcom/google/android/gms/internal/u$a;)Lcom/google/android/gms/internal/ep;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->ql:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ep;->x(Ljava/lang/String;)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nP:Lcom/google/android/gms/internal/bo;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nP:Lcom/google/android/gms/internal/bo;

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/bo;->a(Lcom/google/android/gms/internal/bn;)V

    :cond_b
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->nP:Lcom/google/android/gms/internal/bo;

    if-eqz v0, :cond_c

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->nP:Lcom/google/android/gms/internal/bo;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/bo;->a(Lcom/google/android/gms/internal/bn;)V

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ab;->d(Lcom/google/android/gms/internal/ef;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object p1, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->rA:Lcom/google/android/gms/internal/al;

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ef;->rB:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/eg;->j(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ef;->rC:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/eg;->k(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/al;->mf:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/eg;->n(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kV:Lcom/google/android/gms/internal/eg;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ef;->qg:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/eg;->o(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_e

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/u;->c(Z)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->la:Lcom/google/android/gms/internal/ek;

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    new-instance v1, Lcom/google/android/gms/internal/ek;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kN:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ek;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->la:Lcom/google/android/gms/internal/ek;

    :cond_f
    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    if-eqz v0, :cond_12

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget v0, v0, Lcom/google/android/gms/internal/bm;->ny:I

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->rz:Lcom/google/android/gms/internal/bm;

    iget v4, v1, Lcom/google/android/gms/internal/bm;->nz:I

    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->la:Lcom/google/android/gms/internal/ek;

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/ek;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_11

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_11

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ey;->cj()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p1, Lcom/google/android/gms/internal/ef;->ry:Lorg/json/JSONObject;

    if-eqz v0, :cond_11

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/al;Lcom/google/android/gms/internal/ef;)Lcom/google/android/gms/internal/ac;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ey;->cj()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_11

    new-instance v1, Lcom/google/android/gms/internal/x;

    iget-object v2, p1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/x;-><init>(Lcom/google/android/gms/internal/ex;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/z;)V

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->bX()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->ak()V

    goto/16 :goto_0

    :cond_12
    move v0, v4

    goto :goto_3
.end method

.method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 7
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

    new-instance v0, Lcom/google/android/gms/internal/ct;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v2, v2, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ct;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kY:Lcom/google/android/gms/internal/dc;

    if-nez v1, :cond_4

    const-string v1, "InAppPurchaseListener is not set. Try to launch default purchase flow."

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "Google Play Service unavailable, cannot launch default purchase flow."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kX:Lcom/google/android/gms/internal/dg;

    if-nez v1, :cond_2

    const-string v0, "PlayStorePurchaseListener is not set."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kZ:Lcom/google/android/gms/internal/cz;

    if-nez v1, :cond_3

    const-string v0, "PlayStorePurchaseVerifier is not initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kX:Lcom/google/android/gms/internal/dg;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/dg;->isValidPurchase(Ljava/lang/String;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ev;->sz:Z

    new-instance v3, Lcom/google/android/gms/internal/cq;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kX:Lcom/google/android/gms/internal/dg;

    iget-object v5, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v5, v5, Lcom/google/android/gms/internal/u$c;->kZ:Lcom/google/android/gms/internal/cz;

    iget-object v6, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v6, v6, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-direct {v3, v0, v4, v5, v6}, Lcom/google/android/gms/internal/cq;-><init>(Lcom/google/android/gms/internal/db;Lcom/google/android/gms/internal/dg;Lcom/google/android/gms/internal/cz;Landroid/content/Context;)V

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/cu;->a(Landroid/content/Context;ZLcom/google/android/gms/internal/cq;)V

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v1, "Could not start In-App purchase."

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kY:Lcom/google/android/gms/internal/dc;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/dc;->a(Lcom/google/android/gms/internal/db;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/util/HashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/eg;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/u$c;->a(Ljava/util/HashSet;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ai;)Z
    .locals 12

    const/4 v10, 0x1

    const/4 v2, 0x0

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_1

    const-string v0, "An ad request is already in progress. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_2

    const-string v0, "An interstitial is already loading. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->al()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Starting ad request."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ai;->lV:Z

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use AdRequest.Builder.addTestDevice(\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/et;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\") to get test ads on this device."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/y;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-boolean v2, v0, Lcom/google/android/gms/internal/u$c;->lb:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/u;->c(Lcom/google/android/gms/internal/ai;)Lcom/google/android/gms/internal/ds$a;

    move-result-object v11

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v3, Lcom/google/android/gms/internal/u$c;->kP:Lcom/google/android/gms/internal/k;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v5, v3, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ev;)Lcom/google/android/gms/internal/ex;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p0

    move-object v4, p0

    move v5, v10

    move-object v6, p0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;Lcom/google/android/gms/internal/bf;)V

    move-object v3, v8

    :goto_1
    iget-object v6, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v1, Lcom/google/android/gms/internal/u$c;->kP:Lcom/google/android/gms/internal/k;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kB:Lcom/google/android/gms/internal/bt;

    move-object v1, v11

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/dm;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ds$a;Lcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ex;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/dm$a;)Lcom/google/android/gms/internal/em;

    move-result-object v0

    iput-object v0, v6, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    move v2, v10

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ex;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/google/android/gms/internal/ex;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;)V

    :cond_5
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v3

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move v8, v2

    move-object v9, p0

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;)V

    move-object v3, v0

    goto :goto_1

    :cond_6
    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/u$a;->removeView(Landroid/view/View;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v3, Lcom/google/android/gms/internal/u$c;->kP:Lcom/google/android/gms/internal/k;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v5, v3, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ev;)Lcom/google/android/gms/internal/ex;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v1, v1, Lcom/google/android/gms/internal/al;->mg:[Lcom/google/android/gms/internal/al;

    if-nez v1, :cond_5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->b(Landroid/view/View;)V

    goto :goto_2
.end method

.method public aa()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->c(Z)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u;->kF:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->aj()V

    return-void
.end method

.method public ab()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/u;->onAdClicked()V

    return-void
.end method

.method public ac()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/u;->Z()V

    return-void
.end method

.method public ad()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/u;->Y()V

    return-void
.end method

.method public ae()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/u;->aa()V

    return-void
.end method

.method public af()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mediation adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v1, v1, Lcom/google/android/gms/internal/ef;->nO:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/u;->c(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->ak()V

    return-void
.end method

.method public ag()V
    .locals 3

    const-string v0, "recordManualImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->qi:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, v1, Lcom/google/android/gms/internal/ev;->sw:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v2, v2, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v2, v2, Lcom/google/android/gms/internal/ef;->qi:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/eo;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/ai;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/eo;->bQ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/u;->kF:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/ai;)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "Ad is not visible. Not refreshing ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/y;->d(Lcom/google/android/gms/internal/ai;)V

    goto :goto_0
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-boolean p1, v0, Lcom/google/android/gms/internal/u$c;->lb:Z

    return-void
.end method

.method public destroy()V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kR:Lcom/google/android/gms/internal/ap;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kW:Lcom/google/android/gms/internal/as;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/y;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ab;->stop()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/u;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kM:Lcom/google/android/gms/internal/u$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/u$a;->removeAllViews()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->destroy()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public isReady()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onAdClicked()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->am()V

    return-void
.end method

.method public onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "info"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kW:Lcom/google/android/gms/internal/as;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kW:Lcom/google/android/gms/internal/as;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/as;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public pause()V
    .locals 1

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->a(Landroid/webkit/WebView;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->pause()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ab;->pause()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/y;->pause()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not pause mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public resume()V
    .locals 1

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->b(Landroid/webkit/WebView;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->resume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kD:Lcom/google/android/gms/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/y;->resume()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ab;->resume()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not resume mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 9

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot call showInterstitial on a banner ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-nez v0, :cond_1

    const-string v0, "The interstitial has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->ce()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "The interstitial is already showing."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->q(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ey;->cj()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->ry:Lorg/json/JSONObject;

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kE:Lcom/google/android/gms/internal/ab;

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kT:Lcom/google/android/gms/internal/al;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ab;->a(Lcom/google/android/gms/internal/al;Lcom/google/android/gms/internal/ef;)Lcom/google/android/gms/internal/ac;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v3, v3, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ey;->cj()Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v0, :cond_4

    new-instance v3, Lcom/google/android/gms/internal/x;

    iget-object v4, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v4, v4, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v4, v4, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/x;-><init>(Lcom/google/android/gms/internal/ex;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/z;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ef;->qg:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->nN:Lcom/google/android/gms/internal/bu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bu;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/u;->an()V

    goto/16 :goto_0

    :cond_5
    new-instance v8, Lcom/google/android/gms/internal/v;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/u$c;->lb:Z

    invoke-direct {v8, v0, v2}, Lcom/google/android/gms/internal/v;-><init>(ZZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_6

    iget v0, v4, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_6

    new-instance v8, Lcom/google/android/gms/internal/v;

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-boolean v5, v0, Lcom/google/android/gms/internal/u$c;->lb:Z

    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget v3, v4, Landroid/graphics/Rect;->top:I

    if-ne v0, v3, :cond_7

    move v0, v1

    :goto_1
    invoke-direct {v8, v5, v0}, Lcom/google/android/gms/internal/v;-><init>(ZZ)V

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ch;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v4, v1, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget v5, v1, Lcom/google/android/gms/internal/ef;->orientation:I

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v6, v1, Lcom/google/android/gms/internal/u$c;->kQ:Lcom/google/android/gms/internal/ev;

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v7, v1, Lcom/google/android/gms/internal/ef;->ql:Ljava/lang/String;

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ch;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/ex;ILcom/google/android/gms/internal/ev;Ljava/lang/String;Lcom/google/android/gms/internal/v;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/u$c;->kO:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ch;)V

    goto/16 :goto_0

    :cond_7
    move v0, v2

    goto :goto_1
.end method

.method public stopLoading()V
    .locals 2

    const-string v0, "stopLoading must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/hm;->ay(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ef;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/u$c;->kU:Lcom/google/android/gms/internal/ef;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/u;->kC:Lcom/google/android/gms/internal/u$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/u$c;->kS:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->cancel()V

    :cond_1
    return-void
.end method
