.class public final Lcom/google/android/gms/internal/cp;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final lA:Lcom/google/android/gms/internal/cy;

.field private final mContext:Landroid/content/Context;

.field private final mH:Ljava/lang/Object;

.field private final qh:Lcom/google/android/gms/internal/fh;

.field private final qi:Lcom/google/android/gms/internal/cr;

.field private qj:Z

.field private qk:Lcom/google/android/gms/internal/cu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/cy;Lcom/google/android/gms/internal/cr;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cp;->mH:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cp;->qj:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/cp;->qh:Lcom/google/android/gms/internal/fh;

    iput-object p3, p0, Lcom/google/android/gms/internal/cp;->lA:Lcom/google/android/gms/internal/cy;

    iput-object p4, p0, Lcom/google/android/gms/internal/cp;->qi:Lcom/google/android/gms/internal/cr;

    return-void
.end method


# virtual methods
.method public a(JJ)Lcom/google/android/gms/internal/cv;
    .locals 17

    const-string v4, "Starting mediation."

    invoke-static {v4}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/cp;->qi:Lcom/google/android/gms/internal/cr;

    iget-object v4, v4, Lcom/google/android/gms/internal/cr;->qu:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/cq;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Trying mediation network: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/cq;->qo:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/gr;->U(Ljava/lang/String;)V

    iget-object v4, v9, Lcom/google/android/gms/internal/cq;->qp:Ljava/util/List;

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

    iget-object v15, v0, Lcom/google/android/gms/internal/cp;->mH:Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/google/android/gms/internal/cp;->qj:Z

    if-eqz v4, :cond_2

    new-instance v4, Lcom/google/android/gms/internal/cv;

    const/4 v5, -0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/cv;-><init>(I)V

    monitor-exit v15

    :goto_1
    return-object v4

    :cond_2
    new-instance v4, Lcom/google/android/gms/internal/cu;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/cp;->lA:Lcom/google/android/gms/internal/cy;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/cp;->qi:Lcom/google/android/gms/internal/cr;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/cp;->qh:Lcom/google/android/gms/internal/fh;

    iget-object v10, v10, Lcom/google/android/gms/internal/fh;->tL:Lcom/google/android/gms/internal/av;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/internal/cp;->qh:Lcom/google/android/gms/internal/fh;

    iget-object v11, v11, Lcom/google/android/gms/internal/fh;->lS:Lcom/google/android/gms/internal/ay;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/internal/cp;->qh:Lcom/google/android/gms/internal/fh;

    iget-object v12, v12, Lcom/google/android/gms/internal/fh;->lO:Lcom/google/android/gms/internal/gs;

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/cu;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/cy;Lcom/google/android/gms/internal/cr;Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/gs;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/google/android/gms/internal/cp;->qk:Lcom/google/android/gms/internal/cu;

    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/cp;->qk:Lcom/google/android/gms/internal/cu;

    move-wide/from16 v0, p1

    move-wide/from16 v2, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/cu;->b(JJ)Lcom/google/android/gms/internal/cv;

    move-result-object v4

    iget v5, v4, Lcom/google/android/gms/internal/cv;->qO:I

    if-nez v5, :cond_3

    const-string v5, "Adapter succeeded."

    invoke-static {v5}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    :cond_3
    iget-object v5, v4, Lcom/google/android/gms/internal/cv;->qQ:Lcom/google/android/gms/internal/cz;

    if-eqz v5, :cond_1

    sget-object v5, Lcom/google/android/gms/internal/gq;->wR:Landroid/os/Handler;

    new-instance v6, Lcom/google/android/gms/internal/cp$1;

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v4}, Lcom/google/android/gms/internal/cp$1;-><init>(Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/cv;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Lcom/google/android/gms/internal/cv;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/cv;-><init>(I)V

    goto :goto_1
.end method

.method public cancel()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mH:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/cp;->qj:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qk:Lcom/google/android/gms/internal/cu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qk:Lcom/google/android/gms/internal/cu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cu;->cancel()V

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
