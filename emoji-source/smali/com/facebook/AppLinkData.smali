.class public Lcom/facebook/AppLinkData;
.super Ljava/lang/Object;
.source "AppLinkData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/AppLinkData$CompletionHandler;
    }
.end annotation


# static fields
.field private static final APPLINK_BRIDGE_ARGS_KEY:Ljava/lang/String; = "bridge_args"

.field private static final APPLINK_METHOD_ARGS_KEY:Ljava/lang/String; = "method_args"

.field private static final APPLINK_VERSION_KEY:Ljava/lang/String; = "version"

.field public static final ARGUMENTS_NATIVE_CLASS_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_NATIVE_CLASS"

.field public static final ARGUMENTS_NATIVE_URL:Ljava/lang/String; = "com.facebook.platform.APPLINK_NATIVE_URL"

.field public static final ARGUMENTS_REFERER_DATA_KEY:Ljava/lang/String; = "referer_data"

.field public static final ARGUMENTS_TAPTIME_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_TAP_TIME_UTC"

.field private static final BRIDGE_ARGS_METHOD_KEY:Ljava/lang/String; = "method"

.field private static final BUNDLE_AL_APPLINK_DATA_KEY:Ljava/lang/String; = "al_applink_data"

.field static final BUNDLE_APPLINK_ARGS_KEY:Ljava/lang/String; = "com.facebook.platform.APPLINK_ARGS"

.field private static final DEFERRED_APP_LINK_ARGS_FIELD:Ljava/lang/String; = "applink_args"

.field private static final DEFERRED_APP_LINK_CLASS_FIELD:Ljava/lang/String; = "applink_class"

.field private static final DEFERRED_APP_LINK_CLICK_TIME_FIELD:Ljava/lang/String; = "click_time"

.field private static final DEFERRED_APP_LINK_EVENT:Ljava/lang/String; = "DEFERRED_APP_LINK"

.field private static final DEFERRED_APP_LINK_PATH:Ljava/lang/String; = "%s/activities"

.field private static final DEFERRED_APP_LINK_URL_FIELD:Ljava/lang/String; = "applink_url"

.field private static final METHOD_ARGS_REF_KEY:Ljava/lang/String; = "ref"

.field private static final METHOD_ARGS_TARGET_URL_KEY:Ljava/lang/String; = "target_url"

.field private static final REFERER_DATA_REF_KEY:Ljava/lang/String; = "fb_ref"

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private argumentBundle:Landroid/os/Bundle;

.field private arguments:Lorg/json/JSONObject;

.field private ref:Ljava/lang/String;

