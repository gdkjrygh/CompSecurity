.class public Lcom/googlecode/flickrjandroid/photosets/Photoset;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private description:Ljava/lang/String;

.field private farm:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private owner:Lcom/googlecode/flickrjandroid/people/User;

.field private photoCount:I

.field private photoList:Lcom/googlecode/flickrjandroid/photos/PhotoList;

.field private primaryPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

.field private secret:Ljava/lang/String;

.field private server:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 163
    if-ne p0, p1, :cond_1

    .line 175
    :cond_0
    :goto_0
    return v0

    .line 165
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 166
    goto :goto_0

    .line 167
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 168
    goto :goto_0

    .line 169
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/photosets/Photoset;

    .line 170
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 171
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    .line 172
    goto :goto_0

    .line 173
    :cond_4
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 174
    goto :goto_0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getFarm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->farm:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Lcom/googlecode/flickrjandroid/people/User;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->owner:Lcom/googlecode/flickrjandroid/people/User;

    return-object v0
.end method

.method public getPhotoCount()I
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->photoCount:I

    return v0
.end method

.method public getPhotoList()Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->photoList:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    return-object v0
.end method

.method public getPrimaryPhoto()Lcom/googlecode/flickrjandroid/photos/Photo;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->primaryPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->server:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 48
    const-string v1, "https://www.flickr.com/photos/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 49
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->getOwner()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    const-string v1, "/sets/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 51
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->url:Ljava/lang/String;

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 155
    return v0

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->description:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public setFarm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->farm:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->id:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setOwner(Lcom/googlecode/flickrjandroid/people/User;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->owner:Lcom/googlecode/flickrjandroid/people/User;

    .line 69
    return-void
.end method

.method public setPhotoCount(I)V
    .locals 0

    .prologue
    .line 108
    iput p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->photoCount:I

    .line 109
    return-void
.end method

.method public setPhotoCount(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 112
    if-eqz p1, :cond_0

    .line 113
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPhotoCount(I)V

    .line 115
    :cond_0
    return-void
.end method

.method public setPhotoList(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->photoList:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    .line 145
    return-void
.end method

.method public setPrimaryPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->primaryPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 77
    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->secret:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->server:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->title:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photoset;->url:Ljava/lang/String;

    .line 61
    return-void
.end method
