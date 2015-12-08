.class public interface abstract Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getAvailableAssetNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCustomTemplateId()Ljava/lang/String;
.end method

.method public abstract getImage(Ljava/lang/String;)Lcom/google/android/gms/ads/formats/NativeAd$Image;
.end method

.method public abstract getText(Ljava/lang/String;)Ljava/lang/CharSequence;
.end method

.method public abstract performClick(Ljava/lang/String;)V
.end method

.method public abstract recordImpression()V
.end method
