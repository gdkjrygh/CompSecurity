.class public Lcom/worklight/androidgap/plugin/Logger;
.super Lorg/apache/cordova/api/Plugin;
.source "Logger.java"


# instance fields
.field private logCat:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/Logger;->logCat:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 1
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/Logger;->logCat:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 1
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/Logger;->logCat:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 5
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 39
    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    .line 40
    .local v2, "status":Lorg/apache/cordova/api/PluginResult$Status;
    const-string v1, ""

    .line 43
    .local v1, "result":Ljava/lang/String;
    :try_start_0
    const-string v3, "DEBUG"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 44
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/worklight/androidgap/plugin/Logger;->debug(Ljava/lang/String;)V

    .line 49
    :cond_0
    :goto_0
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    invoke-direct {v3, v2, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 51
    :goto_1
    return-object v3

    .line 46
    :cond_1
    const-string v3, "ERROR"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 47
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/worklight/androidgap/plugin/Logger;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    .local v0, "e":Lorg/json/JSONException;
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v3, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_1
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    .line 57
    const/4 v0, 0x1

    return v0
.end method

.method public setContext(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 1
    .param p1, "droidGap"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/Logger;->logCat:Ljava/lang/String;

    .line 67
    return-void
.end method
