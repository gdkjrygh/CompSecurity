.class public Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private async:Z

.field private contentType:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private familyFlag:Z

.field private friendFlag:Z

.field private hidden:Ljava/lang/Boolean;

.field private publicFlag:Z

.field private safetyLevel:Ljava/lang/String;

.field private tags:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->publicFlag:Z

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->async:Z

    .line 33
    return-void
.end method


# virtual methods
.method public getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getSafetyLevel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->safetyLevel:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->tags:Ljava/util/Collection;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public isAsync()Z
    .locals 1

    .prologue
    .line 140
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->async:Z

    return v0
.end method

.method public isFamilyFlag()Z
    .locals 1

    .prologue
    .line 76
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->familyFlag:Z

    return v0
.end method

.method public isFriendFlag()Z
    .locals 1

    .prologue
    .line 68
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->friendFlag:Z

    return v0
.end method

.method public isHidden()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->hidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public isPublicFlag()Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->publicFlag:Z

    return v0
.end method

.method public setAsync(Z)V
    .locals 0

    .prologue
    .line 151
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->async:Z

    .line 152
    return-void
.end method

.method public setContentType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->contentType:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->description:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setFamilyFlag(Z)V
    .locals 0

    .prologue
    .line 80
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->familyFlag:Z

    .line 81
    return-void
.end method

.method public setFriendFlag(Z)V
    .locals 0

    .prologue
    .line 72
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->friendFlag:Z

    .line 73
    return-void
.end method

.method public setHidden(Ljava/lang/Boolean;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->hidden:Ljava/lang/Boolean;

    .line 113
    return-void
.end method

.method public setPublicFlag(Z)V
    .locals 0

    .prologue
    .line 64
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->publicFlag:Z

    .line 65
    return-void
.end method

.method public setSafetyLevel(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->safetyLevel:Ljava/lang/String;

    .line 137
    return-void
.end method

.method public setTags(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 56
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->tags:Ljava/util/Collection;

    .line 57
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->title:Ljava/lang/String;

    .line 41
    return-void
.end method
