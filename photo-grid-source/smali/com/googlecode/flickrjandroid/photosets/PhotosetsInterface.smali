.class public Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_ADD_PHOTO:Ljava/lang/String; = "flickr.photosets.addPhoto"

.field public static final METHOD_CREATE:Ljava/lang/String; = "flickr.photosets.create"

.field public static final METHOD_DELETE:Ljava/lang/String; = "flickr.photosets.delete"

.field public static final METHOD_EDIT_META:Ljava/lang/String; = "flickr.photosets.editMeta"

.field public static final METHOD_EDIT_PHOTOS:Ljava/lang/String; = "flickr.photosets.editPhotos"

.field public static final METHOD_GET_CONTEXT:Ljava/lang/String; = "flickr.photosets.getContext"

.field public static final METHOD_GET_INFO:Ljava/lang/String; = "flickr.photosets.getInfo"

.field public static final METHOD_GET_LIST:Ljava/lang/String; = "flickr.photosets.getList"

.field public static final METHOD_GET_PHOTOS:Ljava/lang/String; = "flickr.photosets.getPhotos"

.field public static final METHOD_ORDER_SETS:Ljava/lang/String; = "flickr.photosets.orderSets"

.field public static final METHOD_REMOVE_PHOTO:Ljava/lang/String; = "flickr.photosets.removePhoto"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    .line 60
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 61
    return-void
.end method

