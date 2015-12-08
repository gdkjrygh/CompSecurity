.class public Lcom/mopub/mobileads/MoPubView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final DEFAULT_LOCATION_PRECISION:I = 0x6


# instance fields
.field private a:Landroid/content/Context;

.field protected b:Lcom/mopub/mobileads/AdViewController;

.field protected c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

.field private d:I

.field private e:Landroid/content/BroadcastReceiver;

.field private f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

.field private g:Lcom/mopub/mobileads/MoPubView$OnAdWillLoadListener;

.field private h:Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;

.field private i:Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;

.field private j:Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;

.field private k:Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;

.field private l:Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mopub/mobileads/MoPubView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 62
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    invoke-static {p1}, Lcom/mopub/common/util/ManifestUtils;->checkWebViewActivitiesDeclared(Landroid/content/Context;)V

    .line 66
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->a:Landroid/content/Context;

    .line 67
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->getVisibility()I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/MoPubView;->d:I

    .line 69
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/MoPubView;->setHorizontalScrollBarEnabled(Z)V

    .line 70
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/MoPubView;->setVerticalScrollBarEnabled(Z)V

    .line 77
    invoke-static {p1}, Landroid/webkit/WebViewDatabase;->getInstance(Landroid/content/Context;)Landroid/webkit/WebViewDatabase;

    move-result-object v0

    if-nez v0, :cond_0

    .line 78
    const-string v0, "Disabling MoPub. Local cache file is inaccessible so MoPub will fail if we try to create a WebView. Details of this Android bug found at:http://code.google.com/p/android/issues/detail?id=10789"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 1109
    :goto_0
    return-void

    .line 84
    :cond_0
    invoke-static {p1, p0}, Lcom/mopub/mobileads/factories/AdViewControllerFactory;->create(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)Lcom/mopub/mobileads/AdViewController;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    .line 1089
    new-instance v0, Lcom/mopub/mobileads/ai;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/ai;-><init>(Lcom/mopub/mobileads/MoPubView;)V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->e:Landroid/content/BroadcastReceiver;

    .line 1105
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1106
    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1108
    :try_start_0
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubView;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/mopub/mobileads/MoPubView;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubView;)I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/mopub/mobileads/MoPubView;->d:I

    return v0
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-nez v0, :cond_0

    .line 211
    :goto_0
    return-void

    .line 206
    :cond_0
    invoke-static {p1}, Lcom/mopub/common/util/Visibility;->isScreenVisible(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->c()V

    goto :goto_0

    .line 209
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->b()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubView;I)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/MoPubView;->a(I)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_1

    .line 225
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0, p1}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerFailed(Lcom/mopub/mobileads/MoPubView;Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 229
    :cond_0
    :goto_0
    return-void

    .line 226
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->i:Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->i:Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;->OnAdFailed(Lcom/mopub/mobileads/MoPubView;)V

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-nez v0, :cond_0

    .line 176
    :goto_0
    return-void

    .line 157
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    const-string v0, "Couldn\'t invoke custom event because the server did not specify one."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 159
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/MoPubView;->b(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_2

    .line 164
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->b()V

    .line 167
    :cond_2
    const-string v0, "Loading custom event adapter."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getBroadcastIdentifier()J

    move-result-wide v4

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdReport()Lcom/mopub/common/AdReport;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/mopub/mobileads/factories/CustomEventBannerAdapterFactory;->create(Lcom/mopub/mobileads/MoPubView;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)Lcom/mopub/mobileads/CustomEventBannerAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    .line 175
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->a()V

    goto :goto_0
.end method

.method final b()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->f()Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 151
    :cond_0
    return-void
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->h()V

    .line 1248
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_1

    .line 1249
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerClicked(Lcom/mopub/mobileads/MoPubView;)V

    :cond_0
    :goto_0
    return-void

    .line 1250
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->l:Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;

    if-eqz v0, :cond_0

    .line 1251
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->l:Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;->OnAdClicked(Lcom/mopub/mobileads/MoPubView;)V

    goto :goto_0
.end method

.method public customEventActionWillBegin()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 486
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->customEventActionWillBegin()V

    .line 487
    :cond_0
    return-void
.end method

.method public customEventDidFailToLoadAd()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 481
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->customEventDidFailToLoadAd()V

    .line 482
    :cond_0
    return-void
.end method

.method public customEventDidLoadAd()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 476
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->customEventDidLoadAd()V

    .line 477
    :cond_0
    return-void
.end method

.method protected final d()V
    .locals 1

    .prologue
    .line 188
    const-string v0, "Tracking impression for native adapter."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 189
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->g()V

    .line 190
    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 131
    .line 1114
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubView;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->removeAllViews()V

    .line 134
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->e()V

    .line 136
    iput-object v2, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->b()V

    .line 141
    iput-object v2, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    .line 143
    :cond_1
    return-void

    .line 1116
    :catch_0
    move-exception v0

    const-string v0, "Failed to unregister screen state broadcast receiver (never registered)."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final e()V
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerExpanded(Lcom/mopub/mobileads/MoPubView;)V

    .line 237
    :cond_0
    :goto_0
    return-void

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->j:Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->j:Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;->OnAdPresentedOverlay(Lcom/mopub/mobileads/MoPubView;)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerCollapsed(Lcom/mopub/mobileads/MoPubView;)V

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 242
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->k:Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->k:Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;->OnAdClosed(Lcom/mopub/mobileads/MoPubView;)V

    goto :goto_0
.end method

.method public forceRefresh()V
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventBannerAdapter;->b()V

    .line 374
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubView;->c:Lcom/mopub/mobileads/CustomEventBannerAdapter;

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->i()V

    .line 378
    :cond_1
    return-void
.end method

.method protected final g()V
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->j()V

    .line 2214
    :cond_0
    const-string v0, "adLoaded"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 2216
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    if-eqz v0, :cond_2

    .line 2217
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$BannerAdListener;->onBannerLoaded(Lcom/mopub/mobileads/MoPubView;)V

    :cond_1
    :goto_0
    return-void

    .line 2218
    :cond_2
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->h:Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;

    if-eqz v0, :cond_1

    .line 2219
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->h:Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;->OnAdLoaded(Lcom/mopub/mobileads/MoPubView;)V

    goto :goto_0
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public getAdFormat()Lcom/mopub/common/AdFormat;
    .locals 1

    .prologue
    .line 385
    sget-object v0, Lcom/mopub/common/AdFormat;->BANNER:Lcom/mopub/common/AdFormat;

    return-object v0
.end method

.method public getAdHeight()I
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdHeight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdWidth()I
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAdWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAutorefreshEnabled()Z
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getAutorefreshEnabled()Z

    move-result v0

    .line 350
    :goto_0
    return v0

    .line 348
    :cond_0
    const-string v0, "Can\'t get autorefresh status for destroyed MoPubView. Returning false."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 350
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getBannerAdListener()Lcom/mopub/mobileads/MoPubView$BannerAdListener;
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    return-object v0
.end method

.method public getClickTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getClickthroughUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 313
    invoke-virtual {p0}, Lcom/mopub/mobileads/MoPubView;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getKeywords()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getLocalExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 333
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->k()Ljava/util/Map;

    move-result-object v0

    .line 336
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getLocation()Landroid/location/Location;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getLocationAwareness()Lcom/mopub/common/LocationService$LocationAwareness;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 395
    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/LocationService$LocationAwareness;->fromMoPubLocationAwareness(Lcom/mopub/common/MoPub$LocationAwareness;)Lcom/mopub/common/LocationService$LocationAwareness;

    move-result-object v0

    return-object v0
.end method

.method public getLocationPrecision()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 405
    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationPrecision()I

    move-result v0

    return v0
.end method

.method public getResponseString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getResponseString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getTesting()Z
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getTesting()Z

    move-result v0

    .line 367
    :goto_0
    return v0

    .line 365
    :cond_0
    const-string v0, "Can\'t get testing status for destroyed MoPubView. Returning false."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 367
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isFacebookSupported()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 500
    const/4 v0, 0x0

    return v0
.end method

.method public loadAd()V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->loadAd()V

    .line 124
    :cond_0
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    .prologue
    .line 195
    iget v0, p0, Lcom/mopub/mobileads/MoPubView;->d:I

    invoke-static {v0, p1}, Lcom/mopub/common/util/Visibility;->hasScreenVisibilityChanged(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iput p1, p0, Lcom/mopub/mobileads/MoPubView;->d:I

    .line 197
    iget v0, p0, Lcom/mopub/mobileads/MoPubView;->d:I

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/MoPubView;->a(I)V

    .line 199
    :cond_0
    return-void
.end method

.method public setAdContentView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Landroid/view/View;)V

    .line 356
    :cond_0
    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setAdUnitId(Ljava/lang/String;)V

    .line 264
    :cond_0
    return-void
.end method

.method public setAutorefreshEnabled(Z)V
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Z)V

    .line 343
    :cond_0
    return-void
.end method

.method public setBannerAdListener(Lcom/mopub/mobileads/MoPubView$BannerAdListener;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->f:Lcom/mopub/mobileads/MoPubView$BannerAdListener;

    .line 322
    return-void
.end method

.method public setClickthroughUrl(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 305
    return-void
.end method

.method public setFacebookSupported(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 493
    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setKeywords(Ljava/lang/String;)V

    .line 272
    :cond_0
    return-void
.end method

.method public setLocalExtras(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 329
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->a(Ljava/util/Map;)V

    .line 330
    :cond_0
    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setLocation(Landroid/location/Location;)V

    .line 280
    :cond_0
    return-void
.end method

.method public setLocationAwareness(Lcom/mopub/common/LocationService$LocationAwareness;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 390
    invoke-virtual {p1}, Lcom/mopub/common/LocationService$LocationAwareness;->getNewLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/MoPub;->setLocationAwareness(Lcom/mopub/common/MoPub$LocationAwareness;)V

    .line 391
    return-void
.end method

.method public setLocationPrecision(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 400
    invoke-static {p1}, Lcom/mopub/common/MoPub;->setLocationPrecision(I)V

    .line 401
    return-void
.end method

.method public setOnAdClickedListener(Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 465
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->l:Lcom/mopub/mobileads/MoPubView$OnAdClickedListener;

    .line 466
    return-void
.end method

.method public setOnAdClosedListener(Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 460
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->k:Lcom/mopub/mobileads/MoPubView$OnAdClosedListener;

    .line 461
    return-void
.end method

.method public setOnAdFailedListener(Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 450
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->i:Lcom/mopub/mobileads/MoPubView$OnAdFailedListener;

    .line 451
    return-void
.end method

.method public setOnAdLoadedListener(Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 445
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->h:Lcom/mopub/mobileads/MoPubView$OnAdLoadedListener;

    .line 446
    return-void
.end method

.method public setOnAdPresentedOverlayListener(Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 455
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->j:Lcom/mopub/mobileads/MoPubView$OnAdPresentedOverlayListener;

    .line 456
    return-void
.end method

.method public setOnAdWillLoadListener(Lcom/mopub/mobileads/MoPubView$OnAdWillLoadListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 440
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubView;->g:Lcom/mopub/mobileads/MoPubView$OnAdWillLoadListener;

    .line 441
    return-void
.end method

.method public setTesting(Z)V
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setTesting(Z)V

    .line 360
    :cond_0
    return-void
.end method

.method public setTimeout(I)V
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubView;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdViewController;->setTimeout(I)V

    .line 288
    :cond_0
    return-void
.end method
