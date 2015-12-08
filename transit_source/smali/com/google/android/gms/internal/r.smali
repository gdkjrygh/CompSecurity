.class public final Lcom/google/android/gms/internal/r;
.super Lcom/google/android/gms/internal/ac$a;

# interfaces
.implements Lcom/google/android/gms/internal/ag;
.implements Lcom/google/android/gms/internal/aq;
.implements Lcom/google/android/gms/internal/bi;
.implements Lcom/google/android/gms/internal/bl;
.implements Lcom/google/android/gms/internal/bp$a;
.implements Lcom/google/android/gms/internal/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/r$a;
    }
.end annotation


# instance fields
.field private final dZ:Lcom/google/android/gms/internal/aw;

.field private final ea:Lcom/google/android/gms/internal/r$a;

.field private final eb:Lcom/google/android/gms/internal/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/co;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ac$a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/r$a;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/r$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object p4, p0, Lcom/google/android/gms/internal/r;->dZ:Lcom/google/android/gms/internal/aw;

    new-instance v0, Lcom/google/android/gms/internal/s;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/s;-><init>(Lcom/google/android/gms/internal/r;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use AdRequest.Builder.addTestDevice(\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/cm;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\") to get test ads on this device."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ci;->i(Landroid/content/Context;)V

    return-void
.end method

.method private I()V
    .locals 2

    const-string v0, "Ad closing."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ab;->onAdClosed()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private J()V
    .locals 2

    const-string v0, "Ad leaving application."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ab;->onAdLeftApplication()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private K()V
    .locals 2

    const-string v0, "Ad opening."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ab;->onAdOpened()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private L()V
    .locals 2

    const-string v0, "Ad finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ab;->onAdLoaded()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private M()Z
    .locals 5

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.permission.INTERNET"

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ci;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    const-string v3, "Missing internet permission in AndroidManifest.xml."

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/cm;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/x;Ljava/lang/String;)V

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/ci;->h(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    const-string v3, "Missing AdActivity with android:configChanges in AndroidManifest.xml."

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/cm;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/x;Ljava/lang/String;)V

    :cond_2
    move v0, v1

    :cond_3
    if-nez v0, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v2, v1}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    :cond_4
    return v0
.end method

.method private N()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->eW:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v2, v2, Lcom/google/android/gms/internal/ce;->eW:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ci;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v0, v0, Lcom/google/android/gms/internal/ap;->eW:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v5, v5, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v5, v5, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v5, v5, Lcom/google/android/gms/internal/ap;->eW:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ce;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method

.method private O()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->destroy()V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    :cond_0
    return-void
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

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ab;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1, p1, v0}, Landroid/widget/ViewSwitcher;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private b(Z)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging Impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->eX:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v2, v2, Lcom/google/android/gms/internal/ce;->eX:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ci;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v0, v0, Lcom/google/android/gms/internal/ap;->eX:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v4, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v4, v4, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v5, v4, Lcom/google/android/gms/internal/ap;->eX:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ce;Ljava/lang/String;ZLjava/util/List;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fm:Lcom/google/android/gms/internal/ao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fm:Lcom/google/android/gms/internal/ao;

    iget-object v0, v0, Lcom/google/android/gms/internal/ao;->eT:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v2, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v4, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v4, v4, Lcom/google/android/gms/internal/ce;->fm:Lcom/google/android/gms/internal/ao;

    iget-object v5, v4, Lcom/google/android/gms/internal/ao;->eT:Ljava/util/List;

    move v4, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ce;Ljava/lang/String;ZLjava/util/List;)V

    goto/16 :goto_0
.end method

