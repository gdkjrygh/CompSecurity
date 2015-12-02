.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;ILcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 0

    .prologue
    .line 794
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->a:I

    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->b:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 798
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 811
    :cond_0
    :goto_0
    return-void

    .line 801
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)[B

    move-result-object v1

    monitor-enter v1

    .line 802
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 803
    monitor-exit v1

    goto :goto_0

    .line 810
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 805
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    move-result-object v0

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->a:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setProgress(I)V

    .line 809
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1;->b:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 810
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
