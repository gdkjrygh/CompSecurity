.class public Lcom/roidapp/cloudlib/google/GoogleAuthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 125
    return-void
.end method

.method static synthetic a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x800

    const/4 v3, 0x0

    .line 4310
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4311
    new-array v1, v4, [B

    .line 4313
    :goto_0
    invoke-virtual {p0, v1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ltz v2, :cond_0

    .line 4314
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 4316
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 38
    return-object v1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->i:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 117
    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 118
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 123
    :goto_0
    return-void

    .line 121
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/roidapp/cloudlib/google/d;

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->b:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/google/d;-><init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)Z
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a:Z

    return v0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 85
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 87
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 88
    const/16 v0, 0x2966

    if-ne p1, v0, :cond_2

    .line 90
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 91
    const-string v0, "authAccount"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->b:Ljava/lang/String;

    .line 94
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a()V

    .line 104
    :cond_1
    :goto_0
    return-void

    .line 96
    :cond_2
    const/16 v0, 0x5454

    if-ne p1, v0, :cond_3

    .line 98
    invoke-direct {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a()V

    goto :goto_0

    .line 99
    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 101
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 109
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 110
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 46
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 49
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setContentView(Landroid/view/View;)V

    .line 51
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/roidapp/cloudlib/google/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/google/a;-><init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V

    new-instance v1, Lcom/roidapp/cloudlib/google/b;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/google/b;-><init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V

    new-instance v2, Lcom/roidapp/cloudlib/google/c;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/google/c;-><init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    .line 81
    :goto_0
    return-void

    .line 78
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.google"

    aput-object v1, v0, v3

    .line 4000
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.android.gms.common.account.CHOOSE_ACCOUNT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "com.google.android.gms"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "allowableAccounts"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "allowableAccountTypes"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "addAccountOptions"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v0, "selectedAccount"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "alwaysPromptForAccount"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "descriptionTextOverride"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "authTokenType"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "addAccountRequiredFeatures"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "setGmsCoreAccount"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "overrideTheme"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "overrideCustomTheme"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 80
    const/16 v0, 0x2966

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method
