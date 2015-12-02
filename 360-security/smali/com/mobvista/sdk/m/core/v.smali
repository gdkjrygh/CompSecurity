.class final Lcom/mobvista/sdk/m/core/v;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V
    .locals 0

    .prologue
    .line 278
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/v;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 281
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/v;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/ac;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/v;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/v;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Lcom/mobvista/sdk/m/core/AdListener;)V

    .line 282
    return-void
.end method
