.class final Lcom/cmcm/adsdk/b/f;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/b/e;


# direct methods
.method private constructor <init>(Lcom/cmcm/adsdk/b/e;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/cmcm/adsdk/b/f;->a:Lcom/cmcm/adsdk/b/e;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/cmcm/adsdk/b/e;B)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/b/f;-><init>(Lcom/cmcm/adsdk/b/e;)V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 106
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.cmcm.adsdk.ConfigMonitor_Action"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "ConfigChangeMonitor"

    const-string v1, "monitor requestConfig..."

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/cmcm/adsdk/b/f;->a:Lcom/cmcm/adsdk/b/e;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/e;->b(Lcom/cmcm/adsdk/b/e;)Lcom/cmcm/adsdk/b/d/a;

    move-result-object v1

    invoke-static {}, Lcom/cmcm/adsdk/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "http://unconf.mobad.ijinshan.com/b/"

    :goto_0
    iget-object v2, p0, Lcom/cmcm/adsdk/b/f;->a:Lcom/cmcm/adsdk/b/e;

    invoke-static {v2}, Lcom/cmcm/adsdk/b/e;->a(Lcom/cmcm/adsdk/b/e;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cmcm/adsdk/b/e/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/cmcm/adsdk/b/f;->a:Lcom/cmcm/adsdk/b/e;

    invoke-static {v3}, Lcom/cmcm/adsdk/b/e;->a(Lcom/cmcm/adsdk/b/e;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/cmcm/adsdk/b/a;->a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/cmcm/adsdk/b/d/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/cmcm/adsdk/b/d/b;)V

    .line 111
    :cond_0
    return-void

    .line 108
    :cond_1
    const-string v0, "http://unconf.adkmob.com/b/"

    goto :goto_0
.end method
