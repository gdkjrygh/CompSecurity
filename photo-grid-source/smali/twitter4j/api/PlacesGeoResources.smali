.class public interface abstract Ltwitter4j/api/PlacesGeoResources;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createPlace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltwitter4j/GeoLocation;Ljava/lang/String;)Ltwitter4j/Place;
.end method

.method public abstract getGeoDetails(Ljava/lang/String;)Ltwitter4j/Place;
.end method

.method public abstract getSimilarPlaces(Ltwitter4j/GeoLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/SimilarPlaces;
.end method

.method public abstract reverseGeoCode(Ltwitter4j/GeoQuery;)Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/GeoQuery;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Place;",
            ">;"
        }
    .end annotation
.end method

.method public abstract searchPlaces(Ltwitter4j/GeoQuery;)Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/GeoQuery;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Place;",
            ">;"
        }
    .end annotation
.end method
