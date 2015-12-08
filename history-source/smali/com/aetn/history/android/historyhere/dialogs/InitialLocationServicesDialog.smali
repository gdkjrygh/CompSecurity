.class public Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;
.super Landroid/app/DialogFragment;
.source "InitialLocationServicesDialog.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance(I)Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;
    .locals 3
    .param p0, "title"    # I

    .prologue
    .line 19
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;-><init>()V

    .line 20
    .local v1, "frag":Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 21
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "title"

    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 22
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->setArguments(Landroid/os/Bundle;)V

    .line 23
    return-object v1
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 29
    .local v1, "inflater":Landroid/view/LayoutInflater;
    const v4, 0x7f030024

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 30
    .local v3, "view":Landroid/view/View;
    const v4, 0x7f0a0071

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 31
    .local v2, "okBtn":Landroid/widget/Button;
    const v4, 0x7f0a006d

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 32
    .local v0, "cancelBtn":Landroid/widget/Button;
    new-instance v4, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$1;

    invoke-direct {v4, p0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;)V

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    new-instance v4, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$2;

    invoke-direct {v4, p0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog$2;-><init>(Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;)V

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    .line 47
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    return-object v4
.end method
