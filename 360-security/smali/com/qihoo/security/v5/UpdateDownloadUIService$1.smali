.class Lcom/qihoo/security/v5/UpdateDownloadUIService$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdateDownloadUIService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/UpdateDownloadUIService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdateDownloadUIService;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x3e8

    const-wide/16 v4, 0x0

    .line 56
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 61
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.APP_PROGRESS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 62
    const-string/jumbo v0, "current"

    invoke-virtual {p2, v0, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 63
    const-string/jumbo v2, "total"

    invoke-virtual {p2, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 64
    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 65
    const-wide/16 v4, 0x64

    mul-long/2addr v0, v4

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 67
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/utils/notice/a;->a(I)V

    .line 108
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_OVER"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->a(Lcom/qihoo/security/v5/UpdateDownloadUIService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/f;->a(Landroid/content/Context;)V

    .line 75
    const-string/jumbo v0, "app_path"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b(Lcom/qihoo/security/v5/UpdateDownloadUIService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "i18n_security_lite"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 82
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/utils/notice/a;->d()V

    .line 83
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/utils/notice/a;->b(Ljava/lang/String;)V

    .line 84
    invoke-static {p1, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->c(Lcom/qihoo/security/v5/UpdateDownloadUIService;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    div-long/2addr v0, v6

    .line 86
    const/16 v2, 0x6985

    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    .line 87
    const/16 v2, 0x6984

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 88
    const/16 v0, 0x6990

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->stopSelf()V

    goto :goto_0

    .line 91
    :cond_2
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 92
    const-string/jumbo v0, "error_code"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 95
    const/16 v1, 0x698e

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->c(Lcom/qihoo/security/v5/UpdateDownloadUIService;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    div-long/2addr v0, v6

    .line 99
    cmp-long v2, v0, v4

    if-lez v2, :cond_3

    const-wide/32 v2, 0x15180

    cmp-long v2, v0, v2

    if-gez v2, :cond_3

    .line 100
    const/16 v2, 0x6993

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 102
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;->a:Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->stopSelf()V

    .line 103
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0176

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto/16 :goto_0

    .line 105
    :cond_4
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.CONNECT_RETRY"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    const/16 v0, 0x6992

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 96
    :catch_0
    move-exception v0

    goto :goto_1
.end method
