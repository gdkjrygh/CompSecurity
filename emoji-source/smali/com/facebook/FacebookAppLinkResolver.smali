.class public Lcom/facebook/FacebookAppLinkResolver;
.super Ljava/lang/Object;
.source "FacebookAppLinkResolver.java"

# interfaces
.implements Lbolts/AppLinkResolver;


# static fields
.field private static final APP_LINK_ANDROID_TARGET_KEY:Ljava/lang/String; = "android"

.field private static final APP_LINK_KEY:Ljava/lang/String; = "app_links"

.field private static final APP_LINK_TARGET_APP_NAME_KEY:Ljava/lang/String; = "app_name"

.field private static final APP_LINK_TARGET_CLASS_KEY:Ljava/lang/String; = "class"

.field private static final APP_LINK_TARGET_PACKAGE_KEY:Ljava/lang/String; = "package"

.field private static final APP_LINK_TARGET_SHOULD_FALLBACK_KEY:Ljava/lang/String; = "should_fallback"

.field private static final APP_LINK_TARGET_URL_KEY:Ljava/lang/String; = "url"

.field private static final APP_LINK_WEB_TARGET_KEY:Ljava/lang/String; = "web"


# instance fields
.field private final cachedAppLinks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Landroid/net/Uri;",
            "Lbolts/AppLink;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;

    return-void
.end method

.method static synthetic access$000(Lorg/json/JSONObject;)Lbolts/AppLink$Target;
    .locals 1
    .param p0, "x0"    # Lorg/json/JSONObject;

    .prologue
    .line 37
    invoke-static {p0}, Lcom/facebook/FacebookAppLinkResolver;->getAndroidTargetFromJson(Lorg/json/JSONObject;)Lbolts/AppLink$Target;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;
    .locals 1
    .param p0, "x0"    # Landroid/net/Uri;
    .param p1, "x1"    # Lorg/json/JSONObject;

    .prologue
    .line 37
    invoke-static {p0, p1}, Lcom/facebook/FacebookAppLinkResolver;->getWebFallbackUriFromJson(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/facebook/FacebookAppLinkResolver;)Ljava/util/HashMap;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/FacebookAppLinkResolver;

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;

    return-object v0
.end method

