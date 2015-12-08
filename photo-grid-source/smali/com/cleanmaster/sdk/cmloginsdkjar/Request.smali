.class public Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ACCEPT_LANGUAGE_HEADER:Ljava/lang/String; = "Accept-Language"

.field private static final ACCESS_TOKEN_PARAM:Ljava/lang/String; = "access_token"

.field private static final APPID_PARAM:Ljava/lang/String; = "appid"

.field private static final ATTACHED_FILES_PARAM:Ljava/lang/String; = "attached_files"

.field private static final ATTACHMENT_FILENAME_PREFIX:Ljava/lang/String; = "file"

.field private static final BATCH_APP_ID_PARAM:Ljava/lang/String; = "batch_app_id"

.field private static final BATCH_BODY_PARAM:Ljava/lang/String; = "body"

.field private static final BATCH_ENTRY_DEPENDS_ON_PARAM:Ljava/lang/String; = "depends_on"

.field private static final BATCH_ENTRY_NAME_PARAM:Ljava/lang/String; = "name"

.field private static final BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM:Ljava/lang/String; = "omit_response_on_success"

.field private static final BATCH_METHOD_PARAM:Ljava/lang/String; = "method"

.field private static final BATCH_PARAM:Ljava/lang/String; = "batch"

.field private static final BATCH_RELATIVE_URL_PARAM:Ljava/lang/String; = "relative_url"

.field private static final CLIENT_ID_PARAM:Ljava/lang/String; = "client_id"

.field private static final CLIENT_IP_PARAM:Ljava/lang/String; = "client_ip"

.field public static final CMBTOKEN:Ljava/lang/String; = "cgi/cmb_token"

.field private static final COMMON_APPID_HEADER:Ljava/lang/String; = "appid"

.field private static final COMMON_SID_HEADER:Ljava/lang/String; = "sid"

.field private static final COMMON_SIG_HEADER:Ljava/lang/String; = "sig"

.field private static final CONTENT_TYPE_HEADER:Ljava/lang/String; = "Content-Type"

.field public static final EMAILACTIVE:Ljava/lang/String; = "cgi/emailactive"

.field private static final EXTRA_PARAM:Ljava/lang/String; = "extra"

.field public static final FORGET:Ljava/lang/String; = "cgi/forget"

.field private static final FORMAT_JSON:Ljava/lang/String; = "json"

.field private static final FORMAT_PARAM:Ljava/lang/String; = "format"

.field public static final ISEXIST:Ljava/lang/String; = "cgi/is_exist"

.field private static final ISO_8601_FORMAT_STRING:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ssZ"

.field public static final LOGIN:Ljava/lang/String; = "cgi/login"

.field public static final ME:Ljava/lang/String; = "cgi/me"

.field private static final MIME_BOUNDARY:Ljava/lang/String; = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

.field private static final OBJECT_PARAM:Ljava/lang/String; = "object"

.field public static final PASSWORD:Ljava/lang/String; = "cgi/password"

.field private static final PLAT_PARAM:Ljava/lang/String; = "plat"

.field public static final REAUTH:Ljava/lang/String; = "cgi/reauthorize"

.field public static final REFRESH:Ljava/lang/String; = "cgi/refresh"

.field public static final REGISTER:Ljava/lang/String; = "cgi/register"

.field public static final RESET:Ljava/lang/String; = "cgi/reset"

.field public static final REVOKE:Ljava/lang/String; = "cgi/revoke"

.field private static final SDK_ANDROID:Ljava/lang/String; = "android"

.field private static final SDK_PARAM:Ljava/lang/String; = "sdk"

.field public static final SENDMAIL:Ljava/lang/String; = "cgi/sendmail"

.field private static final SID_PARAM:Ljava/lang/String; = "sid"

.field public static final SSOTICKET:Ljava/lang/String; = "cgi/ticket"

.field private static final STAGING_PARAM:Ljava/lang/String; = "file"

.field public static final TAG:Ljava/lang/String;

.field public static final THIRD:Ljava/lang/String; = "cgi/third"

.field private static final TICKET_PARAM:Ljava/lang/String; = "ticket"

.field private static final TOKEN_PARAM:Ljava/lang/String; = "token"

.field public static final UPAVATAR:Ljava/lang/String; = "cgi/up_avatar"

.field public static final UPNICKNAME:Ljava/lang/String; = "cgi/up_nick"

.field public static final USERINFO:Ljava/lang/String; = "cgi/userinfo"

.field private static final USER_AGENT_BASE:Ljava/lang/String; = "FBAndroidSDK"

