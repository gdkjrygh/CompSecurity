.class public Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;
.super Landroid/os/AsyncTask;
.source "SearchResultActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SearchResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LoadBookAsync"
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
.field isAutoText:Z

.field m_book:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/SearchResultActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity;Z)V
    .locals 1
    .param p2, "isAuto"    # Z

    .prologue
    .line 111
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->m_book:Ljava/util/ArrayList;

    .line 109
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->isAutoText:Z

    .line 112
    iput-boolean p2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->isAutoText:Z

    .line 113
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->isAutoText:Z

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->m_book:Ljava/util/ArrayList;

    .line 119
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->m_book:Ljava/util/ArrayList;

    const-string v1, "All"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/SearchResultActivity;->loadBook()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->m_book:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 4
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/SearchResultActivity;->hideProgress()V

    .line 131
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    new-instance v1, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v3, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->m_book:Ljava/util/ArrayList;

    invoke-direct {v1, v2, v3}, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;Ljava/util/ArrayList;)V

    iput-object v1, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->spinAdapter:Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;

    .line 132
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SearchResultActivity;->spnBook:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v1, v1, Lcom/hmobile/biblekjv/SearchResultActivity;->spinAdapter:Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 134
    return-void
.end method
