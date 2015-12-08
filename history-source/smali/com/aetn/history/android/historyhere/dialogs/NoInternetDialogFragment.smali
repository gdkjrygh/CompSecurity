.class public Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "NoInternetDialogFragment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 22
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 23
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 26
    .local v2, "inflater":Landroid/view/LayoutInflater;
    const v5, 0x7f030025

    const/4 v6, 0x0

    invoke-virtual {v2, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 27
    .local v4, "v":Landroid/view/View;
    const v5, 0x7f0a0071

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 28
    .local v3, "okBtn":Landroid/widget/Button;
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 30
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 31
    .local v1, "dialog":Landroid/app/AlertDialog;
    new-instance v5, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment$1;

    invoke-direct {v5, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    return-object v1
.end method
