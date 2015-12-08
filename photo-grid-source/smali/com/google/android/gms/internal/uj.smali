.class public final Lcom/google/android/gms/internal/uj;
.super Lcom/google/android/gms/common/api/h;


# instance fields
.field private final A:Lcom/google/android/gms/common/internal/al;

.field final a:Lcom/google/android/gms/common/internal/ak;

.field final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/android/gms/internal/ut",
            "<*>;>;"
        }
    .end annotation
.end field

.field c:Lcom/google/android/gms/internal/ur;

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/d",
            "<*>;",
            "Lcom/google/android/gms/common/api/c;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/d",
            "<*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field final g:Lcom/google/android/gms/common/internal/w;

.field final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final i:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b",
            "<+",
            "Lcom/google/android/gms/internal/xi;",
            "Lcom/google/android/gms/internal/xj;",
            ">;"
        }
    .end annotation
.end field

.field final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/ut",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/concurrent/locks/Lock;

.field private final l:Ljava/util/concurrent/locks/Condition;

.field private final m:I

.field private final n:Landroid/content/Context;

.field private final o:Landroid/os/Looper;

.field private volatile p:Z

.field private q:J

.field private r:J

.field private final s:Lcom/google/android/gms/internal/uo;

.field private final t:Lcom/google/android/gms/common/b;

.field private volatile u:Lcom/google/android/gms/internal/uu;

.field private v:Lcom/google/android/gms/common/ConnectionResult;

.field private final w:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/uy",
            "<*>;>;"
        }
    .end annotation
.end field

.field private x:Lcom/google/android/gms/common/api/u;

.field private final y:Lcom/google/android/gms/internal/us;

.field private final z:Lcom/google/android/gms/common/api/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/b;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/internal/w;",
            "Lcom/google/android/gms/common/b;",
            "Lcom/google/android/gms/common/api/b",
            "<+",
            "Lcom/google/android/gms/internal/xi;",
            "Lcom/google/android/gms/internal/xj;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/k;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/l;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/common/api/h;-><init>()V

    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->b:Ljava/util/Queue;

    const-wide/32 v2, 0x1d4c0

    iput-wide v2, p0, Lcom/google/android/gms/internal/uj;->q:J

    const-wide/16 v2, 0x1388

    iput-wide v2, p0, Lcom/google/android/gms/internal/uj;->r:J

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->f:Ljava/util/Set;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->v:Lcom/google/android/gms/common/ConnectionResult;

    new-instance v2, Ljava/util/WeakHashMap;

    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->w:Ljava/util/Set;

    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v3, 0x10

    const/high16 v4, 0x3f400000    # 0.75f

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    new-instance v2, Lcom/google/android/gms/internal/uk;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/uk;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->y:Lcom/google/android/gms/internal/us;

    new-instance v2, Lcom/google/android/gms/internal/ul;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ul;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->z:Lcom/google/android/gms/common/api/k;

    new-instance v2, Lcom/google/android/gms/internal/um;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/um;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->A:Lcom/google/android/gms/common/internal/al;

    iput-object p1, p0, Lcom/google/android/gms/internal/uj;->n:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/common/internal/ak;

    iget-object v3, p0, Lcom/google/android/gms/internal/uj;->A:Lcom/google/android/gms/common/internal/al;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/common/internal/ak;-><init>(Landroid/os/Looper;Lcom/google/android/gms/common/internal/al;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    iput-object p2, p0, Lcom/google/android/gms/internal/uj;->o:Landroid/os/Looper;

    new-instance v2, Lcom/google/android/gms/internal/uo;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/uo;-><init>(Lcom/google/android/gms/internal/uj;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    move-object/from16 v0, p4

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->t:Lcom/google/android/gms/common/b;

    move/from16 v0, p9

    iput v0, p0, Lcom/google/android/gms/internal/uj;->m:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->h:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->l:Ljava/util/concurrent/locks/Condition;

    new-instance v2, Lcom/google/android/gms/internal/ui;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ui;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/k;

    iget-object v4, p0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/internal/ak;->a(Lcom/google/android/gms/common/api/k;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p8 .. p8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/l;

    iget-object v4, p0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/internal/ak;->a(Lcom/google/android/gms/common/api/l;)V

    goto :goto_1

    :cond_1
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/common/internal/w;->e()Ljava/util/Map;

    move-result-object v11

    invoke-interface/range {p6 .. p6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/common/api/a;

    move-object/from16 v0, p6

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v2, 0x0

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/internal/x;

    iget-boolean v2, v2, Lcom/google/android/gms/common/internal/x;->b:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :goto_3
    move v3, v2

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/uj;->h:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/google/android/gms/common/api/a;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v10}, Lcom/google/android/gms/common/api/a;->b()Lcom/google/android/gms/common/api/f;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/internal/uj;->z:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, v10, v3}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/common/api/a;I)Lcom/google/android/gms/common/api/l;

    move-result-object v7

    .line 1000
    new-instance v2, Lcom/google/android/gms/common/internal/d;

    invoke-interface {v4}, Lcom/google/android/gms/common/api/f;->b()I

    move-result v5

    invoke-interface {v4}, Lcom/google/android/gms/common/api/f;->a()Lcom/google/android/gms/common/api/e;

    move-result-object v9

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v8, p3

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/common/internal/d;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/k;Lcom/google/android/gms/common/api/l;Lcom/google/android/gms/common/internal/w;Lcom/google/android/gms/common/api/e;)V

    .line 0
    :goto_5
    iget-object v3, p0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-virtual {v10}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    goto :goto_3

    :cond_3
    invoke-virtual {v10}, Lcom/google/android/gms/common/api/a;->a()Lcom/google/android/gms/common/api/b;

    move-result-object v2

    iget-object v7, p0, Lcom/google/android/gms/internal/uj;->z:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, v10, v3}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/common/api/a;I)Lcom/google/android/gms/common/api/l;

    move-result-object v8

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    .line 2000
    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/common/api/b;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Ljava/lang/Object;Lcom/google/android/gms/common/api/k;Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/c;

    move-result-object v2

    goto :goto_5

    .line 0
    :cond_4
    move-object/from16 v0, p3

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->g:Lcom/google/android/gms/common/internal/w;

    move-object/from16 v0, p5

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->i:Lcom/google/android/gms/common/api/b;

    return-void

    :cond_5
    move v3, v2

    goto :goto_4
