.class Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;
.super Ljava/lang/Object;
.source "SpinnerICS.java"

# interfaces
.implements Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/SpinnerICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DialogPopup"
.end annotation


# instance fields
.field private mListAdapter:Landroid/widget/ListAdapter;

.field private mPopup:Landroid/app/AlertDialog;

.field private mPrompt:Ljava/lang/CharSequence;

.field final synthetic this$0:Landroid/support/v7/internal/widget/SpinnerICS;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/SpinnerICS;)V
    .locals 0

    .prologue
    .line 649
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/support/v7/internal/widget/SpinnerICS$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/internal/widget/SpinnerICS;
    .param p2, "x1"    # Landroid/support/v7/internal/widget/SpinnerICS$1;

    .prologue
    .line 649
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .prologue
    .line 655
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPopup:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 656
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPopup:Landroid/app/AlertDialog;

    .line 657
    return-void
.end method

.method public getHintText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 672
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPrompt:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 660
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPopup:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPopup:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 685
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0, p2}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 686
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v0, v0, Landroid/support/v7/internal/widget/SpinnerICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    if-eqz v0, :cond_0

    .line 687
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    const/4 v1, 0x0

    iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mListAdapter:Landroid/widget/ListAdapter;

    invoke-interface {v2, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->performItemClick(Landroid/view/View;IJ)Z

    .line 689
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->dismiss()V

    .line 690
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 0
    .param p1, "adapter"    # Landroid/widget/ListAdapter;

    .prologue
    .line 664
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mListAdapter:Landroid/widget/ListAdapter;

    .line 665
    return-void
.end method

.method public setPromptText(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1, "hintText"    # Ljava/lang/CharSequence;

    .prologue
    .line 668
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPrompt:Ljava/lang/CharSequence;

    .line 669
    return-void
.end method

.method public show()V
    .locals 3

    .prologue
    .line 676
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/SpinnerICS;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 677
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPrompt:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    .line 678
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPrompt:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 680
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mListAdapter:Landroid/widget/ListAdapter;

    iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v2

    invoke-virtual {v0, v1, v2, p0}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;->mPopup:Landroid/app/AlertDialog;

    .line 682
    return-void
.end method
