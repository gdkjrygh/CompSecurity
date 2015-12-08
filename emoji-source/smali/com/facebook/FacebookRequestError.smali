.class public final Lcom/facebook/FacebookRequestError;
.super Ljava/lang/Object;
.source "FacebookRequestError.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/FacebookRequestError$Category;,
        Lcom/facebook/FacebookRequestError$Range;
    }
.end annotation


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

.field private static final EC_RANGE_PERMISSION:Lcom/facebook/FacebookRequestError$Range;

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

.field private static final HTTP_RANGE_CLIENT_ERROR:Lcom/facebook/FacebookRequestError$Range;

.field private static final HTTP_RANGE_SERVER_ERROR:Lcom/facebook/FacebookRequestError$Range;

.field private static final HTTP_RANGE_SUCCESS:Lcom/facebook/FacebookRequestError$Range;

.field public static final INVALID_ERROR_CODE:I = -0x1

.field public static final INVALID_HTTP_STATUS_CODE:I = -0x1

.field private static final INVALID_MESSAGE_ID:I


# instance fields
.field private final batchRequestResult:Ljava/lang/Object;

.field private final category:Lcom/facebook/FacebookRequestError$Category;

.field private final connection:Ljava/net/HttpURLConnection;

.field private final errorCode:I

.field private final errorIsTransient:Z

.field private final errorMessage:Ljava/lang/String;

.field private final errorType:Ljava/lang/String;

.field private final errorUserMessage:Ljava/lang/String;

.field private final errorUserTitle:Ljava/lang/String;

