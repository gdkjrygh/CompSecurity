.class Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;
.super Ljava/lang/Object;
.source "InitLocationServicesOrSearchDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    .prologue
    .line 36
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 39
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMapSearch()V

    .line 40
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 41
    return-void
.end method
