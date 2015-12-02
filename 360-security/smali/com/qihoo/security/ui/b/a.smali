.class public Lcom/qihoo/security/ui/b/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/b/a$c;,
        Lcom/qihoo/security/ui/b/a$d;,
        Lcom/qihoo/security/ui/b/a$e;,
        Lcom/qihoo/security/ui/b/a$b;,
        Lcom/qihoo/security/ui/b/a$a;,
        Lcom/qihoo/security/ui/b/a$f;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field private static h:Lcom/qihoo/security/ui/b/a;


# instance fields
.field private final b:Landroid/view/LayoutInflater;

.field private c:Lcom/qihoo/security/ui/b/a$b;

.field private final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/b/a$c;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Handler;

.field private final f:Landroid/content/BroadcastReceiver;

.field private final g:Lcom/qihoo/security/ui/b/a$a;

.field private final i:Landroid/content/Context;

.field private final j:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/ui/util/AsyncInflater$TaskWrapper",
            "<**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/b/a;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Lcom/qihoo/security/ui/b/a$b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/a$b;-><init>(Lcom/qihoo/security/ui/b/a;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->c:Lcom/qihoo/security/ui/b/a$b;

    .line 67
    new-instance v0, Lcom/qihoo/security/ui/b/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/b/a$1;-><init>(Lcom/qihoo/security/ui/b/a;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->f:Landroid/content/BroadcastReceiver;

    .line 441
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->j:Landroid/util/SparseArray;

    .line 115
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->b:Landroid/view/LayoutInflater;

    .line 118
    new-instance v0, Lcom/qihoo/security/ui/b/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/b/a$a;-><init>(Lcom/qihoo/security/ui/b/a$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->g:Lcom/qihoo/security/ui/b/a$a;

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 120
    if-eqz v0, :cond_0

    .line 121
    iget-object v1, p0, Lcom/qihoo/security/ui/b/a;->g:Lcom/qihoo/security/ui/b/a$a;

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    iput v0, v1, Lcom/qihoo/security/ui/b/a$a;->a:F

    .line 124
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->e:Landroid/os/Handler;

    .line 125
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    .line 130
    invoke-direct {p0}, Lcom/qihoo/security/ui/b/a;->b()V

    .line 131
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/b/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$c;
    .locals 6

    .prologue
    .line 304
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    iget v1, p1, Lcom/qihoo/security/ui/b/a$d;->b:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 305
    if-nez v0, :cond_0

    .line 306
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 307
    iget-object v1, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    iget v2, p1, Lcom/qihoo/security/ui/b/a$d;->b:I

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 309
    :cond_0
    new-instance v1, Lcom/qihoo/security/ui/b/a$c;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/b/a$c;-><init>(Lcom/qihoo/security/ui/b/a;Lcom/qihoo/security/ui/b/a$d;)V

    .line 310
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->e:Landroid/os/Handler;

    new-instance v2, Lcom/qihoo/security/ui/b/a$2;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/ui/b/a$2;-><init>(Lcom/qihoo/security/ui/b/a;Lcom/qihoo/security/ui/b/a$c;)V

    const-wide/16 v4, 0x3e8

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 316
    return-object v1
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/b/a;
    .locals 3

    .prologue
    .line 199
    const-class v1, Lcom/qihoo/security/ui/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/b/a;->h:Lcom/qihoo/security/ui/b/a;

    if-nez v0, :cond_0

    .line 200
    new-instance v0, Lcom/qihoo/security/ui/b/a;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/ui/b/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/ui/b/a;->h:Lcom/qihoo/security/ui/b/a;

    .line 202
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/b/a;->h:Lcom/qihoo/security/ui/b/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 199
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/b/a;)Lcom/qihoo/security/ui/b/a$b;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->c:Lcom/qihoo/security/ui/b/a$b;

    return-object v0
.end method

.method private b(I[IZ)Lcom/qihoo/security/ui/b/a$c;
    .locals 3

    .prologue
    .line 290
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 291
    if-nez v0, :cond_0

    .line 292
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 293
    iget-object v1, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 295
    :cond_0
    new-instance v1, Lcom/qihoo/security/ui/b/a$d;

    invoke-direct {v1, p1, p2, p3}, Lcom/qihoo/security/ui/b/a$d;-><init>(I[IZ)V

    .line 296
    new-instance v2, Lcom/qihoo/security/ui/b/a$c;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/ui/b/a$c;-><init>(Lcom/qihoo/security/ui/b/a;Lcom/qihoo/security/ui/b/a$d;)V

    .line 297
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    sget-object v0, Lcom/qihoo/security/ui/b/a;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 300
    return-object v2
.end method

.method private b()V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 135
    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 136
    const-string/jumbo v2, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 137
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 138
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "android.intent.action.LOCALE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 139
    iget-object v1, p0, Lcom/qihoo/security/ui/b/a;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/b/a;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 140
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/b/a;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->b:Landroid/view/LayoutInflater;

    return-object v0
.end method


# virtual methods
.method public a(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 195
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->c:Lcom/qihoo/security/ui/b/a$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public a(I[IZ)V
    .locals 3

    .prologue
    .line 336
    iget-object v1, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    monitor-enter v1

    .line 337
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 338
    if-nez v0, :cond_1

    .line 339
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 340
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 341
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/b/a;->b(I[IZ)Lcom/qihoo/security/ui/b/a$c;

    .line 347
    :cond_0
    :goto_0
    monitor-exit v1

    .line 349
    return-void

    .line 344
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p3, :cond_0

    .line 345
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/b/a;->b(I[IZ)Lcom/qihoo/security/ui/b/a$c;

    goto :goto_0

    .line 347
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 431
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->g:Lcom/qihoo/security/ui/b/a$a;

    iget v0, v0, Lcom/qihoo/security/ui/b/a$a;->a:F

    .line 432
    iget v1, p1, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 433
    const-string/jumbo v0, "font scale"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/b/a;->a(Ljava/lang/String;)V

    .line 434
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->g:Lcom/qihoo/security/ui/b/a$a;

    iget v1, p1, Landroid/content/res/Configuration;->fontScale:F

    iput v1, v0, Lcom/qihoo/security/ui/b/a$a;->a:F

    .line 436
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 355
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    monitor-enter v2

    .line 356
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    .line 358
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_2

    .line 359
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 360
    if-eqz v0, :cond_1

    .line 362
    iget-object v5, p0, Lcom/qihoo/security/ui/b/a;->e:Landroid/os/Handler;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 363
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/a$c;

    .line 365
    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$c;->a:Lcom/qihoo/security/ui/b/a$d;

    .line 366
    if-eqz v0, :cond_0

    iget-boolean v6, v0, Lcom/qihoo/security/ui/b/a$d;->a:Z

    if-eqz v6, :cond_0

    .line 367
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 376
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 358
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 372
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 373
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/a$d;

    .line 374
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/b/a;->a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$c;

    goto :goto_2

    .line 376
    :cond_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 378
    return-void
.end method

.method public a([I)V
    .locals 2

    .prologue
    .line 188
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 192
    :cond_0
    :goto_0
    return-void

    .line 191
    :cond_1
    sget-object v0, Lcom/qihoo/security/ui/b/a;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/qihoo/security/ui/b/a$e;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/b/a$e;-><init>(Lcom/qihoo/security/ui/b/a;[I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public b(I)Lcom/qihoo/security/ui/b/a$f;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 390
    .line 391
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 393
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 397
    :cond_0
    monitor-exit v2

    move-object v0, v1

    .line 423
    :goto_0
    return-object v0

    .line 399
    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/a$c;

    .line 401
    iget-object v3, v0, Lcom/qihoo/security/ui/b/a$c;->a:Lcom/qihoo/security/ui/b/a$d;

    .line 402
    iget-boolean v4, v3, Lcom/qihoo/security/ui/b/a$d;->a:Z

    if-eqz v4, :cond_2

    .line 403
    invoke-direct {p0, v3}, Lcom/qihoo/security/ui/b/a;->a(Lcom/qihoo/security/ui/b/a$d;)Lcom/qihoo/security/ui/b/a$c;

    .line 405
    :cond_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 406
    :try_start_2
    invoke-virtual {v0}, Lcom/qihoo/security/ui/b/a$c;->a()Lcom/qihoo/security/ui/b/a$f;

    move-result-object v2

    .line 407
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v3

    .line 411
    if-eqz v3, :cond_3

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$c;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    if-nez v0, :cond_3

    move-object v0, v1

    .line 415
    goto :goto_0

    .line 405
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 418
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 423
    goto :goto_0

    :cond_3
    move-object v0, v2

    .line 417
    goto :goto_0
.end method
