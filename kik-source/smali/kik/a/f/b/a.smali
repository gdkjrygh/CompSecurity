.class public final Lkik/a/f/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/f/b/a$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/lang/Object;

.field private c:Ljava/util/LinkedList;

.field private d:Ljava/util/LinkedList;

.field private e:Ljava/util/LinkedList;

.field private f:Ljava/util/Set;

.field private final g:J

.field private final h:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-string v0, "LifeCycleManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/b/a;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    .line 28
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    .line 29
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/f/b/a;->f:Ljava/util/Set;

    .line 32
    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lkik/a/f/b/a;->g:J

    .line 33
    new-instance v0, Ljava/util/Timer;

    const-string v1, "StanzaLifecycleTimer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/a/f/b/a;->h:Ljava/util/Timer;

    .line 188
    return-void
.end method

.method static synthetic a(Lkik/a/f/b/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lkik/a/f/b/a;Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lkik/a/f/b/a;->b(Lkik/a/f/f/z;)V

    return-void
.end method

.method static synthetic b(Lkik/a/f/b/a;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->f:Ljava/util/Set;

    return-object v0
.end method

.method private b(Lkik/a/f/f/z;)V
    .locals 6

    .prologue
    .line 180
    invoke-virtual {p1}, Lkik/a/f/f/z;->k()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lkik/a/f/f/z;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lkik/a/f/f/z;->k()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 181
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lkik/a/f/f/z;->c(J)J

    move-result-wide v0

    .line 182
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    .line 183
    iget-object v2, p0, Lkik/a/f/b/a;->h:Ljava/util/Timer;

    new-instance v3, Lkik/a/f/b/a$a;

    invoke-direct {v3, p0, p1}, Lkik/a/f/b/a$a;-><init>(Lkik/a/f/b/a;Lkik/a/f/f/z;)V

    const-wide/16 v4, 0x1f4

    add-long/2addr v0, v4

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 186
    :cond_1
    return-void
.end method

.method static synthetic c(Lkik/a/f/b/a;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic d(Lkik/a/f/b/a;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic e(Lkik/a/f/b/a;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic f(Lkik/a/f/b/a;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/b/a;->h:Ljava/util/Timer;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 114
    iget-object v1, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 117
    :goto_0
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    .line 119
    invoke-virtual {v0}, Lkik/a/f/f/z;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 120
    iget-object v2, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 134
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 123
    :cond_0
    const/16 v2, 0x6c

    :try_start_1
    invoke-virtual {v0, v2}, Lkik/a/f/f/z;->b(I)V

    goto :goto_0

    .line 128
    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 129
    iget-object v0, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    .line 130
    const/16 v2, 0x65

    invoke-virtual {v0, v2}, Lkik/a/f/f/z;->b(I)V

    goto :goto_1

    .line 133
    :cond_2
    iget-object v0, p0, Lkik/a/f/b/a;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 134
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final a(Lkik/a/f/f/z;)V
    .locals 3

    .prologue
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lkik/a/f/f/z;->d(J)V

    .line 38
    iget-object v1, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 40
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    .line 41
    :cond_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 42
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    invoke-virtual {p1, v0}, Lkik/a/f/f/z;->a(Lkik/a/f/f/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Discarding duplicate stanza: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    const/16 v0, 0x6d

    invoke-virtual {p1, v0}, Lkik/a/f/f/z;->b(I)V

    .line 45
    monitor-exit v1

    .line 59
    :goto_0
    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    .line 49
    :cond_2
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 50
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    invoke-virtual {p1, v0}, Lkik/a/f/f/z;->a(Lkik/a/f/f/z;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Discarding duplicate stanza: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    const/16 v0, 0x6d

    invoke-virtual {p1, v0}, Lkik/a/f/f/z;->b(I)V

    .line 53
    monitor-exit v1

    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 57
    :cond_3
    :try_start_1
    invoke-direct {p0, p1}, Lkik/a/f/b/a;->b(Lkik/a/f/f/z;)V

    .line 58
    iget-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 59
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 64
    iget-object v1, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 65
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    .line 66
    :cond_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    invoke-virtual {v0}, Lkik/a/f/f/z;->l_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    .line 69
    const/4 v0, 0x1

    monitor-exit v1

    .line 72
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()Lkik/a/f/f/z;
    .locals 3

    .prologue
    .line 144
    iget-object v1, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 145
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    .line 146
    if-eqz v0, :cond_0

    .line 147
    iget-object v2, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_0
    monitor-exit v1

    return-object v0

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 78
    iget-object v2, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 79
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lkik/a/f/b/a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->listIterator()Ljava/util/ListIterator;

    move-result-object v3

    .line 85
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/z;

    .line 87
    invoke-virtual {v0}, Lkik/a/f/f/z;->l_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 88
    invoke-interface {v3}, Ljava/util/ListIterator;->remove()V

    .line 93
    :goto_0
    if-eqz v0, :cond_1

    .line 94
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/a/f/f/z;->a(I)V

    .line 98
    instance-of v1, v0, Lkik/a/f/f/y;

    if-eqz v1, :cond_1

    .line 99
    iget-object v1, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    check-cast v0, Lkik/a/f/f/y;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_1
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 107
    iget-object v1, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 108
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 109
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d(Ljava/lang/String;)Lkik/a/f/f/y;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 162
    iget-object v2, p0, Lkik/a/f/b/a;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 164
    :try_start_0
    iget-object v0, p0, Lkik/a/f/b/a;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->listIterator()Ljava/util/ListIterator;

    move-result-object v3

    .line 166
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/y;

    .line 168
    invoke-virtual {v0}, Lkik/a/f/f/y;->l_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 169
    invoke-interface {v3}, Ljava/util/ListIterator;->remove()V

    .line 174
    :goto_0
    monitor-exit v2

    return-object v0

    .line 175
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method
