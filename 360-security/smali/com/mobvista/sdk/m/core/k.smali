.class final Lcom/mobvista/sdk/m/core/k;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 839
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    .line 843
    const-string/jumbo v0, "ORDER"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 844
    const-string/jumbo v1, "RESULT"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 845
    const-string/jumbo v2, "NUM"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 846
    const-string/jumbo v3, "MV_TOP_FINISH"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 847
    const-string/jumbo v0, "LOADED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v2, :cond_1

    .line 848
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 865
    :cond_0
    :goto_0
    return-void

    .line 851
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    goto :goto_0

    .line 852
    :cond_2
    const-string/jumbo v3, "MV_GAME_FINISH"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 853
    const-string/jumbo v0, "LOADED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez v2, :cond_3

    .line 854
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 857
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    goto :goto_0

    .line 858
    :cond_4
    const-string/jumbo v3, "MV_UTILITY_FINISH"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    const-string/jumbo v0, "LOADED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-nez v2, :cond_5

    .line 860
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 863
    :cond_5
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/k;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    goto :goto_0
.end method
