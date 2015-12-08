.class Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;
.super Ljava/lang/Object;
.source "RateMeDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;Landroid/app/AlertDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 54
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setShouldShowRateReminder(Landroid/content/Context;Z)V

    .line 55
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 56
    return-void
.end method
