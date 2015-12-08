.class final Lcom/mopub/mobileads/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/widget/VideoView;

.field final synthetic c:Lcom/mopub/mobileads/VastVideoViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;Landroid/content/Context;Landroid/widget/VideoView;)V
    .locals 0

    .prologue
    .line 448
    iput-object p1, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/ax;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/mopub/mobileads/ax;->b:Landroid/widget/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 451
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->n(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 452
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->i(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 454
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/VastVideoViewController;->a(Z)V

    .line 455
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->o(Lcom/mopub/mobileads/VastVideoViewController;)Z

    .line 459
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->p(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->q(Lcom/mopub/mobileads/VastVideoViewController;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->r(Lcom/mopub/mobileads/VastVideoViewController;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 460
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->b(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getCompleteTrackers()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/ax;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;)V

    .line 461
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->s(Lcom/mopub/mobileads/VastVideoViewController;)Z

    .line 464
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->b:Landroid/widget/VideoView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVisibility(I)V

    .line 466
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->t(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 467
    iget-object v0, p0, Lcom/mopub/mobileads/ax;->c:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->t(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 469
    :cond_1
    return-void
.end method
