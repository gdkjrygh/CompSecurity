.class final Lcom/mopub/mobileads/ai;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/MoPubView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubView;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/mopub/mobileads/ai;->a:Lcom/mopub/mobileads/MoPubView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/mopub/mobileads/ai;->a:Lcom/mopub/mobileads/MoPubView;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubView;->a(Lcom/mopub/mobileads/MoPubView;)I

    move-result v0

    invoke-static {v0}, Lcom/mopub/common/util/Visibility;->isScreenVisible(I)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 95
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 97
    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 98
    iget-object v0, p0, Lcom/mopub/mobileads/ai;->a:Lcom/mopub/mobileads/MoPubView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/mobileads/MoPubView;->a(Lcom/mopub/mobileads/MoPubView;I)V

    goto :goto_0

    .line 99
    :cond_2
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/mopub/mobileads/ai;->a:Lcom/mopub/mobileads/MoPubView;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/mopub/mobileads/MoPubView;->a(Lcom/mopub/mobileads/MoPubView;I)V

    goto :goto_0
.end method
