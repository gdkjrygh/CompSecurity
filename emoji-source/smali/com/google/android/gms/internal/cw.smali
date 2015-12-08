.class public final Lcom/google/android/gms/internal/cw;
.super Lcom/google/android/gms/internal/df$a;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private mContext:Landroid/content/Context;

.field private oY:Lcom/google/android/gms/internal/cr;

.field private pf:Ljava/lang/String;

.field private pj:Lcom/google/android/gms/internal/cv;

.field private po:Z

.field private pp:I

.field private pq:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/cv;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/df$a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cw;->po:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/cw;->pf:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/cw;->pp:I

    iput-object p5, p0, Lcom/google/android/gms/internal/cw;->pq:Landroid/content/Intent;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/cw;->po:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/internal/cw;->pj:Lcom/google/android/gms/internal/cv;

    return-void
.end method


# virtual methods
.method public finishPurchase()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->pq:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/cy;->c(Landroid/content/Intent;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/cw;->pp:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/cr;

    iget-object v1, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cw;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->pf:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseData()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->pq:Landroid/content/Intent;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/cw;->pp:I

    return v0
.end method

.method public isVerified()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cw;->po:Z

    return v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    const-string v0, "In-app billing service connected."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/cr;->o(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->pq:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/cy;->d(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cy;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/cw;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v2, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/cr;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/cx;->k(Landroid/content/Context;)Lcom/google/android/gms/internal/cx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/cw;->pj:Lcom/google/android/gms/internal/cv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cv;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    const-string v0, "In-app billing service disconnected."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cw;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    return-void
.end method
