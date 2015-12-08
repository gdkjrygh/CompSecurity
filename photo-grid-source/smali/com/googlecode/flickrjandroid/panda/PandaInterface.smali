.class public Lcom/googlecode/flickrjandroid/panda/PandaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final METHOD_GET_LIST:Ljava/lang/String; = "flickr.panda.getList"

.field private static final METHOD_GET_PHOTOS:Ljava/lang/String; = "flickr.panda.getPhotos"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->apiKey:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->sharedSecret:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 43
    return-void
.end method


# virtual methods
.method public getList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/panda/Panda;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.panda.getList"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 64
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 65
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 67
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "pandas"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 68
    const-string v2, "panda"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 69
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 75
    :cond_1
    return-object v1

    .line 70
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 71
    new-instance v4, Lcom/googlecode/flickrjandroid/panda/Panda;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/panda/Panda;-><init>()V

    .line 72
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/panda/Panda;->setName(Ljava/lang/String;)V

    .line 73
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getPhotos(Lcom/googlecode/flickrjandroid/panda/Panda;Ljava/util/Set;II)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/flickrjandroid/panda/Panda;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;II)",
            "Lcom/googlecode/flickrjandroid/photos/PhotoList;"
        }
    .end annotation

    .prologue
    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.panda.getPhotos"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "panda_name"

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/panda/Panda;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 102
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "extras"

    const-string v3, ","

    invoke-static {p2, v3}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_0
    if-lez p3, :cond_1

    .line 105
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "per_page"

    int-to-long v4, p3

    invoke-direct {v1, v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    :cond_1
    if-lez p4, :cond_2

    .line 108
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "page"

    int-to-long v4, p4

    invoke-direct {v1, v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_2
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 112
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 113
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 115
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhotoList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method
