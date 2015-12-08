.class public interface abstract Ltwitter4j/api/HelpResources;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAPIConfiguration()Ltwitter4j/TwitterAPIConfiguration;
.end method

.method public abstract getLanguages()Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/api/HelpResources$Language;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPrivacyPolicy()Ljava/lang/String;
.end method

.method public abstract getRateLimitStatus()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ltwitter4j/RateLimitStatus;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract getRateLimitStatus([Ljava/lang/String;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ltwitter4j/RateLimitStatus;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTermsOfService()Ljava/lang/String;
.end method
