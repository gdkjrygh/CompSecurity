.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 684
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iput-wide p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->a:J

    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 688
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 705
    :cond_0
    :goto_0
    return-void

    .line 691
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)[B

    move-result-object v1

    monitor-enter v1

    .line 692
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 693
    monitor-exit v1

    goto :goto_0

    .line 704
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 695
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v2

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 696
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTag(Ljava/lang/Object;)V

    .line 697
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 698
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->a:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    .line 699
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 700
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 701
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 703
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 704
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 703
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method
