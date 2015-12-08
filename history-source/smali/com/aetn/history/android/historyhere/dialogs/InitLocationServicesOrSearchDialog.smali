.class public Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;
.super Landroid/app/DialogFragment;
.source "InitLocationServicesOrSearchDialog.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "InitLocationServicesOrSearchDialog"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance(I)Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;
    .locals 3
    .param p0, "title"    # I

    .prologue
    .line 22
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;-><init>()V

    .line 23
    .local v1, "frag":Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 24
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "title"

    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 25
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->setArguments(Landroid/os/Bundle;)V

    .line 26
    return-object v1
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 32
    .local v1, "inflater":Landroid/view/LayoutInflater;
    const v5, 0x7f030023

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 33
    .local v4, "view":Landroid/view/View;
    const v5, 0x7f0a0071

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 34
    .local v2, "okBtn":Landroid/widget/Button;
    const v5, 0x7f0a006d

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 35
    .local v0, "cancelBtn":Landroid/widget/Button;
    const v5, 0x7f0a0078

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 36
    .local v3, "tv":Landroid/widget/TextView;
    new-instance v5, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;

    invoke-direct {v5, p0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    new-instance v5, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$2;

    invoke-direct {v5, p0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$2;-><init>(Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;)V

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    new-instance v5, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$3;

    invoke-direct {v5, p0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog$3;-><init>(Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 58
    invoke-virtual {v5, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v5

    .line 59
    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v5

    return-object v5
.end method
