.class Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;
.super Landroid/os/AsyncTask;
.source "MostLikeShareActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MostLikeShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "getAllData"
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
.field final synthetic this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 7
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    const v6, 0x7f070098

    const v5, 0x7f070097

    const v4, 0x7f07004b

    .line 130
    const-string v0, "like"

    .line 131
    .local v0, "action":Ljava/lang/String;
    iget-object v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z
    invoke-static {v2}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 132
    const-string v0, "share"

    .line 138
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v5}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v6}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "?PackageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 140
    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v4}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&action=like"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 144
    .local v1, "url":Ljava/lang/String;
    iget-object v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-static {}, Lcom/hmobile/model/LikeShareList;->Instance()Lcom/hmobile/model/LikeShareList;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/hmobile/model/LikeShareList;->getAllLike(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoLikes:Ljava/util/ArrayList;

    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v5}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v6}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "?PackageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 152
    iget-object v3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v3, v4}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&action=share"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 154
    iget-object v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-static {}, Lcom/hmobile/model/LikeShareList;->Instance()Lcom/hmobile/model/LikeShareList;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/hmobile/model/LikeShareList;->getAllShare(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoShares:Ljava/util/ArrayList;

    .line 156
    const/4 v2, 0x0

    return-object v2
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 161
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->m_pd:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->bindData()V

    .line 164
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 165
    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->m_pd:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->m_pd:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 123
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 125
    :cond_0
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 126
    return-void
.end method
