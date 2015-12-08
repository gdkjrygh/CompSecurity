.class public abstract Lcom/mopub/mobileads/BaseVideoViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/widget/RelativeLayout;

.field private final c:Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

.field private d:Ljava/lang/Long;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/Long;Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->a:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/mopub/mobileads/BaseVideoViewController;->d:Ljava/lang/Long;

    .line 35
    iput-object p3, p0, Lcom/mopub/mobileads/BaseVideoViewController;->c:Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    .line 36
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mopub/mobileads/BaseVideoViewController;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->b:Landroid/widget/RelativeLayout;

    .line 37
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    .line 40
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 42
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 43
    iget-object v1, p0, Lcom/mopub/mobileads/BaseVideoViewController;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/mopub/mobileads/BaseVideoViewController;->b()Landroid/widget/VideoView;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 44
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->c:Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    iget-object v1, p0, Lcom/mopub/mobileads/BaseVideoViewController;->b:Landroid/widget/RelativeLayout;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onSetContentView(Landroid/view/View;)V

    .line 45
    return-void
.end method

.method a(II)V
    .locals 0

    .prologue
    .line 58
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 87
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->d:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/BaseVideoViewController;->d:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v2, v3, p1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 92
    :goto_0
    return-void

    .line 90
    :cond_0
    const-string v0, "Tried to broadcast a video event without a braodcast identifier to send to."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a(Z)V
    .locals 1

    .prologue
    .line 81
    if-eqz p1, :cond_0

    .line 82
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->c:Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onFinish()V

    .line 84
    :cond_0
    return-void
.end method

.method protected abstract b()Landroid/widget/VideoView;
.end method

.method public backButtonEnabled()Z
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract c()V
.end method

.method protected abstract d()V
.end method

.method protected abstract e()V
.end method

.method protected final f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->c:Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    return-object v0
.end method

.method protected final g()Landroid/content/Context;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->a:Landroid/content/Context;

    return-object v0
.end method

.method public getLayout()Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/mopub/mobileads/BaseVideoViewController;->b:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method protected final h()V
    .locals 1

    .prologue
    .line 73
    const-string v0, "Video cannot be played."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 74
    const-string v0, "com.mopub.action.interstitial.fail"

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseVideoViewController;->a(Ljava/lang/String;)V

    .line 78
    return-void
.end method
