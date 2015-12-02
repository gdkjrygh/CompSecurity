.class Lcom/facebook/orca/chatheads/bj;
.super Lcom/facebook/base/broadcast/q;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 515
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bj;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 518
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 519
    const-string v1, "com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bj;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/content/Intent;)V

    .line 522
    :cond_0
    return-void
.end method
