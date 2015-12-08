.class public Lcom/google/android/gms/internal/dn;
.super Lcom/google/android/gms/internal/em;

# interfaces
.implements Lcom/google/android/gms/internal/dp$a;
.implements Lcom/google/android/gms/internal/ey$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/dn$a;
    }
.end annotation


# instance fields
.field private final kB:Lcom/google/android/gms/internal/bt;

.field private final lN:Lcom/google/android/gms/internal/ex;

.field private final ls:Ljava/lang/Object;

.field private final mContext:Landroid/content/Context;

.field private nf:Lcom/google/android/gms/internal/bm;

.field private final pA:Lcom/google/android/gms/internal/k;

.field private pB:Lcom/google/android/gms/internal/em;

.field private pC:Lcom/google/android/gms/internal/du;

.field private pD:Z

.field private pE:Lcom/google/android/gms/internal/bk;

.field private pF:Lcom/google/android/gms/internal/bq;

.field private final px:Lcom/google/android/gms/internal/dm$a;

.field private final py:Ljava/lang/Object;

.field private final pz:Lcom/google/android/gms/internal/ds$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds$a;Lcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ex;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/dm$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/em;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->py:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dn;->pD:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/dn;->kB:Lcom/google/android/gms/internal/bt;

    iput-object p6, p0, Lcom/google/android/gms/internal/dn;->px:Lcom/google/android/gms/internal/dm$a;

    iput-object p4, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    iput-object p1, p0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/dn;->pz:Lcom/google/android/gms/internal/ds$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/dn;->pA:Lcom/google/android/gms/internal/k;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ds;)Lcom/google/android/gms/internal/al;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v0, v0, Lcom/google/android/gms/internal/du;->qj:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "The ad response must specify one of the supported ad sizes."

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v0, v0, Lcom/google/android/gms/internal/du;->qj:Ljava/lang/String;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not parse the ad size from the ad response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qj:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    iget-object v0, p1, Lcom/google/android/gms/internal/ds;->kT:Lcom/google/android/gms/internal/al;

    iget-object v6, v0, Lcom/google/android/gms/internal/al;->mg:[Lcom/google/android/gms/internal/al;

    array-length v7, v6

    move v2, v3

    :goto_0
    if-ge v2, v7, :cond_5

    aget-object v8, v6, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    iget v0, v8, Lcom/google/android/gms/internal/al;->width:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_2

    iget v0, v8, Lcom/google/android/gms/internal/al;->widthPixels:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    float-to-int v0, v0

    :goto_1
    iget v9, v8, Lcom/google/android/gms/internal/al;->height:I

    const/4 v10, -0x2

    if-ne v9, v10, :cond_3

    iget v9, v8, Lcom/google/android/gms/internal/al;->heightPixels:I

    int-to-float v9, v9

    div-float v1, v9, v1

    float-to-int v1, v1

    :goto_2
    if-ne v4, v0, :cond_4

    if-ne v5, v1, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/al;

    iget-object v1, p1, Lcom/google/android/gms/internal/ds;->kT:Lcom/google/android/gms/internal/al;

    iget-object v1, v1, Lcom/google/android/gms/internal/al;->mg:[Lcom/google/android/gms/internal/al;

    invoke-direct {v0, v8, v1}, Lcom/google/android/gms/internal/al;-><init>(Lcom/google/android/gms/internal/al;[Lcom/google/android/gms/internal/al;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not parse the ad size from the ad response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qj:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    iget v0, v8, Lcom/google/android/gms/internal/al;->width:I

    goto :goto_1

    :cond_3
    iget v1, v8, Lcom/google/android/gms/internal/al;->height:I

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The ad size from the ad response was not one of the requested sizes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qj:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/dn;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/ds;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->py:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/bk;

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/dn;->kB:Lcom/google/android/gms/internal/bt;

    iget-object v4, p0, Lcom/google/android/gms/internal/dn;->nf:Lcom/google/android/gms/internal/bm;

    invoke-direct {v0, v2, p1, v3, v4}, Lcom/google/android/gms/internal/bk;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/bm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->pE:Lcom/google/android/gms/internal/bk;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pE:Lcom/google/android/gms/internal/bk;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, p2, p3, v2, v3}, Lcom/google/android/gms/internal/bk;->a(JJ)Lcom/google/android/gms/internal/bq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    iget v0, v0, Lcom/google/android/gms/internal/bq;->nL:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mediation result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    iget v2, v2, Lcom/google/android/gms/internal/bq;->nL:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "No fill from any mediation ad networks."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/dm$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->px:Lcom/google/android/gms/internal/dm$a;

    return-object v0
.end method

.method private bn()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v0, v0, Lcom/google/android/gms/internal/du;->errorCode:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v0, v0, Lcom/google/android/gms/internal/du;->qe:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "No fill from ad server."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/du;->qg:Z

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/bm;

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v1, v1, Lcom/google/android/gms/internal/du;->qe:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bm;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->nf:Lcom/google/android/gms/internal/bm;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not parse mediation config: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qe:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/du;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    return-object v0
.end method

.method private c(J)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

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
    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "Ad request cancelled."

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/dn;)Lcom/google/android/gms/internal/ex;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    return-object v0
.end method

.method private e(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/dn$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/dn$3;-><init>(Lcom/google/android/gms/internal/dn;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/dn;->h(J)V

    return-void
.end method

.method private g(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/dn;->c(J)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "Timed out waiting for ad response."

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->py:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/internal/dn;->pB:Lcom/google/android/gms/internal/em;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v0, v0, Lcom/google/android/gms/internal/du;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v0, v0, Lcom/google/android/gms/internal/du;->errorCode:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "There was a problem getting an ad response. ErrorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v2, v2, Lcom/google/android/gms/internal/du;->errorCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v2, v2, Lcom/google/android/gms/internal/du;->errorCode:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    return-void
.end method

.method private h(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/dn;->c(J)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "Timed out waiting for WebView to finish loading."

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/dn;->pD:Z

    if-eqz v0, :cond_0

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/du;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "Received ad response."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

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

.method public a(Lcom/google/android/gms/internal/ex;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "WebView finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dn;->pD:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

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

.method public bh()V
    .locals 31

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->ls:Ljava/lang/Object;

    move-object/from16 v30, v0

    monitor-enter v30

    :try_start_0
    const-string v2, "AdLoaderBackgroundTask started."

    invoke-static {v2}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pA:Lcom/google/android/gms/internal/k;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/k;->z()Lcom/google/android/gms/internal/g;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    new-instance v12, Lcom/google/android/gms/internal/ds;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/dn;->pz:Lcom/google/android/gms/internal/ds$a;

    invoke-direct {v12, v4, v3, v2}, Lcom/google/android/gms/internal/ds;-><init>(Lcom/google/android/gms/internal/ds$a;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    const/4 v6, -0x2

    const-wide/16 v4, -0x1

    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    invoke-static {v2, v12, v0}, Lcom/google/android/gms/internal/dp;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/dn;->py:Ljava/lang/Object;

    monitor-enter v7
    :try_end_1
    .catch Lcom/google/android/gms/internal/dn$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/dn;->pB:Lcom/google/android/gms/internal/em;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pB:Lcom/google/android/gms/internal/em;

    if-nez v2, :cond_1

    new-instance v2, Lcom/google/android/gms/internal/dn$a;

    const-string v6, "Could not start the ad request service."

    const/4 v8, 0x0

    invoke-direct {v2, v6, v8}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v2

    :catchall_0
    move-exception v2

    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v2
    :try_end_3
    .catch Lcom/google/android/gms/internal/dn$a; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catch_0
    move-exception v2

    :try_start_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/dn$a;->getErrorCode()I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_0

    const/4 v7, -0x1

    if-ne v6, v7, :cond_5

    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/dn$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    if-nez v2, :cond_6

    new-instance v2, Lcom/google/android/gms/internal/du;

    invoke-direct {v2, v6}, Lcom/google/android/gms/internal/du;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    :goto_1
    sget-object v2, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v7, Lcom/google/android/gms/internal/dn$1;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lcom/google/android/gms/internal/dn$1;-><init>(Lcom/google/android/gms/internal/dn;)V

    invoke-virtual {v2, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-wide/from16 v24, v4

    move-object/from16 v21, v3

    :goto_2
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qo:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result v2

    if-nez v2, :cond_7

    :try_start_5
    new-instance v29, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v2, v2, Lcom/google/android/gms/internal/du;->qo:Ljava/lang/String;

    move-object/from16 v0, v29

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    :try_start_6
    new-instance v2, Lcom/google/android/gms/internal/ef;

    iget-object v3, v12, Lcom/google/android/gms/internal/ds;->pX:Lcom/google/android/gms/internal/ai;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v5, v5, Lcom/google/android/gms/internal/du;->nt:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v7, v7, Lcom/google/android/gms/internal/du;->nu:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-object v8, v8, Lcom/google/android/gms/internal/du;->qi:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget v9, v9, Lcom/google/android/gms/internal/du;->orientation:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-wide v10, v10, Lcom/google/android/gms/internal/du;->nx:J

    iget-object v12, v12, Lcom/google/android/gms/internal/ds;->qa:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-boolean v13, v13, Lcom/google/android/gms/internal/du;->qg:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    if-eqz v14, :cond_8

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    iget-object v14, v14, Lcom/google/android/gms/internal/bq;->nM:Lcom/google/android/gms/internal/bl;

    :goto_4
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    if-eqz v15, :cond_9

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    iget-object v15, v15, Lcom/google/android/gms/internal/bq;->nN:Lcom/google/android/gms/internal/bu;

    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    move-object/from16 v16, v0

    if-eqz v16, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->nO:Ljava/lang/String;

    move-object/from16 v16, v0

    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->nf:Lcom/google/android/gms/internal/bm;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    move-object/from16 v18, v0

    if-eqz v18, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pF:Lcom/google/android/gms/internal/bq;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->nP:Lcom/google/android/gms/internal/bo;

    move-object/from16 v18, v0

    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/google/android/gms/internal/du;->qh:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/google/android/gms/internal/du;->qf:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/google/android/gms/internal/du;->qk:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lcom/google/android/gms/internal/du;->ql:Ljava/lang/String;

    move-object/from16 v28, v0

    invoke-direct/range {v2 .. v29}, Lcom/google/android/gms/internal/ef;-><init>(Lcom/google/android/gms/internal/ai;Lcom/google/android/gms/internal/ex;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/bu;Ljava/lang/String;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/bo;JLcom/google/android/gms/internal/al;JJJLjava/lang/String;Lorg/json/JSONObject;)V

    sget-object v3, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/dn$2;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/dn$2;-><init>(Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/ef;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v30
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return-void

    :cond_1
    :try_start_7
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/internal/dn;->g(J)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/dn;->bn()V

    iget-object v2, v12, Lcom/google/android/gms/internal/ds;->kT:Lcom/google/android/gms/internal/al;

    iget-object v2, v2, Lcom/google/android/gms/internal/al;->mg:[Lcom/google/android/gms/internal/al;

    if-eqz v2, :cond_2

    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/dn;->a(Lcom/google/android/gms/internal/ds;)Lcom/google/android/gms/internal/al;

    move-result-object v3

    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/du;->qg:Z

    if-eqz v2, :cond_3

    move-object/from16 v0, p0

    invoke-direct {v0, v12, v8, v9}, Lcom/google/android/gms/internal/dn;->a(Lcom/google/android/gms/internal/ds;J)V

    :goto_8
    move-wide/from16 v24, v4

    move-object/from16 v21, v3

    goto/16 :goto_2

    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/du;->qm:Z

    if-eqz v2, :cond_4

    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v9}, Lcom/google/android/gms/internal/dn;->f(J)V
    :try_end_8
    .catch Lcom/google/android/gms/internal/dn$a; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v2

    :try_start_9
    monitor-exit v30
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v2

    :cond_4
    :try_start_a
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/internal/dn;->e(J)V
    :try_end_a
    .catch Lcom/google/android/gms/internal/dn$a; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_8

    :cond_5
    :try_start_b
    invoke-virtual {v2}, Lcom/google/android/gms/internal/dn$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    new-instance v2, Lcom/google/android/gms/internal/du;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    iget-wide v8, v7, Lcom/google/android/gms/internal/du;->nx:J

    invoke-direct {v2, v6, v8, v9}, Lcom/google/android/gms/internal/du;-><init>(IJ)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/dn;->pC:Lcom/google/android/gms/internal/du;

    goto/16 :goto_1

    :catch_1
    move-exception v2

    const-string v4, "Error parsing the JSON for Active View."

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/eu;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :cond_7
    move-object/from16 v29, v3

    goto/16 :goto_3

    :cond_8
    const/4 v14, 0x0

    goto/16 :goto_4

    :cond_9
    const/4 v15, 0x0

    goto/16 :goto_5

    :cond_a
    const/16 v16, 0x0

    goto/16 :goto_6

    :cond_b
    const/16 v18, 0x0

    goto/16 :goto_7
.end method

.method protected f(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dn$a;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/al;->mf:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/do;

    iget-object v3, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/google/android/gms/internal/do;-><init>(Lcom/google/android/gms/internal/ey$a;Lcom/google/android/gms/internal/ex;II)V

    sget-object v0, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/dn$4;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/dn$4;-><init>(Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/do;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/dn;->h(J)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/do;->bq()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Ad-Network indicated no fill with passback URL."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "AdNetwork sent passback url"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/internal/al;->widthPixels:I

    iget v0, v0, Lcom/google/android/gms/internal/al;->heightPixels:I

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/do;->br()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dn$a;

    const-string v1, "AdNetwork timed out"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dn$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dn;->py:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pB:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pB:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->lN:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pE:Lcom/google/android/gms/internal/bk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dn;->pE:Lcom/google/android/gms/internal/bk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bk;->cancel()V

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
