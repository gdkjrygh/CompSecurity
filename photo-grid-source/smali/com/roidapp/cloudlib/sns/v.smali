.class public final Lcom/roidapp/cloudlib/sns/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:I


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/roidapp/cloudlib/sns/p;

.field private e:Lcom/roidapp/cloudlib/sns/a;

.field private f:[Lcom/roidapp/cloudlib/sns/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lcom/roidapp/cloudlib/sns/v;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->a:Ljava/util/concurrent/BlockingQueue;

    .line 17
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->b:Ljava/util/concurrent/BlockingQueue;

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    .line 30
    new-instance v0, Lcom/roidapp/cloudlib/sns/p;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/p;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->d:Lcom/roidapp/cloudlib/sns/p;

    .line 31
    sget v0, Lcom/roidapp/cloudlib/sns/v;->g:I

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/b;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    .line 32
    return-void
.end method


# virtual methods
.method final a()Lcom/roidapp/cloudlib/sns/p;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->d:Lcom/roidapp/cloudlib/sns/p;

    return-object v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/o;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 89
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v1

    .line 90
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    monitor-enter v2

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/o;

    .line 92
    if-eqz v0, :cond_0

    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "request in queue and cancel --- "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " --- "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 95
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->s()V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->m()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "add request to cache queue - "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " --- "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->b(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Lcom/roidapp/cloudlib/sns/v;)V

    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 109
    :goto_0
    return-void

    .line 98
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 105
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "add request to network queue - "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " --- "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->b(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p1, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Lcom/roidapp/cloudlib/sns/v;)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 76
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    monitor-enter v1

    .line 77
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/o;

    .line 78
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->t()I

    move-result v3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    if-ne v3, v4, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v3

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "cancel request by holder --- "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " url:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " --- "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    goto :goto_0

    .line 85
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

    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 39
    new-instance v0, Lcom/roidapp/cloudlib/sns/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->a:Ljava/util/concurrent/BlockingQueue;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/v;->b:Ljava/util/concurrent/BlockingQueue;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/v;->d:Lcom/roidapp/cloudlib/sns/p;

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/a;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/roidapp/cloudlib/sns/p;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->e:Lcom/roidapp/cloudlib/sns/a;

    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->e:Lcom/roidapp/cloudlib/sns/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/a;->start()V

    .line 41
    const/4 v0, 0x0

    :goto_0
    sget v1, Lcom/roidapp/cloudlib/sns/v;->g:I

    if-ge v0, v1, :cond_0

    .line 42
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    new-instance v2, Lcom/roidapp/cloudlib/sns/b;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/v;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {v2, v3}, Lcom/roidapp/cloudlib/sns/b;-><init>(Ljava/util/concurrent/BlockingQueue;)V

    aput-object v2, v1, v0

    .line 43
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b;->start()V

    .line 41
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method final b(Lcom/roidapp/cloudlib/sns/o;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 112
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "finish request, it has expired --- "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " --- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 121
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    monitor-enter v1

    .line 119
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "finish request - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " --- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/m;->b(Ljava/lang/String;)V

    .line 120
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 48
    .line 1065
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    monitor-enter v1

    .line 1066
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/o;

    .line 1067
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "cancel all request url:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " --- "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 1069
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    goto :goto_0

    .line 1072
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1071
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 1072
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->e:Lcom/roidapp/cloudlib/sns/a;

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/v;->e:Lcom/roidapp/cloudlib/sns/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/a;->a()V

    .line 52
    iput-object v5, p0, Lcom/roidapp/cloudlib/sns/v;->e:Lcom/roidapp/cloudlib/sns/a;

    .line 55
    :cond_1
    const/4 v0, 0x0

    :goto_1
    sget v1, Lcom/roidapp/cloudlib/sns/v;->g:I

    if-ge v0, v1, :cond_3

    .line 56
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    aget-object v1, v1, v0

    if-eqz v1, :cond_2

    .line 57
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b;->a()V

    .line 58
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/v;->f:[Lcom/roidapp/cloudlib/sns/b;

    aput-object v5, v1, v0

    .line 55
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p0}, Lcom/roidapp/baselib/c/ae;->a(Ljava/lang/Object;)V

    .line 62
    return-void
.end method
