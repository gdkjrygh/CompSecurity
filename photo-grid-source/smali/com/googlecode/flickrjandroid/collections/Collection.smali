.class public Lcom/googlecode/flickrjandroid/collections/Collection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private childCount:I

.field private final collections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/collections/Collection;",
            ">;"
        }
    .end annotation
.end field

.field private dateCreate:Ljava/util/Date;

.field private description:Ljava/lang/String;

.field private iconLarge:Ljava/lang/String;

.field private iconSmall:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private final photoSets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;",
            ">;"
        }
    .end annotation
.end field

.field private secret:Ljava/lang/String;

.field private server:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->photoSets:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->collections:Ljava/util/List;

    .line 35
    return-void
.end method


# virtual methods
.method public getChildCount()I
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->childCount:I

    return v0
.end method

.method public getCollections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/collections/Collection;",
            ">;"
        }
    .end annotation

    .prologue
    .line 118
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->collections:Ljava/util/List;

    return-object v0
.end method

.method public getDateCreate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->dateCreate:Ljava/util/Date;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getIconLarge()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->iconLarge:Ljava/lang/String;

    return-object v0
.end method

.method public getIconSmall()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->iconSmall:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;",
            ">;"
        }
    .end annotation

    .prologue
    .line 111
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->photoSets:Ljava/util/List;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->server:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setChildCount(I)V
    .locals 0

    .prologue
    .line 132
    iput p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->childCount:I

    .line 133
    return-void
.end method

.method public setDateCreate(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 150
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 151
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 152
    new-instance v2, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setDateCreate(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setDateCreate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->dateCreate:Ljava/util/Date;

    .line 147
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->description:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setIconLarge(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->iconLarge:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setIconSmall(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->iconSmall:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->id:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->secret:Ljava/lang/String;

    .line 181
    return-void
.end method

.method public setServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->server:Ljava/lang/String;

    .line 167
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/Collection;->title:Ljava/lang/String;

    .line 63
    return-void
.end method
