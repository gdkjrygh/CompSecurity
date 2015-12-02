.class final Lcom/mobvista/sdk/m/core/w;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/loader/g;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;I)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    iput p2, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 96
    check-cast p1, Ljava/util/List;

    .line 97
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 98
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 99
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->isPreClick()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 100
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Z)V

    goto :goto_0

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 128
    :goto_1
    return-void

    .line 109
    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_LOAD_DATA"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    if-nez v1, :cond_4

    .line 112
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_TOP_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    :cond_3
    :goto_2
    const-string/jumbo v1, "RESULT"

    const-string/jumbo v2, "LOADED"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    const-string/jumbo v1, "NUM"

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 127
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_1

    .line 115
    :cond_4
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 116
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_GAME_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 119
    :cond_5
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 120
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_UTILITY_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 132
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 156
    :goto_0
    return-void

    .line 136
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_LOAD_DATA"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    if-nez v1, :cond_2

    .line 139
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_TOP_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    :cond_1
    :goto_1
    const-string/jumbo v1, "RESULT"

    const-string/jumbo v2, "ERROR"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    const-string/jumbo v1, "MSG"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 142
    :cond_2
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 143
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_GAME_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 146
    :cond_3
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 147
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_UTILITY_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 166
    check-cast p1, Ljava/util/List;

    .line 167
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 168
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 169
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->isPreClick()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 170
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Z)V

    goto :goto_0

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 199
    :goto_1
    return-void

    .line 179
    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_LOAD_DATA"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    if-nez v1, :cond_4

    .line 182
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_TOP_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    :cond_3
    :goto_2
    const-string/jumbo v1, "RESULT"

    const-string/jumbo v2, "LOADED"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    const-string/jumbo v1, "NUM"

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 197
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/w;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_1

    .line 185
    :cond_4
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 186
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_GAME_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 189
    :cond_5
    iget v1, p0, Lcom/mobvista/sdk/m/core/w;->a:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 190
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "MV_UTILITY_FINISH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2
.end method
