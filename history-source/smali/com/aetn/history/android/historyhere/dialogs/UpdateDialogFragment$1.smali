.class Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;
.super Ljava/lang/Object;
.source "UpdateDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;Landroid/app/AlertDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    .prologue
    .line 50
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 53
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v2, "Rate App"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 54
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setShouldShowRateReminder(Landroid/content/Context;Z)V

    .line 55
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->playStoreURL:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 56
    .local v0, "browserIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 57
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    iget-boolean v1, v1, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    if-eqz v1, :cond_0

    .line 59
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->forceCloseApp()V

    .line 63
    :goto_0
    return-void

    .line 61
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->cancel()V

    goto :goto_0
.end method
