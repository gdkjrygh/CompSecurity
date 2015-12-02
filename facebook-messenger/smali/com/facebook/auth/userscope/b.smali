.class public Lcom/facebook/auth/userscope/b;
.super Ljava/lang/Object;
.source "UserScope.java"

# interfaces
.implements Lcom/facebook/inject/au;
.implements Lcom/facebook/inject/ax;
.implements Lcom/facebook/inject/ay;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/Object;


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final g:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Lcom/facebook/auth/viewercontext/e;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/inject/t;

.field private i:Lcom/facebook/inject/n;

.field private j:Lcom/facebook/common/time/a;

.field private k:Lcom/facebook/auth/userscope/a;

.field private l:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 52
    const-class v0, Lcom/facebook/auth/userscope/b;

    sput-object v0, Lcom/facebook/auth/userscope/b;->a:Ljava/lang/Class;

    .line 61
    const-class v0, Ljavax/inject/Singleton;

    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    const-class v2, Lcom/facebook/inject/ContextScoped;

    invoke-static {v0, v1, v2}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/auth/userscope/b;->b:Lcom/google/common/a/fi;

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/auth/userscope/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->d:Ljava/lang/Object;

    .line 71
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->e:Ljava/util/Map;

    .line 74
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->f:Ljava/util/Map;

    .line 78
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->g:Ljava/lang/ThreadLocal;

    .line 87
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/auth/userscope/b;->l:J

    .line 155
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/userscope/b;)Lcom/facebook/inject/n;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->i:Lcom/facebook/inject/n;

    return-object v0
.end method

.method static synthetic access$1000()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/auth/userscope/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$300()Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/auth/userscope/b;->b:Lcom/google/common/a/fi;

    return-object v0
.end method

.method static synthetic access$500()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/auth/userscope/b;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private b()V
    .locals 8

    .prologue
    const-wide/16 v4, -0x1

    .line 268
    iget-object v1, p0, Lcom/facebook/auth/userscope/b;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 269
    :try_start_0
    iget-wide v2, p0, Lcom/facebook/auth/userscope/b;->l:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 270
    monitor-exit v1

    .line 277
    :goto_0
    return-void

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->j:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/auth/userscope/b;->l:J

    const-wide/16 v6, 0x7530

    add-long/2addr v4, v6

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 274
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/facebook/auth/userscope/b;->l:J

    .line 276
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/facebook/auth/userscope/b;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/auth/userscope/b;->b()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/auth/userscope/b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->d:Ljava/lang/Object;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 283
    const-string v0, "SingletonScope.initializeEagerSingletons"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 284
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/s;

    .line 285
    iget-object v3, v0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    sget-object v4, Lcom/facebook/inject/f;->EAGER:Lcom/facebook/inject/f;

    if-ne v3, v4, :cond_0

    .line 286
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Key: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 287
    iget-object v4, p0, Lcom/facebook/auth/userscope/b;->h:Lcom/facebook/inject/t;

    iget-object v0, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-virtual {v4, v0}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    .line 288
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 291
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 292
    return-void
.end method

.method static synthetic d(Lcom/facebook/auth/userscope/b;)Lcom/facebook/auth/userscope/a;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->k:Lcom/facebook/auth/userscope/a;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->f:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/auth/userscope/b;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/auth/userscope/b;->c()V

    return-void
.end method

.method static synthetic h(Lcom/facebook/auth/userscope/b;)Ljava/lang/ThreadLocal;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->g:Ljava/lang/ThreadLocal;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/inject/a;Ljavax/inject/a;)Ljavax/inject/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 95
    new-instance v0, Lcom/facebook/auth/userscope/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/facebook/auth/userscope/d;-><init>(Lcom/facebook/auth/userscope/b;Lcom/google/inject/a;Ljavax/inject/a;Lcom/facebook/auth/userscope/c;)V

    return-object v0
.end method

.method public a()V
    .locals 6

    .prologue
    .line 126
    iget-object v3, p0, Lcom/facebook/auth/userscope/b;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 129
    :try_start_0
    iget-object v1, p0, Lcom/facebook/auth/userscope/b;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 130
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 131
    instance-of v1, v2, Lcom/facebook/auth/f/b;

    if-eqz v1, :cond_2

    .line 132
    move-object v0, v2

    check-cast v0, Lcom/facebook/auth/f/b;

    move-object v1, v0

    invoke-interface {v1}, Lcom/facebook/auth/f/b;->d()V

    .line 134
    :cond_2
    instance-of v1, v2, Lcom/facebook/auth/f/a;

    if-eqz v1, :cond_1

    .line 135
    check-cast v2, Lcom/facebook/auth/f/a;

    invoke-interface {v2}, Lcom/facebook/auth/f/a;->b()V

    goto :goto_0

    .line 142
    :catchall_0
    move-exception v1

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 139
    :cond_3
    :try_start_1
    iget-object v1, p0, Lcom/facebook/auth/userscope/b;->f:Ljava/util/Map;

    iget-object v2, p0, Lcom/facebook/auth/userscope/b;->e:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 140
    iget-object v1, p0, Lcom/facebook/auth/userscope/b;->j:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/auth/userscope/b;->l:J

    .line 141
    iget-object v1, p0, Lcom/facebook/auth/userscope/b;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 142
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/auth/userscope/b;->h:Lcom/facebook/inject/t;

    .line 106
    const-class v0, Lcom/facebook/inject/n;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/n;

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->i:Lcom/facebook/inject/n;

    .line 107
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->j:Lcom/facebook/common/time/a;

    .line 108
    const-class v0, Lcom/facebook/auth/userscope/a;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/userscope/a;

    iput-object v0, p0, Lcom/facebook/auth/userscope/b;->k:Lcom/facebook/auth/userscope/a;

    .line 109
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/s;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/auth/userscope/b;->m:Ljava/util/List;

    .line 114
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/s;

    .line 115
    iget-object v2, v0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    sget-object v3, Lcom/facebook/inject/f;->EAGER:Lcom/facebook/inject/f;

    if-eq v2, v3, :cond_0

    .line 116
    new-instance v1, Lcom/facebook/inject/aq;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UserScope does not support "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ". See key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v1

    .line 120
    :cond_1
    return-void
.end method

.method public annotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 100
    const-class v0, Lcom/facebook/auth/userscope/UserScoped;

    return-object v0
.end method

.method public getCurrentViewerContextManager()Lcom/facebook/auth/viewercontext/e;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/auth/userscope/b;->g:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/e;

    return-object v0
.end method
