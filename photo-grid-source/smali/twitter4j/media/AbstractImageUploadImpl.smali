.class abstract Ltwitter4j/media/AbstractImageUploadImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/media/ImageUpload;


# static fields
.field public static final TWITTER_VERIFY_CREDENTIALS_JSON_V1:Ljava/lang/String; = "https://api.twitter.com/1/account/verify_credentials.json"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TWITTER_VERIFY_CREDENTIALS_JSON_V1_1:Ljava/lang/String; = "https://api.twitter.com/1.1/account/verify_credentials.json"

.field public static final TWITTER_VERIFY_CREDENTIALS_XML_V1:Ljava/lang/String; = "https://api.twitter.com/1/account/verify_credentials.xml"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field protected static final logger:Ltwitter4j/internal/logging/Logger;


# instance fields
.field protected apiKey:Ljava/lang/String;

.field protected appendParameter:[Ltwitter4j/internal/http/HttpParameter;

.field private client:Ltwitter4j/internal/http/HttpClientWrapper;

.field protected conf:Ltwitter4j/conf/Configuration;

.field protected headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected httpResponse:Ltwitter4j/internal/http/HttpResponse;

.field protected image:Ltwitter4j/internal/http/HttpParameter;

.field protected message:Ltwitter4j/internal/http/HttpParameter;

.field protected oauth:Ltwitter4j/auth/OAuthAuthorization;

.field protected postParameter:[Ltwitter4j/internal/http/HttpParameter;

.field protected uploadUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Ltwitter4j/media/AbstractImageUploadImpl;

    invoke-static {v0}, Ltwitter4j/internal/logging/Logger;->getLogger(Ljava/lang/Class;)Ltwitter4j/internal/logging/Logger;

    move-result-object v0

    sput-object v0, Ltwitter4j/media/AbstractImageUploadImpl;->logger:Ltwitter4j/internal/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ltwitter4j/conf/Configuration;Ljava/lang/String;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1, p3}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 67
    iput-object p2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    .line 68
    return-void
.end method

.method constructor <init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    .line 48
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    .line 49
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    .line 50
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    .line 51
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 52
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 53
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    .line 54
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    .line 56
    iput-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    .line 60
    iput-object p2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    .line 61
    iput-object p1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    .line 62
    new-instance v0, Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-direct {v0, p1}, Ltwitter4j/internal/http/HttpClientWrapper;-><init>(Ltwitter4j/internal/http/HttpClientWrapperConfiguration;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    .line 63
    return-void
.end method

.method private upload()Ljava/lang/String;
    .locals 6

    .prologue
    .line 97
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getMediaProviderParameters()Ljava/util/Properties;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 98
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getMediaProviderParameters()Ljava/util/Properties;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Properties;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v3, v0, [Ltwitter4j/internal/http/HttpParameter;

    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 102
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getMediaProviderParameters()Ljava/util/Properties;

    move-result-object v5

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v5, v1, v0}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v3, v2

    .line 104
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    iput-object v3, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 108
    :cond_1
    invoke-virtual {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->preUpload()V

    .line 109
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    if-nez v0, :cond_2

    .line 110
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Incomplete implementation. postParameter is not set."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 112
    :cond_2
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 113
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Incomplete implementation. uploadUrl is not set."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 115
    :cond_3
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getMediaProviderParameters()Ljava/util/Properties;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    array-length v0, v0

    if-lez v0, :cond_4

    .line 116
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {p0, v0, v1}, Ltwitter4j/media/AbstractImageUploadImpl;->appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 119
    :cond_4
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    iget-object v3, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ljava/util/Map;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    .line 121
    invoke-virtual {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->postUpload()Ljava/lang/String;

    move-result-object v0

    .line 122
    sget-object v1, Ltwitter4j/media/AbstractImageUploadImpl;->logger:Ltwitter4j/internal/logging/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "uploaded url ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V

    .line 124
    return-object v0
.end method


# virtual methods
.method protected appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 132
    array-length v0, p1

    .line 133
    array-length v1, p2

    .line 134
    add-int v2, v0, v1

    new-array v2, v2, [Ltwitter4j/internal/http/HttpParameter;

    .line 135
    invoke-static {p1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    invoke-static {p2, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 152
    if-ne p0, p1, :cond_1

    .line 169
    :cond_0
    :goto_0
    return v0

    .line 153
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 155
    :cond_3
    check-cast p1, Ltwitter4j/media/AbstractImageUploadImpl;

    .line 157
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 158
    :cond_6
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    goto :goto_0

    .line 159
    :cond_7
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    if-eqz v2, :cond_9

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-virtual {v2, v3}, Ltwitter4j/internal/http/HttpClientWrapper;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_8
    move v0, v1

    goto :goto_0

    :cond_9
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    if-nez v2, :cond_8

    .line 160
    :cond_a
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v2, :cond_c

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_b
    move v0, v1

    goto :goto_0

    :cond_c
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    if-nez v2, :cond_b

    .line 161
    :cond_d
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    if-eqz v2, :cond_f

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_e
    move v0, v1

    goto :goto_0

    :cond_f
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    if-nez v2, :cond_e

    .line 162
    :cond_10
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    if-eqz v2, :cond_12

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_11
    move v0, v1

    goto :goto_0

    :cond_12
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    if-nez v2, :cond_11

    .line 163
    :cond_13
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v2, :cond_15

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v2, v3}, Ltwitter4j/internal/http/HttpParameter;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_14
    move v0, v1

    goto/16 :goto_0

    :cond_15
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    if-nez v2, :cond_14

    .line 164
    :cond_16
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v2, :cond_18

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v2, v3}, Ltwitter4j/internal/http/HttpParameter;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_17
    move v0, v1

    goto/16 :goto_0

    :cond_18
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    if-nez v2, :cond_17

    .line 165
    :cond_19
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    if-eqz v2, :cond_1b

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    invoke-virtual {v2, v3}, Ltwitter4j/auth/OAuthAuthorization;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    :cond_1a
    move v0, v1

    goto/16 :goto_0

    :cond_1b
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    if-nez v2, :cond_1a

    .line 166
    :cond_1c
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    move v0, v1

    goto/16 :goto_0

    .line 167
    :cond_1d
    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    if-eqz v2, :cond_1e

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto/16 :goto_0

    :cond_1e
    iget-object v2, p1, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method protected generateVerifyCredentialsAuthorizationHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 141
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    const-string v1, "GET"

    invoke-virtual {v0, v1, p1}, Ltwitter4j/auth/OAuthAuthorization;->generateOAuthSignatureHttpParams(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "OAuth realm=\"http://api.twitter.com/\","

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected generateVerifyCredentialsAuthorizationURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 146
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    const-string v1, "GET"

    invoke-virtual {v0, v1, p1}, Ltwitter4j/auth/OAuthAuthorization;->generateOAuthSignatureHttpParams(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 174
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpClientWrapper;->hashCode()I

    move-result v0

    .line 175
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 176
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v0, v2

    .line 177
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    invoke-virtual {v0}, Ltwitter4j/auth/OAuthAuthorization;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v0, v2

    .line 178
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v0, v2

    .line 179
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    if-eqz v0, :cond_6

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    :goto_5
    add-int/2addr v0, v2

    .line 180
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    if-eqz v0, :cond_7

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    :goto_6
    add-int/2addr v0, v2

    .line 181
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v0, :cond_8

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v0, v2

    .line 182
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v0, :cond_9

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v0, v2

    .line 183
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    if-eqz v0, :cond_a

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    :goto_9
    add-int/2addr v0, v2

    .line 184
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 185
    return v0

    :cond_1
    move v0, v1

    .line 174
    goto/16 :goto_0

    :cond_2
    move v0, v1

    .line 175
    goto :goto_1

    :cond_3
    move v0, v1

    .line 176
    goto :goto_2

    :cond_4
    move v0, v1

    .line 177
    goto :goto_3

    :cond_5
    move v0, v1

    .line 178
    goto :goto_4

    :cond_6
    move v0, v1

    .line 179
    goto :goto_5

    :cond_7
    move v0, v1

    .line 180
    goto :goto_6

    :cond_8
    move v0, v1

    .line 181
    goto :goto_7

    :cond_9
    move v0, v1

    .line 182
    goto :goto_8

    :cond_a
    move v0, v1

    .line 183
    goto :goto_9
.end method

.method protected abstract postUpload()Ljava/lang/String;
.end method

.method protected abstract preUpload()V
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/16 v3, 0x27

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AbstractImageUploadImpl{client="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->client:Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", conf="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", apiKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", oauth="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", uploadUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->uploadUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", postParameter="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", appendParameter="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    if-nez v2, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->headers:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", httpResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ltwitter4j/media/AbstractImageUploadImpl;->appendParameter:[Ltwitter4j/internal/http/HttpParameter;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_1
.end method

.method public upload(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 92
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "media"

    invoke-direct {v0, v1, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/io/File;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    .line 93
    invoke-direct {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->upload()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public upload(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 85
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "media"

    invoke-direct {v0, v1, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/io/File;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    .line 86
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "message"

    invoke-direct {v0, v1, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    .line 87
    invoke-direct {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->upload()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public upload(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "media"

    invoke-direct {v0, v1, p1, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    .line 73
    invoke-direct {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->upload()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public upload(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 78
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "media"

    invoke-direct {v0, v1, p1, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->image:Ltwitter4j/internal/http/HttpParameter;

    .line 79
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "message"

    invoke-direct {v0, v1, p3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/media/AbstractImageUploadImpl;->message:Ltwitter4j/internal/http/HttpParameter;

    .line 80
    invoke-direct {p0}, Ltwitter4j/media/AbstractImageUploadImpl;->upload()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
