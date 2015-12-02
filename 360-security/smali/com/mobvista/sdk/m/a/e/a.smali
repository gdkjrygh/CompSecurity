.class public final Lcom/mobvista/sdk/m/a/e/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/e/d;


# static fields
.field private static b:Lcom/mobvista/sdk/m/a/e/a;


# instance fields
.field private final a:I

.field private final c:I

.field private final d:I

.field private e:I

.field private f:Ljava/util/concurrent/ExecutorService;

.field private g:Ljava/util/concurrent/ExecutorService;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private i:Ljava/util/LinkedList;

.field private j:Ljava/util/LinkedList;

.field private k:Lcom/mobvista/sdk/m/a/e/c;

.field private l:Ljava/util/HashMap;

.field private m:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput-object v0, Lcom/mobvista/sdk/m/a/e/a;->b:Lcom/mobvista/sdk/m/a/e/a;

    return-void
.end method

.method protected constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x5

    const/4 v1, 0x0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput v2, p0, Lcom/mobvista/sdk/m/a/e/a;->a:I

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/e/a;->c:I

    .line 23
    const/4 v0, 0x2

    iput v0, p0, Lcom/mobvista/sdk/m/a/e/a;->d:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/a/e/a;->e:I

    .line 28
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->f:Ljava/util/concurrent/ExecutorService;

    .line 29
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->g:Ljava/util/concurrent/ExecutorService;

    .line 30
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->h:Ljava/util/concurrent/ExecutorService;

    .line 33
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    .line 34
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    .line 42
    iput-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    .line 46
    new-instance v0, Lcom/mobvista/sdk/m/a/e/b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/a/e/b;-><init>(Lcom/mobvista/sdk/m/a/e/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->m:Landroid/os/Handler;

    .line 82
    invoke-static {v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->f:Ljava/util/concurrent/ExecutorService;

    .line 83
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->g:Ljava/util/concurrent/ExecutorService;

    .line 84
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->h:Ljava/util/concurrent/ExecutorService;

    .line 87
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    .line 88
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    .line 91
    return-void
.end method

.method public static a()Lcom/mobvista/sdk/m/a/e/a;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/mobvista/sdk/m/a/e/a;->b:Lcom/mobvista/sdk/m/a/e/a;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lcom/mobvista/sdk/m/a/e/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/a/e/a;-><init>()V

    sput-object v0, Lcom/mobvista/sdk/m/a/e/a;->b:Lcom/mobvista/sdk/m/a/e/a;

    .line 97
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/a/e/a;->b:Lcom/mobvista/sdk/m/a/e/a;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/a/e/a;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    return-object v0
.end method

.method private c(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I
    .locals 2

    .prologue
    .line 173
    const/4 v0, 0x2

    iput v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    .line 174
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/a;->d()I

    move-result v0

    .line 175
    invoke-virtual {p1, v0}, Lcom/mobvista/sdk/m/a/e/c;->a(I)V

    .line 176
    invoke-virtual {p1, p0}, Lcom/mobvista/sdk/m/a/e/c;->a(Lcom/mobvista/sdk/m/a/e/d;)V

    .line 192
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 194
    return v0
.end method

.method private declared-synchronized d()I
    .locals 1

    .prologue
    .line 254
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/mobvista/sdk/m/a/e/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/e/a;->e:I

    .line 255
    iget v0, p0, Lcom/mobvista/sdk/m/a/e/a;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 254
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 274
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    monitor-enter v1

    .line 275
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/a/e/c;

    .line 276
    const/4 v3, 0x0

    iput-boolean v3, v0, Lcom/mobvista/sdk/m/a/e/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 279
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 278
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 279
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->k:Lcom/mobvista/sdk/m/a/e/c;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->k:Lcom/mobvista/sdk/m/a/e/c;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mobvista/sdk/m/a/e/c;->c:Z

    .line 287
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->k:Lcom/mobvista/sdk/m/a/e/c;

    .line 288
    return-void
.end method


# virtual methods
.method public final a(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I
    .locals 3

    .prologue
    .line 113
    const/4 v0, 0x1

    iput v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    .line 114
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/a;->d()I

    move-result v0

    .line 115
    invoke-virtual {p1, v0}, Lcom/mobvista/sdk/m/a/e/c;->a(I)V

    .line 116
    if-eqz p2, :cond_0

    .line 117
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    :cond_0
    invoke-virtual {p1, p0}, Lcom/mobvista/sdk/m/a/e/c;->a(Lcom/mobvista/sdk/m/a/e/d;)V

    .line 132
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 134
    return v0
.end method

.method public final declared-synchronized a(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 2

    .prologue
    .line 308
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/a/e/c;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 310
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 311
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 315
    :cond_0
    iget v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 316
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 317
    :try_start_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 318
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 328
    :goto_0
    monitor-exit p0

    return-void

    .line 318
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 308
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 320
    :cond_1
    :try_start_3
    iget v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 321
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/e/a;->k:Lcom/mobvista/sdk/m/a/e/c;

    goto :goto_0

    .line 324
    :cond_2
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 325
    :try_start_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 326
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1
.end method

.method public final b(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I
    .locals 3

    .prologue
    .line 147
    const/4 v0, 0x3

    iput v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    .line 148
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/a;->d()I

    move-result v0

    .line 149
    invoke-virtual {p1, v0}, Lcom/mobvista/sdk/m/a/e/c;->a(I)V

    .line 150
    if-eqz p2, :cond_0

    .line 151
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    :cond_0
    invoke-virtual {p1, p0}, Lcom/mobvista/sdk/m/a/e/c;->a(Lcom/mobvista/sdk/m/a/e/d;)V

    .line 155
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 157
    return v0
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 262
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    monitor-enter v1

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/a/e/c;

    .line 264
    const/4 v3, 0x0

    iput-boolean v3, v0, Lcom/mobvista/sdk/m/a/e/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 267
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 266
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 267
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final declared-synchronized b(Lcom/mobvista/sdk/m/a/e/c;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 334
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/a/e/c;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->m:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 336
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 337
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 341
    :cond_0
    iget v0, p1, Lcom/mobvista/sdk/m/a/e/c;->e:I

    if-ne v0, v2, :cond_1

    .line 342
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 343
    :try_start_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->j:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 344
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 356
    :goto_0
    monitor-exit p0

    return-void

    .line 344
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 334
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 351
    :cond_1
    :try_start_3
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 352
    :try_start_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/a;->i:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 353
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1
.end method

.method public final c(Lcom/mobvista/sdk/m/a/e/c;)I
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/mobvista/sdk/m/a/e/a;->a(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 295
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/a/e/a;->b()V

    .line 296
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/a;->e()V

    .line 297
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/a;->f()V

    .line 298
    const/4 v0, 0x0

    sput-object v0, Lcom/mobvista/sdk/m/a/e/a;->b:Lcom/mobvista/sdk/m/a/e/a;

    .line 299
    return-void
.end method

.method public final d(Lcom/mobvista/sdk/m/a/e/c;)I
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mobvista/sdk/m/a/e/a;->c(Lcom/mobvista/sdk/m/a/e/c;Lcom/mobvista/sdk/m/a/e/d;)I

    move-result v0

    return v0
.end method
