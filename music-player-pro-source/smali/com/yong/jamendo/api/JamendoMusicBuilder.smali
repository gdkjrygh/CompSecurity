.class public Lcom/yong/jamendo/api/JamendoMusicBuilder;
.super Ljava/lang/Object;
.source "JamendoMusicBuilder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Lorg/json/JSONObject;)Lcom/yong/jamendo/api/JamendoMusic;
    .locals 2
    .param p1, "jsonObject"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 12
    new-instance v0, Lcom/yong/jamendo/api/JamendoMusic;

    invoke-direct {v0}, Lcom/yong/jamendo/api/JamendoMusic;-><init>()V

    .line 14
    .local v0, "jamendoMp3":Lcom/yong/jamendo/api/JamendoMusic;
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setId_music(I)V

    .line 15
    const-string v1, "duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setDuration(I)V

    .line 16
    const-string v1, "artist_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setArtistName(Ljava/lang/String;)V

    .line 17
    const-string v1, "album_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setAlbum_name(Ljava/lang/String;)V

    .line 18
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setMusic_name(Ljava/lang/String;)V

    .line 19
    const-string v1, "album_image"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setAlbum_image(Ljava/lang/String;)V

    .line 20
    const-string v1, "audio"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yong/jamendo/api/JamendoMusic;->setAudio_link(Ljava/lang/String;)V

    .line 27
    return-object v0
.end method
