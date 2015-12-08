.class public Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final METHOD_GET_INFO:Ljava/lang/String; = "flickr.collections.getInfo"

.field private static final METHOD_GET_TREE:Ljava/lang/String; = "flickr.collections.getTree"


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

    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->apiKey:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->sharedSecret:Ljava/lang/String;

    .line 38
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 39
    return-void
.end method

.method private createCollection(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/collections/Collection;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 133
    new-instance v2, Lcom/googlecode/flickrjandroid/collections/Collection;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/collections/Collection;-><init>()V

    .line 134
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/collections/Collection;->setId(Ljava/lang/String;)V

    .line 135
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/collections/Collection;->setTitle(Ljava/lang/String;)V

    .line 136
    const-string v1, "description"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/collections/Collection;->setDescription(Ljava/lang/String;)V

    .line 138
    const-string v1, "set"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    move v1, v0

    .line 139
    :goto_0
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v1, v4, :cond_2

    .line 148
    :cond_0
    const-string v1, "collection"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 149
    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_3

    .line 153
    :cond_1
    return-object v2

    .line 140
    :cond_2
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 141
    new-instance v5, Lcom/googlecode/flickrjandroid/photosets/Photoset;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/photosets/Photoset;-><init>()V

    .line 142
    const-string v6, "id"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setId(Ljava/lang/String;)V

    .line 143
    const-string v6, "title"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setTitle(Ljava/lang/String;)V

    .line 144
    const-string v6, "description"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setDescription(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->getPhotoSets()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 150
    :cond_3
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 151
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->getCollections()Ljava/util/List;

    move-result-object v4

    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->createCollection(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/collections/Collection;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public getInfo(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/collections/Collection;
    .locals 4

    .prologue
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.collections.getInfo"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "collection_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 56
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 57
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 60
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "collection"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 61
    new-instance v1, Lcom/googlecode/flickrjandroid/collections/Collection;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/collections/Collection;-><init>()V

    .line 62
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setId(Ljava/lang/String;)V

    .line 63
    const-string v2, "title"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setTitle(Ljava/lang/String;)V

    .line 64
    const-string v2, "description"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setDescription(Ljava/lang/String;)V

    .line 65
    const-string v2, "child_count"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setChildCount(I)V

    .line 66
    const-string v2, "iconlarge"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setIconLarge(Ljava/lang/String;)V

    .line 67
    const-string v2, "iconsmall"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setIconSmall(Ljava/lang/String;)V

    .line 68
    const-string v2, "server"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/collections/Collection;->setServer(Ljava/lang/String;)V

    .line 69
    const-string v2, "secret"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/collections/Collection;->setSecret(Ljava/lang/String;)V

    .line 86
    return-object v1
.end method

.method public getTree(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/collections/Collection;",
            ">;"
        }
    .end annotation

    .prologue
    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.collections.getTree"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    :goto_0
    if-eqz p1, :cond_0

    .line 108
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "collection_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_0
    if-eqz p2, :cond_1

    .line 111
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "user_id"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_1
    if-eqz v1, :cond_2

    .line 115
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 118
    :cond_2
    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 119
    :goto_1
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 120
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 105
    :cond_3
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 118
    :cond_4
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    goto :goto_1

    .line 122
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "collections"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 124
    const-string v2, "collection"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 125
    const/4 v0, 0x0

    :goto_2
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_7

    .line 129
    :cond_6
    return-object v1

    .line 126
    :cond_7
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 127
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;->createCollection(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/collections/Collection;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method
