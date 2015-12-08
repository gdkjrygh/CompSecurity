.class public final Lcom/google/zxing/client/android/share/AppPickerActivity;
.super Landroid/app/ListActivity;
.source "AppPickerActivity.java"


# instance fields
.field private backgroundTask:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

.field private final taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Landroid/app/ListActivity;-><init>()V

    .line 35
    new-instance v0, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;

    invoke-direct {v0}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;-><init>()V

    invoke-virtual {v0}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;->build()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    iput-object v0, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    .line 36
    return-void
.end method


# virtual methods
.method protected onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 6
    .param p1, "l"    # Landroid/widget/ListView;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/google/zxing/client/android/share/AppPickerActivity;->getListAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 58
    .local v0, "adapter":Landroid/widget/ListAdapter;
    if-ltz p3, :cond_0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v3

    if-ge p3, v3, :cond_0

    .line 59
    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/zxing/client/android/share/AppInfo;

    invoke-virtual {v3}, Lcom/google/zxing/client/android/share/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 60
    .local v2, "packageName":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 61
    .local v1, "intent":Landroid/content/Intent;
    const/high16 v3, 0x80000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 62
    const-string v3, "url"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "market://details?id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    const/4 v3, -0x1

    invoke-virtual {p0, v3, v1}, Lcom/google/zxing/client/android/share/AppPickerActivity;->setResult(ILandroid/content/Intent;)V

    .line 67
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "packageName":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0}, Lcom/google/zxing/client/android/share/AppPickerActivity;->finish()V

    .line 68
    return-void

    .line 65
    :cond_0
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Lcom/google/zxing/client/android/share/AppPickerActivity;->setResult(I)V

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->backgroundTask:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    .line 48
    .local v0, "task":Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;
    if-eqz v0, :cond_0

    .line 49
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->cancel(Z)Z

    .line 50
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->backgroundTask:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    .line 52
    :cond_0
    invoke-super {p0}, Landroid/app/ListActivity;->onPause()V

    .line 53
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 40
    invoke-super {p0}, Landroid/app/ListActivity;->onResume()V

    .line 41
    new-instance v0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    invoke-direct {v0, p0}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;-><init>(Landroid/app/ListActivity;)V

    iput-object v0, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->backgroundTask:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    .line 42
    iget-object v0, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    iget-object v1, p0, Lcom/google/zxing/client/android/share/AppPickerActivity;->backgroundTask:Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-interface {v0, v1, v2}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 43
    return-void
.end method