.method private static getAndroidTargetFromJson(Lorg/json/JSONObject;)Lbolts/AppLink$Target;
    .locals 7
    .param p0, "targetJson"    # Lorg/json/JSONObject;

    .prologue
    const/4 v5, 0x0

    .line 183
    const-string v6, "package"

    invoke-static {p0, v6, v5}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 184
    .local v2, "packageName":Ljava/lang/String;
    if-nez v2, :cond_0

    .line 196
    :goto_0
    return-object v5

    .line 188
    :cond_0
    const-string v6, "class"

    invoke-static {p0, v6, v5}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 189
    .local v1, "className":Ljava/lang/String;
    const-string v6, "app_name"

    invoke-static {p0, v6, v5}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 190
    .local v0, "appName":Ljava/lang/String;
    const-string v6, "url"

    invoke-static {p0, v6, v5}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 191
    .local v4, "targetUrlString":Ljava/lang/String;
    const/4 v3, 0x0

    .line 192
    .local v3, "targetUri":Landroid/net/Uri;
    if-eqz v4, :cond_1

    .line 193
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 196
    :cond_1
    new-instance v5, Lbolts/AppLink$Target;

    invoke-direct {v5, v2, v1, v3, v0}, Lbolts/AppLink$Target;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static getWebFallbackUriFromJson(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;
    .locals 7
    .param p0, "sourceUrl"    # Landroid/net/Uri;
    .param p1, "urlData"    # Lorg/json/JSONObject;

    .prologue
    const/4 v4, 0x0

    .line 202
    :try_start_0
    const-string v5, "web"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 203
    .local v2, "webTarget":Lorg/json/JSONObject;
    const-string v5, "should_fallback"

    const/4 v6, 0x1

    invoke-static {v2, v5, v6}, Lcom/facebook/FacebookAppLinkResolver;->tryGetBooleanFromJson(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v1

    .line 204
    .local v1, "shouldFallback":Z
    if-nez v1, :cond_1

    .line 219
    .end local v1    # "shouldFallback":Z
    .end local v2    # "webTarget":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    return-object v4

    .line 209
    .restart local v1    # "shouldFallback":Z
    .restart local v2    # "webTarget":Lorg/json/JSONObject;
    :cond_1
    const-string v5, "url"

    const/4 v6, 0x0

    invoke-static {v2, v5, v6}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 210
    .local v3, "webTargetUrlString":Ljava/lang/String;
    const/4 v4, 0x0

    .line 211
    .local v4, "webUri":Landroid/net/Uri;
    if-eqz v3, :cond_2

    .line 212
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 216
    :cond_2
    if-nez v4, :cond_0

    move-object v4, p0

    goto :goto_0

    .line 217
    .end local v1    # "shouldFallback":Z
    .end local v2    # "webTarget":Lorg/json/JSONObject;
    .end local v3    # "webTargetUrlString":Ljava/lang/String;
    .end local v4    # "webUri":Landroid/net/Uri;
    :catch_0
    move-exception v0

    .local v0, "e":Lorg/json/JSONException;
    move-object v4, p0

    .line 219
    goto :goto_0
.end method

.method private static tryGetBooleanFromJson(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    .locals 1
    .param p0, "json"    # Lorg/json/JSONObject;
    .param p1, "propertyName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Z

    .prologue
    .line 233
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 235
    .end local p2    # "defaultValue":Z
    :goto_0
    return p2

    .line 234
    .restart local p2    # "defaultValue":Z
    :catch_0
    move-exception v0

    .line 235
    .local v0, "e":Lorg/json/JSONException;
    goto :goto_0
.end method

.method private static tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "json"    # Lorg/json/JSONObject;
    .param p1, "propertyName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 225
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    .line 227
    .end local p2    # "defaultValue":Ljava/lang/String;
    :goto_0
    return-object p2

    .line 226
    .restart local p2    # "defaultValue":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 227
    .local v0, "e":Lorg/json/JSONException;
    goto :goto_0
.end method


# virtual methods
.method public getAppLinkFromUrlInBackground(Landroid/net/Uri;)Lbolts/Task;
    .locals 3
    .param p1, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lbolts/Task",
            "<",
            "Lbolts/AppLink;",
            ">;"
        }
    .end annotation

    .prologue
    .line 59
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .local v1, "uris":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {p0, v1}, Lcom/facebook/FacebookAppLinkResolver;->getAppLinkFromUrlsInBackground(Ljava/util/List;)Lbolts/Task;

    move-result-object v0

    .line 64
    .local v0, "resolveTask":Lbolts/Task;, "Lbolts/Task<Ljava/util/Map<Landroid/net/Uri;Lbolts/AppLink;>;>;"
    new-instance v2, Lcom/facebook/FacebookAppLinkResolver$1;

    invoke-direct {v2, p0, p1}, Lcom/facebook/FacebookAppLinkResolver$1;-><init>(Lcom/facebook/FacebookAppLinkResolver;Landroid/net/Uri;)V

    invoke-virtual {v0, v2}, Lbolts/Task;->onSuccess(Lbolts/Continuation;)Lbolts/Task;

    move-result-object v2

    return-object v2
.end method

.method public getAppLinkFromUrlsInBackground(Ljava/util/List;)Lbolts/Task;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/net/Uri;",
            ">;)",
            "Lbolts/Task",
            "<",
            "Ljava/util/Map",
            "<",
            "Landroid/net/Uri;",
            "Lbolts/AppLink;",
            ">;>;"
        }
    .end annotation

    .prologue
    .local p1, "uris":Ljava/util/List;, "Ljava/util/List<Landroid/net/Uri;>;"
    const/4 v2, 0x0

    .line 81
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 82
    .local v8, "appLinkResults":Ljava/util/Map;, "Ljava/util/Map<Landroid/net/Uri;Lbolts/AppLink;>;"
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 83
    .local v12, "urisToRequest":Ljava/util/HashSet;, "Ljava/util/HashSet<Landroid/net/Uri;>;"
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .local v9, "graphRequestFields":Ljava/lang/StringBuilder;
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/net/Uri;

    .line 86
    .local v11, "uri":Landroid/net/Uri;
    const/4 v7, 0x0

    .line 87
    .local v7, "appLink":Lbolts/AppLink;
    iget-object v6, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;

    monitor-enter v6

    .line 88
    :try_start_0
    iget-object v3, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;

    invoke-virtual {v3, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Lbolts/AppLink;

    move-object v7, v0

    .line 89
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-eqz v7, :cond_0

    .line 92
    invoke-interface {v8, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 89
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    .line 94
    :cond_0
    invoke-virtual {v12}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 95
    const/16 v3, 0x2c

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    :cond_1
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 102
    .end local v7    # "appLink":Lbolts/AppLink;
    .end local v11    # "uri":Landroid/net/Uri;
    :cond_2
    invoke-virtual {v12}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 103
    invoke-static {v8}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;

    move-result-object v2

    .line 179
    :goto_1
    return-object v2

    .line 106
    :cond_3
    invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;

    move-result-object v10

    .line 108
    .local v10, "taskCompletionSource":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<Ljava/util/Map<Landroid/net/Uri;Lbolts/AppLink;>;>.TaskCompletionSource;"
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 110
    .local v4, "appLinkRequestParameters":Landroid/os/Bundle;
    const-string v3, "ids"

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v3, "fields"

    const-string v5, "%s.fields(%s,%s)"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v13, 0x0

    const-string v14, "app_links"

    aput-object v14, v6, v13

    const/4 v13, 0x1

    const-string v14, "android"

    aput-object v14, v6, v13

    const/4 v13, 0x2

    const-string v14, "web"

    aput-object v14, v6, v13

    .line 113
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 111
    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    new-instance v1, Lcom/facebook/Request;

    const-string v3, ""

    new-instance v6, Lcom/facebook/FacebookAppLinkResolver$2;

    invoke-direct {v6, p0, v10, v8, v12}, Lcom/facebook/FacebookAppLinkResolver$2;-><init>(Lcom/facebook/FacebookAppLinkResolver;Lbolts/Task$TaskCompletionSource;Ljava/util/Map;Ljava/util/HashSet;)V

    move-object v5, v2

    invoke-direct/range {v1 .. v6}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V

    .line 177
    .local v1, "appLinkRequest":Lcom/facebook/Request;
    invoke-virtual {v1}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 179
    invoke-virtual {v10}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;

    move-result-object v2

    goto :goto_1
.end method
