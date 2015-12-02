.class public Lcom/qihoo360/mobilesafe/core/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static volatile k:Lcom/qihoo360/mobilesafe/core/c;


# instance fields
.field private final b:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList",
            "<",
            "Lcom/qihoo360/mobilesafe/core/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Landroid/content/pm/PackageManager;

.field private h:Lcom/qihoo360/mobilesafe/core/b;

.field private i:Lcom/qihoo360/mobilesafe/core/a;

.field private j:Landroid/os/Handler;

.field private l:Landroid/content/Context;

.field private m:Lcom/qihoo/security/service/a;

.field private n:J

.field private o:Lcom/qihoo360/mobilesafe/core/c/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/qihoo360/mobilesafe/core/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/c;->a:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/c;->k:Lcom/qihoo360/mobilesafe/core/c;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 548
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c;->f:Z

    .line 69
    iput-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->l:Landroid/content/Context;

    .line 70
    iput-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    .line 84
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/core/c$1;-><init>(Lcom/qihoo360/mobilesafe/core/c;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->o:Lcom/qihoo360/mobilesafe/core/c/c$a;

    .line 549
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 550
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c;->l:Landroid/content/Context;

    .line 551
    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    .line 552
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->g:Landroid/content/pm/PackageManager;

    .line 553
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->j:Landroid/os/Handler;

    .line 554
    new-instance v0, Lcom/qihoo360/mobilesafe/core/b;

    invoke-direct {v0, p1}, Lcom/qihoo360/mobilesafe/core/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    .line 555
    new-instance v0, Lcom/qihoo360/mobilesafe/core/a;

    invoke-direct {v0, p1}, Lcom/qihoo360/mobilesafe/core/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->i:Lcom/qihoo360/mobilesafe/core/a;

    .line 556
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    .line 557
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->d:Ljava/util/List;

    .line 558
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->e:Ljava/util/List;

    .line 562
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->g:Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/qihoo/security/service/a;)Lcom/qihoo360/mobilesafe/core/c;
    .locals 2

    .prologue
    .line 74
    sget-object v0, Lcom/qihoo360/mobilesafe/core/c;->k:Lcom/qihoo360/mobilesafe/core/c;

    if-nez v0, :cond_1

    .line 75
    const-class v1, Lcom/qihoo360/mobilesafe/core/c;

    monitor-enter v1

    .line 76
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/core/c;->k:Lcom/qihoo360/mobilesafe/core/c;

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c;

    invoke-direct {v0, p0, p1}, Lcom/qihoo360/mobilesafe/core/c;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V

    sput-object v0, Lcom/qihoo360/mobilesafe/core/c;->k:Lcom/qihoo360/mobilesafe/core/c;

    .line 75
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :cond_1
    sget-object v0, Lcom/qihoo360/mobilesafe/core/c;->k:Lcom/qihoo360/mobilesafe/core/c;

    return-object v0

    .line 75
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(I)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 898
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    if-eqz v1, :cond_0

    .line 902
    :try_start_0
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    invoke-interface {v1}, Lcom/qihoo/security/service/a;->d()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    sub-long/2addr v2, v4

    int-to-long v4, p1

    sub-long/2addr v2, v4

    .line 908
    :goto_0
    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    :try_start_1
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v4

    div-long/2addr v2, v4

    long-to-int v1, v2

    .line 909
    if-ge v1, v0, :cond_1

    .line 912
    :goto_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/service/a;->a(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 922
    :cond_0
    :goto_2
    return-void

    .line 903
    :catch_0
    move-exception v1

    .line 904
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v2

    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryFreeKb()J

    move-result-wide v4

    sub-long/2addr v2, v4

    int-to-long v4, p1

    sub-long/2addr v2, v4

    goto :goto_0

    .line 916
    :catch_1
    move-exception v0

    goto :goto_2

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private a(II)V
    .locals 3

    .prologue
    .line 765
    invoke-direct {p0, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(I)V

    .line 766
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 767
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 768
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_2

    .line 774
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 781
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    if-eqz v0, :cond_1

    .line 783
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/service/a;->b(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 790
    :cond_1
    :goto_1
    return-void

    .line 770
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/a;->a(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 768
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 784
    :catch_0
    move-exception v0

    goto :goto_1

    .line 771
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c;II)V
    .locals 0

    .prologue
    .line 826
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->b(II)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 701
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/c;->c(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c;ZLjava/util/List;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 606
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/core/c;->a(ZLjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c;ZZZLcom/qihoo360/mobilesafe/core/b/d;)V
    .locals 0

    .prologue
    .line 465
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/core/c;->a(ZZZLcom/qihoo360/mobilesafe/core/b/d;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 397
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    if-eqz v0, :cond_0

    .line 436
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c$a;

    invoke-direct {v0, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$a;-><init>(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 439
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(ZLcom/qihoo360/mobilesafe/core/b/d;)V

    .line 441
    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;ZZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;ZZ)V"
        }
    .end annotation

    .prologue
    .line 664
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 665
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 666
    if-eqz p3, :cond_2

    .line 667
    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 686
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_1

    .line 687
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    .line 688
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_4

    .line 694
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 699
    :cond_1
    return-void

    .line 669
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 670
    iget v3, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_3

    .line 677
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 690
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0, v2, p2}, Lcom/qihoo360/mobilesafe/core/c/a;->a(Ljava/util/List;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 688
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 691
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method private a(ZLjava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
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
    const/4 v0, 0x0

    .line 608
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->l()V

    .line 609
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 610
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 611
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 612
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 618
    :cond_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 619
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-interface {v1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 625
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 626
    if-eqz p1, :cond_4

    .line 627
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 639
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v1, :cond_3

    .line 640
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v3

    move v1, v0

    .line 641
    :goto_1
    if-lt v1, v3, :cond_5

    .line 647
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 653
    :cond_3
    return-void

    .line 629
    :cond_4
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 630
    invoke-interface {v2, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 643
    :cond_5
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    const/4 v4, 0x0

    invoke-interface {v0, v2, v4}, Lcom/qihoo360/mobilesafe/core/c/a;->a(Ljava/util/List;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 644
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method private a(ZZZLcom/qihoo360/mobilesafe/core/b/d;)V
    .locals 6

    .prologue
    .line 467
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->f()Z

    move-result v0

    .line 468
    if-nez p3, :cond_0

    if-nez v0, :cond_2

    .line 470
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->h:Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0, p1, p4}, Lcom/qihoo360/mobilesafe/core/b;->a(ZLcom/qihoo360/mobilesafe/core/b/d;)V

    .line 506
    :cond_1
    :goto_0
    return-void

    .line 485
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c;->f:Z

    if-eqz v0, :cond_3

    .line 489
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(Ljava/util/List;ZZ)V

    goto :goto_0

    .line 493
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 494
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 502
    const/4 v0, 0x0

    invoke-direct {p0, v2, v0, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(Ljava/util/List;ZZ)V

    goto :goto_0

    .line 494
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 495
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 496
    iget-object v5, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 497
    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->j:Landroid/os/Handler;

    return-object v0
.end method

.method private b(II)V
    .locals 3

    .prologue
    .line 827
    invoke-direct {p0, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(I)V

    .line 828
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 829
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 830
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_2

    .line 836
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 844
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    if-eqz v0, :cond_1

    .line 846
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/service/a;->a(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 853
    :cond_1
    :goto_1
    return-void

    .line 832
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/a;->b(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 830
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 847
    :catch_0
    move-exception v0

    goto :goto_1

    .line 833
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/c;II)V
    .locals 0

    .prologue
    .line 764
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(II)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 443
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/c;->b(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 444
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->i:Lcom/qihoo360/mobilesafe/core/a;

    if-eqz v0, :cond_0

    .line 445
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c$2;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/core/c$2;-><init>(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 461
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->i:Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v1, p1, v0}, Lcom/qihoo360/mobilesafe/core/a;->a(Ljava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V

    .line 463
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 571
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->h()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 396
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/c;->a(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 702
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 703
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 704
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 706
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 584
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->i()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 713
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/c;->d(Ljava/util/List;)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 715
    iput-boolean v1, p0, Lcom/qihoo360/mobilesafe/core/c;->f:Z

    .line 716
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->g()V

    .line 718
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 722
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 723
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 724
    :goto_1
    if-lt v1, v2, :cond_2

    .line 730
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 735
    :cond_0
    return-void

    .line 718
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    .line 719
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/c;->d:Ljava/util/List;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 726
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/a;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 724
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 727
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method static synthetic e(Lcom/qihoo360/mobilesafe/core/c;)Lcom/qihoo360/mobilesafe/core/a;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->i:Lcom/qihoo360/mobilesafe/core/a;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/qihoo360/mobilesafe/core/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/RemoteCallbackList;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    return-object v0
.end method

.method private f()Z
    .locals 4

    .prologue
    .line 515
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 517
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/core/c;->n:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    .line 518
    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->l:Landroid/content/Context;

    return-object v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 528
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 529
    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/core/c;->n:J

    .line 530
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/d/h;->a(Landroid/content/Context;)V

    .line 535
    return-void
.end method

.method static synthetic h(Lcom/qihoo360/mobilesafe/core/c;)Ljava/util/List;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->c:Ljava/util/List;

    return-object v0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 572
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 574
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_1

    .line 580
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 582
    :cond_0
    return-void

    .line 576
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 574
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 577
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private i()V
    .locals 3

    .prologue
    .line 585
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 587
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_1

    .line 593
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 595
    :cond_0
    return-void

    .line 589
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/a;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 587
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 590
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method static synthetic i(Lcom/qihoo360/mobilesafe/core/c;)Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c;->f:Z

    return v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 743
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 744
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 745
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_1

    .line 751
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 757
    :cond_0
    return-void

    .line 747
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 745
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 748
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method static synthetic j(Lcom/qihoo360/mobilesafe/core/c;)Z
    .locals 1

    .prologue
    .line 514
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/qihoo360/mobilesafe/core/c;)Ljava/util/List;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->e:Ljava/util/List;

    return-object v0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 798
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c;->f:Z

    .line 799
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->g()V

    .line 800
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 805
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->l()V

    .line 806
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    if-eqz v0, :cond_0

    .line 807
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 808
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v2, :cond_1

    .line 814
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 819
    :cond_0
    return-void

    .line 810
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->b:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/a;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 808
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 811
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private l()V
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    if-eqz v0, :cond_0

    .line 879
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->m:Lcom/qihoo/security/service/a;

    invoke-interface {v0}, Lcom/qihoo/security/service/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 886
    :cond_0
    :goto_0
    return-void

    .line 880
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic l(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 797
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->k()V

    return-void
.end method

.method static synthetic m(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 742
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c;->j()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->f()V

    .line 367
    return-void
.end method

.method public b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 376
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->o:Lcom/qihoo360/mobilesafe/core/c/c$a;

    if-eqz v1, :cond_0

    .line 378
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c;->o:Lcom/qihoo360/mobilesafe/core/c/c$a;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/core/c/c$a;->f()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 386
    :cond_0
    :goto_0
    return v0

    .line 379
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 545
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->o:Lcom/qihoo360/mobilesafe/core/c/c$a;

    return-object v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 864
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->j:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 865
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c;->j:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 871
    :cond_0
    return-void
.end method
