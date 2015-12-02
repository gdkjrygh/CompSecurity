.class public Lcom/qihoo360/mobilesafe/support/a/e;
.super Lcom/qihoo360/mobilesafe/support/a/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/support/a/e$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/qihoo360/mobilesafe/support/a/c;

.field private c:Landroid/os/Handler;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/b$a;-><init>()V

    .line 483
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->d:I

    .line 67
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/e;->b(Landroid/content/Context;)V

    .line 68
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 71
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/support/a/e;J)Z
    .locals 1

    .prologue
    .line 526
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/support/a/e;->c(J)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 649
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->k()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 76
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 77
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    .line 79
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "root-thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 82
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/e$1;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo360/mobilesafe/support/a/e$1;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    .line 114
    :cond_0
    return-void
.end method

.method private b(J)Z
    .locals 3

    .prologue
    .line 434
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/e$a;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/support/a/e$a;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;)V

    .line 436
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 437
    const/16 v2, 0xc8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 438
    iput-wide p1, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->a:J

    .line 439
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 441
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 442
    monitor-enter v1

    .line 444
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    if-eqz v0, :cond_0

    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 450
    const/4 v0, 0x0

    .line 451
    if-eqz v1, :cond_1

    .line 452
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->c:Z

    .line 453
    :cond_1
    return v0

    .line 442
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 446
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private c(J)Z
    .locals 5

    .prologue
    const/16 v4, 0xcc

    const/4 v0, 0x0

    .line 527
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 577
    :cond_0
    :goto_0
    return v0

    .line 529
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a()Z

    move-result v1

    if-nez v1, :cond_4

    .line 530
    :cond_2
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 537
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 550
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/common/c/a;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x30e12

    if-eq v1, v2, :cond_5

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 551
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v1, p1, p2}, Lcom/qihoo360/mobilesafe/support/a/c;->a(J)Z

    move-result v1

    .line 553
    :goto_1
    if-nez v1, :cond_3

    .line 554
    iget v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->d:I

    .line 555
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->h()Z

    .line 565
    :goto_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    move v0, v1

    .line 574
    goto :goto_0

    .line 560
    :cond_3
    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->d:I

    goto :goto_2

    .line 577
    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/support/a/e;)Z
    .locals 1

    .prologue
    .line 479
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 625
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->j()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 686
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->m()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    return-object v0
.end method

.method private e()Z
    .locals 3

    .prologue
    .line 458
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/e$a;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/support/a/e$a;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;)V

    .line 460
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 461
    const/16 v2, 0xc9

    iput v2, v0, Landroid/os/Message;->what:I

    .line 462
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 464
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 465
    monitor-enter v1

    .line 467
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    if-eqz v0, :cond_0

    .line 468
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 465
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 473
    const/4 v0, 0x0

    .line 474
    if-eqz v1, :cond_1

    .line 475
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->c:Z

    .line 476
    :cond_1
    return v0

    .line 465
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 469
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 480
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->m()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->a()Z

    move-result v0

    return v0
.end method

.method private g()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 487
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 489
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    .line 490
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    move v0, v1

    .line 515
    :goto_1
    return v0

    .line 490
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 491
    if-eqz v0, :cond_0

    const-string/jumbo v3, "com.lbe.security.miui"

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 494
    const/4 v0, 0x1

    goto :goto_1

    .line 499
    :catch_0
    move-exception v0

    goto :goto_0

    .line 497
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private h()Z
    .locals 2

    .prologue
    .line 520
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->d:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 521
    const/4 v0, 0x1

    .line 523
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 591
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 592
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 593
    :cond_0
    return-void
.end method

.method private j()Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 2

    .prologue
    .line 626
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 627
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 639
    :goto_0
    return-object v0

    .line 629
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-nez v0, :cond_1

    .line 630
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->k()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 631
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-eqz v0, :cond_1

    .line 632
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    goto :goto_0

    .line 634
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-eqz v0, :cond_2

    .line 635
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->f()V

    .line 637
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 638
    const-wide/16 v0, 0x4268

    invoke-direct {p0, v0, v1}, Lcom/qihoo360/mobilesafe/support/a/e;->c(J)Z

    .line 639
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    goto :goto_0
.end method

