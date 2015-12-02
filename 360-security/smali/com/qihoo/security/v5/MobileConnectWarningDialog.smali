.class public Lcom/qihoo/security/v5/MobileConnectWarningDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# instance fields
.field private c:Z

.field private d:Z

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->c:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->d:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->e:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x0

    .line 18
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    const v0, 0x7f0c017f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->setDialogTitle(I)V

    .line 20
    const v0, 0x7f0c01bb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->setDialogMessage(I)V

    .line 21
    new-array v0, v3, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->setButtonText([I)V

    .line 22
    invoke-virtual {p0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "uiforce"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->c:Z

    .line 23
    invoke-virtual {p0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "ispatch"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->d:Z

    .line 24
    invoke-virtual {p0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "type"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->e:I

    .line 25
    new-array v0, v3, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;-><init>(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)V

    aput-object v1, v0, v2

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;-><init>(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 48
    return-void

    .line 21
    nop

    :array_0
    .array-data 4
        0x7f0c01cd
        0x7f0c014f
    .end array-data
.end method
