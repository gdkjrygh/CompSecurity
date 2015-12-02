.class final Lcom/mobvista/sdk/m/core/d;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/a/a;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 364
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 2

    .prologue
    .line 354
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0, p1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Lcom/mobvista/sdk/m/core/entity/Campaign;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    .line 355
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setType(I)V

    .line 356
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/d;->a:Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/core/entity/Campaign;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 359
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 348
    const-string/jumbo v0, "Ad"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "fb failed by "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    return-void
.end method
