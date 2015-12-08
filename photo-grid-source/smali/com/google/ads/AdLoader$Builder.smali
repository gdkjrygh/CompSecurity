.class public Lcom/google/ads/AdLoader$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/ads/AdListener;

.field private b:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

.field private c:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

.field private final d:Landroid/content/Context;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/google/ads/AdLoader$Builder;->d:Landroid/content/Context;

    .line 57
    iput-object p2, p0, Lcom/google/ads/AdLoader$Builder;->e:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method public build()Lcom/google/ads/AdLoader;
    .locals 8

    .prologue
    .line 88
    new-instance v0, Lcom/google/ads/AdLoader;

    iget-object v1, p0, Lcom/google/ads/AdLoader$Builder;->d:Landroid/content/Context;

    new-instance v2, Lcom/google/ads/h;

    invoke-direct {v2}, Lcom/google/ads/h;-><init>()V

    new-instance v3, Lcom/google/ads/b;

    invoke-direct {v3}, Lcom/google/ads/b;-><init>()V

    iget-object v4, p0, Lcom/google/ads/AdLoader$Builder;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/ads/AdLoader$Builder;->a:Lcom/google/android/gms/ads/AdListener;

    iget-object v6, p0, Lcom/google/ads/AdLoader$Builder;->b:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    iget-object v7, p0, Lcom/google/ads/AdLoader$Builder;->c:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    invoke-direct/range {v0 .. v7}, Lcom/google/ads/AdLoader;-><init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/ads/b;Ljava/lang/String;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;)V

    return-object v0
.end method

.method public forAppInstallAd(Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;)Lcom/google/ads/AdLoader$Builder;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/google/ads/AdLoader$Builder;->b:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    .line 73
    return-object p0
.end method

.method public forContentAd(Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;)Lcom/google/ads/AdLoader$Builder;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/google/ads/AdLoader$Builder;->c:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    .line 65
    return-object p0
.end method

.method public withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/ads/AdLoader$Builder;
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/google/ads/AdLoader$Builder;->a:Lcom/google/android/gms/ads/AdListener;

    .line 81
    return-object p0
.end method
