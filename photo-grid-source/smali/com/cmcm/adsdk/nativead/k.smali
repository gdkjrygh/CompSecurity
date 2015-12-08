.class public final Lcom/cmcm/adsdk/nativead/k;
.super Lcom/cmcm/adsdk/nativead/d;
.source "SourceFile"


# instance fields
.field private c:Lcom/facebook/ads/NativeAd;

.field private final d:I

.field private final e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/ads/NativeAd;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/d;-><init>()V

    .line 25
    const/16 v0, 0xbb8

    iput v0, p0, Lcom/cmcm/adsdk/nativead/k;->d:I

    .line 26
    const-string v0, "com.facebook.ad"

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->e:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    .line 34
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/k;->f:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/cmcm/adsdk/nativead/k;->g:Ljava/lang/String;

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/k;->h:J

    .line 37
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 115
    if-nez p1, :cond_0

    .line 133
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    new-instance v1, Lcom/cmcm/adsdk/nativead/l;

    invoke-direct {v1, p0}, Lcom/cmcm/adsdk/nativead/l;-><init>(Lcom/cmcm/adsdk/nativead/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ads/NativeAd;->setImpressionListener(Lcom/facebook/ads/ImpressionListener;)V

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/NativeAd;->registerViewForInteraction(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 131
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    const-string v0, "fb"

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->getAdTitle()Ljava/lang/String;

    move-result-object v0

    .line 44
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->getAdCoverImage()Lcom/facebook/ads/NativeAd$Image;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd$Image;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 52
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->getAdIcon()Lcom/facebook/ads/NativeAd$Image;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd$Image;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 65
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->getAdCallToAction()Ljava/lang/String;

    move-result-object v0

    .line 86
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->getAdBody()Ljava/lang/String;

    move-result-object v0

    .line 94
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 164
    invoke-static {}, Lcom/cmcm/adsdk/a;->g()J

    move-result-wide v2

    .line 165
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_2

    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/cmcm/adsdk/nativead/k;->h:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x36ee80

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    .line 168
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 166
    goto :goto_0

    .line 168
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/cmcm/adsdk/nativead/k;->h:J

    sub-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 175
    const/4 v0, 0x1

    return v0
.end method

.method public final k()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 138
    const-string v0, "CMFBNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FaceBook handleImpressionAdtitle:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/k;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/k;->c:Lcom/facebook/ads/NativeAd;

    invoke-static {v6, v0}, Lcom/cmcm/adsdk/c/b;->a(ILcom/facebook/ads/NativeAd;)Ljava/lang/String;

    move-result-object v2

    .line 140
    const-string v0, "CMFBNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "raw :"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/k;->a:Z

    if-nez v0, :cond_0

    .line 142
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/k;->g:Ljava/lang/String;

    const-string v3, "com.facebook.ad"

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/k;->f:Ljava/lang/String;

    const/16 v5, 0xbb8

    invoke-virtual/range {v0 .. v5}, Lcom/picksinit/b;->doFaceBookViewReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 143
    iput-boolean v6, p0, Lcom/cmcm/adsdk/nativead/k;->a:Z

    .line 150
    :cond_0
    return-void
.end method
