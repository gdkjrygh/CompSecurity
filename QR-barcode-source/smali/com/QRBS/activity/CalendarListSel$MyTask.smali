.class Lcom/QRBS/activity/CalendarListSel$MyTask;
.super Landroid/os/AsyncTask;
.source "CalendarListSel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CalendarListSel;
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
.field fillMaps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field from:[Ljava/lang/String;

.field final synthetic this$0:Lcom/QRBS/activity/CalendarListSel;

.field to:[I


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/CalendarListSel;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 66
    iput-object p1, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 67
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "text"

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->from:[Ljava/lang/String;

    .line 68
    new-array v0, v3, [I

    const v1, 0x7f0d0075

    aput v1, v0, v2

    iput-object v0, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->to:[I

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->fillMaps:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/CalendarListSel;Lcom/QRBS/activity/CalendarListSel$MyTask;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CalendarListSel$MyTask;-><init>(Lcom/QRBS/activity/CalendarListSel;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarListSel$MyTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 73
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    invoke-direct {v0, v5}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 74
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v6, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    invoke-virtual {v6}, Lcom/QRBS/activity/CalendarListSel;->getApplication()Landroid/app/Application;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/scannerfire/utils/EncodeUtils;->getCalendarsSel(Landroid/app/Application;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v5, Lcom/QRBS/activity/CalendarListSel;->list:Ljava/util/List;

    .line 75
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v5, v5, Lcom/QRBS/activity/CalendarListSel;->list:Ljava/util/List;

    if-eqz v5, :cond_0

    .line 76
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v5, v5, Lcom/QRBS/activity/CalendarListSel;->list:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lt v1, v5, :cond_1

    .line 84
    .end local v1    # "i":I
    :cond_0
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    # getter for: Lcom/QRBS/activity/CalendarListSel;->prog:Landroid/app/ProgressDialog;
    invoke-static {v5}, Lcom/QRBS/activity/CalendarListSel;->access$0(Lcom/QRBS/activity/CalendarListSel;)Landroid/app/ProgressDialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/ProgressDialog;->dismiss()V

    .line 85
    const-string v5, "OK"

    return-object v5

    .line 77
    .restart local v1    # "i":I
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 78
    .local v2, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v5, v5, Lcom/QRBS/activity/CalendarListSel;->list:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/scannerfire/utils/EncodeUtils$CalSel;

    .line 79
    .local v4, "tmp":Lcom/scannerfire/utils/EncodeUtils$CalSel;
    invoke-virtual {v4}, Lcom/scannerfire/utils/EncodeUtils$CalSel;->getName()Ljava/lang/String;

    move-result-object v3

    .line 80
    .local v3, "s":Ljava/lang/String;
    const-string v5, "text"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->fillMaps:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarListSel$MyTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 6
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 92
    new-instance v0, Landroid/widget/SimpleAdapter;

    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarListSel;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->fillMaps:Ljava/util/List;

    const v3, 0x7f03001e

    iget-object v4, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->from:[Ljava/lang/String;

    iget-object v5, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->to:[I

    invoke-direct/range {v0 .. v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V

    .line 93
    .local v0, "adapter":Landroid/widget/ListAdapter;
    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel$MyTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarListSel;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 94
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarListSel$MyTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 102
    return-void
.end method
