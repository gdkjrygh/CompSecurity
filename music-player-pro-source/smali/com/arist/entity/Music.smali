.class public Lcom/arist/entity/Music;
.super Ljava/lang/Object;
.source "Music.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private album:Ljava/lang/String;

.field private albumId:I

.field private artist:Ljava/lang/String;

.field private data:Ljava/lang/String;

.field private duration:I

.field private folderPath:Ljava/lang/String;

.field private id:I

.field private size:J

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/lang/String;
    .param p4, "size"    # J
    .param p6, "duration"    # I
    .param p7, "album"    # Ljava/lang/String;
    .param p8, "albumId"    # I
    .param p9, "artist"    # Ljava/lang/String;
    .param p10, "folderPath"    # Ljava/lang/String;

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p1, p0, Lcom/arist/entity/Music;->id:I

    .line 28
    iput-object p2, p0, Lcom/arist/entity/Music;->title:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/arist/entity/Music;->data:Ljava/lang/String;

    .line 30
    iput-wide p4, p0, Lcom/arist/entity/Music;->size:J

    .line 31
    iput p6, p0, Lcom/arist/entity/Music;->duration:I

    .line 32
    iput-object p7, p0, Lcom/arist/entity/Music;->album:Ljava/lang/String;

    .line 33
    iput p8, p0, Lcom/arist/entity/Music;->albumId:I

    .line 34
    iput-object p9, p0, Lcom/arist/entity/Music;->artist:Ljava/lang/String;

    .line 35
    iput-object p10, p0, Lcom/arist/entity/Music;->folderPath:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public getAlbum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/arist/entity/Music;->album:Ljava/lang/String;

    return-object v0
.end method

.method public getAlbumId()I
    .locals 1

    .prologue
    .line 75
    iget v0, p0, Lcom/arist/entity/Music;->albumId:I

    return v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/arist/entity/Music;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/arist/entity/Music;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/arist/entity/Music;->duration:I

    return v0
.end method

.method public getFolderPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/arist/entity/Music;->folderPath:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/arist/entity/Music;->id:I

    return v0
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 57
    iget-wide v0, p0, Lcom/arist/entity/Music;->size:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/arist/entity/Music;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0
    .param p1, "album"    # Ljava/lang/String;

    .prologue
    .line 72
    iput-object p1, p0, Lcom/arist/entity/Music;->album:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setAlbumId(I)V
    .locals 0
    .param p1, "albumId"    # I

    .prologue
    .line 78
    iput p1, p0, Lcom/arist/entity/Music;->albumId:I

    .line 79
    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0
    .param p1, "artist"    # Ljava/lang/String;

    .prologue
    .line 84
    iput-object p1, p0, Lcom/arist/entity/Music;->artist:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Ljava/lang/String;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/arist/entity/Music;->data:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setDuration(I)V
    .locals 0
    .param p1, "duration"    # I

    .prologue
    .line 66
    iput p1, p0, Lcom/arist/entity/Music;->duration:I

    .line 67
    return-void
.end method

.method public setFolderPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "folderPath"    # Ljava/lang/String;

    .prologue
    .line 90
    iput-object p1, p0, Lcom/arist/entity/Music;->folderPath:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setId(I)V
    .locals 0
    .param p1, "id"    # I

    .prologue
    .line 42
    iput p1, p0, Lcom/arist/entity/Music;->id:I

    .line 43
    return-void
.end method

.method public setSize(J)V
    .locals 1
    .param p1, "size"    # J

    .prologue
    .line 60
    iput-wide p1, p0, Lcom/arist/entity/Music;->size:J

    .line 61
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 48
    iput-object p1, p0, Lcom/arist/entity/Music;->title:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Music [id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/arist/entity/Music;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/Music;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/Music;->data:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 95
    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/arist/entity/Music;->size:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/arist/entity/Music;->duration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", album="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 96
    iget-object v1, p0, Lcom/arist/entity/Music;->album:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", albumId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/arist/entity/Music;->albumId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", artist="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/Music;->artist:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 97
    const-string v1, ", folderPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/Music;->folderPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
