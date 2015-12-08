.class final Lcom/mopub/mraid/p;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation


# instance fields
.field final synthetic a:Lcom/mopub/mraid/MraidController;

.field private b:Landroid/content/Context;

.field private c:I


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidController;)V
    .locals 1

    .prologue
    .line 978
    iput-object p1, p0, Lcom/mopub/mraid/p;->a:Lcom/mopub/mraid/MraidController;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 982
    const/4 v0, -0x1

    iput v0, p0, Lcom/mopub/mraid/p;->c:I

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 986
    iget-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 998
    :cond_0
    :goto_0
    return-void

    .line 990
    :cond_1
    const-string v0, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 991
    iget-object v0, p0, Lcom/mopub/mraid/p;->a:Lcom/mopub/mraid/MraidController;

    invoke-static {v0}, Lcom/mopub/mraid/MraidController;->k(Lcom/mopub/mraid/MraidController;)I

    move-result v0

    .line 993
    iget v1, p0, Lcom/mopub/mraid/p;->c:I

    if-eq v0, v1, :cond_0

    .line 994
    iput v0, p0, Lcom/mopub/mraid/p;->c:I

    .line 995
    iget-object v0, p0, Lcom/mopub/mraid/p;->a:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->c()V

    goto :goto_0
.end method

.method public final register(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 1001
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 1002
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    .line 1003
    iget-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1004
    iget-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1007
    :cond_0
    return-void
.end method

.method public final unregister()V
    .locals 1

    .prologue
    .line 1010
    iget-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1011
    iget-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1012
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/p;->b:Landroid/content/Context;

    .line 1014
    :cond_0
    return-void
.end method
