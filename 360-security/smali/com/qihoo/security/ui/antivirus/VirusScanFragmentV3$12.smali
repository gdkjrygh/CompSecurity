.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 665
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 903
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 944
    :cond_0
    :goto_0
    return-void

    .line 906
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 909
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$5;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$5;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 938
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[B

    move-result-object v1

    monitor-enter v1

    .line 939
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 940
    :cond_2
    monitor-exit v1

    goto :goto_0

    .line 943
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 942
    :cond_3
    :try_start_1
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 943
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/malware/a$a;)V
    .locals 4

    .prologue
    .line 861
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;J)J

    .line 868
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;->start()V

    .line 874
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 875
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 876
    const/16 v0, 0x37ed

    const-string/jumbo v1, "1"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p1, Lcom/qihoo/security/malware/a$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 877
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarView;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/malware/widget/RadarView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 883
    return-void
.end method

.method public a(Lcom/qihoo/security/malware/a$d;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 668
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 707
    :cond_0
    :goto_0
    return-void

    .line 671
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 674
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 675
    aget v0, v0, v3

    if-lez v0, :cond_2

    .line 676
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 690
    :cond_2
    iget-object v0, p1, Lcom/qihoo/security/malware/a$d;->b:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 691
    iget v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    const/16 v2, 0x7f

    if-ne v1, v2, :cond_3

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 693
    iput v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->riskClass:I

    .line 695
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$6;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public b(Lcom/qihoo/security/malware/a$d;)V
    .locals 8

    .prologue
    const/16 v7, 0x64

    const/4 v6, 0x6

    const/4 v5, 0x0

    const/16 v4, 0x7f

    .line 711
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 857
    :cond_0
    :goto_0
    return-void

    .line 714
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 717
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 718
    aget v0, v0, v5

    if-lez v0, :cond_2

    .line 719
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$7;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 734
    :cond_2
    iget-object v0, p1, Lcom/qihoo/security/malware/a$d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 735
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    if-ne v2, v4, :cond_4

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 737
    iput v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->riskClass:I

    .line 740
    :cond_4
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    if-ne v2, v4, :cond_5

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 741
    new-instance v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$8;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$8;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$8;->start()V

    .line 749
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$9;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$9;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 765
    :cond_5
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    if-ne v2, v4, :cond_7

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 769
    new-instance v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$10;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$10;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$10;->start()V

    .line 777
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 791
    :cond_7
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    if-ne v2, v4, :cond_3

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isTrojan()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_8
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 795
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$12;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$12;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$12;->start()V

    .line 803
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v0

    new-instance v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$13;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$13;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 818
    :cond_9
    iget-boolean v0, p1, Lcom/qihoo/security/malware/a$d;->a:Z

    if-nez v0, :cond_0

    .line 819
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 820
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->W(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 822
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;J)J

    .line 828
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 829
    const/16 v0, 0x37fb

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v6}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 846
    :goto_2
    iget-object v0, p1, Lcom/qihoo/security/malware/a$d;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a(Ljava/util/List;)V

    .line 847
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "malware_last_scan_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->F(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 849
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$2;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$2;->start()V

    .line 855
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1004

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    goto/16 :goto_0

    .line 835
    :cond_b
    const/16 v0, 0x37fc

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v6}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2
.end method
