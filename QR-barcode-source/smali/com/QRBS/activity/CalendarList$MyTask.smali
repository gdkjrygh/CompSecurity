.class Lcom/QRBS/activity/CalendarList$MyTask;
.super Landroid/os/AsyncTask;
.source "CalendarList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CalendarList;
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

.field initPos:I

.field final synthetic this$0:Lcom/QRBS/activity/CalendarList;

.field to:[I


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/CalendarList;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 69
    iput-object p1, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 70
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "text"

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/QRBS/activity/CalendarList$MyTask;->from:[Ljava/lang/String;

    .line 71
    new-array v0, v3, [I

    const v1, 0x7f0d0075

    aput v1, v0, v2

    iput-object v0, p0, Lcom/QRBS/activity/CalendarList$MyTask;->to:[I

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/activity/CalendarList$MyTask;->fillMaps:Ljava/util/List;

    .line 73
    iput v2, p0, Lcom/QRBS/activity/CalendarList$MyTask;->initPos:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/CalendarList;Lcom/QRBS/activity/CalendarList$MyTask;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CalendarList$MyTask;-><init>(Lcom/QRBS/activity/CalendarList;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarList$MyTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 77
    new-instance v2, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    invoke-direct {v2, v7}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 78
    .local v2, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v8, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    invoke-virtual {v8}, Lcom/QRBS/activity/CalendarList;->getApplication()Landroid/app/Application;

    move-result-object v8

    iget-object v9, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-wide v10, v9, Lcom/QRBS/activity/CalendarList;->CalID:J

    invoke-virtual {v2, v8, v10, v11}, Lcom/scannerfire/utils/EncodeUtils;->getCalendars(Landroid/app/Application;J)Ljava/util/List;

    move-result-object v8

    iput-object v8, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    .line 79
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    if-eqz v7, :cond_0

    .line 80
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v3, v7, :cond_2

    .line 91
    .end local v3    # "i":I
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 92
    .local v0, "curr":J
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    if-eqz v7, :cond_1

    .line 93
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    iput v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->initPos:I

    .line 94
    const/4 v3, 0x0

    .restart local v3    # "i":I
    :goto_1
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v3, v7, :cond_3

    .line 100
    .end local v3    # "i":I
    :cond_1
    :goto_2
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    # getter for: Lcom/QRBS/activity/CalendarList;->prog:Landroid/app/ProgressDialog;
    invoke-static {v7}, Lcom/QRBS/activity/CalendarList;->access$0(Lcom/QRBS/activity/CalendarList;)Landroid/app/ProgressDialog;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/ProgressDialog;->dismiss()V

    .line 101
    const-string v7, "OK"

    return-object v7

    .line 81
    .end local v0    # "curr":J
    .restart local v3    # "i":I
    :cond_2
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 82
    .local v4, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/scannerfire/utils/EncodeUtils$ICal;

    .line 83
    .local v6, "tmp":Lcom/scannerfire/utils/EncodeUtils$ICal;
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "WHAT: \n"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getWhat()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\nWHERE: \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v6}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getWhere()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\nSTART: \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 84
    invoke-virtual {v6}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getStart()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\nEND: \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v6}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getEnd()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\nDESCRIPTION: \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v6}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getDes()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 85
    .local v5, "s":Ljava/lang/String;
    const-string v7, "text"

    invoke-virtual {v4, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->fillMaps:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 95
    .end local v4    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v5    # "s":Ljava/lang/String;
    .end local v6    # "tmp":Lcom/scannerfire/utils/EncodeUtils$ICal;
    .restart local v0    # "curr":J
    :cond_3
    iget-object v7, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v7, v7, Lcom/QRBS/activity/CalendarList;->list:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/scannerfire/utils/EncodeUtils$ICal;

    invoke-virtual {v7}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getStartMill()J

    move-result-wide v8

    cmp-long v7, v0, v8

    if-gez v7, :cond_4

    .line 96
    iput v3, p0, Lcom/QRBS/activity/CalendarList$MyTask;->initPos:I

    goto/16 :goto_2

    .line 94
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarList$MyTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 6
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 108
    new-instance v0, Landroid/widget/SimpleAdapter;

    iget-object v1, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarList;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/QRBS/activity/CalendarList$MyTask;->fillMaps:Ljava/util/List;

    const v3, 0x7f03001e

    iget-object v4, p0, Lcom/QRBS/activity/CalendarList$MyTask;->from:[Ljava/lang/String;

    iget-object v5, p0, Lcom/QRBS/activity/CalendarList$MyTask;->to:[I

    invoke-direct/range {v0 .. v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V

    .line 109
    .local v0, "adapter":Landroid/widget/ListAdapter;
    iget-object v1, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarList;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 110
    iget-object v1, p0, Lcom/QRBS/activity/CalendarList$MyTask;->this$0:Lcom/QRBS/activity/CalendarList;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarList;->lv:Landroid/widget/ListView;

    iget v2, p0, Lcom/QRBS/activity/CalendarList$MyTask;->initPos:I

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setSelection(I)V

    .line 111
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 115
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarList$MyTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 119
    return-void
.end method
