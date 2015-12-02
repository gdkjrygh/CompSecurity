.class Lcom/facebook/zero/d/b;
.super Lcom/facebook/base/broadcast/q;
.source "ZeroTokenManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/zero/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/zero/d/a;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/zero/d/b;->a:Lcom/facebook/zero/d/a;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 132
    const-string v0, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/facebook/zero/d/b;->a:Lcom/facebook/zero/d/a;

    invoke-virtual {v0}, Lcom/facebook/zero/d/a;->c()V

    .line 135
    :cond_0
    return-void
.end method
