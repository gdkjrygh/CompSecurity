.class public Lcom/qihoo360/mobilesafe/core/b;
.super Lcom/qihoo360/mobilesafe/core/ProcessState;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/b$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field private static final c:Ljava/lang/String;


# instance fields
.field private d:Landroid/content/Context;

.field private e:Landroid/app/ActivityManager;

.field private f:Landroid/content/pm/PackageManager;

.field private g:Lcom/qihoo360/mobilesafe/core/b/c;

.field private h:Lcom/qihoo360/mobilesafe/core/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/b;->c:Ljava/lang/String;

    .line 44
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/b;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/ProcessState;-><init>()V

    .line 47
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/b;->a(Landroid/content/Context;)V

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    .line 53
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_NULL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 54
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->f:Landroid/content/pm/PackageManager;

    .line 55
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    const-string/jumbo v1, "activity"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->e:Landroid/app/ActivityManager;

    .line 56
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b/c;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/core/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->g:Lcom/qihoo360/mobilesafe/core/b/c;

    .line 57
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b/b;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/core/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->h:Lcom/qihoo360/mobilesafe/core/b/b;

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 280
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/b;->a(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 281
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 284
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/b;)Landroid/app/ActivityManager;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->e:Landroid/app/ActivityManager;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .prologue
    .line 295
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/b;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 299
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 300
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    invoke-interface {v6, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 303
    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 304
    invoke-interface {v6, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 307
    :cond_1
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 310
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_CANCEL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    if-eq v0, v1, :cond_3

    .line 312
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 313
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 314
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    .line 315
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/f;->a()Lcom/qihoo360/mobilesafe/core/d/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/core/d/f;->b()Z

    move-result v5

    .line 317
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v3, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 319
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 320
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    .line 321
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 351
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    :try_start_1
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 361
    :goto_1
    :try_start_2
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    move-object v0, v6

    .line 377
    :goto_2
    return-object v0

    .line 321
    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 323
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b$1;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/core/b$1;-><init>(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/CountDownLatch;Lcom/qihoo360/mobilesafe/service/ProcessInfo;Z)V

    .line 348
    invoke-interface {v7, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 369
    :catch_0
    move-exception v0

    .line 377
    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    .line 355
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/pm/PackageManager;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->f:Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/b;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->h:Lcom/qihoo360/mobilesafe/core/b/b;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/c;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b;->g:Lcom/qihoo360/mobilesafe/core/b/c;

    return-object v0
.end method


# virtual methods
.method public a(ZLcom/qihoo360/mobilesafe/core/b/d;)V
    .locals 3

    .prologue
    .line 387
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/b$a;-><init>(Lcom/qihoo360/mobilesafe/core/b;ZLcom/qihoo360/mobilesafe/core/b/d;)V

    .line 388
    sget-object v1, Lcom/qihoo360/mobilesafe/core/b;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/b$a;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    .line 389
    return-void
.end method
