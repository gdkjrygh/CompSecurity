.class Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;
.super Landroid/os/AsyncTask;
.source "TodayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/TodayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "saveTodayVerseFromIds"
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
.field lst:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/hmobile/model/TodayVerseInfo;",
            ">;"
        }
    .end annotation
.end field

.field size:I

.field final synthetic this$0:Lcom/hmobile/biblekjv/TodayActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/TodayActivity;)V
    .locals 1

    .prologue
    .line 275
    iput-object p1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 276
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->size:I

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 294
    sget-object v1, Lcom/hmobile/model/TodayVerseInfo;->m_verse_info_ids:[Ljava/lang/Integer;

    array-length v0, v1

    .line 295
    .local v0, "len":I
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->lst:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 296
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->lst:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->size:I

    .line 297
    :cond_0
    iget v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->size:I

    if-ge v1, v0, :cond_1

    .line 298
    invoke-static {}, Lcom/hmobile/model/TodayVerseInfo;->saveTodayVerse()V

    .line 300
    :cond_1
    const/4 v1, 0x0

    return-object v1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 305
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/TodayActivity;->hideProgress()V

    .line 307
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/TodayActivity;->loadTodayVerse()V

    .line 308
    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    .prologue
    .line 281
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 283
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    .line 284
    const-class v2, Lcom/hmobile/model/TodayVerseInfo;

    .line 283
    invoke-virtual {v1, v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->lst:Ljava/util/List;

    .line 286
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    const v3, 0x7f0700c6

    invoke-virtual {v2, v3}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/TodayActivity;->showProgress(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :goto_0
    return-void

    .line 287
    :catch_0
    move-exception v0

    .line 288
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method
