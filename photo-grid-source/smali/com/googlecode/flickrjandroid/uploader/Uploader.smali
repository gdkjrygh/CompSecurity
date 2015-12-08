.class public Lcom/googlecode/flickrjandroid/uploader/Uploader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final REPLACE_PATH:Ljava/lang/String; = "/services/replace/"

.field public static final UPLOAD_PATH:Ljava/lang/String; = "/services/upload/"

.field public static final URL_REPLACE:Ljava/lang/String; = "https://api.flickr.com/services/replace/"

.field public static final URL_UPLOAD:Ljava/lang/String; = "https://api.flickr.com/services/upload/"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transport:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    :try_start_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->apiKey:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->sharedSecret:Ljava/lang/String;

    .line 62
    new-instance v0, Lcom/googlecode/flickrjandroid/REST;

    const-string v1, "api.flickr.com"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/REST;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    .line 63
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    const-class v1, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/Transport;->setResponseClass(Ljava/lang/Class;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-void

    :catch_0
    move-exception v0

    .line 65
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljavax/xml/parsers/ParserConfigurationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public replace(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .prologue
    .line 196
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->apiKey:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "async"

    if-eqz p4, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v0, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    new-instance v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 205
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/googlecode/flickrjandroid/Transport;->replace(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    .line 206
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->isError()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 207
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 199
    :cond_0
    const-string v0, "0"

    goto :goto_0

    .line 210
    :cond_1
    if-eqz p4, :cond_2

    .line 211
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getTicketId()Ljava/lang/String;

    move-result-object v0

    .line 215
    :goto_1
    return-object v0

    .line 213
    :cond_2
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getPhotoId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public replace(Ljava/lang/String;[BLjava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .prologue
    .line 231
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 232
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->apiKey:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "async"

    if-eqz p4, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "photo_id"

    invoke-direct {v0, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    new-instance v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 240
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/googlecode/flickrjandroid/Transport;->replace(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    .line 241
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->isError()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 242
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 234
    :cond_0
    const-string v0, "0"

    goto :goto_0

    .line 245
    :cond_1
    if-eqz p4, :cond_2

    .line 246
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getTicketId()Ljava/lang/String;

    move-result-object v0

    .line 250
    :goto_1
    return-object v0

    .line 248
    :cond_2
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getPhotoId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public upload(Ljava/lang/String;Ljava/io/InputStream;Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 139
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 140
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->apiKey:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 143
    if-eqz v0, :cond_0

    .line 144
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "title"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_0
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getDescription()Ljava/lang/String;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_1

    .line 148
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "description"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    :cond_1
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getTags()Ljava/util/Collection;

    move-result-object v0

    .line 151
    if-eqz v0, :cond_2

    .line 152
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tags"

    const-string v4, " "

    invoke-static {v0, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_2
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_public"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isPublicFlag()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "1"

    :goto_0
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_family"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isFamilyFlag()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "1"

    :goto_1
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_friend"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isFriendFlag()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "1"

    :goto_2
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "async"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isAsync()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "1"

    :goto_3
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getSafetyLevel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 160
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "safety_level"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getSafetyLevel()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_3
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getContentType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 163
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "content_type"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getContentType()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    :cond_4
    new-instance v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 169
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/googlecode/flickrjandroid/Transport;->upload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    .line 170
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->isError()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 171
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 155
    :cond_5
    const-string v0, "0"

    goto/16 :goto_0

    .line 156
    :cond_6
    const-string v0, "0"

    goto/16 :goto_1

    .line 157
    :cond_7
    const-string v0, "0"

    goto :goto_2

    .line 158
    :cond_8
    const-string v0, "0"

    goto :goto_3

    .line 174
    :cond_9
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isAsync()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 175
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getTicketId()Ljava/lang/String;

    move-result-object v0

    .line 179
    :goto_4
    return-object v0

    .line 177
    :cond_a
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getPhotoId()Ljava/lang/String;

    move-result-object v0

    goto :goto_4
.end method

.method public upload(Ljava/lang/String;[BLcom/googlecode/flickrjandroid/uploader/UploadMetaData;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 80
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->apiKey:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "title"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_0
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getDescription()Ljava/lang/String;

    move-result-object v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "description"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_1
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getTags()Ljava/util/Collection;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tags"

    const-string v4, " "

    invoke-static {v0, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    :cond_2
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_public"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isPublicFlag()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "1"

    :goto_0
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_family"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isFamilyFlag()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "1"

    :goto_1
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "is_friend"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isFriendFlag()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "1"

    :goto_2
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    new-instance v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isHidden()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 101
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "hidden"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isHidden()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "1"

    :goto_3
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_3
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getSafetyLevel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 105
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "safety_level"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getSafetyLevel()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_4
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "async"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isAsync()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "1"

    :goto_4
    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getContentType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 111
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "content_type"

    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->getContentType()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    :cond_5
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 115
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->transport:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/uploader/Uploader;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/googlecode/flickrjandroid/Transport;->upload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    .line 116
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->isError()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 117
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 94
    :cond_6
    const-string v0, "0"

    goto/16 :goto_0

    .line 95
    :cond_7
    const-string v0, "0"

    goto/16 :goto_1

    .line 96
    :cond_8
    const-string v0, "0"

    goto/16 :goto_2

    .line 101
    :cond_9
    const-string v0, "0"

    goto :goto_3

    .line 108
    :cond_a
    const-string v0, "0"

    goto :goto_4

    .line 120
    :cond_b
    invoke-virtual {p3}, Lcom/googlecode/flickrjandroid/uploader/UploadMetaData;->isAsync()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 121
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getTicketId()Ljava/lang/String;

    move-result-object v0

    .line 125
    :goto_5
    return-object v0

    .line 123
    :cond_c
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->getPhotoId()Ljava/lang/String;

    move-result-object v0

    goto :goto_5
.end method
