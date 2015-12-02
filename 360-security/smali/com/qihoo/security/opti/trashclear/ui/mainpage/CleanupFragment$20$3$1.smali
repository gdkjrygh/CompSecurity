.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 720
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iput-wide p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->a:J

    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 724
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 741
    :cond_0
    :goto_0
    return-void

    .line 727
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)[B

    move-result-object v1

    monitor-enter v1

    .line 728
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 729
    monitor-exit v1

    goto :goto_0

    .line 740
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 731
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v2

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 732
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTag(Ljava/lang/Object;)V

    .line 733
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 734
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->a:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    .line 735
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 736
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 737
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 739
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 740
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 739
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
