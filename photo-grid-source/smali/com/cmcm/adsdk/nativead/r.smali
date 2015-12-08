.class final Lcom/cmcm/adsdk/nativead/r;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/n;


# direct methods
.method private constructor <init>(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/cmcm/adsdk/nativead/n;B)V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/r;-><init>(Lcom/cmcm/adsdk/nativead/n;)V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 182
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 184
    const-string v0, "CMPicksNativeAd"

    const-string v1, "screen on"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "this ad has report show?:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-boolean v2, v2, Lcom/cmcm/adsdk/nativead/n;->a:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    iget-boolean v0, v0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    if-nez v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->a(Lcom/cmcm/adsdk/nativead/n;)V

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 189
    :cond_1
    const-string v0, "CMPicksNativeAd"

    const-string v1, "this ad has report to unregsiter screen receiver"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->b(Lcom/cmcm/adsdk/nativead/n;)V

    goto :goto_0

    .line 192
    :cond_2
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 194
    const-string v0, "CMPicksNativeAd"

    const-string v1, "screen off"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/r;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->c(Lcom/cmcm/adsdk/nativead/n;)V

    goto :goto_0

    .line 196
    :cond_3
    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    const-string v0, "CMPicksNativeAd"

    const-string v1, "screen present"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
