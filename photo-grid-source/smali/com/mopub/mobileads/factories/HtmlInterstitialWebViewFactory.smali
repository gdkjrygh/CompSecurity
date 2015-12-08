.class public Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static a:Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;

    invoke-direct {v0}, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;->a:Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Context;Lcom/mopub/common/AdReport;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;ZLjava/lang/String;Ljava/lang/String;)Lcom/mopub/mobileads/HtmlInterstitialWebView;
    .locals 7

    .prologue
    .line 20
    sget-object v0, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;->a:Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;->internalCreate(Landroid/content/Context;Lcom/mopub/common/AdReport;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;ZLjava/lang/String;Ljava/lang/String;)Lcom/mopub/mobileads/HtmlInterstitialWebView;

    move-result-object v0

    return-object v0
.end method

.method public static setInstance(Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 37
    sput-object p0, Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;->a:Lcom/mopub/mobileads/factories/HtmlInterstitialWebViewFactory;

    .line 38
    return-void
.end method


# virtual methods
.method public internalCreate(Landroid/content/Context;Lcom/mopub/common/AdReport;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;ZLjava/lang/String;Ljava/lang/String;)Lcom/mopub/mobileads/HtmlInterstitialWebView;
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/mopub/mobileads/HtmlInterstitialWebView;

    invoke-direct {v0, p1, p2}, Lcom/mopub/mobileads/HtmlInterstitialWebView;-><init>(Landroid/content/Context;Lcom/mopub/common/AdReport;)V

    .line 31
    invoke-virtual {v0, p3, p4, p5, p6}, Lcom/mopub/mobileads/HtmlInterstitialWebView;->init(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;ZLjava/lang/String;Ljava/lang/String;)V

    .line 32
    return-object v0
.end method
