.class public Lorg/apache/cordova/CordovaWebViewClient;
.super Lorg/xwalk/core/XWalkResourceClient;
.source "CordovaWebViewClient.java"


# static fields
.field public static final ERROR_AUTHENTICATION:I = -0x4

.field public static final ERROR_BAD_URL:I = -0xc

.field public static final ERROR_CONNECT:I = -0x6

.field public static final ERROR_FAILED_SSL_HANDSHAKE:I = -0xb

.field public static final ERROR_FILE:I = -0xd

.field public static final ERROR_FILE_NOT_FOUND:I = -0xe

.field public static final ERROR_HOST_LOOKUP:I = -0x2

.field public static final ERROR_IO:I = -0x7

.field public static final ERROR_OK:I = 0x0

.field public static final ERROR_PROXY_AUTHENTICATION:I = -0x5

.field public static final ERROR_REDIRECT_LOOP:I = -0x9

.field public static final ERROR_TIMEOUT:I = -0x8

.field public static final ERROR_TOO_MANY_REQUESTS:I = -0xf

.field public static final ERROR_UNKNOWN:I = -0x1

.field public static final ERROR_UNSUPPORTED_AUTH_SCHEME:I = -0x3

.field public static final ERROR_UNSUPPORTED_SCHEME:I = -0xa

.field private static final TAG:Ljava/lang/String; = "CordovaWebViewClient"


# instance fields
.field appView:Lorg/apache/cordova/CordovaWebView;

.field private authenticationTokens:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Lorg/apache/cordova/AuthenticationToken;",
            ">;"
        }
    .end annotation
.end field

.field cordova:Lorg/apache/cordova/CordovaInterface;

.field helper:Lorg/apache/cordova/CordovaUriHelper;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/CordovaInterface;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 103
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/xwalk/core/XWalkResourceClient;-><init>(Lorg/xwalk/core/XWalkView;)V

    .line 99
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    .line 104
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 105
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "view"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 114
    invoke-direct {p0, p2}, Lorg/xwalk/core/XWalkResourceClient;-><init>(Lorg/xwalk/core/XWalkView;)V

    .line 99
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    .line 115
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 116
    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 117
    new-instance v0, Lorg/apache/cordova/CordovaUriHelper;

    invoke-direct {v0, p1, p2}, Lorg/apache/cordova/CordovaUriHelper;-><init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->helper:Lorg/apache/cordova/CordovaUriHelper;

    .line 118
    return-void
.end method


# virtual methods
.method public clearAuthenticationTokens()V
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 235
    return-void
.end method

.method public getAuthenticationToken(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cordova/AuthenticationToken;
    .locals 3
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "realm"    # Ljava/lang/String;

    .prologue
    .line 209
    const/4 v0, 0x0

    .line 210
    .local v0, "token":Lorg/apache/cordova/AuthenticationToken;
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 212
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    if-nez v0, :cond_1

    .line 214
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 217
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    if-nez v0, :cond_0

    .line 218
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 222
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    :cond_0
    if-nez v0, :cond_1

    .line 223
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 227
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    :cond_1
    return-object v0
.end method

.method public onReceivedLoadError(Lorg/xwalk/core/XWalkView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 143
    const-string v2, "CordovaWebViewClient"

    const-string v3, "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p3, v4, v5

    const/4 v5, 0x2

    aput-object p4, v4, v5

    invoke-static {v2, v3, v4}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget v3, v2, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 149
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 151
    .local v0, "data":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "errorCode"

    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 152
    const-string v2, "description"

    invoke-virtual {v0, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    const-string v2, "url"

    invoke-virtual {v0, v2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :goto_0
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v3, "onReceivedError"

    invoke-virtual {v2, v3, v0}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 158
    return-void

    .line 154
    :catch_0
    move-exception v1

    .line 155
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public removeAuthenticationToken(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cordova/AuthenticationToken;
    .locals 2
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "realm"    # Ljava/lang/String;

    .prologue
    .line 191
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    return-object v0
.end method

.method public setAuthenticationToken(Lorg/apache/cordova/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "authenticationToken"    # Lorg/apache/cordova/AuthenticationToken;
    .param p2, "host"    # Ljava/lang/String;
    .param p3, "realm"    # Ljava/lang/String;

    .prologue
    .line 173
    if-nez p2, :cond_0

    .line 174
    const-string p2, ""

    .line 176
    :cond_0
    if-nez p3, :cond_1

    .line 177
    const-string p3, ""

    .line 179
    :cond_1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    return-void
.end method

.method public setWebView(Lorg/apache/cordova/CordovaWebView;)V
    .locals 2
    .param p1, "view"    # Lorg/apache/cordova/CordovaWebView;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 127
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 128
    new-instance v0, Lorg/apache/cordova/CordovaUriHelper;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/CordovaUriHelper;-><init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->helper:Lorg/apache/cordova/CordovaUriHelper;

    .line 129
    return-void
.end method

.method public shouldOverrideUrlLoading(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 162
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->helper:Lorg/apache/cordova/CordovaUriHelper;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaUriHelper;->shouldOverrideUrlLoading(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
