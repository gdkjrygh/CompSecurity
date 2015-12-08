.class Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$2;
.super Ljava/lang/Object;
.source "InitialLocationServicesDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;

    .prologue
    .line 39
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$2;->this$0:Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 43
    return-void
.end method
