.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V
    .locals 0

    .prologue
    .line 569
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 623
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p()V

    .line 624
    return-void
.end method

.method public a(FFZ)V
    .locals 2

    .prologue
    .line 607
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Z

    move-result v1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(FFZZ)V

    .line 608
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 2

    .prologue
    .line 612
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 613
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo360/mobilesafe/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    .line 614
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 573
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 574
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;I)I

    .line 575
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/List;)V

    .line 576
    const/4 v1, 0x0

    .line 577
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 578
    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v3, 0x25

    if-ne v0, v3, :cond_0

    .line 579
    const/4 v0, 0x1

    .line 583
    :goto_0
    if-eqz v0, :cond_1

    .line 584
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->c()V

    .line 588
    :cond_1
    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 592
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 593
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;I)I

    .line 594
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v1, 0x25

    if-ne v0, v1, :cond_1

    .line 595
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->c()V

    .line 600
    :cond_0
    :goto_0
    return-void

    .line 597
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/List;)V

    goto :goto_0
.end method
