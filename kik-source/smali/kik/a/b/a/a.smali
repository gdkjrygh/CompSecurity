.class public final Lkik/a/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/i;
.implements Lkik/a/f/i;
.implements Lkik/a/f/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/b/a/a$b;,
        Lkik/a/b/a/a$a;,
        Lkik/a/b/a/a$d;,
        Lkik/a/b/a/a$c;
    }
.end annotation


# static fields
.field private static final q:Lorg/c/b;


# instance fields
.field private A:Ljava/util/HashSet;

.field private B:I

.field private C:Lkik/a/b/a/a$d;

.field private D:Lcom/kik/g/f;

.field private E:Lcom/kik/g/k;

.field private F:Lcom/kik/g/k;

.field private G:Lcom/kik/g/k;

.field private H:Lcom/kik/g/k;

.field private I:Lcom/kik/g/k;

.field private J:Lcom/kik/g/k;

.field private K:Lcom/kik/g/k;

.field private L:Lcom/kik/g/k;

.field private M:Lcom/kik/g/k;

.field private N:Lcom/kik/g/k;

.field private O:Lcom/kik/g/k;

.field private P:Lcom/kik/g/k;

.field private Q:Lcom/kik/g/k;

.field private R:Lcom/kik/g/k;

.field private S:Lcom/kik/g/k;

.field private T:Lcom/kik/g/k;

.field private U:Lcom/kik/g/k;

.field private V:Lcom/kik/g/k;

.field private W:Lcom/kik/g/k;

.field private X:I

.field private final Y:Lcom/kik/g/i;

.field private final Z:Lcom/kik/g/i;

.field a:Ljava/util/List;

.field private final aa:Lcom/kik/g/i;

.field private final ab:Lcom/kik/g/i;

.field private ac:Lcom/kik/g/i;

.field private ad:Lcom/kik/g/i;

.field private ae:Lcom/kik/g/i;

.field private af:Lcom/kik/g/i;

.field b:Ljava/util/List;

.field private c:Ljava/util/HashMap;

.field private final d:Lkik/a/e/f;

.field private final e:Lkik/a/e/v;

.field private final f:Lkik/a/e/r;

.field private final g:Lkik/a/e/p;

.field private final h:Lkik/a/e/o;

.field private final i:Lkik/a/e/w;

.field private final j:Lkik/a/e/l;

.field private final k:Ljava/security/SecureRandom;

.field private l:Ljava/util/List;

.field private m:Ljava/util/Set;

.field private n:Lkik/a/h/m;

.field private o:Ljava/util/concurrent/ScheduledExecutorService;

.field private p:J

.field private r:J

.field private s:Ljava/util/Hashtable;

.field private t:Ljava/util/Hashtable;

.field private u:Ljava/util/Hashtable;

.field private v:Lcom/kik/g/k;

.field private w:Lcom/kik/g/k;

.field private x:Lcom/kik/g/k;

.field private y:Lcom/kik/g/k;

.field private z:Lcom/kik/g/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 172
    const-string v0, "ConversationManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/b/a/a;->q:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/o;Lkik/a/e/p;Lkik/a/e/r;Lkik/a/e/w;Lkik/a/e/l;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .prologue
    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    .line 167
    new-instance v0, Lkik/a/h/m;

    invoke-direct {v0}, Lkik/a/h/m;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->n:Lkik/a/h/m;

    .line 168
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/b/a/a;->o:Ljava/util/concurrent/ScheduledExecutorService;

    .line 170
    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lkik/a/b/a/a;->p:J

    .line 174
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/a/b/a/a;->r:J

    .line 178
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    .line 179
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    .line 186
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/b/a/a;->v:Lcom/kik/g/k;

    .line 191
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    .line 197
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/b/a/a;->x:Lcom/kik/g/k;

    .line 201
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/b/a/a;->y:Lcom/kik/g/k;

    .line 206
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/b/a/a;->z:Lcom/kik/g/k;

    .line 211
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    .line 220
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->a:Ljava/util/List;

    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->b:Ljava/util/List;

    .line 492
    new-instance v0, Lkik/a/b/a/b;

    invoke-direct {v0, p0}, Lkik/a/b/a/b;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->Y:Lcom/kik/g/i;

    .line 503
    new-instance v0, Lkik/a/b/a/l;

    invoke-direct {v0, p0}, Lkik/a/b/a/l;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->Z:Lcom/kik/g/i;

    .line 2165
    new-instance v0, Lkik/a/b/a/e;

    invoke-direct {v0, p0}, Lkik/a/b/a/e;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->aa:Lcom/kik/g/i;

    .line 2187
    new-instance v0, Lkik/a/b/a/f;

    invoke-direct {v0, p0}, Lkik/a/b/a/f;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->ab:Lcom/kik/g/i;

    .line 2196
    new-instance v0, Lkik/a/b/a/g;

    invoke-direct {v0, p0}, Lkik/a/b/a/g;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->ac:Lcom/kik/g/i;

    .line 2221
    new-instance v0, Lkik/a/b/a/h;

    invoke-direct {v0, p0}, Lkik/a/b/a/h;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->ad:Lcom/kik/g/i;

    .line 2249
    new-instance v0, Lkik/a/b/a/i;

    invoke-direct {v0, p0}, Lkik/a/b/a/i;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->ae:Lcom/kik/g/i;

    .line 2257
    new-instance v0, Lkik/a/b/a/j;

    invoke-direct {v0, p0}, Lkik/a/b/a/j;-><init>(Lkik/a/b/a/a;)V

    iput-object v0, p0, Lkik/a/b/a/a;->af:Lcom/kik/g/i;

    .line 367
    iput-object p1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    .line 368
    iput-object p2, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    .line 369
    iput-object p5, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    .line 370
    iput-object p6, p0, Lkik/a/b/a/a;->i:Lkik/a/e/w;

    .line 371
    iput-object p4, p0, Lkik/a/b/a/a;->g:Lkik/a/e/p;

    .line 372
    iput-object p3, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    .line 373
    iput-object p7, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    .line 374
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->l:Ljava/util/List;

    .line 375
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->m:Ljava/util/Set;

    .line 377
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->E:Lcom/kik/g/k;

    .line 378
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->F:Lcom/kik/g/k;

    .line 379
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->G:Lcom/kik/g/k;

    .line 380
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->H:Lcom/kik/g/k;

    .line 381
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->I:Lcom/kik/g/k;

    .line 382
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->J:Lcom/kik/g/k;

    .line 383
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    .line 384
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->L:Lcom/kik/g/k;

    .line 385
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    .line 386
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->N:Lcom/kik/g/k;

    .line 387
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->O:Lcom/kik/g/k;

    .line 388
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->P:Lcom/kik/g/k;

    .line 389
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->Q:Lcom/kik/g/k;

    .line 390
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->R:Lcom/kik/g/k;

    .line 391
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->S:Lcom/kik/g/k;

    .line 392
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->T:Lcom/kik/g/k;

    .line 393
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->U:Lcom/kik/g/k;

    .line 394
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->V:Lcom/kik/g/k;

    .line 395
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p8}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/b/a/a;->W:Lcom/kik/g/k;

    .line 397
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lkik/a/b/a/a;->k:Ljava/security/SecureRandom;

    .line 398
    return-void
.end method

