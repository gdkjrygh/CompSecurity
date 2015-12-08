.class public interface abstract Ltwitter4j/api/TrendsResources;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAvailableTrends()Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Location;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAvailableTrends(Ltwitter4j/GeoLocation;)Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/GeoLocation;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Location;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getClosestTrends(Ltwitter4j/GeoLocation;)Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/GeoLocation;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Location;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLocationTrends(I)Ltwitter4j/Trends;
.end method

.method public abstract getPlaceTrends(I)Ltwitter4j/Trends;
.end method
