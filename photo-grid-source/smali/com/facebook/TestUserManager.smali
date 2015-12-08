.class public Lcom/facebook/TestUserManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final LOG_TAG:Ljava/lang/String; = "TestUserManager"


# instance fields
.field private appTestAccounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private testApplicationId:Ljava/lang/String;

.field private testApplicationSecret:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/TestUserManager;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/TestUserManager;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    :cond_0
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Must provide app ID and secret"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_1
    iput-object p1, p0, Lcom/facebook/TestUserManager;->testApplicationSecret:Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;

    .line 68
    return-void
.end method

.method private createTestAccount(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/TestUserManager$Mode;",
            "Ljava/lang/String;",
            ")",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 277
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 278
    const-string v1, "installed"

    const-string v3, "true"

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v1, "permissions"

    invoke-direct {p0, p1}, Lcom/facebook/TestUserManager;->getPermissionsString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v1, "access_token"

    invoke-virtual {p0}, Lcom/facebook/TestUserManager;->getAppAccessToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    sget-object v1, Lcom/facebook/TestUserManager$Mode;->SHARED:Lcom/facebook/TestUserManager$Mode;

    if-ne p2, v1, :cond_0

    .line 286
    const-string v1, "name"

    const-string v3, "Shared %s Testuser"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-direct {p0, p1, p3}, Lcom/facebook/TestUserManager;->getSharedTestAccountIdentifier(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    :cond_0
    const-string v1, "%s/accounts/test-users"

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;

    aput-object v4, v3, v6

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 291
    new-instance v3, Lcom/facebook/GraphRequest;

    sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 293
    invoke-virtual {v3}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v1

    .line 295
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v3

    .line 296
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    .line 297
    if-eqz v3, :cond_1

    .line 315
    :goto_0
    return-object v0

    .line 300
    :cond_1
    sget-boolean v0, Lcom/facebook/TestUserManager;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 304
    :cond_2
    sget-object v0, Lcom/facebook/TestUserManager$Mode;->SHARED:Lcom/facebook/TestUserManager$Mode;

    if-ne p2, v0, :cond_3

    .line 308
    :try_start_0
    const-string v0, "name"

    const-string v3, "name"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 312
    :goto_1
    invoke-direct {p0, v1}, Lcom/facebook/TestUserManager;->storeTestAccount(Lorg/json/JSONObject;)V

    :cond_3
    move-object v0, v1

    .line 315
    goto :goto_0

    .line 309
    :catch_0
    move-exception v0

    .line 310
    const-string v2, "TestUserManager"

    const-string v3, "Could not set name"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private findOrCreateSharedTestAccount(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/TestUserManager$Mode;",
            "Ljava/lang/String;",
            ")",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .prologue
    .line 232
    invoke-direct {p0, p1, p3}, Lcom/facebook/TestUserManager;->getSharedTestAccountIdentifier(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/TestUserManager;->findTestAccountMatchingIdentifier(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 234
    if-eqz v0, :cond_0

    .line 237
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/TestUserManager;->createTestAccount(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0
.end method

.method private declared-synchronized findTestAccountMatchingIdentifier(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    .prologue
    .line 217
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/TestUserManager;->appTestAccounts:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 218
    const-string v2, "name"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-eqz v2, :cond_0

    .line 222
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 217
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private getAccessTokenForUser(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lcom/facebook/AccessToken;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/TestUserManager$Mode;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/AccessToken;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 129
    invoke-direct {p0}, Lcom/facebook/TestUserManager;->retrieveTestAccountsForAppIfNeeded()V

    .line 131
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "email"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "publish_actions"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 136
    :goto_0
    sget-object v0, Lcom/facebook/TestUserManager$Mode;->PRIVATE:Lcom/facebook/TestUserManager$Mode;

    if-ne p2, v0, :cond_0

    .line 137
    invoke-direct {p0, v4, p2, p3}, Lcom/facebook/TestUserManager;->createTestAccount(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object v3, v0

    .line 142
    :goto_1
    new-instance v0, Lcom/facebook/AccessToken;

    const-string v1, "access_token"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;

    const-string v6, "id"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lcom/facebook/AccessTokenSource;->TEST_USER:Lcom/facebook/AccessTokenSource;

    move-object v7, v5

    move-object v8, v5

    invoke-direct/range {v0 .. v8}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0

    .line 139
    :cond_0
    invoke-direct {p0, v4, p2, p3}, Lcom/facebook/TestUserManager;->findOrCreateSharedTestAccount(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v4, p1

    goto :goto_0
.end method

.method private getPermissionsString(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 320
    const-string v0, ","

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getSharedTestAccountIdentifier(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const-wide v4, 0xffffffffL

    .line 245
    invoke-direct {p0, p1}, Lcom/facebook/TestUserManager;->getPermissionsString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v0, v0

    and-long v2, v0, v4

    .line 246
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v0, v0

    and-long/2addr v0, v4

    .line 250
    :goto_0
    xor-long/2addr v0, v2

    .line 251
    invoke-direct {p0, v0, v1}, Lcom/facebook/TestUserManager;->validNameStringFromInteger(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 246
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method private declared-synchronized populateTestAccounts(Lorg/json/JSONArray;Lorg/json/JSONObject;)V
    .locals 5

    .prologue
    .line 200
    monitor-enter p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 201
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 202
    const-string v0, "id"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 204
    :try_start_1
    const-string v3, "name"

    const-string v4, "name"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    :goto_1
    :try_start_2
    invoke-direct {p0, v2}, Lcom/facebook/TestUserManager;->storeTestAccount(Lorg/json/JSONObject;)V

    .line 200
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 205
    :catch_0
    move-exception v0

    .line 206
    const-string v3, "TestUserManager"

    const-string v4, "Could not set name"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 200
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 210
    :cond_0
    monitor-exit p0

    return-void
.end method

.method private declared-synchronized retrieveTestAccountsForAppIfNeeded()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    .line 154
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/TestUserManager;->appTestAccounts:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 195
    :goto_0
    monitor-exit p0

    return-void

    .line 158
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/TestUserManager;->appTestAccounts:Ljava/util/Map;

    .line 164
    iget-object v0, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/GraphRequest;->setDefaultBatchApplicationId(Ljava/lang/String;)V

    .line 166
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 167
    const-string v1, "access_token"

    invoke-virtual {p0}, Lcom/facebook/TestUserManager;->getAppAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    new-instance v1, Lcom/facebook/GraphRequest;

    const/4 v2, 0x0

    const-string v3, "app/accounts/test-users"

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 171
    const-string v0, "testUsers"

    invoke-virtual {v1, v0}, Lcom/facebook/GraphRequest;->setBatchEntryName(Ljava/lang/String;)V

    .line 172
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/facebook/GraphRequest;->setBatchEntryOmitResultOnSuccess(Z)V

    .line 174
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 175
    const-string v2, "access_token"

    invoke-virtual {p0}, Lcom/facebook/TestUserManager;->getAppAccessToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string v2, "ids"

    const-string v3, "{result=testUsers:$.data.*.id}"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v2, "fields"

    const-string v3, "name"

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    new-instance v2, Lcom/facebook/GraphRequest;

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 180
    const-string v0, "testUsers"

    invoke-virtual {v2, v0}, Lcom/facebook/GraphRequest;->setBatchEntryDependsOn(Ljava/lang/String;)V

    .line 182
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/GraphRequest;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v1, 0x1

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/facebook/GraphRequest;->executeBatchAndWait([Lcom/facebook/GraphRequest;)Ljava/util/List;

    move-result-object v1

    .line 184
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v6, :cond_2

    .line 185
    :cond_1
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Unexpected number of results from TestUsers batch query"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 188
    :cond_2
    const/4 v0, 0x0

    :try_start_2
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphResponse;

    invoke-virtual {v0}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 189
    const-string v2, "data"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 192
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphResponse;

    invoke-virtual {v0}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 194
    invoke-direct {p0, v2, v0}, Lcom/facebook/TestUserManager;->populateTestAccounts(Lorg/json/JSONArray;Lorg/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method private declared-synchronized storeTestAccount(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 213
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/TestUserManager;->appTestAccounts:Ljava/util/Map;

    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    monitor-exit p0

    return-void

    .line 213
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private validNameStringFromInteger(J)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 255
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 256
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v2, "Perm"

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    array-length v5, v4

    move v1, v0

    move v2, v0

    :goto_0
    if-ge v1, v5, :cond_1

    aget-char v0, v4, v1

    .line 263
    if-ne v0, v2, :cond_0

    .line 264
    add-int/lit8 v0, v0, 0xa

    int-to-char v0, v0

    .line 266
    :cond_0
    add-int/lit8 v2, v0, 0x61

    add-int/lit8 v2, v2, -0x30

    int-to-char v2, v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 262
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_0

    .line 270
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getAccessTokenForPrivateUser(Ljava/util/List;)Lcom/facebook/AccessToken;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/AccessToken;"
        }
    .end annotation

    .prologue
    .line 78
    sget-object v0, Lcom/facebook/TestUserManager$Mode;->PRIVATE:Lcom/facebook/TestUserManager$Mode;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/TestUserManager;->getAccessTokenForUser(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public getAccessTokenForSharedUser(Ljava/util/List;)Lcom/facebook/AccessToken;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/AccessToken;"
        }
    .end annotation

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/TestUserManager;->getAccessTokenForSharedUser(Ljava/util/List;Ljava/lang/String;)Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public getAccessTokenForSharedUser(Ljava/util/List;Ljava/lang/String;)Lcom/facebook/AccessToken;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/AccessToken;"
        }
    .end annotation

    .prologue
    .line 103
    sget-object v0, Lcom/facebook/TestUserManager$Mode;->SHARED:Lcom/facebook/TestUserManager$Mode;

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/TestUserManager;->getAccessTokenForUser(Ljava/util/List;Lcom/facebook/TestUserManager$Mode;Ljava/lang/String;)Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method final getAppAccessToken()Ljava/lang/String;
    .locals 2

    .prologue
    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/TestUserManager;->testApplicationSecret:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized getTestApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 112
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/TestUserManager;->testApplicationId:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getTestApplicationSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/TestUserManager;->testApplicationSecret:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
