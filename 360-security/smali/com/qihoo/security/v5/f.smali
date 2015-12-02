.class public final Lcom/qihoo/security/v5/f;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 26
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 27
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/qihoo/security/v5/DownloadStatus;I)V
    .locals 2

    .prologue
    .line 32
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.action.ACTION_APP_PROGRESS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 33
    const-string/jumbo v1, "download_status"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 34
    const-string/jumbo v1, "progress"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 35
    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 36
    return-void
.end method
