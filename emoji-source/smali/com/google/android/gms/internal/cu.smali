.class public Lcom/google/android/gms/internal/cu;
.super Lcom/google/android/gms/internal/dd$a;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private oX:Lcom/google/android/gms/internal/dg;

.field private oY:Lcom/google/android/gms/internal/cr;

.field private final oZ:Lcom/google/android/gms/internal/cx;

.field private final og:Landroid/app/Activity;

.field private pb:Lcom/google/android/gms/internal/cz;

.field private ph:Landroid/content/Context;

.field private pi:Lcom/google/android/gms/internal/db;

.field private pj:Lcom/google/android/gms/internal/cv;

.field private pk:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/dd$a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cx;->k(Landroid/content/Context;)Lcom/google/android/gms/internal/cx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cu;->oZ:Lcom/google/android/gms/internal/cx;

    return-void
.end method

.method public static a(Landroid/content/Context;ZLcom/google/android/gms/internal/cq;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.purchase.InAppPurchaseActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.purchase.useClientJar"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/cq;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private a(Ljava/lang/String;ZILandroid/content/Intent;)V
    .locals 8

    :try_start_0
    iget-object v7, p0, Lcom/google/android/gms/internal/cu;->oX:Lcom/google/android/gms/internal/dg;

    new-instance v0, Lcom/google/android/gms/internal/cw;

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->ph:Landroid/content/Context;

    iget-object v6, p0, Lcom/google/android/gms/internal/cu;->pj:Lcom/google/android/gms/internal/cv;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/cw;-><init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/cv;)V

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/dg;->a(Lcom/google/android/gms/internal/df;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Fail to invoke PlayStorePurchaseListener."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v3, 0x0

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    :try_start_0
    invoke-static {p3}, Lcom/google/android/gms/internal/cy;->c(Landroid/content/Intent;)I

    move-result v0

    const/4 v1, -0x1

    if-ne p2, v1, :cond_2

    if-nez v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pb:Lcom/google/android/gms/internal/cz;

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    invoke-virtual {v1, v2, p2, p3}, Lcom/google/android/gms/internal/cz;->a(Ljava/lang/String;ILandroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v1}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2, p2, p3}, Lcom/google/android/gms/internal/cu;->a(Ljava/lang/String;ZILandroid/content/Intent;)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/db;->recordPlayBillingResolution(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v3, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_1
    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v1}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p2, p3}, Lcom/google/android/gms/internal/cu;->a(Ljava/lang/String;ZILandroid/content/Intent;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v0, "Fail to process purchase result."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-object v3, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_1

    :cond_2
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->oZ:Lcom/google/android/gms/internal/cx;

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->pj:Lcom/google/android/gms/internal/cv;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v1}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p2, p3}, Lcom/google/android/gms/internal/cu;->a(Ljava/lang/String;ZILandroid/content/Intent;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v3, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    throw v0
.end method

.method public onCreate()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cq;->b(Landroid/content/Intent;)Lcom/google/android/gms/internal/cq;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/cq;->kX:Lcom/google/android/gms/internal/dg;

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->oX:Lcom/google/android/gms/internal/dg;

    iget-object v1, v0, Lcom/google/android/gms/internal/cq;->kZ:Lcom/google/android/gms/internal/cz;

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->pb:Lcom/google/android/gms/internal/cz;

    iget-object v1, v0, Lcom/google/android/gms/internal/cq;->oT:Lcom/google/android/gms/internal/db;

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    new-instance v1, Lcom/google/android/gms/internal/cr;

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/cr;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v0, v0, Lcom/google/android/gms/internal/cq;->oU:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/cu;->ph:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v0, p0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 8
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/cr;->o(Landroid/os/IBinder;)V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->pb:Lcom/google/android/gms/internal/cz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cz;->bm()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v3}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/cr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const-string v1, "BUY_INTENT"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Landroid/app/PendingIntent;

    move-object v2, v0

    if-nez v2, :cond_0

    invoke-static {v3}, Lcom/google/android/gms/internal/cy;->a(Landroid/os/Bundle;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/db;->recordPlayBillingResolution(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v2}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v2, v3, v1, v4}, Lcom/google/android/gms/internal/cu;->a(Ljava/lang/String;ZILandroid/content/Intent;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/cv;

    iget-object v3, p0, Lcom/google/android/gms/internal/cu;->pi:Lcom/google/android/gms/internal/db;

    invoke-interface {v3}, Lcom/google/android/gms/internal/db;->getProductId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/cu;->pk:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/cv;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/cu;->pj:Lcom/google/android/gms/internal/cv;

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->oZ:Lcom/google/android/gms/internal/cx;

    iget-object v3, p0, Lcom/google/android/gms/internal/cu;->pj:Lcom/google/android/gms/internal/cv;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/cx;->b(Lcom/google/android/gms/internal/cv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    const/16 v3, 0x3e9

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual/range {v1 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_1
    const-string v2, "Error when connecting in-app billing service"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/cu;->og:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    const-string v0, "In-app billing service disconnected."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cu;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    return-void
.end method
