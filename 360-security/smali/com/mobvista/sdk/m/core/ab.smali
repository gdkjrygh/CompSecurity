.class final Lcom/mobvista/sdk/m/core/ab;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)V
    .locals 0

    .prologue
    .line 401
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 405
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 406
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    const-string/jumbo v0, "ORDER"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 412
    const-string/jumbo v1, "REFRESH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 413
    const-string/jumbo v0, "WHICH"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 415
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;I)V

    .line 447
    :cond_0
    :goto_0
    return-void

    .line 416
    :cond_1
    const-string/jumbo v1, "INSTALL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 418
    const-string/jumbo v0, "CAMPAIGN"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 420
    if-eqz v0, :cond_0

    .line 421
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/core/ac;->a(Z)V

    .line 422
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/core/ac;->b(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    goto :goto_0

    .line 424
    :cond_2
    const-string/jumbo v1, "CLICK_CANCEL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 426
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/ac;->b()V

    goto :goto_0

    .line 427
    :cond_3
    const-string/jumbo v1, "UNREGIST"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    const-string/jumbo v0, "UNREGIST_KEY"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 430
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->e(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    const-string/jumbo v0, ""

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "mAdWallReceiver 3 = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v3}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->e(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/util/HashMap;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 434
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->e(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 436
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->e(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/ab;->a:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->release()V

    goto/16 :goto_0
.end method
