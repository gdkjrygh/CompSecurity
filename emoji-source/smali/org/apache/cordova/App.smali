.class public Lorg/apache/cordova/App;
.super Lorg/apache/cordova/CordovaPlugin;
.source "App.java"


# static fields
.field protected static final TAG:Ljava/lang/String; = "CordovaApp"


# instance fields
.field private telephonyReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private initTelephonyReceiver()V
    .locals 3

    .prologue
    .line 260
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 261
    .local v0, "intentFilter":Landroid/content/IntentFilter;
    const-string v1, "android.intent.action.PHONE_STATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 263
    new-instance v1, Lorg/apache/cordova/App$5;

    invoke-direct {v1, p0}, Lorg/apache/cordova/App$5;-><init>(Lorg/apache/cordova/App;)V

    iput-object v1, p0, Lorg/apache/cordova/App;->telephonyReceiver:Landroid/content/BroadcastReceiver;

    .line 290
    iget-object v1, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/App;->telephonyReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 291
    return-void
.end method


# virtual methods
.method public backHistory()V
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lorg/apache/cordova/App$4;

    invoke-direct {v1, p0}, Lorg/apache/cordova/App$4;-><init>(Lorg/apache/cordova/App;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 207
    return-void
.end method

.method public clearCache()V
    .locals 2

    .prologue
    .line 119
    iget-object v0, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lorg/apache/cordova/App$2;

    invoke-direct {v1, p0}, Lorg/apache/cordova/App$2;-><init>(Lorg/apache/cordova/App;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 124
    return-void
.end method

.method public clearHistory()V
    .locals 2

    .prologue
    .line 190
    iget-object v0, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lorg/apache/cordova/App$3;

    invoke-direct {v1, p0}, Lorg/apache/cordova/App$3;-><init>(Lorg/apache/cordova/App;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 195
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 7
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 65
    sget-object v2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    .line 66
    .local v2, "status":Lorg/apache/cordova/PluginResult$Status;
    const-string v1, ""

    .line 69
    .local v1, "result":Ljava/lang/String;
    :try_start_0
    const-string v5, "clearCache"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 70
    invoke-virtual {p0}, Lorg/apache/cordova/App;->clearCache()V

    .line 103
    :cond_0
    :goto_0
    new-instance v5, Lorg/apache/cordova/PluginResult;

    invoke-direct {v5, v2, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 107
    :goto_1
    return v3

    .line 72
    :cond_1
    const-string v5, "show"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 76
    iget-object v5, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v5}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v5

    new-instance v6, Lorg/apache/cordova/App$1;

    invoke-direct {v6, p0}, Lorg/apache/cordova/App$1;-><init>(Lorg/apache/cordova/App;)V

    invoke-virtual {v5, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 105
    :catch_0
    move-exception v0

    .line 106
    .local v0, "e":Lorg/json/JSONException;
    new-instance v3, Lorg/apache/cordova/PluginResult;

    sget-object v5, Lorg/apache/cordova/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v3, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    invoke-virtual {p3, v3}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    move v3, v4

    .line 107
    goto :goto_1

    .line 82
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_2
    :try_start_1
    const-string v5, "loadUrl"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 83
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {p0, v5, v6}, Lorg/apache/cordova/App;->loadUrl(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 85
    :cond_3
    const-string v5, "cancelLoadUrl"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 88
    const-string v5, "clearHistory"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 89
    invoke-virtual {p0}, Lorg/apache/cordova/App;->clearHistory()V

    goto :goto_0

    .line 91
    :cond_4
    const-string v5, "backHistory"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 92
    invoke-virtual {p0}, Lorg/apache/cordova/App;->backHistory()V

    goto :goto_0

    .line 94
    :cond_5
    const-string v5, "overrideButton"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 95
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v6

    invoke-virtual {p0, v5, v6}, Lorg/apache/cordova/App;->overrideButton(Ljava/lang/String;Z)V

    goto :goto_0

    .line 97
    :cond_6
    const-string v5, "overrideBackbutton"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 98
    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v5

    invoke-virtual {p0, v5}, Lorg/apache/cordova/App;->overrideBackbutton(Z)V

    goto/16 :goto_0

    .line 100
    :cond_7
    const-string v5, "exitApp"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 101
    invoke-virtual {p0}, Lorg/apache/cordova/App;->exitApp()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public exitApp()V
    .locals 3

    .prologue
    .line 250
    iget-object v0, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    const-string v1, "exit"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    return-void
.end method

.method public isBackbuttonOverridden()Z
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CordovaWebView;->isButtonPlumbedToJs(I)Z

    move-result v0

    return v0
.end method

.method public loadUrl(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 12
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "props"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 134
    const-string v9, "App"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "App.loadUrl("

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ","

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ")"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const/4 v8, 0x0

    .line 136
    .local v8, "wait":I
    const/4 v5, 0x0

    .line 137
    .local v5, "openExternal":Z
    const/4 v0, 0x0

    .line 140
    .local v0, "clearHistory":Z
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 141
    .local v6, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p2, :cond_6

    .line 142
    invoke-virtual {p2}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v4

    .line 143
    .local v4, "keys":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v2, v9, :cond_6

    .line 144
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 145
    .local v3, "key":Ljava/lang/String;
    const-string v9, "wait"

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 146
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 143
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 148
    :cond_1
    const-string v9, "openexternal"

    invoke-virtual {v3, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 149
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    .line 151
    :cond_2
    const-string v9, "clearhistory"

    invoke-virtual {v3, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 152
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    .line 155
    :cond_3
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 156
    .local v7, "value":Ljava/lang/Object;
    if-eqz v7, :cond_0

    .line 159
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-class v10, Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 160
    check-cast v7, Ljava/lang/String;

    .end local v7    # "value":Ljava/lang/Object;
    invoke-virtual {v6, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 162
    .restart local v7    # "value":Ljava/lang/Object;
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-class v10, Ljava/lang/Boolean;

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 163
    check-cast v7, Ljava/lang/Boolean;

    .end local v7    # "value":Ljava/lang/Object;
    invoke-virtual {v6, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 165
    .restart local v7    # "value":Ljava/lang/Object;
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-class v10, Ljava/lang/Integer;

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 166
    check-cast v7, Ljava/lang/Integer;

    .end local v7    # "value":Ljava/lang/Object;
    invoke-virtual {v6, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 174
    .end local v2    # "i":I
    .end local v3    # "key":Ljava/lang/String;
    .end local v4    # "keys":Lorg/json/JSONArray;
    :cond_6
    if-lez v8, :cond_7

    .line 176
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    int-to-long v10, v8

    :try_start_1
    invoke-virtual {p0, v10, v11}, Ljava/lang/Object;->wait(J)V

    .line 178
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    :cond_7
    :goto_2
    iget-object v9, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v9, p1, v5, v0, v6}, Lorg/apache/cordova/CordovaWebView;->showWebPage(Ljava/lang/String;ZZLjava/util/HashMap;)V

    .line 184
    return-void

    .line 178
    :catchall_0
    move-exception v9

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v9
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 179
    :catch_0
    move-exception v1

    .line 180
    .local v1, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_2
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 299
    iget-object v0, p0, Lorg/apache/cordova/App;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/App;->telephonyReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 300
    return-void
.end method

.method public overrideBackbutton(Z)V
    .locals 2
    .param p1, "override"    # Z

    .prologue
    .line 216
    const-string v0, "App"

    const-string v1, "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    .line 218
    return-void
.end method

.method public overrideButton(Ljava/lang/String;Z)V
    .locals 2
    .param p1, "button"    # Ljava/lang/String;
    .param p2, "override"    # Z

    .prologue
    .line 228
    const-string v0, "App"

    const-string v1, "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const-string v0, "volumeup"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    const/16 v1, 0x18

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    .line 235
    :cond_0
    :goto_0
    return-void

    .line 232
    :cond_1
    const-string v0, "volumedown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lorg/apache/cordova/App;->webView:Lorg/apache/cordova/CordovaWebView;

    const/16 v1, 0x19

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    goto :goto_0
.end method

.method public pluginInitialize()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Lorg/apache/cordova/App;->initTelephonyReceiver()V

    .line 54
    return-void
.end method
