.class public final Lcom/cmcm/adsdk/nativead/j;
.super Lcom/cmcm/adsdk/nativead/d;
.source "SourceFile"


# instance fields
.field private final c:J

.field private d:Lcom/google/android/gms/ads/formats/NativeAd;

.field private e:Landroid/view/View;

.field private f:J

.field private g:Lcom/cmcm/adsdk/nativead/h;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/NativeAd;Ljava/lang/String;Lcom/cmcm/adsdk/nativead/h;)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/d;-><init>()V

    .line 21
    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/j;->c:J

    .line 31
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    .line 32
    iput-object p2, p0, Lcom/cmcm/adsdk/nativead/j;->h:Ljava/lang/String;

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/j;->f:J

    .line 34
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/j;->g:Lcom/cmcm/adsdk/nativead/h;

    .line 35
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 170
    const-string v0, "AdmobNativeAd"

    const-string v1, "admob registerView"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/j;->e:Landroid/view/View;

    .line 1161
    const-string v0, "AdmobNativeAd"

    const-string v1, "admob report impression"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1162
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/j;->a:Z

    if-nez v0, :cond_0

    .line 1163
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.admob.native"

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/j;->h:Ljava/lang/String;

    const/16 v3, 0xbba

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdViewReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 1164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/j;->a:Z

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->e:Landroid/view/View;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeContentAdView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    if-eqz v0, :cond_2

    .line 177
    const-string v0, "AdmobNativeAd"

    const-string v1, "registerViewForInteraction NativeContentAdView"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->e:Landroid/view/View;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeContentAdView;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeContentAdView;->setNativeAd(Lcom/google/android/gms/ads/formats/NativeAd;)V

    .line 183
    :cond_1
    :goto_0
    return-void

    .line 179
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->e:Landroid/view/View;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAdView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    if-eqz v0, :cond_1

    .line 180
    const-string v0, "AdmobNativeAd"

    const-string v1, "registerViewForInteraction NativeAppInstallAdView"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->e:Landroid/view/View;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAdView;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/NativeAppInstallAdView;->setNativeAd(Lcom/google/android/gms/ads/formats/NativeAd;)V

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    const-string v0, "ab"

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    .line 48
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;->getHeadline()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 54
    :goto_0
    return-object v0

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeContentAd;->getHeadline()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    .line 117
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;->getCallToAction()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 123
    :goto_0
    return-object v0

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    .line 120
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeContentAd;->getCallToAction()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 123
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;

    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeAppInstallAd;->getBody()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    :goto_0
    return-object v0

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    instance-of v0, v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/j;->d:Lcom/google/android/gms/ads/formats/NativeAd;

    check-cast v0, Lcom/google/android/gms/ads/formats/NativeContentAd;

    .line 134
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/NativeContentAd;->getBody()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 137
    :cond_1
    const-string v0, ""

    goto :goto_0
.end method

.method public final i()Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 196
    invoke-static {}, Lcom/cmcm/adsdk/a;->i()J

    move-result-wide v2

    .line 197
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_2

    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/cmcm/adsdk/nativead/j;->f:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x36ee80

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    .line 200
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 198
    goto :goto_0

    .line 200
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/cmcm/adsdk/nativead/j;->f:J

    sub-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 206
    const/4 v0, 0x0

    return v0
.end method
