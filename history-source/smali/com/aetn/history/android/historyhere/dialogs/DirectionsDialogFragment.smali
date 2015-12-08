.class public Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "DirectionsDialogFragment.java"


# instance fields
.field private mTextView:Landroid/widget/TextView;

.field private poi:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    .prologue
    .line 25
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 32
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 33
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 37
    .local v2, "inflater":Landroid/view/LayoutInflater;
    const v6, 0x7f030021

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 39
    .local v5, "v":Landroid/view/View;
    const v6, 0x7f0a0071

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 40
    .local v4, "okBtn":Landroid/widget/Button;
    const v6, 0x7f0a0072

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 41
    .local v3, "noBtn":Landroid/widget/Button;
    const v6, 0x7f0a0073

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->mTextView:Landroid/widget/TextView;

    .line 43
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->mTextView:Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 47
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 49
    .local v1, "dialog":Landroid/app/AlertDialog;
    new-instance v6, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;

    invoke-direct {v6, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;-><init>(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v4, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    new-instance v6, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$2;

    invoke-direct {v6, p0, v1}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$2;-><init>(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    return-object v1
.end method

.method public setPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 76
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 77
    return-void
.end method