.field private targetUri:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 77
    const-class v0, Lcom/facebook/AppLinkData;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 351
    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    .locals 0
    .param p0, "x0"    # Landroid/content/Context;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lcom/facebook/AppLinkData$CompletionHandler;

    .prologue
    .line 39
    invoke-static {p0, p1, p2}, Lcom/facebook/AppLinkData;->fetchDeferredAppLinkFromServer(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V

    return-void
.end method

.method public static createFromActivity(Landroid/app/Activity;)Lcom/facebook/AppLinkData;
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 210
    const-string v3, "activity"

    invoke-static {p0, v3}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 212
    .local v2, "intent":Landroid/content/Intent;
    if-nez v2, :cond_1

    .line 213
    const/4 v1, 0x0

    .line 226
    :cond_0
    :goto_0
    return-object v1

    .line 216
    :cond_1
    invoke-static {v2}, Lcom/facebook/AppLinkData;->createFromAlApplinkData(Landroid/content/Intent;)Lcom/facebook/AppLinkData;

    move-result-object v1

    .line 217
    .local v1, "appLinkData":Lcom/facebook/AppLinkData;
    if-nez v1, :cond_2

    .line 218
    const-string v3, "com.facebook.platform.APPLINK_ARGS"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 219
    .local v0, "appLinkArgsJsonString":Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/AppLinkData;

    move-result-object v1

    .line 221
    .end local v0    # "appLinkArgsJsonString":Ljava/lang/String;
    :cond_2
    if-nez v1, :cond_0

    .line 223
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/AppLinkData;->createFromUri(Landroid/net/Uri;)Lcom/facebook/AppLinkData;

    move-result-object v1

    goto :goto_0
.end method

.method private static createFromAlApplinkData(Landroid/content/Intent;)Lcom/facebook/AppLinkData;
    .locals 6
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x0

    .line 230
    const-string v5, "al_applink_data"

    invoke-virtual {p0, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 231
    .local v1, "applinks":Landroid/os/Bundle;
    if-nez v1, :cond_1

    move-object v0, v4

    .line 250
    :cond_0
    :goto_0
    return-object v0

    .line 235
    :cond_1
    new-instance v0, Lcom/facebook/AppLinkData;

    invoke-direct {v0}, Lcom/facebook/AppLinkData;-><init>()V

    .line 236
    .local v0, "appLinkData":Lcom/facebook/AppLinkData;
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    iput-object v5, v0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 237
    iget-object v5, v0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    if-nez v5, :cond_2

    .line 238
    const-string v5, "target_url"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 239
    .local v3, "targetUriString":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 240
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iput-object v5, v0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 243
    .end local v3    # "targetUriString":Ljava/lang/String;
    :cond_2
    iput-object v1, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    .line 244
    iput-object v4, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 245
    const-string v4, "referer_data"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 246
    .local v2, "refererData":Landroid/os/Bundle;
    if-eqz v2, :cond_0

    .line 247
    const-string v4, "fb_ref"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;

    goto :goto_0
.end method

.method private static createFromJson(Ljava/lang/String;)Lcom/facebook/AppLinkData;
    .locals 10
    .param p0, "jsonString"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 254
    if-nez p0, :cond_0

    move-object v1, v7

    .line 295
    :goto_0
    return-object v1

    .line 260
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 261
    .local v0, "appLinkArgsJson":Lorg/json/JSONObject;
    const-string v8, "version"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 263
    .local v6, "version":Ljava/lang/String;
    const-string v8, "bridge_args"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 264
    .local v2, "bridgeArgs":Lorg/json/JSONObject;
    const-string v8, "method"

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 265
    .local v4, "method":Ljava/lang/String;
    const-string v8, "applink"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "2"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 267
    new-instance v1, Lcom/facebook/AppLinkData;

    invoke-direct {v1}, Lcom/facebook/AppLinkData;-><init>()V

    .line 269
    .local v1, "appLinkData":Lcom/facebook/AppLinkData;
    const-string v8, "method_args"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    .line 271
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "ref"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 272
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "ref"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;

    .line 281
    :cond_1
    :goto_1
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "target_url"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 282
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "target_url"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    .line 285
    :cond_2
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    invoke-static {v8}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 289
    .end local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .end local v1    # "appLinkData":Lcom/facebook/AppLinkData;
    .end local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .end local v4    # "method":Ljava/lang/String;
    .end local v6    # "version":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 290
    .local v3, "e":Lorg/json/JSONException;
    sget-object v8, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v9, "Unable to parse AppLink JSON"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v3    # "e":Lorg/json/JSONException;
    :cond_3
    :goto_2
    move-object v1, v7

    .line 295
    goto :goto_0

    .line 273
    .restart local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .restart local v1    # "appLinkData":Lcom/facebook/AppLinkData;
    .restart local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .restart local v4    # "method":Ljava/lang/String;
    .restart local v6    # "version":Ljava/lang/String;
    :cond_4
    :try_start_1
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "referer_data"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 275
    iget-object v8, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v9, "referer_data"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 276
    .local v5, "refererData":Lorg/json/JSONObject;
    const-string v8, "fb_ref"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 277
    const-string v8, "fb_ref"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/facebook/FacebookException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 291
    .end local v0    # "appLinkArgsJson":Lorg/json/JSONObject;
    .end local v1    # "appLinkData":Lcom/facebook/AppLinkData;
    .end local v2    # "bridgeArgs":Lorg/json/JSONObject;
    .end local v4    # "method":Ljava/lang/String;
    .end local v5    # "refererData":Lorg/json/JSONObject;
    .end local v6    # "version":Ljava/lang/String;
    :catch_1
    move-exception v3

    .line 292
    .local v3, "e":Lcom/facebook/FacebookException;
    sget-object v8, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v9, "Unable to parse AppLink JSON"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

.method private static createFromUri(Landroid/net/Uri;)Lcom/facebook/AppLinkData;
    .locals 1
    .param p0, "appLinkDataUri"    # Landroid/net/Uri;

    .prologue
    .line 299
    if-nez p0, :cond_0

    .line 300
    const/4 v0, 0x0

    .line 305
    :goto_0
    return-object v0

    .line 303
    :cond_0
    new-instance v0, Lcom/facebook/AppLinkData;

    invoke-direct {v0}, Lcom/facebook/AppLinkData;-><init>()V

    .line 304
    .local v0, "appLinkData":Lcom/facebook/AppLinkData;
    iput-object p0, v0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    goto :goto_0
.end method

.method public static fetchDeferredAppLinkData(Landroid/content/Context;Lcom/facebook/AppLinkData$CompletionHandler;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "completionHandler"    # Lcom/facebook/AppLinkData$CompletionHandler;

    .prologue
    .line 92
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/facebook/AppLinkData;->fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V

    .line 93
    return-void
.end method

.method public static fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "applicationId"    # Ljava/lang/String;
    .param p2, "completionHandler"    # Lcom/facebook/AppLinkData$CompletionHandler;

    .prologue
    .line 107
    const-string v2, "context"

    invoke-static {p0, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    const-string v2, "completionHandler"

    invoke-static {p2, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    if-nez p1, :cond_0

    .line 111
    invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 114
    :cond_0
    const-string v2, "applicationId"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 117
    .local v0, "applicationContext":Landroid/content/Context;
    move-object v1, p1

    .line 118
    .local v1, "applicationIdCopy":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/facebook/AppLinkData$1;

    invoke-direct {v3, v0, v1, p2}, Lcom/facebook/AppLinkData$1;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 124
    return-void
.end method

.method private static fetchDeferredAppLinkFromServer(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    .locals 18
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "applicationId"    # Ljava/lang/String;
    .param p2, "completionHandler"    # Lcom/facebook/AppLinkData$CompletionHandler;

    .prologue
    .line 131
    invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;

    move-result-object v6

    .line 132
    .local v6, "deferredApplinkParams":Lcom/facebook/model/GraphObject;
    const-string v15, "event"

    const-string v16, "DEFERRED_APP_LINK"

    move-object/from16 v0, v16

    invoke-interface {v6, v15, v0}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    invoke-static/range {p0 .. p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;

    move-result-object v15

    .line 135
    invoke-static/range {p0 .. p1}, Lcom/facebook/internal/Utility;->getHashedDeviceAndAppID(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 136
    invoke-static/range {p0 .. p0}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z

    move-result v17

    .line 133
    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v6, v15, v0, v1}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lcom/facebook/model/GraphObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V

    .line 137
    const-string v15, "application_package_name"

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-interface {v6, v15, v0}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    const-string v15, "%s/activities"

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    aput-object p1, v16, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 140
    .local v9, "deferredApplinkUrlPath":Ljava/lang/String;
    const/4 v4, 0x0

    .line 143
    .local v4, "appLinkData":Lcom/facebook/AppLinkData;
    const/4 v15, 0x0

    const/16 v16, 0x0

    :try_start_0
    move-object/from16 v0, v16

    invoke-static {v15, v9, v6, v0}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;

    move-result-object v7

    .line 145
    .local v7, "deferredApplinkRequest":Lcom/facebook/Request;
    invoke-virtual {v7}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;

    move-result-object v8

    .line 146
    .local v8, "deferredApplinkResponse":Lcom/facebook/Response;
    invoke-virtual {v8}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v14

    .line 147
    .local v14, "wireResponse":Lcom/facebook/model/GraphObject;
    if-eqz v14, :cond_6

    invoke-interface {v14}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v11

    .line 148
    .local v11, "jsonResponse":Lorg/json/JSONObject;
    :goto_0
    if-eqz v11, :cond_5

    .line 149
    const-string v15, "applink_args"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 150
    .local v2, "appLinkArgsJsonString":Ljava/lang/String;
    const-string v15, "click_time"

    const-wide/16 v16, -0x1

    move-wide/from16 v0, v16

    invoke-virtual {v11, v15, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v12

    .line 151
    .local v12, "tapTimeUtc":J
    const-string v15, "applink_class"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 152
    .local v3, "appLinkClassName":Ljava/lang/String;
    const-string v15, "applink_url"

    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 154
    .local v5, "appLinkUrl":Ljava/lang/String;
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_5

    .line 155
    invoke-static {v2}, Lcom/facebook/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/AppLinkData;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 157
    const-wide/16 v16, -0x1

    cmp-long v15, v12, v16

    if-eqz v15, :cond_1

    .line 159
    :try_start_1
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v15, :cond_0

    .line 160
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v16, "com.facebook.platform.APPLINK_TAP_TIME_UTC"

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 162
    :cond_0
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v15, :cond_1

    .line 163
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    const-string v16, "com.facebook.platform.APPLINK_TAP_TIME_UTC"

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v15 .. v17}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 170
    :cond_1
    :goto_1
    if-eqz v3, :cond_3

    .line 172
    :try_start_2
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v15, :cond_2

    .line 173
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v16, "com.facebook.platform.APPLINK_NATIVE_CLASS"

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    :cond_2
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v15, :cond_3

    .line 176
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    const-string v16, "com.facebook.platform.APPLINK_NATIVE_CLASS"

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 183
    :cond_3
    :goto_2
    if-eqz v5, :cond_5

    .line 185
    :try_start_3
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    if-eqz v15, :cond_4

    .line 186
    iget-object v15, v4, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    const-string v16, "com.facebook.platform.APPLINK_NATIVE_URL"

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    :cond_4
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v15, :cond_5

    .line 189
    iget-object v15, v4, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    const-string v16, "com.facebook.platform.APPLINK_NATIVE_URL"

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 201
    .end local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .end local v3    # "appLinkClassName":Ljava/lang/String;
    .end local v5    # "appLinkUrl":Ljava/lang/String;
    .end local v7    # "deferredApplinkRequest":Lcom/facebook/Request;
    .end local v8    # "deferredApplinkResponse":Lcom/facebook/Response;
    .end local v11    # "jsonResponse":Lorg/json/JSONObject;
    .end local v12    # "tapTimeUtc":J
    .end local v14    # "wireResponse":Lcom/facebook/model/GraphObject;
    :cond_5
    :goto_3
    move-object/from16 v0, p2

    invoke-interface {v0, v4}, Lcom/facebook/AppLinkData$CompletionHandler;->onDeferredAppLinkDataFetched(Lcom/facebook/AppLinkData;)V

    .line 202
    return-void

    .line 147
    .restart local v7    # "deferredApplinkRequest":Lcom/facebook/Request;
    .restart local v8    # "deferredApplinkResponse":Lcom/facebook/Response;
    .restart local v14    # "wireResponse":Lcom/facebook/model/GraphObject;
    :cond_6
    const/4 v11, 0x0

    goto/16 :goto_0

    .line 165
    .restart local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .restart local v3    # "appLinkClassName":Ljava/lang/String;
    .restart local v5    # "appLinkUrl":Ljava/lang/String;
    .restart local v11    # "jsonResponse":Lorg/json/JSONObject;
    .restart local v12    # "tapTimeUtc":J
    :catch_0
    move-exception v10

    .line 166
    .local v10, "e":Lorg/json/JSONException;
    :try_start_4
    sget-object v15, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v16, "Unable to put tap time in AppLinkData.arguments"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 197
    .end local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .end local v3    # "appLinkClassName":Ljava/lang/String;
    .end local v5    # "appLinkUrl":Ljava/lang/String;
    .end local v7    # "deferredApplinkRequest":Lcom/facebook/Request;
    .end local v8    # "deferredApplinkResponse":Lcom/facebook/Response;
    .end local v10    # "e":Lorg/json/JSONException;
    .end local v11    # "jsonResponse":Lorg/json/JSONObject;
    .end local v12    # "tapTimeUtc":J
    .end local v14    # "wireResponse":Lcom/facebook/model/GraphObject;
    :catch_1
    move-exception v10

    .line 198
    .local v10, "e":Ljava/lang/Exception;
    sget-object v15, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v16, "Unable to fetch deferred applink from server"

    invoke-static/range {v15 .. v16}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 178
    .end local v10    # "e":Ljava/lang/Exception;
    .restart local v2    # "appLinkArgsJsonString":Ljava/lang/String;
    .restart local v3    # "appLinkClassName":Ljava/lang/String;
    .restart local v5    # "appLinkUrl":Ljava/lang/String;
    .restart local v7    # "deferredApplinkRequest":Lcom/facebook/Request;
    .restart local v8    # "deferredApplinkResponse":Lcom/facebook/Response;
    .restart local v11    # "jsonResponse":Lorg/json/JSONObject;
    .restart local v12    # "tapTimeUtc":J
    .restart local v14    # "wireResponse":Lcom/facebook/model/GraphObject;
    :catch_2
    move-exception v10

    .line 179
    .local v10, "e":Lorg/json/JSONException;
    :try_start_5
    sget-object v15, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v16, "Unable to put tap time in AppLinkData.arguments"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 191
    .end local v10    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v10

    .line 192
    .restart local v10    # "e":Lorg/json/JSONException;
    sget-object v15, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;

    const-string v16, "Unable to put tap time in AppLinkData.arguments"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3
.end method

.method private static toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .locals 11
    .param p0, "node"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 309
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 311
    .local v1, "bundle":Landroid/os/Bundle;
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 312
    .local v3, "fields":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 313
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 315
    .local v6, "key":Ljava/lang/String;
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 317
    .local v7, "value":Ljava/lang/Object;
    instance-of v9, v7, Lorg/json/JSONObject;

    if-eqz v9, :cond_0

    .line 318
    check-cast v7, Lorg/json/JSONObject;

    .end local v7    # "value":Ljava/lang/Object;
    invoke-static {v7}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    .line 319
    .restart local v7    # "value":Ljava/lang/Object;
    :cond_0
    instance-of v9, v7, Lorg/json/JSONArray;

    if-eqz v9, :cond_6

    move-object v8, v7

    .line 320
    check-cast v8, Lorg/json/JSONArray;

    .line 321
    .local v8, "valueArr":Lorg/json/JSONArray;
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-nez v9, :cond_1

    .line 322
    new-array v9, v10, [Ljava/lang/String;

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 324
    :cond_1
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 325
    .local v4, "firstNode":Ljava/lang/Object;
    instance-of v9, v4, Lorg/json/JSONObject;

    if-eqz v9, :cond_3

    .line 326
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    new-array v2, v9, [Landroid/os/Bundle;

    .line 327
    .local v2, "bundles":[Landroid/os/Bundle;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v5, v9, :cond_2

    .line 328
    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v9

    aput-object v9, v2, v5

    .line 327
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 330
    :cond_2
    invoke-virtual {v1, v6, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_0

    .line 331
    .end local v2    # "bundles":[Landroid/os/Bundle;
    .end local v5    # "i":I
    :cond_3
    instance-of v9, v4, Lorg/json/JSONArray;

    if-eqz v9, :cond_4

    .line 333
    new-instance v9, Lcom/facebook/FacebookException;

    const-string v10, "Nested arrays are not supported."

    invoke-direct {v9, v10}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 335
    :cond_4
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    new-array v0, v9, [Ljava/lang/String;

    .line 336
    .local v0, "arrValues":[Ljava/lang/String;
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v5, v9, :cond_5

    .line 337
    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v0, v5

    .line 336
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 339
    :cond_5
    invoke-virtual {v1, v6, v0}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 343
    .end local v0    # "arrValues":[Ljava/lang/String;
    .end local v4    # "firstNode":Ljava/lang/Object;
    .end local v5    # "i":I
    .end local v8    # "valueArr":Lorg/json/JSONArray;
    :cond_6
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v6, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 346
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "value":Ljava/lang/Object;
    :cond_7
    return-object v1
.end method


# virtual methods
.method public getArgumentBundle()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    return-object v0
.end method

.method public getArguments()Lorg/json/JSONObject;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 375
    iget-object v0, p0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getRef()Ljava/lang/String;
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;

    return-object v0
.end method

.method public getRefererData()Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 393
    iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;

    const-string v1, "referer_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 396
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getTargetUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;

    return-object v0
.end method
