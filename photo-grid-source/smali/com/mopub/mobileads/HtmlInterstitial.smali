.class public Lcom/mopub/mobileads/HtmlInterstitial;
.super Lcom/mopub/mobileads/ResponseBodyInterstitial;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/mopub/common/CreativeOrientation;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/mopub/mobileads/ResponseBodyInterstitial;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V
    .locals 3

    .prologue
    .line 34
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/HtmlInterstitial;->b:Lcom/mopub/common/AdReport;

    iget-object v2, p0, Lcom/mopub/mobileads/HtmlInterstitial;->d:Ljava/lang/String;

    invoke-static {v0, v1, p1, v2}, Lcom/mopub/mobileads/MoPubActivity;->a(Landroid/content/Context;Lcom/mopub/common/AdReport;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/lang/String;)V

    .line 35
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
    .line 25
    const-string v0, "Html-Response-Body"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->d:Ljava/lang/String;

    .line 26
    const-string v0, "Scrollable"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->e:Z

    .line 27
    const-string v0, "Redirect-Url"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->f:Ljava/lang/String;

    .line 28
    const-string v0, "Clickthrough-Url"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->g:Ljava/lang/String;

    .line 29
    const-string v0, "com_mopub_orientation"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/common/CreativeOrientation;->fromHeader(Ljava/lang/String;)Lcom/mopub/common/CreativeOrientation;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlInterstitial;->h:Lcom/mopub/common/CreativeOrientation;

    .line 30
    return-void
.end method

.method public showInterstitial()V
    .locals 10

    .prologue
    .line 39
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlInterstitial;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/mopub/mobileads/HtmlInterstitial;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/mopub/mobileads/HtmlInterstitial;->b:Lcom/mopub/common/AdReport;

    iget-boolean v4, p0, Lcom/mopub/mobileads/HtmlInterstitial;->e:Z

    iget-object v5, p0, Lcom/mopub/mobileads/HtmlInterstitial;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/mopub/mobileads/HtmlInterstitial;->g:Ljava/lang/String;

    iget-object v7, p0, Lcom/mopub/mobileads/HtmlInterstitial;->h:Lcom/mopub/common/CreativeOrientation;

    iget-wide v8, p0, Lcom/mopub/mobileads/HtmlInterstitial;->c:J

    invoke-static/range {v1 .. v9}, Lcom/mopub/mobileads/MoPubActivity;->start(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/common/AdReport;ZLjava/lang/String;Ljava/lang/String;Lcom/mopub/common/CreativeOrientation;J)V

    .line 42
    return-void
.end method
