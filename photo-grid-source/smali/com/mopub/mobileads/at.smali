.class final Lcom/mopub/mobileads/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/VastVideoViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/mopub/mobileads/at;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 237
    iget-object v0, p0, Lcom/mopub/mobileads/at;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->c(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/mopub/mobileads/at;->a:Lcom/mopub/mobileads/VastVideoViewController;

    iget-object v1, p0, Lcom/mopub/mobileads/at;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v1}, Lcom/mopub/mobileads/VastVideoViewController;->c(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastCompanionAd;->getClickTrackers()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/mobileads/at;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v2}, Lcom/mopub/mobileads/VastVideoViewController;->c(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mopub/mobileads/util/vast/VastCompanionAd;->getClickThroughUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/VastVideoViewController;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 243
    :cond_0
    return-void
.end method
