.class public final Lkik/a/g/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/p;
.implements Lkik/a/e/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/g/v$b;,
        Lkik/a/g/v$a;
    }
.end annotation


# static fields
.field private static final q:Lorg/c/b;


# instance fields
.field private A:Lcom/kik/g/k;

.field private B:Lcom/kik/g/k;

.field private C:Lcom/kik/g/k;

.field private final D:Lcom/kik/g/i;

.field private final E:Lcom/kik/g/i;

.field private final F:Lcom/kik/g/i;

.field private final G:Lcom/kik/g/i;

.field private a:Ljava/util/concurrent/ScheduledFuture;

.field private b:Ljava/util/Hashtable;

.field private c:Ljava/lang/String;

.field private d:J

.field private final e:Lkik/a/e/v;

.field private final f:Lkik/a/e/f;

.field private g:Lkik/a/e/k;

.field private final h:Ljava/lang/Object;

.field private i:Lcom/kik/g/p;

.field private j:Ljava/util/Map;

.field private k:Ljava/lang/Object;

.field private l:Lcom/kik/g/f;

.field private m:Ljava/util/LinkedHashMap;

.field private n:Z

.field private volatile o:J

.field private volatile p:Z

.field private r:Ljava/util/concurrent/ScheduledExecutorService;

.field private s:Z

.field private t:Lcom/kik/g/k;

.field private u:Lcom/kik/g/k;

.field private v:Lcom/kik/g/k;

.field private w:Lcom/kik/g/k;

.field private x:Lcom/kik/g/k;

.field private y:Lcom/kik/g/k;

.field private z:Lcom/kik/g/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 115
    const-string v0, "ProfileManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/g/v;->q:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/e/k;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .prologue
    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 102
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/g/v;->h:Ljava/lang/Object;

    .line 107
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    .line 112
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lkik/a/g/v;->o:J

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/g/v;->s:Z

    .line 1405
    new-instance v0, Lkik/a/g/aj;

    invoke-direct {v0, p0}, Lkik/a/g/aj;-><init>(Lkik/a/g/v;)V

    iput-object v0, p0, Lkik/a/g/v;->D:Lcom/kik/g/i;

    .line 1419
    new-instance v0, Lkik/a/g/ak;

    invoke-direct {v0, p0}, Lkik/a/g/ak;-><init>(Lkik/a/g/v;)V

    iput-object v0, p0, Lkik/a/g/v;->E:Lcom/kik/g/i;

    .line 1428
    new-instance v0, Lkik/a/g/am;

    invoke-direct {v0, p0}, Lkik/a/g/am;-><init>(Lkik/a/g/v;)V

    iput-object v0, p0, Lkik/a/g/v;->F:Lcom/kik/g/i;

    .line 1441
    new-instance v0, Lkik/a/g/an;

    invoke-direct {v0, p0}, Lkik/a/g/an;-><init>(Lkik/a/g/v;)V

    iput-object v0, p0, Lkik/a/g/v;->G:Lcom/kik/g/i;

    .line 123
    iput-object p1, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    .line 124
    iput-object p2, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    .line 125
    iput-object p3, p0, Lkik/a/g/v;->g:Lkik/a/e/k;

    .line 127
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/g/v;->j:Ljava/util/Map;

    .line 129
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->u:Lcom/kik/g/k;

    .line 130
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->t:Lcom/kik/g/k;

    .line 131
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->v:Lcom/kik/g/k;

    .line 132
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->w:Lcom/kik/g/k;

    .line 133
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->x:Lcom/kik/g/k;

    .line 134
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->y:Lcom/kik/g/k;

    .line 135
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->z:Lcom/kik/g/k;

    .line 136
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->A:Lcom/kik/g/k;

    .line 137
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->B:Lcom/kik/g/k;

    .line 138
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p4}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/v;->C:Lcom/kik/g/k;

    .line 140
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    .line 142
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    .line 143
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->r:Ljava/util/concurrent/ScheduledExecutorService;

    .line 144
    return-void
.end method

