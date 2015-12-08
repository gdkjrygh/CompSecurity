.class public Lcom/worklight/androidgap/plugin/NativePage;
.super Lorg/apache/cordova/api/Plugin;
.source "NativePage.java"


# static fields
.field public static NATIVE_ACTIVITY_REQ_CODE:I


# instance fields
.field private myactivity:Lorg/apache/cordova/api/CordovaInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const v0, 0xd599

    sput v0, Lcom/worklight/androidgap/plugin/NativePage;->NATIVE_ACTIVITY_REQ_CODE:I

    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/NativePage;->myactivity:Lorg/apache/cordova/api/CordovaInterface;

    .line 31
    return-void
.end method

.method private createIntentFromJSONData(Ljava/lang/String;)Landroid/content/Intent;
    .locals 8
    .param p1, "jsonString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 99
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 100
    .local v1, "intent":Landroid/content/Intent;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 101
    .local v0, "extrasJson":Lorg/json/JSONObject;
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 102
    .local v2, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_0

    .line 130
    return-object v1

    .line 103
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 104
    .local v3, "key":Ljava/lang/String;
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 105
    .local v5, "obj":Ljava/lang/Object;
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 106
    const/4 v4, 0x0

    .line 107
    .local v4, "nullValue":Ljava/lang/String;
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 108
    .end local v4    # "nullValue":Ljava/lang/String;
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    if-ne v6, v7, :cond_2

    .line 109
    check-cast v5, Ljava/lang/Boolean;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 110
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Byte;

    if-ne v6, v7, :cond_3

    .line 111
    check-cast v5, Ljava/lang/Byte;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 112
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Character;

    if-ne v6, v7, :cond_4

    .line 113
    check-cast v5, Ljava/lang/Character;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 114
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Double;

    if-ne v6, v7, :cond_5

    .line 115
    check-cast v5, Ljava/lang/Double;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 116
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Float;

    if-ne v6, v7, :cond_6

    .line 117
    check-cast v5, Ljava/lang/Float;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 118
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Integer;

    if-ne v6, v7, :cond_7

    .line 119
    check-cast v5, Ljava/lang/Integer;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 120
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Long;

    if-ne v6, v7, :cond_8

    .line 121
    check-cast v5, Ljava/lang/Long;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 122
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/Short;

    if-ne v6, v7, :cond_9

    .line 123
    check-cast v5, Ljava/lang/Short;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 124
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/String;

    if-ne v6, v7, :cond_a

    .line 125
    check-cast v5, Ljava/lang/String;

    .end local v5    # "obj":Ljava/lang/Object;
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 127
    .restart local v5    # "obj":Ljava/lang/Object;
    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "NAtivePage.createIntentFromJSONData: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " is not supported type."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 6
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x2

    .line 57
    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    .line 58
    .local v2, "status":Lorg/apache/cordova/api/PluginResult$Status;
    const-string v1, ""

    .line 60
    .local v1, "result":Ljava/lang/String;
    :try_start_0
    const-string v3, "show"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 62
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-le v3, v4, :cond_1

    .line 63
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v3, v4, v5}, Lcom/worklight/androidgap/plugin/NativePage;->show(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :cond_0
    :goto_0
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    invoke-direct {v3, v2, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 72
    :goto_1
    return-object v3

    .line 65
    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v3, v4, v5}, Lcom/worklight/androidgap/plugin/NativePage;->show(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v3, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_1
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    .line 78
    const/4 v0, 0x1

    return v0
.end method

.method public setContext(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 0
    .param p1, "activity"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 83
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/NativePage;->myactivity:Lorg/apache/cordova/api/CordovaInterface;

    .line 84
    return-void
.end method

.method public show(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "cookies"    # Ljava/lang/String;
    .param p2, "activityClassName"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/lang/String;

    .prologue
    .line 40
    :try_start_0
    sput-object p1, Lcom/worklight/wlclient/api/WLCookieExtractor;->cookies:Ljava/lang/String;

    .line 43
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/NativePage;->myactivity:Lorg/apache/cordova/api/CordovaInterface;

    check-cast v2, Landroid/app/Activity;

    .line 44
    .local v2, "parentActivity":Landroid/app/Activity;
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    .local v1, "nativeIntent":Landroid/content/Intent;
    if-eqz p3, :cond_0

    const-string v3, "{"

    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "}"

    invoke-virtual {p3, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 47
    invoke-direct {p0, p3}, Lcom/worklight/androidgap/plugin/NativePage;->createIntentFromJSONData(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 49
    :cond_0
    iget-object v3, p0, Lcom/worklight/androidgap/plugin/NativePage;->myactivity:Lorg/apache/cordova/api/CordovaInterface;

    sget v4, Lcom/worklight/androidgap/plugin/NativePage;->NATIVE_ACTIVITY_REQ_CODE:I

    invoke-interface {v3, p0, v1, v4}, Lorg/apache/cordova/api/CordovaInterface;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .end local v1    # "nativeIntent":Landroid/content/Intent;
    .end local v2    # "parentActivity":Landroid/app/Activity;
    :goto_0
    return-void

    .line 50
    :catch_0
    move-exception v0

    .line 51
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