.field private final exception:Lcom/facebook/FacebookException;

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

    .line 85
    new-instance v0, Lcom/facebook/FacebookRequestError$Range;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/FacebookRequestError$Range;-><init>(IILcom/facebook/FacebookRequestError$1;)V

    sput-object v0, Lcom/facebook/FacebookRequestError;->EC_RANGE_PERMISSION:Lcom/facebook/FacebookRequestError$Range;

    .line 92
    new-instance v0, Lcom/facebook/FacebookRequestError$Range;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/FacebookRequestError$Range;-><init>(IILcom/facebook/FacebookRequestError$1;)V

    sput-object v0, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_SUCCESS:Lcom/facebook/FacebookRequestError$Range;

    .line 93
    new-instance v0, Lcom/facebook/FacebookRequestError$Range;

    const/16 v1, 0x190

    const/16 v2, 0x1f3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/FacebookRequestError$Range;-><init>(IILcom/facebook/FacebookRequestError$1;)V

    sput-object v0, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_CLIENT_ERROR:Lcom/facebook/FacebookRequestError$Range;

    .line 94
    new-instance v0, Lcom/facebook/FacebookRequestError$Range;

    const/16 v1, 0x1f4

    const/16 v2, 0x257

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/FacebookRequestError$Range;-><init>(IILcom/facebook/FacebookRequestError$1;)V

    sput-object v0, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_SERVER_ERROR:Lcom/facebook/FacebookRequestError$Range;

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    .locals 14
    .param p1, "requestStatusCode"    # I
    .param p2, "errorCode"    # I
    .param p3, "subErrorCode"    # I
    .param p4, "errorType"    # Ljava/lang/String;
    .param p5, "errorMessage"    # Ljava/lang/String;
    .param p6, "errorUserTitle"    # Ljava/lang/String;
    .param p7, "errorUserMessage"    # Ljava/lang/String;
    .param p8, "errorIsTransient"    # Z
    .param p9, "requestResultBody"    # Lorg/json/JSONObject;
    .param p10, "requestResult"    # Lorg/json/JSONObject;
    .param p11, "batchRequestResult"    # Ljava/lang/Object;
    .param p12, "connection"    # Ljava/net/HttpURLConnection;

    .prologue
    .line 196
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

    invoke-direct/range {v0 .. v13}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)V

    .line 198
    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)V
    .locals 6
    .param p1, "requestStatusCode"    # I
    .param p2, "errorCode"    # I
    .param p3, "subErrorCode"    # I
    .param p4, "errorType"    # Ljava/lang/String;
    .param p5, "errorMessage"    # Ljava/lang/String;
    .param p6, "errorUserTitle"    # Ljava/lang/String;
    .param p7, "errorUserMessage"    # Ljava/lang/String;
    .param p8, "errorIsTransient"    # Z
    .param p9, "requestResultBody"    # Lorg/json/JSONObject;
    .param p10, "requestResult"    # Lorg/json/JSONObject;
    .param p11, "batchRequestResult"    # Ljava/lang/Object;
    .param p12, "connection"    # Ljava/net/HttpURLConnection;
    .param p13, "exception"    # Lcom/facebook/FacebookException;

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput p1, p0, Lcom/facebook/FacebookRequestError;->requestStatusCode:I

    .line 118
    iput p2, p0, Lcom/facebook/FacebookRequestError;->errorCode:I

    .line 119
    iput p3, p0, Lcom/facebook/FacebookRequestError;->subErrorCode:I

    .line 120
    iput-object p4, p0, Lcom/facebook/FacebookRequestError;->errorType:Ljava/lang/String;

    .line 121
    iput-object p5, p0, Lcom/facebook/FacebookRequestError;->errorMessage:Ljava/lang/String;

    .line 122
    iput-object p9, p0, Lcom/facebook/FacebookRequestError;->requestResultBody:Lorg/json/JSONObject;

    .line 123
    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/facebook/FacebookRequestError;->requestResult:Lorg/json/JSONObject;

    .line 124
    move-object/from16 v0, p11

    iput-object v0, p0, Lcom/facebook/FacebookRequestError;->batchRequestResult:Ljava/lang/Object;

    .line 125
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/facebook/FacebookRequestError;->connection:Ljava/net/HttpURLConnection;

    .line 126
    iput-object p6, p0, Lcom/facebook/FacebookRequestError;->errorUserTitle:Ljava/lang/String;

    .line 127
    iput-object p7, p0, Lcom/facebook/FacebookRequestError;->errorUserMessage:Ljava/lang/String;

    .line 128
    iput-boolean p8, p0, Lcom/facebook/FacebookRequestError;->errorIsTransient:Z

    .line 130
    const/4 v2, 0x0

    .line 131
    .local v2, "isLocalException":Z
    if-eqz p13, :cond_1

    .line 132
    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;

    .line 133
    const/4 v2, 0x1

    .line 140
    :goto_0
    const/4 v1, 0x0

    .line 141
    .local v1, "errorCategory":Lcom/facebook/FacebookRequestError$Category;
    const/4 v3, 0x0

    .line 142
    .local v3, "messageId":I
    const/4 v4, 0x0

    .line 143
    .local v4, "shouldNotify":Z
    if-eqz v2, :cond_2

    .line 144
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->CLIENT:Lcom/facebook/FacebookRequestError$Category;

    .line 145
    const/4 v3, 0x0

    .line 185
    :cond_0
    :goto_1
    if-eqz p7, :cond_12

    invoke-virtual {p7}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_12

    const/4 v4, 0x1

    .line 187
    :goto_2
    iput-object v1, p0, Lcom/facebook/FacebookRequestError;->category:Lcom/facebook/FacebookRequestError$Category;

    .line 188
    iput v3, p0, Lcom/facebook/FacebookRequestError;->userActionMessageId:I

    .line 189
    iput-boolean v4, p0, Lcom/facebook/FacebookRequestError;->shouldNotifyUser:Z

    .line 190
    return-void

    .line 135
    .end local v1    # "errorCategory":Lcom/facebook/FacebookRequestError$Category;
    .end local v3    # "messageId":I
    .end local v4    # "shouldNotify":Z
    :cond_1
    new-instance v5, Lcom/facebook/FacebookServiceException;

    invoke-direct {v5, p0, p5}, Lcom/facebook/FacebookServiceException;-><init>(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V

    iput-object v5, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;

    goto :goto_0

    .line 147
    .restart local v1    # "errorCategory":Lcom/facebook/FacebookRequestError$Category;
    .restart local v3    # "messageId":I
    .restart local v4    # "shouldNotify":Z
    :cond_2
    const/4 v5, 0x1

    if-eq p2, v5, :cond_3

    const/4 v5, 0x2

    if-ne p2, v5, :cond_5

    .line 148
    :cond_3
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->SERVER:Lcom/facebook/FacebookRequestError$Category;

    .line 173
    :cond_4
    :goto_3
    if-nez v1, :cond_0

    .line 174
    sget-object v5, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_CLIENT_ERROR:Lcom/facebook/FacebookRequestError$Range;

    invoke-virtual {v5, p1}, Lcom/facebook/FacebookRequestError$Range;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 175
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->BAD_REQUEST:Lcom/facebook/FacebookRequestError$Category;

    goto :goto_1

    .line 149
    :cond_5
    const/4 v5, 0x4

    if-eq p2, v5, :cond_6

    const/16 v5, 0x11

    if-ne p2, v5, :cond_7

    .line 150
    :cond_6
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->THROTTLING:Lcom/facebook/FacebookRequestError$Category;

    goto :goto_3

    .line 151
    :cond_7
    const/16 v5, 0xa

    if-eq p2, v5, :cond_8

    sget-object v5, Lcom/facebook/FacebookRequestError;->EC_RANGE_PERMISSION:Lcom/facebook/FacebookRequestError$Range;

    invoke-virtual {v5, p2}, Lcom/facebook/FacebookRequestError$Range;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 152
    :cond_8
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->PERMISSION:Lcom/facebook/FacebookRequestError$Category;

    .line 153
    sget v3, Lcom/facebook/android/R$string;->com_facebook_requesterror_permissions:I

    goto :goto_3

    .line 154
    :cond_9
    const/16 v5, 0x66

    if-eq p2, v5, :cond_a

    const/16 v5, 0xbe

    if-ne p2, v5, :cond_4

    .line 155
    :cond_a
    const/16 v5, 0x1cb

    if-eq p3, v5, :cond_b

    const/16 v5, 0x1d0

    if-ne p3, v5, :cond_c

    .line 156
    :cond_b
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->AUTHENTICATION_RETRY:Lcom/facebook/FacebookRequestError$Category;

    .line 157
    sget v3, Lcom/facebook/android/R$string;->com_facebook_requesterror_web_login:I

    .line 158
    const/4 v4, 0x1

    goto :goto_3

    .line 160
    :cond_c
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->AUTHENTICATION_REOPEN_SESSION:Lcom/facebook/FacebookRequestError$Category;

    .line 162
    const/16 v5, 0x1ca

    if-eq p3, v5, :cond_d

    const/16 v5, 0x1cf

    if-ne p3, v5, :cond_e

    .line 163
    :cond_d
    sget v3, Lcom/facebook/android/R$string;->com_facebook_requesterror_relogin:I

    goto :goto_3

    .line 164
    :cond_e
    const/16 v5, 0x1cc

    if-ne p3, v5, :cond_f

    .line 165
    sget v3, Lcom/facebook/android/R$string;->com_facebook_requesterror_password_changed:I

    goto :goto_3

    .line 167
    :cond_f
    sget v3, Lcom/facebook/android/R$string;->com_facebook_requesterror_reconnect:I

    .line 168
    const/4 v4, 0x1

    goto :goto_3

    .line 176
    :cond_10
    sget-object v5, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_SERVER_ERROR:Lcom/facebook/FacebookRequestError$Range;

    invoke-virtual {v5, p1}, Lcom/facebook/FacebookRequestError$Range;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 177
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->SERVER:Lcom/facebook/FacebookRequestError$Category;

    goto :goto_1

    .line 179
    :cond_11
    sget-object v1, Lcom/facebook/FacebookRequestError$Category;->OTHER:Lcom/facebook/FacebookRequestError$Category;

    goto/16 :goto_1

    .line 185
    :cond_12
    const/4 v4, 0x0

    goto :goto_2
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 14
    .param p1, "errorCode"    # I
    .param p2, "errorType"    # Ljava/lang/String;
    .param p3, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 208
    const/4 v1, -0x1

    const/4 v3, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, p0

    move v2, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v13}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)V

    .line 210
    return-void
