.class final Lcom/arist/service/g;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->d()I

    move-result v1

    invoke-static {v0, v1}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;I)V

    const-string v0, "MusicPlayService"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u7761\u7720 \u9000\u51fa planeModeSet = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v2}, Lcom/arist/service/MusicPlayService;->k(Lcom/arist/service/MusicPlayService;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->stopSelf()V

    iget-object v0, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->k(Lcom/arist/service/MusicPlayService;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/j;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MusicPlayService"

    const-string v1, "\u8bbe\u7f6e\u98de\u884c\u98de\u884c\u6a21\u5f0f"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/service/g;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "airplane_mode_on"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.AIRPLANE_MODE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "state"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
