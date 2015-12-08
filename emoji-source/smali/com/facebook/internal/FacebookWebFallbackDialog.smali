.class public Lcom/facebook/internal/FacebookWebFallbackDialog;
.super Lcom/facebook/widget/WebDialog;
.source "FacebookWebFallbackDialog.java"


# static fields
.field private static final OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS:I = 0x5dc

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private waitingForDialogToClose:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/internal/FacebookWebFallbackDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/FacebookWebFallbackDialog;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "expectedRedirectUrl"    # Ljava/lang/String;

    .prologue
    .line 79
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/WebDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0, p3}, Lcom/facebook/internal/FacebookWebFallbackDialog;->setExpectedRedirectUrl(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/internal/FacebookWebFallbackDialog;)Z
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/FacebookWebFallbackDialog;

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->isListenerCalled()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/facebook/internal/FacebookWebFallbackDialog;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/FacebookWebFallbackDialog;

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->sendCancelToListener()V

    return-void
.end method

.method public static presentWebFallback(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "dialogUrl"    # Ljava/lang/String;
    .param p2, "applicationId"    # Ljava/lang/String;
    .param p3, "appCall"    # Lcom/facebook/widget/FacebookDialog$PendingCall;
    .param p4, "callback"    # Lcom/facebook/widget/FacebookDialog$Callback;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 51
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 75
    :goto_0
    return v2

    .line 55
    :cond_0
    const-string v4, "fb%s://bridge/"

    new-array v5, v3, [Ljava/lang/Object;

    aput-object p2, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 58
    .local v1, "redirectUrl":Ljava/lang/String;
    new-instance v0, Lcom/facebook/internal/FacebookWebFallbackDialog;

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/internal/FacebookWebFallbackDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .local v0, "fallbackWebDialog":Lcom/facebook/internal/FacebookWebFallbackDialog;
    new-instance v2, Lcom/facebook/internal/FacebookWebFallbackDialog$1;

    invoke-direct {v2, p0, p3, p4}, Lcom/facebook/internal/FacebookWebFallbackDialog$1;-><init>(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)V

    invoke-virtual {v0, v2}, Lcom/facebook/internal/FacebookWebFallbackDialog;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)V

    .line 74
    invoke-virtual {v0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->show()V

    move v2, v3

    .line 75
    goto :goto_0
.end method


# virtual methods
.method public dismiss()V
    .locals 6

    .prologue
    .line 130
    invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    .line 132
    .local v2, "webView":Landroid/webkit/WebView;
    invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->isListenerCalled()Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/webkit/WebView;->isShown()Z

    move-result v3

    if-nez v3, :cond_2

    .line 135
    :cond_0
    invoke-super {p0}, Lcom/facebook/widget/WebDialog;->dismiss()V

    .line 170
    :cond_1
    :goto_0
    return-void

    .line 141
    :cond_2
    iget-boolean v3, p0, Lcom/facebook/internal/FacebookWebFallbackDialog;->waitingForDialogToClose:Z

    if-nez v3, :cond_1

    .line 144
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/facebook/internal/FacebookWebFallbackDialog;->waitingForDialogToClose:Z

    .line 147
    const-string v0, "(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();"

    .line 153
    .local v0, "eventJS":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 157
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 158
    .local v1, "handler":Landroid/os/Handler;
    new-instance v3, Lcom/facebook/internal/FacebookWebFallbackDialog$2;

    invoke-direct {v3, p0}, Lcom/facebook/internal/FacebookWebFallbackDialog$2;-><init>(Lcom/facebook/internal/FacebookWebFallbackDialog;)V

    const-wide/16 v4, 0x5dc

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected parseResponseUri(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 11
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 86
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 87
    .local v8, "responseUri":Landroid/net/Uri;
    invoke-virtual {v8}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/facebook/internal/Utility;->parseUrlQueryString(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 90
    .local v7, "queryParams":Landroid/os/Bundle;
    const-string v9, "bridge_args"

    invoke-virtual {v7, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 91
    .local v2, "bridgeArgsJSONString":Ljava/lang/String;
    const-string v9, "bridge_args"

    invoke-virtual {v7, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 93
    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 96
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 97
    .local v1, "bridgeArgsJSON":Lorg/json/JSONObject;
    invoke-static {v1}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    .line 98
    .local v0, "bridgeArgs":Landroid/os/Bundle;
    const-string v9, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {v7, v9, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .end local v0    # "bridgeArgs":Landroid/os/Bundle;
    .end local v1    # "bridgeArgsJSON":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    const-string v9, "method_results"

    invoke-virtual {v7, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 106
    .local v6, "methodResultsJSONString":Ljava/lang/String;
    const-string v9, "method_results"

    invoke-virtual {v7, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 108
    invoke-static {v6}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 109
    invoke-static {v6}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v6, "{}"

    .line 112
    :cond_1
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 113
    .local v4, "methodArgsJSON":Lorg/json/JSONObject;
    invoke-static {v4}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v5

    .line 114
    .local v5, "methodResults":Landroid/os/Bundle;
    const-string v9, "com.facebook.platform.protocol.RESULT_ARGS"

    invoke-virtual {v7, v9, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 122
    .end local v4    # "methodArgsJSON":Lorg/json/JSONObject;
    .end local v5    # "methodResults":Landroid/os/Bundle;
    :cond_2
    :goto_1
    const-string v9, "version"

    invoke-virtual {v7, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 123
    const-string v9, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I

    move-result v10

    invoke-virtual {v7, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 125
    return-object v7

    .line 99
    .end local v6    # "methodResultsJSONString":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 100
    .local v3, "je":Lorg/json/JSONException;
    sget-object v9, Lcom/facebook/internal/FacebookWebFallbackDialog;->TAG:Ljava/lang/String;

    const-string v10, "Unable to parse bridge_args JSON"

    invoke-static {v9, v10, v3}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 115
    .end local v3    # "je":Lorg/json/JSONException;
    .restart local v6    # "methodResultsJSONString":Ljava/lang/String;
    :catch_1
    move-exception v3

    .line 116
    .restart local v3    # "je":Lorg/json/JSONException;
    sget-object v9, Lcom/facebook/internal/FacebookWebFallbackDialog;->TAG:Ljava/lang/String;

    const-string v10, "Unable to parse bridge_args JSON"

    invoke-static {v9, v10, v3}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method
