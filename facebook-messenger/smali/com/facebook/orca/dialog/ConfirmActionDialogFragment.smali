.class public abstract Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "ConfirmActionDialogFragment.java"


# instance fields
.field private Z:Lcom/facebook/orca/activity/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method private a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 131
    if-eqz p2, :cond_0

    .line 132
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    :goto_0
    return-void

    .line 134
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method protected O()V
    .locals 0

    .prologue
    .line 117
    return-void
.end method

.method protected P()V
    .locals 0

    .prologue
    .line 120
    return-void
.end method

.method protected Q()V
    .locals 0

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a()V

    .line 124
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ConfirmActionDialogFragment needs ConfirmActionParams before its view is created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/i;->a()Ljava/lang/String;

    move-result-object v5

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/i;->b()Ljava/lang/String;

    move-result-object v6

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/i;->c()Ljava/lang/String;

    move-result-object v7

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/i;->d()Ljava/lang/String;

    move-result-object v8

    .line 74
    if-nez v5, :cond_1

    .line 75
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ConfirmActionDialogFragment requires a title"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_1
    if-nez v7, :cond_2

    .line 78
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ConfirmActionDialogFragment requires okay text"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_2
    sget v0, Lcom/facebook/k;->orca_confirm_action:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    .line 82
    sget v0, Lcom/facebook/i;->confirm_title:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 83
    sget v1, Lcom/facebook/i;->confirm_message:I

    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 84
    sget v2, Lcom/facebook/i;->confirm_okay_button:I

    invoke-virtual {v9, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 85
    sget v3, Lcom/facebook/i;->confirm_neutral_button:I

    invoke-virtual {v9, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 86
    sget v4, Lcom/facebook/i;->confirm_cancel_button:I

    invoke-virtual {v9, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 89
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-direct {p0, v1, v6}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 91
    invoke-virtual {v2, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-direct {p0, v3, v8}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 94
    new-instance v0, Lcom/facebook/orca/dialog/a;

    invoke-direct {v0, p0}, Lcom/facebook/orca/dialog/a;-><init>(Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;)V

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    new-instance v0, Lcom/facebook/orca/dialog/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/dialog/b;-><init>(Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;)V

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    new-instance v0, Lcom/facebook/orca/dialog/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/dialog/c;-><init>(Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;)V

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    return-object v9
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 38
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->a(Landroid/os/Bundle;)V

    .line 40
    const/4 v0, 0x2

    sget v1, Lcom/facebook/p;->Theme_OrcaDialog:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a(II)V

    .line 41
    return-void
.end method

.method protected a(Lcom/facebook/orca/activity/i;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    .line 34
    return-void
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->Z:Lcom/facebook/orca/activity/i;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/i;->a()Ljava/lang/String;

    move-result-object v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ConfirmActionDialogFragment requires a title"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->c(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v1

    .line 53
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 54
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 55
    invoke-static {v1}, Lcom/facebook/base/b/a;->a(Landroid/app/Dialog;)V

    .line 56
    return-object v1
.end method
