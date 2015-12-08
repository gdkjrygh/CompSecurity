.class final Lcom/mopub/mobileads/v;
.super Lcom/mopub/common/BaseUrlGenerator;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/MoPubConversionTracker;


# direct methods
.method private constructor <init>(Lcom/mopub/mobileads/MoPubConversionTracker;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/mopub/mobileads/v;->a:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-direct {p0}, Lcom/mopub/common/BaseUrlGenerator;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/mobileads/MoPubConversionTracker;B)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/v;-><init>(Lcom/mopub/mobileads/MoPubConversionTracker;)V

    return-void
.end method


# virtual methods
.method public final generateUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 57
    const-string v0, "/m/open"

    invoke-virtual {p0, p1, v0}, Lcom/mopub/mobileads/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "6"

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/v;->b(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/mopub/mobileads/v;->a:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubConversionTracker;->c(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;

    move-result-object v0

    .line 1067
    const-string v1, "id"

    invoke-virtual {p0, v1, v0}, Lcom/mopub/mobileads/v;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/mopub/mobileads/v;->a:Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubConversionTracker;->d(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/v;->c(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0}, Lcom/mopub/mobileads/v;->c()V

    .line 63
    invoke-virtual {p0}, Lcom/mopub/mobileads/v;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
