.class public Lcom/qihoo/security/v5/UpdateDownloadUIService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# instance fields
.field private c:Z

.field private d:I

.field private e:Landroid/content/BroadcastReceiver;

.field private f:I

.field private g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->c:Z

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdateDownloadUIService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 4

    .prologue
    .line 53
    new-instance v0, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdateDownloadUIService$1;-><init>(Lcom/qihoo/security/v5/UpdateDownloadUIService;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->e:Landroid/content/BroadcastReceiver;

    .line 110
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 111
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.APP_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 112
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_OVER"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 113
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 114
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.CONNECT_RETRY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 115
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->e:Landroid/content/BroadcastReceiver;

    const-string/jumbo v2, "com.qihoo.security.lite.PERMISSION"

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 117
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/v5/UpdateDownloadUIService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 202
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    const-string/jumbo v1, "i18n_security_lite"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 203
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/v5/UpdateDownloadUIService;)J
    .locals 2

    .prologue
    .line 29
    iget-wide v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->g:J

    return-wide v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 173
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 47
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/qihoo/security/SecurityApplication;->a(Z)V

    .line 48
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->a()V

    .line 50
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 193
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b()V

    .line 194
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/SecurityApplication;->a(Z)V

    .line 195
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 196
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/a;->d()V

    .line 197
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 199
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 121
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/UiProcessService;->onStartCommand(Landroid/content/Intent;II)I

    .line 128
    monitor-enter p0

    .line 129
    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->c:Z

    if-eqz v0, :cond_1

    .line 130
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c018b

    const v2, 0x7f020143

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V

    .line 132
    monitor-exit p0

    .line 168
    :cond_0
    :goto_0
    return v5

    .line 134
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->c:Z

    .line 136
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    if-eqz p1, :cond_2

    .line 139
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 142
    if-eqz v3, :cond_3

    .line 143
    const-string/jumbo v0, "uiforce"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 144
    const-string/jumbo v0, "ispatch"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 145
    const-string/jumbo v4, "type"

    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->f:I

    move v1, v2

    .line 151
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Z)V

    .line 152
    const/16 v0, 0x6995

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->g:J

    .line 154
    const v0, 0x7f0c01bc

    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 155
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/a;->c()V

    .line 157
    if-eqz v1, :cond_0

    .line 158
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 159
    const-string/jumbo v1, "uiforce"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 160
    const-string/jumbo v1, "progress"

    iget v2, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 161
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 162
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 166
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->stopSelf()V

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 181
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/SecurityApplication;->a(Z)V

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateDownloadUIService;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 183
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateDownloadUIService;->b()V

    .line 184
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/utils/notice/a;->d()V

    .line 185
    invoke-super {p0, p1}, Lcom/qihoo/security/app/UiProcessService;->onTaskRemoved(Landroid/content/Intent;)V

    .line 186
    return-void
.end method
