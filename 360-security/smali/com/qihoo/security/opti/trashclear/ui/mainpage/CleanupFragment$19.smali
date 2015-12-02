.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/enginehelper/clean/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

.field private b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

.field private c:Z

.field private final d:[B


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 1

    .prologue
    .line 423
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 426
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->d:[B

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Z
    .locals 1

    .prologue
    .line 423
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;Z)Z
    .locals 0

    .prologue
    .line 423
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)[B
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->d:[B

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 433
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c:Z

    .line 434
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)V

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    .line 504
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a()V

    .line 505
    return-void
.end method

.method public a(ILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 509
    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/e;->a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v0

    .line 510
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 516
    :cond_0
    :goto_0
    return-void

    .line 513
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    if-eqz v1, :cond_0

    .line 514
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->f()J

    move-result-wide v2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a(J)V

    goto :goto_0
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 522
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 572
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B

    move-result-object v1

    monitor-enter v1

    .line 573
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 574
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c:Z

    .line 575
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 576
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    if-eqz v0, :cond_0

    .line 577
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b()V

    .line 579
    :cond_0
    return-void

    .line 575
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(ILjava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 526
    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/e;->a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v0

    .line 528
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)V

    .line 529
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 553
    :cond_0
    :goto_0
    return-void

    .line 532
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;Lcom/qihoo/security/opti/trashclear/d;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public c()V
    .locals 3

    .prologue
    .line 557
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B

    move-result-object v1

    monitor-enter v1

    .line 558
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 559
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c:Z

    .line 560
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    if-eqz v0, :cond_0

    .line 562
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b()V

    .line 564
    :cond_0
    return-void

    .line 560
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
