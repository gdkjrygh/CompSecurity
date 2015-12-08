.class public Lcom/google/android/gms/internal/fz;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fz$a;
    }
.end annotation


# instance fields
.field private final mH:Ljava/lang/Object;

.field private uQ:Z

.field private final vL:Lcom/google/android/gms/internal/ga;

.field private final vM:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/google/android/gms/internal/fz$a;",
            ">;"
        }
    .end annotation
.end field

.field private final vN:Ljava/lang/String;

.field private final vO:Ljava/lang/String;

.field private vP:J

.field private vQ:J

.field private vR:J

.field private vS:J

.field private vT:J

.field private vU:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ga;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-wide/16 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vP:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vQ:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fz;->uQ:Z

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vR:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/fz;->vS:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vT:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    iput-object p1, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    iput-object p2, p0, Lcom/google/android/gms/internal/fz;->vN:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/fz;->vO:Ljava/lang/String;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fz;->vM:Ljava/util/LinkedList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ga;->dc()Lcom/google/android/gms/internal/ga;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/ga;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public cW()V
    .locals 6

    const-wide/16 v4, -0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vQ:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vQ:J

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-static {}, Lcom/google/android/gms/internal/ga;->dh()Lcom/google/android/gms/internal/gb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->cW()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public cX()V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fz$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fz$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fz$a;->db()V

    iget-object v2, p0, Lcom/google/android/gms/internal/fz;->vM:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vS:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vS:J

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-static {}, Lcom/google/android/gms/internal/ga;->dh()Lcom/google/android/gms/internal/gb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->cX()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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

.method public cY()V
    .locals 6

    const-wide/16 v4, -0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vM:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vM:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fz$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fz$a;->cZ()J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fz$a;->da()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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

.method public e(Lcom/google/android/gms/internal/av;)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vT:J

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-static {}, Lcom/google/android/gms/internal/ga;->dh()Lcom/google/android/gms/internal/gb;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vT:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/internal/gb;->b(Lcom/google/android/gms/internal/av;J)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public j(J)V
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/fz;->vU:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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

.method public k(J)V
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/google/android/gms/internal/fz;->vP:J

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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

.method public toBundle()Landroid/os/Bundle;
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "seq_num"

    iget-object v3, p0, Lcom/google/android/gms/internal/fz;->vN:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "slotid"

    iget-object v3, p0, Lcom/google/android/gms/internal/fz;->vO:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ismediation"

    iget-boolean v3, p0, Lcom/google/android/gms/internal/fz;->uQ:Z

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "treq"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vT:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "tresponse"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vU:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "timp"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vQ:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "tload"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vR:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "pcc"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vS:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "tfetch"

    iget-wide v4, p0, Lcom/google/android/gms/internal/fz;->vP:J

    invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vM:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fz$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fz$a;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    const-string v0, "tclick"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v2
.end method

.method public v(Z)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vR:J

    if-nez p1, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vR:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/fz;->vQ:J

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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

.method public w(Z)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/fz;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/fz;->vU:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/fz;->uQ:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/fz;->vL:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/internal/fz;)V

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
