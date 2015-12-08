.class public Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "ESIPlugin.java"

# interfaces
.implements Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;


# static fields
.field private static TAG:Ljava/lang/String;

.field private static sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;


# instance fields
.field activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field private callbackId:Ljava/lang/String;

.field protected jsonArr:Lorg/json/JSONArray;

.field private maskedUserName:Ljava/lang/String;

.field private storedPatternValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-string v0, "ESIPlugin"

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 44
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public callbackCall()V
    .locals 2

    .prologue
    .line 353
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v1, "in callbackCall for AlertDialog"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 21
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 50
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v17

    invoke-direct {v0, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 178
    :goto_0
    return-object v17

    .line 55
    :cond_0
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    .line 56
    .local v14, "lc":Lorg/apache/cordova/api/LegacyContext;
    invoke-virtual {v14}, Lorg/apache/cordova/api/LegacyContext;->getActivity()Landroid/app/Activity;

    move-result-object v3

    check-cast v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .line 57
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPatternValue()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->storedPatternValue:Ljava/lang/String;

    .line 58
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getMaskedUserName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->maskedUserName:Ljava/lang/String;

    .line 60
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 61
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const-string v4, "Authenticating"

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 62
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 63
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const/16 v4, 0x1e

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 65
    :cond_1
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "jsonArr = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    if-nez v3, :cond_2

    .line 68
    new-instance v3, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppView()Landroid/webkit/WebView;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const/4 v8, 0x0

    move-object/from16 v7, p0

    invoke-direct/range {v3 .. v8}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;-><init>(Landroid/app/Activity;Landroid/view/View;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;Z)V

    sput-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .line 72
    :cond_2
    sget-object v20, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    .line 73
    .local v20, "status":Lorg/apache/cordova/api/PluginResult$Status;
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->callbackId:Ljava/lang/String;

    .line 74
    const-string v10, ""

    .line 75
    .local v10, "errorCode":Ljava/lang/String;
    const-string v11, ""

    .line 76
    .local v11, "errorMessage":Ljava/lang/String;
    const-string v16, ""

    .line 77
    .local v16, "pattern":Ljava/lang/String;
    const-string v15, ""

    .line 78
    .local v15, "maskedusername":Ljava/lang/String;
    const-string v19, ""

    .line 79
    .local v19, "signInMessageType":Ljava/lang/String;
    const-string v18, ""

    .line 81
    .local v18, "signInMessage":Ljava/lang/String;
    const-string v3, "launchEnrollmentFlow"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 82
    const-string v13, "true"

    .line 83
    .local v13, "isSlideUpOffer":Ljava/lang/String;
    const-string v12, ""

    .line 85
    .local v12, "expressSignInPreference":Ljava/lang/String;
    const/4 v3, 0x0

    :try_start_0
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 86
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v12

    .line 91
    :goto_1
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "launchEnrollmentFlow is being called"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v12}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->launchEnrollmentFlow(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .end local v12    # "expressSignInPreference":Ljava/lang/String;
    .end local v13    # "isSlideUpOffer":Ljava/lang/String;
    :goto_2
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 177
    .local v17, "r":Lorg/apache/cordova/api/PluginResult;
    const/4 v3, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    goto/16 :goto_0

    .line 87
    .end local v17    # "r":Lorg/apache/cordova/api/PluginResult;
    .restart local v12    # "expressSignInPreference":Ljava/lang/String;
    .restart local v13    # "isSlideUpOffer":Ljava/lang/String;
    :catch_0
    move-exception v9

    .line 88
    .local v9, "e":Lorg/json/JSONException;
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "Cannot parse args for launchEnrollmentFlow"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 95
    .end local v9    # "e":Lorg/json/JSONException;
    .end local v12    # "expressSignInPreference":Ljava/lang/String;
    .end local v13    # "isSlideUpOffer":Ljava/lang/String;
    :cond_3
    const-string v3, "launchSignInFlow"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 96
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "about to call launchSignInFlow"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const-string v4, ""

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setPatternValue(Ljava/lang/String;)V

    .line 100
    const/4 v3, 0x0

    :try_start_1
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 101
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 102
    const/4 v3, 0x2

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v18

    .line 108
    :goto_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$1;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 117
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v18

    invoke-virtual {v0, v15, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->launchSignInFlow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 103
    :catch_1
    move-exception v9

    .line 104
    .restart local v9    # "e":Lorg/json/JSONException;
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "Cannot parse args for launchSignInFlow"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 119
    .end local v9    # "e":Lorg/json/JSONException;
    :cond_4
    const-string v3, "showLoginErrorMessage"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 121
    const/4 v3, 0x0

    :try_start_2
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v10

    .line 122
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v11

    .line 123
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "errorMessage = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->storedPatternValue:Ljava/lang/String;

    move-object/from16 v16, v0

    .line 126
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->maskedUserName:Ljava/lang/String;

    .line 127
    if-eqz v11, :cond_5

    const-string v3, "null"

    invoke-static {v11, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 128
    :cond_5
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "Generic error message being sent because none received back from STL."

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string v11, "Generic error.  Unknown cause."
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 136
    :cond_6
    :goto_4
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 137
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v10, v11, v1, v15}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->showLoginErrorMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 131
    :catch_2
    move-exception v9

    .line 132
    .restart local v9    # "e":Lorg/json/JSONException;
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "Cannot parse args for showLoginErrorMessage"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 139
    .end local v9    # "e":Lorg/json/JSONException;
    :cond_7
    const-string v3, "showSureSwipeBypassSlideUp"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 140
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "should call showSureSwipeBypassSlideUp"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-virtual/range {p0 .. p0}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->showSureSwipeBypassSlideUp()V

    goto/16 :goto_2

    .line 144
    :cond_8
    const-string v3, "showEnrollmentStatusMessage"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 145
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "should call showEnrollmentStatusMessage"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 148
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 156
    move-object/from16 v0, p0

    invoke-virtual {v0, v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->showEnrollmentStatusMessage(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 158
    :cond_9
    const-string v3, "dismissLoginPage"

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 159
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "about to call dismissLoginPage"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v4, "Dismissing sureSwipeBusy Dialog"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 163
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$3;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_2

    .line 174
    :cond_a
    new-instance v17, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->INVALID_ACTION:Lorg/apache/cordova/api/PluginResult$Status;

    move-object/from16 v0, v17

    invoke-direct {v0, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto/16 :goto_0
.end method

.method public launchEnrollmentFlow(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "isSlideUpOffer"    # Ljava/lang/String;
    .param p2, "expressSignInPreference"    # Ljava/lang/String;

    .prologue
    .line 272
    const-string v1, "true"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 273
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 274
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "AppHeaderNavOption"

    const-string v2, "CLOSE"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 277
    const-string v1, "ASK_LATER"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 278
    const-string v1, "expressSignInPreference"

    const-string v2, "ASK_LATER"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 286
    :goto_0
    const-string v1, "lockpattern_mode"

    sget-object v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 287
    const-string v1, "isSlideUpOffer"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 288
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const/16 v2, 0x4d2

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 289
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    const v2, 0x7f040007

    const/high16 v3, 0x7f040000

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 291
    return-void

    .line 280
    :cond_0
    const-string v1, "expressSignInPreference"

    const-string v2, "NOT_ENROLLED"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 283
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 284
    .restart local v0    # "intent":Landroid/content/Intent;
    const-string v1, "AppHeaderNavOption"

    const-string v2, "CLOSE"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public launchSignInFlow(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "userName"    # Ljava/lang/String;
    .param p2, "signInMessageType"    # Ljava/lang/String;
    .param p3, "signInMessage"    # Ljava/lang/String;

    .prologue
    .line 295
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 296
    .local v0, "intent":Landroid/content/Intent;
    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 297
    const-string v1, "AppHeaderNavOption"

    const-string v2, "MENU"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 298
    const-string v1, "signInMessageType"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 299
    const-string v1, "signInMessage"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    const-string v1, "lockpattern_mode"

    sget-object v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    const-string v1, "userName"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 302
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const/16 v2, 0x4d2

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 303
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 183
    invoke-super {p0, p1, p2, p3}, Lorg/apache/cordova/api/Plugin;->onActivityResult(IILandroid/content/Intent;)V

    .line 184
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onActivityResult(requestCode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", resultCode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f0800a5

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 188
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    if-eqz v5, :cond_0

    .line 189
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "about to sureSwipeBusy.hide()"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 194
    :cond_0
    const/16 v5, 0x15b3

    if-ne p2, v5, :cond_1

    .line 195
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "resultCode  = 5555 and setting the transition page and dialog"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f080024

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 197
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f0800a4

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 198
    const-string v5, "LockPatternAction"

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 199
    .local v2, "lockPatternAction":Ljava/lang/String;
    const-string v5, "create"

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 201
    :try_start_0
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const/4 v6, 0x0

    const-string v7, "Enrolling"

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 202
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    invoke-virtual {v5, v6, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->show(Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    .end local v2    # "lockPatternAction":Ljava/lang/String;
    :cond_1
    :goto_0
    const/16 v5, 0x7d0

    if-eq p2, v5, :cond_2

    if-nez p2, :cond_3

    .line 220
    :cond_2
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onActivityForResult where resultCode = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 222
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f080024

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 223
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f0800a4

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 225
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f0800a5

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 229
    :cond_3
    if-nez p2, :cond_8

    .line 230
    const/4 v1, 0x0

    .line 235
    .local v1, "extras":Landroid/os/Bundle;
    :goto_1
    if-eqz v1, :cond_6

    .line 236
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "extras != null"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v5, "SuppressSplash"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 239
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "Setting SuppressSplash to true"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSplashSuppress(Z)V

    .line 243
    :cond_4
    const-string v5, "LockPatternAction"

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 244
    .restart local v2    # "lockPatternAction":Ljava/lang/String;
    if-eqz v2, :cond_5

    .line 245
    const-string v5, "compare"

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 246
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "javascript:SureSwipePlugin.authenticatePattern(\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "mypattern"

    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\');"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sendJavascript(Ljava/lang/String;)V

    .line 257
    :cond_5
    :goto_2
    const-string v5, "sureSwipeSettings"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 258
    .local v4, "sureswipeSettings":Ljava/lang/String;
    const-string v5, "sureSwipeSettingsPage"

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 259
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "sending to www/settings/expressSignIn"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v5, "window.location.hash=\'www/settings/expressSignIn\';"

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sendJavascript(Ljava/lang/String;)V

    .line 263
    .end local v2    # "lockPatternAction":Ljava/lang/String;
    .end local v4    # "sureswipeSettings":Ljava/lang/String;
    :cond_6
    new-instance v3, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v3, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 264
    .local v3, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 265
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 267
    return-void

    .line 203
    .end local v1    # "extras":Landroid/os/Bundle;
    .end local v3    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v2    # "lockPatternAction":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 204
    .local v0, "e":Lorg/json/JSONException;
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "failure in adding \'Enrolling\' to jsonArr"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 208
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_7
    :try_start_1
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    const/4 v6, 0x0

    const-string v7, "Authenticating"

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 209
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sureSwipeBusy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->jsonArr:Lorg/json/JSONArray;

    invoke-virtual {v5, v6, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->show(Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 210
    :catch_1
    move-exception v0

    .line 211
    .restart local v0    # "e":Lorg/json/JSONException;
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "failure in adding \'Authenticating\' to jsonArr"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 232
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v2    # "lockPatternAction":Ljava/lang/String;
    :cond_8
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .restart local v1    # "extras":Landroid/os/Bundle;
    goto/16 :goto_1

    .line 247
    .restart local v2    # "lockPatternAction":Ljava/lang/String;
    :cond_9
    const-string v5, "create"

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 248
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "javascript:SureSwipePlugin.enrollPattern(\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "mypattern"

    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\');"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sendJavascript(Ljava/lang/String;)V

    goto :goto_2

    .line 249
    :cond_a
    const-string v5, "ReturnToHome"

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 250
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v6, "EMB about to call returnToHome(appView)"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v7, 0x7f0800a0

    invoke-virtual {v6, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->returnToHome(Landroid/view/View;)V

    goto/16 :goto_2

    .line 252
    :cond_b
    const-string v5, "DECLINE"

    invoke-static {v2, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 253
    sget-object v5, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "javascript:SureSwipePlugin.enrollPattern and DeclineSureSwipe is: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "DeclineSureSwipe"

    invoke-virtual {p3, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "javascript:SureSwipePlugin.updatePreference(\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "DeclineSureSwipe"

    invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\');"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_2
.end method

.method public showEnrollmentStatusMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "errorCode"    # Ljava/lang/String;
    .param p2, "errorMessage"    # Ljava/lang/String;

    .prologue
    const/high16 v4, 0x10000

    .line 321
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showEnrollmentStatusMessage errorMessage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showEnrollmentStatusMessage errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    if-eqz p1, :cond_0

    const-string v1, "0"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 324
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 325
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 326
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v2, "showEnrollmentStatusMessage - Enrollment Success"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V

    .line 339
    :goto_0
    return-void

    .line 329
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 330
    .restart local v0    # "intent":Landroid/content/Intent;
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 331
    const-string v1, "AppHeaderNavOption"

    const-string v2, "MENU"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 332
    const-string v1, "lockpattern_mode"

    sget-object v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 334
    const-string v1, "errorcode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    const-string v1, "errorMessage"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const/16 v2, 0x4d2

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public showLoginErrorMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "errorCode"    # Ljava/lang/String;
    .param p2, "errorMessage"    # Ljava/lang/String;
    .param p3, "pattern"    # Ljava/lang/String;
    .param p4, "userName"    # Ljava/lang/String;

    .prologue
    .line 307
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 308
    .local v0, "intent":Landroid/content/Intent;
    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 309
    const-string v1, "AppHeaderNavOption"

    const-string v2, "MENU"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 310
    const-string v1, "lockpattern_mode"

    sget-object v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 311
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showLoginErrorMessage errorMessage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showLoginErrorMessage errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string v1, "errorcode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 314
    const-string v1, "errorMessage"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 315
    const-string v1, "pattern"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 316
    const-string v1, "userName"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const/16 v2, 0x4d2

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 318
    return-void
.end method

.method public showSureSwipeBypassSlideUp()V
    .locals 4

    .prologue
    .line 342
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v2, "in showSureSwipeBypassSlideUp"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 344
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "AppHeaderNavOption"

    const-string v2, "CLOSE"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 345
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const/16 v2, 0x4d2

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 346
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;

    const-string v2, "showSureSwipeBypassSlideUp should be sliding up now"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    const v2, 0x7f040007

    const/high16 v3, 0x7f040000

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 348
    return-void
.end method
