.class public Lcom/facebook/common/v/f;
.super Ljava/lang/Object;
.source "UserInteractionController.java"


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


# instance fields
.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Lcom/facebook/common/v/i;

.field private final d:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mInteractingStateLock"
    .end annotation
.end field

.field private final e:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/facebook/common/v/j;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mListenerLock"
    .end annotation
.end field

.field private f:Landroid/os/Handler;

.field private g:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mInteractingStateLock"
    .end annotation
.end field

.field private h:Ljava/lang/Object;

.field private i:Ljava/lang/Object;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/v/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const-class v0, Lcom/facebook/common/v/f;

    sput-object v0, Lcom/facebook/common/v/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 3

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/v/f;->i:Ljava/lang/Object;

    .line 67
    iput-object p1, p0, Lcom/facebook/common/v/f;->b:Lcom/facebook/common/executors/a;

    .line 68
    new-instance v0, Lcom/facebook/common/v/i;

    invoke-direct {v0, p0}, Lcom/facebook/common/v/i;-><init>(Lcom/facebook/common/v/f;)V

    iput-object v0, p0, Lcom/facebook/common/v/f;->c:Lcom/facebook/common/v/i;

    .line 69
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/v/f;->d:Ljava/util/WeakHashMap;

    .line 70
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/v/f;->e:Ljava/util/WeakHashMap;

    .line 73
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/facebook/common/v/g;

    invoke-direct {v2, p0}, Lcom/facebook/common/v/g;-><init>(Lcom/facebook/common/v/f;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/facebook/common/v/f;->f:Landroid/os/Handler;

    .line 80
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/v/f;->j:Ljava/util/List;

    .line 81
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/v/f;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/common/v/f;->e()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/common/v/f;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/common/v/f;)Ljava/util/WeakHashMap;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/common/v/f;->d:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    .line 210
    iget-object v1, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 211
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/v/f;->b()Z

    move-result v0

    .line 212
    iget-boolean v2, p0, Lcom/facebook/common/v/f;->g:Z

    if-eq v0, v2, :cond_0

    .line 213
    iget-object v0, p0, Lcom/facebook/common/v/f;->f:Landroid/os/Handler;

    const/4 v2, 0x0

    const-wide/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 215
    :cond_0
    monitor-exit v1

    .line 216
    return-void

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 219
    iget-object v0, p0, Lcom/facebook/common/v/f;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 222
    iget-object v2, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    monitor-enter v2

    .line 223
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/v/f;->b()Z

    move-result v0

    .line 224
    iget-boolean v3, p0, Lcom/facebook/common/v/f;->g:Z

    if-eq v0, v3, :cond_3

    .line 225
    const/4 v1, 0x1

    .line 227
    iput-boolean v0, p0, Lcom/facebook/common/v/f;->g:Z

    move v5, v0

    move v0, v1

    move v1, v5

    .line 229
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 230
    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lcom/facebook/common/v/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 232
    iget-object v2, p0, Lcom/facebook/common/v/f;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 237
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/v/f;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/j;

    .line 238
    iget-object v4, p0, Lcom/facebook/common/v/f;->j:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 240
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 229
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 240
    :cond_0
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 241
    iget-object v0, p0, Lcom/facebook/common/v/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/j;

    .line 242
    invoke-virtual {v0, v1}, Lcom/facebook/common/v/j;->a(Z)V

    goto :goto_2

    .line 244
    :cond_1
    iget-object v0, p0, Lcom/facebook/common/v/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 246
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/i;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/common/v/f;->c:Lcom/facebook/common/v/i;

    return-object v0
.end method

.method public a(J)V
    .locals 6

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/common/v/f;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 175
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 176
    new-instance v1, Lcom/facebook/common/v/h;

    invoke-direct {v1, p0, v0}, Lcom/facebook/common/v/h;-><init>(Lcom/facebook/common/v/f;Ljava/util/concurrent/Semaphore;)V

    .line 186
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 187
    invoke-virtual {p0, v1}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/j;)V

    .line 189
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v4}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    .line 190
    if-nez v0, :cond_0

    .line 191
    sget-object v0, Lcom/facebook/common/v/f;->a:Ljava/lang/Class;

    const-string v4, "User is interacting with UI. Unblock data processing anyway."

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 194
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 195
    const-wide/16 v4, 0xa

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 196
    sget-object v0, Lcom/facebook/common/v/f;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "User interaction blocked data processing for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ms."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 199
    :cond_1
    invoke-virtual {p0, v1}, Lcom/facebook/common/v/f;->b(Lcom/facebook/common/v/j;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :goto_0
    return-void

    .line 200
    :catch_0
    move-exception v0

    .line 201
    sget-object v1, Lcom/facebook/common/v/f;->a:Ljava/lang/Class;

    const-string v2, "Exception when the user interaction to be finished."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/common/v/f;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 128
    iget-object v1, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/f;->d:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    invoke-direct {p0}, Lcom/facebook/common/v/f;->e()V

    .line 132
    return-void

    .line 130
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/facebook/common/v/j;)V
    .locals 3

    .prologue
    .line 103
    iget-object v1, p0, Lcom/facebook/common/v/f;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/f;->e:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    invoke-virtual {p0}, Lcom/facebook/common/v/f;->b()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/facebook/common/v/j;->a(Z)V

    .line 107
    return-void

    .line 105
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/common/v/f;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 142
    iget-object v1, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/f;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-direct {p0}, Lcom/facebook/common/v/f;->d()V

    .line 146
    return-void

    .line 144
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(Lcom/facebook/common/v/j;)V
    .locals 2

    .prologue
    .line 115
    iget-object v1, p0, Lcom/facebook/common/v/f;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/f;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    monitor-exit v1

    .line 118
    return-void

    .line 117
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 154
    iget-object v1, p0, Lcom/facebook/common/v/f;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 155
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/f;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 156
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 164
    const-wide/16 v0, 0x2710

    invoke-virtual {p0, v0, v1}, Lcom/facebook/common/v/f;->a(J)V

    .line 165
    return-void
.end method
