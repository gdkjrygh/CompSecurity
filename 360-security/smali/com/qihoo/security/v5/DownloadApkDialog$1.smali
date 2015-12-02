.class Lcom/qihoo/security/v5/DownloadApkDialog$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/DownloadApkDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/DownloadApkDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$1;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 45
    if-eqz p2, :cond_0

    .line 46
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 47
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$1;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$1;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 63
    :cond_0
    :goto_0
    return-void

    .line 53
    :cond_1
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_APP_PROGRESS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const-string/jumbo v0, "progress"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 55
    const/16 v1, 0x64

    if-lt v0, v1, :cond_2

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$1;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->a(Lcom/qihoo/security/v5/DownloadApkDialog;)Lcom/qihoo/security/v5/DownloadApkDialog$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a()V

    goto :goto_0

    .line 58
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$1;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v1}, Lcom/qihoo/security/v5/DownloadApkDialog;->a(Lcom/qihoo/security/v5/DownloadApkDialog;)Lcom/qihoo/security/v5/DownloadApkDialog$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a(I)V

    goto :goto_0
.end method
