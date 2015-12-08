.class Lcom/mopub/mraid/MraidInterstitial;
.super Lcom/mopub/mobileads/ResponseBodyInterstitial;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/mopub/mobileads/ResponseBodyInterstitial;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V
    .locals 2

    .prologue
    .line 24
    iget-object v0, p0, Lcom/mopub/mraid/MraidInterstitial;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mraid/MraidInterstitial;->d:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/mopub/mobileads/MraidActivity;->preRenderHtml(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/lang/String;)V

    .line 25
    return-void
.end method

.method protected final a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 18
    const-string v0, "Html-Response-Body"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/mraid/MraidInterstitial;->d:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public showInterstitial()V
    .locals 6

    .prologue
    .line 29
    iget-object v0, p0, Lcom/mopub/mraid/MraidInterstitial;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mraid/MraidInterstitial;->b:Lcom/mopub/common/AdReport;

    iget-object v2, p0, Lcom/mopub/mraid/MraidInterstitial;->d:Ljava/lang/String;

    iget-wide v4, p0, Lcom/mopub/mraid/MraidInterstitial;->c:J

    invoke-static {v0, v1, v2, v4, v5}, Lcom/mopub/mobileads/MraidActivity;->start(Landroid/content/Context;Lcom/mopub/common/AdReport;Ljava/lang/String;J)V

    .line 30
    return-void
.end method
