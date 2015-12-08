.class public Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final KEY_OAUTH_CALLBACK_CONFIRMED:Ljava/lang/String; = "oauth_callback_confirmed"

.field public static final KEY_OAUTH_TOKEN:Ljava/lang/String; = "oauth_token"

.field public static final KEY_OAUTH_TOKEN_SECRET:Ljava/lang/String; = "oauth_token_secret"

.field public static final KEY_OAUTH_VERIFIER:Ljava/lang/String; = "oauth_verifier"

.field public static final METHOD_TEST_LOGIN:Ljava/lang/String; = "flickr.test.login"

.field public static final PARAM_OAUTH_CONSUMER_KEY:Ljava/lang/String; = "oauth_consumer_key"

.field public static final PARAM_OAUTH_TOKEN:Ljava/lang/String; = "oauth_token"

.field public static final PATH_OAUTH_ACCESS_TOKEN:Ljava/lang/String; = "/services/oauth/access_token"

.field public static final PATH_OAUTH_REQUEST_TOKEN:Ljava/lang/String; = "/services/oauth/request_token"

.field public static final PATH_REST:Ljava/lang/String; = "/services/rest"

.field public static final URL_ACCESS_TOKEN:Ljava/lang/String; = "https://api.flickr.com/services/oauth/access_token"

.field public static final URL_REQUEST_TOKEN:Ljava/lang/String; = "https://api.flickr.com/services/oauth/request_token"

.field public static final URL_REST:Ljava/lang/String; = "https://api.flickr.com/services/rest"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private oauthTransport:Lcom/googlecode/flickrjandroid/REST;

.field private sharedSecret:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->apiKey:Ljava/lang/String;

    .line 73
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->sharedSecret:Ljava/lang/String;

    .line 74
    check-cast p3, Lcom/googlecode/flickrjandroid/REST;

    iput-object p3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->oauthTransport:Lcom/googlecode/flickrjandroid/REST;

    .line 75
    return-void
.end method


# virtual methods
.method public buildAuthenticationUrl(Lcom/googlecode/flickrjandroid/auth/Permission;Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)Ljava/net/URL;
    .locals 4

    .prologue
    .line 196
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 197
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_token"

    invoke-virtual {p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    if-eqz p1, :cond_0

    .line 199
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "perms"

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/auth/Permission;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_0
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->oauthTransport:Lcom/googlecode/flickrjandroid/REST;

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/REST;->getPort()I

    move-result v1

    .line 203
    const-string v2, "/services/oauth/authorize"

    .line 205
    const-string v3, "api.flickr.com"

    invoke-static {v3, v1, v2, v0}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->buildUrl(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getAccessToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuth;
    .locals 5

    .prologue
    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 150
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    new-instance v1, Lcom/googlecode/flickrjandroid/oauth/OAuthTokenParameter;

    invoke-direct {v1, p1}, Lcom/googlecode/flickrjandroid/oauth/OAuthTokenParameter;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_verifier"

    invoke-direct {v1, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addBasicOAuthParams(Ljava/util/List;)V

    .line 157
    const-string v1, "POST"

    .line 158
    const-string v2, "https://api.flickr.com/services/oauth/access_token"

    .line 160
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->sharedSecret:Ljava/lang/String;

    .line 156
    invoke-static {v1, v2, v0, v3, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->getSignature(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 162
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_signature"

    invoke-direct {v2, v3, v1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->oauthTransport:Lcom/googlecode/flickrjandroid/REST;

    const/4 v2, 0x0

    const-string v3, "/services/oauth/access_token"

    invoke-virtual {v1, v2, v3, v0}, Lcom/googlecode/flickrjandroid/REST;->getMapData(ZLjava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    .line 167
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v1, "Empty Response"

    const-string v2, "Empty Response"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_0
    new-instance v2, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuth;-><init>()V

    .line 172
    new-instance v3, Lcom/googlecode/flickrjandroid/people/User;

    invoke-direct {v3}, Lcom/googlecode/flickrjandroid/people/User;-><init>()V

    .line 173
    const-string v0, "user_nsid"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 174
    const-string v0, "username"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 175
    const-string v0, "fullname"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setRealName(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setUser(Lcom/googlecode/flickrjandroid/people/User;)V

    .line 177
    new-instance v3, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    .line 178
    const-string v0, "oauth_token"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v4, "oauth_token_secret"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v3, v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setToken(Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)V

    .line 179
    invoke-static {}, Lcom/googlecode/flickrjandroid/RequestContext;->getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/googlecode/flickrjandroid/RequestContext;->setOAuth(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V

    .line 180
    return-object v2
.end method

.method public getRequestToken(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuthToken;
    .locals 5

    .prologue
    .line 106
    if-nez p1, :cond_0

    .line 107
    const-string p1, "oob"

    .line 108
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_callback"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addBasicOAuthParams(Ljava/util/List;)V

    .line 113
    const-string v1, "GET"

    .line 114
    const-string v2, "https://api.flickr.com/services/oauth/request_token"

    .line 116
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->sharedSecret:Ljava/lang/String;

    const/4 v4, 0x0

    .line 112
    invoke-static {v1, v2, v0, v3, v4}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->getSignature(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "oauth_signature"

    invoke-direct {v2, v3, v1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->oauthTransport:Lcom/googlecode/flickrjandroid/REST;

    .line 122
    const/4 v2, 0x1

    const-string v3, "/services/oauth/request_token"

    .line 121
    invoke-virtual {v1, v2, v3, v0}, Lcom/googlecode/flickrjandroid/REST;->getMapData(ZLjava/lang/String;Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    .line 123
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v1, "Empty Response"

    const-string v2, "Empty Response"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_1
    const-string v0, "oauth_callback_confirmed"

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    const-string v0, "oauth_callback_confirmed"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 129
    :cond_2
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v2, "Error"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid response: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_3
    const-string v0, "oauth_token"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 132
    const-string v2, "oauth_token_secret"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 134
    new-instance v2, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuth;-><init>()V

    .line 135
    new-instance v3, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    invoke-direct {v3, v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setToken(Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)V

    .line 137
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v0

    return-object v0
.end method

.method public testLogin()Lcom/googlecode/flickrjandroid/people/User;
    .locals 4

    .prologue
    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.test.login"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 83
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->oauthTransport:Lcom/googlecode/flickrjandroid/REST;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/REST;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 84
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 85
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    .line 89
    const-string v1, "user"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 90
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    const-string v2, "username"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "_content"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    new-instance v2, Lcom/googlecode/flickrjandroid/people/User;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/people/User;-><init>()V

    .line 93
    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 95
    return-object v2
.end method
