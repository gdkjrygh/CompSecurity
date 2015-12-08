.class public final Lcom/google/android/gms/internal/bk;
.super Ljava/lang/Object;


# instance fields
.field private final kB:Lcom/google/android/gms/internal/bt;

.field private final ls:Ljava/lang/Object;

.field private final mContext:Landroid/content/Context;

.field private final ne:Lcom/google/android/gms/internal/ds;

.field private final nf:Lcom/google/android/gms/internal/bm;

.field private ng:Z

.field private nh:Lcom/google/android/gms/internal/bp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/bm;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bk;->ls:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bk;->ng:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/bk;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/bk;->ne:Lcom/google/android/gms/internal/ds;

    iput-object p3, p0, Lcom/google/android/gms/internal/bk;->kB:Lcom/google/android/gms/internal/bt;

    iput-object p4, p0, Lcom/google/android/gms/internal/bk;->nf:Lcom/google/android/gms/internal/bm;

    return-void
.end method


# virtual methods
.method public a(JJ)Lcom/google/android/gms/internal/bq;
    .locals 17

    const-string v4, "Starting mediation."

    invoke-static {v4}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bk;->nf:Lcom/google/android/gms/internal/bm;

    iget-object v4, v4, Lcom/google/android/gms/internal/bm;->nr:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/bl;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Trying mediation network: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/bl;->nl:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    iget-object v4, v9, Lcom/google/android/gms/internal/bl;->nm:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_1
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/bk;->ls:Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/google/android/gms/internal/bk;->ng:Z

    if-eqz v4, :cond_2

    new-instance v4, Lcom/google/android/gms/internal/bq;

    const/4 v5, -0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/bq;-><init>(I)V

    monitor-exit v15

    :goto_1
    return-object v4

    :cond_2
    new-instance v4, Lcom/google/android/gms/internal/bp;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/bk;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/bk;->kB:Lcom/google/android/gms/internal/bt;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/bk;->nf:Lcom/google/android/gms/internal/bm;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/bk;->ne:Lcom/google/android/gms/internal/ds;

    iget-object v10, v10, Lcom/google/android/gms/internal/ds;->pX:Lcom/google/android/gms/internal/ai;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/internal/bk;->ne:Lcom/google/android/gms/internal/ds;

    iget-object v11, v11, Lcom/google/android/gms/internal/ds;->kT:Lcom/google/android/gms/internal/al;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/internal/bk;->ne:Lcom/google/android/gms/internal/ds;

    iget-object v12, v12, Lcom/google/android/gms/internal/ds;->kQ:Lcom/google/android/gms/internal/ev;

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/bp;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/bt;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/ai;Lcom/google/android/gms/internal/al;Lcom/google/android/gms/internal/ev;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/google/android/gms/internal/bk;->nh:Lcom/google/android/gms/internal/bp;

    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/bk;->nh:Lcom/google/android/gms/internal/bp;

    move-wide/from16 v0, p1

    move-wide/from16 v2, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/bp;->b(JJ)Lcom/google/android/gms/internal/bq;

    move-result-object v4

    iget v5, v4, Lcom/google/android/gms/internal/bq;->nL:I

    if-nez v5, :cond_3

    const-string v5, "Adapter succeeded."

    invoke-static {v5}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    :cond_3
    iget-object v5, v4, Lcom/google/android/gms/internal/bq;->nN:Lcom/google/android/gms/internal/bu;

    if-eqz v5, :cond_1

    sget-object v5, Lcom/google/android/gms/internal/et;->sv:Landroid/os/Handler;

    new-instance v6, Lcom/google/android/gms/internal/bk$1;

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v4}, Lcom/google/android/gms/internal/bk$1;-><init>(Lcom/google/android/gms/internal/bk;Lcom/google/android/gms/internal/bq;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Lcom/google/android/gms/internal/bq;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/bq;-><init>(I)V

    goto :goto_1
.end method

.method public cancel()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/bk;->ls:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/bk;->ng:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bk;->nh:Lcom/google/android/gms/internal/bp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bk;->nh:Lcom/google/android/gms/internal/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bp;->cancel()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