.method private b(Lcom/google/android/gms/internal/ce;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ce;->gI:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->fn:Lcom/google/android/gms/internal/ax;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ax;->getView()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/c;->b(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v4, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v4, v3}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/r;->b(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getChildCount()I

    move-result v0

    if-le v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->showNext()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Lcom/google/android/gms/internal/cq;

    if-eqz v3, :cond_5

    check-cast v0, Lcom/google/android/gms/internal/cq;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v4, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;)V

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fn:Lcom/google/android/gms/internal/ax;

    if-eqz v0, :cond_4

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fn:Lcom/google/android/gms/internal/ax;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ax;->destroy()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    move v0, v2

    :goto_2
    return v0

    :catch_0
    move-exception v0

    const-string v2, "Could not get View from mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_2

    :catch_1
    move-exception v0

    const-string v2, "Could not add mediation view to view hierarchy."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3, v0}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    goto :goto_0

    :catch_2
    move-exception v0

    const-string v0, "Could not destroy previous mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private c(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/bu$a;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3}, Landroid/widget/ViewSwitcher;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v3, v0}, Landroid/widget/ViewSwitcher;->getLocationOnScreen([I)V

    aget v3, v0, v2

    aget v4, v0, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v7, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v7, v7, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v7}, Landroid/widget/ViewSwitcher;->getWidth()I

    move-result v7

    iget-object v8, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v8, v8, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v8}, Landroid/widget/ViewSwitcher;->getHeight()I

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v9, v9, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v9}, Landroid/widget/ViewSwitcher;->isShown()Z

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
    new-instance v0, Lcom/google/android/gms/internal/bu$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v2, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v2, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/cf;->al()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/cf;->hB:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v9, v2, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    move-object v2, p1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/bu$a;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V

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
.method public A()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->J()V

    return-void
.end method

.method public B()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->O()V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->I()V

    return-void
.end method

.method public C()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/r;->b(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->K()V

    return-void
.end method

.method public D()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/r;->y()V

    return-void
.end method

.method public E()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/r;->B()V

    return-void
.end method

.method public F()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/r;->A()V

    return-void
.end method

.method public G()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/r;->C()V

    return-void
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mediation adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v1, v1, Lcom/google/android/gms/internal/ce;->fo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/r;->b(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->L()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ab;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object p1, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ae;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object p1, v0, Lcom/google/android/gms/internal/r$a;->ek:Lcom/google/android/gms/internal/ae;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ce;)V
    .locals 7

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object v6, v0, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    iget v0, p1, Lcom/google/android/gms/internal/ce;->errorCode:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/internal/v;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/internal/v;->extras:Landroid/os/Bundle;

    const-string v1, "_noRefresh"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v1, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->a(Landroid/webkit/WebView;)V

    :cond_1
    :goto_2
    iget v0, p1, Lcom/google/android/gms/internal/ce;->errorCode:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v0, v0, Lcom/google/android/gms/internal/ap;->eY:Ljava/util/List;

    if-eqz v0, :cond_2

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    iget-object v1, v1, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v2, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-object v5, v2, Lcom/google/android/gms/internal/ap;->eY:Ljava/util/List;

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ce;Ljava/lang/String;ZLjava/util/List;)V

    :cond_2
    iget v0, p1, Lcom/google/android/gms/internal/ce;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_7

    iget v0, p1, Lcom/google/android/gms/internal/ce;->errorCode:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/r;->a(I)V

    goto :goto_0

    :cond_3
    move v0, v4

    goto :goto_1

    :cond_4
    if-nez v0, :cond_1

    iget-wide v0, p1, Lcom/google/android/gms/internal/ce;->fa:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    iget-object v1, p1, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ce;->fa:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/v;J)V

    goto :goto_2

    :cond_5
    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ap;->fa:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    iget-object v1, p1, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    iget-object v2, p1, Lcom/google/android/gms/internal/ce;->hA:Lcom/google/android/gms/internal/ap;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ap;->fa:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/v;J)V

    goto :goto_2

    :cond_6
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ce;->gI:Z

    if-nez v0, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/ce;->errorCode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    iget-object v1, p1, Lcom/google/android/gms/internal/ce;->gB:Lcom/google/android/gms/internal/v;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/s;->d(Lcom/google/android/gms/internal/v;)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v0, :cond_8

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/r;->b(Lcom/google/android/gms/internal/ce;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/r;->a(I)V

    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fp:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fp:Lcom/google/android/gms/internal/ar;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ar;->a(Lcom/google/android/gms/internal/aq;)V

    :cond_9
    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->fp:Lcom/google/android/gms/internal/ar;

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/google/android/gms/internal/ce;->fp:Lcom/google/android/gms/internal/ar;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ar;->a(Lcom/google/android/gms/internal/aq;)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object p1, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v0, :cond_b

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/r;->b(Z)V

    :cond_b
    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->L()V

    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ek:Lcom/google/android/gms/internal/ae;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ek:Lcom/google/android/gms/internal/ae;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ae;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/v;)Z
    .locals 11

    const/4 v9, 0x1

    const/4 v2, 0x0

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_1

    const-string v0, "An ad request is already in progress. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_2

    const-string v0, "An interstitial is already loading. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Starting ad request."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/s;->cancel()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/r;->c(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/bu$a;

    move-result-object v10

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v3, Lcom/google/android/gms/internal/r$a;->ef:Lcom/google/android/gms/internal/h;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v5, v3, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;ZZLcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/co;)Lcom/google/android/gms/internal/cq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p0

    move-object v4, p0

    move v5, v9

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/cr;->a(Lcom/google/android/gms/internal/q;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/ag;Lcom/google/android/gms/internal/bl;Z)V

    move-object v3, v6

    :goto_1
    iget-object v6, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v2, v1, Lcom/google/android/gms/internal/r$a;->ef:Lcom/google/android/gms/internal/h;

    iget-object v4, p0, Lcom/google/android/gms/internal/r;->dZ:Lcom/google/android/gms/internal/aw;

    move-object v1, v10

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/bp;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bu$a;Lcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/bp$a;)Lcom/google/android/gms/internal/cg;

    move-result-object v0

    iput-object v0, v6, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    move v2, v9

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/cq;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/cq;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v3, v3, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;)V

    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v3

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move v8, v2

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/cr;->a(Lcom/google/android/gms/internal/q;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/ag;Lcom/google/android/gms/internal/bl;Z)V

    move-object v3, v0

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v1, v0}, Landroid/widget/ViewSwitcher;->removeView(Landroid/view/View;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v4, v3, Lcom/google/android/gms/internal/r$a;->ef:Lcom/google/android/gms/internal/h;

    iget-object v3, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v5, v3, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;ZZLcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/co;)Lcom/google/android/gms/internal/cq;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/r;->b(Landroid/view/View;)V

    goto :goto_2
