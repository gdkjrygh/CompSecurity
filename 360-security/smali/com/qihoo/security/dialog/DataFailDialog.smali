.class public Lcom/qihoo/security/dialog/DataFailDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# static fields
.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/qihoo/security/dialog/DataFailDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/dialog/DataFailDialog;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/DataFailDialog;->finish()V

    .line 48
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    const v0, 0x7f0c018f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DataFailDialog;->setDialogTitle(I)V

    .line 26
    const v0, 0x7f0c018d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DataFailDialog;->setDialogMessage(I)V

    .line 27
    new-array v0, v3, [I

    const v1, 0x7f0c0156

    aput v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DataFailDialog;->setButtonText([I)V

    .line 28
    new-array v0, v3, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/dialog/DataFailDialog$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/DataFailDialog$1;-><init>(Lcom/qihoo/security/dialog/DataFailDialog;)V

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DataFailDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 34
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 38
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 43
    return-void
.end method
