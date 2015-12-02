.class Lcom/facebook/orca/broadcast/d;
.super Lcom/facebook/widget/titlebar/b;
.source "BroadcastActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 447
    iput-object p1, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {p0}, Lcom/facebook/widget/titlebar/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/titlebar/d;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 450
    invoke-virtual {p1}, Lcom/facebook/widget/titlebar/d;->a()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 466
    :goto_0
    return-void

    .line 453
    :pswitch_0
    iget-object v2, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v2}, Lcom/facebook/orca/broadcast/BroadcastActivity;->c(Lcom/facebook/orca/broadcast/BroadcastActivity;)Lcom/facebook/orca/broadcast/i;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    if-ne v2, v3, :cond_0

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 454
    iget-object v0, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->d(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    goto :goto_0

    :cond_0
    move v0, v1

    .line 453
    goto :goto_1

    .line 458
    :pswitch_1
    iget-object v2, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v2}, Lcom/facebook/orca/broadcast/BroadcastActivity;->c(Lcom/facebook/orca/broadcast/BroadcastActivity;)Lcom/facebook/orca/broadcast/i;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    if-ne v2, v3, :cond_1

    :goto_2
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 460
    iget-object v0, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->e(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    .line 463
    iget-object v0, p0, Lcom/facebook/orca/broadcast/d;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->onBackPressed()V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 458
    goto :goto_2

    .line 450
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
