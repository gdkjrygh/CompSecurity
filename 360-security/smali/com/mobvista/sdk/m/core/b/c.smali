.class final Lcom/mobvista/sdk/m/core/b/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field final synthetic b:Lcom/mobvista/sdk/m/core/b/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/b/a;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/b/c;->b:Lcom/mobvista/sdk/m/core/b/a;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/b/c;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/b/c;->b:Lcom/mobvista/sdk/m/core/b/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/b/a;->a(Lcom/mobvista/sdk/m/core/b/a;)Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/b/c;->a:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    .line 181
    return-void
.end method
