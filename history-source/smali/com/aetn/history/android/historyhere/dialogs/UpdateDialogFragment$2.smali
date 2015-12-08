.class Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;
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
    .line 65
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 69
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    iget-boolean v0, v0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->forceCloseApp()V

    .line 79
    :goto_0
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setUpdateReminderTF(Landroid/content/Context;Z)V

    .line 75
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    goto :goto_0
.end method
