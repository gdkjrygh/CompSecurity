.class public final Lcom/google/android/gms/internal/eg;
.super Lcom/google/android/gms/internal/eq$a;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private sF:Lcom/google/android/gms/internal/eb;

.field private sM:Ljava/lang/String;

.field private sQ:Lcom/google/android/gms/internal/ef;

.field private sW:Z

.field private sX:I

.field private sY:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/ef;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/eq$a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/eg;->sW:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/eg;->sM:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/eg;->sX:I

    iput-object p5, p0, Lcom/google/android/gms/internal/eg;->sY:Landroid/content/Intent;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/eg;->sW:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/internal/eg;->sQ:Lcom/google/android/gms/internal/ef;

    return-void
.end method


# virtual methods
.method public finishPurchase()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sY:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/ei;->d(Landroid/content/Intent;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/eg;->sX:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/eb;

    iget-object v1, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/eb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/eg;->sF:Lcom/google/android/gms/internal/eb;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sM:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseData()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sY:Landroid/content/Intent;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/eg;->sX:I

    return v0
.end method

.method public isVerified()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/eg;->sW:Z

    return v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    const-string v0, "In-app billing service connected."

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->U(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sF:Lcom/google/android/gms/internal/eb;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/eb;->t(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sY:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/ei;->e(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ei;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/eg;->sF:Lcom/google/android/gms/internal/eb;

    iget-object v2, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/eb;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/eh;->j(Landroid/content/Context;)Lcom/google/android/gms/internal/eh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/eg;->sQ:Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/eh;->a(Lcom/google/android/gms/internal/ef;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sF:Lcom/google/android/gms/internal/eb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eb;->destroy()V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    const-string v0, "In-app billing service disconnected."

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->U(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/eg;->sF:Lcom/google/android/gms/internal/eb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eb;->destroy()V

    return-void
.end method
