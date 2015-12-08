.class public final Lcom/facebook/share/ShareApi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final shareContent:Lcom/facebook/share/model/ShareContent;


# direct methods
.method public constructor <init>(Lcom/facebook/share/model/ShareContent;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/facebook/share/ShareApi;->shareContent:Lcom/facebook/share/model/ShareContent;

    .line 78
    return-void
.end method

.method static synthetic access$000(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 55
    invoke-static {p0}, Lcom/facebook/share/ShareApi;->handleImagesOnAction(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$100(Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 55
    invoke-static {p0, p1}, Lcom/facebook/share/ShareApi;->stageArrayList(Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 55
    invoke-static {p0, p1}, Lcom/facebook/share/ShareApi;->stageOpenGraphObject(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method static synthetic access$300(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 0

    .prologue
    .line 55
    invoke-static {p0, p1}, Lcom/facebook/share/ShareApi;->stagePhoto(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    return-void
.end method

.method private static handleImagesOnAction(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 189
    const-string v1, "image"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 190
    if-eqz v1, :cond_1

    .line 193
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 194
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 195
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 196
    if-eqz v3, :cond_0

    .line 197
    invoke-static {p0, v0, v3}, Lcom/facebook/share/ShareApi;->putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V

    .line 194
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 200
    :cond_0
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 201
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "image[%d][url]"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 212
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 213
    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/facebook/share/ShareApi;->putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V

    .line 214
    const-string v0, "image"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    :cond_1
    :goto_2
    return-void

    .line 204
    :cond_2
    :try_start_2
    const-string v0, "image"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method private static putImageInBundleWithArrayFormat(Landroid/os/Bundle;ILorg/json/JSONObject;)V
    .locals 7

    .prologue
    .line 226
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 227
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 229
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "image[%d][%s]"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 230
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_0
    return-void
.end method

.method public static share(Lcom/facebook/share/model/ShareContent;Lcom/facebook/FacebookCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/share/ShareApi;

    invoke-direct {v0, p0}, Lcom/facebook/share/ShareApi;-><init>(Lcom/facebook/share/model/ShareContent;)V

    invoke-virtual {v0, p1}, Lcom/facebook/share/ShareApi;->share(Lcom/facebook/FacebookCallback;)V

    .line 69
    return-void
.end method

.method private shareLinkContent(Lcom/facebook/share/model/ShareLinkContent;Lcom/facebook/FacebookCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareLinkContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 295
    new-instance v5, Lcom/facebook/share/ShareApi$4;

    invoke-direct {v5, p0, p2}, Lcom/facebook/share/ShareApi$4;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V

    .line 303
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 304
    const-string v0, "link"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->getUriString(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "picture"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/internal/Utility;->getUriString(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const-string v0, "name"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string v0, "description"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getContentDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    const-string v0, "ref"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareLinkContent;->getRef()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    new-instance v0, Lcom/facebook/GraphRequest;

    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    const-string v2, "/me/feed"

    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;)V

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 315
    return-void
.end method

.method private shareOpenGraphContent(Lcom/facebook/share/model/ShareOpenGraphContent;Lcom/facebook/FacebookCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareOpenGraphContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 149
    new-instance v4, Lcom/facebook/share/ShareApi$1;

    invoke-direct {v4, p0, p2}, Lcom/facebook/share/ShareApi$1;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V

    .line 157
    invoke-virtual {p1}, Lcom/facebook/share/model/ShareOpenGraphContent;->getAction()Lcom/facebook/share/model/ShareOpenGraphAction;

    move-result-object v3

    .line 158
    invoke-virtual {v3}, Lcom/facebook/share/model/ShareOpenGraphAction;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 159
    new-instance v0, Lcom/facebook/share/ShareApi$2;

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/ShareApi$2;-><init>(Lcom/facebook/share/ShareApi;Landroid/os/Bundle;Lcom/facebook/share/model/ShareOpenGraphAction;Lcom/facebook/GraphRequest$Callback;Lcom/facebook/FacebookCallback;)V

    .line 182
    invoke-static {v2, v0}, Lcom/facebook/share/ShareApi;->stageOpenGraphAction(Landroid/os/Bundle;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 183
    return-void
.end method

.method private sharePhotoContent(Lcom/facebook/share/model/SharePhotoContent;Lcom/facebook/FacebookCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/SharePhotoContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 236
    new-instance v4, Lcom/facebook/internal/Mutable;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/facebook/internal/Mutable;-><init>(Ljava/lang/Object;)V

    .line 237
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v6

    .line 238
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 239
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 240
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 241
    new-instance v0, Lcom/facebook/share/ShareApi$3;

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/share/ShareApi$3;-><init>(Lcom/facebook/share/ShareApi;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/facebook/internal/Mutable;Lcom/facebook/FacebookCallback;)V

    .line 269
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhotoContent;->getPhotos()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/share/model/SharePhoto;

    .line 270
    invoke-virtual {v1}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 271
    invoke-virtual {v1}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    .line 272
    if-eqz v3, :cond_2

    .line 273
    invoke-static {v6, v3, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadPhotoRequest(Lcom/facebook/AccessToken;Landroid/graphics/Bitmap;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 288
    :catch_0
    move-exception v0

    .line 289
    invoke-static {p2, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    .line 291
    :cond_1
    return-void

    .line 277
    :cond_2
    if-eqz v1, :cond_0

    .line 278
    :try_start_1
    invoke-static {v6, v1, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadPhotoRequest(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 284
    :cond_3
    iget-object v0, v4, Lcom/facebook/internal/Mutable;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/facebook/internal/Mutable;->value:Ljava/lang/Object;

    .line 285
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequest;

    .line 286
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private shareVideoContent(Lcom/facebook/share/model/ShareVideoContent;Lcom/facebook/FacebookCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/share/model/ShareVideoContent;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 319
    new-instance v0, Lcom/facebook/share/ShareApi$5;

    invoke-direct {v0, p0, p2}, Lcom/facebook/share/ShareApi$5;-><init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V

    .line 335
    :try_start_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareVideoContent;->getVideo()Lcom/facebook/share/model/ShareVideo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/share/model/ShareVideo;->getLocalUrl()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadVideoRequest(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 344
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->getParameters()Landroid/os/Bundle;

    move-result-object v1

    .line 345
    const-string v2, "title"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareVideoContent;->getContentTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v2, "description"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareVideoContent;->getContentDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v2, "ref"

    invoke-virtual {p1}, Lcom/facebook/share/model/ShareVideoContent;->getRef()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 350
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 351
    :goto_0
    return-void

    .line 339
    :catch_0
    move-exception v0

    .line 340
    invoke-static {p2, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private static stageArrayList(Ljava/util/ArrayList;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 3

    .prologue
    .line 356
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 357
    new-instance v1, Lcom/facebook/share/ShareApi$6;

    invoke-direct {v1, p0, v0}, Lcom/facebook/share/ShareApi$6;-><init>(Ljava/util/ArrayList;Lorg/json/JSONArray;)V

    .line 400
    new-instance v2, Lcom/facebook/share/ShareApi$7;

    invoke-direct {v2, p1, v0}, Lcom/facebook/share/ShareApi$7;-><init>(Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lorg/json/JSONArray;)V

    .line 412
    invoke-static {v1, v2}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 413
    return-void
.end method

.method private static stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/internal/CollectionMapper$Collection",
            "<TT;>;",
            "Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 418
    new-instance v0, Lcom/facebook/share/ShareApi$8;

    invoke-direct {v0}, Lcom/facebook/share/ShareApi$8;-><init>()V

    .line 436
    invoke-static {p0, v0, p1}, Lcom/facebook/internal/CollectionMapper;->iterate(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$ValueMapper;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 437
    return-void
.end method

.method private static stageOpenGraphAction(Landroid/os/Bundle;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V
    .locals 1

    .prologue
    .line 442
    new-instance v0, Lcom/facebook/share/ShareApi$9;

    invoke-direct {v0, p0}, Lcom/facebook/share/ShareApi$9;-><init>(Landroid/os/Bundle;)V

    .line 464
    invoke-static {v0, p1}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    .line 465
    return-void
.end method

.method private static stageOpenGraphObject(Lcom/facebook/share/model/ShareOpenGraphObject;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 5

    .prologue
    .line 470
    const-string v0, "type"

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareOpenGraphObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 471
    if-nez v0, :cond_0

    .line 472
    const-string v0, "og:type"

    invoke-virtual {p0, v0}, Lcom/facebook/share/model/ShareOpenGraphObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 475
    :cond_0
    if-nez v0, :cond_1

    .line 476
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Open Graph objects must contain a type value."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    .line 568
    :goto_0
    return-void

    .line 480
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 481
    new-instance v2, Lcom/facebook/share/ShareApi$10;

    invoke-direct {v2, p0, v1}, Lcom/facebook/share/ShareApi$10;-><init>(Lcom/facebook/share/model/ShareOpenGraphObject;Lorg/json/JSONObject;)V

    .line 508
    new-instance v3, Lcom/facebook/share/ShareApi$11;

    invoke-direct {v3, p1}, Lcom/facebook/share/ShareApi$11;-><init>(Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    .line 539
    new-instance v4, Lcom/facebook/share/ShareApi$12;

    invoke-direct {v4, v1, v0, v3, p1}, Lcom/facebook/share/ShareApi$12;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V

    .line 567
    invoke-static {v2, v4}, Lcom/facebook/share/ShareApi;->stageCollectionValues(Lcom/facebook/internal/CollectionMapper$Collection;Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;)V

    goto :goto_0
.end method

.method private static stagePhoto(Lcom/facebook/share/model/SharePhoto;Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;)V
    .locals 3

    .prologue
    .line 573
    invoke-virtual {p0}, Lcom/facebook/share/model/SharePhoto;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 574
    invoke-virtual {p0}, Lcom/facebook/share/model/SharePhoto;->getImageUrl()Landroid/net/Uri;

    move-result-object v1

    .line 575
    if-nez v0, :cond_0

    if-eqz v1, :cond_3

    .line 576
    :cond_0
    new-instance v2, Lcom/facebook/share/ShareApi$13;

    invoke-direct {v2, p1, p0}, Lcom/facebook/share/ShareApi$13;-><init>(Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lcom/facebook/share/model/SharePhoto;)V

    .line 617
    if-eqz v0, :cond_1

    .line 618
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-static {v1, v0, v2}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/graphics/Bitmap;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 640
    :goto_0
    return-void

    .line 624
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-static {v0, v1, v2}, Lcom/facebook/share/internal/ShareInternalUtility;->newUploadStagingResourceWithImageRequest(Lcom/facebook/AccessToken;Landroid/net/Uri;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 629
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    .line 630
    if-nez v0, :cond_2

    .line 631
    const-string v0, "Error staging photo."

    .line 633
    :cond_2
    new-instance v1, Lcom/facebook/FacebookException;

    invoke-direct {v1, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 637
    :cond_3
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Photos must have an imageURL or bitmap."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method


# virtual methods
.method public final canShare()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 95
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getShareContent()Lcom/facebook/share/model/ShareContent;

    move-result-object v1

    if-nez v1, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    .line 99
    if-eqz v1, :cond_0

    .line 102
    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v1

    .line 103
    if-eqz v1, :cond_0

    .line 106
    const-string v0, "publish_actions"

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final getShareContent()Lcom/facebook/share/model/ShareContent;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/share/ShareApi;->shareContent:Lcom/facebook/share/model/ShareContent;

    return-object v0
.end method

.method public final share(Lcom/facebook/FacebookCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 115
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->canShare()Z

    move-result v0

    if-nez v0, :cond_1

    .line 116
    const-string v0, "Insufficient permissions for sharing content via Api."

    invoke-static {p1, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithError(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    .line 140
    :cond_0
    :goto_0
    return-void

    .line 120
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/share/ShareApi;->getShareContent()Lcom/facebook/share/model/ShareContent;

    move-result-object v0

    .line 124
    :try_start_0
    invoke-static {v0}, Lcom/facebook/share/internal/ShareContentValidation;->validateForApiShare(Lcom/facebook/share/model/ShareContent;)V
    :try_end_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    instance-of v1, v0, Lcom/facebook/share/model/ShareLinkContent;

    if-eqz v1, :cond_2

    .line 131
    check-cast v0, Lcom/facebook/share/model/ShareLinkContent;

    invoke-direct {p0, v0, p1}, Lcom/facebook/share/ShareApi;->shareLinkContent(Lcom/facebook/share/model/ShareLinkContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    .line 126
    invoke-static {p1, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithException(Lcom/facebook/FacebookCallback;Ljava/lang/Exception;)V

    goto :goto_0

    .line 132
    :cond_2
    instance-of v1, v0, Lcom/facebook/share/model/SharePhotoContent;

    if-eqz v1, :cond_3

    .line 133
    check-cast v0, Lcom/facebook/share/model/SharePhotoContent;

    invoke-direct {p0, v0, p1}, Lcom/facebook/share/ShareApi;->sharePhotoContent(Lcom/facebook/share/model/SharePhotoContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 134
    :cond_3
    instance-of v1, v0, Lcom/facebook/share/model/ShareVideoContent;

    if-eqz v1, :cond_4

    .line 135
    check-cast v0, Lcom/facebook/share/model/ShareVideoContent;

    invoke-direct {p0, v0, p1}, Lcom/facebook/share/ShareApi;->shareVideoContent(Lcom/facebook/share/model/ShareVideoContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 136
    :cond_4
    instance-of v1, v0, Lcom/facebook/share/model/ShareOpenGraphContent;

    if-eqz v1, :cond_0

    .line 137
    check-cast v0, Lcom/facebook/share/model/ShareOpenGraphContent;

    invoke-direct {p0, v0, p1}, Lcom/facebook/share/ShareApi;->shareOpenGraphContent(Lcom/facebook/share/model/ShareOpenGraphContent;Lcom/facebook/FacebookCallback;)V

    goto :goto_0
.end method
