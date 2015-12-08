.class public Lcom/flurry/sdk/ij;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:Ljava/util/concurrent/atomic/AtomicInteger;

.field static d:Lcom/flurry/sdk/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jv",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ik;",
            ">;>;"
        }
    .end annotation
.end field

.field private static f:Lcom/flurry/sdk/ij;

.field private static g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/flurry/sdk/ik;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Ljava/lang/String;

.field private final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field private i:J

.field private j:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/jh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-class v0, Lcom/flurry/sdk/ij;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    .line 50
    new-instance v0, Lcom/flurry/sdk/ij$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/ij$1;-><init>(Lcom/flurry/sdk/ij;)V

    iput-object v0, p0, Lcom/flurry/sdk/ij;->j:Lcom/flurry/sdk/jx;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/flurry/sdk/ij;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 71
    sget v0, Lcom/flurry/sdk/ij;->b:I

    if-nez v0, :cond_0

    .line 72
    const v0, 0x927c0

    sput v0, Lcom/flurry/sdk/ij;->b:I

    .line 75
    :cond_0
    sget v0, Lcom/flurry/sdk/ij;->a:I

    if-nez v0, :cond_1

    .line 76
    const/16 v0, 0xf

    sput v0, Lcom/flurry/sdk/ij;->a:I

    .line 79
    :cond_1
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->n()V

    .line 81
    sget-object v0, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    if-nez v0, :cond_2

    .line 82
    invoke-static {}, Lcom/flurry/sdk/ij;->q()V

    .line 85
    :cond_2
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.NetworkStateEvent"

    iget-object v2, p0, Lcom/flurry/sdk/ij;->j:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 86
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/ij;
    .locals 2

    .prologue
    .line 89
    const-class v1, Lcom/flurry/sdk/ij;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Lcom/flurry/sdk/ij;

    invoke-direct {v0}, Lcom/flurry/sdk/ij;-><init>()V

    sput-object v0, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;

    .line 93
    :cond_0
    sget-object v0, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/flurry/sdk/ij;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)V
    .locals 0

    .prologue
    .line 106
    sput p0, Lcom/flurry/sdk/ij;->a:I

    .line 107
    return-void
.end method

