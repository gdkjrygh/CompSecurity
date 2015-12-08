.class public Lcom/google/android/gms/internal/cs;
.super Lcom/google/android/gms/internal/em;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final ls:Ljava/lang/Object;

.field private mContext:Landroid/content/Context;

.field private oW:Z

.field private oX:Lcom/google/android/gms/internal/dg;

.field private oY:Lcom/google/android/gms/internal/cr;

.field private oZ:Lcom/google/android/gms/internal/cx;

.field private pa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/cv;",
            ">;"
        }
    .end annotation
.end field

.field private pb:Lcom/google/android/gms/internal/cz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/dg;Lcom/google/android/gms/internal/cz;)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/em;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cs;->oW:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/cs;->pa:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/cs;->oX:Lcom/google/android/gms/internal/dg;

    iput-object p3, p0, Lcom/google/android/gms/internal/cs;->pb:Lcom/google/android/gms/internal/cz;

    new-instance v0, Lcom/google/android/gms/internal/cr;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/cr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/cx;->k(Landroid/content/Context;)Lcom/google/android/gms/internal/cx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cs;->oZ:Lcom/google/android/gms/internal/cx;

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oZ:Lcom/google/android/gms/internal/cx;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/cx;->d(J)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cs;->pa:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/cz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->pb:Lcom/google/android/gms/internal/cz;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/cv;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "RESPONSE_CODE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "INAPP_PURCHASE_DATA"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "INAPP_DATA_SIGNATURE"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/cs$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/cs$1;-><init>(Lcom/google/android/gms/internal/cs;Lcom/google/android/gms/internal/cv;Landroid/content/Intent;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/cs;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private b(J)V
    .locals 1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/cs;->c(J)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Timeout waiting for pending transaction to be processed."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/cs;->oW:Z

    if-eqz v0, :cond_0

    return-void
.end method

.method private bi()V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->pa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->pa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cv;

    iget-object v2, v0, Lcom/google/android/gms/internal/cv;->pn:Ljava/lang/String;

    invoke-virtual {v6, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    iget-object v2, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/cr;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/cs;->oZ:Lcom/google/android/gms/internal/cx;

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cv;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cv;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lcom/google/android/gms/internal/cy;->a(Landroid/os/Bundle;)I

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string v1, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    move v4, v0

    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_6

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/cv;

    invoke-static {v1}, Lcom/google/android/gms/internal/cy;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iget-object v11, v3, Lcom/google/android/gms/internal/cv;->pm:Ljava/lang/String;

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-direct {p0, v3, v1, v2}, Lcom/google/android/gms/internal/cs;->a(Lcom/google/android/gms/internal/cv;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_3

    :cond_6
    if-eqz v5, :cond_3

    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, v5

    goto/16 :goto_1
.end method

.method static synthetic c(Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/dg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oX:Lcom/google/android/gms/internal/dg;

    return-object v0
.end method

.method private c(J)Z
    .locals 5

    const-wide/32 v0, 0xea60

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "waitWithTimeout_lock interrupted"

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public bh()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/cs;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/cr;->o(Landroid/os/IBinder;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/cs;->bi()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cs;->oW:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .prologue
    const-string v0, "In-app billing service disconnected."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cs;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cs;->oY:Lcom/google/android/gms/internal/cr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->destroy()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
