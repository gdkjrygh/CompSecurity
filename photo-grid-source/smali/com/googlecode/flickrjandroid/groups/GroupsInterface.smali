.class public Lcom/googlecode/flickrjandroid/groups/GroupsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_BROWSE:Ljava/lang/String; = "flickr.groups.browse"

.field public static final METHOD_GET_ACTIVE_LIST:Ljava/lang/String; = "flickr.groups.getActiveList"

.field public static final METHOD_GET_INFO:Ljava/lang/String; = "flickr.groups.getInfo"

.field public static final METHOD_JOIN:Ljava/lang/String; = "flickr.groups.join"

.field public static final METHOD_JOIN_REQUEST:Ljava/lang/String; = "flickr.groups.joinRequest"

.field public static final METHOD_LEAVE:Ljava/lang/String; = "flickr.groups.leave"

.field public static final METHOD_SEARCH:Ljava/lang/String; = "flickr.groups.search"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    .line 47
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 48
    return-void
.end method


# virtual methods
.method public browse(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/groups/Category;
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 61
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "method"

    const-string v6, "flickr.groups.browse"

    invoke-direct {v4, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "oauth_consumer_key"

    iget-object v6, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    if-eqz p1, :cond_0

    .line 68
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "cat_id"

    invoke-direct {v4, v5, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_0
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 72
    iget-object v4, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v4, v5, v1}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v1

    .line 73
    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 74
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "category"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 78
    new-instance v5, Lcom/googlecode/flickrjandroid/groups/Category;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/groups/Category;-><init>()V

    .line 79
    const-string v1, "name"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/googlecode/flickrjandroid/groups/Category;->setName(Ljava/lang/String;)V

    .line 80
    const-string v1, "path"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/googlecode/flickrjandroid/groups/Category;->setPath(Ljava/lang/String;)V

    .line 81
    const-string v1, "pathids"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/googlecode/flickrjandroid/groups/Category;->setPathIds(Ljava/lang/String;)V

    .line 83
    const-string v1, "subcat"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    move v1, v0

    .line 84
    :goto_0
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v1, v7, :cond_4

    .line 93
    :cond_2
    const-string v1, "group"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 94
    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v0, v4, :cond_5

    .line 104
    :cond_3
    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/groups/Category;->setGroups(Ljava/util/Collection;)V

    .line 105
    invoke-virtual {v5, v2}, Lcom/googlecode/flickrjandroid/groups/Category;->setSubcategories(Ljava/util/Collection;)V

    .line 107
    return-object v5

    .line 85
    :cond_4
    invoke-virtual {v6, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 86
    new-instance v8, Lcom/googlecode/flickrjandroid/groups/Subcategory;

    invoke-direct {v8}, Lcom/googlecode/flickrjandroid/groups/Subcategory;-><init>()V

    .line 87
    const-string v9, "id"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v8, v9}, Lcom/googlecode/flickrjandroid/groups/Subcategory;->setId(I)V

    .line 88
    const-string v9, "name"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/googlecode/flickrjandroid/groups/Subcategory;->setName(Ljava/lang/String;)V

    .line 89
    const-string v9, "count"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v8, v7}, Lcom/googlecode/flickrjandroid/groups/Subcategory;->setCount(I)V

    .line 90
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 95
    :cond_5
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 96
    new-instance v6, Lcom/googlecode/flickrjandroid/groups/Group;

    invoke-direct {v6}, Lcom/googlecode/flickrjandroid/groups/Group;-><init>()V

    .line 97
    const-string v7, "nsid"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/groups/Group;->setId(Ljava/lang/String;)V

    .line 98
    const-string v7, "name"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/groups/Group;->setName(Ljava/lang/String;)V

    .line 99
    const-string v7, "members"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Lcom/googlecode/flickrjandroid/groups/Group;->setMembers(Ljava/lang/String;)V

    .line 101
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public getInfo(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/groups/Group;
    .locals 5

    .prologue
    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 121
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.groups.getInfo"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "group_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 127
    if-eqz v1, :cond_0

    .line 128
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 129
    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 135
    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 137
    :goto_1
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 138
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 132
    :cond_0
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 136
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    goto :goto_1

    .line 140
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "group"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 141
    new-instance v1, Lcom/googlecode/flickrjandroid/groups/Group;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/groups/Group;-><init>()V

    .line 142
    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setId(Ljava/lang/String;)V

    .line 143
    const-string v2, "iconfarm"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setIconFarm(Ljava/lang/String;)V

    .line 144
    const-string v2, "iconserver"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setIconServer(Ljava/lang/String;)V

    .line 145
    const-string v2, "lang"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setLang(Ljava/lang/String;)V

    .line 146
    const-string v2, "1"

    const-string v3, "ispoolmoderated"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setPoolModerated(Z)V

    .line 148
    const-string v2, "name"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setName(Ljava/lang/String;)V

    .line 149
    const-string v2, "description"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setDescription(Ljava/lang/String;)V

    .line 150
    const-string v2, "rules"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setRules(Ljava/lang/String;)V

    .line 151
    const-string v2, "members"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setMembers(Ljava/lang/String;)V

    .line 152
    const-string v2, "privacy"

    invoke-static {v0, v2}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setPrivacy(Ljava/lang/String;)V

    .line 154
    const-string v2, "throttle"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 155
    if-eqz v0, :cond_3

    .line 156
    new-instance v2, Lcom/googlecode/flickrjandroid/groups/Throttle;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/groups/Throttle;-><init>()V

    .line 157
    const-string v3, "mode"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/groups/Throttle;->setMode(Ljava/lang/String;)V

    .line 158
    const-string v3, "count"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/groups/Throttle;->setCount(I)V

    .line 159
    const-string v3, "remaining"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/groups/Throttle;->setRemaining(I)V

    .line 160
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/Group;->setThrottle(Lcom/googlecode/flickrjandroid/groups/Throttle;)V

    .line 163
    :cond_3
    return-object v1
.end method

.method public joinPrivateGroup(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 266
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 267
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.groups.joinRequest"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 269
    if-nez v1, :cond_0

    .line 270
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuthException;

    const-string v1, "OAuth required"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 272
    :cond_0
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    .line 273
    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 272
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 275
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "group_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "message"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "accept_rules"

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 280
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 281
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 283
    :cond_1
    return-void
.end method

.method public joinPublicGroup(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 222
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->joinPublicGroup(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 223
    return-void
.end method

.method public joinPublicGroup(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 4

    .prologue
    .line 235
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 236
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.groups.join"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 238
    if-nez v1, :cond_0

    .line 239
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuthException;

    const-string v1, "OAuth required"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_0
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    .line 242
    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 241
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 244
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "group_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    if-eqz p2, :cond_1

    .line 246
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "accept_rules"

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 250
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 251
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 253
    :cond_2
    return-void
.end method

.method public leave(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 294
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->leave(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 295
    return-void
.end method

.method public leave(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 4

    .prologue
    .line 307
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 308
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.groups.leave"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    invoke-static {}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hasSigned()Z

    move-result v1

    .line 310
    if-nez v1, :cond_0

    .line 311
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuthException;

    const-string v1, "OAuth required"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 313
    :cond_0
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    .line 314
    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 316
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "group_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    if-eqz p2, :cond_1

    .line 318
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "delete_photos"

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 322
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 323
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 325
    :cond_2
    return-void
.end method

.method public search(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/groups/GroupList;
    .locals 6

    .prologue
    .line 178
    new-instance v1, Lcom/googlecode/flickrjandroid/groups/GroupList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/groups/GroupList;-><init>()V

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 180
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.groups.search"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "text"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    if-lez p2, :cond_0

    .line 185
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p2}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    :cond_0
    if-lez p3, :cond_1

    .line 188
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    :cond_1
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 192
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 193
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 195
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "groups"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 196
    const-string v2, "group"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 197
    const-string v3, "page"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/groups/GroupList;->setPage(I)V

    .line 198
    const-string v3, "pages"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/groups/GroupList;->setPages(I)V

    .line 199
    const-string v3, "perpage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/groups/GroupList;->setPerPage(I)V

    .line 200
    const-string v3, "total"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/groups/GroupList;->setTotal(I)V

    .line 201
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_4

    .line 210
    :cond_3
    return-object v1

    .line 202
    :cond_4
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 203
    new-instance v4, Lcom/googlecode/flickrjandroid/groups/Group;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/groups/Group;-><init>()V

    .line 204
    const-string v5, "nsid"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/groups/Group;->setId(Ljava/lang/String;)V

    .line 205
    const-string v5, "name"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/groups/Group;->setName(Ljava/lang/String;)V

    .line 206
    const-string v5, "pool_count"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/groups/Group;->setPhotoCount(Ljava/lang/String;)V

    .line 207
    const-string v5, "members"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/groups/Group;->setMembers(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v1, v4}, Lcom/googlecode/flickrjandroid/groups/GroupList;->add(Lcom/googlecode/flickrjandroid/groups/Group;)Z

    .line 201
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
