.class public final Lcom/google/android/gms/internal/bq;
.super Lcom/google/android/gms/internal/cg;

# interfaces
.implements Lcom/google/android/gms/internal/br$a;
.implements Lcom/google/android/gms/internal/cr$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bq$a;
    }
.end annotation


# instance fields
.field private final dZ:Lcom/google/android/gms/internal/aw;

.field private final eJ:Ljava/lang/Object;

.field private eK:Lcom/google/android/gms/internal/ap;

.field private final fG:Lcom/google/android/gms/internal/cq;

.field private final gm:Lcom/google/android/gms/internal/bp$a;

.field private final gn:Lcom/google/android/gms/internal/bu$a;

.field private final go:Lcom/google/android/gms/internal/h;

.field private gp:Lcom/google/android/gms/internal/cg;

.field private gq:Lcom/google/android/gms/internal/bw;

.field private gr:Z

.field private gs:Lcom/google/android/gms/internal/an;

.field private gt:Lcom/google/android/gms/internal/at;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu$a;Lcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/bp$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/cg;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bq;->gr:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/bq;->dZ:Lcom/google/android/gms/internal/aw;

    iput-object p6, p0, Lcom/google/android/gms/internal/bq;->gm:Lcom/google/android/gms/internal/bp$a;

    iput-object p4, p0, Lcom/google/android/gms/internal/bq;->fG:Lcom/google/android/gms/internal/cq;

    iput-object p1, p0, Lcom/google/android/gms/internal/bq;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/bq;->gn:Lcom/google/android/gms/internal/bu$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/bq;->go:Lcom/google/android/gms/internal/h;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/bq;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/bu;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/an;

    iget-object v1, p0, Lcom/google/android/gms/internal/bq;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->dZ:Lcom/google/android/gms/internal/aw;

    iget-object v3, p0, Lcom/google/android/gms/internal/bq;->eK:Lcom/google/android/gms/internal/ap;

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/an;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/ap;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bq;->gs:Lcom/google/android/gms/internal/an;

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gs:Lcom/google/android/gms/internal/an;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, p2, p3, v1, v2}, Lcom/google/android/gms/internal/an;->a(JJ)Lcom/google/android/gms/internal/at;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    iget v0, v0, Lcom/google/android/gms/internal/at;->fl:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mediation result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    iget v2, v2, Lcom/google/android/gms/internal/at;->fl:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    const-string v1, "No fill from any mediation ad networks."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ad()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v0, v0, Lcom/google/android/gms/internal/bw;->errorCode:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v0, v0, Lcom/google/android/gms/internal/bw;->gG:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    const-string v1, "No fill from ad server."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/bw;->gI:Z

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ap;

    iget-object v1, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v1, v1, Lcom/google/android/gms/internal/bw;->gG:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ap;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bq;->eK:Lcom/google/android/gms/internal/ap;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not parse mediation config: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v2, v2, Lcom/google/android/gms/internal/bw;->gG:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/bq;)Lcom/google/android/gms/internal/bp$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gm:Lcom/google/android/gms/internal/bp$a;

    return-object v0
.end method