.method private M()V
    .locals 10

    .prologue
    .line 1311
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1312
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1313
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    .line 1315
    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lkik/a/d/f;->p()J

    move-result-wide v6

    cmp-long v3, v6, v4

    if-gtz v3, :cond_1

    invoke-virtual {v0}, Lkik/a/d/f;->p()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v3, v6, v8

    if-eqz v3, :cond_1

    .line 1316
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v3}, Lkik/a/b/a/a;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 1322
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1318
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lkik/a/d/f;->p()J

    move-result-wide v6

    cmp-long v3, v6, v4

    if-lez v3, :cond_0

    iget-object v3, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1319
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/f;->p()J

    move-result-wide v4

    invoke-direct {p0, v3, v4, v5}, Lkik/a/b/a/a;->b(Ljava/lang/String;J)V

    goto :goto_0

    .line 1322
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method private N()Ljava/util/Vector;
    .locals 7

    .prologue
    .line 1475
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 1476
    iget-object v3, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v3

    .line 1477
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v4

    .line 1479
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1480
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1481
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v1, v5, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 1482
    if-eqz v1, :cond_0

    instance-of v5, v1, Lkik/a/d/n;

    if-eqz v5, :cond_0

    check-cast v1, Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1483
    invoke-virtual {v2, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1486
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

    .line 1487
    return-object v2
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .prologue
    .line 1046
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1047
    new-instance v0, Lkik/a/b/a/a$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lkik/a/b/a/a$a;-><init>(Lkik/a/b/a/a;B)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1048
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/m/o;

    .line 1050
    iget-object v3, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    iget-object v0, v0, Lcom/kik/m/o;->a:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1051
    if-eqz v0, :cond_0

    .line 1052
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1056
    :cond_1
    return-object v1
.end method

.method static synthetic a(Lkik/a/b/a/a;Lkik/a/b/a/a$d;)Lkik/a/b/a/a$d;
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    return-object p1
.end method

.method static synthetic a(Lkik/a/b/a/a;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    return-object v0
.end method

.method private a(Ljava/util/Vector;Ljava/util/Vector;Ljava/util/List;Z)Lkik/a/f/f/ah;
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2070
    new-instance v4, Lkik/a/f/f/ah;

    iget-object v0, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-interface {v0}, Lkik/a/e/o;->b()Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPair;

    iget-object v1, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-direct {v4, p0, v0, v1, p4}, Lkik/a/f/f/ah;-><init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;Z)V

    .line 2072
    invoke-virtual {p2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 2073
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 2074
    if-eqz v1, :cond_0

    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_0

    move v1, v2

    .line 2076
    :goto_1
    invoke-virtual {v4, v0, v1, v2}, Lkik/a/f/f/ah;->a(Lkik/a/f/c/c;ZZ)V

    goto :goto_0

    :cond_0
    move v1, v3

    .line 2074
    goto :goto_1

    .line 2079
    :cond_1
    invoke-virtual {p1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 2080
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 2081
    if-eqz v1, :cond_2

    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_2

    move v1, v2

    .line 2083
    :goto_3
    invoke-virtual {v4, v0, v1, v3}, Lkik/a/f/f/ah;->a(Lkik/a/f/c/c;ZZ)V

    goto :goto_2

    :cond_2
    move v1, v3

    .line 2081
    goto :goto_3

    .line 2086
    :cond_3
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 2087
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 2088
    if-eqz v1, :cond_4

    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_4

    move v1, v2

    .line 2090
    :goto_5
    invoke-virtual {v4, v0, v1, v3}, Lkik/a/f/f/ah;->a(Lkik/a/f/c/c;ZZ)V

    goto :goto_4

    :cond_4
    move v1, v3

    .line 2088
    goto :goto_5

    .line 2093
    :cond_5
    return-object v4
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 402
    iput-wide p1, p0, Lkik/a/b/a/a;->p:J

    .line 404
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    const-string v1, "ConversationManager.QOS_POLLING_INTERVAL"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 405
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 515
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 516
    invoke-virtual {p0, p2}, Lkik/a/b/a/a;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v1

    .line 517
    if-eqz v1, :cond_0

    .line 519
    monitor-enter v1

    .line 520
    :try_start_0
    invoke-virtual {v1}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 523
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/a/d/f;->a(Z)V

    .line 524
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    :cond_0
    invoke-virtual {p0, p1}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v2

    .line 528
    monitor-enter v2

    .line 533
    :try_start_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 534
    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 535
    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 536
    invoke-virtual {v2, v3}, Lkik/a/d/f;->a(Ljava/util/List;)V

    .line 537
    invoke-virtual {v2}, Lkik/a/d/f;->m()V

    .line 538
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 540
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 541
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 542
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    .line 543
    iget-object v3, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 546
    :cond_1
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v0, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 547
    if-eqz v1, :cond_2

    .line 548
    iget-object v0, p0, Lkik/a/b/a/a;->U:Lcom/kik/g/k;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v3

    aput-object p1, v2, v4

    invoke-virtual {v0, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 550
    :cond_2
    return-void

    .line 524
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 538
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method private a(Ljava/util/Vector;)V
    .locals 0

    .prologue
    .line 1179
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->b(Ljava/util/List;)V

    .line 1180
    return-void
.end method

.method static synthetic a(Lkik/a/b/a/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->i(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/a/b/a/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1, p2}, Lkik/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/a/b/a/a;Lkik/a/d/f;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->d(Lkik/a/d/f;)V

    return-void
.end method

.method private a(Lkik/a/d/u;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 1234
    invoke-virtual {p1}, Lkik/a/d/u;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v4

    .line 1236
    invoke-virtual {p1}, Lkik/a/d/u;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v5

    .line 1237
    invoke-virtual {p1}, Lkik/a/d/u;->a()I

    move-result v6

    .line 1239
    const/16 v0, 0x258

    if-ne v6, v0, :cond_0

    .line 1240
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/u;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->e(Ljava/lang/String;)Lcom/kik/g/p;

    .line 1243
    :cond_0
    monitor-enter v4

    move v3, v2

    move v1, v2

    .line 1244
    :goto_0
    if-ge v3, v5, :cond_1

    .line 1245
    :try_start_0
    invoke-virtual {p1}, Lkik/a/d/u;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1247
    iget-object v7, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v4, v0, v6, v7}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1248
    add-int/lit8 v0, v1, 0x1

    .line 1244
    :goto_1
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_0

    .line 1251
    :cond_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1256
    if-ge v1, v5, :cond_3

    invoke-virtual {p1}, Lkik/a/d/u;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/u;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1257
    invoke-virtual {p1}, Lkik/a/d/u;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v3

    .line 1258
    monitor-enter v3

    move v1, v2

    .line 1259
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Lkik/a/d/u;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1260
    invoke-virtual {p1}, Lkik/a/d/u;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkik/a/d/u;->a()I

    move-result v2

    iget-object v5, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v4, v0, v2, v5}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1259
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 1251
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1262
    :cond_2
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1264
    :cond_3
    iget-object v0, p0, Lkik/a/b/a/a;->N:Lcom/kik/g/k;

    new-instance v1, Ljava/lang/Integer;

    invoke-virtual {p1}, Lkik/a/d/u;->a()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1265
    return-void

    .line 1262
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private a(Lkik/a/d/s;ZZ)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1193
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v2

    .line 1195
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v3

    .line 1197
    monitor-enter v2

    .line 1198
    :try_start_0
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1200
    iget-object v4, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1201
    :try_start_1
    iget-object v5, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1202
    iget-object v5, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1203
    iget-object v5, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v5

    .line 1204
    iget-object v6, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1206
    :cond_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1208
    :try_start_2
    iget-object v4, p0, Lkik/a/b/a/a;->T:Lcom/kik/g/k;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1211
    :cond_1
    iget-object v4, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v2, p1, v3, v4, p3}, Lkik/a/d/f;->a(Lkik/a/d/s;Lkik/a/d/k;Lkik/a/e/v;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1212
    if-nez p2, :cond_2

    .line 1213
    iget-object v1, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1216
    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lkik/a/d/f;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1217
    iget-object v1, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1221
    :cond_2
    invoke-static {p1}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1222
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lkik/a/d/f;->a(Z)V

    .line 1225
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1228
    :goto_0
    return v0

    .line 1206
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    .line 1229
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 1228
    :cond_4
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move v0, v1

    goto :goto_0
.end method

.method static synthetic b(Lkik/a/b/a/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->H:Lcom/kik/g/k;

    return-object v0
.end method

.method private b(Ljava/lang/String;J)V
    .locals 6

    .prologue
    .line 1362
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    .line 1363
    new-instance v0, Lkik/a/b/a/n;

    invoke-direct {v0, p0, p1}, Lkik/a/b/a/n;-><init>(Lkik/a/b/a/a;Ljava/lang/String;)V

    .line 1370
    iget-object v1, p0, Lkik/a/b/a/a;->o:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    sub-long v2, p2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 1371
    iget-object v1, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    invoke-virtual {v1, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1373
    :cond_0
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 13

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 2336
    if-nez p1, :cond_1

    .line 2505
    :cond_0
    :goto_0
    return-void

    .line 2340
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_5

    move v3, v4

    .line 2343
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v2, v5

    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 2344
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 2345
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_6

    move v6, v4

    .line 2347
    :goto_3
    invoke-virtual {v0}, Lkik/a/f/c/c;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez v3, :cond_3

    .line 2349
    new-instance v8, Lkik/a/f/f/ah;

    iget-object v1, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-interface {v1}, Lkik/a/e/o;->b()Lcom/kik/g/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/KeyPair;

    iget-object v9, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-direct {v8, p0, v1, v9, v3}, Lkik/a/f/f/ah;-><init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;Z)V

    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v1, v9, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_7

    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_7

    move v1, v4

    :goto_4
    invoke-virtual {v8, v0, v1, v6}, Lkik/a/f/f/ah;->a(Lkik/a/f/c/c;ZZ)V

    .line 2350
    iget-object v1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v1, v8, v5}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    .line 2356
    :cond_3
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->h()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v8

    .line 2357
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_8

    move v6, v4

    .line 2359
    :goto_5
    invoke-virtual {v0}, Lkik/a/f/c/c;->l()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_4
    :pswitch_0
    move v0, v2

    move v2, v0

    .line 2500
    goto :goto_2

    :cond_5
    move v3, v5

    .line 2340
    goto :goto_1

    :cond_6
    move v6, v5

    .line 2345
    goto :goto_3

    :cond_7
    move v1, v5

    .line 2349
    goto :goto_4

    :cond_8
    move v6, v5

    .line 2357
    goto :goto_5

    :pswitch_1
    move-object v1, v0

    .line 2361
    check-cast v1, Lkik/a/f/c/a;

    .line 2363
    invoke-virtual {v1}, Lkik/a/f/c/a;->b()Lkik/a/d/s;

    move-result-object v9

    .line 2365
    if-eqz v9, :cond_4

    .line 2366
    invoke-virtual {v9}, Lkik/a/d/s;->q()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v9}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v11

    iget-object v12, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v12

    :try_start_0
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/f;

    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_9

    invoke-virtual {v1, v10}, Lkik/a/d/f;->b(Ljava/util/List;)V

    iget-object v1, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v1, v10, v11}, Lkik/a/e/v;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 2373
    :cond_9
    const-class v1, Lkik/a/d/a/k;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/k;

    .line 2375
    if-eqz v1, :cond_a

    .line 2376
    iget-object v1, p0, Lkik/a/b/a/a;->z:Lcom/kik/g/k;

    invoke-virtual {v1, v9}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 2379
    :cond_a
    const-class v1, Lkik/a/d/a/c;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/c;

    .line 2380
    if-eqz v1, :cond_b

    .line 2381
    if-eqz v8, :cond_b

    .line 2382
    iget-object v10, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->h()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lkik/a/b/a/k;

    invoke-direct {v12, p0, v1}, Lkik/a/b/a/k;-><init>(Lkik/a/b/a/a;Lkik/a/d/a/c;)V

    invoke-interface {v10, v11, v12}, Lkik/a/e/r;->a(Ljava/lang/String;Lkik/a/e/r$a;)Lkik/a/d/k;

    .line 2391
    :cond_b
    if-eqz v6, :cond_c

    .line 2397
    invoke-virtual {v9}, Lkik/a/d/s;->n()V

    .line 2400
    :cond_c
    const-class v1, Lkik/a/d/a/j;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/j;

    .line 2401
    if-eqz v1, :cond_d

    move v2, v4

    .line 2405
    :cond_d
    const-class v1, Lkik/a/d/a/d;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/d;

    .line 2406
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lkik/a/d/a/d;->f()Z

    move-result v1

    if-nez v1, :cond_e

    .line 2407
    invoke-virtual {v8, v4}, Lkik/a/d/k;->h(Z)V

    .line 2408
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v1, v8, v4, v4}, Lkik/a/e/r;->a(Lkik/a/d/k;ZZ)Z

    .line 2412
    :cond_e
    const-class v1, Lkik/a/d/a/e;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/e;

    .line 2413
    if-eqz v1, :cond_15

    .line 2414
    iget-object v6, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-virtual {v1}, Lkik/a/d/a/e;->d()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8, v4}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v8

    .line 2417
    invoke-virtual {v8, v4}, Lkik/a/d/n;->d(Z)V

    .line 2418
    invoke-virtual {v8, v4}, Lkik/a/d/n;->f(Z)V

    .line 2419
    invoke-virtual {v8, v5}, Lkik/a/d/n;->i(Z)V

    .line 2420
    invoke-virtual {v1}, Lkik/a/d/a/e;->e()Z

    move-result v6

    invoke-virtual {v8, v6}, Lkik/a/d/n;->j(Z)V

    .line 2421
    invoke-virtual {v1}, Lkik/a/d/a/e;->e()Z

    move-result v6

    if-eqz v6, :cond_f

    .line 2423
    iget-object v6, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-virtual {v1}, Lkik/a/d/a/e;->d()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v6, v10}, Lkik/a/e/l;->a(Ljava/lang/String;)V

    .line 2426
    :cond_f
    invoke-virtual {v1}, Lkik/a/d/a/e;->a()Ljava/util/Vector;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v6

    if-gtz v6, :cond_10

    invoke-virtual {v1}, Lkik/a/d/a/e;->b()Ljava/util/Vector;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v6

    if-lez v6, :cond_14

    .line 2427
    :cond_10
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    move v6, v5

    .line 2428
    :goto_6
    invoke-virtual {v1}, Lkik/a/d/a/e;->a()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v6, v2, :cond_11

    .line 2429
    invoke-virtual {v1}, Lkik/a/d/a/e;->a()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2430
    invoke-interface {v10, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2431
    invoke-virtual {v8, v2}, Lkik/a/d/n;->d(Ljava/lang/String;)Z

    .line 2428
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto :goto_6

    .line 2366
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 2433
    :cond_11
    invoke-virtual {v1}, Lkik/a/d/a/e;->a()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-lez v2, :cond_12

    .line 2435
    iget-object v2, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v2, v10, v4}, Lkik/a/e/r;->a(Ljava/util/Set;Z)Ljava/util/Set;

    :cond_12
    move v6, v5

    .line 2437
    :goto_7
    invoke-virtual {v1}, Lkik/a/d/a/e;->b()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v6, v2, :cond_13

    .line 2438
    invoke-virtual {v1}, Lkik/a/d/a/e;->b()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v8, v2}, Lkik/a/d/n;->e(Ljava/lang/String;)Z

    .line 2437
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto :goto_7

    .line 2441
    :cond_13
    iget-object v2, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v2, v8}, Lkik/a/e/l;->b(Lkik/a/d/n;)V

    .line 2442
    iget-object v2, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v2, v8}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    .line 2444
    iget-object v2, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v2, v8}, Lkik/a/e/v;->d(Lkik/a/d/k;)V

    move v2, v4

    .line 2449
    :cond_14
    invoke-virtual {v1}, Lkik/a/d/a/e;->c()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 2450
    invoke-virtual {v1}, Lkik/a/d/a/e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lkik/a/d/a/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v1}, Lkik/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2454
    :cond_15
    const-class v1, Lkik/a/d/a/f;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/f;

    .line 2455
    if-eqz v1, :cond_16

    .line 2456
    invoke-virtual {v9}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lkik/a/d/a/f;->a()Z

    move-result v1

    invoke-virtual {p0, v6}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v6

    if-eqz v1, :cond_1b

    iget-object v1, p0, Lkik/a/b/a/a;->n:Lkik/a/h/m;

    new-instance v10, Lkik/a/b/a/a$b;

    invoke-direct {v10, p0, v6}, Lkik/a/b/a/a$b;-><init>(Lkik/a/b/a/a;Lkik/a/d/f;)V

    invoke-virtual {v6, v8, v1, v10}, Lkik/a/d/f;->a(Ljava/lang/String;Lkik/a/h/m;Lkik/a/h/d;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    invoke-virtual {v1, v6}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 2459
    :cond_16
    :goto_8
    const-class v1, Lkik/a/d/a/i;

    invoke-static {v9, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/i;

    .line 2460
    if-eqz v1, :cond_17

    .line 2461
    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lkik/a/d/a/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkik/a/d/s;->a(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v0

    new-instance v6, Lkik/a/d/a/i;

    invoke-direct {v6, v1}, Lkik/a/d/a/i;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 2462
    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 2466
    :cond_17
    invoke-static {v9}, Lkik/a/d/a/g;->a(Lkik/a/d/s;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v9}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    const-class v0, Lkik/a/d/a/m;

    invoke-static {v9, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    if-nez v0, :cond_18

    const-class v0, Lkik/a/d/a/l;

    invoke-static {v9, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    .line 2467
    :cond_18
    invoke-direct {p0, v9}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v0

    .line 2469
    const/4 v1, 0x4

    if-eq v0, v1, :cond_19

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1c

    :cond_19
    move v0, v4

    .line 2470
    :goto_9
    invoke-direct {p0, v9, v3, v0}, Lkik/a/b/a/a;->a(Lkik/a/d/s;ZZ)Z

    move-result v1

    .line 2472
    if-eqz v1, :cond_2

    .line 2473
    if-nez v0, :cond_1d

    .line 2474
    iget-object v1, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    monitor-enter v1

    :try_start_2
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v9}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v9}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    iget-object v6, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_1a
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lkik/a/b/a/a;->I:Lcom/kik/g/k;

    invoke-virtual {v0, v9}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 2456
    :cond_1b
    invoke-virtual {v6, v8}, Lkik/a/d/f;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    invoke-virtual {v1, v6}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1c
    move v0, v5

    .line 2469
    goto :goto_9

    .line 2474
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 2478
    :cond_1d
    iget-object v0, p0, Lkik/a/b/a/a;->J:Lcom/kik/g/k;

    invoke-virtual {v0, v9}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 2484
    :pswitch_2
    check-cast v0, Lkik/a/f/c/d;

    invoke-virtual {v0}, Lkik/a/f/c/d;->b()Lkik/a/d/u;

    move-result-object v0

    .line 2485
    if-eqz v0, :cond_4

    .line 2486
    invoke-direct {p0, v0}, Lkik/a/b/a/a;->a(Lkik/a/d/u;)V

    goto/16 :goto_2

    :pswitch_3
    move-object v1, v0

    .line 2490
    check-cast v1, Lkik/a/f/c/b;

    .line 2491
    invoke-virtual {v1}, Lkik/a/f/c/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v1

    .line 2492
    if-eqz v1, :cond_4

    .line 2493
    monitor-enter v1

    .line 2494
    :try_start_4
    invoke-virtual {v0}, Lkik/a/f/c/c;->j()Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0x258

    iget-object v8, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v1, v0, v6, v8}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 2495
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 2496
    monitor-exit v1

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    .line 2502
    :cond_1e
    if-eqz v2, :cond_0

    .line 2503
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v0, v5, v4}, Lkik/a/e/r;->a(ZZ)V

    goto/16 :goto_0

    .line 2359
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lkik/a/b/a/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 87
    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lkik/a/b/a/a;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/b/a/a;->d(Lkik/a/d/f;)V

    iget-object v0, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v0, p1}, Lkik/a/e/l;->c(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/b/a/a;->d(Lkik/a/d/f;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic c(Lkik/a/b/a/a;)V
    .locals 4

    .prologue
    .line 87
    invoke-direct {p0}, Lkik/a/b/a/a;->N()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v2, v1, Lkik/a/d/n;

    if-nez v2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to handle a convo marked as dirty that isn\'t a group"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    move-object v0, v1

    check-cast v0, Lkik/a/d/n;

    invoke-interface {v3, v0}, Lkik/a/e/l;->a(Lkik/a/d/n;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/b/a/p;

    invoke-direct {v1, p0, v2}, Lkik/a/b/a/p;-><init>(Lkik/a/b/a/a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_2
    return-void
.end method

.method private static c(Lkik/a/d/f;)Z
    .locals 1

    .prologue
    .line 1041
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/f;->e()Lkik/a/d/s;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lkik/a/b/a/a;)Ljava/security/SecureRandom;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->k:Ljava/security/SecureRandom;

    return-object v0
.end method

.method private d(Lkik/a/d/f;)V
    .locals 3

    .prologue
    .line 2526
    iget-object v1, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    monitor-enter v1

    .line 2527
    if-eqz p1, :cond_0

    .line 2528
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2530
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

.method private e(Lkik/a/d/s;)Lkik/a/d/f;
    .locals 1

    .prologue
    .line 1553
    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lkik/a/b/a/a;)Lkik/a/e/o;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    return-object v0
.end method

.method static synthetic f(Lkik/a/b/a/a;)Lkik/a/e/f;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    return-object v0
.end method

.method static synthetic g(Lkik/a/b/a/a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic h(Lkik/a/b/a/a;)V
    .locals 5

    .prologue
    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkik/a/b/a/a;->G()V

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v2, Lkik/a/f/f/u;

    invoke-direct {v2, p0, v1}, Lkik/a/f/f/u;-><init>(Lkik/a/f/j;Ljava/util/ArrayList;)V

    invoke-interface {v0, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/b/a/d;

    invoke-direct {v1, p0}, Lkik/a/b/a/d;-><init>(Lkik/a/b/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method

.method static synthetic i(Lkik/a/b/a/a;)Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    return-object v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1458
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1459
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1460
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1462
    iget-object v1, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    monitor-enter v1

    .line 1463
    :try_start_1
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1464
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1465
    iget-object v0, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    .line 1466
    iget-object v2, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1468
    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1469
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->j(Ljava/lang/String;)Z

    .line 1470
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->m(Ljava/lang/String;)Z

    .line 1471
    return-void

    .line 1460
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1468
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method static synthetic j(Lkik/a/b/a/a;)Lkik/a/e/l;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    return-object v0
.end method

.method static synthetic k(Lkik/a/b/a/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic l(Lkik/a/b/a/a;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 12

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 938
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 939
    iget-object v8, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v8

    .line 940
    :try_start_0
    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v9

    .line 942
    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 943
    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/f;

    .line 944
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-interface {v3, v4, v10}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v4

    .line 945
    if-eqz v4, :cond_1

    instance-of v3, v4, Lkik/a/d/n;

    if-eqz v3, :cond_1

    move-object v0, v4

    check-cast v0, Lkik/a/d/n;

    move-object v3, v0

    invoke-virtual {v3}, Lkik/a/d/n;->H()Z

    move-result v3

    if-nez v3, :cond_0

    .line 947
    :cond_1
    invoke-virtual {p0, v2}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v3

    .line 952
    if-ne v3, v5, :cond_4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lkik/a/d/k;->v()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v4}, Lkik/a/d/k;->m()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Lkik/a/b/a/a;->c(Lkik/a/d/f;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x1

    invoke-interface {v3, v4, v10}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v3

    instance-of v3, v3, Lkik/a/d/n;

    if-eqz v3, :cond_4

    :cond_3
    move v3, v5

    :goto_1
    if-eqz v3, :cond_0

    .line 953
    new-instance v3, Lcom/kik/m/o;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lkik/a/d/f;->a()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 956
    :catchall_0
    move-exception v2

    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_4
    move v3, v6

    .line 952
    goto :goto_1

    .line 956
    :cond_5
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 957
    invoke-direct {p0, v7}, Lkik/a/b/a/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final B()Ljava/util/List;
    .locals 12

    .prologue
    const/4 v5, 0x0

    .line 969
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 970
    iget-object v7, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v7

    .line 971
    :try_start_0
    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v8

    .line 973
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 974
    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/f;

    .line 975
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    invoke-interface {v3, v4, v9}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v4

    .line 976
    if-eqz v4, :cond_1

    instance-of v3, v4, Lkik/a/d/n;

    if-eqz v3, :cond_1

    move-object v0, v4

    check-cast v0, Lkik/a/d/n;

    move-object v3, v0

    invoke-virtual {v3}, Lkik/a/d/n;->H()Z

    move-result v3

    if-nez v3, :cond_0

    .line 979
    :cond_1
    if-eqz v4, :cond_5

    invoke-static {v2}, Lkik/a/b/a/a;->c(Lkik/a/d/f;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_0

    .line 984
    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkik/a/d/s;

    .line 986
    const-class v4, Lkik/a/d/a/l;

    invoke-static {v3, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v4

    check-cast v4, Lkik/a/d/a/l;

    .line 987
    const-class v10, Lkik/a/d/a/m;

    invoke-static {v3, v10}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/m;

    .line 990
    if-nez v4, :cond_3

    if-eqz v3, :cond_4

    :cond_3
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lkik/a/d/a/l;->c()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 991
    :cond_4
    new-instance v3, Lcom/kik/m/o;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lkik/a/d/f;->a()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 997
    :catchall_0
    move-exception v2

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_5
    move v3, v5

    .line 979
    goto :goto_1

    .line 997
    :cond_6
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 998
    invoke-direct {p0, v6}, Lkik/a/b/a/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final C()Ljava/util/List;
    .locals 8

    .prologue
    .line 1008
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1010
    iget-object v3, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v3

    .line 1011
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v4

    .line 1013
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1014
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1015
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v1, v5, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 1016
    if-eqz v1, :cond_1

    instance-of v5, v1, Lkik/a/d/n;

    if-eqz v5, :cond_1

    check-cast v1, Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->H()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1019
    :cond_1
    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v1

    const/16 v5, 0x8

    if-ne v1, v5, :cond_0

    .line 1024
    invoke-virtual {v0}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/s;

    .line 1027
    const-class v6, Lkik/a/d/a/l;

    invoke-static {v1, v6}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/l;

    .line 1028
    if-nez v1, :cond_2

    .line 1029
    new-instance v1, Lcom/kik/m/o;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lkik/a/d/f;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v1, v5, v0}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1035
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1036
    invoke-direct {p0, v2}, Lkik/a/b/a/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D()I
    .locals 1

    .prologue
    .line 1154
    iget v0, p0, Lkik/a/b/a/a;->X:I

    return v0
.end method

.method public final E()V
    .locals 2

    .prologue
    .line 1527
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1528
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 1529
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final F()V
    .locals 3

    .prologue
    .line 1574
    iget-object v1, p0, Lkik/a/b/a/a;->l:Ljava/util/List;

    monitor-enter v1

    .line 1575
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/a/b/a/a;->l:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1577
    iget-object v2, p0, Lkik/a/b/a/a;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 1579
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 1580
    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    goto :goto_0

    .line 1582
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final G()V
    .locals 4

    .prologue
    .line 1722
    iget-object v0, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-interface {v0}, Lkik/a/e/o;->b()Lcom/kik/g/p;

    move-result-object v0

    .line 1725
    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1726
    iget-object v1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v2, Lkik/a/f/f/ah;

    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPair;

    iget-object v3, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-direct {v2, p0, v0, v3}, Lkik/a/f/f/ah;-><init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;)V

    const/4 v0, 0x1

    invoke-interface {v1, v2, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    .line 1728
    :cond_0
    return-void
.end method

.method public final H()I
    .locals 1

    .prologue
    .line 2099
    invoke-virtual {p0}, Lkik/a/b/a/a;->K()Ljava/util/List;

    move-result-object v0

    .line 2100
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final I()I
    .locals 4

    .prologue
    .line 2106
    const/4 v0, 0x0

    .line 2108
    invoke-virtual {p0}, Lkik/a/b/a/a;->B()Ljava/util/List;

    move-result-object v1

    .line 2109
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 2110
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0, v3}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2111
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    :goto_1
    move v1, v0

    .line 2113
    goto :goto_0

    .line 2114
    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public final J()Ljava/util/List;
    .locals 4

    .prologue
    .line 2120
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2122
    invoke-virtual {p0}, Lkik/a/b/a/a;->B()Ljava/util/List;

    move-result-object v0

    .line 2123
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 2124
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0, v3}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2125
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2128
    :cond_1
    return-object v1
.end method

.method public final K()Ljava/util/List;
    .locals 4

    .prologue
    .line 2134
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2136
    invoke-virtual {p0}, Lkik/a/b/a/a;->A()Ljava/util/List;

    move-result-object v0

    .line 2137
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 2138
    iget-object v3, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0, v3}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2139
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2142
    :cond_1
    return-object v1
.end method

.method public final L()I
    .locals 2

    .prologue
    .line 2154
    invoke-virtual {p0}, Lkik/a/b/a/a;->B()Ljava/util/List;

    move-result-object v0

    .line 2157
    invoke-virtual {p0}, Lkik/a/b/a/a;->C()Ljava/util/List;

    move-result-object v1

    .line 2158
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 2159
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 2160
    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->a(I)V

    .line 2162
    return v0
.end method

.method public final a(Lkik/a/d/f;)I
    .locals 13

    .prologue
    .line 711
    if-nez p1, :cond_0

    .line 712
    const/4 v1, 0x4

    .line 726
    :goto_0
    return v1

    .line 715
    :cond_0
    iget-object v9, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    monitor-enter v9

    .line 716
    :try_start_0
    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v10

    .line 718
    iget-object v1, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 719
    iget-object v1, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 725
    :goto_1
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 722
    :cond_1
    :try_start_1
    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    if-eqz v2, :cond_15

    instance-of v1, v2, Lkik/a/d/n;

    if-nez v1, :cond_5

    invoke-virtual {v2}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 723
    :goto_2
    iget-object v2, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v10, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 722
    :cond_2
    invoke-virtual {v2}, Lkik/a/d/k;->u()Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {v2}, Lkik/a/d/k;->l()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v2}, Lkik/a/d/k;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    goto :goto_2

    :cond_3
    const/4 v1, 0x2

    goto :goto_2

    :cond_4
    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    instance-of v1, v2, Lkik/a/d/n;

    if-eqz v1, :cond_15

    move-object v0, v2

    check-cast v0, Lkik/a/d/n;

    move-object v1, v0

    invoke-virtual {v1}, Lkik/a/d/n;->l()Z

    move-result v3

    if-nez v3, :cond_6

    const/4 v1, 0x4

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Lkik/a/d/n;->I()Z

    move-result v1

    if-nez v1, :cond_15

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v5, v1

    move v8, v3

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/s;

    const-class v3, Lkik/a/d/a/l;

    invoke-static {v1, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/l;

    const-class v4, Lkik/a/d/a/m;

    invoke-static {v1, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v4

    check-cast v4, Lkik/a/d/a/m;

    iget-object v7, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x0

    invoke-interface {v7, v1, v12}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Lkik/a/d/a/l;->c()Z

    move-result v7

    if-eqz v7, :cond_19

    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v3}, Lkik/a/d/a/l;->b()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    invoke-interface {v1, v7, v12}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    move-object v7, v1

    :goto_4
    if-nez v3, :cond_7

    if-eqz v4, :cond_8

    :cond_7
    if-eqz v3, :cond_18

    invoke-virtual {v3}, Lkik/a/d/a/l;->c()Z

    move-result v1

    if-eqz v1, :cond_18

    :cond_8
    add-int/lit8 v1, v5, 0x1

    if-eqz v7, :cond_15

    invoke-virtual {v7}, Lkik/a/d/k;->m()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v7}, Lkik/a/d/k;->l()Z

    move-result v3

    if-nez v3, :cond_15

    :cond_9
    invoke-virtual {v7}, Lkik/a/d/k;->m()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v7}, Lkik/a/d/k;->l()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v7}, Lkik/a/d/k;->h()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    move v5, v1

    move v8, v3

    goto :goto_3

    :cond_a
    const/4 v3, 0x1

    :goto_5
    move v5, v1

    move v6, v3

    goto :goto_3

    :cond_b
    if-nez v5, :cond_12

    const/4 v3, 0x0

    const/4 v1, 0x0

    check-cast v2, Lkik/a/d/n;

    invoke-virtual {v2}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_c

    const/4 v1, 0x4

    goto/16 :goto_2

    :cond_c
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v3

    move v3, v1

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v5, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    const/4 v6, 0x0

    invoke-interface {v5, v1, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_e

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lkik/a/d/k;->m()Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v1, 0x4

    goto/16 :goto_2

    :cond_d
    invoke-virtual {v1}, Lkik/a/d/k;->l()Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v1}, Lkik/a/d/k;->h()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    move v3, v1

    goto :goto_6

    :cond_e
    const/4 v1, 0x1

    :goto_7
    move v2, v1

    goto :goto_6

    :cond_f
    if-eqz v3, :cond_10

    const/16 v1, 0x8

    goto/16 :goto_2

    :cond_10
    if-eqz v2, :cond_11

    const/4 v1, 0x2

    goto/16 :goto_2

    :cond_11
    const/4 v1, 0x1

    goto/16 :goto_2

    :cond_12
    if-eqz v6, :cond_13

    const/4 v1, 0x2

    goto/16 :goto_2

    :cond_13
    if-eqz v8, :cond_14

    const/16 v1, 0x8

    goto/16 :goto_2

    :cond_14
    const/4 v1, 0x4

    goto/16 :goto_2

    :cond_15
    const/4 v1, 0x1

    goto/16 :goto_2

    :cond_16
    move v1, v2

    goto :goto_7

    :cond_17
    move v3, v6

    goto :goto_5

    :cond_18
    move v1, v5

    move v3, v6

    goto :goto_5

    :cond_19
    move-object v7, v1

    goto/16 :goto_4
.end method

.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lkik/a/b/a/a;->E:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/a/d/f;
    .locals 2

    .prologue
    .line 1165
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1166
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    monitor-exit v1

    return-object v0

    .line 1167
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1132
    iget v0, p0, Lkik/a/b/a/a;->B:I

    if-eq v0, p1, :cond_0

    .line 1133
    iput p1, p0, Lkik/a/b/a/a;->B:I

    .line 1134
    iget-object v0, p0, Lkik/a/b/a/a;->x:Lcom/kik/g/k;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1136
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 11

    .prologue
    const/16 v10, 0xb

    const/4 v9, 0x1

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 1329
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1330
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkik/a/d/f;

    .line 1331
    monitor-exit v1

    .line 1332
    if-nez v6, :cond_0

    .line 1358
    :goto_0
    return-void

    .line 1331
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1336
    :cond_0
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    if-nez p2, :cond_1

    const-wide/32 v2, 0x36ee80

    add-long v4, v0, v2

    .line 1337
    :goto_1
    iget-object v0, p0, Lkik/a/b/a/a;->G:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1339
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/t;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lkik/a/f/f/t;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    .line 1340
    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/b/a/m;

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lkik/a/b/a/m;-><init>(Lkik/a/b/a/a;Ljava/lang/String;JLkik/a/d/f;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 1336
    :cond_1
    if-ne p2, v9, :cond_3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v4, v10}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-lt v5, v8, :cond_2

    const/4 v5, 0x5

    invoke-virtual {v4, v5, v9}, Ljava/util/Calendar;->add(II)V

    :cond_2
    const/16 v5, 0x9

    invoke-virtual {v4, v5, v7}, Ljava/util/Calendar;->set(II)V

    const/16 v5, 0xa

    invoke-virtual {v4, v5, v8}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v4, v10, v8}, Ljava/util/Calendar;->set(II)V

    const/16 v5, 0xc

    invoke-virtual {v4, v5, v7}, Ljava/util/Calendar;->set(II)V

    const/16 v5, 0xd

    invoke-virtual {v4, v5, v7}, Ljava/util/Calendar;->set(II)V

    const/16 v5, 0xe

    invoke-virtual {v4, v5, v7}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    add-long v4, v0, v2

    goto :goto_1

    :cond_3
    const-wide/16 v4, -0x1

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 4

    .prologue
    .line 1378
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1379
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1380
    monitor-exit v1

    .line 1381
    if-nez v0, :cond_0

    .line 1391
    :goto_0
    return-void

    .line 1380
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1386
    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1, p2, p3}, Lkik/a/d/f;->a(ZJ)V

    .line 1387
    invoke-direct {p0, p1, p2, p3}, Lkik/a/b/a/a;->b(Ljava/lang/String;J)V

    .line 1388
    iget-object v1, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/f;->q()Lkik/a/d/g;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    iget-object v1, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v0}, Lkik/a/d/f;->q()Lkik/a/d/g;

    move-result-object v0

    invoke-interface {v1, v0}, Lkik/a/e/v;->a(Lkik/a/d/g;)Z

    .line 1390
    iget-object v0, p0, Lkik/a/b/a/a;->F:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1427
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1428
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1429
    monitor-exit v1

    .line 1430
    if-nez v0, :cond_0

    .line 1448
    :goto_0
    return-void

    .line 1429
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1434
    :cond_0
    const-wide/16 v2, -0x1

    invoke-virtual {v0, v4, v2, v3}, Lkik/a/d/f;->a(ZJ)V

    .line 1435
    iget-object v0, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1436
    iget-object v0, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v4}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 1437
    iget-object v0, p0, Lkik/a/b/a/a;->t:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1440
    :cond_1
    if-eqz p2, :cond_2

    .line 1441
    iget-object v0, p0, Lkik/a/b/a/a;->E:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1444
    :cond_2
    iget-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1445
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->j(Ljava/lang/String;)Z

    .line 1446
    iget-object v0, p0, Lkik/a/b/a/a;->F:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Ljava/util/Vector;Lkik/a/d/k;)V
    .locals 4

    .prologue
    .line 2626
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p2}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->c(Lkik/a/d/j;)Lcom/kik/g/p;

    .line 2627
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ai;

    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-static {v3}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, p1}, Lkik/a/f/f/ai;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 2628
    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->b(Ljava/lang/String;)V

    .line 2629
    return-void
