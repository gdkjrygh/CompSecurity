.class public Lcom/googlecode/flickrjandroid/activity/ActivityInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_USER_COMMENTS:Ljava/lang/String; = "flickr.activity.userComments"

.field public static final METHOD_USER_PHOTOS:Ljava/lang/String; = "flickr.activity.userPhotos"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->apiKey:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->sharedSecret:Ljava/lang/String;

    .line 41
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 42
    return-void
.end method

.method private createItem(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/activity/Item;
    .locals 8

    .prologue
    .line 144
    new-instance v1, Lcom/googlecode/flickrjandroid/activity/Item;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/activity/Item;-><init>()V

    .line 145
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setId(Ljava/lang/String;)V

    .line 146
    const-string v0, "secret"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setSecret(Ljava/lang/String;)V

    .line 147
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setType(Ljava/lang/String;)V

    .line 148
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    const-string v2, "_content"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setTitle(Ljava/lang/String;)V

    .line 152
    :cond_0
    const-string v0, "farm"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setFarm(Ljava/lang/String;)V

    .line 153
    const-string v0, "server"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setServer(Ljava/lang/String;)V

    .line 155
    const-string v0, "comments"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 156
    const-string v0, "notes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 158
    const-string v0, "commentsold"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 159
    const-string v0, "commentsnew"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 160
    const-string v0, "notesold"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 161
    const-string v0, "notesnew"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setComments(I)V

    .line 163
    const-string v0, "views"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setViews(I)V

    .line 164
    const-string v0, "faves"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setFaves(I)V

    .line 165
    const-string v0, "more"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/activity/Item;->setMore(I)V

    .line 168
    :try_start_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 171
    const-string v3, "event"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 172
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v0, v4, :cond_1

    .line 189
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/Item;->setEvents(Ljava/util/Collection;)V

    .line 194
    :goto_1
    return-object v1

    .line 173
    :cond_1
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 174
    new-instance v5, Lcom/googlecode/flickrjandroid/activity/Event;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/activity/Event;-><init>()V

    .line 175
    const-string v6, "type"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setType(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v5}, Lcom/googlecode/flickrjandroid/activity/Event;->getType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "comment"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 177
    const-string v6, "commentid"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setId(Ljava/lang/String;)V

    .line 183
    :goto_2
    const-string v6, "user"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setUser(Ljava/lang/String;)V

    .line 184
    const-string v6, "username"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setUsername(Ljava/lang/String;)V

    .line 185
    const-string v6, "dateadded"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setDateadded(Ljava/lang/String;)V

    .line 186
    const-string v6, "_content"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/googlecode/flickrjandroid/activity/Event;->setValue(Ljava/lang/String;)V

    .line 187
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_2
    invoke-virtual {v5}, Lcom/googlecode/flickrjandroid/activity/Event;->getType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "note"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 179
    const-string v6, "noteid"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/activity/Event;->setId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 191
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 180
    :cond_3
    :try_start_1
    invoke-virtual {v5}, Lcom/googlecode/flickrjandroid/activity/Event;->getType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "fave"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method


# virtual methods
.method public checkTimeframeArg(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 205
    const-string v0, "\\d*(d|h)"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 206
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    const/4 v0, 0x1

    .line 209
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public userComments(II)Lcom/googlecode/flickrjandroid/activity/ItemList;
    .locals 5

    .prologue
    .line 57
    new-instance v1, Lcom/googlecode/flickrjandroid/activity/ItemList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/activity/ItemList;-><init>()V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.activity.userComments"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 64
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 65
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 66
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 69
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 70
    const-string v2, "items"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 71
    const-string v2, "page"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPage(I)V

    .line 72
    const-string v2, "pages"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPages(I)V

    .line 73
    const-string v2, "perpage"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPerPage(I)V

    .line 74
    const-string v2, "total"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setTotal(I)V

    .line 76
    const-string v2, "item"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 78
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 83
    return-object v1

    .line 79
    :cond_1
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 80
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->createItem(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/activity/Item;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/activity/ItemList;->add(Ljava/lang/Object;)Z

    .line 78
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public userPhotos(IILjava/lang/String;)Lcom/googlecode/flickrjandroid/activity/ItemList;
    .locals 5

    .prologue
    .line 100
    new-instance v1, Lcom/googlecode/flickrjandroid/activity/ItemList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/activity/ItemList;-><init>()V

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.activity.userPhotos"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    if-lez p1, :cond_0

    .line 105
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_0
    if-lez p2, :cond_1

    .line 109
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_1
    if-eqz p3, :cond_2

    .line 113
    invoke-virtual {p0, p3}, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->checkTimeframeArg(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 114
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "timeframe"

    invoke-direct {v2, v3, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_2
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 121
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 122
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 123
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 116
    :cond_3
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v1, "0"

    const-string v2, "Timeframe-argument to getUserPhotos() not valid"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_4
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 127
    const-string v2, "items"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 128
    const-string v2, "page"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPage(I)V

    .line 129
    const-string v2, "pages"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPages(I)V

    .line 130
    const-string v2, "perpage"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setPerPage(I)V

    .line 131
    const-string v2, "total"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/activity/ItemList;->setTotal(I)V

    .line 133
    const-string v2, "item"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 135
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_5

    .line 140
    return-object v1

    .line 136
    :cond_5
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 137
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;->createItem(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/activity/Item;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/activity/ItemList;->add(Ljava/lang/Object;)Z

    .line 135
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
