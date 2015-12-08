.class public Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "OpenCallbackTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "OpenCBT"

.field private static final actions:[Ljava/lang/String;


# instance fields
.field private address:Ljava/lang/String;

.field private args:Lorg/json/JSONObject;

.field private view:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 20
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "openInnerWebView"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "openSecuredInnerWebView"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "openMigrationWebView"

    aput-object v2, v0, v1

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->actions:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 24
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    .line 26
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    .line 28
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    .line 32
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 1
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 24
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    .line 26
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    .line 28
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public static load()V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method private parseArgs(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 10
    .param p1, "parameters"    # Lorg/json/JSONArray;

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x1

    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "{"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .local v2, "json":Ljava/lang/StringBuilder;
    const/4 v3, 0x0

    .line 120
    .local v3, "retVal":Lorg/json/JSONObject;
    const-string v5, "OpenCBT"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Parameters length: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lez v5, :cond_0

    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "address : \""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-le v5, v9, :cond_2

    .line 127
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "RP"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "GET"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 131
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 132
    .local v0, "ja":Lorg/json/JSONArray;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->setOutsideAppList(Lorg/json/JSONArray;)V

    .line 133
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "GET"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 139
    const-string v5, ", mode: \"quiet\""

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v5, "OpenCBT"

    const-string v6, "request in silent mode"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .end local v0    # "ja":Lorg/json/JSONArray;
    :cond_2
    :goto_0
    const-string v5, "}"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .end local v3    # "retVal":Lorg/json/JSONObject;
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .restart local v3    # "retVal":Lorg/json/JSONObject;
    :goto_1
    const-string v6, "OpenCBT"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "retVal  is: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    if-nez v3, :cond_6

    const-string v5, "NULL"

    :goto_2
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    return-object v3

    .line 145
    .restart local v0    # "ja":Lorg/json/JSONArray;
    :cond_3
    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v4

    .line 147
    .local v4, "s":Ljava/lang/String;
    const-string v5, "+"

    const-string v6, "%2B"

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 148
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ",mode: \"rewards\", postData: \""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    const-string v5, "OpenCBT"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "rewards postData: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 154
    .end local v0    # "ja":Lorg/json/JSONArray;
    .end local v4    # "s":Ljava/lang/String;
    :cond_4
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "migration"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 155
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ", postData: \"assertion="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "&successView="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "&custMigrationScenarioInd="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x3

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "&customerMigrationEligible=true\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 160
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ", postData: \"assertion="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "&successView="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 170
    .end local v3    # "retVal":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 171
    .local v1, "jse":Lorg/json/JSONException;
    const-string v5, "OpenCBT"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "JSONException: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const/4 v3, 0x0

    .restart local v3    # "retVal":Lorg/json/JSONObject;
    goto/16 :goto_1

    .line 175
    .end local v1    # "jse":Lorg/json/JSONException;
    :cond_6
    const-string v5, "NOT NULL"

    goto/16 :goto_2
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 3
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 184
    const-string v0, "OpenCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Create: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 93
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    .line 94
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->parameters:Lorg/json/JSONArray;

    invoke-direct {p0, v1}, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->parseArgs(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    .line 95
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    if-nez v1, :cond_0

    .line 114
    :goto_0
    return-void

    .line 98
    :cond_0
    monitor-enter p1

    .line 99
    :try_start_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    const-string v2, "address"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    .line 100
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 102
    const-string v1, "OpenCBT"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ADDRESS IS: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    .line 106
    const-string v1, "OpenCBT"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Done waiting for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v2, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :cond_1
    :goto_1
    :try_start_2
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 108
    :catch_0
    move-exception v0

    .line 109
    .local v0, "e":Ljava/lang/InterruptedException;
    :try_start_3
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v2, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public run()V
    .locals 7

    .prologue
    .line 45
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    monitor-enter v4

    .line 46
    :try_start_0
    const-string v3, "OpenCBT"

    const-string v5, "Running"

    invoke-static {v3, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->fixupUserAgentString(Landroid/webkit/WebView;)V

    .line 50
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->clearHistory()V

    .line 51
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 55
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    const-string v5, "postData"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    .local v1, "postData":Ljava/lang/String;
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->args:Lorg/json/JSONObject;

    const-string v5, "mode"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 58
    .local v2, "sMode":Ljava/lang/String;
    const-string v5, "OpenCBT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Address: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " -- Data: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    if-nez v1, :cond_2

    const-string v3, "null"

    :goto_0
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    if-eqz v2, :cond_1

    .line 62
    const-string v3, "OpenCBT"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Adding url attribute: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " to: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {v0, v3}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 64
    .local v0, "attr":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    invoke-virtual {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setMode(Ljava/lang/String;)V

    .line 65
    const-string v3, "rewards"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 66
    const v3, 0xfde8

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setTimeOutValue(I)V

    .line 67
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setView(Landroid/webkit/WebView;)V

    .line 68
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->startTimer()V

    .line 71
    :cond_0
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-static {v3, v0}, Lcom/EnterpriseMobileBanking/AppHelper;->addURLAttributes(Ljava/lang/String;Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .line 73
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v3, v5, :cond_1

    .line 74
    const-string v3, "rewards"

    invoke-static {v3, v0}, Lcom/EnterpriseMobileBanking/AppHelper;->addURLAttributes(Ljava/lang/String;Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .line 78
    .end local v0    # "attr":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    :cond_1
    if-eqz v1, :cond_3

    .line 79
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    .line 83
    :goto_1
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 84
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 87
    monitor-exit v4

    .line 88
    return-void

    .line 58
    :cond_2
    const-string v3, "not null"

    goto/16 :goto_0

    .line 81
    :cond_3
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->view:Landroid/webkit/WebView;

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Utils/OpenCallbackTask;->address:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 87
    .end local v1    # "postData":Ljava/lang/String;
    .end local v2    # "sMode":Ljava/lang/String;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method
