.class public Lcom/arist/entity/BaiduMp3;
.super Ljava/lang/Object;
.source "BaiduMp3.java"


# instance fields
.field private album:Ljava/lang/String;

.field private albumPath:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private lrc:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "artist"    # Ljava/lang/String;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "lrc"    # Ljava/lang/String;
    .param p5, "album"    # Ljava/lang/String;
    .param p6, "albumPath"    # Ljava/lang/String;

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->name:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lcom/arist/entity/BaiduMp3;->artist:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/arist/entity/BaiduMp3;->url:Ljava/lang/String;

    .line 55
    iput-object p4, p0, Lcom/arist/entity/BaiduMp3;->lrc:Ljava/lang/String;

    .line 56
    iput-object p5, p0, Lcom/arist/entity/BaiduMp3;->album:Ljava/lang/String;

    .line 57
    iput-object p6, p0, Lcom/arist/entity/BaiduMp3;->albumPath:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method public getAlbum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->album:Ljava/lang/String;

    return-object v0
.end method

.method public getAlbumPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->albumPath:Ljava/lang/String;

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public getLrc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->lrc:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/arist/entity/BaiduMp3;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0
    .param p1, "album"    # Ljava/lang/String;

    .prologue
    .line 40
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->album:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setAlbumPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "albumPath"    # Ljava/lang/String;

    .prologue
    .line 46
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->albumPath:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0
    .param p1, "artist"    # Ljava/lang/String;

    .prologue
    .line 22
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->artist:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public setLrc(Ljava/lang/String;)V
    .locals 0
    .param p1, "lrc"    # Ljava/lang/String;

    .prologue
    .line 34
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->lrc:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 16
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->name:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 28
    iput-object p1, p0, Lcom/arist/entity/BaiduMp3;->url:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[name:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",artist:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->artist:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 66
    const-string v1, ",url:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",lrc:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->lrc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 67
    const-string v1, ",album:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->album:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",albumPath:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/entity/BaiduMp3;->albumPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
