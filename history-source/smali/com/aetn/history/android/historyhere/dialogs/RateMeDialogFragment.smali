.class public Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "RateMeDialogFragment.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 26
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-direct {v0, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 27
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 31
    .local v2, "inflater":Landroid/view/LayoutInflater;
    const v7, 0x7f030029

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 33
    .local v6, "v":Landroid/view/View;
    const v7, 0x7f0a0071

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 34
    .local v5, "okBtn":Landroid/widget/Button;
    const v7, 0x7f0a0072

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 35
    .local v4, "noBtn":Landroid/widget/Button;
    const v7, 0x7f0a0079

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 37
    .local v3, "laterBtn":Landroid/widget/Button;
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 39
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 41
    .local v1, "dialog":Landroid/app/AlertDialog;
    new-instance v7, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$1;

    invoke-direct {v7, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v5, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    new-instance v7, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;

    invoke-direct {v7, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$2;-><init>(Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v4, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    new-instance v7, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$3;

    invoke-direct {v7, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment$3;-><init>(Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    return-object v1
.end method
