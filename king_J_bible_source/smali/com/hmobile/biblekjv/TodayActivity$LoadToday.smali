.class public Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
.super Landroid/os/AsyncTask;
.source "TodayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/TodayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LoadToday"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/TodayActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/TodayActivity;)V
    .locals 0

    .prologue
    .line 453
    iput-object p1, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 458
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-static {}, Lcom/hmobile/model/BookInfo;->getTodayVerse()Lcom/hmobile/model/TodayVerseInfo;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    .line 459
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-static {}, Lcom/hmobile/model/BookInfo;->getTodayBook()Lcom/hmobile/model/BookInfo;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    .line 461
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 6
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 466
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 467
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "TodayVerse"

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget-object v5, v5, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 468
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "BookName"

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    iget-object v5, v5, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 469
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "BookCount"

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v5, v5, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 470
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "ChapterCount"

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v5, v5, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 471
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "VerseCount"

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v5, v5, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 473
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 474
    .local v0, "d":Ljava/util/Date;
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "MM/dd/yyyy"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 475
    .local v2, "sdf":Ljava/text/SimpleDateFormat;
    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 477
    .local v1, "dt":Ljava/lang/String;
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "TodayDate"

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 478
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 479
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    if-eqz v3, :cond_0

    .line 480
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    # getter for: Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;
    invoke-static {v3}, Lcom/hmobile/biblekjv/TodayActivity;->access$0(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;

    move-result-object v3

    iget-object v4, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v4, v4, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget-object v4, v4, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    .line 482
    iget-object v4, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v4, v4, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v4, v4, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 481
    invoke-static {v4, v5}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/hmobile/biblekjv/TodayActivity;->bookname:Ljava/lang/String;

    .line 483
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    # getter for: Lcom/hmobile/biblekjv/TodayActivity;->txtBookInfo:Landroid/widget/TextView;
    invoke-static {v3}, Lcom/hmobile/biblekjv/TodayActivity;->access$1(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->bookname:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 484
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v5, v5, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 485
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v5, v5, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 483
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    :cond_0
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    if-eqz v3, :cond_1

    .line 488
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    # getter for: Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;
    invoke-static {v3}, Lcom/hmobile/biblekjv/TodayActivity;->access$2(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;

    move-result-object v3

    iget-object v4, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v4, v4, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    iget-object v4, v4, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    :cond_1
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/TodayActivity;->LoadAutoText()V

    .line 491
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/TodayActivity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_2

    .line 492
    iget-object v3, p0, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/TodayActivity;->hideProgress()V

    .line 494
    :cond_2
    return-void
.end method
