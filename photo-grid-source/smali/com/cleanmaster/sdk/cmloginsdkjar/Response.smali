.class public Lcom/cleanmaster/sdk/cmloginsdkjar/Response;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final BODY_KEY:Ljava/lang/String; = "body"

.field private static final CODE_KEY:Ljava/lang/String; = "code"

.field private static final INVALID_SESSION_FACEBOOK_ERROR_CODE:I = 0xbe

.field public static final NON_JSON_RESPONSE_PROPERTY:Ljava/lang/String; = "FACEBOOK_NON_JSON_RESULT"

.field private static final RESPONSE_CACHE_TAG:Ljava/lang/String; = "ResponseCache"

.field private static final RESPONSE_LOG_TAG:Ljava/lang/String; = "Response"

.field public static final SUCCESS_KEY:Ljava/lang/String; = "success"

.field private static responseCache:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;


# instance fields
.field private final connection:Ljava/net/HttpURLConnection;

.field private final error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

.field private final graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

.field private final graphObjectList:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">;"
        }
    .end annotation
.end field

.field private final isFromCache:Z

.field private final rawResponse:Ljava/lang/String;

.field private final request:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 68
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, v3

    move-object v5, v3

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;ZLcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    .line 69
    return-void
.end method

.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;ZLcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Ljava/net/HttpURLConnection;",
            "Ljava/lang/String;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">;Z",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->request:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 73
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->connection:Ljava/net/HttpURLConnection;

    .line 74
    iput-object p3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->rawResponse:Ljava/lang/String;

    .line 75
    iput-object p4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    .line 76
    iput-object p5, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObjectList:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    .line 77
    iput-boolean p6, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->isFromCache:Z

    .line 78
    iput-object p7, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    .line 79
    return-void
.end method

.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Z)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 59
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p5

    move-object v7, v5

    invoke-direct/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;ZLcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    .line 60
    return-void
.end method

.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            "Ljava/net/HttpURLConnection;",
            "Ljava/lang/String;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 64
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    move-object v7, v4

    invoke-direct/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;ZLcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    .line 65
    return-void
.end method

