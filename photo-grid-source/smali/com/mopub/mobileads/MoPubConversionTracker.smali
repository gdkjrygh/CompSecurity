.class public Lcom/mopub/mobileads/MoPubConversionTracker;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/SharedPreferences;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->c:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public reportAppOpen(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 22
    if-nez p1, :cond_0

    .line 48
    :goto_0
    return-void

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->a:Landroid/content/Context;

    .line 27
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->d:Ljava/lang/String;

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " tracked"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->b:Ljava/lang/String;

    .line 29
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/SharedPreferencesHelper;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->c:Landroid/content/SharedPreferences;

    .line 1051
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->c:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    new-instance v0, Lcom/mopub/mobileads/v;

    invoke-direct {v0, p0, v2}, Lcom/mopub/mobileads/v;-><init>(Lcom/mopub/mobileads/MoPubConversionTracker;B)V

    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/v;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->a:Landroid/content/Context;

    new-instance v2, Lcom/mopub/mobileads/u;

    invoke-direct {v2, p0}, Lcom/mopub/mobileads/u;-><init>(Lcom/mopub/mobileads/MoPubConversionTracker;)V

    invoke-static {v0, v1, v2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;)V

    goto :goto_0

    .line 46
    :cond_1
    const-string v0, "Conversion already tracked"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method
