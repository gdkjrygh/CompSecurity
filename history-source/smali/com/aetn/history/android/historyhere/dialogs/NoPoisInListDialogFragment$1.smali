.class Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment$1;
.super Ljava/lang/Object;
.source "NoPoisInListDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment;Landroid/app/AlertDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment;

    .prologue
    .line 31
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/NoPoisInListDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 35
    return-void
.end method
