.class public final Lcom/google/android/gms/internal/an;
.super Ljava/lang/Object;


# instance fields
.field private final dZ:Lcom/google/android/gms/internal/aw;

.field private final eI:Lcom/google/android/gms/internal/bu;

.field private final eJ:Ljava/lang/Object;

.field private final eK:Lcom/google/android/gms/internal/ap;

.field private eL:Z

.field private eM:Lcom/google/android/gms/internal/as;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/ap;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/an;->eJ:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->eL:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/an;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/an;->eI:Lcom/google/android/gms/internal/bu;

    iput-object p3, p0, Lcom/google/android/gms/internal/an;->dZ:Lcom/google/android/gms/internal/aw;

    iput-object p4, p0, Lcom/google/android/gms/internal/an;->eK:Lcom/google/android/gms/internal/ap;

    return-void
.end method


# virtual methods
.method public a(JJ)Lcom/google/android/gms/internal/at;
    .locals 11

    const-string v0, "Starting mediation."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->eK:Lcom/google/android/gms/internal/ap;

    iget-object v0, v0, Lcom/google/android/gms/internal/ap;->eU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ao;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying mediation network: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v5, Lcom/google/android/gms/internal/ao;->eP:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    iget-object v0, v5, Lcom/google/android/gms/internal/ao;->eQ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v10, p0, Lcom/google/android/gms/internal/an;->eJ:Ljava/lang/Object;

    monitor-enter v10

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/an;->eL:Z

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/at;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/at;-><init>(I)V

    monitor-exit v10

    :goto_1
    return-object v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/as;

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/an;->dZ:Lcom/google/android/gms/internal/aw;

    iget-object v4, p0, Lcom/google/android/gms/internal/an;->eK:Lcom/google/android/gms/internal/ap;

    iget-object v6, p0, Lcom/google/android/gms/internal/an;->eI:Lcom/google/android/gms/internal/bu;

    iget-object v6, v6, Lcom/google/android/gms/internal/bu;->gB:Lcom/google/android/gms/internal/v;

    iget-object v7, p0, Lcom/google/android/gms/internal/an;->eI:Lcom/google/android/gms/internal/bu;

    iget-object v7, v7, Lcom/google/android/gms/internal/bu;->ed:Lcom/google/android/gms/internal/x;

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/as;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/an;->eM:Lcom/google/android/gms/internal/as;

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->eM:Lcom/google/android/gms/internal/as;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/as;->b(JJ)Lcom/google/android/gms/internal/at;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/internal/at;->fl:I

    if-nez v1, :cond_3

    const-string v1, "Adapter succeeded."

    invoke-static {v1}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/at;->fn:Lcom/google/android/gms/internal/ax;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/an$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/an$1;-><init>(Lcom/google/android/gms/internal/an;Lcom/google/android/gms/internal/at;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/at;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/at;-><init>(I)V

    goto :goto_1
.end method

.method public cancel()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->eJ:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->eL:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->eM:Lcom/google/android/gms/internal/as;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->eM:Lcom/google/android/gms/internal/as;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/as;->cancel()V

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
