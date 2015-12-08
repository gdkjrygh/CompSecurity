.class public interface abstract Lcom/yong/jamendo/api/JamendoGet2Api;
.super Ljava/lang/Object;
.source "JamendoGet2Api.java"


# static fields
.field public static final ENCODING_MP3:Ljava/lang/String; = "mp31"

.field public static final ENCODING_OGG:Ljava/lang/String; = "ogg2"


# virtual methods
.method public abstract searchForTracksByTag(Ljava/lang/String;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/yong/jamendo/api/WSError;
        }
    .end annotation
.end method