.method static constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;",
            "Ljava/net/HttpURLConnection;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 460
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    .line 461
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 463
    new-instance v4, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-direct {v5, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v4, v0, p1, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    .line 464
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 466
    :cond_0
    return-object v3
.end method

.method private static createResponseFromObject(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/Object;ZLjava/lang/Object;)Lcom/cleanmaster/sdk/cmloginsdkjar/Response;
    .locals 6

    .prologue
    .line 422
    instance-of v0, p2, Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    .line 423
    check-cast p2, Lorg/json/JSONObject;

    .line 425
    invoke-static {p2, p4, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->checkResponseAndCreateError(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    move-result-object v1

    .line 427
    if-eqz v1, :cond_0

    .line 428
    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getErrorCode()I

    .line 431
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-direct {v0, p0, p1, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    .line 449
    :goto_0
    return-object v0

    .line 434
    :cond_0
    const-string v0, "body"

    const-string v1, "FACEBOOK_NON_JSON_RESULT"

    invoke-static {p2, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 436
    instance-of v0, v1, Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 437
    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->create(Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v4

    .line 438
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    move-object v2, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Z)V

    goto :goto_0

    .line 439
    :cond_1
    instance-of v0, v1, Lorg/json/JSONArray;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 440
    check-cast v0, Lorg/json/JSONArray;

    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-static {v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    move-result-object v4

    .line 442
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    move-object v2, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;Z)V

    goto :goto_0

    .line 445
    :cond_2
    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 448
    :cond_3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne p2, v0, :cond_4

    .line 449
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Z)V

    goto :goto_0

    .line 451
    :cond_4
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Got unexpected object type in response, class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    .line 453
    const/16 v1, 0x4e26

    invoke-virtual {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 454
    throw v0
.end method

.method private static createResponsesFromObject(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;",
            "Ljava/lang/Object;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v7, 0x4e21

    const/4 v2, 0x0

    .line 362
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    if-nez p3, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 364
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 365
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 368
    const/4 v0, 0x1

    if-ne v3, v0, :cond_3

    .line 369
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 374
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 375
    const-string v1, "body"

    invoke-virtual {v5, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 376
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    .line 377
    :goto_0
    const-string v6, "code"

    invoke-virtual {v5, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 379
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 380
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 395
    :goto_1
    instance-of v0, v1, Lorg/json/JSONArray;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-eq v0, v3, :cond_4

    .line 396
    :cond_1
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "Unexpected number of results"

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    .line 397
    const/16 v1, 0x4e25

    invoke-virtual {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 398
    throw v0

    .line 376
    :cond_2
    const/16 v1, 0xc8

    goto :goto_0

    .line 384
    :catch_0
    move-exception v1

    .line 385
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v5, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 386
    invoke-virtual {v5, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 387
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-direct {v6, p0, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v1, v0, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, p2

    .line 392
    goto :goto_1

    .line 388
    :catch_1
    move-exception v1

    .line 389
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v5, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 390
    const/16 v1, 0x4e22

    invoke-virtual {v5, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 391
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-direct {v6, p0, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v1, v0, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v1, p2

    goto :goto_1

    .line 401
    :cond_4
    check-cast v1, Lorg/json/JSONArray;

    .line 403
    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 404
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 406
    :try_start_1
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 407
    invoke-static {v0, p0, v3, p3, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->createResponseFromObject(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Ljava/lang/Object;ZLjava/lang/Object;)Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_1 .. :try_end_1} :catch_3

    .line 403
    :goto_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 408
    :catch_2
    move-exception v3

    .line 409
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v5, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 410
    invoke-virtual {v5, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 411
    new-instance v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-direct {v6, p0, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v3, v0, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 412
    :catch_3
    move-exception v3

    .line 413
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-direct {v6, p0, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v5, v0, p0, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 417
    :cond_5
    return-object v4
.end method

.method static createResponsesFromStream(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/net/HttpURLConnection;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 334
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 335
    const-string v1, "Response"

    const-string v2, "Response (raw)\n  Size: %d\n  Response:\n%s\n"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-static {v0, p1, p2, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->createResponsesFromString(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static createResponsesFromString(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/HttpURLConnection;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 344
    new-instance v0, Lorg/json/JSONTokener;

    invoke-direct {v0, p0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 345
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    .line 348
    instance-of v1, v0, Lorg/json/JSONObject;

    if-nez v1, :cond_0

    .line 349
    const-string v1, "CmLoginSDK.ERROR"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "createResponsesFromString wrong response:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    :cond_0
    check-cast v0, Lorg/json/JSONObject;

    .line 353
    invoke-static {p1, p2, v0, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->createResponsesFromObject(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;Z)Ljava/util/List;

    move-result-object v0

    .line 354
    const-string v1, "Response"

    const-string v2, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getId()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    return-object v0
.end method

.method static fromHttpConnection(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 263
    const/4 v1, 0x0

    .line 270
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v2, 0x190

    if-lt v0, v2, :cond_0

    .line 271
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    .line 282
    :goto_0
    const/4 v0, 0x0

    invoke-static {v1, p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->createResponsesFromStream(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Z)Ljava/util/List;
    :try_end_0
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    :goto_1
    return-object v0

    .line 273
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_1
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    goto :goto_0

    .line 284
    :catch_0
    move-exception v0

    .line 285
    :try_start_2
    const-string v2, "Response"

    const-string v3, "Response <Error>: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-static {p1, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    .line 288
    :catch_1
    move-exception v0

    .line 289
    :try_start_3
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 290
    const/16 v0, 0x4e24

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 291
    invoke-static {p1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    .line 292
    :catch_2
    move-exception v0

    .line 293
    :try_start_4
    const-string v2, "Response"

    const-string v3, "Response <Error>: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 295
    const/16 v0, 0x4e21

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 296
    invoke-static {p1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    .line 297
    :catch_3
    move-exception v0

    .line 298
    :try_start_5
    const-string v2, "Response"

    const-string v3, "Response <Error>: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 300
    const/16 v0, 0x4e22

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 301
    invoke-static {p1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_1

    .line 302
    :catch_4
    move-exception v0

    .line 303
    :try_start_6
    const-string v2, "Response"

    const-string v3, "Response <Error>: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 305
    const/16 v0, 0x4e23

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 306
    invoke-static {p1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto/16 :goto_1

    .line 307
    :catch_5
    move-exception v0

    .line 308
    :try_start_7
    const-string v2, "Response"

    const-string v3, "Response <Error>: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 310
    const/16 v0, 0x4e24

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 311
    invoke-static {p1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v0

    .line 313
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    throw v0
.end method

.method static getResponseCache()Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;
    .locals 4

    .prologue
    .line 251
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->responseCache:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    if-nez v0, :cond_0

    .line 252
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getParentActivity()Landroid/app/Activity;

    move-result-object v0

    .line 253
    if-eqz v0, :cond_0

    .line 254
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    const-string v2, "ResponseCache"

    new-instance v3, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;

    invoke-direct {v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;-><init>()V

    invoke-direct {v1, v0, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;)V

    sput-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->responseCache:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    .line 258
    :cond_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->responseCache:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    return-object v0
.end method

.method static writeResponseToFile(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/io/File;)V
    .locals 3

    .prologue
    .line 318
    const/4 v0, 0x0

    .line 322
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 323
    :try_start_1
    invoke-static {p0, p1, v0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->readStreamToFile(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/io/InputStream;Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 327
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 328
    :goto_0
    return-void

    .line 325
    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 327
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    :goto_1
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_1
.end method


# virtual methods
.method public final getConnection()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->connection:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public final getError()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    return-object v0
.end method

.method public final getGraphObject()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    return-object v0
.end method

.method public final getGraphObjectAs(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    if-nez v0, :cond_0

    .line 108
    const/4 v0, 0x0

    .line 113
    :goto_0
    return-object v0

    .line 110
    :cond_0
    if-nez p1, :cond_1

    .line 111
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Must pass in a valid interface that extends GraphObject"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-interface {v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    goto :goto_0
.end method

.method public final getGraphObjectList()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObjectList:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    return-object v0
.end method

.method public final getGraphObjectListAs(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 133
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObjectList:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    if-nez v0, :cond_0

    .line 134
    const/4 v0, 0x0

    .line 136
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObjectList:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    invoke-interface {v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;->castToListOf(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    move-result-object v0

    goto :goto_0
.end method

.method public final getIsFromCache()Z
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->isFromCache:Z

    return v0
.end method

.method public getRawResponse()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->rawResponse:Ljava/lang/String;

    return-object v0
.end method

.method public getRequest()Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->request:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    return-object v0
.end method

.method public getRequestForPagedResults(Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 191
    .line 192
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    if-eqz v0, :cond_4

    .line 193
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/ae;

    invoke-interface {v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ae;

    .line 194
    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/ae;->a()Lcom/cleanmaster/sdk/cmloginsdkjar/af;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_4

    .line 196
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->NEXT:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    if-ne p1, v2, :cond_1

    .line 197
    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/af;->a()Ljava/lang/String;

    move-result-object v0

    .line 203
    :goto_0
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 220
    :cond_0
    :goto_1
    return-object v1

    .line 199
    :cond_1
    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/af;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 207
    :cond_2
    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->request:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getUrlForSingleRequest()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 215
    :cond_3
    :try_start_0
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->request:Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getSid()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v2

    .line 220
    goto :goto_1

    .line 217
    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 230
    :try_start_0
    const-string v1, "%d"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->connection:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 235
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{Response:  responseCode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", graphObject: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->graphObject:Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFromCache:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->isFromCache:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 230
    :cond_0
    const/16 v0, 0xc8

    goto :goto_0

    .line 232
    :catch_0
    move-exception v0

    const-string v0, "unknown"

    goto :goto_1
.end method
