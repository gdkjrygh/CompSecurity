.class public Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "UpdateDialogFragment.java"


# instance fields
.field public requiredUpdate:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 10
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 28
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-direct {v1, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 29
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 34
    .local v3, "inflater":Landroid/view/LayoutInflater;
    const v8, 0x7f03002a

    const/4 v9, 0x0

    invoke-virtual {v3, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 36
    .local v7, "v":Landroid/view/View;
    const v8, 0x7f0a006b

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 37
    .local v0, "alertText":Landroid/widget/TextView;
    const v8, 0x7f0a0071

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    .line 38
    .local v6, "okBtn":Landroid/widget/Button;
    const v8, 0x7f0a0072

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 39
    .local v5, "noBtn":Landroid/widget/Button;
    const v8, 0x7f0a0079

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 41
    .local v4, "laterBtn":Landroid/widget/Button;
    iget-boolean v8, p0, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    if-eqz v8, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0d0093

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    const/16 v8, 0x8

    invoke-virtual {v4, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 46
    :cond_0
    invoke-virtual {v1, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 48
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    .line 50
    .local v2, "dialog":Landroid/app/AlertDialog;
    new-instance v8, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;

    invoke-direct {v8, p0, v2}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v6, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    new-instance v8, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;

    invoke-direct {v8, p0, v2}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$2;-><init>(Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v5, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    new-instance v8, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$3;

    invoke-direct {v8, p0, v2}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment$3;-><init>(Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v4, v8}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    return-object v2
.end method
