.class public Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;
.super Landroid/os/AsyncTask;
.source "SearchResultActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SearchResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SearchAsync"
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
.field bookname:Ljava/lang/String;

.field isSearchByBook:Z

.field final synthetic this$0:Lcom/hmobile/biblekjv/SearchResultActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity;ZLjava/lang/String;)V
    .locals 0
    .param p2, "isSearchbyBookName"    # Z
    .param p3, "book"    # Ljava/lang/String;

    .prologue
    .line 169
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 170
    iput-boolean p2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->isSearchByBook:Z

    .line 171
    iput-object p3, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->bookname:Ljava/lang/String;

    .line 172
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 176
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-boolean v1, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->isFromAuto:Z

    if-eqz v1, :cond_0

    .line 177
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v1, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->selected_book:Ljava/lang/String;

    invoke-static {v1}, Lcom/hmobile/model/BookInfo;->getBookByBookName(Ljava/lang/String;)Lcom/hmobile/model/BookInfo;

    move-result-object v0

    .line 178
    .local v0, "book":Lcom/hmobile/model/BookInfo;
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 179
    invoke-virtual {v0}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v2

    long-to-int v2, v2

    iget-object v3, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/SearchResultActivity;->chapnumber:Ljava/lang/String;

    invoke-static {v3}, Lcom/hmobile/common/Utils;->ConvertToInt(Ljava/lang/String;)I

    move-result v3

    .line 178
    invoke-static {v2, v3}, Lcom/hmobile/model/VerseInfo;->getVerseByBookAndChapNumber(II)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    .line 189
    .end local v0    # "book":Lcom/hmobile/model/BookInfo;
    :goto_0
    const/4 v1, 0x0

    return-object v1

    .line 181
    :cond_0
    iget-boolean v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->isSearchByBook:Z

    if-eqz v1, :cond_1

    .line 182
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    .line 183
    iget-object v3, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->bookname:Ljava/lang/String;

    .line 182
    invoke-static {v2, v3}, Lcom/hmobile/model/VerseInfo;->getVerseByBookbySearchWord(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    goto :goto_0

    .line 185
    :cond_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    invoke-static {v2}, Lcom/hmobile/model/VerseInfo;->getVerseBySearchWord(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 3
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 194
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/SearchResultActivity;->hideProgress()V

    .line 196
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->lstSearchResult:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->txtNoResult:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/SearchResultActivity;->binddata()V

    .line 204
    :goto_0
    return-void

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->lstSearchResult:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->txtNoResult:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
