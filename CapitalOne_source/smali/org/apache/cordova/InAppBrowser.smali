.class public Lorg/apache/cordova/InAppBrowser;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "InAppBrowser.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetJavaScriptEnabled"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/InAppBrowser$InAppBrowserClient;
    }
.end annotation


# static fields
.field private static final EXIT_EVENT:Ljava/lang/String; = "exit"

.field private static final LOAD_START_EVENT:Ljava/lang/String; = "loadstart"

.field private static final LOAD_STOP_EVENT:Ljava/lang/String; = "loadstop"

.field private static final LOCATION:Ljava/lang/String; = "location"

.field protected static final LOG_TAG:Ljava/lang/String; = "InAppBrowser"

.field private static final NULL:Ljava/lang/String; = "null"

.field private static final SELF:Ljava/lang/String; = "_self"

.field private static final SYSTEM:Ljava/lang/String; = "_system"


# instance fields
.field private callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field private dialog:Landroid/app/Dialog;

.field private edittext:Landroid/widget/EditText;

.field private inAppWebView:Landroid/webkit/WebView;

.field private showLocationBar:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/InAppBrowser;->showLocationBar:Z

    .line 471
    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$002(Lorg/apache/cordova/InAppBrowser;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;
    .param p1, "x1"    # Landroid/app/Dialog;

    .prologue
    .line 59
    iput-object p1, p0, Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;

    return-object p1
.end method

.method static synthetic access$100(Lorg/apache/cordova/InAppBrowser;Lorg/json/JSONObject;Z)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;
    .param p1, "x1"    # Lorg/json/JSONObject;
    .param p2, "x2"    # Z

    .prologue
    .line 59
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/InAppBrowser;->sendUpdate(Lorg/json/JSONObject;Z)V

    return-void
.end method

.method static synthetic access$200(Lorg/apache/cordova/InAppBrowser;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/InAppBrowser;->goBack()V

    return-void
.end method

.method static synthetic access$300(Lorg/apache/cordova/InAppBrowser;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/InAppBrowser;->goForward()V

    return-void
.end method

.method static synthetic access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$402(Lorg/apache/cordova/InAppBrowser;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;
    .param p1, "x1"    # Landroid/widget/EditText;

    .prologue
    .line 59
    iput-object p1, p0, Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;

    return-object p1
.end method

.method static synthetic access$500(Lorg/apache/cordova/InAppBrowser;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lorg/apache/cordova/InAppBrowser;->navigate(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lorg/apache/cordova/InAppBrowser;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/InAppBrowser;->closeDialog()V

    return-void
.end method

.method static synthetic access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$702(Lorg/apache/cordova/InAppBrowser;Landroid/webkit/WebView;)Landroid/webkit/WebView;
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;
    .param p1, "x1"    # Landroid/webkit/WebView;

    .prologue
    .line 59
    iput-object p1, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    return-object p1
.end method

.method static synthetic access$800(Lorg/apache/cordova/InAppBrowser;)Z
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/InAppBrowser;

    .prologue
    .line 59
    invoke-direct {p0}, Lorg/apache/cordova/InAppBrowser;->getShowLocationBar()Z

    move-result v0

    return v0
.end method

.method private closeDialog()V
    .locals 4

    .prologue
    .line 210
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 211
    .local v1, "obj":Lorg/json/JSONObject;
    const-string v2, "type"

    const-string v3, "exit"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lorg/apache/cordova/InAppBrowser;->sendUpdate(Lorg/json/JSONObject;Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .end local v1    # "obj":Lorg/json/JSONObject;
    :goto_0
    iget-object v2, p0, Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;

    if-eqz v2, :cond_0

    .line 219
    iget-object v2, p0, Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 221
    :cond_0
    return-void

    .line 214
    :catch_0
    move-exception v0

    .line 215
    .local v0, "ex":Lorg/json/JSONException;
    const-string v2, "InAppBrowser"

    const-string v3, "Should never happen"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private getShowLocationBar()Z
    .locals 1

    .prologue
    .line 265
    iget-boolean v0, p0, Lorg/apache/cordova/InAppBrowser;->showLocationBar:Z

    return v0
.end method

.method private goBack()V
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 230
    :cond_0
    return-void
.end method

.method private goForward()V
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    .line 239
    :cond_0
    return-void
.end method

.method private navigate(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 247
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 248
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 250
    const-string v1, "http"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "file:"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 251
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 255
    :goto_0
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->requestFocus()Z

    .line 256
    return-void

    .line 253
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private parseFeature(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 7
    .param p1, "optString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 153
    const-string v5, "null"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 154
    const/4 v2, 0x0

    .line 167
    :cond_0
    return-object v2

    .line 156
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 157
    .local v2, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v5, ","

    invoke-direct {v0, p1, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .local v0, "features":Ljava/util/StringTokenizer;
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 160
    new-instance v3, Ljava/util/StringTokenizer;

    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v5

    const-string v6, "="

    invoke-direct {v3, v5, v6}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .local v3, "option":Ljava/util/StringTokenizer;
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 162
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    .line 163
    .local v1, "key":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v5

    const-string v6, "no"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .local v4, "value":Ljava/lang/Boolean;
    :goto_1
    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 163
    .end local v4    # "value":Ljava/lang/Boolean;
    :cond_3
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1
.end method

.method private sendUpdate(Lorg/json/JSONObject;Z)V
    .locals 2
    .param p1, "obj"    # Lorg/json/JSONObject;
    .param p2, "keepCallback"    # Z

    .prologue
    .line 463
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 464
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {v0, p2}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 465
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 466
    return-void
.end method

.method private updateUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 178
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 179
    .local v0, "newUrl":Landroid/net/Uri;
    invoke-virtual {v0}, Landroid/net/Uri;->isRelative()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/apache/cordova/InAppBrowser;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/apache/cordova/InAppBrowser;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 182
    :cond_0
    return-object p1
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 11
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x1

    .line 86
    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    .line 87
    .local v4, "status":Lorg/apache/cordova/api/PluginResult$Status;
    const-string v3, ""

    .line 88
    .local v3, "result":Ljava/lang/String;
    iput-object p3, p0, Lorg/apache/cordova/InAppBrowser;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    .line 91
    :try_start_0
    const-string v7, "open"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 92
    const/4 v7, 0x0

    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 93
    .local v6, "url":Ljava/lang/String;
    const/4 v7, 0x1

    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    .line 94
    .local v5, "target":Ljava/lang/String;
    if-eqz v5, :cond_0

    const-string v7, ""

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "null"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 95
    :cond_0
    const-string v5, "_self"

    .line 97
    :cond_1
    const/4 v7, 0x2

    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v7}, Lorg/apache/cordova/InAppBrowser;->parseFeature(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v1

    .line 99
    .local v1, "features":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    const-string v7, "InAppBrowser"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "target = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    invoke-direct {p0, v6}, Lorg/apache/cordova/InAppBrowser;->updateUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 104
    const-string v7, "_self"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 105
    const-string v7, "InAppBrowser"

    const-string v8, "in self"

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    const-string v7, "file://"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    const-string v7, "javascript:"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    iget-object v7, p0, Lorg/apache/cordova/InAppBrowser;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7, v6}, Lorg/apache/cordova/CordovaWebView;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 109
    :cond_2
    iget-object v7, p0, Lorg/apache/cordova/InAppBrowser;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7, v6}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 137
    .end local v1    # "features":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    .end local v5    # "target":Ljava/lang/String;
    .end local v6    # "url":Ljava/lang/String;
    :goto_0
    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    invoke-direct {v2, v4, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 138
    .local v2, "pluginResult":Lorg/apache/cordova/api/PluginResult;
    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 139
    iget-object v7, p0, Lorg/apache/cordova/InAppBrowser;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v7, v2}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 143
    .end local v2    # "pluginResult":Lorg/apache/cordova/api/PluginResult;
    :goto_1
    return v10

    .line 113
    .restart local v1    # "features":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    .restart local v5    # "target":Ljava/lang/String;
    .restart local v6    # "url":Ljava/lang/String;
    :cond_3
    invoke-virtual {p0, v6, v1}, Lorg/apache/cordova/InAppBrowser;->showWebPage(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 117
    :cond_4
    const-string v7, "_system"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 118
    const-string v7, "InAppBrowser"

    const-string v8, "in system"

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    invoke-virtual {p0, v6}, Lorg/apache/cordova/InAppBrowser;->openExternal(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 123
    :cond_5
    const-string v7, "InAppBrowser"

    const-string v8, "in blank"

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    invoke-virtual {p0, v6, v1}, Lorg/apache/cordova/InAppBrowser;->showWebPage(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 127
    .end local v1    # "features":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    .end local v5    # "target":Ljava/lang/String;
    .end local v6    # "url":Ljava/lang/String;
    :cond_6
    const-string v7, "close"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 128
    invoke-direct {p0}, Lorg/apache/cordova/InAppBrowser;->closeDialog()V

    .line 130
    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v2, v7}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 131
    .restart local v2    # "pluginResult":Lorg/apache/cordova/api/PluginResult;
    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 132
    iget-object v7, p0, Lorg/apache/cordova/InAppBrowser;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v7, v2}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 140
    .end local v2    # "pluginResult":Lorg/apache/cordova/api/PluginResult;
    :catch_0
    move-exception v0

    .line 141
    .local v0, "e":Lorg/json/JSONException;
    iget-object v7, p0, Lorg/apache/cordova/InAppBrowser;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v8, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    invoke-virtual {v7, v8}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_1

    .line 135
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_7
    :try_start_1
    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->INVALID_ACTION:Lorg/apache/cordova/api/PluginResult$Status;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public openExternal(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 194
    const/4 v1, 0x0

    .line 195
    .local v1, "intent":Landroid/content/Intent;
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    .end local v1    # "intent":Landroid/content/Intent;
    .local v2, "intent":Landroid/content/Intent;
    :try_start_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 197
    iget-object v3, p0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 198
    const-string v3, ""
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 201
    .end local v2    # "intent":Landroid/content/Intent;
    :goto_0
    return-object v3

    .line 199
    .restart local v1    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 200
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    :goto_1
    const-string v3, "InAppBrowser"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InAppBrowser: Error loading url "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 199
    .end local v0    # "e":Landroid/content/ActivityNotFoundException;
    .end local v1    # "intent":Landroid/content/Intent;
    .restart local v2    # "intent":Landroid/content/Intent;
    :catch_1
    move-exception v0

    move-object v1, v2

    .end local v2    # "intent":Landroid/content/Intent;
    .restart local v1    # "intent":Landroid/content/Intent;
    goto :goto_1
.end method

.method public showWebPage(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 276
    .local p2, "features":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/apache/cordova/InAppBrowser;->showLocationBar:Z

    .line 277
    if-eqz p2, :cond_0

    .line 278
    const-string v2, "location"

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, p0, Lorg/apache/cordova/InAppBrowser;->showLocationBar:Z

    .line 281
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/InAppBrowser;->webView:Lorg/apache/cordova/CordovaWebView;

    .line 284
    .local v1, "thatWebView":Lorg/apache/cordova/CordovaWebView;
    new-instance v0, Lorg/apache/cordova/InAppBrowser$1;

    invoke-direct {v0, p0, p1, v1}, Lorg/apache/cordova/InAppBrowser$1;-><init>(Lorg/apache/cordova/InAppBrowser;Ljava/lang/String;Lorg/apache/cordova/CordovaWebView;)V

    .line 453
    .local v0, "runnable":Ljava/lang/Runnable;
    iget-object v2, p0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 454
    const-string v2, ""

    return-object v2
.end method
