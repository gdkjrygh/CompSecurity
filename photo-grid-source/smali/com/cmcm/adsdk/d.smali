.class final Lcom/cmcm/adsdk/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 84
    invoke-static {p1}, Lcom/cmcm/adsdk/c/c;->a(Landroid/content/Context;)Z

    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 88
    invoke-static {}, Lcom/cmcm/adsdk/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Lcom/cmcm/adsdk/b/e/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    :cond_0
    const-string v0, "CMCMADSDK"

    const-string v1, "isSDKWork  is false or cacheJson is null "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 92
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/cmcm/adsdk/b;->l()Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 93
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/cmcm/adsdk/b;->a(Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :cond_1
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 99
    :cond_2
    invoke-static {}, Lcom/cmcm/adsdk/b;->n()Lcom/cmcm/adsdk/b/a;

    move-result-object v0

    invoke-static {}, Lcom/cmcm/adsdk/b;->m()Lcom/cmcm/adsdk/b/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/d;)V

    goto :goto_0
.end method
