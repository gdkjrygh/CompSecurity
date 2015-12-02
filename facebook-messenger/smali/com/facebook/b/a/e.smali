.class Lcom/facebook/b/a/e;
.super Landroid/content/BroadcastReceiver;
.source "ChatHeadsBroadcaster.java"


# instance fields
.field final synthetic a:Lcom/google/common/d/a/ab;

.field final synthetic b:Lcom/facebook/b/a/b;


# direct methods
.method constructor <init>(Lcom/facebook/b/a/b;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/b/a/e;->b:Lcom/facebook/b/a/b;

    iput-object p2, p0, Lcom/facebook/b/a/e;->a:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 186
    iget-object v1, p0, Lcom/facebook/b/a/e;->a:Lcom/google/common/d/a/ab;

    invoke-virtual {p0}, Lcom/facebook/b/a/e;->getResultCode()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 187
    return-void

    .line 186
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
