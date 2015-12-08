.class public Lcom/yong/jamendo/api/JamendoMusic;
.super Ljava/lang/Object;
.source "JamendoMusic.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x7634b694e274167dL


# instance fields
.field private album_image:Ljava/lang/String;

.field private album_name:Ljava/lang/String;

.field private artistName:Ljava/lang/String;

.field private audio_link:Ljava/lang/String;

.field private duration:I

.field private id_music:I

.field private music_name:Ljava/lang/String;

.field private rating:D


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput v2, p0, Lcom/yong/jamendo/api/JamendoMusic;->id_music:I

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->music_name:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_name:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->artistName:Ljava/lang/String;

    .line 31
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->rating:D

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_image:Ljava/lang/String;

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->audio_link:Ljava/lang/String;

    .line 46
    iput v2, p0, Lcom/yong/jamendo/api/JamendoMusic;->duration:I

    .line 5
    return-void
.end method


# virtual methods
.method public getAlbum_image()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_image:Ljava/lang/String;

    return-object v0
.end method

.method public getAlbum_name()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_name:Ljava/lang/String;

    return-object v0
.end method

.method public getArtistName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->artistName:Ljava/lang/String;

    return-object v0
.end method

.method public getAudio_link()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->audio_link:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()I
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->duration:I

    return v0
.end method

.method public getId_music()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->id_music:I

    return v0
.end method

.method public getMusic_name()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->music_name:Ljava/lang/String;

    return-object v0
.end method

.method public getRating()D
    .locals 2

    .prologue
    .line 81
    iget-wide v0, p0, Lcom/yong/jamendo/api/JamendoMusic;->rating:D

    return-wide v0
.end method

.method public setAlbum_image(Ljava/lang/String;)V
    .locals 0
    .param p1, "album_image"    # Ljava/lang/String;

    .prologue
    .line 93
    iput-object p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_image:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setAlbum_name(Ljava/lang/String;)V
    .locals 0
    .param p1, "album_name"    # Ljava/lang/String;

    .prologue
    .line 69
    iput-object p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->album_name:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setArtistName(Ljava/lang/String;)V
    .locals 0
    .param p1, "artistName"    # Ljava/lang/String;

    .prologue
    .line 77
    iput-object p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->artistName:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setAudio_link(Ljava/lang/String;)V
    .locals 0
    .param p1, "audio_link"    # Ljava/lang/String;

    .prologue
    .line 101
    iput-object p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->audio_link:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setDuration(I)V
    .locals 0
    .param p1, "duration"    # I

    .prologue
    .line 109
    iput p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->duration:I

    .line 110
    return-void
.end method

.method public setId_music(I)V
    .locals 0
    .param p1, "id_music"    # I

    .prologue
    .line 53
    iput p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->id_music:I

    .line 54
    return-void
.end method

.method public setMusic_name(Ljava/lang/String;)V
    .locals 0
    .param p1, "music_name"    # Ljava/lang/String;

    .prologue
    .line 61
    iput-object p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->music_name:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setRating(D)V
    .locals 1
    .param p1, "rating"    # D

    .prologue
    .line 85
    iput-wide p1, p0, Lcom/yong/jamendo/api/JamendoMusic;->rating:D

    .line 86
    return-void
.end method
