.class public Lkik/android/chat/fragment/ProgressDialogFragment;
.super Lkik/android/chat/fragment/KikDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/ProgressDialogFragment$a;
    }
.end annotation


# instance fields
.field private f:Z

.field private g:Landroid/content/DialogInterface$OnCancelListener;

.field private h:I

.field private i:I

.field private j:Lkik/a/e/s;

.field private k:Lkik/android/chat/fragment/ProgressDialogFragment$a;

.field private l:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 16
    iput-boolean v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->f:Z

    .line 22
    iput v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    .line 24
    iput v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->i:I

    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkik/android/chat/fragment/ProgressDialogFragment$a;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 47
    invoke-direct {p0, p1, v0}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 48
    iput v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    .line 49
    iput-object p2, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->k:Lkik/android/chat/fragment/ProgressDialogFragment$a;

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 16
    iput-boolean v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->f:Z

    .line 22
    iput v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    .line 24
    iput v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->i:I

    .line 36
    iput-object p1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->b:Ljava/lang/String;

    .line 37
    invoke-virtual {p0, p2}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 38
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 39
    const-string v1, "kik.android.ProgressDialogFragment.KEY_TEXT"

    iget-object v2, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v1, "kik.android.ProgressDialogFragment.KEY_CANCELLABLE"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 41
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 42
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/ProgressDialogFragment;)I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->i:I

    return v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/ProgressDialogFragment;I)I
    .locals 0

    .prologue
    .line 14
    iput p1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->i:I

    return p1
.end method

.method static synthetic b(Lkik/android/chat/fragment/ProgressDialogFragment;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->g:Landroid/content/DialogInterface$OnCancelListener;

    .line 66
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->f:Z

    .line 61
    return-void
.end method

.method public final f()Lkik/a/e/s;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->j:Lkik/a/e/s;

    return-object v0
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikDialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 150
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->g:Landroid/content/DialogInterface$OnCancelListener;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->g:Landroid/content/DialogInterface$OnCancelListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 153
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 76
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 77
    invoke-virtual {p0}, Lkik/android/chat/fragment/ProgressDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v0, "kik.android.ProgressDialogFragment.KEY_TEXT"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    iput-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->b:Ljava/lang/String;

    const-string v0, "kik.android.ProgressDialogFragment.KEY_CANCELLABLE"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 78
    :cond_1
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 96
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lkik/android/chat/fragment/ProgressDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    .line 97
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 98
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/4 v1, -0x1

    iget-object v2, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->c:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 104
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/4 v1, -0x2

    iget-object v2, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 108
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    if-eqz v0, :cond_2

    .line 109
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/4 v1, -0x3

    iget-object v2, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikDialogFragment$b;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->e:Lkik/android/chat/fragment/KikDialogFragment$b;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikDialogFragment$b;->b()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 112
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lkik/android/chat/fragment/ProgressDialogFragment;->isCancelable()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 114
    iget v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    if-nez v0, :cond_5

    .line 115
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 130
    :cond_3
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget-boolean v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->f:Z

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 131
    new-instance v0, Lkik/android/chat/fragment/ql;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ql;-><init>(Lkik/android/chat/fragment/ProgressDialogFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->j:Lkik/a/e/s;

    .line 139
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->k:Lkik/android/chat/fragment/ProgressDialogFragment$a;

    if-eqz v0, :cond_4

    .line 140
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->k:Lkik/android/chat/fragment/ProgressDialogFragment$a;

    invoke-interface {v0}, Lkik/android/chat/fragment/ProgressDialogFragment$a;->a()V

    .line 142
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    return-object v0

    .line 118
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 119
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->i:I

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V

    .line 120
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    .line 121
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    iget v1, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->h:I

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 125
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/ProgressDialogFragment;->l:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressNumberFormat(Ljava/lang/String;)V

    goto :goto_0
.end method
