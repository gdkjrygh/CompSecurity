.class public interface abstract Ltwitter4j/api/TweetsResources;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract destroyStatus(J)Ltwitter4j/Status;
.end method

.method public abstract getOEmbed(Ltwitter4j/OEmbedRequest;)Ltwitter4j/OEmbed;
.end method

.method public abstract getRetweeterIds(JIJ)Ltwitter4j/IDs;
.end method

.method public abstract getRetweeterIds(JJ)Ltwitter4j/IDs;
.end method

.method public abstract getRetweets(J)Ltwitter4j/ResponseList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract retweetStatus(J)Ltwitter4j/Status;
.end method

.method public abstract showStatus(J)Ltwitter4j/Status;
.end method

.method public abstract updateStatus(Ljava/lang/String;)Ltwitter4j/Status;
.end method

.method public abstract updateStatus(Ltwitter4j/StatusUpdate;)Ltwitter4j/Status;
.end method
