.class public Lcom/worklight/androidgap/plugin/Utils;
.super Lorg/apache/cordova/api/Plugin;
.source "Utils.java"


# static fields
.field private static final ACTION_CLEAR_HISTORY:Ljava/lang/String; = "clearHistory"

.field private static final ACTION_CLEAR_SESSION_COOKIES:Ljava/lang/String; = "clearSessionCookies"

.field private static final ACTION_COPY_TO_CLIPBOARD:Ljava/lang/String; = "copyToClipboard"

.field private static final ACTION_GET_AVAILABLE_SPACE:Ljava/lang/String; = "getAvailableSpace"

.field private static final ACTION_GET_LOCALE:Ljava/lang/String; = "getDeviceLocale"

.field private static final ACTION_GET_SCREEN_HEIGHT:Ljava/lang/String; = "getScreenHeight"

.field private static final ACTION_GET_SCREEN_WIDTH:Ljava/lang/String; = "getScreenWidth"

.field private static final ACTION_LOAD_SKIN:Ljava/lang/String; = "loadSkin"

.field private static final ACTION_OPEN_URL:Ljava/lang/String; = "openURL"

.field private static final ACTION_READ_PREF:Ljava/lang/String; = "readPref"

.field private static final ACTION_TOAST:Ljava/lang/String; = "toast"

.field private static final ACTION_WEBVIEW_RELOAD:Ljava/lang/String; = "reload"

.field private static final ACTION_WRITE_PREF:Ljava/lang/String; = "writePref"

.field private static final MARKET_ANDROID_WEB_URL:Ljava/lang/String; = "https://market.android.com/"

.field private static final MARKET_URL_PREFIX:Ljava/lang/String; = "market://"

.field private static final RESULT_HEIGHT:Ljava/lang/String; = "height"

.field private static final RESULT_WIDTH:Ljava/lang/String; = "width"


# instance fields
.field private myactivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    .line 43
    return-void
.end method

