.class Lorg/chromium/content/browser/framehost/NavigationControllerImpl;
.super Ljava/lang/Object;
.source "NavigationControllerImpl.java"

# interfaces
.implements Lorg/chromium/content_public/browser/NavigationController;


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# instance fields
.field private mNativeNavigationControllerAndroid:J


# direct methods
.method private constructor <init>(J)V
    .locals 1
    .param p1, "nativeNavigationControllerAndroid"    # J

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-wide p1, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    .line 30
    return-void
.end method

.method private static addToNavigationHistory(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p0, "history"    # Ljava/lang/Object;
    .param p1, "navigationEntry"    # Ljava/lang/Object;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 215
    check-cast p0, Lorg/chromium/content_public/browser/NavigationHistory;

    .end local p0    # "history":Ljava/lang/Object;
    check-cast p1, Lorg/chromium/content_public/browser/NavigationEntry;

    .end local p1    # "navigationEntry":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/chromium/content_public/browser/NavigationHistory;->addEntry(Lorg/chromium/content_public/browser/NavigationEntry;)V

    .line 216
    return-void
.end method

.method private static create(J)Lorg/chromium/content/browser/framehost/NavigationControllerImpl;
    .locals 2
    .param p0, "nativeNavigationControllerAndroid"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 34
    new-instance v0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;

    invoke-direct {v0, p0, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;-><init>(J)V

    return-object v0
.end method

.method private static createNavigationEntry(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lorg/chromium/content_public/browser/NavigationEntry;
    .locals 7
    .param p0, "index"    # I
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "virtualUrl"    # Ljava/lang/String;
    .param p3, "originalUrl"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;
    .param p5, "favicon"    # Landroid/graphics/Bitmap;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 221
    new-instance v0, Lorg/chromium/content_public/browser/NavigationEntry;

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lorg/chromium/content_public/browser/NavigationEntry;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method private destroy()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 39
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    .line 40
    return-void
.end method

.method private native nativeCanGoBack(J)Z
.end method

.method private native nativeCanGoForward(J)Z
.end method

.method private native nativeCanGoToOffset(JI)Z
.end method

.method private native nativeCancelPendingReload(J)V
.end method

.method private native nativeClearHistory(J)V
.end method

.method private native nativeClearSslPreferences(J)V
.end method

.method private native nativeContinuePendingReload(J)V
.end method

.method private native nativeGetDirectedNavigationHistory(JLorg/chromium/content_public/browser/NavigationHistory;ZI)V
.end method

.method private native nativeGetNavigationHistory(JLjava/lang/Object;)I
.end method

.method private native nativeGetOriginalUrlForVisibleNavigationEntry(J)Ljava/lang/String;
.end method

.method private native nativeGetPendingEntry(J)Lorg/chromium/content_public/browser/NavigationEntry;
.end method

.method private native nativeGetUseDesktopUserAgent(J)Z
.end method

.method private native nativeGoBack(J)V
.end method

.method private native nativeGoForward(J)V
.end method

.method private native nativeGoToNavigationIndex(JI)V
.end method

.method private native nativeGoToOffset(JI)V
.end method

.method private native nativeLoadIfNecessary(J)V
.end method

.method private native nativeLoadUrl(JLjava/lang/String;IILjava/lang/String;IILjava/lang/String;[BLjava/lang/String;Ljava/lang/String;ZZ)V
.end method

.method private native nativeReload(JZ)V
.end method

.method private native nativeReloadIgnoringCache(JZ)V
.end method

.method private native nativeRequestRestoreLoad(J)V
.end method

.method private native nativeSetUseDesktopUserAgent(JZZ)V
.end method


# virtual methods
.method public canGoBack()Z
    .locals 4

    .prologue
    .line 44
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeCanGoBack(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public canGoForward()Z
    .locals 4

    .prologue
    .line 50
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeCanGoForward(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public canGoToOffset(I)Z
    .locals 4
    .param p1, "offset"    # I
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 57
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeCanGoToOffset(JI)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public cancelPendingReload()V
    .locals 4

    .prologue
    .line 119
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 120
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeCancelPendingReload(J)V

    .line 122
    :cond_0
    return-void
.end method

.method public clearHistory()V
    .locals 4
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 153
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 154
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeClearHistory(J)V

    .line 156
    :cond_0
    return-void
.end method

.method public clearSslPreferences()V
    .locals 4

    .prologue
    .line 185
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 186
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeClearSslPreferences(J)V

    .line 188
    :cond_0
    return-void
.end method

.method public continuePendingReload()V
    .locals 4

    .prologue
    .line 126
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 127
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeContinuePendingReload(J)V

    .line 129
    :cond_0
    return-void
.end method

.method public getDirectedNavigationHistory(ZI)Lorg/chromium/content_public/browser/NavigationHistory;
    .locals 7
    .param p1, "isForward"    # Z
    .param p2, "itemLimit"    # I

    .prologue
    .line 170
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v4, 0x0

    .line 174
    :goto_0
    return-object v4

    .line 171
    :cond_0
    new-instance v4, Lorg/chromium/content_public/browser/NavigationHistory;

    invoke-direct {v4}, Lorg/chromium/content_public/browser/NavigationHistory;-><init>()V

    .line 172
    .local v4, "history":Lorg/chromium/content_public/browser/NavigationHistory;
    iget-wide v2, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    move-object v1, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGetDirectedNavigationHistory(JLorg/chromium/content_public/browser/NavigationHistory;ZI)V

    goto :goto_0
.end method

.method public getNavigationHistory()Lorg/chromium/content_public/browser/NavigationHistory;
    .locals 6

    .prologue
    .line 160
    iget-wide v2, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    const/4 v1, 0x0

    .line 165
    :goto_0
    return-object v1

    .line 161
    :cond_0
    new-instance v1, Lorg/chromium/content_public/browser/NavigationHistory;

    invoke-direct {v1}, Lorg/chromium/content_public/browser/NavigationHistory;-><init>()V

    .line 162
    .local v1, "history":Lorg/chromium/content_public/browser/NavigationHistory;
    iget-wide v2, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v2, v3, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGetNavigationHistory(JLjava/lang/Object;)I

    move-result v0

    .line 164
    .local v0, "currentIndex":I
    invoke-virtual {v1, v0}, Lorg/chromium/content_public/browser/NavigationHistory;->setCurrentEntryIndex(I)V

    goto :goto_0
.end method

.method public getOriginalUrlForVisibleNavigationEntry()Ljava/lang/String;
    .locals 4

    .prologue
    .line 179
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 180
    :goto_0
    return-object v0

    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGetOriginalUrlForVisibleNavigationEntry(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getPendingEntry()Lorg/chromium/content_public/browser/NavigationEntry;
    .locals 4

    .prologue
    .line 206
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 207
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGetPendingEntry(J)Lorg/chromium/content_public/browser/NavigationEntry;

    move-result-object v0

    .line 210
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getUseDesktopUserAgent()Z
    .locals 4

    .prologue
    .line 192
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 193
    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGetUseDesktopUserAgent(J)Z

    move-result v0

    goto :goto_0
.end method

.method public goBack()V
    .locals 4

    .prologue
    .line 77
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 78
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGoBack(J)V

    .line 80
    :cond_0
    return-void
.end method

.method public goForward()V
    .locals 4

    .prologue
    .line 84
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 85
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGoForward(J)V

    .line 87
    :cond_0
    return-void
.end method

.method public goToNavigationIndex(I)V
    .locals 4
    .param p1, "index"    # I

    .prologue
    .line 70
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 71
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGoToNavigationIndex(JI)V

    .line 73
    :cond_0
    return-void
.end method

.method public goToOffset(I)V
    .locals 4
    .param p1, "offset"    # I

    .prologue
    .line 63
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 64
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeGoToOffset(JI)V

    .line 66
    :cond_0
    return-void
.end method

.method public loadIfNecessary()V
    .locals 4

    .prologue
    .line 91
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 92
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeLoadIfNecessary(J)V

    .line 94
    :cond_0
    return-void
.end method

.method public loadUrl(Lorg/chromium/content_public/browser/LoadUrlParams;)V
    .locals 18
    .param p1, "params"    # Lorg/chromium/content_public/browser/LoadUrlParams;

    .prologue
    .line 133
    move-object/from16 v0, p0

    iget-wide v2, v0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 134
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getLoadUrlType()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getTransitionType()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getReferrer()Lorg/chromium/content_public/common/Referrer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getReferrer()Lorg/chromium/content_public/common/Referrer;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content_public/common/Referrer;->getUrl()Ljava/lang/String;

    move-result-object v9

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getReferrer()Lorg/chromium/content_public/common/Referrer;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getReferrer()Lorg/chromium/content_public/common/Referrer;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content_public/common/Referrer;->getPolicy()I

    move-result v10

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getUserAgentOverrideOption()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getExtraHeadersString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getPostData()[B

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getBaseUrl()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getVirtualUrlForDataUrl()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getCanLoadLocalResources()Z

    move-result v16

    invoke-virtual/range {p1 .. p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getIsRendererInitiated()Z

    move-result v17

    move-object/from16 v3, p0

    invoke-direct/range {v3 .. v17}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeLoadUrl(JLjava/lang/String;IILjava/lang/String;IILjava/lang/String;[BLjava/lang/String;Ljava/lang/String;ZZ)V

    .line 148
    :cond_0
    return-void

    .line 134
    :cond_1
    const/4 v9, 0x0

    goto :goto_0

    :cond_2
    const/4 v10, 0x0

    goto :goto_1
.end method

.method public reload(Z)V
    .locals 4
    .param p1, "checkForRepost"    # Z

    .prologue
    .line 105
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 106
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeReload(JZ)V

    .line 108
    :cond_0
    return-void
.end method

.method public reloadIgnoringCache(Z)V
    .locals 4
    .param p1, "checkForRepost"    # Z

    .prologue
    .line 112
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 113
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeReloadIgnoringCache(JZ)V

    .line 115
    :cond_0
    return-void
.end method

.method public requestRestoreLoad()V
    .locals 4

    .prologue
    .line 98
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 99
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeRequestRestoreLoad(J)V

    .line 101
    :cond_0
    return-void
.end method

.method public setUseDesktopUserAgent(ZZ)V
    .locals 4
    .param p1, "override"    # Z
    .param p2, "reloadOnChange"    # Z

    .prologue
    .line 198
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 199
    iget-wide v0, p0, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->mNativeNavigationControllerAndroid:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/chromium/content/browser/framehost/NavigationControllerImpl;->nativeSetUseDesktopUserAgent(JZZ)V

    .line 202
    :cond_0
    return-void
.end method
