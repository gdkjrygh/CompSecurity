.class public Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "GenericDialogFragment.java"


# instance fields
.field mOKBtnText:Ljava/lang/String;

.field mText:Ljava/lang/String;

.field mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mTitle:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mText:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mOKBtnText:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 24
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-direct {v0, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 25
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 26
    .local v2, "inflater":Landroid/view/LayoutInflater;
    const v7, 0x7f030022

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 27
    .local v6, "v":Landroid/view/View;
    const v7, 0x7f0a0074

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 28
    .local v5, "tvTitle":Landroid/widget/TextView;
    const v7, 0x7f0a0075

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 29
    .local v4, "tvText":Landroid/widget/TextView;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mTitle:Ljava/lang/String;

    if-eqz v7, :cond_1

    .line 30
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    :goto_0
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mText:Ljava/lang/String;

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    const v7, 0x7f0a0071

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 36
    .local v3, "okBtn":Landroid/widget/Button;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mOKBtnText:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    .line 37
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mOKBtnText:Ljava/lang/String;

    invoke-virtual {v3, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 39
    :cond_0
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 40
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 41
    .local v1, "dialog":Landroid/app/AlertDialog;
    new-instance v7, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment$1;

    invoke-direct {v7, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    return-object v1

    .line 32
    .end local v1    # "dialog":Landroid/app/AlertDialog;
    .end local v3    # "okBtn":Landroid/widget/Button;
    :cond_1
    const/16 v7, 0x8

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setOKBtnText(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 61
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mOKBtnText:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setTitleText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "text"    # Ljava/lang/String;

    .prologue
    .line 56
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mTitle:Ljava/lang/String;

    .line 57
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->mText:Ljava/lang/String;

    .line 58
    return-void
.end method
