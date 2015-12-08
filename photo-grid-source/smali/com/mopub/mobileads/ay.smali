.class final Lcom/mopub/mobileads/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/VastVideoViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastVideoViewController;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mopub/mobileads/VastVideoViewController;->a(Landroid/media/MediaPlayer;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    const/4 v0, 0x1

    .line 482
    :goto_0
    return v0

    .line 478
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->n(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 479
    iget-object v0, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->i(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 480
    iget-object v0, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/VastVideoViewController;->h()V

    .line 481
    iget-object v0, p0, Lcom/mopub/mobileads/ay;->a:Lcom/mopub/mobileads/VastVideoViewController;

    invoke-static {v0}, Lcom/mopub/mobileads/VastVideoViewController;->u(Lcom/mopub/mobileads/VastVideoViewController;)Z

    .line 482
    const/4 v0, 0x0

    goto :goto_0
.end method
