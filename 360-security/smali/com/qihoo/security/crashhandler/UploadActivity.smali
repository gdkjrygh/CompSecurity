.class public Lcom/qihoo/security/crashhandler/UploadActivity;
.super Lcom/qihoo/security/app/BaseSimpleActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/crashhandler/UploadActivity$a;
    }
.end annotation


# instance fields
.field public a:Lcom/qihoo/security/locale/d;

.field private b:Lcom/qihoo/security/dialog/k;

.field private c:Lcom/qihoo/security/dialog/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;-><init>()V

    .line 20
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->a:Lcom/qihoo/security/locale/d;

    .line 80
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/k;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 63
    invoke-static {p0}, Lcom/qihoo/security/crashhandler/b;->a(Landroid/content/Context;)Lcom/qihoo/security/crashhandler/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/crashhandler/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-direct {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->b()V

    .line 71
    :goto_0
    return-void

    .line 69
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->c()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/crashhandler/UploadActivity;Z)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 148
    new-instance v1, Lcom/qihoo/security/dialog/i;

    const v2, 0x7f0c015f

    if-eqz p1, :cond_1

    const v0, 0x7f0c015c

    :goto_0
    invoke-direct {v1, p0, v2, v0}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    iput-object v1, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    new-array v1, v4, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    new-array v1, v4, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/crashhandler/UploadActivity$3;

    invoke-direct {v2, p0}, Lcom/qihoo/security/crashhandler/UploadActivity$3;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/crashhandler/UploadActivity$4;

    invoke-direct {v3, p0}, Lcom/qihoo/security/crashhandler/UploadActivity$4;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 173
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/i;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    :cond_0
    :goto_1
    return-void

    .line 148
    :cond_1
    const v0, 0x7f0c015e

    goto :goto_0

    .line 176
    :catch_0
    move-exception v0

    goto :goto_1

    .line 150
    :array_0
    .array-data 4
        0x7f0c015d
        0x7f0c014f
    .end array-data
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 104
    const/16 v0, 0x4a43

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Lcom/qihoo/security/dialog/k;

    const v1, 0x7f0c015f

    const v2, 0x7f0c015a

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/k;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    new-array v1, v6, [Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->a:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0154

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->a:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0152

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->setButtonText([Ljava/lang/CharSequence;)V

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/dialog/k;->setCancelable(Z)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    new-array v1, v6, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/crashhandler/UploadActivity$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/crashhandler/UploadActivity$1;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    aput-object v2, v1, v4

    new-instance v2, Lcom/qihoo/security/crashhandler/UploadActivity$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/crashhandler/UploadActivity$2;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 137
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/k;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :cond_1
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/crashhandler/UploadActivity;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/i;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->finish()V

    .line 183
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 184
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->d()V

    .line 56
    const v0, 0x7f030043

    invoke-virtual {p0, v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->setContentView(I)V

    .line 59
    invoke-direct {p0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a()V

    .line 60
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->b:Lcom/qihoo/security/dialog/k;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity;->c:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 77
    invoke-super {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;->onDestroy()V

    .line 78
    return-void
.end method
