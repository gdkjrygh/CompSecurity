.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b(ILjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/d;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 0

    .prologue
    .line 532
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->a:Lcom/qihoo/security/opti/trashclear/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 536
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 551
    :cond_0
    :goto_0
    return-void

    .line 539
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 540
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)[B

    move-result-object v1

    monitor-enter v1

    .line 541
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;Z)Z

    .line 542
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 543
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->a:Lcom/qihoo/security/opti/trashclear/d;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/e$a;->f()J

    move-result-wide v2

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J

    move-result-wide v4

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a(J)V

    .line 546
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 547
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b()V

    .line 549
    :cond_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
