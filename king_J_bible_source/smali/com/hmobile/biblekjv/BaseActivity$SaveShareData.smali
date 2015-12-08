.class Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;
.super Landroid/os/AsyncTask;
.source "BaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/BaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SaveShareData"
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
.field book_count:I

.field chap_count:I

.field m_verse_number_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/util/ArrayList;II)V
    .locals 2
    .param p3, "b_id"    # I
    .param p4, "c_id"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    const/4 v1, 0x1

    .line 791
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 787
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->m_verse_number_list:Ljava/util/ArrayList;

    .line 788
    iput v1, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->book_count:I

    .line 789
    iput v1, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->chap_count:I

    .line 792
    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->m_verse_number_list:Ljava/util/ArrayList;

    .line 793
    iput p3, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->book_count:I

    .line 794
    iput p4, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->chap_count:I

    .line 795
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 799
    const-string v2, ""

    .line 800
    .local v2, "verses":Ljava/lang/String;
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 801
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 805
    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 808
    iget v3, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->book_count:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 807
    invoke-static {v4, v5}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v3

    .line 809
    const-string v4, " "

    const-string v5, "%20"

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 811
    .local v0, "bookname":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    const v5, 0x7f070097

    invoke-virtual {v4, v5}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 812
    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    const v5, 0x7f070099

    invoke-virtual {v4, v5}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 811
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 845
    .end local v0    # "bookname":Ljava/lang/String;
    :cond_0
    const/4 v3, 0x0

    return-object v3

    .line 801
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 802
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

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 850
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 852
    return-void
.end method
