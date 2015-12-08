.class public Lcom/googlecode/flickrjandroid/tags/TagsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_GET_CLUSTERS:Ljava/lang/String; = "flickr.tags.getClusters"

.field public static final METHOD_GET_CLUSTER_PHOTOS:Ljava/lang/String; = "flickr.tags.getClusterPhotos"

.field public static final METHOD_GET_HOT_LIST:Ljava/lang/String; = "flickr.tags.getHotList"

.field public static final METHOD_GET_LIST_PHOTO:Ljava/lang/String; = "flickr.tags.getListPhoto"

.field public static final METHOD_GET_LIST_USER:Ljava/lang/String; = "flickr.tags.getListUser"

.field public static final METHOD_GET_LIST_USER_POPULAR:Ljava/lang/String; = "flickr.tags.getListUserPopular"

.field public static final METHOD_GET_LIST_USER_RAW:Ljava/lang/String; = "flickr.tags.getListUserRaw"

.field public static final METHOD_GET_MOST_FREQUENTLY_USED:Ljava/lang/String; = "flickr.tags.getMostFrequentlyUsed"

.field public static final METHOD_GET_RELATED:Ljava/lang/String; = "flickr.tags.getRelated"

.field public static final PERIOD_DAY:Ljava/lang/String; = "day"

.field public static final PERIOD_WEEK:Ljava/lang/String; = "week"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->sharedSecret:Ljava/lang/String;

    .line 62
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 63
    return-void
.end method


