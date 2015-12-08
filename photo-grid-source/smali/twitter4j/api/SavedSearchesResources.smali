.class public interface abstract Ltwitter4j/api/SavedSearchesResources;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createSavedSearch(Ljava/lang/String;)Ltwitter4j/SavedSearch;
.end method

.method public abstract destroySavedSearch(I)Ltwitter4j/SavedSearch;
.end method

.method public abstract getSavedSearches()Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/SavedSearch;",
            ">;"
        }
    .end annotation
.end method

.method public abstract showSavedSearch(I)Ltwitter4j/SavedSearch;
.end method
