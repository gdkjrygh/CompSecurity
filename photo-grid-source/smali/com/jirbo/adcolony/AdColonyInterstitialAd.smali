.class public Lcom/jirbo/adcolony/AdColonyInterstitialAd;
.super Lcom/jirbo/adcolony/AdColonyAd;
.source "SourceFile"


# instance fields
.field v:Lcom/jirbo/adcolony/AdColonyAdListener;

.field w:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

.field x:Lcom/jirbo/adcolony/AdColonyNativeAdView;

.field y:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0}, Lcom/jirbo/adcolony/AdColonyAd;-><init>()V

    .line 31
    sput-boolean v1, Lcom/jirbo/adcolony/a;->u:Z

    .line 32
    invoke-static {}, Lcom/jirbo/adcolony/a;->e()V

    .line 33
    const-string v0, "interstitial"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 34
    const-string v0, "fullscreen"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 35
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->y:Z

    .line 36
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->l:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/jirbo/adcolony/AdColonyAd;-><init>()V

    .line 41
    const-string v0, "interstitial"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 42
    const-string v0, "fullscreen"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 43
    invoke-static {}, Lcom/jirbo/adcolony/a;->e()V

    .line 44
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->y:Z

    .line 46
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->l:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x1

    .line 139
    const-string v1, "interstitial"

    iput-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 140
    const-string v1, "fullscreen"

    iput-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 141
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v1, :cond_1

    .line 143
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v1, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 151
    :cond_0
    :goto_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 152
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 155
    sget-boolean v1, Lcom/jirbo/adcolony/a;->u:Z

    if-nez v1, :cond_4

    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->B:Z

    if-nez v1, :cond_4

    move v1, v0

    .line 157
    :goto_1
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 145
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->w:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    if-eqz v1, :cond_0

    .line 147
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->canceled()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->x:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v3, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->I:Z

    .line 149
    :goto_2
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->w:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->x:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-interface {v1, v3, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdListener;->onAdColonyNativeAdFinished(ZLcom/jirbo/adcolony/AdColonyNativeAdView;)V

    goto :goto_0

    .line 148
    :cond_2
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->x:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v0, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->I:Z

    goto :goto_2

    .line 158
    :cond_3
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 161
    :cond_4
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    .line 162
    sput-boolean v3, Lcom/jirbo/adcolony/a;->v:Z

    .line 163
    return-void
.end method

.method a(Z)Z
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 61
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    .line 62
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 64
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/d;->f(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method b()Z
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public isReady()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 69
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 71
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/d;->e()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    .line 72
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 80
    :goto_0
    return v0

    .line 75
    :cond_0
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-static {v1}, Lcom/jirbo/adcolony/AdColony;->isZoneNative(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 77
    const/16 v1, 0xc

    sput v1, Lcom/jirbo/adcolony/a;->ac:I

    goto :goto_0

    .line 80
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/d;->f(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public show()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 85
    sput v2, Lcom/jirbo/adcolony/a;->ac:I

    .line 86
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->y:Z

    if-eqz v0, :cond_1

    .line 88
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "Show attempt on out of date ad object. Please instantiate a new ad object for each ad attempt."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 135
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    iput-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->y:Z

    .line 92
    const-string v0, "interstitial"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 93
    const-string v0, "fullscreen"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 94
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->isReady()Z

    move-result v0

    if-nez v0, :cond_2

    .line 97
    new-instance v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-direct {v0, p0, v1}, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;-><init>(Lcom/jirbo/adcolony/AdColonyInterstitialAd;Lcom/jirbo/adcolony/d;)V

    .line 104
    const/4 v0, 0x2

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->f:I

    .line 105
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    goto :goto_0

    .line 108
    :cond_2
    sget-boolean v0, Lcom/jirbo/adcolony/a;->v:Z

    if-eqz v0, :cond_5

    .line 111
    new-instance v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-direct {v0, p0, v1}, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;-><init>(Lcom/jirbo/adcolony/AdColonyInterstitialAd;Lcom/jirbo/adcolony/d;)V

    .line 118
    sput-boolean v2, Lcom/jirbo/adcolony/a;->v:Z

    .line 119
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->c()Z

    .line 120
    sput-object p0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 122
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/d;->b(Lcom/jirbo/adcolony/AdColonyInterstitialAd;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 124
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 125
    :cond_3
    sput-boolean v3, Lcom/jirbo/adcolony/a;->v:Z

    goto :goto_0

    .line 130
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdStarted(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 134
    :cond_5
    const/4 v0, 0x4

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->f:I

    goto :goto_0
.end method

.method public withListener(Lcom/jirbo/adcolony/AdColonyAdListener;)Lcom/jirbo/adcolony/AdColonyInterstitialAd;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    .line 54
    return-object p0
.end method