# virtual methods
.method public getClusterPhotos(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 4

    .prologue
    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getClusterPhotos"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "tag"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "cluster_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 134
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 135
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 136
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 137
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 136
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 139
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhotoList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method public getClusters(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/tags/ClusterList;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.tags.getClusters"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tag"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 87
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 88
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 89
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 92
    :cond_0
    new-instance v3, Lcom/googlecode/flickrjandroid/tags/ClusterList;

    invoke-direct {v3}, Lcom/googlecode/flickrjandroid/tags/ClusterList;-><init>()V

    .line 93
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 94
    const-string v2, "clusters"

    .line 93
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 95
    const-string v2, "cluster"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    move v2, v1

    .line 96
    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt v2, v0, :cond_2

    .line 107
    :cond_1
    return-object v3

    .line 97
    :cond_2
    new-instance v5, Lcom/googlecode/flickrjandroid/tags/Cluster;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/tags/Cluster;-><init>()V

    .line 98
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 99
    const-string v6, "tag"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    move v0, v1

    .line 100
    :goto_1
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v0, v7, :cond_4

    .line 105
    :cond_3
    invoke-virtual {v3, v5}, Lcom/googlecode/flickrjandroid/tags/ClusterList;->addCluster(Lcom/googlecode/flickrjandroid/tags/Cluster;)V

    .line 96
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 101
    :cond_4
    new-instance v7, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v7}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 102
    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    const-string v9, "_content"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v5, v7}, Lcom/googlecode/flickrjandroid/tags/Cluster;->addTag(Lcom/googlecode/flickrjandroid/tags/Tag;)V

    .line 100
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public getHotList(Ljava/lang/String;I)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/HotlistTag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getHotList"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "period"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "count"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 166
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 167
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 168
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 172
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "hottags"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 174
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 175
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 176
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 183
    :cond_1
    return-object v1

    .line 177
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 178
    new-instance v4, Lcom/googlecode/flickrjandroid/tags/HotlistTag;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/tags/HotlistTag;-><init>()V

    .line 179
    const-string v5, "score"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/tags/HotlistTag;->setScore(Ljava/lang/String;)V

    .line 180
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/tags/HotlistTag;->setValue(Ljava/lang/String;)V

    .line 181
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getListPhoto(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photos/Photo;
    .locals 7

    .prologue
    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 201
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getListPhoto"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 207
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 208
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 209
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 210
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 209
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 213
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "photo"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 214
    new-instance v1, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 215
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 217
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 218
    const-string v3, "tags"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 219
    const-string v3, "tag"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 220
    const/4 v0, 0x0

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v0, v4, :cond_2

    .line 230
    :cond_1
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTags(Ljava/util/Collection;)V

    .line 231
    return-object v1

    .line 221
    :cond_2
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 222
    new-instance v5, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 223
    const-string v6, "id"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setId(Ljava/lang/String;)V

    .line 224
    const-string v6, "author"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setAuthor(Ljava/lang/String;)V

    .line 225
    const-string v6, "authorname"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setAuthorName(Ljava/lang/String;)V

    .line 226
    const-string v6, "raw"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setRaw(Ljava/lang/String;)V

    .line 227
    const-string v6, "_content"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 228
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getListUser(Ljava/lang/String;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 250
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 251
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getListUser"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "user_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 257
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 258
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 259
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 260
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 259
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 263
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "who"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 265
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 266
    const-string v2, "tags"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 267
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 268
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 275
    :cond_1
    return-object v1

    .line 269
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 270
    new-instance v4, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 271
    const-string v5, "count"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/tags/Tag;->setCount(I)V

    .line 272
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 273
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getListUserPopular(Ljava/lang/String;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 333
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 334
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getListUserPopular"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "user_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 340
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 341
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 343
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 342
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 346
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "who"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 348
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 349
    const-string v2, "tags"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 350
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 351
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 358
    :cond_1
    return-object v1

    .line 352
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 353
    new-instance v4, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 354
    const-string v5, "count"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/tags/Tag;->setCount(Ljava/lang/String;)V

    .line 355
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 356
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getListUserRaw(Ljava/lang/String;)Ljava/util/Collection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/TagRaw;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 377
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 378
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.tags.getListUserRaw"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 379
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    .line 380
    iget-object v4, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    if-eqz p1, :cond_0

    .line 383
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tag"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 385
    :cond_0
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 387
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 388
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 389
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 390
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 389
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 393
    :cond_1
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "who"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 395
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 396
    const-string v2, "tags"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 397
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    move v2, v1

    .line 398
    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt v2, v0, :cond_3

    .line 409
    :cond_2
    return-object v3

    .line 399
    :cond_3
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 400
    new-instance v5, Lcom/googlecode/flickrjandroid/tags/TagRaw;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/tags/TagRaw;-><init>()V

    .line 401
    const-string v6, "clean"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/TagRaw;->setClean(Ljava/lang/String;)V

    .line 402
    const-string v6, "raw"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    move v0, v1

    .line 403
    :goto_1
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v0, v7, :cond_5

    .line 407
    :cond_4
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 404
    :cond_5
    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 405
    const-string v8, "_content"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/googlecode/flickrjandroid/tags/TagRaw;->addRaw(Ljava/lang/String;)V

    .line 403
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public getMostFrequentlyUsed()Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 291
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 293
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getMostFrequentlyUsed"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 295
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 294
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 297
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 298
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 299
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 300
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 299
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 303
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 304
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "who"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 305
    const-string v2, "tags"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 306
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 307
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 314
    :cond_1
    return-object v1

    .line 308
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 309
    new-instance v4, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 310
    const-string v5, "count"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/tags/Tag;->setCount(Ljava/lang/String;)V

    .line 311
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 312
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 307
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getRelated(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;
    .locals 6

    .prologue
    .line 428
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 429
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.tags.getRelated"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 430
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 432
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "tag"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 435
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 436
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 437
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 438
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 437
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 441
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "tags"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 442
    new-instance v1, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;-><init>()V

    .line 443
    const-string v2, "source"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;->setSource(Ljava/lang/String;)V

    .line 444
    const-string v2, "tag"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 445
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 451
    :cond_1
    return-object v1

    .line 446
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 447
    new-instance v4, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 448
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 449
    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;->add(Ljava/lang/Object;)Z

    .line 445
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
