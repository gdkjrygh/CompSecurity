.class Lcom/QRBS/activity/CreateUrl$MyTask;
.super Landroid/os/AsyncTask;
.source "CreateUrl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CreateUrl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateUrl;

.field tiny:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/CreateUrl;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->this$0:Lcom/QRBS/activity/CreateUrl;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/CreateUrl;Lcom/QRBS/activity/CreateUrl$MyTask;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CreateUrl$MyTask;-><init>(Lcom/QRBS/activity/CreateUrl;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateUrl$MyTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "par"    # [Ljava/lang/String;

    .prologue
    .line 138
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-static {v0}, Lcom/scannerfire/utils/TinyURLUtils;->getTinyUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->tiny:Ljava/lang/String;

    .line 140
    const-string v0, "OK"

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateUrl$MyTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 3
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 146
    iget-object v0, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->tiny:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v1, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v2, 0x7f08010b

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 153
    :goto_0
    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v1, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->tiny:Ljava/lang/String;

    # invokes: Lcom/QRBS/activity/CreateUrl;->compute(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/QRBS/activity/CreateUrl;->access$0(Lcom/QRBS/activity/CreateUrl;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/QRBS/activity/CreateUrl$MyTask;->this$0:Lcom/QRBS/activity/CreateUrl;

    # getter for: Lcom/QRBS/activity/CreateUrl;->prog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/QRBS/activity/CreateUrl;->access$1(Lcom/QRBS/activity/CreateUrl;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    goto :goto_0
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 157
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateUrl$MyTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 161
    return-void
.end method
