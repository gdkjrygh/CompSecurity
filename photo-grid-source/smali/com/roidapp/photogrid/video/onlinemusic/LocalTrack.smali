.class public Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public filePath:Ljava/lang/String;

.field public track:Lcom/roidapp/photogrid/video/onlinemusic/Track;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/video/onlinemusic/Track;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    .line 11
    iput-object p2, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 12
    return-void
.end method


# virtual methods
.method public getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    return-object v0
.end method

.method public getTrackPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    return-object v0
.end method
