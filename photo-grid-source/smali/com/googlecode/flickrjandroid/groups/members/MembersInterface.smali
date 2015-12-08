.class public Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final METHOD_GET_LIST:Ljava/lang/String; = "flickr.groups.members.getList"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->apiKey:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->sharedSecret:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 41
    return-void
.end method

.method private parseMember(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/groups/members/Member;
    .locals 2

    .prologue
    .line 102
    new-instance v0, Lcom/googlecode/flickrjandroid/groups/members/Member;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/groups/members/Member;-><init>()V

    .line 103
    const-string v1, "nsid"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setId(Ljava/lang/String;)V

    .line 104
    const-string v1, "username"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setUserName(Ljava/lang/String;)V

    .line 105
    const-string v1, "iconserver"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setIconServer(Ljava/lang/String;)V

    .line 106
    const-string v1, "iconfarm"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setIconFarm(Ljava/lang/String;)V

    .line 107
    const-string v1, "membertype"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setMemberType(Ljava/lang/String;)V

    .line 108
    return-object v0
.end method


# virtual methods
.method public getList(Ljava/lang/String;Ljava/util/Set;II)Lcom/googlecode/flickrjandroid/groups/members/MembersList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;II)",
            "Lcom/googlecode/flickrjandroid/groups/members/MembersList;"
        }
    .end annotation

    .prologue
    .line 61
    new-instance v1, Lcom/googlecode/flickrjandroid/groups/members/MembersList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.groups.members.getList"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_consumer_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "group_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    if-lez p3, :cond_0

    .line 68
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_0
    if-lez p4, :cond_1

    .line 71
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_1
    if-eqz p2, :cond_2

    .line 75
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 76
    const-string v3, "membertypes"

    .line 77
    const-string v4, ","

    invoke-static {p2, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 75
    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_2
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 83
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 84
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 85
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "members"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 88
    const-string v2, "page"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;->setPage(I)V

    .line 89
    const-string v2, "pages"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;->setPages(I)V

    .line 90
    const-string v2, "perpage"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;->setPerPage(I)V

    .line 91
    const-string v2, "total"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;->setTotal(I)V

    .line 93
    const-string v2, "member"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 94
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_5

    .line 98
    :cond_4
    return-object v1

    .line 95
    :cond_5
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 96
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;->parseMember(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/groups/members/Member;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/groups/members/MembersList;->add(Ljava/lang/Object;)Z

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
