.class final Lcom/mobvista/sdk/m/core/j;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 868
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/j;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 872
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "LAODING_SHOW"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/j;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 873
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/j;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    .line 879
    :cond_0
    :goto_0
    return-void

    .line 874
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "LAODING_DISMISSS"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/j;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 876
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/j;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    goto :goto_0
.end method