.field private static final USER_AGENT_HEADER:Ljava/lang/String; = "User-Agent"

.field private static defaultBatchApplicationId:Ljava/lang/String;

.field private static volatile userAgent:Ljava/lang/String;

.field private static versionPattern:Ljava/util/regex/Pattern;


# instance fields
.field private batchEntryDependsOn:Ljava/lang/String;

.field private batchEntryName:Ljava/lang/String;

.field private batchEntryOmitResultOnSuccess:Z

.field private callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

.field private httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

.field private isCanceled:Z

.field private overriddenURL:Ljava/lang/String;

.field private parameters:Landroid/os/Bundle;

.field private proxyPath:Ljava/lang/String;

.field private sid:Ljava/lang/String;

.field private skipClientToken:Z

.field private specificURL:Ljava/lang/String;

.field private tag:Ljava/lang/Object;

.field private timeoutInMilliseconds:I

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->$assertionsDisabled:Z

    .line 40
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->TAG:Ljava/lang/String;

    .line 111
    const-string v0, "^/?v\\d+\\.\\d+/(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->versionPattern:Ljava/util/regex/Pattern;

    return-void

    .line 39
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 134
    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    .line 135
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 216
    move-object v0, p0

    move-object v2, v1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, v1

    invoke-direct/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;Ljava/lang/String;)V

    .line 217
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->specificURL:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 148
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    .line 149
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;)V
    .locals 6

    .prologue
    .line 170
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    .line 171
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V
    .locals 7

    .prologue
    .line 194
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;Ljava/lang/String;)V

    .line 195
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryOmitResultOnSuccess:Z

    .line 126
    iput-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->skipClientToken:Z

    .line 127
    iput-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled:Z

    .line 128
    iput v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->timeoutInMilliseconds:I

    .line 243
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->setSid(Ljava/lang/String;)V

    .line 244
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    .line 245
    iput-object p5, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    .line 246
    iput-object p6, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    .line 248
    invoke-virtual {p0, p4}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->setHttpMethod(Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;)V

    .line 250
    if-eqz p3, :cond_1

    .line 251
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    .line 256
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 257
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/ServerProtocol;->getAPIVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    .line 259
    :cond_0
    return-void

    .line 253
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    goto :goto_0
.end method

