.class public interface abstract Ltwitter4j/MediaEntity;
.super Ljava/lang/Object;
.source "MediaEntity.java"

# interfaces
.implements Ltwitter4j/URLEntity;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltwitter4j/MediaEntity$Size;
    }
.end annotation


# virtual methods
.method public abstract getId()J
.end method

.method public abstract getMediaURL()Ljava/net/URL;
.end method

.method public abstract getMediaURLHttps()Ljava/net/URL;
.end method

.method public abstract getSizes()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ltwitter4j/MediaEntity$Size;",
            ">;"
        }
    .end annotation
.end method
