.class Lcom/qihoo/security/v5/DownloadApkDialog$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/DownloadApkDialog;->onCreate(Landroid/os/Bundle;)V
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
    .line 136
    iput-object p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$3;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 139
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_HIDE_DOWNLOAD_APK_DIALOG"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 140
    const-string/jumbo v1, "progress"

    iget-object v2, p0, Lcom/qihoo/security/v5/DownloadApkDialog$3;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/DownloadApkDialog;->c(Lcom/qihoo/security/v5/DownloadApkDialog;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 141
    iget-object v1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$3;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v1}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$3;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 143
    return-void
.end method