.method static synthetic a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method private a(Ljava/util/Set;)Ljava/util/Set;
    .locals 6

    .prologue
    .line 379
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 381
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 382
    iget-object v3, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    monitor-enter v3

    .line 383
    :try_start_0
    iget-object v4, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 384
    iget-object v4, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 391
    :goto_1
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 387
    :cond_0
    :try_start_1
    new-instance v4, Lcom/kik/g/p;

    invoke-direct {v4}, Lcom/kik/g/p;-><init>()V

    .line 388
    iget-object v5, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v0, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 392
    :cond_1
    invoke-virtual {p0}, Lkik/a/g/v;->m()V

    .line 396
    return-object v1
.end method

.method private a(Ljava/lang/String;ZLkik/a/e/r$a;Ljava/util/HashMap;)Lkik/a/d/k;
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 880
    invoke-virtual {p0, p1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 881
    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 883
    check-cast v0, Lkik/a/d/n;

    invoke-static {v0}, Lkik/a/d/n;->a(Lkik/a/d/n;)Lkik/a/d/n;

    move-result-object v0

    .line 889
    :goto_0
    invoke-interface {p3, v0}, Lkik/a/e/r$a;->a(Lkik/a/d/k;)V

    .line 891
    invoke-virtual {p0, v0, v2, p2}, Lkik/a/g/v;->a(Lkik/a/d/k;ZZ)Z

    move-result v0

    .line 893
    if-eqz v0, :cond_0

    .line 894
    iget-object v0, p0, Lkik/a/g/v;->t:Lcom/kik/g/k;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 897
    :cond_0
    if-eqz p2, :cond_1

    .line 898
    iget-object v2, p0, Lkik/a/g/v;->h:Ljava/lang/Object;

    monitor-enter v2

    .line 899
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->j:Ljava/util/Map;

    new-instance v3, Lkik/a/g/a;

    invoke-direct {v3, p1, p4}, Lkik/a/g/a;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    invoke-virtual {p0}, Lkik/a/g/v;->p()V

    .line 901
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 904
    :cond_1
    return-object v1

    .line 886
    :cond_2
    invoke-static {v1}, Lkik/a/d/k;->a(Lkik/a/d/k;)Lkik/a/d/k;

    move-result-object v0

    goto :goto_0

    .line 901
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lkik/a/g/v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V
    .locals 11

    .prologue
    .line 61
    iget-object v4, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-wide v6, p0, Lkik/a/g/v;->d:J

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/j;

    iget-object v5, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    if-eqz v2, :cond_0

    iget-object v5, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v5, v2}, Lkik/a/e/v;->d(Lkik/a/d/k;)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lkik/a/d/k;->d(Z)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lkik/a/d/k;->f(Z)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_1
    :try_start_1
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/j;

    iget-object v5, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    instance-of v5, v2, Lkik/a/d/n;

    if-eqz v5, :cond_2

    check-cast v2, Lkik/a/d/n;

    if-eqz v2, :cond_2

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lkik/a/d/n;->i(Z)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lkik/a/d/n;->d(Z)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lkik/a/d/n;->k(Z)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    if-eqz v2, :cond_4

    iget-object v3, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkik/a/d/k;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lkik/a/d/k;->h()Z

    move-result v3

    invoke-virtual {v2, v3}, Lkik/a/d/k;->a(Z)V

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    if-eqz p1, :cond_9

    iget-object v5, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v3, v2

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {p0, v2, v9, v10}, Lkik/a/g/v;->a(Lkik/a/d/k;ZZ)Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v3, :cond_7

    :cond_6
    const/4 v2, 0x1

    :goto_4
    move v3, v2

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v2, p1}, Lkik/a/e/v;->b(Ljava/util/List;)Z

    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v2, v3

    :cond_9
    if-eqz v2, :cond_a

    :try_start_3
    iget-object v2, p0, Lkik/a/g/v;->t:Lcom/kik/g/k;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_a
    iget-object v2, p0, Lkik/a/g/v;->B:Lcom/kik/g/k;

    invoke-virtual {v2, p2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    move-wide/from16 v0, p5

    iput-wide v0, p0, Lkik/a/g/v;->d:J

    move/from16 v0, p7

    iput-boolean v0, p0, Lkik/a/g/v;->p:Z

    iget-object v2, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    const-string v3, "ProfileManager.rosterTimeStamp"

    iget-wide v8, p0, Lkik/a/g/v;->d:J

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v5}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v3, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    const-string v5, "ProfileManager.rosterIsBatchedKey"

    iget-boolean v2, p0, Lkik/a/g/v;->p:Z

    if-eqz v2, :cond_c

    const-string v2, "1"

    :goto_5
    invoke-interface {v3, v5, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    if-eqz p7, :cond_e

    cmp-long v2, v6, p5

    if-nez v2, :cond_d

    sget-object v2, Lkik/a/g/v;->q:Lorg/c/b;

    const-string v3, "Server re-sent last roster timestamp: {}"

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v2, v3, v5}, Lorg/c/b;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    :goto_6
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :catchall_1
    move-exception v2

    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v2

    :cond_c
    const-string v2, "0"

    goto :goto_5

    :cond_d
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lkik/a/g/v;->a(ZZ)V

    goto :goto_6

    :cond_e
    iget-object v2, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    :cond_f
    :goto_7
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->g()Z

    move-result v6

    if-eqz v6, :cond_f

    instance-of v6, v2, Lkik/a/d/n;

    if-nez v6, :cond_f

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_10
    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v2

    if-lez v2, :cond_b

    invoke-direct {p0, v5}, Lkik/a/g/v;->a(Ljava/util/Set;)Ljava/util/Set;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6
