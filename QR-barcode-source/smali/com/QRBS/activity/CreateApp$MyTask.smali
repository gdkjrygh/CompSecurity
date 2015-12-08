.class Lcom/QRBS/activity/CreateApp$MyTask;
.super Landroid/os/AsyncTask;
.source "CreateApp.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CreateApp;
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
.field final synthetic this$0:Lcom/QRBS/activity/CreateApp;


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/CreateApp;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/CreateApp;Lcom/QRBS/activity/CreateApp$MyTask;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CreateApp$MyTask;-><init>(Lcom/QRBS/activity/CreateApp;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateApp$MyTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 76
    iget-object v4, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    iget-object v4, v4, Lcom/QRBS/activity/CreateApp;->activity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 77
    .local v2, "pm":Landroid/content/pm/PackageManager;
    new-instance v0, Landroid/content/Intent;

    const-string v4, "android.intent.action.MAIN"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 78
    .local v0, "intent":Landroid/content/Intent;
    const-string v4, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    .line 81
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 86
    iget-object v4, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->prog:Landroid/app/ProgressDialog;
    invoke-static {v4}, Lcom/QRBS/activity/CreateApp;->access$3(Lcom/QRBS/activity/CreateApp;)Landroid/app/ProgressDialog;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/ProgressDialog;->dismiss()V

    .line 87
    const-string v4, "OK"

    return-object v4

    .line 81
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 82
    .local v3, "rInfo":Landroid/content/pm/ResolveInfo;
    iget-object v5, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->icons:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/QRBS/activity/CreateApp;->access$0(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v6, v2}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v5, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->appnames:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/QRBS/activity/CreateApp;->access$1(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v6, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v5, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/QRBS/activity/CreateApp;->access$2(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateApp$MyTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 6
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 93
    new-instance v0, Lcom/scannerfire/model/MyAdapter;

    iget-object v1, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    iget-object v1, v1, Lcom/QRBS/activity/CreateApp;->activity:Landroid/app/Activity;

    const v2, 0x7f030032

    iget-object v3, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->icons:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/QRBS/activity/CreateApp;->access$0(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->appnames:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/QRBS/activity/CreateApp;->access$1(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v5, p0, Lcom/QRBS/activity/CreateApp$MyTask;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/QRBS/activity/CreateApp;->access$2(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/scannerfire/model/MyAdapter;-><init>(Landroid/app/Activity;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 94
    .local v0, "adapter":Lcom/scannerfire/model/MyAdapter;
    # getter for: Lcom/QRBS/activity/CreateApp;->lv:Landroid/widget/ListView;
    invoke-static {}, Lcom/QRBS/activity/CreateApp;->access$4()Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 96
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 100
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CreateApp$MyTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 104
    return-void
.end method
