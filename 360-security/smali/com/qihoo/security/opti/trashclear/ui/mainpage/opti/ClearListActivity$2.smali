.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;
.super Landroid/os/Handler;
.source "360Security"


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
    .line 190
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    :cond_0
    :goto_0
    return-void

    .line 196
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 199
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v0

    long-to-float v0, v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 201
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    if-nez v1, :cond_3

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 217
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p()V

    goto :goto_0

    .line 203
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 204
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setBackgroundExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo360/mobilesafe/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    goto :goto_1

    .line 225
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setData(Lcom/qihoo/security/opti/trashclear/ui/e;)V

    goto/16 :goto_0

    .line 228
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setData(Lcom/qihoo/security/opti/trashclear/ui/e;)V

    goto/16 :goto_0

    .line 232
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V

    goto/16 :goto_0

    .line 236
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setData(Lcom/qihoo/security/opti/trashclear/ui/e;)V

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v0

    long-to-float v0, v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 241
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I

    move-result v1

    if-nez v1, :cond_6

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto/16 :goto_0

    .line 243
    :cond_6
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 244
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 246
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setBackgroundExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo360/mobilesafe/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    goto/16 :goto_0

    .line 252
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 257
    :pswitch_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->j(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 261
    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_8

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Z

    move-result v2

    invoke-virtual {v0, v4, v4, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(FFZZ)V

    goto/16 :goto_0

    .line 270
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/enginehelper/clean/a;->d()Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/opti/trashclear/ui/e;)Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    if-nez v0, :cond_9

    .line 275
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 280
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V

    goto/16 :goto_0

    .line 196
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
