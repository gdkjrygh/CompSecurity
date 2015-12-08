.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BODY_KEY:Ljava/lang/String; = "body"

.field private static final CODE_KEY:Ljava/lang/String; = "code"

.field private static final EC_APP_NOT_INSTALLED:I = 0x1ca

.field private static final EC_APP_TOO_MANY_CALLS:I = 0x4

.field private static final EC_EXPIRED:I = 0x1cf

.field private static final EC_INVALID_SESSION:I = 0x66

.field private static final EC_INVALID_TOKEN:I = 0xbe

.field private static final EC_PASSWORD_CHANGED:I = 0x1cc

.field private static final EC_PERMISSION_DENIED:I = 0xa

.field private static final EC_RANGE_PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

.field private static final EC_SERVICE_UNAVAILABLE:I = 0x2

.field private static final EC_UNCONFIRMED_USER:I = 0x1d0

.field private static final EC_UNKNOWN_ERROR:I = 0x1

.field private static final EC_USER_CHECKPOINTED:I = 0x1cb

.field private static final EC_USER_TOO_MANY_CALLS:I = 0x11

.field private static final ERROR_CODE_FIELD_KEY:Ljava/lang/String; = "code"

.field private static final ERROR_CODE_KEY:Ljava/lang/String; = "error_code"

.field private static final ERROR_IS_TRANSIENT_KEY:Ljava/lang/String; = "is_transient"

.field private static final ERROR_KEY:Ljava/lang/String; = "error"

.field private static final ERROR_MESSAGE_FIELD_KEY:Ljava/lang/String; = "message"

.field private static final ERROR_MSG_KEY:Ljava/lang/String; = "error_msg"

.field private static final ERROR_REASON_KEY:Ljava/lang/String; = "error_reason"

.field private static final ERROR_SUB_CODE_KEY:Ljava/lang/String; = "error_subcode"

.field private static final ERROR_TYPE_FIELD_KEY:Ljava/lang/String; = "type"

.field private static final ERROR_USER_MSG_KEY:Ljava/lang/String; = "error_user_msg"

.field private static final ERROR_USER_TITLE_KEY:Ljava/lang/String; = "error_user_title"

.field private static final HTTP_RANGE_CLIENT_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

.field private static final HTTP_RANGE_SERVER_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

.field private static final HTTP_RANGE_SUCCESS:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

.field public static final INVALID_ERROR_CODE:I = -0x1

.field public static final INVALID_HTTP_STATUS_CODE:I = -0x1

.field private static final INVALID_MESSAGE_ID:I


# instance fields
.field private final batchRequestResult:Ljava/lang/Object;

.field private final category:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field private final connection:Ljava/net/HttpURLConnection;

.field private final errorCode:I

.field private final errorIsTransient:Z

.field private final errorMessage:Ljava/lang/String;

.field private final errorType:Ljava/lang/String;

.field private final errorUserMessage:Ljava/lang/String;

.field private final errorUserTitle:Ljava/lang/String;

.field private final exception:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

.field private final requestResult:Lorg/json/JSONObject;

.field private final requestResultBody:Lorg/json/JSONObject;

.field private final requestStatusCode:I

.field private final shouldNotifyUser:Z

.field private final subErrorCode:I

