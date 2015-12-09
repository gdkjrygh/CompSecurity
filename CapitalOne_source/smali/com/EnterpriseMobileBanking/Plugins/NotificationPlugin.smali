.class public Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;
.super Lorg/apache/cordova/Notification;
.source "NotificationPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "NotificationPlugin"

.field private static baseCancelListener:Landroid/content/DialogInterface$OnCancelListener;

.field private static baseCloseListener:Landroid/content/DialogInterface$OnClickListener;

.field private static final dialogs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/app/AlertDialog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;

    .line 214
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$2;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$2;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->baseCloseListener:Landroid/content/DialogInterface$OnClickListener;

    .line 221
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$3;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$3;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->baseCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lorg/apache/cordova/Notification;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/util/List;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;

    return-object v0
.end method

.method public static alertOK(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 3
    .param p0, "title"    # Ljava/lang/String;
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "ctx"    # Landroid/content/Context;

    .prologue
    .line 199
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 201
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 203
    :cond_0
    if-eqz p0, :cond_1

    .line 204
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 206
    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 209
    const-string v1, "OK"

    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->baseCloseListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 210
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->baseCancelListener:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 211
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    return-void
.end method

.method public static closeAllDialogs()V
    .locals 3

    .prologue
    .line 231
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlertDialog;

    .line 232
    .local v0, "dialog":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 233
    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    .line 236
    .end local v0    # "dialog":Landroid/app/AlertDialog;
    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized alert(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 10
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "positiveButton"    # Lorg/json/JSONObject;
    .param p4, "neutralButton"    # Lorg/json/JSONObject;
    .param p5, "negativeButton"    # Lorg/json/JSONObject;
    .param p6, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;

    .prologue
    .line 81
    monitor-enter p0

    :try_start_0
    iget-object v8, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    .line 82
    .local v8, "ctx":Lorg/apache/cordova/api/CordovaInterface;
    move-object v9, p0

    .line 84
    .local v9, "notification":Lorg/apache/cordova/Notification;
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;

    move-object v1, p0

    move-object v2, p4

    move-object v3, p2

    move-object v4, p1

    move-object v5, p3

    move-object/from16 v6, p6

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;Lorg/json/JSONObject;)V

    .line 187
    .local v0, "runnable":Ljava/lang/Runnable;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    monitor-exit p0

    return-void

    .line 81
    .end local v0    # "runnable":Ljava/lang/Runnable;
    .end local v8    # "ctx":Lorg/apache/cordova/api/CordovaInterface;
    .end local v9    # "notification":Lorg/apache/cordova/Notification;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 15
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 34
    new-instance v13, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v13, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 35
    .local v13, "result":Lorg/apache/cordova/api/PluginResult;
    const-string v1, "show"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 37
    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 38
    .local v2, "title":Ljava/lang/String;
    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    .local v3, "message":Ljava/lang/String;
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 41
    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 43
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 45
    .local v9, "buttonsArray":Lorg/json/JSONArray;
    const/4 v1, 0x2

    :try_start_0
    move-object/from16 v0, p2

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 49
    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v14

    .line 50
    .local v14, "size":I
    const/4 v1, 0x3

    new-array v8, v1, [Lorg/json/JSONObject;

    const/4 v1, 0x0

    const/4 v4, 0x0

    aput-object v4, v8, v1

    const/4 v1, 0x1

    const/4 v4, 0x0

    aput-object v4, v8, v1

    const/4 v1, 0x2

    const/4 v4, 0x0

    aput-object v4, v8, v1

    .line 52
    .local v8, "buttons":[Lorg/json/JSONObject;
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_1
    if-ge v11, v14, :cond_0

    .line 54
    :try_start_1
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    aput-object v1, v8, v11

    .line 55
    const-string v1, "NotificationPlugin"

    aget-object v4, v8, v11

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 46
    .end local v8    # "buttons":[Lorg/json/JSONObject;
    .end local v11    # "i":I
    .end local v14    # "size":I
    :catch_0
    move-exception v10

    .line 47
    .local v10, "e":Lorg/json/JSONException;
    const-string v1, "NotificationPlugin"

    const-string v4, "Can\'t get JSONArray of buttons from args"

    invoke-static {v1, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 56
    .end local v10    # "e":Lorg/json/JSONException;
    .restart local v8    # "buttons":[Lorg/json/JSONObject;
    .restart local v11    # "i":I
    .restart local v14    # "size":I
    :catch_1
    move-exception v10

    .line 57
    .restart local v10    # "e":Lorg/json/JSONException;
    const-string v1, "NotificationPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Can\'t get JSONObeject from button: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 60
    .end local v10    # "e":Lorg/json/JSONException;
    :cond_0
    const/4 v1, 0x2

    aget-object v1, v8, v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    aget-object v1, v8, v1

    if-eqz v1, :cond_1

    .line 62
    const/4 v1, 0x2

    const/4 v4, 0x1

    aget-object v4, v8, v4

    aput-object v4, v8, v1

    .line 63
    const/4 v1, 0x1

    const/4 v4, 0x0

    aput-object v4, v8, v1

    .line 66
    :cond_1
    const-string v1, "NotificationPlugin"

    const/4 v4, 0x0

    aget-object v4, v8, v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const/4 v1, 0x0

    aget-object v4, v8, v1

    const/4 v1, 0x1

    aget-object v5, v8, v1

    const/4 v1, 0x2

    aget-object v6, v8, v1

    move-object v1, p0

    move-object/from16 v7, p3

    invoke-virtual/range {v1 .. v7}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->alert(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V

    .line 68
    new-instance v12, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v12, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 69
    .local v12, "r":Lorg/apache/cordova/api/PluginResult;
    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 70
    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 71
    const/4 v1, 0x1

    .line 74
    .end local v2    # "title":Ljava/lang/String;
    .end local v3    # "message":Ljava/lang/String;
    .end local v8    # "buttons":[Lorg/json/JSONObject;
    .end local v9    # "buttonsArray":Lorg/json/JSONArray;
    .end local v11    # "i":I
    .end local v12    # "r":Lorg/apache/cordova/api/PluginResult;
    .end local v14    # "size":I
    :goto_3
    return v1

    .line 73
    :cond_2
    move-object/from16 v0, p3

    invoke-virtual {v0, v13}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 74
    const/4 v1, 0x1

    goto :goto_3
.end method