.end method

.method private a(Lcom/google/android/gms/common/api/a;I)Lcom/google/android/gms/common/api/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<*>;I)",
            "Lcom/google/android/gms/common/api/l;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/un;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/un;-><init>(Lcom/google/android/gms/internal/uj;Lcom/google/android/gms/common/api/a;I)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/uj;)Lcom/google/android/gms/common/api/u;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->x:Lcom/google/android/gms/common/api/u;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/uj;)Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/uj;)Lcom/google/android/gms/internal/uu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/uj;)V
    .locals 2

    .prologue
    .line 0
    .line 6000
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 7000
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/uj;->p:Z

    .line 6000
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/uj;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/uj;)V
    .locals 2

    .prologue
    .line 0
    .line 8000
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/uj;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/uj;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public final a()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->o:Landroid/os/Looper;

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/common/api/d;)Lcom/google/android/gms/common/api/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/google/android/gms/common/api/c;",
            ">(",
            "Lcom/google/android/gms/common/api/d",
            "<TC;>;)TC;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    const-string v1, "Appropriate Api was not requested."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/to;)Lcom/google/android/gms/internal/to;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/c;",
            "R::",
            "Lcom/google/android/gms/common/api/r;",
            "T:",
            "Lcom/google/android/gms/internal/to",
            "<TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/to;->b()Lcom/google/android/gms/common/api/d;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This task can not be enqueued (it\'s probably a Batch or malformed)"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/to;->b()Lcom/google/android/gms/common/api/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "GoogleApiClient is not configured to use the API required for this call."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/uu;->a(Lcom/google/android/gms/internal/to;)Lcom/google/android/gms/internal/to;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/uj;->v:Lcom/google/android/gms/common/ConnectionResult;

    new-instance v0, Lcom/google/android/gms/internal/ui;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ui;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/uu;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->l:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final a(Lcom/google/android/gms/common/api/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/ak;->a(Lcom/google/android/gms/common/api/l;)V

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/up;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/uo;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/uo;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/ut;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/c;",
            ">(",
            "Lcom/google/android/gms/internal/ut",
            "<TA;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->y:Lcom/google/android/gms/internal/us;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/us;)V

    return-void
.end method

.method final a(Ljava/lang/RuntimeException;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/uo;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/uo;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "mState="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/uu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    const-string v0, " mResuming="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/uj;->p:Z

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mWorkQueue.size()="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mUnconsumedRunners.size()="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/common/api/c;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/uu;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final b(Lcom/google/android/gms/common/api/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/ak;->b(Lcom/google/android/gms/common/api/l;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/uj;->j()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/uu;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method final d()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ut;

    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/us;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->a()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->f()V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->c()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->b()Lcom/google/android/gms/common/api/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/common/api/d;)Lcom/google/android/gms/common/api/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/api/c;->zznz()Landroid/os/IBinder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/uj;->x:Lcom/google/android/gms/common/api/u;

    .line 3000
    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->e()Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/uq;

    invoke-direct {v4, v0, v3, v2, v6}, Lcom/google/android/gms/internal/uq;-><init>(Lcom/google/android/gms/internal/ut;Lcom/google/android/gms/common/api/u;Landroid/os/IBinder;B)V

    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/us;)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Lcom/google/android/gms/internal/uq;

    invoke-direct {v4, v0, v3, v2, v6}, Lcom/google/android/gms/internal/uq;-><init>(Lcom/google/android/gms/internal/ut;Lcom/google/android/gms/common/api/u;Landroid/os/IBinder;B)V

    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/us;)V

    const/4 v5, 0x0

    :try_start_0
    invoke-interface {v2, v4, v5}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->f()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/u;->a()V

    goto :goto_0

    :cond_2
    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/ut;->a(Lcom/google/android/gms/internal/us;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->f()V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/u;->a()V

    goto :goto_0

    .line 0
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->w:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/uy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uy;->a()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->w:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method final e()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/tu;

    iget-object v2, p0, Lcom/google/android/gms/internal/uj;->g:Lcom/google/android/gms/common/internal/w;

    iget-object v3, p0, Lcom/google/android/gms/internal/uj;->h:Ljava/util/Map;

    iget-object v4, p0, Lcom/google/android/gms/internal/uj;->t:Lcom/google/android/gms/common/b;

    iget-object v5, p0, Lcom/google/android/gms/internal/uj;->i:Lcom/google/android/gms/common/api/b;

    iget-object v6, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    iget-object v7, p0, Lcom/google/android/gms/internal/uj;->n:Landroid/content/Context;

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/tu;-><init>(Lcom/google/android/gms/internal/uj;Lcom/google/android/gms/common/internal/w;Ljava/util/Map;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/b;Ljava/util/concurrent/locks/Lock;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/uu;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->l:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method final f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/uj;->j()Z

    new-instance v0, Lcom/google/android/gms/internal/ts;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ts;-><init>(Lcom/google/android/gms/internal/uj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/uu;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->l:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->k:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->u:Lcom/google/android/gms/internal/uu;

    instance-of v0, v0, Lcom/google/android/gms/internal/ts;

    return v0
.end method

.method final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/uj;->p:Z

    return v0
.end method

.method final i()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 0
    .line 4000
    iget-boolean v0, p0, Lcom/google/android/gms/internal/uj;->p:Z

    .line 0
    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/uj;->p:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->c:Lcom/google/android/gms/internal/ur;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ur;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ur;-><init>(Lcom/google/android/gms/internal/uj;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ux;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ux;)Lcom/google/android/gms/internal/ux;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ur;

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->c:Lcom/google/android/gms/internal/ur;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/uo;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/uj;->q:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/uo;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    iget-object v1, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/uo;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/uj;->r:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/uo;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0
.end method

.method final j()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 0
    .line 5000
    iget-boolean v2, p0, Lcom/google/android/gms/internal/uj;->p:Z

    .line 0
    if-nez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/uj;->p:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/uo;->removeMessages(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->s:Lcom/google/android/gms/internal/uo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/uo;->removeMessages(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->c:Lcom/google/android/gms/internal/ur;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/uj;->c:Lcom/google/android/gms/internal/ur;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ur;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/uj;->c:Lcom/google/android/gms/internal/ur;

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method final k()Ljava/lang/String;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    const-string v1, ""

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p0, v1, v3, v2, v3}, Lcom/google/android/gms/internal/uj;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
