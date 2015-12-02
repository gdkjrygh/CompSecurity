.class Lcom/facebook/zero/ui/f;
.super Lcom/facebook/base/broadcast/q;
.source "CarrierBottomBannerController.java"


# instance fields
.field final synthetic a:Lcom/facebook/zero/ui/d;


# direct methods
.method constructor <init>(Lcom/facebook/zero/ui/d;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/zero/ui/f;->a:Lcom/facebook/zero/ui/d;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 91
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.facebook.orca.ZERO_RATING_STATE_CHANGED"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/ui/f;->a:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->c()V

    .line 95
    :cond_1
    return-void
.end method