.field private final userActionMessageId:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/16 v2, 0x12b

    const/16 v1, 0xc8

    const/4 v3, 0x0

    .line 68
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;-><init>(IIB)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->EC_RANGE_PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    .line 75
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;-><init>(IIB)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_SUCCESS:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    .line 76
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    const/16 v1, 0x190

    const/16 v2, 0x1f3

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;-><init>(IIB)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_CLIENT_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    .line 77
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    const/16 v1, 0x1f4

    const/16 v2, 0x257

    invoke-direct {v0, v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;-><init>(IIB)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_SERVER_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    .locals 14

    .prologue
    .line 180
    const/4 v13, 0x0

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)V

    .line 182
    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)V
    .locals 5

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->requestStatusCode:I

    .line 101
    iput p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorCode:I

    .line 102
    iput p3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->subErrorCode:I

    .line 103
    iput-object p4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorType:Ljava/lang/String;

    .line 104
    iput-object p5, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorMessage:Ljava/lang/String;

    .line 105
    iput-object p9, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->requestResultBody:Lorg/json/JSONObject;

    .line 106
    iput-object p10, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->requestResult:Lorg/json/JSONObject;

    .line 107
    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->batchRequestResult:Ljava/lang/Object;

    .line 108
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->connection:Ljava/net/HttpURLConnection;

    .line 109
    iput-object p6, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorUserTitle:Ljava/lang/String;

    .line 110
    iput-object p7, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorUserMessage:Ljava/lang/String;

    .line 111
    iput-boolean p8, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorIsTransient:Z

    .line 113
    const/4 v1, 0x0

    .line 114
    if-eqz p13, :cond_0

    .line 115
    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->exception:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    .line 116
    const/4 v1, 0x1

    move v3, v1

    .line 124
    :goto_0
    const/4 v2, 0x0

    .line 125
    const/4 v1, 0x0

    .line 127
    if-eqz v3, :cond_1

    .line 128
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->CLIENT:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 129
    const/4 v1, 0x0

    move-object v3, v2

    move v2, v1

    .line 169
    :goto_1
    if-eqz p7, :cond_10

    invoke-virtual {p7}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_10

    const/4 v1, 0x1

    .line 171
    :goto_2
    iput-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->category:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 172
    iput v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->userActionMessageId:I

    .line 173
    iput-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->shouldNotifyUser:Z

    .line 174
    return-void

    .line 119
    :cond_0
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->exception:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    move v3, v1

    goto :goto_0

    .line 131
    :cond_1
    const/4 v3, 0x1

    if-eq p2, v3, :cond_2

    const/4 v3, 0x2

    if-ne p2, v3, :cond_4

    .line 132
    :cond_2
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->SERVER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 157
    :cond_3
    :goto_3
    if-nez v2, :cond_11

    .line 158
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_CLIENT_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-virtual {v2, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 159
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->BAD_REQUEST:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    move-object v3, v2

    move v2, v1

    goto :goto_1

    .line 133
    :cond_4
    const/4 v3, 0x4

    if-eq p2, v3, :cond_5

    const/16 v3, 0x11

    if-ne p2, v3, :cond_6

    .line 134
    :cond_5
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->THROTTLING:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    goto :goto_3

    .line 135
    :cond_6
    const/16 v3, 0xa

    if-eq p2, v3, :cond_7

    sget-object v3, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->EC_RANGE_PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-virtual {v3, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a(I)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 136
    :cond_7
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 151
    :cond_8
    :goto_4
    const/16 v2, 0x64

    move v4, v2

    move-object v2, v1

    move v1, v4

    goto :goto_3

    .line 138
    :cond_9
    const/16 v3, 0x66

    if-eq p2, v3, :cond_a

    const/16 v3, 0xbe

    if-ne p2, v3, :cond_3

    .line 139
    :cond_a
    const/16 v1, 0x1cb

    if-eq p3, v1, :cond_b

    const/16 v1, 0x1d0

    if-ne p3, v1, :cond_c

    .line 140
    :cond_b
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_RETRY:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    goto :goto_4

    .line 144
    :cond_c
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_REOPEN_SESSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 146
    const/16 v2, 0x1ca

    if-eq p3, v2, :cond_d

    const/16 v2, 0x1cf

    if-ne p3, v2, :cond_8

    .line 147
    :cond_d
    const/16 v2, 0x64

    move v4, v2

    move-object v2, v1

    move v1, v4

    goto :goto_3

    .line 160
    :cond_e
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_SERVER_ERROR:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-virtual {v2, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 161
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->SERVER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    move-object v3, v2

    move v2, v1

    goto :goto_1

    .line 163
    :cond_f
    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->OTHER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    move-object v3, v2

    move v2, v1

    goto :goto_1

    .line 169
    :cond_10
    const/4 v1, 0x0

    goto :goto_2

    :cond_11
    move-object v3, v2

    move v2, v1

    goto/16 :goto_1
.end method

.method constructor <init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    .locals 15

    .prologue
    .line 185
    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p2

    instance-of v1, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    if-eqz v1, :cond_0

    check-cast p2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    move-object/from16 v14, p2

    :goto_0
    move-object v1, p0

    move-object/from16 v13, p1

    invoke-direct/range {v1 .. v14}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)V

    .line 189
    return-void

    .line 185
    :cond_0
    new-instance v14, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    move-object/from16 v0, p2

    invoke-direct {v14, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static checkResponseAndCreateError(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;
    .locals 13

    .prologue
    .line 281
    :try_start_0
    const-string v0, "code"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 282
    const-string v0, "code"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 283
    const-string v0, "body"

    const-string v2, "FACEBOOK_NON_JSON_RESULT"

    invoke-static {p0, v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 286
    if-eqz v9, :cond_3

    instance-of v0, v9, Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    .line 287
    check-cast v9, Lorg/json/JSONObject;

    .line 290
    const/4 v4, 0x0

    .line 291
    const/4 v5, 0x0

    .line 292
    const/4 v7, 0x0

    .line 293
    const/4 v6, 0x0

    .line 294
    const/4 v8, 0x0

    .line 295
    const/4 v2, 0x0

    .line 296
    const/4 v3, 0x0

    .line 298
    const/4 v0, 0x0

    .line 299
    const-string v10, "error"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 301
    const-string v0, "error"

    const/4 v2, 0x0

    invoke-static {v9, v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 303
    const-string v2, "type"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 304
    const-string v2, "message"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 305
    const-string v2, "code"

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 306
    const-string v3, "error_subcode"

    const/4 v6, -0x1

    invoke-virtual {v0, v3, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 307
    const-string v6, "error_user_msg"

    const/4 v7, 0x0

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 308
    const-string v6, "error_user_title"

    const/4 v8, 0x0

    invoke-virtual {v0, v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 309
    const-string v8, "is_transient"

    const/4 v10, 0x0

    invoke-virtual {v0, v8, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    .line 310
    const/4 v0, 0x1

    .line 320
    :cond_0
    :goto_0
    if-eqz v0, :cond_3

    .line 321
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    move-object v10, p0

    move-object v11, p1

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V

    .line 340
    :goto_1
    return-object v0

    .line 311
    :cond_1
    const-string v10, "error_code"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "error_msg"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "error_reason"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 313
    :cond_2
    const-string v0, "error_reason"

    const/4 v2, 0x0

    invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 314
    const-string v0, "error_msg"

    const/4 v2, 0x0

    invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 315
    const-string v0, "error_code"

    const/4 v2, -0x1

    invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 316
    const-string v0, "error_subcode"

    const/4 v3, -0x1

    invoke-virtual {v9, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 317
    const/4 v0, 0x1

    goto :goto_0

    .line 328
    :cond_3
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->HTTP_RANGE_SUCCESS:Lcom/cleanmaster/sdk/cmloginsdkjar/a;

    invoke-virtual {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 329
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "body"

    invoke-virtual {p0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    const-string v9, "body"

    const-string v10, "FACEBOOK_NON_JSON_RESULT"

    invoke-static {p0, v9, v10}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/json/JSONObject;

    :goto_2
    move-object v10, p0

    move-object v11, p1

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 340
    :cond_4
    const/4 v0, 0x0

    goto :goto_1

    .line 329
    :cond_5
    const/4 v9, 0x0

    goto :goto_2
.end method


# virtual methods
.method public final getCategory()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->category:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    return-object v0
.end method

.method public final getErrorCode()I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorCode:I

    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorMessage:Ljava/lang/String;

    .line 251
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->exception:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final getErrorType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorType:Ljava/lang/String;

    return-object v0
.end method

.method public final getException()Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->exception:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    return-object v0
.end method

.method public final getRequestStatusCode()I
    .locals 1

    .prologue
    .line 219
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->requestStatusCode:I

    return v0
.end method

.method public final getUserActionMessageId()I
    .locals 1

    .prologue
    .line 198
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->userActionMessageId:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{HttpStatus: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->requestStatusCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->errorType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
