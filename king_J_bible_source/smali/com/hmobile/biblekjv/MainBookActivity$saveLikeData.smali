.class Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;
.super Landroid/os/AsyncTask;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "saveLikeData"
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
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1273
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 1277
    const-string v2, ""

    .line 1278
    .local v2, "verses":Ljava/lang/String;
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 1279
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1282
    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1284
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I
    invoke-static {v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$23(Lcom/hmobile/biblekjv/MainBookActivity;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 1283
    invoke-static {v4, v5}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v3

    .line 1285
    const-string v4, " "

    const-string v5, "%20"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 1287
    .local v0, "bookname":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    const v5, 0x7f070097

    invoke-virtual {v4, v5}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1288
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    const v5, 0x7f070099

    invoke-virtual {v4, v5}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1287
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1319
    .end local v0    # "bookname":Ljava/lang/String;
    :cond_0
    const/4 v3, 0x0

    return-object v3

    .line 1279
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 1280
    .local v1, "i":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ","

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 2
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 1324
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$24(Lcom/hmobile/biblekjv/MainBookActivity;Ljava/util/ArrayList;)V

    .line 1325
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 1326
    return-void
.end method
