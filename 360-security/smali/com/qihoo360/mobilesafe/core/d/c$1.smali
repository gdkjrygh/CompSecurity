.class Lcom/qihoo360/mobilesafe/core/d/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/Context;Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field private final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field private final synthetic c:Landroid/app/ActivityManager$RunningAppProcessInfo;

.field private final synthetic d:Landroid/content/Context;

.field private final synthetic e:Landroid/content/pm/PackageManager;

.field private final synthetic f:Ljava/util/ArrayList;

.field private final synthetic g:Ljava/util/List;

.field private final synthetic h:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method constructor <init>(Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/CountDownLatch;Landroid/app/ActivityManager$RunningAppProcessInfo;Landroid/content/Context;Landroid/content/pm/PackageManager;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/CopyOnWriteArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->b:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->d:Landroid/content/Context;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->e:Landroid/content/pm/PackageManager;

    iput-object p6, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->g:Ljava/util/List;

    iput-object p8, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 533
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .prologue
    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 537
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 540
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 681
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 684
    :goto_0
    return-void

    .line 543
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 544
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 681
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 555
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v0

    const/16 v1, 0x67

    invoke-virtual {v0, v1, v4}, Lcom/qihoo360/mobilesafe/core/b/a;->a(ILjava/lang/String;)I

    move-result v0

    .line 556
    if-ne v0, v8, :cond_3

    .line 559
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 560
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v2, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->e:Landroid/content/pm/PackageManager;

    .line 559
    invoke-static {v0, v1, v4, v2, v3}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/Context;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;[Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object v0

    .line 561
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 562
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 681
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 567
    :cond_3
    :try_start_3
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->g:Ljava/util/List;

    invoke-static {v4, v1}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Ljava/lang/String;Ljava/util/List;)[Ljava/lang/String;

    move-result-object v5

    .line 575
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    if-nez v1, :cond_4

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    move-object v10, v1

    .line 579
    :goto_1
    array-length v11, v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v9, v7

    :goto_2
    if-lt v9, v11, :cond_5

    .line 681
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 576
    :cond_4
    :try_start_4
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    move-object v10, v1

    goto :goto_1

    .line 579
    :cond_5
    aget-object v3, v10, v9

    .line 581
    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 582
    const-string/jumbo v1, "com.qihoo.security"

    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 579
    :cond_6
    :goto_3
    add-int/lit8 v1, v9, 0x1

    move v9, v1

    goto :goto_2

    .line 585
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 587
    const/4 v1, 0x0

    .line 590
    :try_start_5
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->e:Landroid/content/pm/PackageManager;

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 599
    if-eqz v1, :cond_e

    .line 600
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 601
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b/a;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/a;

    move-result-object v2

    .line 602
    const/16 v6, 0x68

    iget-object v12, v1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 601
    invoke-virtual {v2, v6, v12}, Lcom/qihoo360/mobilesafe/core/b/a;->a(ILjava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v0

    move v6, v0

    .line 615
    :goto_4
    if-ne v6, v8, :cond_8

    move v0, v6

    .line 619
    goto :goto_3

    .line 609
    :catch_0
    move-exception v2

    move v6, v0

    goto :goto_4

    .line 622
    :cond_8
    :try_start_6
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->d:Landroid/content/Context;

    .line 623
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->c:Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 622
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/Context;Landroid/content/pm/PackageInfo;Landroid/app/ActivityManager$RunningAppProcessInfo;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    move-result-object v1

    .line 633
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    move v0, v8

    .line 659
    :goto_5
    if-eqz v0, :cond_a

    .line 663
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    move v0, v6

    goto :goto_3

    .line 633
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 634
    iget-object v12, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 636
    iget v2, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    iget v3, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    if-ge v2, v3, :cond_c

    .line 637
    iget v2, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    iput v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 640
    :cond_c
    iget v2, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-eqz v2, :cond_d

    .line 641
    iget v2, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    iput v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 645
    :cond_d
    iget-object v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    iget-object v3, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    .line 644
    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/a/a;->a([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    .line 647
    iget-object v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 648
    iget-object v3, v1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 647
    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/a/a;->a([I[I)[I

    move-result-object v2

    iput-object v2, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move v0, v7

    .line 650
    goto :goto_5

    .line 674
    :catch_1
    move-exception v0

    .line 681
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto/16 :goto_0

    .line 679
    :catchall_0
    move-exception v0

    .line 681
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/d/c$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 682
    throw v0

    :cond_e
    move v6, v0

    goto :goto_4
.end method