.end method

.method constructor <init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    .locals 15
    .param p1, "connection"    # Ljava/net/HttpURLConnection;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 201
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

    instance-of v1, v0, Lcom/facebook/FacebookException;

    if-eqz v1, :cond_0

    check-cast p2, Lcom/facebook/FacebookException;

    .end local p2    # "exception":Ljava/lang/Exception;
    move-object/from16 v14, p2

    :goto_0
    move-object v1, p0

    move-object/from16 v13, p1

    invoke-direct/range {v1 .. v14}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)V

    .line 205
    return-void

    .line 201
    .restart local p2    # "exception":Ljava/lang/Exception;
    :cond_0
    new-instance v14, Lcom/facebook/FacebookException;

    move-object/from16 v0, p2

    invoke-direct {v14, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static checkResponseAndCreateError(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;
    .locals 27
    .param p0, "singleResult"    # Lorg/json/JSONObject;
    .param p1, "batchResult"    # Ljava/lang/Object;
    .param p2, "connection"    # Ljava/net/HttpURLConnection;

    .prologue
    .line 394
    :try_start_0
    const-string v1, "code"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 395
    const-string v1, "code"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 396
    .local v2, "responseCode":I
    const-string v1, "body"

    const-string v11, "FACEBOOK_NON_JSON_RESULT"

    move-object/from16 v0, p0

    invoke-static {v0, v1, v11}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v24

    .line 399
    .local v24, "body":Ljava/lang/Object;
    if-eqz v24, :cond_3

    move-object/from16 v0, v24

    instance-of v1, v0, Lorg/json/JSONObject;

    if-eqz v1, :cond_3

    .line 400
    move-object/from16 v0, v24

    check-cast v0, Lorg/json/JSONObject;

    move-object v10, v0

    .line 403
    .local v10, "jsonBody":Lorg/json/JSONObject;
    const/4 v5, 0x0

    .line 404
    .local v5, "errorType":Ljava/lang/String;
    const/4 v6, 0x0

    .line 405
    .local v6, "errorMessage":Ljava/lang/String;
    const/4 v8, 0x0

    .line 406
    .local v8, "errorUserMessage":Ljava/lang/String;
    const/4 v7, 0x0

    .line 407
    .local v7, "errorUserTitle":Ljava/lang/String;
    const/4 v9, 0x0

    .line 408
    .local v9, "errorIsTransient":Z
    const/4 v3, -0x1

    .line 409
    .local v3, "errorCode":I
    const/4 v4, -0x1

    .line 411
    .local v4, "errorSubCode":I
    const/16 v26, 0x0

    .line 412
    .local v26, "hasError":Z
    const-string v1, "error"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 414
    const-string v1, "error"

    const/4 v11, 0x0

    invoke-static {v10, v1, v11}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lorg/json/JSONObject;

    .line 416
    .local v25, "error":Lorg/json/JSONObject;
    const-string v1, "type"

    const/4 v11, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 417
    const-string v1, "message"

    const/4 v11, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 418
    const-string v1, "code"

    const/4 v11, -0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 419
    const-string v1, "error_subcode"

    const/4 v11, -0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 420
    const-string v1, "error_user_msg"

    const/4 v11, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 421
    const-string v1, "error_user_title"

    const/4 v11, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 422
    const-string v1, "is_transient"

    const/4 v11, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v9

    .line 423
    const/16 v26, 0x1

    .line 433
    .end local v25    # "error":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    if-eqz v26, :cond_3

    .line 434
    new-instance v1, Lcom/facebook/FacebookRequestError;

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    invoke-direct/range {v1 .. v13}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V

    .line 453
    .end local v2    # "responseCode":I
    .end local v3    # "errorCode":I
    .end local v4    # "errorSubCode":I
    .end local v5    # "errorType":Ljava/lang/String;
    .end local v6    # "errorMessage":Ljava/lang/String;
    .end local v7    # "errorUserTitle":Ljava/lang/String;
    .end local v8    # "errorUserMessage":Ljava/lang/String;
    .end local v9    # "errorIsTransient":Z
    .end local v10    # "jsonBody":Lorg/json/JSONObject;
    .end local v24    # "body":Ljava/lang/Object;
    .end local v26    # "hasError":Z
    :goto_1
    return-object v1

    .line 424
    .restart local v2    # "responseCode":I
    .restart local v3    # "errorCode":I
    .restart local v4    # "errorSubCode":I
    .restart local v5    # "errorType":Ljava/lang/String;
    .restart local v6    # "errorMessage":Ljava/lang/String;
    .restart local v7    # "errorUserTitle":Ljava/lang/String;
    .restart local v8    # "errorUserMessage":Ljava/lang/String;
    .restart local v9    # "errorIsTransient":Z
    .restart local v10    # "jsonBody":Lorg/json/JSONObject;
    .restart local v24    # "body":Ljava/lang/Object;
    .restart local v26    # "hasError":Z
    :cond_1
    const-string v1, "error_code"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "error_msg"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "error_reason"

    .line 425
    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 426
    :cond_2
    const-string v1, "error_reason"

    const/4 v11, 0x0

    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 427
    const-string v1, "error_msg"

    const/4 v11, 0x0

    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 428
    const-string v1, "error_code"

    const/4 v11, -0x1

    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 429
    const-string v1, "error_subcode"

    const/4 v11, -0x1

    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 430
    const/16 v26, 0x1

    goto :goto_0

    .line 441
    .end local v3    # "errorCode":I
    .end local v4    # "errorSubCode":I
    .end local v5    # "errorType":Ljava/lang/String;
    .end local v6    # "errorMessage":Ljava/lang/String;
    .end local v7    # "errorUserTitle":Ljava/lang/String;
    .end local v8    # "errorUserMessage":Ljava/lang/String;
    .end local v9    # "errorIsTransient":Z
    .end local v10    # "jsonBody":Lorg/json/JSONObject;
    .end local v26    # "hasError":Z
    :cond_3
    sget-object v1, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_SUCCESS:Lcom/facebook/FacebookRequestError$Range;

    invoke-virtual {v1, v2}, Lcom/facebook/FacebookRequestError$Range;->contains(I)Z

    move-result v1

    if-nez v1, :cond_5

    .line 442
    new-instance v11, Lcom/facebook/FacebookRequestError;

    const/4 v13, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v1, "body"

    .line 444
    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "body"

    const-string v12, "FACEBOOK_NON_JSON_RESULT"

    .line 445
    move-object/from16 v0, p0

    invoke-static {v0, v1, v12}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    move-object/from16 v20, v1

    :goto_2
    move v12, v2

    move-object/from16 v21, p0

    move-object/from16 v22, p1

    move-object/from16 v23, p2

    invoke-direct/range {v11 .. v23}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v11

    goto :goto_1

    :cond_4
    const/16 v20, 0x0

    goto :goto_2

    .line 450
    .end local v2    # "responseCode":I
    .end local v24    # "body":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 453
    :cond_5
    const/4 v1, 0x0

    goto :goto_1
.end method


# virtual methods
.method public getBatchRequestResult()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->batchRequestResult:Ljava/lang/Object;

    return-object v0
.end method

.method public getCategory()Lcom/facebook/FacebookRequestError$Category;
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->category:Lcom/facebook/FacebookRequestError$Category;

    return-object v0
.end method

.method public getConnection()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->connection:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    .prologue
    .line 259
    iget v0, p0, Lcom/facebook/FacebookRequestError;->errorCode:I

    return v0
.end method

.method public getErrorIsTransient()Z
    .locals 1

    .prologue
    .line 322
    iget-boolean v0, p0, Lcom/facebook/FacebookRequestError;->errorIsTransient:Z

    return v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorMessage:Ljava/lang/String;

    .line 291
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;

    invoke-virtual {v0}, Lcom/facebook/FacebookException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getErrorType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorType:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorUserMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 303
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorUserMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorUserTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorUserTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getException()Lcom/facebook/FacebookException;
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;

    return-object v0
.end method

.method public getRequestResult()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->requestResult:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getRequestResultBody()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->requestResultBody:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getRequestStatusCode()I
    .locals 1

    .prologue
    .line 250
    iget v0, p0, Lcom/facebook/FacebookRequestError;->requestStatusCode:I

    return v0
.end method

.method public getSubErrorCode()I
    .locals 1

    .prologue
    .line 268
    iget v0, p0, Lcom/facebook/FacebookRequestError;->subErrorCode:I

    return v0
.end method

.method public getUserActionMessageId()I
    .locals 1

    .prologue
    .line 219
    iget v0, p0, Lcom/facebook/FacebookRequestError;->userActionMessageId:I

    return v0
.end method

.method public shouldNotifyUser()Z
    .locals 1

    .prologue
    .line 230
    iget-boolean v0, p0, Lcom/facebook/FacebookRequestError;->shouldNotifyUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{HttpStatus: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/facebook/FacebookRequestError;->requestStatusCode:I

    .line 380
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorCode: "

    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/FacebookRequestError;->errorCode:I

    .line 382
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorType: "

    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/FacebookRequestError;->errorType:Ljava/lang/String;

    .line 384
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage: "

    .line 385
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 386
    invoke-virtual {p0}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    .line 387
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