.method constructor <init>(Ljava/lang/String;Ljava/net/URL;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryOmitResultOnSuccess:Z

    .line 126
    iput-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->skipClientToken:Z

    .line 127
    iput-boolean v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled:Z

    .line 128
    iput v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->timeoutInMilliseconds:I

    .line 262
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->setSid(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->overriddenURL:Ljava/lang/String;

    .line 265
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->setHttpMethod(Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;)V

    .line 267
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    .line 268
    return-void
.end method

.method static synthetic access$000(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedParameterType(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private appendParametersToBaseUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 1687
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 1689
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1690
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1691
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 1693
    if-nez v1, :cond_1

    .line 1694
    const-string v1, ""

    .line 1697
    :cond_1
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedParameterType(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1698
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1707
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 1700
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    if-ne v0, v4, :cond_0

    .line 1701
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported parameter type for GET request: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1710
    :cond_3
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static createConnection(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 3

    .prologue
    .line 1596
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 1598
    const-string v1, "Connection"

    const-string v2, "close"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1599
    const-string v1, "User-Agent"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getUserAgent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1600
    const-string v1, "Content-Type"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getMimeContentType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1601
    const-string v1, "Accept-Language"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1603
    const-string v1, "cgi/login"

    if-eq p1, v1, :cond_3

    .line 1607
    const-string v1, "cgi/register"

    if-ne p1, v1, :cond_0

    .line 1608
    const-string v1, "appid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1609
    const-string v1, "sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getRegistSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1610
    const-string v1, "sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getRegistSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1629
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 1630
    return-object v0

    .line 1611
    :cond_0
    const-string v1, "cgi/third"

    if-ne p1, v1, :cond_1

    .line 1612
    const-string v1, "appid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1613
    const-string v1, "sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1614
    const-string v1, "sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1615
    :cond_1
    const-string v1, "cgi/cmb_token"

    if-ne p1, v1, :cond_2

    .line 1616
    const-string v1, "appid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1617
    const-string v1, "sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1618
    const-string v1, "sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1619
    :cond_2
    const-string v1, "cgi/refresh"

    if-ne p1, v1, :cond_3

    .line 1620
    const-string v1, "appid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1621
    const-string v1, "sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1622
    const-string v1, "sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1624
    :cond_3
    const-string v1, "appid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1625
    const-string v1, "sid"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1626
    const-string v1, "sig"

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSidSig()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static executeAndWait(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/Response;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1284
    new-array v0, v3, [Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    aput-object p0, v0, v2

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAndWait([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Ljava/util/List;

    move-result-object v0

    .line 1286
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eq v1, v3, :cond_1

    .line 1287
    :cond_0
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "invalid state: expected a single response"

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1290
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    return-object v0
.end method

.method public static executeBatchAndWait(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1350
    const-string v0, "requests"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1354
    :try_start_0
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->toHttpConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1361
    invoke-static {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;

    move-result-object v0

    .line 1362
    :goto_0
    return-object v0

    .line 1355
    :catch_0
    move-exception v0

    .line 1356
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getRequests()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v3, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;)Ljava/util/List;

    move-result-object v0

    .line 1357
    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->runCallbacks(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/util/List;)V

    goto :goto_0
.end method

.method public static executeBatchAndWait(Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1330
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAndWait(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static varargs executeBatchAndWait([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1310
    const-string v0, "requests"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1312
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAndWait(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static executeBatchAsync(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 1434
    const-string v0, "requests"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1436
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    invoke-direct {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 1437
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->executeOnSettingsExecutor()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    .line 1438
    return-object v0
.end method

.method public static executeBatchAsync(Ljava/util/Collection;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;"
        }
    .end annotation

    .prologue
    .line 1416
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAsync(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public static varargs executeBatchAsync([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 1396
    const-string v0, "requests"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1398
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAsync(Ljava/util/Collection;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public static executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;
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
    .line 1478
    invoke-static {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->fromHttpConnection(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;

    move-result-object v0

    .line 1480
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    .line 1482
    invoke-virtual {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->size()I

    move-result v1

    .line 1483
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 1484
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v3, "Received %d responses while expecting %d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    .line 1486
    const/16 v0, 0x4e25

    invoke-virtual {v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 1487
    throw v2

    .line 1490
    :cond_0
    invoke-static {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->runCallbacks(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/util/List;)V

    .line 1492
    return-object v0
.end method

.method public static executeConnectionAndWait(Ljava/net/HttpURLConnection;Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1458
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static executeConnectionAsync(Landroid/os/Handler;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 1536
    const-string v0, "connection"

    invoke-static {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1538
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    invoke-direct {v0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 1539
    invoke-virtual {p2, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->setCallbackHandler(Landroid/os/Handler;)V

    .line 1540
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->executeOnSettingsExecutor()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    .line 1541
    return-object v0
.end method

.method public static executeConnectionAsync(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 1512
    const/4 v0, 0x0

    invoke-static {v0, p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeConnectionAsync(Landroid/os/Handler;Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public static executePostRequestAsync(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1143
    invoke-static {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newPostRequest(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAsync()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public static executeWriteFile(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/io/File;)V
    .locals 3

    .prologue
    .line 1366
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1379
    :cond_0
    :goto_0
    return-void

    .line 1372
    :cond_1
    :try_start_0
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->toHttpConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1377
    invoke-static {v0, p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->writeResponseToFile(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/io/File;)V

    .line 1378
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V

    goto :goto_0

    .line 1374
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static getBatchAppId(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1992
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getBatchApplicationId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1993
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getBatchApplicationId()Ljava/lang/String;

    move-result-object v0

    .line 1996
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->defaultBatchApplicationId:Ljava/lang/String;

    goto :goto_0
.end method

.method public static final getDefaultBatchApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1070
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->defaultBatchApplicationId:Ljava/lang/String;

    return-object v0
.end method

.method private getGraphPathWithVersion()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1743
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->versionPattern:Ljava/util/regex/Pattern;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1744
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1745
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    .line 1747
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "%s/%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static getMimeContentType()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1978
    const-string v0, "multipart/form-data; boundary=%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getUserAgent()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1984
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->userAgent:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1985
    const-string v0, "%s.%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "FBAndroidSDK"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "0.0.1"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->userAgent:Ljava/lang/String;

    .line 1988
    :cond_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->userAgent:Ljava/lang/String;

    return-object v0
.end method

.method private static hasOnProgressCallbacks(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1813
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;

    .line 1814
    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$OnProgressCallback;

    if-eqz v0, :cond_0

    move v0, v1

    .line 1825
    :goto_0
    return v0

    .line 1819
    :cond_1
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 1820
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getCallback()Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    move-result-object v0

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnProgressCallback;

    if-eqz v0, :cond_2

    move v0, v1

    .line 1821
    goto :goto_0

    .line 1825
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isMeRequest(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1934
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->versionPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 1935
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1937
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 1939
    :cond_0
    const-string v1, "me/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "/me/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1942
    :cond_1
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isSupportedAttachmentType(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 2000
    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    instance-of v0, p0, [B

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/os/ParcelFileDescriptor;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isSupportedParameterType(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 2005
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static newCmbTokenRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCmbTokenCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 10

    .prologue
    .line 698
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/i;

    move-object/from16 v0, p10

    invoke-direct {v7, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/i;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCmbTokenCallback;)V

    .line 706
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSid(Ljava/lang/String;)V

    .line 707
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSidSig(Ljava/lang/String;)V

    .line 709
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 710
    const-string v2, "cmuuid"

    move-object/from16 v0, p8

    invoke-virtual {v5, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    const-string v2, "cmversion"

    move-object/from16 v0, p9

    invoke-virtual {v5, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    const-string v2, "cmb_token"

    invoke-virtual {v5, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    const-string v2, "uuid"

    invoke-virtual {v5, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    const-string v2, "user"

    invoke-virtual {v5, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    const-string v2, "cnl"

    invoke-virtual {v5, v2, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 717
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 718
    const-string v3, "tstamp"

    invoke-virtual {v5, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p6

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 722
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 723
    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 725
    const/4 v4, 0x0

    array-length v6, v2

    invoke-interface {v3, v2, v4, v6}, Ljava/util/zip/Checksum;->update([BII)V

    .line 728
    invoke-interface {v3}, Ljava/util/zip/Checksum;->getValue()J

    move-result-wide v2

    .line 729
    const-string v4, "vc"

    const-wide/16 v8, -0x1

    and-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    if-eqz p7, :cond_0

    .line 732
    const-string v2, "extra"

    const-string v3, "userinfo"

    invoke-virtual {v5, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 735
    :cond_0
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v3, 0x0

    const-string v4, "cgi/cmb_token"

    sget-object v6, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v2 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v2
.end method

.method public static newDeleteObjectRequest(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 903
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v3, 0x0

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->DELETE:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newEmailActiveRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 870
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/n;

    invoke-direct {v5, p6}, Lcom/cleanmaster/sdk/cmloginsdkjar/n;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyCallback;)V

    .line 879
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 880
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 882
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 883
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    const-string v0, "code"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 885
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 886
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 888
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/emailactive"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newForgetRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyForgetCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 665
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/h;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/h;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyForgetCallback;)V

    .line 673
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 674
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 676
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 677
    const-string v0, "address"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    const-string v0, "type"

    const-string v1, "2"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/forget"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newIsExistRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyIsExistCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 811
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/l;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/l;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyIsExistCallback;)V

    .line 820
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 821
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 823
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 824
    const-string v0, "name"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 825
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 828
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/is_exist"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginLoginCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 357
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/p;

    invoke-direct {v5, p8}, Lcom/cleanmaster/sdk/cmloginsdkjar/p;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginLoginCallback;)V

    .line 366
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 367
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 369
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 370
    const-string v0, "name"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    const-string v0, "password"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    if-eqz p5, :cond_0

    .line 376
    const-string v0, "extra"

    const-string v1, "userinfo"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    :cond_0
    if-eqz p4, :cond_1

    .line 379
    const-string v0, "code"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    :cond_1
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/login"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newMeRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyMeCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 466
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/t;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/t;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyMeCallback;)V

    .line 474
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 475
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 477
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 478
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/me"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newPasswordRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyPasswordCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 633
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/g;

    invoke-direct {v5, p7}, Lcom/cleanmaster/sdk/cmloginsdkjar/g;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyPasswordCallback;)V

    .line 641
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 642
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 644
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 645
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    const-string v0, "old_pwd"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    const-string v0, "new_pwd"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/password"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newPostRequest(Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 299
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v3, 0x0

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    .line 300
    return-object v0
.end method

.method public static newReFreshRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRefreshCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 748
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/j;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/j;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRefreshCallback;)V

    .line 756
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSid(Ljava/lang/String;)V

    .line 757
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSidSig(Ljava/lang/String;)V

    .line 759
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 760
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 764
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/refresh"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newReauthRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 517
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/v;

    invoke-direct {v5, p7}, Lcom/cleanmaster/sdk/cmloginsdkjar/v;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;)V

    .line 525
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 526
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 528
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 529
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    const-string v0, "package"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    const-string v0, "signature"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/reauthorize"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newRegisterRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginRegisterCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 316
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/e;

    invoke-direct {v5, p8}, Lcom/cleanmaster/sdk/cmloginsdkjar/e;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginRegisterCallback;)V

    .line 325
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setRegistSid(Ljava/lang/String;)V

    .line 326
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setRegistSidSig(Ljava/lang/String;)V

    .line 328
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 329
    const-string v0, "name"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string v0, "password"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string v0, "code_type"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 332
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    if-eqz p5, :cond_0

    .line 336
    const-string v0, "extra"

    const-string v1, "userinfo"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    :cond_0
    if-eqz p4, :cond_1

    .line 339
    const-string v0, "code"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    :cond_1
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/register"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newResetRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyResetCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 780
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/k;

    invoke-direct {v5, p7}, Lcom/cleanmaster/sdk/cmloginsdkjar/k;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyResetCallback;)V

    .line 788
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 789
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 791
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 792
    const-string v0, "code"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 793
    const-string v0, "address"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    const-string v0, "password"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 798
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/reset"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newRevokeRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 549
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/w;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/w;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;)V

    .line 557
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 558
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 560
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 561
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/revoke"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newSendMailRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxySendMailCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 842
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/m;

    invoke-direct {v5, p7}, Lcom/cleanmaster/sdk/cmloginsdkjar/m;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxySendMailCallback;)V

    .line 851
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 852
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 854
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 855
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 856
    const-string v0, "type"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 857
    if-eqz p4, :cond_0

    .line 858
    const-string v0, "email"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    :cond_0
    const-string v0, "code_type"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 861
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 862
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 864
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/sendmail"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newSsoTicketRequest(Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxySsoTicketCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 493
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/u;

    invoke-direct {v5, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/u;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxySsoTicketCallback;)V

    .line 501
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 502
    const-string v0, "sid"

    invoke-virtual {v3, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/ticket"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newThirdRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginThirdCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 398
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/q;

    invoke-direct {v5, p8}, Lcom/cleanmaster/sdk/cmloginsdkjar/q;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyLoginThirdCallback;)V

    .line 407
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSid(Ljava/lang/String;)V

    .line 408
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSidSig(Ljava/lang/String;)V

    .line 410
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 411
    const-string v0, "token"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    const-string v0, "plat"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    if-eqz p5, :cond_0

    .line 417
    const-string v0, "extra"

    const-string v1, "userinfo"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    :cond_0
    if-eqz p3, :cond_1

    .line 420
    const-string v0, "code"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    :cond_1
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    const-string v2, "cgi/third"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newUpAvatarRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 579
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/x;

    invoke-direct {v5, p6}, Lcom/cleanmaster/sdk/cmloginsdkjar/x;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;)V

    .line 587
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 588
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 590
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 591
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    const-string v0, "pic"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 593
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/up_avatar"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newUpNicknameRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpNicknameCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 602
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/f;

    invoke-direct {v5, p6}, Lcom/cleanmaster/sdk/cmloginsdkjar/f;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpNicknameCallback;)V

    .line 610
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 611
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 613
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 614
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 615
    const-string v0, "nick"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/up_nick"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method public static newUserinfoRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUserinfoCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 6

    .prologue
    .line 437
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/s;

    invoke-direct {v5, p5}, Lcom/cleanmaster/sdk/cmloginsdkjar/s;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUserinfoCallback;)V

    .line 445
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 446
    invoke-static {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 448
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 449
    const-string v0, "sid"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    const-string v0, "cmuuid"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    const-string v0, "cmversion"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const-string v2, "cgi/userinfo"

    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V

    return-object v0
.end method

.method private static parameterToString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 2010
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2011
    check-cast p0, Ljava/lang/String;

    .line 2016
    :goto_0
    return-object p0

    .line 2012
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 2013
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 2014
    :cond_2
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_3

    .line 2015
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2016
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 2018
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported parameter type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static processRequest(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    .locals 7

    .prologue
    .line 1889
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;

    invoke-direct {v1, p4, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;-><init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;)V

    .line 1891
    const/4 v0, 0x1

    if-ne p2, v0, :cond_4

    .line 1892
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v2

    .line 1894
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1895
    iget-object v0, v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1896
    iget-object v5, v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 1897
    invoke-static {v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 1898
    new-instance v6, Lcom/cleanmaster/sdk/cmloginsdkjar/y;

    invoke-direct {v6, v2, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/y;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/lang/Object;)V

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1902
    :cond_1
    if-eqz p1, :cond_2

    .line 1903
    const-string v0, "  Parameters:\n"

    invoke-virtual {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->append(Ljava/lang/String;)V

    .line 1905
    :cond_2
    iget-object v0, v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeParameters(Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/aa;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    .line 1907
    if-eqz p1, :cond_3

    .line 1908
    const-string v0, "  Attachments:\n"

    invoke-virtual {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->append(Ljava/lang/String;)V

    .line 1910
    :cond_3
    invoke-static {v3, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeAttachments(Ljava/util/Map;Lcom/cleanmaster/sdk/cmloginsdkjar/aa;)V

    .line 1931
    :goto_1
    return-void

    .line 1913
    :cond_4
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getBatchAppId(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/lang/String;

    move-result-object v0

    .line 1914
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1915
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "At least one request in a batch must have an open CmLoginSession, or a default app ID must be specified."

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1919
    :cond_5
    const-string v2, "batch_app_id"

    invoke-virtual {v1, v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1923
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1924
    invoke-static {v1, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeRequestsAsJSON(Lcom/cleanmaster/sdk/cmloginsdkjar/aa;Ljava/util/Collection;Ljava/util/Map;)V

    .line 1926
    if-eqz p1, :cond_6

    .line 1927
    const-string v2, "  Attachments:\n"

    invoke-virtual {p1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->append(Ljava/lang/String;)V

    .line 1929
    :cond_6
    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeAttachments(Ljava/util/Map;Lcom/cleanmaster/sdk/cmloginsdkjar/aa;)V

    goto :goto_1
.end method

.method static runCallbacks(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1558
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->size()I

    move-result v1

    .line 1561
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1562
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 1563
    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v3

    .line 1564
    iget-object v4, v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    if-eqz v4, :cond_0

    .line 1565
    new-instance v4, Landroid/util/Pair;

    iget-object v3, v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1562
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1569
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1570
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;

    invoke-direct {v0, v2, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/o;-><init>(Ljava/util/ArrayList;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 1583
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v1

    .line 1584
    if-nez v1, :cond_3

    .line 1586
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1592
    :cond_2
    :goto_1
    return-void

    .line 1589
    :cond_3
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1
.end method

.method private static serializeAttachments(Ljava/util/Map;Lcom/cleanmaster/sdk/cmloginsdkjar/aa;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/y;",
            ">;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/aa;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1957
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1959
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1960
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/cleanmaster/sdk/cmloginsdkjar/y;

    .line 1961
    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/y;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1962
    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/y;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/y;->a()Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v1

    invoke-virtual {p1, v0, v3, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/Object;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    goto :goto_0

    .line 1965
    :cond_1
    return-void
.end method

.method private static serializeParameters(Landroid/os/Bundle;Lcom/cleanmaster/sdk/cmloginsdkjar/aa;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 4

    .prologue
    .line 1946
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1948
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1949
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 1950
    invoke-static {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedParameterType(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1951
    invoke-virtual {p1, v0, v2, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Ljava/lang/Object;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    goto :goto_0

    .line 1954
    :cond_1
    return-void
.end method

.method private static serializeRequestsAsJSON(Lcom/cleanmaster/sdk/cmloginsdkjar/aa;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/aa;",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/y;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1969
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1970
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 1971
    invoke-direct {v0, v1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeToBatch(Lorg/json/JSONArray;Ljava/util/Map;)V

    goto :goto_0

    .line 1974
    :cond_0
    const-string v0, "batch"

    invoke-virtual {p0, v0, v1, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/aa;->a(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V

    .line 1975
    return-void
.end method

.method private serializeToBatch(Lorg/json/JSONArray;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/y;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1777
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1779
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1780
    const-string v0, "name"

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryName:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1781
    const-string v0, "omit_response_on_success"

    iget-boolean v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryOmitResultOnSuccess:Z

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1783
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryDependsOn:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1784
    const-string v0, "depends_on"

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryDependsOn:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1787
    :cond_1
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getUrlForBatchedRequest()Ljava/lang/String;

    move-result-object v0

    .line 1788
    const-string v2, "relative_url"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1789
    const-string v0, "method"

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1792
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1793
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1794
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1795
    iget-object v4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1796
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1798
    const-string v4, "%s%d"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-string v7, "file"

    aput-object v7, v5, v6

    const/4 v6, 0x1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1799
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1800
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/y;

    invoke-direct {v5, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/y;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/lang/Object;)V

    invoke-interface {p2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1804
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1805
    const-string v0, ","

    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 1806
    const-string v2, "attached_files"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1809
    :cond_4
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1810
    return-void
.end method

.method static final serializeToUrlConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/net/HttpURLConnection;)V
    .locals 10

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1830
    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    const-string v0, "Request"

    invoke-direct {v7, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;-><init>(Ljava/lang/String;)V

    .line 1832
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->size()I

    move-result v8

    .line 1834
    if-ne v8, v1, :cond_0

    invoke-virtual {p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    iget-object v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    .line 1835
    :goto_0
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 1837
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v9

    .line 1838
    const-string v3, "Request:\n"

    invoke-virtual {v7, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->append(Ljava/lang/String;)V

    .line 1839
    const-string v3, "Id"

    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1840
    const-string v3, "URL"

    invoke-virtual {v7, v3, v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1841
    const-string v3, "Method"

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1842
    const-string v3, "User-Agent"

    const-string v4, "User-Agent"

    invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1843
    const-string v3, "Content-Type"

    const-string v4, "Content-Type"

    invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1845
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getTimeout()I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 1846
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getTimeout()I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 1850
    sget-object v3, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    if-ne v0, v3, :cond_1

    move v0, v1

    .line 1851
    :goto_1
    if-nez v0, :cond_2

    .line 1852
    invoke-virtual {v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log()V

    .line 1884
    :goto_2
    return-void

    .line 1834
    :cond_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    goto :goto_0

    :cond_1
    move v0, v2

    .line 1850
    goto :goto_1

    .line 1856
    :cond_2
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 1860
    :try_start_0
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->hasOnProgressCallbacks(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1862
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/b;

    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;-><init>(Landroid/os/Handler;)V

    .line 1863
    const/4 v1, 0x0

    invoke-static {p0, v1, v8, v9, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->processRequest(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V

    .line 1865
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->a()I

    move-result v2

    .line 1866
    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/b;->b()Ljava/util/Map;

    move-result-object v3

    .line 1868
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1869
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/c;

    int-to-long v4, v2

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/c;-><init>(Ljava/io/OutputStream;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/util/Map;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 1875
    :goto_3
    :try_start_1
    invoke-static {p0, v7, v8, v9, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->processRequest(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1879
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 1883
    invoke-virtual {v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log()V

    goto :goto_2

    .line 1872
    :cond_3
    :try_start_2
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 1878
    :catchall_0
    move-exception v0

    move-object v1, v6

    :goto_4
    if-eqz v1, :cond_4

    .line 1879
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_4
    throw v0

    .line 1878
    :catchall_1
    move-exception v0

    goto :goto_4
.end method

.method public static final setDefaultBatchApplicationId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1082
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->defaultBatchApplicationId:Ljava/lang/String;

    .line 1083
    return-void
.end method

.method public static toHttpConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/net/HttpURLConnection;
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1231
    :try_start_0
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->size()I

    move-result v0

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1243
    :catch_0
    move-exception v0

    .line 1244
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v2, "could not construct URL for request"

    invoke-direct {v1, v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1233
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->size()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 1235
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v1

    .line 1237
    new-instance v0, Ljava/net/URL;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getUrlForSingleRequest()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1249
    :goto_0
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {p0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getProxyPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->createConnection(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 1251
    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->serializeToUrlConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;Ljava/net/HttpURLConnection;)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    .line 1267
    return-object v0

    .line 1241
    :cond_1
    :try_start_3
    new-instance v0, Ljava/net/URL;

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/ServerProtocol;->getProxyUrlBase()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 1252
    :catch_1
    move-exception v0

    .line 1253
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    invoke-direct {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/Throwable;)V

    .line 1254
    const/16 v0, 0x4e24

    invoke-virtual {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 1255
    throw v1

    .line 1257
    :catch_2
    move-exception v0

    .line 1258
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v2, "could not construct request body"

    invoke-direct {v1, v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1259
    const/16 v0, 0x4e22

    invoke-virtual {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 1260
    throw v1

    .line 1261
    :catch_3
    move-exception v0

    .line 1262
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v2, "could not construct request body"

    invoke-direct {v1, v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1263
    const/16 v0, 0x4e21

    invoke-virtual {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->setExceptionRet(I)V

    .line 1264
    throw v1
.end method

.method public static toHttpConnection(Ljava/util/Collection;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .prologue
    .line 1208
    const-string v0, "requests"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1210
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->toHttpConnection(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method public static varargs toHttpConnection([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 1190
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->toHttpConnection(Ljava/util/Collection;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addCommonParametersForLogin()V
    .locals 5

    .prologue
    .line 1638
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->skipClientToken:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "token"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "appid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "plat"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "extra"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1642
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    .line 1643
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getFbId()Ljava/lang/String;

    move-result-object v1

    .line 1644
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getFbToken()Ljava/lang/String;

    move-result-object v2

    .line 1647
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getClientLoginSid()Ljava/lang/String;

    .line 1648
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSidSig()Ljava/lang/String;

    .line 1650
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1651
    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v4, "appid"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1657
    :cond_0
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1658
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v3, "plat"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1664
    :cond_1
    invoke-static {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1665
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "token"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1671
    :cond_2
    return-void
.end method

.method public addCommonParametersForPlatfrom()V
    .locals 3

    .prologue
    .line 1674
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->skipClientToken:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v1, "access_token"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1675
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 1677
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1678
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    const-string v2, "access_token"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1684
    :cond_0
    return-void
.end method

.method public final executeAndWait()Lcom/cleanmaster/sdk/cmloginsdkjar/Response;
    .locals 1

    .prologue
    .line 1159
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeAndWait(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    move-result-object v0

    return-object v0
.end method

.method public final executeAsync()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 2

    .prologue
    .line 1172
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAsync([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public final getBatchEntryDependsOn()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1022
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryDependsOn:Ljava/lang/String;

    return-object v0
.end method

.method public final getBatchEntryName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 999
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryName:Ljava/lang/String;

    return-object v0
.end method

.method public final getBatchEntryOmitResultOnSuccess()Z
    .locals 1

    .prologue
    .line 1046
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryOmitResultOnSuccess:Z

    return v0
.end method

.method public final getCallback()Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;
    .locals 1

    .prologue
    .line 1091
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    return-object v0
.end method

.method public final getHttpMethod()Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;
    .locals 1

    .prologue
    .line 931
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    return-object v0
.end method

.method public final getParameters()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 980
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getProxyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 912
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1751
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->sid:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1121
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->tag:Ljava/lang/Object;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    .prologue
    .line 283
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->timeoutInMilliseconds:I

    return v0
.end method

.method final getUrlForBatchedRequest()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1715
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->overriddenURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1716
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "Can\'t override URL for a batch request"

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1719
    :cond_0
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getGraphPathWithVersion()Ljava/lang/String;

    move-result-object v0

    .line 1722
    return-object v0
.end method

.method final getUrlForSingleRequest()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1726
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->specificURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1727
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->specificURL:Ljava/lang/String;

    .line 1739
    :goto_0
    return-object v0

    .line 1730
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->overriddenURL:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1731
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->overriddenURL:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1735
    :cond_1
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/ServerProtocol;->getProxyUrlBase()Ljava/lang/String;

    move-result-object v0

    .line 1736
    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getGraphPathWithVersion()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 954
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    .prologue
    .line 275
    iget-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled:Z

    return v0
.end method

.method public final setBatchEntryDependsOn(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1035
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryDependsOn:Ljava/lang/String;

    .line 1036
    return-void
.end method

.method public final setBatchEntryName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1013
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryName:Ljava/lang/String;

    .line 1014
    return-void
.end method

.method public final setBatchEntryOmitResultOnSuccess(Z)V
    .locals 0

    .prologue
    .line 1059
    iput-boolean p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->batchEntryOmitResultOnSuccess:Z

    .line 1060
    return-void
.end method

.method public final setCallback(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;)V
    .locals 0

    .prologue
    .line 1101
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->callback:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    .line 1102
    return-void
.end method

.method public setCancel()V
    .locals 1

    .prologue
    .line 271
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled:Z

    .line 272
    return-void
.end method

.method public final setHttpMethod(Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;)V
    .locals 2

    .prologue
    .line 941
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->overriddenURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    if-eq p1, v0, :cond_0

    .line 942
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "Can\'t change HTTP method on request with overridden URL."

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 944
    :cond_0
    if-eqz p1, :cond_1

    :goto_0
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    .line 945
    return-void

    .line 944
    :cond_1
    sget-object p1, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    goto :goto_0
.end method

.method public final setParameters(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 990
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    .line 991
    return-void
.end method

.method public final setProxyPath(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 922
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    .line 923
    return-void
.end method

.method public setSid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1755
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->sid:Ljava/lang/String;

    .line 1756
    return-void
.end method

.method public final setSkipClientToken(Z)V
    .locals 0

    .prologue
    .line 971
    iput-boolean p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->skipClientToken:Z

    .line 972
    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1111
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->tag:Ljava/lang/Object;

    .line 1112
    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    .prologue
    .line 279
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->timeoutInMilliseconds:I

    .line 280
    return-void
.end method

.method public final setVersion(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 964
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->version:Ljava/lang/String;

    .line 965
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1551
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{Request:  sid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getSid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", proxyPath: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->proxyPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", httpMethod: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->httpMethod:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", parameters: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->parameters:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