.method private parsePhotoset(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photosets/Photoset;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 337
    new-instance v1, Lcom/googlecode/flickrjandroid/photosets/Photoset;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photosets/Photoset;-><init>()V

    .line 338
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setId(Ljava/lang/String;)V

    .line 340
    const-string v0, "owner"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 341
    new-instance v0, Lcom/googlecode/flickrjandroid/people/User;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/people/User;-><init>()V

    .line 342
    const-string v2, "owner"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 343
    const-string v2, "ownername"

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 344
    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setOwner(Lcom/googlecode/flickrjandroid/people/User;)V

    .line 347
    :cond_0
    new-instance v2, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 348
    const-string v0, "primary"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 349
    const-string v0, "secret"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setSecret(Ljava/lang/String;)V

    .line 359
    const-string v0, "server"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setServer(Ljava/lang/String;)V

    .line 369
    const-string v0, "farm"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFarm(Ljava/lang/String;)V

    .line 370
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPrimaryPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    .line 374
    const-string v0, "secret"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setSecret(Ljava/lang/String;)V

    .line 375
    const-string v0, "server"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setServer(Ljava/lang/String;)V

    .line 376
    const-string v0, "farm"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setFarm(Ljava/lang/String;)V

    .line 377
    const-string v0, "photos"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPhotoCount(Ljava/lang/String;)V

    .line 379
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 381
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 382
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setTitle(Ljava/lang/String;)V

    .line 388
    :cond_1
    :goto_0
    const-string v0, "description"

    .line 387
    invoke-static {p1, v0}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setDescription(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPrimaryPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    .line 391
    return-object v1

    .line 384
    :cond_2
    const-string v0, "title"

    invoke-static {p1, v0}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setTitle(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public addPhoto(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.addPhoto"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 80
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 86
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 87
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 88
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 91
    :cond_0
    return-void
.end method

.method public create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photosets/Photoset;
    .locals 4

    .prologue
    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.create"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 113
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "title"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "description"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "primary_photo_id"

    invoke-direct {v1, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 120
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 121
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 125
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 126
    const-string v1, "photoset"

    .line 125
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 127
    new-instance v1, Lcom/googlecode/flickrjandroid/photosets/Photoset;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photosets/Photoset;-><init>()V

    .line 128
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setId(Ljava/lang/String;)V

    .line 129
    const-string v2, "url"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setUrl(Ljava/lang/String;)V

    .line 130
    return-object v1
.end method

.method public delete(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 145
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.delete"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 147
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 152
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 154
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 154
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 157
    :cond_0
    return-void
.end method

.method public editMeta(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 175
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.editMeta"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 177
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "title"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    if-eqz p3, :cond_0

    .line 182
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "description"

    invoke-direct {v1, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_0
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 186
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 187
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 188
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 189
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 188
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 191
    :cond_1
    return-void
.end method

.method public editPhotos(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 210
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.editPhotos"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 212
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 211
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "primary_photo_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_ids"

    .line 217
    const-string v3, ","

    .line 216
    invoke-static {p3, v3}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 220
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 221
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 223
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 222
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 225
    :cond_0
    return-void
.end method

.method public getContext(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photos/PhotoContext;
    .locals 7

    .prologue
    .line 243
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 244
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.getContext"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 253
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 254
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 255
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 256
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 257
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 259
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 260
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 261
    new-instance v2, Lcom/googlecode/flickrjandroid/photos/PhotoContext;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;-><init>()V

    .line 262
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 291
    return-object v2

    .line 263
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 264
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 265
    const-string v5, "prevphoto"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 266
    const-string v3, "id"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 267
    const-string v5, "0"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 269
    new-instance v5, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 270
    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 271
    const-string v3, "title"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    .line 272
    const-string v3, "url"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setUrl(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v2, v5}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->setPreviousPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    goto :goto_0

    .line 275
    :cond_3
    const-string v5, "nextphoto"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 276
    const-string v3, "id"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 277
    const-string v5, "0"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 279
    new-instance v5, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 280
    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 281
    const-string v3, "title"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    .line 282
    const-string v3, "url"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setUrl(Ljava/lang/String;)V

    .line 283
    invoke-virtual {v2, v5}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->setNextPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    goto :goto_0

    .line 285
    :cond_4
    const-string v4, "count"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 288
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "unsupported element name: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public getInfo(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photosets/Photoset;
    .locals 5

    .prologue
    .line 308
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 309
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.getInfo"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 311
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 312
    if-eqz v1, :cond_1

    .line 313
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 314
    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    :goto_0
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "photoset_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    if-eqz v1, :cond_0

    .line 322
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 324
    :cond_0
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 325
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 326
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 327
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 328
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 327
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 316
    :cond_1
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 330
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 331
    const-string v1, "photoset"

    .line 330
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 332
    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->parsePhotoset(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photosets/Photoset;

    move-result-object v0

    return-object v0
.end method

.method public getList(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photosets/Photosets;
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 410
    invoke-virtual {p0, p1, v0, v0}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->getList(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/photosets/Photosets;

    move-result-object v0

    return-object v0
.end method

.method public getList(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/photosets/Photosets;
    .locals 5

    .prologue
    .line 415
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 416
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.getList"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 418
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 419
    if-eqz v1, :cond_4

    .line 420
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 421
    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 420
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    :goto_0
    if-eqz p1, :cond_0

    .line 427
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "user_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 430
    :cond_0
    if-lez p2, :cond_1

    .line 431
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p2}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    :cond_1
    if-lez p3, :cond_2

    .line 435
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    :cond_2
    if-eqz v1, :cond_3

    .line 439
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 442
    :cond_3
    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 445
    :goto_1
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 446
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 447
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 446
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 423
    :cond_4
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 443
    :cond_5
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    goto :goto_1

    .line 449
    :cond_6
    new-instance v1, Lcom/googlecode/flickrjandroid/photosets/Photosets;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photosets/Photosets;-><init>()V

    .line 450
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 451
    const-string v2, "photosets"

    .line 450
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 452
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 453
    const-string v3, "photoset"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 454
    const/4 v0, 0x0

    :goto_2
    if-eqz v3, :cond_7

    .line 455
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 454
    if-lt v0, v4, :cond_8

    .line 461
    :cond_7
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photosets/Photosets;->setPhotosets(Ljava/util/Collection;)V

    .line 462
    return-object v1

    .line 456
    :cond_8
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 457
    invoke-direct {p0, v4}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->parsePhotoset(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photosets/Photoset;

    move-result-object v4

    .line 458
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public getPhotos(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/photosets/Photoset;
    .locals 6

    .prologue
    .line 587
    sget-object v2, Lcom/googlecode/flickrjandroid/photos/Extras;->MIN_EXTRAS:Ljava/util/Set;

    .line 588
    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move v5, p3

    .line 587
    invoke-virtual/range {v0 .. v5}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->getPhotos(Ljava/lang/String;Ljava/util/Set;III)Lcom/googlecode/flickrjandroid/photosets/Photoset;

    move-result-object v0

    return-object v0
.end method

.method public getPhotos(Ljava/lang/String;Ljava/util/Set;III)Lcom/googlecode/flickrjandroid/photosets/Photoset;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;III)",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;"
        }
    .end annotation

    .prologue
    .line 495
    new-instance v1, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;-><init>()V

    .line 496
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 497
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.photosets.getPhotos"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 498
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v2

    .line 499
    if-eqz v2, :cond_5

    .line 500
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    .line 501
    const-string v4, "oauth_consumer_key"

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 500
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    :goto_0
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "photoset_id"

    invoke-direct {v3, v4, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    if-lez p4, :cond_0

    .line 509
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "per_page"

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, p4}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 512
    :cond_0
    if-lez p5, :cond_1

    .line 513
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "page"

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, p5}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 516
    :cond_1
    if-lez p3, :cond_2

    .line 517
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "privacy_filter"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 521
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "extras"

    .line 522
    const-string v5, ","

    invoke-static {p2, v5}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 521
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 524
    :cond_3
    if-eqz v2, :cond_4

    .line 525
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 528
    :cond_4
    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 531
    :goto_1
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 532
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 533
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 532
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 503
    :cond_5
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "api_key"

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 529
    :cond_6
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    goto :goto_1

    .line 536
    :cond_7
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 537
    const-string v2, "photoset"

    .line 536
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 538
    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->parsePhotoset(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photosets/Photoset;

    move-result-object v2

    .line 539
    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPhotoList(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V

    .line 540
    const-string v3, "photo"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 541
    const-string v4, "page"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPage(Ljava/lang/String;)V

    .line 542
    const-string v4, "pages"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPages(Ljava/lang/String;)V

    .line 543
    const-string v4, "per_page"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPerPage(Ljava/lang/String;)V

    .line 544
    const-string v4, "total"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setTotal(Ljava/lang/String;)V

    .line 546
    const/4 v0, 0x0

    :goto_2
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v0, v4, :cond_9

    .line 554
    :cond_8
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->getTotal()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPhotoCount(I)V

    .line 556
    return-object v2

    .line 547
    :cond_9
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 548
    invoke-static {v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhoto(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/Photo;

    move-result-object v4

    .line 549
    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->isPrimary()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 550
    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photosets/Photoset;->setPrimaryPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    .line 552
    :cond_a
    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->add(Ljava/lang/Object;)Z

    .line 546
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public orderSets([Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 604
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 605
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.orderSets"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 606
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 607
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 606
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 609
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_ids"

    .line 610
    const-string v3, ","

    .line 609
    invoke-static {p1, v3}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 611
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 613
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 614
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 615
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 616
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 615
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 618
    :cond_0
    return-void
.end method

.method public removePhoto(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 633
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 634
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.photosets.removePhoto"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 635
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    .line 636
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 635
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 638
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photoset_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 640
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 642
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 643
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 644
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 645
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 644
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 647
    :cond_0
    return-void
.end method