.method private showWrongSkinDialog()V
    .locals 4

    .prologue
    .line 192
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const-string v1, "Device Unsupported"

    const-string v2, "The application is not supported on this device. You may face problems while using it."

    const-string v3, "OK"

    invoke-static {v0, v1, v2, v3}, Lcom/worklight/common/WLUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 8
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 68
    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    .line 69
    .local v3, "status":Lorg/apache/cordova/api/PluginResult$Status;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 71
    .local v2, "result":Lorg/json/JSONObject;
    :try_start_0
    const-string v5, "openURL"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 72
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/worklight/androidgap/plugin/Utils;->openURL(Ljava/lang/String;)V

    .line 105
    :cond_0
    :goto_0
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    invoke-direct {v5, v3, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 108
    :goto_1
    return-object v5

    .line 73
    :cond_1
    const-string v5, "getScreenWidth"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 74
    const-string v5, "width"

    invoke-virtual {p0}, Lcom/worklight/androidgap/plugin/Utils;->getScreenWidth()I

    move-result v6

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 107
    :catch_0
    move-exception v1

    .line 108
    .local v1, "e":Lorg/json/JSONException;
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v5, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_1

    .line 75
    .end local v1    # "e":Lorg/json/JSONException;
    :cond_2
    :try_start_1
    const-string v5, "getScreenHeight"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 76
    const-string v5, "height"

    invoke-virtual {p0}, Lcom/worklight/androidgap/plugin/Utils;->getScreenHeight()I

    move-result v6

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 77
    :cond_3
    const-string v5, "loadSkin"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_4

    .line 78
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v5, v6}, Lcom/worklight/androidgap/plugin/Utils;->loadSkin(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_4
    const-string v5, "readPref"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 80
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    iget-object v6, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const/4 v7, 0x0

    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/worklight/common/WLUtils;->readWLPref(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v3, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    goto :goto_1

    .line 81
    :cond_5
    const-string v5, "writePref"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 82
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const/4 v6, 0x0

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {p2, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 83
    :cond_6
    const-string v5, "getDeviceLocale"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 84
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v3, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 85
    :cond_7
    const-string v5, "clearSessionCookies"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 86
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    invoke-static {v5}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 87
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    goto/16 :goto_0

    .line 88
    :cond_8
    const-string v5, "copyToClipboard"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 89
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const-string v6, "clipboard"

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    .line 90
    .local v0, "clipboardManager":Landroid/text/ClipboardManager;
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const-string v6, "The text was sucessfully copied."

    const/4 v7, 0x1

    invoke-static {v5, v6, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    .line 92
    .local v4, "toast":Landroid/widget/Toast;
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 93
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Copied text: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 94
    .end local v0    # "clipboardManager":Landroid/text/ClipboardManager;
    .end local v4    # "toast":Landroid/widget/Toast;
    :cond_9
    const-string v5, "toast"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 95
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const/4 v6, 0x0

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v5, v6, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    .line 96
    .restart local v4    # "toast":Landroid/widget/Toast;
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 97
    .end local v4    # "toast":Landroid/widget/Toast;
    :cond_a
    const-string v5, "clearHistory"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 98
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    check-cast v5, Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v5}, Lcom/worklight/androidgap/WLDroidGap;->clearHistory()V

    goto/16 :goto_0

    .line 99
    :cond_b
    const-string v5, "getAvailableSpace"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 100
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    invoke-static {}, Lcom/worklight/common/WLUtils;->getFreeSpaceOnDevice()J

    move-result-wide v6

    long-to-float v6, v6

    invoke-direct {v5, v3, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;F)V

    goto/16 :goto_1

    .line 101
    :cond_c
    const-string v5, "reload"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 102
    iget-object v5, p0, Lcom/worklight/androidgap/plugin/Utils;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v5}, Lorg/apache/cordova/CordovaWebView;->reload()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public getScreenHeight()I
    .locals 3

    .prologue
    .line 155
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 156
    .local v0, "display":Landroid/view/Display;
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v1

    return v1
.end method

.method public getScreenWidth()I
    .locals 3

    .prologue
    .line 150
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 151
    .local v0, "display":Landroid/view/Display;
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    return v1
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    .line 114
    const/4 v0, 0x1

    return v0
.end method

.method public loadSkin(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "skinId"    # Ljava/lang/String;
    .param p2, "htmlFile"    # Ljava/lang/String;

    .prologue
    .line 173
    new-instance v0, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    check-cast v3, Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v3}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 174
    .local v0, "skinDir":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 175
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No skin defined for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", will load default skin."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    .line 176
    const-string p1, "default"

    .line 177
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/Utils;->showWrongSkinDialog()V

    .line 181
    :cond_0
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    check-cast v2, Lcom/worklight/androidgap/WLDroidGap;

    .line 182
    .local v2, "wlDroidGap":Lcom/worklight/androidgap/WLDroidGap;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/worklight/androidgap/WLDroidGap;->getWebUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 185
    .local v1, "urlToLoad":Ljava/lang/String;
    iget-object v3, p0, Lcom/worklight/androidgap/plugin/Utils;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v3, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 186
    return-void
.end method

.method public openURL(Ljava/lang/String;)V
    .locals 7
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/4 v6, -0x1

    .line 127
    const/4 v1, 0x0

    .line 129
    .local v1, "myIntent":Landroid/content/Intent;
    :try_start_0
    const-string v4, "market://"

    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-le v4, v6, :cond_0

    .line 130
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .end local v1    # "myIntent":Landroid/content/Intent;
    .local v2, "myIntent":Landroid/content/Intent;
    move-object v1, v2

    .line 135
    .end local v2    # "myIntent":Landroid/content/Intent;
    .restart local v1    # "myIntent":Landroid/content/Intent;
    :goto_0
    iget-object v4, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 147
    :goto_1
    return-void

    .line 132
    :cond_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 133
    .local v3, "urlParam":Ljava/net/URL;
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .end local v1    # "myIntent":Landroid/content/Intent;
    .restart local v2    # "myIntent":Landroid/content/Intent;
    move-object v1, v2

    .end local v2    # "myIntent":Landroid/content/Intent;
    .restart local v1    # "myIntent":Landroid/content/Intent;
    goto :goto_0

    .line 136
    .end local v3    # "urlParam":Ljava/net/URL;
    :catch_0
    move-exception v0

    .line 137
    .local v0, "e":Ljava/net/MalformedURLException;
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to openURL \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\'; Invalid URL format."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 138
    .end local v0    # "e":Ljava/net/MalformedURLException;
    :catch_1
    move-exception v0

    .line 139
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v4, "market://"

    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-le v4, v6, :cond_1

    .line 141
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "myIntent":Landroid/content/Intent;
    const-string v4, "android.intent.action.VIEW"

    const-string v5, "market://"

    const-string v6, "https://market.android.com/"

    invoke-virtual {p1, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 142
    .restart local v1    # "myIntent":Landroid/content/Intent;
    iget-object v4, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 144
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to openURL \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\'; Invalid URL format."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public setContext(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 0
    .param p1, "cordovaInterface"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 123
    check-cast p1, Landroid/app/Activity;

    .end local p1    # "cordovaInterface":Lorg/apache/cordova/api/CordovaInterface;
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/Utils;->myactivity:Landroid/app/Activity;

    .line 124
    return-void
.end method