.method private k()Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 2

    .prologue
    .line 650
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 651
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 652
    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 655
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 3

    .prologue
    .line 665
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/e$a;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/support/a/e$a;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;)V

    .line 667
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 668
    const/16 v2, 0xcb

    iput v2, v0, Landroid/os/Message;->what:I

    .line 669
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 671
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 672
    monitor-enter v1

    .line 674
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    if-eqz v0, :cond_0

    .line 675
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 672
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 680
    const/4 v0, 0x0

    .line 681
    if-eqz v1, :cond_1

    .line 682
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 683
    :cond_1
    return-object v0

    .line 672
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 676
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private m()Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 1

    .prologue
    .line 687
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    if-eqz v0, :cond_0

    .line 688
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 691
    :goto_0
    return-object v0

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 691
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 236
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 238
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/e$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/e$2;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V

    .line 252
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/e$2;->start()V

    .line 254
    return-void
.end method

.method public a()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 175
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 176
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->e()Z

    move-result v0

    return v0
.end method

.method public a(IIJ)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 375
    .line 377
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 379
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 381
    if-eqz v0, :cond_0

    .line 382
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/c;->a(IIJ)Z

    move-result v0

    .line 384
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(J)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 188
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 190
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/support/a/e;->b(J)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;IIJ)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 354
    .line 356
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 358
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 360
    if-eqz v0, :cond_0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    .line 361
    invoke-virtual/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;IIJ)Z

    move-result v0

    .line 363
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;IJ)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 314
    .line 316
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 317
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 319
    if-eqz v0, :cond_0

    .line 320
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;IJ)Z

    move-result v0

    .line 322
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 332
    .line 334
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 335
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 337
    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {v0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 340
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 396
    .line 398
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 400
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 402
    if-eqz v0, :cond_0

    .line 403
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    .line 405
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 413
    .line 415
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 417
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 419
    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move-object v6, p6

    move-wide/from16 v7, p7

    .line 420
    invoke-virtual/range {v0 .. v8}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Z

    move-result v0

    .line 422
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 124
    .line 126
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 127
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 130
    invoke-virtual/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Z

    move-result v0

    .line 132
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 136
    .line 138
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 139
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 143
    invoke-virtual/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I

    move-result v0

    .line 145
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 260
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 263
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/e$3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/e$3;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V

    .line 277
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/e$3;->start()V

    .line 279
    return-void
.end method

.method public b()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 215
    .line 217
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 218
    const/4 v0, 0x0

    .line 225
    :goto_0
    return v0

    .line 220
    :cond_0
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->l()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_1

    .line 223
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->b()Z

    move-result v0

    goto :goto_0

    .line 225
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 199
    .line 201
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 202
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 204
    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->c()I

    move-result v0

    .line 207
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 156
    .line 158
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->i()V

    .line 159
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 163
    invoke-virtual/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    .line 165
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method d()Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 3

    .prologue
    .line 604
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/e$a;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/support/a/e$a;-><init>(Lcom/qihoo360/mobilesafe/support/a/e;)V

    .line 606
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 607
    const/16 v2, 0xca

    iput v2, v0, Landroid/os/Message;->what:I

    .line 608
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 610
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 611
    monitor-enter v1

    .line 613
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    if-eqz v0, :cond_0

    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 611
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 619
    const/4 v0, 0x0

    .line 620
    if-eqz v1, :cond_1

    .line 621
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/support/a/e$a;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 622
    :cond_1
    return-object v0

    .line 611
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 615
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 728
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 729
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 730
    :cond_0
    invoke-super {p0}, Lcom/qihoo360/mobilesafe/support/a/b$a;->finalize()V

    .line 731
    return-void
.end method