.method public static b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 97
    sget-object v0, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;

    if-eqz v0, :cond_0

    .line 98
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.NetworkStateEvent"

    sget-object v2, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;

    iget-object v2, v2, Lcom/flurry/sdk/ij;->j:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->b(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 99
    sget-object v0, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 100
    sput-object v3, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    .line 101
    sput-object v3, Lcom/flurry/sdk/ij;->f:Lcom/flurry/sdk/ij;

    .line 103
    :cond_0
    return-void
.end method

.method public static b(I)V
    .locals 0

    .prologue
    .line 110
    sput p0, Lcom/flurry/sdk/ij;->b:I

    .line 111
    return-void
.end method

.method static synthetic b(Lcom/flurry/sdk/ij;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->o()V

    return-void
.end method

.method private c(Lcom/flurry/sdk/ih;)V
    .locals 4

    .prologue
    .line 343
    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/flurry/sdk/ih;->d:Z

    .line 346
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->a()V

    .line 349
    sget-object v0, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 352
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->g()V

    .line 354
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " finalized."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 358
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->d()V

    .line 360
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->g()V

    .line 361
    return-void
.end method

.method static synthetic f()V
    .locals 0

    .prologue
    .line 31
    invoke-static {}, Lcom/flurry/sdk/ij;->q()V

    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 365
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/flurry/sdk/ij;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    :cond_0
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    const-string v2, "Threshold reached. Sending callback logging reports"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 368
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->l()V

    .line 370
    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 373
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    const-string v2, "Max Callback Attempts threshold reached. Sending callback logging reports"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 375
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->l()V

    .line 377
    :cond_0
    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 380
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    const-string v2, "Time threshold reached. Sending callback logging reports"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 382
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->l()V

    .line 384
    :cond_0
    return-void
.end method

.method private j()Z
    .locals 2

    .prologue
    .line 387
    sget-object v0, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    sget v1, Lcom/flurry/sdk/ij;->a:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()Z
    .locals 4

    .prologue
    .line 391
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/flurry/sdk/ij;->i:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()V
    .locals 10

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 400
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 404
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ig;

    .line 405
    iget-object v1, v1, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 406
    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 407
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ih;

    .line 410
    iget-boolean v8, v1, Lcom/flurry/sdk/ih;->j:Z

    if-eqz v8, :cond_3

    .line 411
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 416
    :cond_3
    iget-object v8, v1, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    sget-object v9, Lcom/flurry/sdk/ii;->d:Lcom/flurry/sdk/ii;

    invoke-virtual {v8, v9}, Lcom/flurry/sdk/ii;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 424
    iput-boolean v4, v1, Lcom/flurry/sdk/ih;->j:Z

    move v2, v4

    goto :goto_1

    .line 428
    :cond_4
    if-eqz v2, :cond_0

    .line 429
    invoke-static {}, Lcom/flurry/sdk/il;->a()Lcom/flurry/sdk/il;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/il;->a(Lcom/flurry/sdk/ik;)V

    goto :goto_0

    .line 434
    :cond_5
    invoke-static {}, Lcom/flurry/sdk/il;->a()Lcom/flurry/sdk/il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/il;->c()V

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget v2, Lcom/flurry/sdk/ij;->b:I

    int-to-long v4, v2

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    .line 438
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->o()V

    .line 441
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->m()V

    .line 444
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 446
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->d()V

    .line 447
    return-void
.end method

.method private m()V
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 454
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->c()Ljava/util/List;

    move-result-object v5

    move v2, v3

    .line 457
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 458
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ik;

    .line 461
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 462
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/flurry/sdk/ij;->c(I)V

    .line 457
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 466
    :cond_1
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v6

    move v4, v3

    .line 469
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_0

    .line 470
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ig;

    .line 472
    invoke-virtual {v1}, Lcom/flurry/sdk/ig;->n()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 473
    invoke-virtual {v0}, Lcom/flurry/sdk/ik;->e()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Lcom/flurry/sdk/ig;->e()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    :cond_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_1

    .line 478
    :cond_3
    iget-object v1, v1, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 479
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 480
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/flurry/sdk/ih;

    .line 482
    iget-boolean v1, v1, Lcom/flurry/sdk/ih;->j:Z

    if-eqz v1, :cond_4

    .line 483
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    .line 488
    :cond_5
    return-void
.end method

.method private n()V
    .locals 4

    .prologue
    .line 491
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "FLURRY_SHARED_PREFERENCES"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 492
    const-string v1, "timeToSendNextPulseReport"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    .line 493
    return-void
.end method

.method private o()V
    .locals 4

    .prologue
    .line 496
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "FLURRY_SHARED_PREFERENCES"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 498
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 499
    const-string v1, "timeToSendNextPulseReport"

    iget-wide v2, p0, Lcom/flurry/sdk/ij;->i:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 500
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 501
    return-void
.end method

.method private declared-synchronized p()I
    .locals 1

    .prologue
    .line 504
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ij;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static q()V
    .locals 5

    .prologue
    .line 508
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, ".yflurryanongoingpulsecallbackreporter"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurryanongoingpulsecallbackreporter"

    const/4 v3, 0x2

    new-instance v4, Lcom/flurry/sdk/ij$6;

    invoke-direct {v4}, Lcom/flurry/sdk/ij$6;-><init>()V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    sput-object v0, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    .line 514
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/flurry/sdk/ih;)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    .line 205
    monitor-enter p0

    const/4 v0, 0x3

    :try_start_0
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report sent successfully to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 209
    sget-object v0, Lcom/flurry/sdk/ii;->a:Lcom/flurry/sdk/ii;

    iput-object v0, p1, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    .line 210
    const-string v0, ""

    iput-object v0, p1, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    .line 212
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ij;->c(Lcom/flurry/sdk/ih;)V

    .line 215
    invoke-static {}, Lcom/flurry/sdk/kc;->c()I

    move-result v0

    if-gt v0, v4, :cond_0

    invoke-static {}, Lcom/flurry/sdk/kc;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ij$4;

    invoke-direct {v1, p0, p1}, Lcom/flurry/sdk/ij$4;-><init>(Lcom/flurry/sdk/ij;Lcom/flurry/sdk/ih;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    :cond_0
    monitor-exit p0

    return-void

    .line 205
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/flurry/sdk/ik;)V
    .locals 4

    .prologue
    .line 115
    monitor-enter p0

    if-nez p1, :cond_1

    .line 116
    const/4 v0, 0x3

    :try_start_0
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    const-string v2, "Must add valid PulseCallbackAsyncReportInfo"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    :cond_0
    monitor-exit p0

    return-void

    .line 120
    :cond_1
    const/4 v0, 0x3

    :try_start_1
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Adding and sending "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report to PulseCallbackManager."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget v2, Lcom/flurry/sdk/ij;->b:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    .line 128
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ij$2;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/ij$2;-><init>(Lcom/flurry/sdk/ij;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 136
    :cond_2
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->p()I

    move-result v0

    .line 137
    invoke-virtual {p1, v0}, Lcom/flurry/sdk/ik;->a(I)V

    .line 138
    sget-object v1, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 141
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->e()Lcom/flurry/sdk/if;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/kn;

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/if;->b(Lcom/flurry/sdk/kn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 115
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/flurry/sdk/ih;Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 229
    monitor-enter p0

    :try_start_0
    iget v0, p1, Lcom/flurry/sdk/ih;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/flurry/sdk/ih;->h:I

    .line 230
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/flurry/sdk/ih;->i:J

    .line 232
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    :cond_0
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Maximum number of redirects attempted. Aborting: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 238
    sget-object v0, Lcom/flurry/sdk/ii;->c:Lcom/flurry/sdk/ii;

    iput-object v0, p1, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    .line 239
    const-string v0, ""

    iput-object v0, p1, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    .line 241
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ij;->c(Lcom/flurry/sdk/ih;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    const/4 v0, 0x0

    .line 257
    :goto_0
    monitor-exit p0

    return v0

    .line 247
    :cond_1
    const/4 v0, 0x3

    :try_start_1
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Report to "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " redirecting to url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 252
    invoke-virtual {p1, p2}, Lcom/flurry/sdk/ih;->a(Ljava/lang/String;)V

    .line 254
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    const/4 v0, 0x1

    goto :goto_0

    .line 229
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/flurry/sdk/ih;)V
    .locals 4

    .prologue
    .line 262
    monitor-enter p0

    const/4 v0, 0x3

    :try_start_0
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Maximum number of attempts reached. Aborting: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 265
    sget-object v0, Lcom/flurry/sdk/ii;->b:Lcom/flurry/sdk/ii;

    iput-object v0, p1, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    .line 266
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/flurry/sdk/ih;->i:J

    .line 267
    const-string v0, ""

    iput-object v0, p1, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    .line 270
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ij;->c(Lcom/flurry/sdk/ih;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    monitor-exit p0

    return-void

    .line 262
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/flurry/sdk/ik;)V
    .locals 4

    .prologue
    .line 150
    monitor-enter p0

    if-nez p1, :cond_0

    .line 151
    const/4 v0, 0x3

    :try_start_0
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    const-string v2, "Must add valid PulseCallbackAsyncReportInfo"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    :goto_0
    monitor-exit p0

    return-void

    .line 155
    :cond_0
    :try_start_1
    iget-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 156
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget v2, Lcom/flurry/sdk/ij;->b:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/flurry/sdk/ij;->i:J

    .line 158
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ij$3;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/ij$3;-><init>(Lcom/flurry/sdk/ij;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 167
    :cond_1
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->p()I

    move-result v0

    .line 168
    invoke-virtual {p1, v0}, Lcom/flurry/sdk/ik;->a(I)V

    .line 169
    sget-object v1, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ig;

    .line 173
    iget-object v0, v0, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    sget-object v2, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 175
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 180
    :cond_3
    :try_start_2
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->i()V

    .line 182
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Restoring "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ik;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " report to PulseCallbackManager. Number of stored completed callbacks: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method public declared-synchronized b(Lcom/flurry/sdk/ih;Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 277
    monitor-enter p0

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/ii;->c:Lcom/flurry/sdk/ii;

    iput-object v1, p1, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    .line 278
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p1, Lcom/flurry/sdk/ih;->i:J

    .line 279
    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    iput-object p2, p1, Lcom/flurry/sdk/ih;->g:Ljava/lang/String;

    .line 283
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 284
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Maximum number of attempts reached. Aborting: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " report to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 289
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ij;->c(Lcom/flurry/sdk/ih;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 314
    :goto_0
    monitor-exit p0

    return v0

    .line 292
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/flurry/sdk/lt;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 293
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Url: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " is invalid."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 297
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ij;->c(Lcom/flurry/sdk/ih;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 277
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 302
    :cond_2
    const/4 v0, 0x3

    :try_start_2
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Retrying callback to "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " in: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v3}, Lcom/flurry/sdk/ig;->g()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " seconds."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 305
    const/4 v0, 0x1

    .line 307
    invoke-virtual {p1}, Lcom/flurry/sdk/ih;->a()V

    .line 309
    sget-object v1, Lcom/flurry/sdk/ij;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 310
    invoke-virtual {p0}, Lcom/flurry/sdk/ij;->d()V

    .line 311
    invoke-direct {p0}, Lcom/flurry/sdk/ij;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ik;",
            ">;"
        }
    .end annotation

    .prologue
    .line 199
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 200
    return-object v0
.end method

.method public declared-synchronized c(I)V
    .locals 4

    .prologue
    .line 188
    monitor-enter p0

    const/4 v0, 0x3

    :try_start_0
    iget-object v1, p0, Lcom/flurry/sdk/ij;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Removing report "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " from PulseCallbackManager"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 189
    sget-object v0, Lcom/flurry/sdk/ij;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    monitor-exit p0

    return-void

    .line 188
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 318
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ij$5;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/ij$5;-><init>(Lcom/flurry/sdk/ij;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 330
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ik;",
            ">;"
        }
    .end annotation

    .prologue
    .line 333
    sget-object v0, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    if-nez v0, :cond_0

    .line 334
    invoke-static {}, Lcom/flurry/sdk/ij;->q()V

    .line 337
    :cond_0
    sget-object v0, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 339
    return-object v0
.end method