.end method

.method public b(Lcom/google/android/gms/internal/v;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ci;->am()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/r;->a(Lcom/google/android/gms/internal/v;)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "Ad is not visible. Not refreshing ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/s;->d(Lcom/google/android/gms/internal/v;)V

    goto :goto_0
.end method

.method public destroy()V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/r$a;->eh:Lcom/google/android/gms/internal/ab;

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/r$a;->ek:Lcom/google/android/gms/internal/ae;

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->eb:Lcom/google/android/gms/internal/s;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/s;->cancel()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/r;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-virtual {v0}, Landroid/widget/ViewSwitcher;->removeAllViews()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->destroy()V

    :cond_1
    return-void
.end method

.method public isReady()Z
    .locals 1

    const-string v0, "isReady must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public pause()V
    .locals 1

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->a(Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->b(Landroid/webkit/WebView;)V

    :cond_0
    return-void
.end method

.method public showInterstitial()V
    .locals 7

    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot call showInterstitial on a banner ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-nez v0, :cond_1

    const-string v0, "The interstitial has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->az()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "The interstitial is already showing."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cq;->i(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ce;->gI:Z

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fn:Lcom/google/android/gms/internal/ax;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ax;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->O()V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/bh;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v4, v1, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget v5, v1, Lcom/google/android/gms/internal/ce;->orientation:I

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v6, v1, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/bh;-><init>(Lcom/google/android/gms/internal/q;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/cq;ILcom/google/android/gms/internal/co;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/bf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bh;)V

    goto :goto_0
.end method

.method public stopLoading()V
    .locals 2

    const-string v0, "stopLoading must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/r$a;->ej:Lcom/google/android/gms/internal/ce;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ei:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->cancel()V

    :cond_1
    return-void
.end method

.method public y()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/r;->N()V

    return-void
.end method

.method public z()Lcom/google/android/gms/dynamic/b;
    .locals 1

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/internal/dm;->w(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r;->ea:Lcom/google/android/gms/internal/r$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/c;->g(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    return-object v0
.end method
