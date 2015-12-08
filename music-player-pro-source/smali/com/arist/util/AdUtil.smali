.class public Lcom/arist/util/AdUtil;
.super Ljava/lang/Object;
.source "AdUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static showAD(Landroid/app/Activity;)V
    .locals 4
    .param p0, "act"    # Landroid/app/Activity;

    .prologue
    .line 17
    new-instance v2, Lcom/google/android/gms/ads/AdView;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    .line 18
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    const-string v3, "ca-app-pub-4949699850115085/3011788458"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    .line 19
    sget-object v3, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 20
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 24
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    const v3, 0x7f0d0029

    invoke-virtual {p0, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/LinearLayout;

    .line 25
    .local v0, "adContainer":Landroid/widget/LinearLayout;
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 26
    new-instance v3, Lcom/arist/util/AdUtil$1;

    invoke-direct {v3, v0}, Lcom/arist/util/AdUtil$1;-><init>(Landroid/widget/LinearLayout;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 33
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 34
    return-void
.end method
