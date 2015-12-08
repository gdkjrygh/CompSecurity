.class interface abstract Lcom/mopub/nativeads/ad;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract clear(Landroid/view/View;)V
.end method

.method public abstract destroy()V
.end method

.method public abstract getCallToAction()Ljava/lang/String;
.end method

.method public abstract getClickDestinationUrl()Ljava/lang/String;
.end method

.method public abstract getExtra(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract getExtras()Ljava/util/Map;
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
.end method

.method public abstract getIconImageUrl()Ljava/lang/String;
.end method

.method public abstract getImpressionMinPercentageViewed()I
.end method

.method public abstract getImpressionMinTimeViewed()I
.end method

.method public abstract getImpressionTrackers()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMainImageUrl()Ljava/lang/String;
.end method

.method public abstract getStarRating()Ljava/lang/Double;
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract handleClick(Landroid/view/View;)V
.end method

.method public abstract isOverridingClickTracker()Z
.end method

.method public abstract isOverridingImpressionTracker()Z
.end method

.method public abstract prepare(Landroid/view/View;)V
.end method

.method public abstract recordImpression()V
.end method

.method public abstract setNativeEventListener(Lcom/mopub/nativeads/c;)V
.end method
