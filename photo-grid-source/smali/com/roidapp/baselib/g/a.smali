.class public final Lcom/roidapp/baselib/g/a;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field a:Lcom/roidapp/baselib/g/c;

.field private b:Lcom/roidapp/baselib/e/a;

.field private c:Landroid/widget/ProgressBar;

.field private d:Lcom/roidapp/baselib/g/b;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->a:Lcom/roidapp/baselib/g/c;

    .line 241
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/g/b;)Lcom/roidapp/baselib/g/a;
    .locals 4

    .prologue
    .line 29
    new-instance v0, Lcom/roidapp/baselib/g/a;

    invoke-direct {v0}, Lcom/roidapp/baselib/g/a;-><init>()V

    .line 30
    iput-object p2, v0, Lcom/roidapp/baselib/g/a;->d:Lcom/roidapp/baselib/g/b;

    .line 31
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 32
    const-string v2, "url"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v2, "savePath"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v2, "showRetry"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 35
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/g/a;->setArguments(Landroid/os/Bundle;)V

    .line 36
    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/baselib/g/a;)Lcom/roidapp/baselib/g/b;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->d:Lcom/roidapp/baselib/g/b;

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/a;->f()V

    .line 142
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    .line 143
    return-void
.end method

.method static synthetic b(Lcom/roidapp/baselib/g/a;)V
    .locals 2

    .prologue
    .line 23
    .line 1158
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1159
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->e:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/baselib/h;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1161
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 1162
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1164
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 1165
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 23
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/roidapp/baselib/g/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/baselib/g/a;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->g:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public final dismiss()V
    .locals 0

    .prologue
    .line 104
    invoke-virtual {p0}, Lcom/roidapp/baselib/g/a;->dismissAllowingStateLoss()V

    .line 105
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 50
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 51
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 135
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 136
    invoke-direct {p0}, Lcom/roidapp/baselib/g/a;->a()V

    .line 137
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 115
    invoke-virtual {p0}, Lcom/roidapp/baselib/g/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 118
    sget v1, Lcom/roidapp/baselib/f;->a:I

    if-ne v0, v1, :cond_1

    .line 119
    invoke-direct {p0}, Lcom/roidapp/baselib/g/a;->a()V

    .line 120
    invoke-virtual {p0}, Lcom/roidapp/baselib/g/a;->dismiss()V

    .line 125
    :cond_0
    :goto_0
    return-void

    .line 121
    :cond_1
    sget v1, Lcom/roidapp/baselib/f;->d:I

    if-ne v0, v1, :cond_0

    .line 1146
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    if-eqz v0, :cond_0

    .line 1147
    new-instance v0, Lcom/roidapp/baselib/e/a;

    iget-object v1, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/e/a;-><init>(Lcom/roidapp/baselib/e/a;)V

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    .line 1148
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1149
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->g:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1150
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1151
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1152
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    const-string v2, "DownLoadSticker"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1153
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->e:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/baselib/h;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 109
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 111
    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 62
    invoke-virtual {p0}, Lcom/roidapp/baselib/g/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 63
    new-instance v2, Lcom/roidapp/baselib/g/c;

    invoke-direct {v2, p0, v7}, Lcom/roidapp/baselib/g/c;-><init>(Lcom/roidapp/baselib/g/a;B)V

    iput-object v2, p0, Lcom/roidapp/baselib/g/a;->a:Lcom/roidapp/baselib/g/c;

    .line 64
    invoke-virtual {p0}, Lcom/roidapp/baselib/g/a;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 65
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v2, :cond_0

    const-string v3, "url"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "savePath"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 66
    :cond_0
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/g/a;->setShowsDialog(Z)V

    .line 99
    :goto_0
    return-object v0

    .line 70
    :cond_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    sget v6, Lcom/roidapp/baselib/g;->a:I

    invoke-virtual {v5, v6, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 72
    sget v0, Lcom/roidapp/baselib/f;->a:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 73
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    sget v0, Lcom/roidapp/baselib/f;->d:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    .line 75
    const-string v0, "showRetry"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    :goto_1
    sget v0, Lcom/roidapp/baselib/f;->c:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    .line 82
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 83
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->c:Landroid/widget/ProgressBar;

    const/16 v2, 0x64

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 85
    sget v0, Lcom/roidapp/baselib/f;->e:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->e:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/roidapp/baselib/f;->f:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->g:Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/roidapp/baselib/f;->b:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/baselib/g/a;->h:Landroid/widget/TextView;

    .line 89
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1080055

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 90
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 93
    iget-object v1, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 95
    new-instance v1, Lcom/roidapp/baselib/e/a;

    new-instance v2, Lcom/roidapp/baselib/g/d;

    iget-object v5, p0, Lcom/roidapp/baselib/g/a;->a:Lcom/roidapp/baselib/g/c;

    invoke-direct {v2, v5, v7}, Lcom/roidapp/baselib/g/d;-><init>(Lcom/roidapp/baselib/g/c;B)V

    invoke-direct {v1, v3, v4, v2}, Lcom/roidapp/baselib/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V

    iput-object v1, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    .line 96
    iget-object v1, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-virtual {v1}, Lcom/roidapp/baselib/e/a;->g()V

    .line 97
    iget-object v1, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    invoke-virtual {v1}, Lcom/roidapp/baselib/e/a;->h()V

    .line 98
    new-instance v1, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/roidapp/baselib/g/a;->b:Lcom/roidapp/baselib/e/a;

    const-string v3, "DownLoadSticker"

    invoke-direct {v1, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 78
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/g/a;->f:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method public final onDetach()V
    .locals 0

    .prologue
    .line 55
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDetach()V

    .line 56
    invoke-direct {p0}, Lcom/roidapp/baselib/g/a;->a()V

    .line 57
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 130
    invoke-direct {p0}, Lcom/roidapp/baselib/g/a;->a()V

    .line 131
    return-void
.end method
