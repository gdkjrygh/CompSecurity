.class public Lcom/mopub/nativeads/NativeResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/mopub/volley/toolbox/ImageLoader;

.field private c:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

.field private final d:Lcom/mopub/nativeads/ad;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/nativeads/ad;Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;)V
    .locals 2

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->a:Landroid/content/Context;

    .line 106
    iput-object p4, p0, Lcom/mopub/nativeads/NativeResponse;->g:Ljava/lang/String;

    .line 107
    iput-object p6, p0, Lcom/mopub/nativeads/NativeResponse;->c:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    .line 108
    iput-object p5, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    .line 109
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    new-instance v1, Lcom/mopub/nativeads/ak;

    invoke-direct {v1, p0}, Lcom/mopub/nativeads/ak;-><init>(Lcom/mopub/nativeads/NativeResponse;)V

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/ad;->setNativeEventListener(Lcom/mopub/nativeads/c;)V

    .line 121
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->e:Ljava/util/Set;

    .line 122
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->e:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    iput-object p3, p0, Lcom/mopub/nativeads/NativeResponse;->f:Ljava/lang/String;

    .line 124
    invoke-static {p1}, Lcom/mopub/network/Networking;->getImageLoader(Landroid/content/Context;)Lcom/mopub/volley/toolbox/ImageLoader;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->b:Lcom/mopub/volley/toolbox/ImageLoader;

    .line 125
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 366
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 368
    check-cast p1, Landroid/view/ViewGroup;

    .line 369
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 370
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/mopub/nativeads/NativeResponse;->a(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 369
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 372
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 321
    if-nez p2, :cond_0

    .line 345
    :goto_0
    return-void

    .line 325
    :cond_0
    if-nez p1, :cond_1

    .line 326
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->b:Lcom/mopub/volley/toolbox/ImageLoader;

    new-instance v1, Lcom/mopub/nativeads/al;

    invoke-direct {v1, p0, p2}, Lcom/mopub/nativeads/al;-><init>(Lcom/mopub/nativeads/NativeResponse;Landroid/widget/ImageView;)V

    invoke-virtual {v0, p1, v1}, Lcom/mopub/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    goto :goto_0
.end method


# virtual methods
.method public clear(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 275
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mopub/nativeads/NativeResponse;->a(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 277
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/ad;->clear(Landroid/view/View;)V

    .line 278
    return-void
.end method

.method public destroy()V
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    :goto_0
    return-void

    .line 285
    :cond_0
    sget-object v0, Lcom/mopub/nativeads/MoPubNative;->b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    iput-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->c:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    .line 287
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->destroy()V

    .line 288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/NativeResponse;->j:Z

    goto :goto_0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getCallToAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getClickDestinationUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getClickDestinationUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getClickTracker()Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getExtra(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/ad;->getExtra(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getExtras()Ljava/util/Map;
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
    .line 217
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getExtras()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImpressionMinPercentageViewed()I
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getImpressionMinPercentageViewed()I

    move-result v0

    return v0
.end method

.method public getImpressionMinTimeViewed()I
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getImpressionMinTimeViewed()I

    move-result v0

    return v0
.end method

.method public getImpressionTrackers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 185
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 186
    iget-object v1, p0, Lcom/mopub/nativeads/NativeResponse;->e:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 187
    iget-object v1, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v1}, Lcom/mopub/nativeads/ad;->getImpressionTrackers()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 188
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public getMainImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getMainImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRecordedImpression()Z
    .locals 1

    .prologue
    .line 308
    iget-boolean v0, p0, Lcom/mopub/nativeads/NativeResponse;->h:Z

    return v0
.end method

.method public getStarRating()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getStarRating()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 385
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public handleClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 258
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    :goto_0
    return-void

    .line 262
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isClicked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 263
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/mopub/nativeads/NativeResponse;->a:Landroid/content/Context;

    sget-object v2, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, v1, v2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 1348
    :cond_1
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getClickDestinationUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1352
    const/4 v0, 0x0

    .line 1353
    if-eqz p1, :cond_2

    .line 1354
    new-instance v0, Lcom/mopub/nativeads/aw;

    iget-object v1, p0, Lcom/mopub/nativeads/NativeResponse;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/mopub/nativeads/aw;-><init>(Landroid/content/Context;)V

    .line 1355
    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aw;->a(Landroid/view/View;)Z

    .line 1358
    :cond_2
    new-array v1, v4, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getClickDestinationUrl()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1359
    new-instance v2, Lcom/mopub/nativeads/d;

    iget-object v3, p0, Lcom/mopub/nativeads/NativeResponse;->a:Landroid/content/Context;

    invoke-direct {v2, v3, v1, v0}, Lcom/mopub/nativeads/d;-><init>(Landroid/content/Context;Ljava/util/Iterator;Lcom/mopub/nativeads/aw;)V

    .line 1361
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/mopub/nativeads/ay;->getResolvedUrl(Ljava/lang/String;Lcom/mopub/nativeads/az;)V

    .line 268
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/ad;->handleClick(Landroid/view/View;)V

    .line 269
    iput-boolean v4, p0, Lcom/mopub/nativeads/NativeResponse;->i:Z

    .line 271
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->c:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;->onNativeClick(Landroid/view/View;)V

    goto :goto_0
.end method

.method public isClicked()Z
    .locals 1

    .prologue
    .line 312
    iget-boolean v0, p0, Lcom/mopub/nativeads/NativeResponse;->i:Z

    return v0
.end method

.method public isDestroyed()Z
    .locals 1

    .prologue
    .line 316
    iget-boolean v0, p0, Lcom/mopub/nativeads/NativeResponse;->j:Z

    return v0
.end method

.method public isOverridingClickTracker()Z
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->isOverridingClickTracker()Z

    move-result v0

    return v0
.end method

.method public isOverridingImpressionTracker()Z
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->isOverridingImpressionTracker()Z

    move-result v0

    return v0
.end method

.method public loadExtrasImage(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 301
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/NativeResponse;->getExtra(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 302
    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 303
    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Lcom/mopub/nativeads/NativeResponse;->a(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 305
    :cond_0
    return-void
.end method

.method public loadIconImage(Landroid/widget/ImageView;)V
    .locals 1

    .prologue
    .line 297
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/mopub/nativeads/NativeResponse;->a(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 298
    return-void
.end method

.method public loadMainImage(Landroid/widget/ImageView;)V
    .locals 1

    .prologue
    .line 293
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getMainImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/mopub/nativeads/NativeResponse;->a(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 294
    return-void
.end method

.method public prepare(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    :goto_0
    return-void

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isOverridingClickTracker()Z

    move-result v0

    if-nez v0, :cond_1

    .line 235
    new-instance v0, Lcom/mopub/nativeads/am;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/am;-><init>(Lcom/mopub/nativeads/NativeResponse;)V

    invoke-direct {p0, p1, v0}, Lcom/mopub/nativeads/NativeResponse;->a(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 238
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/ad;->prepare(Landroid/view/View;)V

    goto :goto_0
.end method

.method public recordImpression(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 242
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getRecordedImpression()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    :cond_0
    :goto_0
    return-void

    .line 246
    :cond_1
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getImpressionTrackers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 247
    iget-object v2, p0, Lcom/mopub/nativeads/NativeResponse;->a:Landroid/content/Context;

    sget-object v3, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, v2, v3}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    goto :goto_1

    .line 251
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->d:Lcom/mopub/nativeads/ad;

    invoke-interface {v0}, Lcom/mopub/nativeads/ad;->recordImpression()V

    .line 252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/NativeResponse;->h:Z

    .line 254
    iget-object v0, p0, Lcom/mopub/nativeads/NativeResponse;->c:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;->onNativeImpression(Landroid/view/View;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    sget-object v1, Lcom/mopub/nativeads/an;->TITLE:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    sget-object v1, Lcom/mopub/nativeads/an;->TEXT:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    sget-object v1, Lcom/mopub/nativeads/an;->ICON_IMAGE:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getIconImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    sget-object v1, Lcom/mopub/nativeads/an;->MAIN_IMAGE:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getMainImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    sget-object v1, Lcom/mopub/nativeads/an;->STAR_RATING:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getStarRating()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    sget-object v1, Lcom/mopub/nativeads/an;->IMPRESSION_TRACKER:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getImpressionTrackers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    sget-object v1, Lcom/mopub/nativeads/an;->CLICK_TRACKER:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/nativeads/NativeResponse;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    sget-object v1, Lcom/mopub/nativeads/an;->CLICK_DESTINATION:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getClickDestinationUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    sget-object v1, Lcom/mopub/nativeads/an;->CALL_TO_ACTION:Lcom/mopub/nativeads/an;

    iget-object v1, v1, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getCallToAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v1, "recordedImpression:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/mopub/nativeads/NativeResponse;->h:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    const-string v1, "extras:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeResponse;->getExtras()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