.end method

.method public final a(Lkik/a/d/f;Z)V
    .locals 6

    .prologue
    .line 2297
    if-nez p1, :cond_1

    .line 2317
    :cond_0
    :goto_0
    return-void

    .line 2300
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2302
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lkik/a/d/f;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2306
    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lkik/a/d/f;->l()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_3
    if-nez p2, :cond_4

    invoke-virtual {p1}, Lkik/a/d/f;->l()Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    invoke-virtual {p1}, Lkik/a/d/f;->k()J

    move-result-wide v2

    sub-long v2, v0, v2

    const-wide/16 v4, 0xfa0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 2310
    :cond_5
    invoke-virtual {p1, p2}, Lkik/a/d/f;->c(Z)V

    .line 2312
    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/a/d/s;->a(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v2

    new-instance v3, Lkik/a/d/a/f;

    invoke-direct {v3, p2}, Lkik/a/d/a/f;-><init>(Z)V

    invoke-virtual {v2, v3}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 2313
    invoke-virtual {p0, v2}, Lkik/a/b/a/a;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 2315
    invoke-virtual {p1, v0, v1}, Lkik/a/d/f;->a(J)V

    goto :goto_0
.end method

.method public final a(Lkik/a/f/c/g;)V
    .locals 1

    .prologue
    .line 2322
    instance-of v0, p1, Lkik/a/f/c/c;

    if-eqz v0, :cond_0

    .line 2323
    check-cast p1, Lkik/a/f/c/c;

    .line 2324
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2325
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2326
    invoke-direct {p0, v0}, Lkik/a/b/a/a;->b(Ljava/util/List;)V

    .line 2328
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/f/f/z;I)V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 1871
    instance-of v0, p1, Lkik/a/f/f/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 1872
    check-cast v0, Lkik/a/f/f/v;

    .line 1873
    packed-switch p2, :pswitch_data_0

    .line 1897
    :cond_0
    :goto_0
    :pswitch_0
    instance-of v0, p1, Lkik/a/f/f/u;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 1898
    check-cast v0, Lkik/a/f/f/u;

    .line 1899
    packed-switch p2, :pswitch_data_1

    .line 1928
    :cond_1
    :goto_1
    instance-of v0, p1, Lkik/a/f/f/ah;

    if-eqz v0, :cond_2

    .line 1929
    check-cast p1, Lkik/a/f/f/ah;

    .line 1930
    packed-switch p2, :pswitch_data_2

    .line 2021
    :cond_2
    :goto_2
    return-void

    .line 1875
    :pswitch_1
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v1

    invoke-static {v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1876
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v1

    invoke-direct {p0, v1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v1

    .line 1877
    monitor-enter v1

    .line 1878
    :try_start_0
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc8

    iget-object v5, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v1, v3, v4, v5}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1879
    iget-object v3, p0, Lkik/a/b/a/a;->N:Lcom/kik/g/k;

    new-instance v4, Ljava/lang/Integer;

    const/16 v5, 0xc8

    invoke-direct {v4, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v3, v4}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1880
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lkik/a/d/f;->a(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v3

    .line 1881
    if-eqz v3, :cond_3

    .line 1882
    iget-object v4, p0, Lkik/a/b/a/a;->v:Lcom/kik/g/k;

    new-instance v5, Lkik/a/b/a/a$c;

    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v6

    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lkik/a/d/s;->e()J

    move-result-wide v8

    invoke-direct {v5, v6, v0, v8, v9}, Lkik/a/b/a/a$c;-><init>(Lkik/a/d/s;Ljava/lang/String;J)V

    invoke-virtual {v4, v5}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1885
    :cond_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1886
    :pswitch_2
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v1

    invoke-direct {p0, v1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v1

    .line 1890
    monitor-enter v1

    .line 1891
    :try_start_1
    invoke-virtual {v0}, Lkik/a/f/f/v;->e()Lkik/a/d/s;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x258

    iget-object v4, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v1, v0, v3, v4}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 1892
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1893
    monitor-exit v1

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    .line 1903
    :pswitch_3
    iget-object v1, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->g()V

    .line 1904
    invoke-virtual {v0}, Lkik/a/f/f/u;->d()Ljava/util/Hashtable;

    move-result-object v0

    iput-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    .line 1906
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1908
    iget-object v4, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v4

    .line 1909
    :try_start_2
    iget-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/g;

    .line 1910
    invoke-virtual {v0}, Lkik/a/d/g;->a()Ljava/lang/String;

    move-result-object v1

    .line 1911
    iget-object v6, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v6, v1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1912
    iget-object v6, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v6, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/f;

    invoke-virtual {v1, v0}, Lkik/a/d/f;->a(Lkik/a/d/g;)V

    .line 1914
    :cond_4
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1916
    :catchall_2
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :cond_5
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1917
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0, v3}, Lkik/a/e/v;->a(Ljava/util/ArrayList;)Z

    .line 1919
    :pswitch_4
    invoke-virtual {p0}, Lkik/a/b/a/a;->G()V

    goto/16 :goto_1

    .line 1932
    :pswitch_5
    iget-object v0, p0, Lkik/a/b/a/a;->R:Lcom/kik/g/k;

    invoke-virtual {v0, v10}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1936
    invoke-virtual {p1}, Lkik/a/f/f/ah;->e()Ljava/util/Vector;

    move-result-object v1

    .line 1937
    invoke-virtual {p1}, Lkik/a/f/f/ah;->g()Ljava/util/List;

    move-result-object v0

    .line 1939
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    if-eqz v0, :cond_10

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    .line 1940
    :cond_7
    invoke-virtual {p1}, Lkik/a/f/f/ah;->d()J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Lkik/a/b/a/a;->a(J)V

    .line 1942
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    .line 1943
    new-instance v4, Ljava/util/Vector;

    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    .line 1945
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1947
    iget-object v6, p0, Lkik/a/b/a/a;->m:Ljava/util/Set;

    .line 1949
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, p0, Lkik/a/b/a/a;->m:Ljava/util/Set;

    .line 1951
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 1952
    invoke-virtual {v0}, Lkik/a/f/c/c;->j()Ljava/lang/String;

    move-result-object v8

    .line 1954
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 1956
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1957
    invoke-interface {v6, v8}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1961
    :cond_8
    iget-object v0, p0, Lkik/a/b/a/a;->m:Ljava/util/Set;

    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1965
    :cond_9
    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 1966
    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    .line 1968
    iget-object v6, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v6

    .line 1971
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lkik/a/d/k;->m()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 1972
    invoke-virtual {v4, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_5

    .line 1975
    :cond_b
    invoke-virtual {v3, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_5

    .line 1979
    :cond_c
    invoke-direct {p0, v3}, Lkik/a/b/a/a;->a(Ljava/util/Vector;)V

    .line 1982
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_d

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_d

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    .line 1983
    :cond_d
    invoke-virtual {p1}, Lkik/a/f/f/ah;->f()Z

    move-result v0

    invoke-direct {p0, v3, v4, v5, v0}, Lkik/a/b/a/a;->a(Ljava/util/Vector;Ljava/util/Vector;Ljava/util/List;Z)Lkik/a/f/f/ah;

    move-result-object v1

    .line 1984
    const/4 v0, 0x1

    .line 1985
    iget-object v3, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v3, v1, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    .line 1988
    :goto_6
    if-nez v0, :cond_2

    .line 1990
    iget-object v0, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    if-eqz v0, :cond_e

    .line 1991
    iget-object v0, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    iget-object v1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->j()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lkik/a/b/a/a$d;->a(J)V

    .line 1992
    iget-object v0, p0, Lkik/a/b/a/a;->y:Lcom/kik/g/k;

    iget-object v1, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1993
    iput-object v10, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    .line 1995
    :cond_e
    iget-object v0, p0, Lkik/a/b/a/a;->Q:Lcom/kik/g/k;

    invoke-virtual {v0, v10}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1996
    invoke-direct {p0}, Lkik/a/b/a/a;->M()V

    goto/16 :goto_2

    .line 2004
    :pswitch_6
    invoke-virtual {p1}, Lkik/a/f/f/ah;->l()I

    move-result v0

    const/16 v1, 0x65

    if-eq v0, v1, :cond_f

    .line 2005
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QoS request FAILED! error code: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lkik/a/f/f/ah;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2011
    :cond_f
    iget-object v0, p0, Lkik/a/b/a/a;->S:Lcom/kik/g/k;

    invoke-virtual {v0, v10}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 2017
    iput-object v10, p0, Lkik/a/b/a/a;->C:Lkik/a/b/a/a$d;

    goto/16 :goto_2

    :cond_10
    move v0, v2

    goto :goto_6

    .line 1873
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 1899
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 1930
    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final a(Lkik/a/d/f;Lkik/a/d/s;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 731
    if-nez p1, :cond_0

    move v0, v2

    .line 749
    :goto_0
    return v0

    .line 734
    :cond_0
    invoke-virtual {p1}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    .line 735
    if-nez v0, :cond_1

    move v0, v2

    .line 736
    goto :goto_0

    .line 738
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    .line 739
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 740
    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 742
    :cond_3
    const-class v1, Lkik/a/d/a/l;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/l;

    .line 745
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    if-eq v0, p2, :cond_2

    .line 746
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v2

    .line 749
    goto :goto_0
.end method

.method public final a(Lkik/a/d/s;)Z
    .locals 10

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 902
    iget-object v0, p0, Lkik/a/b/a/a;->i:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 905
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v6

    .line 907
    invoke-virtual {v6}, Lkik/a/d/f;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v6}, Lkik/a/d/f;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v6}, Lkik/a/d/f;->p()J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v1, v4, v8

    if-eqz v1, :cond_2

    invoke-virtual {v6}, Lkik/a/d/f;->p()J

    move-result-wide v4

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v8

    cmp-long v1, v4, v8

    if-gtz v1, :cond_2

    :cond_0
    move v1, v3

    .line 909
    :goto_0
    iget-object v4, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    if-eqz v4, :cond_6

    .line 910
    iget-object v0, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v4, v0

    .line 913
    :goto_1
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 914
    iget-object v5, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v5

    .line 915
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lkik/a/d/k;->h()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Lkik/a/d/k;->l()Z

    move-result v5

    if-nez v5, :cond_3

    .line 927
    :cond_1
    :goto_2
    return v2

    :cond_2
    move v1, v2

    .line 907
    goto :goto_0

    .line 919
    :cond_3
    if-eqz v0, :cond_5

    instance-of v5, v0, Lkik/a/d/n;

    if-eqz v5, :cond_5

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    move v5, v3

    .line 924
    :goto_3
    if-eqz v4, :cond_4

    .line 925
    const/4 v0, 0x3

    .line 927
    :goto_4
    if-eqz v1, :cond_1

    if-nez v5, :cond_1

    invoke-static {p1}, Lkik/a/d/a/g;->b(Lkik/a/d/s;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v6}, Lkik/a/b/a/a;->a(Lkik/a/d/f;)I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    move v2, v3

    goto :goto_2

    :cond_4
    move v0, v3

    goto :goto_4

    :cond_5
    move v5, v2

    goto :goto_3

    :cond_6
    move v4, v2

    goto :goto_1
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lkik/a/b/a/a;->F:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lkik/a/d/s;)Lcom/kik/g/p;
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 1588
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 1589
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v3

    .line 1591
    invoke-static {v4}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    .line 1592
    invoke-static {v4}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    .line 1594
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 1596
    invoke-static {p1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1599
    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_0

    .line 1600
    new-instance v1, Ljava/util/ArrayList;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    .line 1607
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1609
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1610
    iget-object v5, p0, Lkik/a/b/a/a;->g:Lkik/a/e/p;

    invoke-interface {v5, v0}, Lkik/a/e/p;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1603
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1604
    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1613
    :cond_1
    iget-object v0, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-interface {v0}, Lkik/a/e/o;->b()Lcom/kik/g/p;

    move-result-object v0

    .line 1614
    invoke-static {v1}, Lcom/kik/g/s;->a(Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v1

    .line 1620
    invoke-static {v0, v1, v6}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;Z)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/b/a/q;

    invoke-direct {v1, p0, p1, v3, v2}, Lkik/a/b/a/q;-><init>(Lkik/a/b/a/a;Lkik/a/d/s;Lkik/a/d/f;Lcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1646
    const-wide/16 v0, 0x1388

    invoke-static {v2, v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    :goto_2
    return-object v0

    .line 1617
    :cond_2
    invoke-static {v4}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_2
.end method

.method public final b(I)V
    .locals 3

    .prologue
    .line 1145
    iput p1, p0, Lkik/a/b/a/a;->X:I

    .line 1146
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    const-string v1, "ConversationManager.missedconvos.watermark"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1147
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1276
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1277
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1279
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1280
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->i(Ljava/lang/String;)V

    .line 1281
    iget-object v1, p0, Lkik/a/b/a/a;->P:Lcom/kik/g/k;

    invoke-virtual {v1, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1282
    return-void

    .line 1279
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Lkik/a/d/f;)Z
    .locals 10

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 1791
    if-nez p1, :cond_1

    .line 1805
    :cond_0
    :goto_0
    return v2

    .line 1795
    :cond_1
    invoke-virtual {p1, v2}, Lkik/a/d/f;->a(Z)V

    .line 1796
    invoke-virtual {p1, v2}, Lkik/a/d/f;->b(Z)Ljava/util/Vector;

    move-result-object v3

    .line 1797
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1798
    iget-object v0, p0, Lkik/a/b/a/a;->L:Lcom/kik/g/k;

    invoke-virtual {v0, v3}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1799
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v1

    if-nez v1, :cond_c

    :cond_2
    new-instance v5, Ljava/util/Vector;

    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_4

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v6

    move v1, v2

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    iget-object v7, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v7, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_a

    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    invoke-virtual {v3}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v3, v2

    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    const/16 v1, 0x1f4

    iget-object v8, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {p1, v0, v1, v8}, Lkik/a/d/f;->a(Lkik/a/d/s;ILkik/a/e/v;)V

    invoke-virtual {v0}, Lkik/a/d/s;->j()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/util/Hashtable;

    invoke-direct {v8}, Ljava/util/Hashtable;-><init>()V

    invoke-virtual {v6, v1, v8}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/util/Vector;

    invoke-direct {v9}, Ljava/util/Vector;-><init>()V

    invoke-virtual {v1, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    invoke-virtual {v6}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v8, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v9, Lkik/a/f/f/x;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Vector;

    invoke-direct {v9, v0}, Lkik/a/f/f/x;-><init>(Ljava/util/Vector;)V

    invoke-interface {v8, v9}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    goto :goto_3

    :cond_a
    move v3, v2

    :cond_b
    if-lez v3, :cond_c

    move v0, v4

    :goto_4
    if-eqz v0, :cond_0

    .line 1800
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1801
    iget-object v0, p0, Lkik/a/b/a/a;->O:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    move v2, v4

    .line 1802
    goto/16 :goto_0

    :cond_c
    move v0, v2

    .line 1799
    goto :goto_4
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lkik/a/b/a/a;->G:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1292
    iget-object v0, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 1294
    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v2

    .line 1295
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1296
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1298
    instance-of v2, v1, Lkik/a/d/n;

    if-eqz v2, :cond_0

    .line 1299
    iget-object v2, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    check-cast v1, Lkik/a/d/n;

    invoke-interface {v2, v1}, Lkik/a/e/l;->a(Lkik/a/d/n;)Lcom/kik/g/p;

    .line 1304
    :goto_0
    iget-object v1, p0, Lkik/a/b/a/a;->P:Lcom/kik/g/k;

    invoke-virtual {v1, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1306
    return-void

    .line 1296
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1302
    :cond_0
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->i(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final c(Lkik/a/d/s;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1652
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v0

    .line 1653
    invoke-direct {p0, p1, v1, v1}, Lkik/a/b/a/a;->a(Lkik/a/d/s;ZZ)Z

    .line 1654
    invoke-virtual {v0, v1}, Lkik/a/d/f;->c(Z)V

    .line 1655
    return-void
.end method

.method public final d()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lkik/a/b/a/a;->H:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lkik/a/d/s;)Lcom/kik/g/p;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1665
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 1666
    invoke-direct {p0, p1}, Lkik/a/b/a/a;->e(Lkik/a/d/s;)Lkik/a/d/f;

    move-result-object v1

    .line 1667
    iget-object v2, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 1669
    invoke-static {p1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1670
    invoke-direct {p0, p1, v4, v4}, Lkik/a/b/a/a;->a(Lkik/a/d/s;ZZ)Z

    .line 1671
    invoke-virtual {v1, v4}, Lkik/a/d/f;->c(Z)V

    .line 1674
    :cond_0
    invoke-virtual {p0, p1}, Lkik/a/b/a/a;->b(Lkik/a/d/s;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v3, Lkik/a/b/a/c;

    invoke-direct {v3, p0, v2, p1, v0}, Lkik/a/b/a/c;-><init>(Lkik/a/b/a/a;Lkik/a/d/k;Lkik/a/d/s;Lcom/kik/g/p;)V

    invoke-virtual {v1, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1711
    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1397
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1398
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1399
    monitor-exit v1

    .line 1400
    if-nez v0, :cond_0

    .line 1422
    :goto_0
    return-void

    .line 1399
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1404
    :cond_0
    iget-object v1, p0, Lkik/a/b/a/a;->G:Lcom/kik/g/k;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1405
    iget-object v1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    new-instance v2, Lkik/a/f/f/an;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lkik/a/f/f/an;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v1

    .line 1406
    invoke-static {v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/a/b/a/o;

    invoke-direct {v2, p0, p1, v0}, Lkik/a/b/a/o;-><init>(Lkik/a/b/a/a;Ljava/lang/String;Lkik/a/d/f;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final e()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lkik/a/b/a/a;->I:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1452
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/a/b/a/a;->a(Ljava/lang/String;Z)V

    .line 1453
    return-void
.end method

.method public final f()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lkik/a/b/a/a;->J:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Lkik/a/d/f;
    .locals 2

    .prologue
    .line 1540
    iget-object v1, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v1

    .line 1541
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1542
    if-nez v0, :cond_0

    .line 1543
    invoke-virtual {p0, p1}, Lkik/a/b/a/a;->h(Ljava/lang/String;)Lkik/a/d/f;

    .line 1544
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1546
    :cond_0
    monitor-exit v1

    return-object v0

    .line 1547
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1717
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v0, p1}, Lkik/a/e/f;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final h()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 296
    iget-object v0, p0, Lkik/a/b/a/a;->M:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Lkik/a/d/f;
    .locals 3

    .prologue
    .line 2612
    new-instance v1, Lkik/a/d/f;

    invoke-direct {v1, p1}, Lkik/a/d/f;-><init>(Ljava/lang/String;)V

    .line 2613
    iget-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2614
    iget-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/g;

    invoke-virtual {v1, v0}, Lkik/a/d/f;->a(Lkik/a/d/g;)V

    .line 2615
    iget-object v2, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    iget-object v0, p0, Lkik/a/b/a/a;->u:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/g;

    invoke-interface {v2, v0}, Lkik/a/e/v;->a(Lkik/a/d/g;)Z

    .line 2617
    :cond_0
    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    monitor-enter v2

    .line 2618
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2619
    monitor-exit v2

    .line 2620
    return-object v1

    .line 2619
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final i()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lkik/a/b/a/a;->N:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lkik/a/b/a/a;->O:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lkik/a/b/a/a;->P:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lkik/a/b/a/a;->Q:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lkik/a/b/a/a;->R:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lkik/a/b/a/a;->S:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lkik/a/b/a/a;->T:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final p()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 344
    iget-object v0, p0, Lkik/a/b/a/a;->U:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lkik/a/b/a/a;->V:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 416
    iget-object v0, p0, Lkik/a/b/a/a;->v:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final s()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lkik/a/b/a/a;->w:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final t()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 438
    iget-object v0, p0, Lkik/a/b/a/a;->x:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 447
    iget-object v0, p0, Lkik/a/b/a/a;->y:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final v()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 456
    iget-object v0, p0, Lkik/a/b/a/a;->z:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final w()V
    .locals 3

    .prologue
    .line 462
    iget-object v0, p0, Lkik/a/b/a/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 463
    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    .line 464
    iget-object v2, p0, Lkik/a/b/a/a;->V:Lcom/kik/g/k;

    invoke-virtual {v2, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 467
    :cond_0
    iget-object v0, p0, Lkik/a/b/a/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 468
    return-void
.end method

.method public final x()V
    .locals 3

    .prologue
    .line 473
    iget-object v0, p0, Lkik/a/b/a/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 474
    iget-object v2, p0, Lkik/a/b/a/a;->V:Lcom/kik/g/k;

    invoke-virtual {v2, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 476
    :cond_0
    iget-object v0, p0, Lkik/a/b/a/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 477
    return-void
.end method

.method public final y()V
    .locals 14

    .prologue
    const-wide/32 v6, 0x36ee80

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 603
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    const-string v1, "ConversationManager.missedconvos.watermark"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 604
    if-nez v0, :cond_3

    move v0, v2

    :goto_0
    iput v0, p0, Lkik/a/b/a/a;->X:I

    .line 605
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->l()Ljava/util/Hashtable;

    move-result-object v0

    iput-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    .line 606
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 608
    invoke-virtual {v0}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/s;

    .line 613
    invoke-virtual {v1}, Lkik/a/d/s;->c()I

    move-result v3

    const/16 v5, 0x64

    if-ne v3, v5, :cond_4

    move v3, v4

    .line 614
    :goto_2
    invoke-virtual {v1}, Lkik/a/d/s;->c()I

    move-result v5

    const/16 v10, 0x65

    if-ne v5, v10, :cond_5

    move v5, v4

    .line 615
    :goto_3
    if-nez v3, :cond_2

    if-eqz v5, :cond_1

    .line 616
    :cond_2
    invoke-virtual {v1}, Lkik/a/d/s;->f()I

    move-result v5

    int-to-long v10, v5

    const-wide/16 v12, 0x3

    cmp-long v5, v10, v12

    if-gtz v5, :cond_7

    .line 617
    if-eqz v3, :cond_6

    .line 618
    iget-object v3, p0, Lkik/a/b/a/a;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    :goto_4
    invoke-virtual {v1}, Lkik/a/d/s;->g()V

    .line 624
    iget-object v3, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v3, v1}, Lkik/a/e/v;->c(Lkik/a/d/s;)Z

    goto :goto_1

    .line 604
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_4
    move v3, v2

    .line 613
    goto :goto_2

    :cond_5
    move v5, v2

    .line 614
    goto :goto_3

    .line 620
    :cond_6
    iget-object v3, p0, Lkik/a/b/a/a;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 627
    :cond_7
    const/16 v3, 0x258

    iget-object v5, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-virtual {v0, v1, v3, v5}, Lkik/a/d/f;->a(Lkik/a/d/s;ILkik/a/e/v;)V

    goto :goto_1

    .line 633
    :cond_8
    iget-object v0, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    .line 634
    invoke-virtual {v0}, Lkik/a/d/n;->l()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_9

    iget-object v2, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_9

    .line 635
    invoke-virtual {v0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/b/a/a;->h(Ljava/lang/String;)Lkik/a/d/f;

    goto :goto_5

    .line 639
    :cond_a
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->f()Ljava/util/Hashtable;

    move-result-object v2

    .line 641
    if-eqz v2, :cond_c

    .line 642
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 643
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/g;

    .line 644
    if-eqz v1, :cond_b

    .line 645
    invoke-virtual {v0, v1}, Lkik/a/d/f;->a(Lkik/a/d/g;)V

    goto :goto_6

    .line 650
    :cond_c
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->j()Ljava/util/HashMap;

    move-result-object v2

    .line 651
    if-eqz v2, :cond_d

    .line 652
    iget-object v0, p0, Lkik/a/b/a/a;->s:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 653
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lkik/a/d/f;->b(Ljava/util/List;)V

    goto :goto_7

    .line 657
    :cond_d
    invoke-static {}, Lkik/a/h/m;->a()Lkik/a/h/m;

    move-result-object v0

    iput-object v0, p0, Lkik/a/b/a/a;->n:Lkik/a/h/m;

    .line 659
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v0, p0}, Lkik/a/e/f;->a(Lkik/a/f/i;)V

    .line 661
    iget-object v0, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    const-string v1, "ConversationManager.QOS_POLLING_INTERVAL"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 664
    if-eqz v0, :cond_11

    .line 665
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 668
    :goto_8
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_e

    move-wide v0, v6

    .line 672
    :cond_e
    invoke-direct {p0, v0, v1}, Lkik/a/b/a/a;->a(J)V

    .line 679
    iget-object v1, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lkik/a/b/a/a;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_f
    invoke-virtual {p0}, Lkik/a/b/a/a;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_10
    iput-object v1, p0, Lkik/a/b/a/a;->A:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v0

    iput v0, p0, Lkik/a/b/a/a;->B:I

    .line 681
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->h:Lkik/a/e/o;

    invoke-interface {v1}, Lkik/a/e/o;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->ab:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 682
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->aa:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 683
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->ac:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 684
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->f:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->ad:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 685
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->ad:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 686
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->K:Lcom/kik/g/k;

    invoke-virtual {v1}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->ae:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 687
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->Y:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 688
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->j:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->Z:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 689
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/b/a/a;->e:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->d()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/b/a/a;->af:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 690
    return-void

    :cond_11
    move-wide v0, v6

    goto/16 :goto_8
.end method

.method public final z()V
    .locals 1

    .prologue
    .line 700
    iget-object v0, p0, Lkik/a/b/a/a;->d:Lkik/a/e/f;

    invoke-interface {v0, p0}, Lkik/a/e/f;->b(Lkik/a/f/i;)V

    .line 701
    iget-object v0, p0, Lkik/a/b/a/a;->D:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 702
    return-void
.end method
