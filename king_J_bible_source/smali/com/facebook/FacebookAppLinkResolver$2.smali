.class Lcom/facebook/FacebookAppLinkResolver$2;
.super Ljava/lang/Object;
.source "FacebookAppLinkResolver.java"

# interfaces
.implements Lcom/facebook/Request$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/FacebookAppLinkResolver;->getAppLinkFromUrlsInBackground(Ljava/util/List;)Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/FacebookAppLinkResolver;

.field private final synthetic val$appLinkResults:Ljava/util/Map;

.field private final synthetic val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;

.field private final synthetic val$urisToRequest:Ljava/util/HashSet;


# direct methods
.method constructor <init>(Lcom/facebook/FacebookAppLinkResolver;Lbolts/Task$TaskCompletionSource;Ljava/util/Map;Ljava/util/HashSet;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->this$0:Lcom/facebook/FacebookAppLinkResolver;

    iput-object p2, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;

    iput-object p3, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;

    iput-object p4, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$urisToRequest:Ljava/util/HashSet;

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/Response;)V
    .locals 18
    .param p1, "response"    # Lcom/facebook/Response;

    .prologue
    .line 124
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v3

    .line 125
    .local v3, "error":Lcom/facebook/FacebookRequestError;
    if-eqz v3, :cond_0

    .line 126
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {v3}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V

    .line 174
    :goto_0
    return-void

    .line 130
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v7

    .line 131
    .local v7, "responseObject":Lcom/facebook/model/GraphObject;
    if-eqz v7, :cond_1

    invoke-interface {v7}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v6

    .line 132
    .local v6, "responseJson":Lorg/json/JSONObject;
    :goto_1
    if-nez v6, :cond_2

    .line 133
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    .line 131
    .end local v6    # "responseJson":Lorg/json/JSONObject;
    :cond_1
    const/4 v6, 0x0

    goto :goto_1

    .line 137
    .restart local v6    # "responseJson":Lorg/json/JSONObject;
    :cond_2
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$urisToRequest:Ljava/util/HashSet;

    invoke-virtual {v15}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_3
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-nez v15, :cond_4

    .line 173
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    .line 137
    :cond_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/net/Uri;

    .line 138
    .local v11, "uri":Landroid/net/Uri;
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v12

    .line 139
    .local v12, "uriString":Ljava/lang/String;
    invoke-virtual {v6, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 143
    const/4 v13, 0x0

    .line 145
    .local v13, "urlData":Lorg/json/JSONObject;
    :try_start_0
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    .line 146
    const-string v15, "app_links"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 148
    .local v2, "appLinkData":Lorg/json/JSONObject;
    const-string v15, "android"

    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 150
    .local v5, "rawTargets":Lorg/json/JSONArray;
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v10

    .line 151
    .local v10, "targetsCount":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .local v9, "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_3
    if-lt v4, v10, :cond_5

    .line 160
    # invokes: Lcom/facebook/FacebookAppLinkResolver;->getWebFallbackUriFromJson(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;
    invoke-static {v11, v2}, Lcom/facebook/FacebookAppLinkResolver;->access$1(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;

    move-result-object v14

    .line 161
    .local v14, "webFallbackUrl":Landroid/net/Uri;
    new-instance v1, Lbolts/AppLink;

    invoke-direct {v1, v11, v9, v14}, Lbolts/AppLink;-><init>(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V

    .line 163
    .local v1, "appLink":Lbolts/AppLink;
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;

    invoke-interface {v15, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->this$0:Lcom/facebook/FacebookAppLinkResolver;

    # getter for: Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;
    invoke-static {v15}, Lcom/facebook/FacebookAppLinkResolver;->access$2(Lcom/facebook/FacebookAppLinkResolver;)Ljava/util/HashMap;

    move-result-object v17

    monitor-enter v17
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :try_start_1
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/FacebookAppLinkResolver$2;->this$0:Lcom/facebook/FacebookAppLinkResolver;

    # getter for: Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;
    invoke-static {v15}, Lcom/facebook/FacebookAppLinkResolver;->access$2(Lcom/facebook/FacebookAppLinkResolver;)Ljava/util/HashMap;

    move-result-object v15

    invoke-virtual {v15, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    monitor-exit v17

    goto :goto_2

    :catchall_0
    move-exception v15

    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v15

    .line 167
    .end local v1    # "appLink":Lbolts/AppLink;
    .end local v2    # "appLinkData":Lorg/json/JSONObject;
    .end local v4    # "i":I
    .end local v5    # "rawTargets":Lorg/json/JSONArray;
    .end local v9    # "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    .end local v10    # "targetsCount":I
    .end local v14    # "webFallbackUrl":Landroid/net/Uri;
    :catch_0
    move-exception v15

    goto :goto_2

    .line 154
    .restart local v2    # "appLinkData":Lorg/json/JSONObject;
    .restart local v4    # "i":I
    .restart local v5    # "rawTargets":Lorg/json/JSONArray;
    .restart local v9    # "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    .restart local v10    # "targetsCount":I
    :cond_5
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    # invokes: Lcom/facebook/FacebookAppLinkResolver;->getAndroidTargetFromJson(Lorg/json/JSONObject;)Lbolts/AppLink$Target;
    invoke-static {v15}, Lcom/facebook/FacebookAppLinkResolver;->access$0(Lorg/json/JSONObject;)Lbolts/AppLink$Target;

    move-result-object v8

    .line 155
    .local v8, "target":Lbolts/AppLink$Target;
    if-eqz v8, :cond_6

    .line 156
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 153
    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3
.end method
