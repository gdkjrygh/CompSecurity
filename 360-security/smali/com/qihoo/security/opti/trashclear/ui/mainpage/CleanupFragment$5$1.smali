.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1421
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 1425
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B

    move-result-object v1

    monitor-enter v1

    .line 1426
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1427
    monitor-exit v1

    .line 1450
    :goto_0
    return-void

    .line 1429
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1430
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 1431
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 1432
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)J

    .line 1434
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "sp_key_has_clear_memory"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1435
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->e()V

    .line 1438
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a$b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a$b;)V

    .line 1439
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->PREPOSE:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V

    .line 1440
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const/4 v3, 0x0

    sget-object v4, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->SYSTEM:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->CACHE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v4, v2, v3

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a([Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)V

    .line 1442
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/ArrayList;)V

    .line 1443
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b()V

    .line 1445
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/b;->a()Lcom/qihoo/security/opti/trashclear/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/b;->g()V

    .line 1446
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "clear_default_pre_last_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1449
    :cond_2
    monitor-exit v1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
