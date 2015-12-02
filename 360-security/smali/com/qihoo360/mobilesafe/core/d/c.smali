.class public Lcom/qihoo360/mobilesafe/core/d/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/app/ActivityManager;ILjava/lang/String;)I
    .locals 3

    .prologue
    .line 57
    .line 64
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    invoke-virtual {p0, v0}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    move-result-object v0

    .line 65
    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 71
    invoke-virtual {v1}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I

    move-result v0

    .line 77
    const-string/jumbo v2, "com.qihoo.security.lite"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 78
    iget v2, v1, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    iget v1, v1, Landroid/os/Debug$MemoryInfo;->nativeSharedDirty:I

    sub-int v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    sub-int/2addr v0, v1

    .line 84
    :cond_0
    if-lez v0, :cond_1

    .line 114
    :goto_0
    return v0

    .line 87
    :cond_1
    const/16 v0, 0x64

    .line 89
    :try_start_1
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getPidRss(I)I

    move-result v1

    div-int/lit8 v0, v1, 0x2
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    .line 114
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getPidRss(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 90
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .prologue
    .line 190
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/e;->a()Lcom/qihoo360/mobilesafe/core/d/e;

    move-result-object v1

    .line 191
    invoke-virtual {v1, p1}, Lcom/qihoo360/mobilesafe/core/d/e;->a(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/e$a;

    move-result-object v0

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/e$a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    .line 195
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/e$a;->a()Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 209
    :goto_0
    return-object v0

    .line 201
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 202
    invoke-virtual {v1, p1, v0}, Lcom/qihoo360/mobilesafe/core/d/e;->a(Ljava/lang/String;Landroid/content/pm/PackageInfo;)V

    goto :goto_0
.end method

.method private static a(IILjava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/f$a;
    .locals 1

    .prologue
    .line 213
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/f$a;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/core/d/f$a;-><init>()V

    .line 214
    invoke-static {v0, p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Lcom/qihoo360/mobilesafe/core/d/f$a;IILjava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/f$a;

    .line 215
    return-object v0
.end method

.method private static a(Lcom/qihoo360/mobilesafe/core/d/f$a;IILjava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/f$a;
    .locals 2

    .prologue
    .line 219
    if-nez p0, :cond_0

    .line 220
    new-instance p0, Lcom/qihoo360/mobilesafe/core/d/f$a;

    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/d/f$a;-><init>()V

    .line 222
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/core/d/f$a;->c:J

    .line 223
    iput p1, p0, Lcom/qihoo360/mobilesafe/core/d/f$a;->a:I

    .line 224
    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/d/f$a;->b:Ljava/lang/String;

    .line 225
    iput p2, p0, Lcom/qihoo360/mobilesafe/core/d/f$a;->d:I

    .line 226
    return-object p0
.end method

.method public static a(Landroid/content/Context;Landroid/content/pm/PackageInfo;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/qihoo360/mobilesafe/service/ProcessInfo;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 242
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1, p3}, Lcom/qihoo360/mobilesafe/core/b/a;->a(ILjava/lang/String;)I

    move-result v0

    .line 243
    if-nez v0, :cond_0

    .line 244
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v0, v1, p4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(ILjava/lang/String;)I

    move-result v0

    .line 247
    :cond_0
    new-instance v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/service/ProcessInfo;-><init>()V

    .line 248
    iput-object p3, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 249
    iput-object p4, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->processName:Ljava/lang/String;

    .line 250
    iput v0, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 253
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/a/a;->a(Ljava/lang/String;Landroid/content/pm/PackageInfo;)I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 254
    iput-boolean v4, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    .line 271
    :goto_0
    iget v0, p2, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 272
    iput-object p5, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    .line 273
    new-array v0, v4, [I

    iget v2, p2, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    aput v2, v0, v3

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 274
    return-object v1

    .line 256
    :cond_1
    iput-boolean v3, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    goto :goto_0
.end method

.method static synthetic a(Landroid/content/Context;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;[Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .prologue
    .line 718
    invoke-static {p0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/core/d/c;->b(Landroid/content/Context;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;[Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/ActivityManager;",
            "Landroid/content/pm/PackageManager;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 468
    .line 472
    new-instance v8, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 473
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 474
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 475
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    :try_start_0
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 488
    :goto_0
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move-object v0, v9

    .line 707
    :goto_1
    return-object v0

    .line 481
    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0

    .line 492
    :cond_1
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/d/g;->a(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 493
    invoke-static {p1, p2}, Lcom/qihoo360/mobilesafe/core/d/a;->a(Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object v0

    .line 499
    :cond_2
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    move-object v0, v9

    .line 500
    goto :goto_1

    .line 505
    :cond_4
    const/16 v1, 0x64

    :try_start_1
    invoke-virtual {p1, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v7

    .line 518
    :goto_2
    if-nez v7, :cond_5

    .line 519
    new-instance v7, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 523
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 525
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v2, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 527
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v1, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 528
    const/16 v3, 0x8

    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v10

    .line 530
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    .line 690
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 693
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 700
    :goto_4
    invoke-interface {v10}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    move-object v0, v9

    .line 707
    goto :goto_1

    .line 530
    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 533
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/c$1;

    move-object v4, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v8}, Lcom/qihoo360/mobilesafe/core/d/c$1;-><init>(Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/CountDownLatch;Landroid/app/ActivityManager$RunningAppProcessInfo;Landroid/content/Context;Landroid/content/pm/PackageManager;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V

    .line 686
    invoke-interface {v10, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 506
    :catch_1
    move-exception v1

    goto :goto_2

    .line 694
    :catch_2
    move-exception v0

    goto :goto_4
.end method

.method public static a(Landroid/app/ActivityManager;Lcom/qihoo360/mobilesafe/service/ProcessInfo;Z)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 145
    iget v1, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    if-gtz v1, :cond_1

    .line 146
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/f;->a()Lcom/qihoo360/mobilesafe/core/d/f;

    move-result-object v3

    .line 147
    iget-object v4, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 149
    if-eqz v4, :cond_0

    array-length v1, v4

    if-lez v1, :cond_0

    .line 150
    array-length v5, v4

    move v2, v0

    move v1, v0

    :goto_0
    if-lt v2, v5, :cond_2

    move v0, v1

    .line 178
    :cond_0
    iput v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    .line 187
    :cond_1
    return-void

    .line 150
    :cond_2
    aget v6, v4, v2

    .line 152
    if-eqz p2, :cond_4

    .line 153
    invoke-virtual {v3, v6}, Lcom/qihoo360/mobilesafe/core/d/f;->a(I)Lcom/qihoo360/mobilesafe/core/d/f$a;

    move-result-object v0

    .line 154
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/f$a;->a()Z

    move-result v7

    if-nez v7, :cond_3

    .line 155
    iget v0, v0, Lcom/qihoo360/mobilesafe/core/d/f$a;->d:I

    .line 167
    :goto_1
    add-int/2addr v1, v0

    .line 150
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 157
    :cond_3
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {p0, v6, v0}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/app/ActivityManager;ILjava/lang/String;)I

    move-result v0

    .line 158
    iget-object v7, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v6, v0, v7}, Lcom/qihoo360/mobilesafe/core/d/c;->a(IILjava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/f$a;

    move-result-object v7

    .line 159
    invoke-virtual {v3, v6, v7}, Lcom/qihoo360/mobilesafe/core/d/f;->a(ILcom/qihoo360/mobilesafe/core/d/f$a;)V

    goto :goto_1

    .line 163
    :cond_4
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {p0, v6, v0}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/app/ActivityManager;ILjava/lang/String;)I

    move-result v0

    .line 164
    iget-object v7, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v6, v0, v7}, Lcom/qihoo360/mobilesafe/core/d/c;->a(IILjava/lang/String;)Lcom/qihoo360/mobilesafe/core/d/f$a;

    move-result-object v7

    .line 165
    invoke-virtual {v3, v6, v7}, Lcom/qihoo360/mobilesafe/core/d/f;->a(ILcom/qihoo360/mobilesafe/core/d/f$a;)V

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;)[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/app/ActivityManager$RunningServiceInfo;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 34
    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v2

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 44
    if-eqz v1, :cond_1

    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [Ljava/lang/String;

    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 52
    :cond_1
    return-object v2

    .line 36
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningServiceInfo;

    .line 37
    iget-object v4, v0, Landroid/app/ActivityManager$RunningServiceInfo;->process:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 38
    if-nez v1, :cond_3

    .line 39
    new-instance v1, Ljava/util/ArrayList;

    const/4 v4, 0x4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    :cond_3
    iget-object v0, v0, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;[Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Landroid/content/pm/PackageManager;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 722
    if-eqz p3, :cond_0

    array-length v0, p3

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    :cond_0
    move-object v6, v5

    .line 746
    :cond_1
    return-object v6

    .line 726
    :cond_2
    array-length v8, p3

    const/4 v0, 0x0

    move v7, v0

    move-object v6, v5

    :goto_0
    if-ge v7, v8, :cond_1

    aget-object v3, p3, v7

    .line 730
    invoke-static {p4, v3}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 734
    invoke-static {v3, v1}, Lcom/qihoo360/mobilesafe/a/a;->a(Ljava/lang/String;Landroid/content/pm/PackageInfo;)I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    move-object v0, p0

    move-object v2, p1

    move-object v4, p2

    .line 735
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/Context;Landroid/content/pm/PackageInfo;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    move-result-object v1

    .line 737
    if-nez v6, :cond_3

    .line 738
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 740
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 726
    :goto_2
    add-int/lit8 v1, v7, 0x1

    move v7, v1

    move-object v6, v0

    goto :goto_0

    :cond_3
    move-object v0, v6

    goto :goto_1

    :cond_4
    move-object v0, v6

    goto :goto_2
.end method
