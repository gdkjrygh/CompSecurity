.class public Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "AppFeaturesPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AppFeaturesPlugin"


# instance fields
.field public final ACTION_IS_FEATURE:Ljava/lang/String;

.field public final ACTION_SET_FEATURE:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 17
    const-string v0, "isFeatureEnabled"

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->ACTION_IS_FEATURE:Ljava/lang/String;

    .line 18
    const-string v0, "setFeatureEnabled"

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->ACTION_SET_FEATURE:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 12
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 25
    const-string v9, "AppFeaturesPlugin"

    const-string v10, "-- Start --"

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    .line 27
    .local v5, "lc":Lorg/apache/cordova/api/LegacyContext;
    invoke-virtual {v5}, Lorg/apache/cordova/api/LegacyContext;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 29
    .local v0, "activity":Landroid/app/Activity;
    new-instance v7, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v7, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 31
    .local v7, "result":Lorg/apache/cordova/api/PluginResult;
    const-string v9, "isFeatureEnabled"

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 33
    const/4 v9, 0x0

    :try_start_0
    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 34
    .local v6, "mode":Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppFeatures;->getInstance()Lcom/EnterpriseMobileBanking/AppFeatures;

    move-result-object v9

    invoke-virtual {v9, v0, v6}, Lcom/EnterpriseMobileBanking/AppFeatures;->isFeatureEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 35
    .local v1, "b":Z
    const-string v9, "AppFeaturesPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Getting feature: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " value: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    if-eqz v1, :cond_0

    const-string v4, "true"

    .line 37
    .local v4, "enabledString":Ljava/lang/String;
    :goto_0
    const-string v9, "AppFeaturesPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "action: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " result: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v8, v9, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    .local v8, "result":Lorg/apache/cordova/api/PluginResult;
    :try_start_1
    invoke-virtual {p0, v8, p3}, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-object v7, v8

    .line 70
    .end local v1    # "b":Z
    .end local v4    # "enabledString":Ljava/lang/String;
    .end local v6    # "mode":Ljava/lang/String;
    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    :goto_1
    const-string v9, "AppFeaturesPlugin"

    const-string v10, "-- End --"

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    return-object v7

    .line 36
    .restart local v1    # "b":Z
    .restart local v6    # "mode":Ljava/lang/String;
    :cond_0
    :try_start_2
    const-string v4, "false"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 42
    .end local v1    # "b":Z
    .end local v6    # "mode":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 43
    .local v3, "e":Ljava/lang/Exception;
    :goto_2
    new-instance v7, Lorg/apache/cordova/api/PluginResult;

    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 44
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {p0, v7, p3}, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_1

    .line 47
    .end local v3    # "e":Ljava/lang/Exception;
    :cond_1
    const-string v9, "setFeatureEnabled"

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 49
    const-string v6, ""

    .line 51
    .restart local v6    # "mode":Ljava/lang/String;
    const/4 v9, 0x0

    :try_start_3
    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 52
    const/4 v9, 0x1

    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 54
    .local v2, "bValue":Z
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppFeatures;->getInstance()Lcom/EnterpriseMobileBanking/AppFeatures;

    move-result-object v9

    invoke-virtual {v9, v0, v6, v2}, Lcom/EnterpriseMobileBanking/AppFeatures;->setFeatureEnabled(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 56
    const-string v9, "AppFeaturesPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Feature: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " not enabled"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v10, "Feature not enabled."

    invoke-direct {v8, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 58
    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    :try_start_4
    invoke-virtual {p0, v8, p3}, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move-object v7, v8

    .line 63
    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_1

    .line 60
    .end local v2    # "bValue":Z
    :catch_1
    move-exception v3

    .line 61
    .restart local v3    # "e":Ljava/lang/Exception;
    :goto_3
    new-instance v7, Lorg/apache/cordova/api/PluginResult;

    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 62
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {p0, v7, p3}, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_1

    .line 66
    .end local v3    # "e":Ljava/lang/Exception;
    .end local v6    # "mode":Ljava/lang/String;
    :cond_2
    new-instance v7, Lorg/apache/cordova/api/PluginResult;

    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "action: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " is unsupported"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 68
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {p0, v7, p3}, Lcom/EnterpriseMobileBanking/Plugins/AppFeaturesPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 60
    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v2    # "bValue":Z
    .restart local v6    # "mode":Ljava/lang/String;
    .restart local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    :catch_2
    move-exception v3

    move-object v7, v8

    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_3

    .line 42
    .end local v2    # "bValue":Z
    .end local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v1    # "b":Z
    .restart local v4    # "enabledString":Ljava/lang/String;
    .restart local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    :catch_3
    move-exception v3

    move-object v7, v8

    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v7    # "result":Lorg/apache/cordova/api/PluginResult;
    goto/16 :goto_2
.end method