.method private b(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/bq$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/bq$3;-><init>(Lcom/google/android/gms/internal/bq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/bq;->d(J)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/bq;)Lcom/google/android/gms/internal/bw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    return-object v0
.end method

.method private c(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
        }
    .end annotation

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/bq;->e(J)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    const-string v1, "Timed out waiting for ad response."

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/bq;->gp:Lcom/google/android/gms/internal/cg;

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v0, v0, Lcom/google/android/gms/internal/bw;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v0, v0, Lcom/google/android/gms/internal/bw;->errorCode:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "There was a problem getting an ad response. ErrorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v2, v2, Lcom/google/android/gms/internal/bw;->errorCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v2, v2, Lcom/google/android/gms/internal/bw;->errorCode:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/bq;)Lcom/google/android/gms/internal/cq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->fG:Lcom/google/android/gms/internal/cq;

    return-object v0
.end method

.method private d(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
        }
    .end annotation

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/bq;->e(J)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    const-string v1, "Timed out waiting for WebView to finish loading."

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/bq;->gr:Z

    if-eqz v0, :cond_0

    return-void
.end method

.method private e(J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bq$a;
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
    iget-object v2, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/bq$a;

    const-string v1, "Ad request cancelled."

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/bw;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "Received ad response."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

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

.method public a(Lcom/google/android/gms/internal/cq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "WebView finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bq;->gr:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

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

.method public ac()V
    .locals 24

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    move-object/from16 v23, v0

    monitor-enter v23

    :try_start_0
    const-string v2, "AdLoaderBackgroundTask started."

    invoke-static {v2}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/bq;->go:Lcom/google/android/gms/internal/h;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/h;->g()Lcom/google/android/gms/internal/d;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/bq;->mContext:Landroid/content/Context;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    new-instance v12, Lcom/google/android/gms/internal/bu;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/bq;->gn:Lcom/google/android/gms/internal/bu$a;

    invoke-direct {v12, v3, v2}, Lcom/google/android/gms/internal/bu;-><init>(Lcom/google/android/gms/internal/bu$a;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, -0x2

    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bq;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    invoke-static {v4, v12, v0}, Lcom/google/android/gms/internal/br;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)Lcom/google/android/gms/internal/cg;

    move-result-object v4

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/google/android/gms/internal/bq;->gp:Lcom/google/android/gms/internal/cg;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bq;->gp:Lcom/google/android/gms/internal/cg;

    if-nez v4, :cond_1

    new-instance v2, Lcom/google/android/gms/internal/bq$a;

    const-string v3, "Could not start the ad request service."

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/bq$a;-><init>(Ljava/lang/String;I)V

    throw v2
    :try_end_1
    .catch Lcom/google/android/gms/internal/bq$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/bq$a;->getErrorCode()I

    move-result v6

    const/4 v3, 0x3

    if-eq v6, v3, :cond_0

    const/4 v3, -0x1

    if-ne v6, v3, :cond_3

    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/bq$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/bw;

    invoke-direct {v2, v6}, Lcom/google/android/gms/internal/bw;-><init>(I)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    sget-object v2, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/bq$1;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/bq$1;-><init>(Lcom/google/android/gms/internal/bq;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1
    new-instance v2, Lcom/google/android/gms/internal/ce;

    iget-object v3, v12, Lcom/google/android/gms/internal/bu;->gB:Lcom/google/android/gms/internal/v;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bq;->fG:Lcom/google/android/gms/internal/cq;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v5, v5, Lcom/google/android/gms/internal/bw;->eW:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v7, v7, Lcom/google/android/gms/internal/bw;->eX:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-object v8, v8, Lcom/google/android/gms/internal/bw;->gK:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget v9, v9, Lcom/google/android/gms/internal/bw;->orientation:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-wide v10, v10, Lcom/google/android/gms/internal/bw;->fa:J

    iget-object v12, v12, Lcom/google/android/gms/internal/bu;->gE:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-boolean v13, v13, Lcom/google/android/gms/internal/bw;->gI:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    if-eqz v14, :cond_4

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    iget-object v14, v14, Lcom/google/android/gms/internal/at;->fm:Lcom/google/android/gms/internal/ao;

    :goto_2
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    if-eqz v15, :cond_5

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    iget-object v15, v15, Lcom/google/android/gms/internal/at;->fn:Lcom/google/android/gms/internal/ax;

    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    move-object/from16 v16, v0

    if-eqz v16, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/google/android/gms/internal/at;->fo:Ljava/lang/String;

    move-object/from16 v16, v0

    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->eK:Lcom/google/android/gms/internal/ap;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    move-object/from16 v18, v0

    if-eqz v18, :cond_7

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gt:Lcom/google/android/gms/internal/at;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/google/android/gms/internal/at;->fp:Lcom/google/android/gms/internal/ar;

    move-object/from16 v18, v0

    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/google/android/gms/internal/bw;->gJ:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    move-object/from16 v21, v0

    move-object/from16 v0, v21

    iget-wide v0, v0, Lcom/google/android/gms/internal/bw;->gH:J

    move-wide/from16 v21, v0

    invoke-direct/range {v2 .. v22}, Lcom/google/android/gms/internal/ce;-><init>(Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/cq;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/ax;Ljava/lang/String;Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/ar;JJ)V

    sget-object v3, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/bq$2;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/bq$2;-><init>(Lcom/google/android/gms/internal/bq;Lcom/google/android/gms/internal/ce;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v23
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :cond_1
    :try_start_3
    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/bq;->c(J)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/bq;->ad()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bq;->gq:Lcom/google/android/gms/internal/bw;

    iget-boolean v4, v4, Lcom/google/android/gms/internal/bw;->gI:Z

    if-eqz v4, :cond_2

    move-object/from16 v0, p0

    invoke-direct {v0, v12, v2, v3}, Lcom/google/android/gms/internal/bq;->a(Lcom/google/android/gms/internal/bu;J)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/bq$a; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v2

    :try_start_4
    monitor-exit v23
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v2

    :cond_2
    :try_start_5
    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/bq;->b(J)V
    :try_end_5
    .catch Lcom/google/android/gms/internal/bq$a; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_1

    :cond_3
    :try_start_6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/bq$a;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_0

    :cond_4
    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_5
    const/4 v15, 0x0

    goto/16 :goto_3

    :cond_6
    const/16 v16, 0x0

    goto :goto_4

    :cond_7
    const/16 v18, 0x0

    goto :goto_5
.end method

.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bq;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gp:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gp:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->stopLoading()V

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->fG:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gs:Lcom/google/android/gms/internal/an;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bq;->gs:Lcom/google/android/gms/internal/an;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/an;->cancel()V

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
