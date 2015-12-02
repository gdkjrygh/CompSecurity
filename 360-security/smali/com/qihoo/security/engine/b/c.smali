.class public Lcom/qihoo/security/engine/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/engine/a$a;
.implements Lcom/qihoo/security/engine/b/e$a;


# static fields
.field public static c:Z

.field public static n:Z


# instance fields
.field final a:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo/security/services/c;",
            ">;"
        }
    .end annotation
.end field

.field b:Z

.field public final d:Landroid/content/Context;

.field public volatile e:Lcom/qihoo/security/services/d;

.field public final f:Lcom/qihoo/security/engine/e/c;

.field public final g:Lcom/qihoo/security/engine/b/e;

.field public final h:Lcom/qihoo/security/engine/b/d;

.field public final i:Lcom/qihoo/security/engine/b/g;

.field public final j:Lcom/qihoo/security/engine/b/b;

.field public volatile k:Z

.field public volatile l:Z

.field public m:Lcom/qihoo360/common/d/a;

.field private final o:Ljava/lang/Runnable;

.field private final p:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile s:Z

.field private volatile t:Z

.field private final u:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/engine/b/c;->c:Z

    sput-boolean v0, Lcom/qihoo/security/engine/b/c;->n:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    new-instance v0, Lcom/qihoo/security/engine/b/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/c$1;-><init>(Lcom/qihoo/security/engine/b/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->o:Ljava/lang/Runnable;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->b:Z

    new-instance v0, Lcom/qihoo/security/engine/e/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/e/c;-><init>(Lcom/qihoo/security/engine/b/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    new-instance v0, Lcom/qihoo/security/engine/b/e;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/e;-><init>(Lcom/qihoo/security/engine/b/e$a;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->p:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->q:Ljava/util/concurrent/ConcurrentHashMap;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->l:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->s:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->t:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->m:Lcom/qihoo360/common/d/a;

    iput-object p1, p0, Lcom/qihoo/security/engine/b/c;->d:Landroid/content/Context;

    new-instance v0, Lcom/qihoo/security/engine/b/b;

    invoke-direct {v0, p1, p0}, Lcom/qihoo/security/engine/b/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/engine/b/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    new-instance v0, Lcom/qihoo/security/engine/b/d;

    invoke-direct {v0, p0, p2}, Lcom/qihoo/security/engine/b/d;-><init>(Lcom/qihoo/security/engine/b/c;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    new-instance v0, Lcom/qihoo/security/engine/b/g;

    invoke-direct {v0, p0, p2}, Lcom/qihoo/security/engine/b/g;-><init>(Lcom/qihoo/security/engine/b/c;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    iput-object p2, p0, Lcom/qihoo/security/engine/b/c;->u:Landroid/os/Handler;

    return-void
.end method

.method private p()V
    .locals 11

    const/4 v2, 0x0

    sget-object v4, Lcom/qihoo/security/engine/cloudscan/NetQuery;->COMMON_OPTIONS:[Ljava/lang/String;

    array-length v5, v4

    move v3, v2

    :goto_0
    if-lt v3, v5, :cond_0

    return-void

    :cond_0
    aget-object v6, v4, v3

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    new-array v7, v1, [I

    fill-array-data v7, :array_0

    array-length v8, v7

    move v1, v2

    :goto_1
    if-ge v1, v8, :cond_1

    aget v9, v7, v1

    invoke-virtual {p0, v9}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v10

    if-eqz v10, :cond_3

    :try_start_0
    iget-object v10, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v10}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v10

    invoke-interface {v10, v9, v6, v0}, Lcom/qihoo/security/services/a;->a(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    move-exception v9

    goto :goto_2

    :array_0
    .array-data 4
        0x2
        0x7
    .end array-data
.end method

.method private q()V
    .locals 1

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v1}, Lcom/qihoo/security/services/d;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->s:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->m()V

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->c()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v1}, Lcom/qihoo/security/services/d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    const v0, -0x7fffbffb

    goto :goto_0
.end method

.method public a(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/DeepScanItem;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, -0x7fff0001

    :goto_0
    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const v0, -0x7ff8ffa9

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->l:Z

    if-eqz v0, :cond_3

    const v0, -0x7ffffff6

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->l:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/env/QVSEnv$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/env/QVSEnv;->LAST_UPDATE_TIME_STAMP:Ljava/lang/String;

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/c;->q()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->a()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/b;->a()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/b;->b()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/DeepScanItem;

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/engine/b/b;->a(Lcom/qihoo/security/services/DeepScanItem;)V

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string/jumbo v0, "engine.enabled"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    iget-object v1, v1, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "query.network.stat"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_1
    const-string/jumbo v1, "network"

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v4, 0x0

    const-string/jumbo v0, "engine.enabled"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x3a

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    const-string/jumbo v3, "1"

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v1, v0}, Lcom/qihoo/security/engine/e/c;->a(IZ)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, v1, v4}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public a(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/qihoo/security/engine/e/c;->a(IILjava/util/List;)I

    goto :goto_0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/c;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/services/c;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public a(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    :try_start_0
    invoke-interface {v1, v0}, Lcom/qihoo/security/services/a;->a(Lcom/qihoo/security/services/ScanResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(ILjava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    sget-boolean v2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v0, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p3}, Lcom/qihoo/security/engine/b/c;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/engine/a;)V
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/e;->a(Lcom/qihoo/security/engine/a;)V

    goto :goto_0
.end method

.method a(Lcom/qihoo/security/services/ScanProgress;Z)V
    .locals 4

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v2

    :try_start_0
    iget-object v3, p1, Lcom/qihoo/security/services/ScanProgress;->result:Lcom/qihoo/security/services/ScanResult;

    sget-boolean v1, Lcom/qihoo/security/engine/b/c;->n:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    iput v1, v3, Lcom/qihoo/security/services/ScanResult;->rescan:I

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    move v1, v0

    :goto_1
    if-lt v1, v3, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    move v1, v0

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/c;

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/c;->a(Lcom/qihoo/security/services/ScanProgress;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method public a(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(I)Z
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    return v0
.end method

.method public a(Lcom/qihoo/security/services/c;)Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gtz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/engine/b/g;->a(J)V

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->d(I)I

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->d(I)I

    :cond_2
    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->d(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->c()V

    :cond_4
    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(Lcom/qihoo/security/services/c;)V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    return-void
.end method

.method b(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->c()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g;->c()V

    iput-boolean v3, p0, Lcom/qihoo/security/engine/b/c;->l:Z

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v8, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v8

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v9

    move v7, v3

    :goto_1
    if-lt v7, v9, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    return-void

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    sget-boolean v1, Lcom/qihoo/security/engine/b/c;->n:Z

    if-eqz v1, :cond_1

    move v1, v2

    :goto_3
    iput v1, v0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v5

    move v6, v3

    :goto_4
    add-int/lit16 v0, v6, 0xc8

    if-le v5, v0, :cond_3

    move v1, v2

    move v4, v0

    :goto_5
    :try_start_2
    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->b:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_4

    :try_start_3
    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_3
    move v1, v3

    move v4, v5

    goto :goto_5

    :cond_4
    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v7}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/c;

    invoke-interface {p1, v6, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v6

    invoke-interface {v0, v6, v1}, Lcom/qihoo/security/services/c;->a(Ljava/util/List;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_6
    if-nez v1, :cond_5

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_6

    :cond_5
    move v6, v4

    goto :goto_4
.end method

.method public c(Ljava/lang/String;)I
    .locals 5

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/c;->q()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x40

    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/engine/d/b;

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lcom/qihoo/security/engine/d/b;-><init>(II)V

    new-instance v3, Lcom/qihoo/security/engine/FileInfo;

    invoke-direct {v3, v0, v1}, Lcom/qihoo/security/engine/FileInfo;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V

    iput-object v3, v2, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/b/d;->c(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/engine/d/b;)I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/e/c;->f()Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const v0, -0x7ff8ffa9

    goto :goto_0
.end method

.method public c()V
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    new-instance v0, Lcom/qihoo/security/engine/b/a;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->d:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/qihoo/security/engine/b/a;-><init>(Landroid/content/Context;Lcom/qihoo/security/engine/b/c;)V

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->a(I)I

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->c(I)I

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->a(I)I

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->c(I)I

    :cond_1
    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->a(I)I

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->c(I)I

    const/4 v1, 0x6

    const-string/jumbo v2, "workmode"

    const-string/jumbo v3, "ds"

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/services/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    :cond_2
    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Lcom/qihoo/security/engine/b/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->a(I)I

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->c(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/SysInfo;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string/jumbo v1, "1"

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    const-string/jumbo v0, "5"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string/jumbo v0, "6"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string/jumbo v0, "7"

    sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string/jumbo v0, "8"

    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "||"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/c;->p()V

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->b:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->b()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->b()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->b:Z

    sput-boolean v4, Lcom/qihoo/security/engine/b/c;->n:Z

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/c;->q()V

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->n()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v6}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v6}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/b/b;->a()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/b;->b()V

    :goto_2
    iput-boolean v4, p0, Lcom/qihoo/security/engine/b/c;->s:Z

    :cond_5
    return-void

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/DeepScanItem;

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/engine/b/b;->a(Lcom/qihoo/security/services/DeepScanItem;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->m()V

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->c()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->e()V

    const/4 v0, 0x0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 4

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/c;->q()V

    :try_start_0
    new-instance v0, Lcom/qihoo/security/engine/d/b;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/engine/d/b;-><init>(II)V

    new-instance v1, Lcom/qihoo/security/engine/FileInfo;

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-direct {v1, p1, v2, v3}, Lcom/qihoo/security/engine/FileInfo;-><init>(Ljava/lang/String;II)V

    iput-object v1, v0, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/qihoo/security/engine/b/d;->c(I)V

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/engine/d/b;)I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/e/c;->f()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const v0, -0x7ff8ffa9

    goto :goto_0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->d()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->f()V

    const/4 v0, 0x0

    return v0
.end method

.method public f()I
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->b:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->t:Z

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/e/c;->a()V

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/b/b;->c()V

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/b/e;->a()V

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/b/d;->c()V

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    const-wide/16 v4, 0x64

    invoke-virtual {v2, v4, v5}, Lcom/qihoo/security/engine/b/g;->a(J)V

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->o()V

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->b()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->b()V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/b;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->u:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->o:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->j:Lcom/qihoo/security/engine/b/b;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/b;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->o()V

    :cond_0
    return-void
.end method

.method k()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->f()Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->b()V

    goto :goto_0
.end method

.method l()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->g:Lcom/qihoo/security/engine/b/e;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/c;->o()V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 4

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/c;

    invoke-interface {v0}, Lcom/qihoo/security/services/c;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method n()V
    .locals 3

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    monitor-exit v1

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public o()V
    .locals 4

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->b:Z

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->l:Z

    iget-object v2, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    monitor-enter v2

    :try_start_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->t:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/c;->k:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    move v1, v0

    :goto_1
    if-lt v1, v3, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/c;->t:Z

    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/c;->a:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/c;

    invoke-interface {v0}, Lcom/qihoo/security/services/c;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2
.end method
