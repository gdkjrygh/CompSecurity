.class final Lcom/mopub/mobileads/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mraid/MraidController$MraidListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/MraidActivity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MraidActivity;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClose()V
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-static {v0}, Lcom/mopub/mobileads/MraidActivity;->a(Lcom/mopub/mobileads/MraidActivity;)Lcom/mopub/mraid/MraidController;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/n;->WEB_VIEW_DID_CLOSE:Lcom/mopub/mobileads/n;

    invoke-virtual {v1}, Lcom/mopub/mobileads/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->loadJavascript(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MraidActivity;->finish()V

    .line 124
    return-void
.end method

.method public final onExpand()V
    .locals 0

    .prologue
    .line 129
    return-void
.end method

.method public final onFailedToLoad()V
    .locals 4

    .prologue
    .line 115
    const-string v0, "MraidActivity failed to load. Finishing the activity"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    iget-object v1, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MraidActivity;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-string v1, "com.mopub.action.interstitial.fail"

    invoke-static {v0, v2, v3, v1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MraidActivity;->finish()V

    .line 119
    return-void
.end method

.method public final onLoaded(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-static {v0}, Lcom/mopub/mobileads/MraidActivity;->a(Lcom/mopub/mobileads/MraidActivity;)Lcom/mopub/mraid/MraidController;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/n;->WEB_VIEW_DID_APPEAR:Lcom/mopub/mobileads/n;

    invoke-virtual {v1}, Lcom/mopub/mobileads/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->loadJavascript(Ljava/lang/String;)V

    .line 111
    return-void
.end method

.method public final onOpen()V
    .locals 4

    .prologue
    .line 133
    iget-object v0, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    iget-object v1, p0, Lcom/mopub/mobileads/aj;->a:Lcom/mopub/mobileads/MraidActivity;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MraidActivity;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-string v1, "com.mopub.action.interstitial.click"

    invoke-static {v0, v2, v3, v1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 135
    return-void
.end method