.end method

.method private b(Ljava/util/Set;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 699
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-static {p1}, Lkik/a/f/f/f;->a(Ljava/util/Set;)Lkik/a/f/f/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    .line 700
    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/as;

    invoke-direct {v1, p0}, Lkik/a/g/as;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v1, Lkik/a/g/au;

    invoke-direct {v1, p0}, Lkik/a/g/au;-><init>(Lkik/a/g/v;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 703
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 909
    if-nez p1, :cond_0

    .line 914
    :goto_0
    return-void

    .line 912
    :cond_0
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->d(Lkik/a/d/k;)V

    .line 913
    iget-object v0, p0, Lkik/a/g/v;->C:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/a/g/v;)Z
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/g/v;->n:Z

    return v0
.end method

.method static synthetic c(Lkik/a/g/v;)Lkik/a/e/f;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    return-object v0
.end method

.method static synthetic d(Lkik/a/g/v;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lkik/a/g/v;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method static synthetic f(Lkik/a/g/v;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->A:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic g(Lkik/a/g/v;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    return-object v0
.end method

.method static synthetic h(Lkik/a/g/v;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic i(Lkik/a/g/v;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->y:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic j(Lkik/a/g/v;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->u:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic k(Lkik/a/g/v;)V
    .locals 5

    .prologue
    .line 61
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lkik/a/g/v;->s:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/g/v;->s:Z

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->g()Z

    move-result v4

    if-eqz v4, :cond_1

    instance-of v4, v0, Lkik/a/d/n;

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    const/16 v4, 0x32

    if-lt v0, v4, :cond_1

    invoke-direct {p0, v2}, Lkik/a/g/v;->b(Ljava/util/Set;)Lcom/kik/g/p;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_3

    invoke-direct {p0, v2}, Lkik/a/g/v;->b(Ljava/util/Set;)Lcom/kik/g/p;

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/g/v;->s:Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method static synthetic l(Lkik/a/g/v;)J
    .locals 2

    .prologue
    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/a/g/v;->d:J

    return-wide v0
.end method

.method static synthetic m(Lkik/a/g/v;)J
    .locals 2

    .prologue
    .line 61
    iget-wide v0, p0, Lkik/a/g/v;->d:J

    return-wide v0
.end method

.method static synthetic n(Lkik/a/g/v;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic o(Lkik/a/g/v;)J
    .locals 2

    .prologue
    .line 61
    iget-wide v0, p0, Lkik/a/g/v;->o:J

    return-wide v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lkik/a/g/v;->t:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 789
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 791
    if-eqz v0, :cond_0

    .line 792
    invoke-virtual {v0}, Lkik/a/d/k;->j()[B

    move-result-object v1

    .line 794
    if-eqz v1, :cond_0

    array-length v2, v1

    if-eqz v2, :cond_0

    .line 796
    :try_start_0
    invoke-static {v1}, Lkik/a/h/h;->a([B)Lorg/spongycastle/jce/interfaces/ECPublicKey;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 809
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    .line 800
    :cond_0
    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/k;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 806
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 809
    :cond_1
    invoke-virtual {p0, p1}, Lkik/a/g/v;->e(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/av;

    invoke-direct {v1, p0}, Lkik/a/g/av;-><init>(Lkik/a/g/v;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_1
.end method

.method public final a(Lkik/a/d/a/d;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 1262
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1263
    const-string v1, "type"

    invoke-virtual {p1}, Lkik/a/d/a/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1264
    const-string v1, "reply"

    invoke-virtual {p1}, Lkik/a/d/a/d;->f()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1265
    invoke-virtual {p1}, Lkik/a/d/a/d;->d()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lkik/a/g/v;->a(Lkik/a/d/j;Ljava/util/HashMap;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/d/j;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 1256
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/a/g/v;->a(Lkik/a/d/j;Ljava/util/HashMap;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/d/j;Ljava/util/HashMap;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 1271
    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-instance v2, Lkik/a/g/af;

    invoke-direct {v2, p0}, Lkik/a/g/af;-><init>(Lkik/a/g/v;)V

    invoke-direct {p0, v0, v1, v2, p2}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;Ljava/util/HashMap;)Lkik/a/d/k;

    move-result-object v0

    .line 1280
    iget-object v1, p0, Lkik/a/g/v;->x:Lcom/kik/g/k;

    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1282
    iget-object v1, p0, Lkik/a/g/v;->z:Lcom/kik/g/k;

    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1284
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/Set;Z)Ljava/util/Set;
    .locals 7

    .prologue
    .line 1361
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1362
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1364
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1365
    if-nez v0, :cond_0

    .line 1366
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get contact for null identifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1369
    :cond_0
    iget-object v5, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v5

    .line 1370
    :try_start_0
    iget-object v1, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/k;

    .line 1371
    if-nez v1, :cond_1

    if-eqz p2, :cond_1

    .line 1373
    const-string v1, "@groups.kik.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v6, -0x1

    if-eq v1, v6, :cond_3

    .line 1374
    invoke-static {v0}, Lkik/a/d/n;->h(Ljava/lang/String;)Lkik/a/d/n;

    move-result-object v1

    .line 1379
    :goto_1
    iget-object v6, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v6, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1381
    instance-of v6, v1, Lkik/a/d/n;

    if-nez v6, :cond_1

    .line 1382
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1386
    :cond_1
    if-eqz v1, :cond_2

    .line 1387
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1389
    :cond_2
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1377
    :cond_3
    :try_start_1
    invoke-static {v0}, Lkik/a/d/k;->a(Ljava/lang/String;)Lkik/a/d/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_1

    .line 1390
    :cond_4
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1393
    invoke-direct {p0, v2}, Lkik/a/g/v;->a(Ljava/util/Set;)Ljava/util/Set;

    .line 1396
    :cond_5
    return-object v3
.end method

.method public final a(Ljava/lang/String;Lkik/a/e/r$a;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 870
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Z)Lkik/a/d/k;
    .locals 3

    .prologue
    .line 1335
    if-nez p1, :cond_0

    .line 1336
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get contact for null identifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1339
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1340
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1342
    invoke-virtual {p0, v0, p2}, Lkik/a/g/v;->a(Ljava/util/Set;Z)Ljava/util/Set;

    move-result-object v0

    .line 1344
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 1345
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 1347
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 1354
    :goto_0
    return-object v0

    .line 1350
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "More than one contact returned"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1354
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 875
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;Ljava/util/HashMap;)Lkik/a/d/k;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/g/e;)V
    .locals 2

    .prologue
    .line 262
    if-eqz p1, :cond_0

    .line 263
    iget-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/v;->E:Lcom/kik/g/i;

    invoke-virtual {v0, p1, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 265
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 860
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lkik/a/g/v;->a(Lkik/a/d/k;ZZ)Z

    move-result v0

    .line 862
    if-eqz v0, :cond_0

    .line 863
    iget-object v0, p0, Lkik/a/g/v;->t:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 865
    :cond_0
    return-void
.end method

.method public final a(ZZ)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x2710

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 490
    if-eqz p1, :cond_0

    .line 493
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkik/a/g/v;->d:J

    iput-boolean v1, p0, Lkik/a/g/v;->p:Z

    .line 497
    :cond_0
    iget-object v2, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v2}, Lkik/a/e/f;->j()J

    move-result-wide v2

    .line 499
    iget-object v4, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v4

    .line 500
    if-nez p2, :cond_4

    .line 525
    :cond_1
    :goto_0
    :try_start_0
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    if-eqz v0, :cond_3

    .line 528
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 529
    :try_start_1
    iget-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    .line 530
    iget-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 532
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 534
    invoke-virtual {p0}, Lkik/a/g/v;->o()V

    .line 536
    :cond_3
    return-void

    .line 505
    :cond_4
    :try_start_2
    iget-wide v6, p0, Lkik/a/g/v;->o:J

    add-long/2addr v6, v8

    cmp-long v2, v2, v6

    if-gtz v2, :cond_1

    .line 510
    iget-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_5

    .line 513
    iget-object v0, p0, Lkik/a/g/v;->r:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lkik/a/g/al;

    invoke-direct {v2, p0}, Lkik/a/g/al;-><init>(Lkik/a/g/v;)V

    const-wide/16 v6, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v6, v7, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->a:Ljava/util/concurrent/ScheduledFuture;

    :cond_5
    move v0, v1

    goto :goto_0

    .line 525
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 532
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final a(Lkik/a/d/k;ZZ)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 919
    .line 921
    iget-object v3, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v3

    .line 923
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 925
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 927
    invoke-virtual {v0}, Lkik/a/d/k;->n()Z

    move-result v2

    .line 929
    invoke-virtual {v0}, Lkik/a/d/k;->s()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lkik/a/d/k;->s()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 930
    invoke-direct {p0, v0}, Lkik/a/g/v;->b(Lkik/a/d/k;)V

    .line 933
    :cond_0
    if-nez p3, :cond_2

    .line 934
    invoke-virtual {v0}, Lkik/a/d/k;->p()Z

    move-result v4

    invoke-virtual {p1, v4}, Lkik/a/d/k;->f(Z)V

    .line 935
    invoke-virtual {v0}, Lkik/a/d/k;->q()Z

    move-result v4

    invoke-virtual {p1, v4}, Lkik/a/d/k;->g(Z)V

    .line 936
    invoke-virtual {v0}, Lkik/a/d/k;->f()I

    move-result v4

    invoke-virtual {p1, v4}, Lkik/a/d/k;->a(I)V

    .line 937
    invoke-virtual {v0}, Lkik/a/d/k;->u()Z

    move-result v4

    invoke-virtual {p1, v4}, Lkik/a/d/k;->h(Z)V

    .line 947
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Lkik/a/d/k;->c(Lkik/a/d/k;)V

    .line 948
    if-eqz p2, :cond_7

    .line 949
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->b(Lkik/a/d/k;)Z

    move v0, v2

    .line 965
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 967
    iget-object v2, p0, Lkik/a/g/v;->w:Lcom/kik/g/k;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 970
    invoke-virtual {p1}, Lkik/a/d/k;->n()Z

    move-result v2

    if-eq v0, v2, :cond_6

    .line 971
    const/4 v0, 0x1

    .line 974
    :goto_2
    return v0

    .line 940
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Lkik/a/d/k;->v()Z

    move-result v4

    invoke-virtual {v0}, Lkik/a/d/k;->v()Z

    move-result v5

    if-ne v4, v5, :cond_3

    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v4

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v5

    if-eq v4, v5, :cond_1

    .line 942
    :cond_3
    iget-object v4, p0, Lkik/a/g/v;->C:Lcom/kik/g/k;

    invoke-virtual {v4, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 965
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 953
    :cond_4
    :try_start_2
    invoke-direct {p0, p1}, Lkik/a/g/v;->b(Lkik/a/d/k;)V

    .line 956
    invoke-virtual {p1}, Lkik/a/d/k;->n()Z

    move-result v0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->f(Z)V

    .line 957
    invoke-virtual {p1}, Lkik/a/d/k;->o()Z

    move-result v0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->g(Z)V

    .line 959
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    if-eqz p2, :cond_5

    .line 962
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->c(Lkik/a/d/k;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    move v0, v1

    goto :goto_1

    :cond_6
    move v0, v1

    .line 974
    goto :goto_2

    :cond_7
    move v0, v2

    goto :goto_1
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lkik/a/g/v;->u:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lkik/a/d/j;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 1290
    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-instance v2, Lkik/a/g/ag;

    invoke-direct {v2, p0}, Lkik/a/g/ag;-><init>(Lkik/a/g/v;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    move-result-object v0

    .line 1299
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lkik/a/d/k;
    .locals 2

    .prologue
    .line 1458
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->k(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    .line 1459
    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lkik/a/g/v;->w:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lkik/a/d/j;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 1305
    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-instance v2, Lkik/a/g/ah;

    invoke-direct {v2, p0}, Lkik/a/g/ah;-><init>(Lkik/a/g/v;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    move-result-object v0

    .line 1314
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1465
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 1466
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lkik/a/g/v;->A:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 692
    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    const/4 v1, 0x0

    invoke-static {v1, p1}, Lkik/a/f/f/g;->a(Lkik/a/f/j;Ljava/lang/String;)Lkik/a/f/f/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    .line 693
    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/ap;

    invoke-direct {v1, p0}, Lkik/a/g/ap;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v1, Lkik/a/g/ar;

    invoke-direct {v1, p0}, Lkik/a/g/ar;-><init>(Lkik/a/g/v;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lkik/a/d/j;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 1320
    invoke-virtual {p1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-instance v2, Lkik/a/g/ai;

    invoke-direct {v2, p0}, Lkik/a/g/ai;-><init>(Lkik/a/g/v;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    move-result-object v0

    .line 1329
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lkik/a/g/v;->B:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 361
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 363
    iget-object v1, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    monitor-enter v1

    .line 364
    :try_start_0
    iget-object v2, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 365
    iget-object v0, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    monitor-exit v1

    .line 373
    :goto_0
    return-object v0

    .line 368
    :cond_0
    iget-object v2, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    invoke-virtual {p0}, Lkik/a/g/v;->m()V

    goto :goto_0

    .line 369
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final f()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lkik/a/g/v;->C:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 5

    .prologue
    .line 418
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 419
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 420
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 422
    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 423
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 426
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    new-instance v0, Lkik/a/g/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkik/a/g/v$b;-><init>(Lkik/a/g/v;B)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 430
    return-object v2
.end method

.method public final h()Ljava/util/List;
    .locals 5

    .prologue
    .line 438
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 439
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 440
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 441
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 442
    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v4

    if-nez v4, :cond_0

    instance-of v4, v0, Lkik/a/d/n;

    if-nez v4, :cond_0

    .line 443
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 446
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 448
    new-instance v0, Lkik/a/g/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkik/a/g/v$b;-><init>(Lkik/a/g/v;B)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 449
    return-object v2
.end method

.method public final i()Ljava/util/List;
    .locals 5

    .prologue
    .line 457
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 458
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 459
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 461
    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 462
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 465
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 467
    new-instance v0, Lkik/a/g/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkik/a/g/v$b;-><init>(Lkik/a/g/v;B)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 468
    return-object v2
.end method

.method public final j()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 484
    invoke-virtual {p0, v0, v0}, Lkik/a/g/v;->a(ZZ)V

    .line 485
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 221
    iget-object v0, p0, Lkik/a/g/v;->r:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 222
    return-void
.end method

.method public final l()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 227
    iget-object v2, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    const-string v3, "ProfileManager.rosterVersion"

    invoke-interface {v2, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lkik/a/g/v;->c:Ljava/lang/String;

    .line 229
    iget-object v2, p0, Lkik/a/g/v;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 230
    const-string v2, ""

    iput-object v2, p0, Lkik/a/g/v;->c:Ljava/lang/String;

    .line 234
    :cond_0
    :try_start_0
    iget-object v2, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    const-string v3, "ProfileManager.rosterTimeStamp"

    invoke-interface {v2, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lkik/a/g/v;->d:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    :goto_0
    :try_start_1
    iget-object v2, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    const-string v3, "ProfileManager.rosterIsBatchedKey"

    invoke-interface {v2, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v0, :cond_2

    :goto_1
    iput-boolean v0, p0, Lkik/a/g/v;->p:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    :goto_2
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->i()Ljava/util/Hashtable;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    .line 248
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 249
    instance-of v2, v0, Lkik/a/d/n;

    if-nez v2, :cond_1

    .line 250
    iget-object v2, p0, Lkik/a/g/v;->j:Ljava/util/Map;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkik/a/g/a;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lkik/a/g/a;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 237
    :catch_0
    move-exception v2

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkik/a/g/v;->d:J

    goto :goto_0

    :cond_2
    move v0, v1

    .line 241
    goto :goto_1

    .line 244
    :catch_1
    move-exception v0

    iput-boolean v1, p0, Lkik/a/g/v;->p:Z

    goto :goto_2

    .line 254
    :cond_3
    iget-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/v;->g:Lkik/a/e/k;

    invoke-interface {v1}, Lkik/a/e/k;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/v;->G:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 255
    iget-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/v;->D:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 256
    iget-object v0, p0, Lkik/a/g/v;->l:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->d()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/v;->F:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 257
    return-void
.end method

.method protected final m()V
    .locals 5

    .prologue
    .line 269
    iget-object v1, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    monitor-enter v1

    .line 270
    :try_start_0
    iget-boolean v0, p0, Lkik/a/g/v;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    :cond_0
    monitor-exit v1

    .line 355
    :goto_0
    return-void

    .line 274
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/g/v;->n:Z

    .line 277
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 278
    iget-object v0, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 279
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 280
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    const/16 v4, 0x32

    if-lt v0, v4, :cond_2

    .line 281
    :cond_3
    invoke-direct {p0, v2}, Lkik/a/g/v;->b(Ljava/util/Set;)Lcom/kik/g/p;

    move-result-object v0

    .line 288
    if-nez v0, :cond_5

    .line 290
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 291
    iget-object v3, p0, Lkik/a/g/v;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 355
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 294
    :cond_4
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lkik/a/g/v;->n:Z

    .line 295
    invoke-virtual {p0}, Lkik/a/g/v;->m()V

    .line 296
    monitor-exit v1

    goto :goto_0

    .line 299
    :cond_5
    new-instance v3, Lkik/a/g/w;

    invoke-direct {v3, p0, v2}, Lkik/a/g/w;-><init>(Lkik/a/g/v;Ljava/util/Set;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 355
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final n()Ljava/util/Map;
    .locals 5

    .prologue
    .line 401
    new-instance v2, Ljava/util/HashMap;

    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 402
    iget-object v3, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v3

    .line 403
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->b:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 404
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/k;

    .line 405
    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_0

    .line 406
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 409
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 410
    return-object v2
.end method

.method public final o()V
    .locals 7

    .prologue
    .line 540
    iget-object v1, p0, Lkik/a/g/v;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 541
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->j()J

    move-result-wide v2

    iput-wide v2, p0, Lkik/a/g/v;->o:J

    .line 543
    iget-object v0, p0, Lkik/a/g/v;->e:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 544
    if-nez v0, :cond_0

    const-string v0, ""

    .line 545
    :goto_0
    iget-object v2, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    new-instance v3, Lkik/a/f/f/ak;

    iget-wide v4, p0, Lkik/a/g/v;->d:J

    iget-boolean v6, p0, Lkik/a/g/v;->p:Z

    invoke-direct {v3, v4, v5, v6, v0}, Lkik/a/f/f/ak;-><init>(JZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {v2, v3, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 546
    new-instance v2, Lkik/a/g/ao;

    invoke-direct {v2, p0}, Lkik/a/g/ao;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 564
    monitor-exit v1

    return-void

    .line 544
    :cond_0
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 564
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final p()V
    .locals 8

    .prologue
    .line 979
    iget-object v2, p0, Lkik/a/g/v;->h:Ljava/lang/Object;

    monitor-enter v2

    .line 981
    :try_start_0
    iget-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->k()Z

    move-result v0

    if-nez v0, :cond_1

    .line 982
    :cond_0
    monitor-exit v2

    .line 1110
    :goto_0
    return-void

    .line 985
    :cond_1
    const/4 v0, 0x0

    .line 986
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 989
    iget-object v1, p0, Lkik/a/g/v;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/g/a;

    .line 990
    invoke-virtual {v0}, Lkik/a/g/a;->a()Ljava/lang/String;

    move-result-object v1

    .line 991
    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v5

    .line 992
    const/4 v6, 0x1

    invoke-virtual {p0, v1, v6}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v6

    .line 996
    invoke-virtual {v6}, Lkik/a/d/k;->q()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Lkik/a/d/k;->o()Z

    move-result v7

    if-nez v7, :cond_4

    .line 998
    invoke-virtual {v6}, Lkik/a/d/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 999
    new-instance v0, Lkik/a/f/f/c;

    invoke-direct {v0, v5}, Lkik/a/f/f/c;-><init>(Lkik/a/d/j;)V

    iget-object v4, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v4, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v4

    new-instance v6, Lkik/a/g/ab;

    invoke-direct {v6, p0}, Lkik/a/g/ab;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v4, v6}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v4, Lkik/a/g/v$a;

    invoke-virtual {v5}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lkik/a/g/v$a;-><init>(Lkik/a/g/v;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    move-object v0, v1

    .line 1027
    :cond_2
    :goto_2
    iget-object v1, p0, Lkik/a/g/v;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 1029
    iget-object v1, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    if-eqz v1, :cond_3

    .line 1032
    iget-object v1, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    new-instance v3, Lkik/a/g/aw;

    invoke-direct {v3, p0, v0}, Lkik/a/g/aw;-><init>(Lkik/a/g/v;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1110
    :cond_3
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1002
    :cond_4
    :try_start_1
    invoke-virtual {v6}, Lkik/a/d/k;->q()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v6}, Lkik/a/d/k;->o()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1004
    invoke-virtual {v6}, Lkik/a/d/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1005
    new-instance v0, Lkik/a/f/f/am;

    invoke-direct {v0, v5}, Lkik/a/f/f/am;-><init>(Lkik/a/d/j;)V

    iget-object v4, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v4, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v4

    new-instance v6, Lkik/a/g/ad;

    invoke-direct {v6, p0}, Lkik/a/g/ad;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v4, v6}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v4, Lkik/a/g/v$a;

    invoke-virtual {v5}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lkik/a/g/v$a;-><init>(Lkik/a/g/v;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    move-object v0, v1

    .line 1006
    goto :goto_2

    .line 1008
    :cond_5
    invoke-virtual {v6}, Lkik/a/d/k;->p()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Lkik/a/d/k;->n()Z

    move-result v7

    if-nez v7, :cond_6

    .line 1010
    invoke-virtual {v6}, Lkik/a/d/k;->f()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1011
    invoke-virtual {v0}, Lkik/a/g/a;->b()Ljava/util/HashMap;

    move-result-object v0

    new-instance v4, Lkik/a/f/f/a;

    invoke-direct {v4, v5, v0}, Lkik/a/f/f/a;-><init>(Lkik/a/d/j;Ljava/util/HashMap;)V

    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v0, v4}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v4

    new-instance v6, Lkik/a/g/x;

    invoke-direct {v6, p0, v5}, Lkik/a/g/x;-><init>(Lkik/a/g/v;Lkik/a/d/j;)V

    invoke-virtual {v4, v6}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v4, Lkik/a/g/v$a;

    invoke-virtual {v5}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lkik/a/g/v$a;-><init>(Lkik/a/g/v;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    move-object v0, v1

    .line 1012
    goto/16 :goto_2

    .line 1014
    :cond_6
    invoke-virtual {v6}, Lkik/a/d/k;->p()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v6}, Lkik/a/d/k;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1016
    invoke-virtual {v6}, Lkik/a/d/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1017
    const/4 v0, 0x1

    new-array v0, v0, [Lkik/a/d/k;

    const/4 v4, 0x0

    invoke-virtual {v5}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {p0, v6, v7}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v6

    aput-object v6, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v4, Lkik/a/f/f/aj;

    invoke-direct {v4, v0}, Lkik/a/f/f/aj;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lkik/a/g/v;->f:Lkik/a/e/f;

    invoke-interface {v0, v4}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v4

    new-instance v6, Lkik/a/g/z;

    invoke-direct {v6, p0}, Lkik/a/g/z;-><init>(Lkik/a/g/v;)V

    invoke-virtual {v4, v6}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    new-instance v4, Lkik/a/g/v$a;

    invoke-virtual {v5}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lkik/a/g/v$a;-><init>(Lkik/a/g/v;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/g/v;->i:Lcom/kik/g/p;

    move-object v0, v1

    .line 1018
    goto/16 :goto_2

    .line 1022
    :cond_7
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    .line 1024
    goto/16 :goto_1
.end method
