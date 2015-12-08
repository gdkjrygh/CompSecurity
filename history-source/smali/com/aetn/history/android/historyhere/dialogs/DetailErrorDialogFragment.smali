.class public Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "DetailErrorDialogFragment.java"


# instance fields
.field private final TAG:Ljava/lang/String;

.field msg:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->TAG:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->msg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 8
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 25
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 26
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 29
    .local v2, "inflater":Landroid/view/LayoutInflater;
    const v6, 0x7f030020

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 30
    .local v5, "v":Landroid/view/View;
    const v6, 0x7f0a002f

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 31
    .local v4, "text":Landroid/widget/TextView;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->msg:Ljava/lang/String;

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    const v6, 0x7f0a0071

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 33
    .local v3, "okBtn":Landroid/widget/Button;
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 34
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 35
    .local v1, "dialog":Landroid/app/AlertDialog;
    new-instance v6, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment$1;

    invoke-direct {v6, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    return-object v1
.end method

.method public setErrorMessage(Ljava/lang/String;)V
    .locals 3
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the message is :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/DetailErrorDialogFragment;->msg:Ljava/lang/String;

    .line 47
    return-void
.end method
