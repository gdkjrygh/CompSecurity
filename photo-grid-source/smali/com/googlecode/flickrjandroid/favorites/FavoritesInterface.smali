.class public Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_ADD:Ljava/lang/String; = "flickr.favorites.add"

.field public static final METHOD_GET_CONTEXT:Ljava/lang/String; = "flickr.favorites.getContext"

.field public static final METHOD_GET_LIST:Ljava/lang/String; = "flickr.favorites.getList"

.field public static final METHOD_GET_PUBLIC_LIST:Ljava/lang/String; = "flickr.favorites.getPublicList"

.field public static final METHOD_REMOVE:Ljava/lang/String; = "flickr.favorites.remove"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->sharedSecret:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 49
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.favorites.add"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 68
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 69
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 72
    :cond_0
    return-void
.end method

.method public getContext(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/photos/PhotoContext;
    .locals 5

    .prologue
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.favorites.getContext"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    .line 90
    iget-object v4, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    :goto_0
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "photo_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "user_id"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    if-eqz v1, :cond_0

    .line 98
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 101
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 102
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 92
    :cond_1
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 105
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhotoContext(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoContext;

    move-result-object v0

    return-object v0
.end method

.method public getList(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;IILjava/util/Set;)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "II",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/photos/PhotoList;"
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x3e8

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.favorites.getList"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    if-eqz p1, :cond_0

    .line 128
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "user_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    :cond_0
    if-eqz p2, :cond_1

    .line 131
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "min_fave_date"

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_1
    if-eqz p3, :cond_2

    .line 134
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "max_fave_date"

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_2
    if-eqz p6, :cond_3

    .line 137
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "extras"

    const-string v3, ","

    invoke-static {p6, v3}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    :cond_3
    if-lez p4, :cond_4

    .line 140
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "per_page"

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p4}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_4
    if-lez p5, :cond_5

    .line 143
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "page"

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p5}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_5
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 147
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 148
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 149
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 151
    :cond_6
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhotoList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method public getPublicList(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;IILjava/util/Set;)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "II",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/photos/PhotoList;"
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x3e8

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.favorites.getPublicList"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "user_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    if-eqz p2, :cond_0

    .line 179
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "min_fave_date"

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    :cond_0
    if-eqz p3, :cond_1

    .line 182
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "max_fave_date"

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_1
    if-eqz p6, :cond_2

    .line 185
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "extras"

    const-string v3, ","

    invoke-static {p6, v3}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    :cond_2
    if-lez p4, :cond_3

    .line 188
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "per_page"

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p4}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    :cond_3
    if-lez p5, :cond_4

    .line 191
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "page"

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p5}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    :cond_4
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 195
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 196
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 198
    :cond_5
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhotoList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 208
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 209
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.favorites.remove"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 214
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 215
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 216
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 218
    :cond_0
    return-void
.end method
