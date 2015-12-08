.class final Lcom/cmcm/adsdk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/adsdk/b/d;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 108
    const-string v0, "CMCMADSDK"

    const-string v1, "request config fail,the reqeust complete"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lcom/cmcm/adsdk/b;->o()Z

    .line 110
    invoke-static {}, Lcom/cmcm/adsdk/b;->p()Z

    move-result v0

    if-nez v0, :cond_1

    .line 111
    new-instance v0, Lcom/cmcm/adsdk/d;

    invoke-direct {v0}, Lcom/cmcm/adsdk/d;-><init>()V

    invoke-static {v0}, Lcom/cmcm/adsdk/b;->a(Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;

    .line 112
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " request config onFail "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/cmcm/adsdk/b;->p()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 114
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 116
    :try_start_0
    invoke-static {}, Lcom/cmcm/adsdk/b;->q()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 117
    invoke-static {}, Lcom/cmcm/adsdk/b;->r()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :cond_0
    :goto_0
    return-void

    .line 119
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 122
    :cond_1
    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 124
    :try_start_1
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " request config onFail but not is first request "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/cmcm/adsdk/b;->p()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-static {}, Lcom/cmcm/adsdk/b;->q()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 126
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/cmcm/adsdk/b;->a(Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 128
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 136
    invoke-static {}, Lcom/cmcm/adsdk/b;->o()Z

    .line 137
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "request config onSucess "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/cmcm/adsdk/b;->p()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    invoke-static {}, Lcom/cmcm/adsdk/b;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    :try_start_0
    invoke-static {}, Lcom/cmcm/adsdk/b;->q()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 141
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/cmcm/adsdk/b;->a(Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 143
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
