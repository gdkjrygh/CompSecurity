.class public Lcom/qihoo/security/v5/DownloadApkDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v5/DownloadApkDialog$a;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Lcom/qihoo/security/v5/DownloadApkDialog$a;

.field private e:Z

.field private f:I

.field private final g:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->d:Lcom/qihoo/security/v5/DownloadApkDialog$a;

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->e:Z

    .line 42
    new-instance v0, Lcom/qihoo/security/v5/DownloadApkDialog$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/DownloadApkDialog$1;-><init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->g:Landroid/content/BroadcastReceiver;

    .line 66
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/DownloadApkDialog;I)I
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->f:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/v5/DownloadApkDialog;)Lcom/qihoo/security/v5/DownloadApkDialog$a;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->d:Lcom/qihoo/security/v5/DownloadApkDialog$a;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/v5/DownloadApkDialog;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->f:I

    return v0
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 3

    .prologue
    .line 187
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03004a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 192
    iget-boolean v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->e:Z

    if-nez v0, :cond_0

    .line 193
    invoke-virtual {p0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 195
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 95
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 101
    invoke-virtual {p0}, Lcom/qihoo/security/v5/DownloadApkDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->c:Landroid/content/Context;

    .line 102
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 103
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 104
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_APP_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 105
    iget-object v1, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->g:Landroid/content/BroadcastReceiver;

    const-string/jumbo v3, "com.qihoo.security.lite.PERMISSION"

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v0, v3, v4}, Lcom/qihoo/security/v5/DownloadApkDialog;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 107
    invoke-virtual {p0}, Lcom/qihoo/security/v5/DownloadApkDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 108
    if-nez v0, :cond_0

    .line 109
    invoke-virtual {p0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 154
    :goto_0
    return-void

    .line 112
    :cond_0
    iput-boolean v2, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->e:Z

    .line 113
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    const-string/jumbo v1, "uiforce"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->e:Z

    .line 117
    const-string/jumbo v1, "progress"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 118
    const v0, 0x7f0b0108

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ProgressView;

    .line 119
    int-to-float v3, v1

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    invoke-virtual {v0, v3, v2}, Lcom/qihoo/security/widget/ProgressView;->a(FI)V

    .line 121
    :goto_1
    const v0, 0x7f0b0107

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v3, "%"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 123
    const v0, 0x7f0c0185

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->setDialogTitle(I)V

    .line 124
    iget-boolean v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->e:Z

    if-eqz v0, :cond_1

    .line 125
    new-array v0, v5, [I

    const v1, 0x7f0c014f

    aput v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->setButtonText([I)V

    .line 126
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/v5/DownloadApkDialog$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/DownloadApkDialog$2;-><init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 153
    :goto_2
    new-instance v0, Lcom/qihoo/security/v5/DownloadApkDialog$a;

    invoke-direct {v0, p0, p0}, Lcom/qihoo/security/v5/DownloadApkDialog$a;-><init>(Lcom/qihoo/security/v5/DownloadApkDialog;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->d:Lcom/qihoo/security/v5/DownloadApkDialog$a;

    goto :goto_0

    .line 135
    :cond_1
    new-array v0, v6, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->setButtonText([I)V

    .line 136
    new-array v0, v6, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/v5/DownloadApkDialog$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/DownloadApkDialog$3;-><init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V

    aput-object v1, v0, v2

    new-instance v1, Lcom/qihoo/security/v5/DownloadApkDialog$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/DownloadApkDialog$4;-><init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V

    aput-object v1, v0, v5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    move v1, v2

    goto :goto_1

    .line 135
    :array_0
    .array-data 4
        0x7f0c0187
        0x7f0c014f
    .end array-data
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 170
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_HIDE_DOWNLOAD_APK_DIALOG"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 171
    const-string/jumbo v1, "progress"

    iget v2, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->f:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 172
    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/v5/DownloadApkDialog;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    :goto_0
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 183
    return-void

    .line 175
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 158
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onStop()V

    .line 163
    return-void
.end method
