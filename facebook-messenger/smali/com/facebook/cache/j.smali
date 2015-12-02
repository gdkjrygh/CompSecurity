.class public Lcom/facebook/cache/j;
.super Ljava/lang/Object;
.source "CacheSyndicator.java"


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

.field private static b:J


# instance fields
.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/cache/t;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final d:Lcom/facebook/e/a/e;

.field private final e:Lcom/facebook/cache/q;

.field private final f:Lcom/facebook/cache/k;

.field private final g:Lcom/facebook/common/time/a;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    const-class v0, Lcom/facebook/cache/j;

    sput-object v0, Lcom/facebook/cache/j;->a:Ljava/lang/Class;

    .line 31
    const-wide/32 v0, 0x100000

    sput-wide v0, Lcom/facebook/cache/j;->b:J

    return-void
.end method

.method public constructor <init>(Lcom/facebook/e/a/e;Lcom/facebook/cache/q;Lcom/facebook/cache/k;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/cache/j;->h:J

    .line 48
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/cache/j;->c:Ljava/util/Map;

    .line 49
    iput-object p1, p0, Lcom/facebook/cache/j;->d:Lcom/facebook/e/a/e;

    .line 50
    iput-object p4, p0, Lcom/facebook/cache/j;->g:Lcom/facebook/common/time/a;

    .line 51
    iput-object p2, p0, Lcom/facebook/cache/j;->e:Lcom/facebook/cache/q;

    .line 53
    iget-object v0, p0, Lcom/facebook/cache/j;->e:Lcom/facebook/cache/q;

    invoke-virtual {v0, p0}, Lcom/facebook/cache/q;->a(Lcom/facebook/cache/j;)V

    .line 54
    iput-object p3, p0, Lcom/facebook/cache/j;->f:Lcom/facebook/cache/k;

    .line 55
    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/cache/l;)Lcom/google/common/a/fi;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/cache/l;",
            ")",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/cache/t;",
            ">;"
        }
    .end annotation

    .prologue
    .line 141
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/cache/l;->ALL:Lcom/facebook/cache/l;

    if-ne p1, v0, :cond_0

    .line 142
    invoke-direct {p0}, Lcom/facebook/cache/j;->b()Lcom/google/common/a/fi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 154
    :goto_0
    monitor-exit p0

    return-object v0

    .line 145
    :cond_0
    :try_start_1
    new-instance v1, Lcom/google/common/a/fk;

    invoke-direct {v1}, Lcom/google/common/a/fk;-><init>()V

    .line 148
    iget-object v0, p0, Lcom/facebook/cache/j;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/cache/t;

    .line 149
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/facebook/cache/t;->b()Lcom/facebook/cache/l;

    move-result-object v3

    if-ne v3, p1, :cond_1

    .line 151
    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 141
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 154
    :cond_2
    :try_start_2
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_0
.end method

.method private declared-synchronized b()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/cache/t;",
            ">;"
        }
    .end annotation

    .prologue
    .line 137
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/cache/j;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/cache/t;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    sget-object v0, Lcom/facebook/cache/l;->MEMORY:Lcom/facebook/cache/l;

    invoke-direct {p0, v0}, Lcom/facebook/cache/j;->a(Lcom/facebook/cache/l;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(Lcom/facebook/cache/t;)V
    .locals 2

    .prologue
    .line 62
    monitor-enter p0

    :try_start_0
    const-string v0, "require non-null SyndicatedCache"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lcom/facebook/cache/j;->c:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    instance-of v0, p1, Lcom/facebook/cache/a;

    if-eqz v0, :cond_0

    .line 65
    check-cast p1, Lcom/facebook/cache/a;

    iget-object v0, p0, Lcom/facebook/cache/j;->e:Lcom/facebook/cache/q;

    invoke-interface {p1, v0}, Lcom/facebook/cache/a;->a(Lcom/facebook/cache/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_0
    monitor-exit p0

    return-void

    .line 62
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/facebook/cache/t;D)V
    .locals 0

    .prologue
    .line 170
    if-eqz p1, :cond_0

    .line 171
    invoke-interface {p1, p2, p3}, Lcom/facebook/cache/t;->a(D)V

    .line 173
    :cond_0
    return-void
.end method
