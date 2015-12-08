.class public Lcom/facebook/TestSession;
.super Lcom/facebook/Session;
.source "TestSession.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/TestSession$TestTokenCachingStrategy;,
        Lcom/facebook/TestSession$TestAccountsResponse;,
        Lcom/facebook/TestSession$TestAccount;,
        Lcom/facebook/TestSession$Mode;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final LOG_TAG:Ljava/lang/String; = "FacebookSDK.TestSession"

.field private static appTestAccounts:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/TestSession$TestAccount;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L

.field private static testApplicationId:Ljava/lang/String;

.field private static testApplicationSecret:Ljava/lang/String;


# instance fields
.field private final mode:Lcom/facebook/TestSession$Mode;

.field private final requestedPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionUniqueUserTag:Ljava/lang/String;

.field private testAccountId:Ljava/lang/String;

.field private testAccountUserName:Ljava/lang/String;

.field private wasAskedToExtendAccessToken:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    const-class v0, Lcom/facebook/TestSession;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/TestSession;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TokenCachingStrategy;Ljava/lang/String;Lcom/facebook/TestSession$Mode;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p3, "tokenCachingStrategy"    # Lcom/facebook/TokenCachingStrategy;
    .param p4, "sessionUniqueUserTag"    # Ljava/lang/String;
    .param p5, "mode"    # Lcom/facebook/TestSession$Mode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/TokenCachingStrategy;",
            "Ljava/lang/String;",
            "Lcom/facebook/TestSession$Mode;",
            ")V"
        }
    .end annotation

    .prologue
    .line 85
    .local p2, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    invoke-direct {p0, p1, v0, p3}, Lcom/facebook/Session;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/TokenCachingStrategy;)V

    .line 87
    const-string v0, "permissions"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    sget-object v0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    const-string v1, "testApplicationId"

    invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    sget-object v0, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;

    const-string v1, "testApplicationSecret"

    invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    iput-object p4, p0, Lcom/facebook/TestSession;->sessionUniqueUserTag:Ljava/lang/String;

    .line 94
    iput-object p5, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;

    .line 95
    iput-object p2, p0, Lcom/facebook/TestSession;->requestedPermissions:Ljava/util/List;

    .line 96
    return-void
.end method

.method public static createSessionWithPrivateUser(Landroid/app/Activity;Ljava/util/List;)Lcom/facebook/TestSession;
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/TestSession;"
        }
    .end annotation

    .prologue
    .line 109
    .local p1, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v0, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lcom/facebook/TestSession;->createTestSession(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TestSession$Mode;Ljava/lang/String;)Lcom/facebook/TestSession;

    move-result-object v0

    return-object v0
.end method

.method public static createSessionWithSharedUser(Landroid/app/Activity;Ljava/util/List;)Lcom/facebook/TestSession;
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/TestSession;"
        }
    .end annotation

    .prologue
    .line 126
    .local p1, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/facebook/TestSession;->createSessionWithSharedUser(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/TestSession;

    move-result-object v0

    return-object v0
.end method

.method public static createSessionWithSharedUser(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/TestSession;
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p2, "sessionUniqueUserTag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/TestSession;"
        }
    .end annotation

    .prologue
    .line 147
    .local p1, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v0, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;

    invoke-static {p0, p1, v0, p2}, Lcom/facebook/TestSession;->createTestSession(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TestSession$Mode;Ljava/lang/String;)Lcom/facebook/TestSession;

    move-result-object v0

    return-object v0
.end method

.method private createTestAccountAndFinishAuth()Lcom/facebook/TestSession$TestAccount;
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    const/4 v6, 0x0

    .line 374
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 375
    .local v3, "parameters":Landroid/os/Bundle;
    const-string v7, "installed"

    const-string v8, "true"

    invoke-virtual {v3, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    const-string v7, "permissions"

    invoke-direct {p0}, Lcom/facebook/TestSession;->getPermissionsString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    const-string v7, "access_token"

    invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    iget-object v7, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;

    sget-object v8, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;

    if-ne v7, v8, :cond_0

    .line 383
    const-string v7, "name"

    const-string v8, "Shared %s Testuser"

    new-array v9, v12, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/facebook/TestSession;->getSharedTestAccountIdentifier()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v11

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    :cond_0
    const-string v7, "%s/accounts/test-users"

    new-array v8, v12, [Ljava/lang/Object;

    sget-object v9, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 387
    .local v2, "graphPath":Ljava/lang/String;
    new-instance v0, Lcom/facebook/Request;

    sget-object v7, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;

    invoke-direct {v0, v6, v2, v3, v7}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 388
    .local v0, "createUserRequest":Lcom/facebook/Request;
    invoke-virtual {v0}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;

    move-result-object v4

    .line 390
    .local v4, "response":Lcom/facebook/Response;
    invoke-virtual {v4}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    .line 391
    .local v1, "error":Lcom/facebook/FacebookRequestError;
    const-class v7, Lcom/facebook/TestSession$TestAccount;

    invoke-virtual {v4, v7}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;

    move-result-object v5

    check-cast v5, Lcom/facebook/TestSession$TestAccount;

    .line 392
    .local v5, "testAccount":Lcom/facebook/TestSession$TestAccount;
    if-eqz v1, :cond_1

    .line 393
    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v7

    invoke-virtual {p0, v6, v7}, Lcom/facebook/TestSession;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V

    move-object v5, v6

    .line 407
    .end local v5    # "testAccount":Lcom/facebook/TestSession$TestAccount;
    :goto_0
    return-object v5

    .line 396
    .restart local v5    # "testAccount":Lcom/facebook/TestSession$TestAccount;
    :cond_1
    sget-boolean v6, Lcom/facebook/TestSession;->$assertionsDisabled:Z

    if-nez v6, :cond_2

    if-nez v5, :cond_2

    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6

    .line 399
    :cond_2
    iget-object v6, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;

    sget-object v7, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;

    if-ne v6, v7, :cond_3

    .line 401
    const-string v6, "name"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/facebook/TestSession$TestAccount;->setName(Ljava/lang/String;)V

    .line 402
    invoke-static {v5}, Lcom/facebook/TestSession;->storeTestAccount(Lcom/facebook/TestSession$TestAccount;)V

    .line 405
    :cond_3
    invoke-direct {p0, v5}, Lcom/facebook/TestSession;->finishAuthWithTestAccount(Lcom/facebook/TestSession$TestAccount;)V

    goto :goto_0
.end method

.method private static declared-synchronized createTestSession(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TestSession$Mode;Ljava/lang/String;)Lcom/facebook/TestSession;
    .locals 7
    .param p0, "activity"    # Landroid/app/Activity;
    .param p2, "mode"    # Lcom/facebook/TestSession$Mode;
    .param p3, "sessionUniqueUserTag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/TestSession$Mode;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/TestSession;"
        }
    .end annotation

    .prologue
    .line 215
    .local p1, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-class v6, Lcom/facebook/TestSession;

    monitor-enter v6

    :try_start_0
    sget-object v0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    :cond_0
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Must provide app ID and secret"

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit v6

    throw v0

    .line 219
    :cond_1
    :try_start_1
    invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 220
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "email"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "publish_actions"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 223
    :cond_2
    new-instance v0, Lcom/facebook/TestSession;

    new-instance v3, Lcom/facebook/TestSession$TestTokenCachingStrategy;

    const/4 v1, 0x0

    invoke-direct {v3, v1}, Lcom/facebook/TestSession$TestTokenCachingStrategy;-><init>(Lcom/facebook/TestSession$1;)V

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/TestSession;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TokenCachingStrategy;Ljava/lang/String;Lcom/facebook/TestSession$Mode;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v6

    return-object v0
.end method

.method private deleteTestAccount(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1, "testAccountId"    # Ljava/lang/String;
    .param p2, "appAccessToken"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 412
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 413
    .local v2, "parameters":Landroid/os/Bundle;
    const-string v5, "access_token"

    invoke-virtual {v2, v5, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    new-instance v3, Lcom/facebook/Request;

    const/4 v5, 0x0

    sget-object v6, Lcom/facebook/HttpMethod;->DELETE:Lcom/facebook/HttpMethod;

    invoke-direct {v3, v5, p1, v2, v6}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 416
    .local v3, "request":Lcom/facebook/Request;
    invoke-virtual {v3}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;

    move-result-object v4

    .line 418
    .local v4, "response":Lcom/facebook/Response;
    invoke-virtual {v4}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 419
    .local v0, "error":Lcom/facebook/FacebookRequestError;
    invoke-virtual {v4}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v1

    .line 420
    .local v1, "graphObject":Lcom/facebook/model/GraphObject;
    if-eqz v0, :cond_1

    .line 421
    const-string v5, "FacebookSDK.TestSession"

    const-string v6, "Could not delete test account %s: %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p1, v7, v8

    invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v8

    invoke-virtual {v8}, Lcom/facebook/FacebookException;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v9

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    :cond_0
    :goto_0
    return-void

    .line 422
    :cond_1
    const-string v5, "FACEBOOK_NON_JSON_RESULT"

    invoke-interface {v1, v5}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    if-eq v5, v6, :cond_2

    const-string v5, "success"

    .line 423
    invoke-interface {v1, v5}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    if-ne v5, v6, :cond_0

    .line 424
    :cond_2
    const-string v5, "FacebookSDK.TestSession"

    const-string v6, "Could not delete test account %s: unknown reason"

    new-array v7, v9, [Ljava/lang/Object;

    aput-object p1, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private findOrCreateSharedTestAccount()V
    .locals 2

    .prologue
    .line 356
    invoke-direct {p0}, Lcom/facebook/TestSession;->getSharedTestAccountIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/TestSession;->findTestAccountMatchingIdentifier(Ljava/lang/String;)Lcom/facebook/TestSession$TestAccount;

    move-result-object v0

    .line 357
    .local v0, "testAccount":Lcom/facebook/TestSession$TestAccount;
    if-eqz v0, :cond_0

    .line 358
    invoke-direct {p0, v0}, Lcom/facebook/TestSession;->finishAuthWithTestAccount(Lcom/facebook/TestSession$TestAccount;)V

    .line 362
    :goto_0
    return-void

    .line 360
    :cond_0
    invoke-direct {p0}, Lcom/facebook/TestSession;->createTestAccountAndFinishAuth()Lcom/facebook/TestSession$TestAccount;

    goto :goto_0
.end method

.method private static declared-synchronized findTestAccountMatchingIdentifier(Ljava/lang/String;)Lcom/facebook/TestSession$TestAccount;
    .locals 4
    .param p0, "identifier"    # Ljava/lang/String;

    .prologue
    .line 283
    const-class v2, Lcom/facebook/TestSession;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lcom/facebook/TestSession;->retrieveTestAccountsForAppIfNeeded()V

    .line 285
    sget-object v1, Lcom/facebook/TestSession;->appTestAccounts:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/TestSession$TestAccount;

    .line 286
    .local v0, "testAccount":Lcom/facebook/TestSession$TestAccount;
    invoke-interface {v0}, Lcom/facebook/TestSession$TestAccount;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    if-eqz v3, :cond_0

    .line 290
    .end local v0    # "testAccount":Lcom/facebook/TestSession$TestAccount;
    :goto_0
    monitor-exit v2

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 283
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method private finishAuthWithTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    .locals 4
    .param p1, "testAccount"    # Lcom/facebook/TestSession$TestAccount;

    .prologue
    .line 365
    invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;

    .line 366
    invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/TestSession;->testAccountUserName:Ljava/lang/String;

    .line 368
    invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/TestSession;->requestedPermissions:Ljava/util/List;

    sget-object v3, Lcom/facebook/AccessTokenSource;->TEST_USER:Lcom/facebook/AccessTokenSource;

    invoke-static {v1, v2, v3}, Lcom/facebook/AccessToken;->createFromString(Ljava/lang/String;Ljava/util/List;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;

    move-result-object v0

    .line 370
    .local v0, "accessToken":Lcom/facebook/AccessToken;
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/TestSession;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V

    .line 371
    return-void
.end method

.method static final getAppAccessToken()Ljava/lang/String;
    .locals 2

    .prologue
    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getPermissionsString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 429
    const-string v0, ","

    iget-object v1, p0, Lcom/facebook/TestSession;->requestedPermissions:Ljava/util/List;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getSharedTestAccountIdentifier()Ljava/lang/String;
    .locals 10

    .prologue
    const-wide v8, 0xffffffffL

    .line 434
    invoke-direct {p0}, Lcom/facebook/TestSession;->getPermissionsString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    int-to-long v6, v6

    and-long v2, v6, v8

    .line 435
    .local v2, "permissionsHash":J
    iget-object v6, p0, Lcom/facebook/TestSession;->sessionUniqueUserTag:Ljava/lang/String;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lcom/facebook/TestSession;->sessionUniqueUserTag:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    int-to-long v6, v6

    and-long v4, v6, v8

    .line 437
    .local v4, "sessionTagHash":J
    :goto_0
    xor-long v0, v2, v4

    .line 438
    .local v0, "combinedHash":J
    invoke-direct {p0, v0, v1}, Lcom/facebook/TestSession;->validNameStringFromInteger(J)Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 435
    .end local v0    # "combinedHash":J
    .end local v4    # "sessionTagHash":J
    :cond_0
    const-wide/16 v4, 0x0

    goto :goto_0
.end method

.method public static declared-synchronized getTestApplicationId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 156
    const-class v0, Lcom/facebook/TestSession;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized getTestApplicationSecret()Ljava/lang/String;
    .locals 2

    .prologue
    .line 178
    const-class v0, Lcom/facebook/TestSession;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized populateTestAccounts(Ljava/util/Collection;Lcom/facebook/model/GraphObject;)V
    .locals 6
    .param p1, "userAccountsMap"    # Lcom/facebook/model/GraphObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/TestSession$TestAccount;",
            ">;",
            "Lcom/facebook/model/GraphObject;",
            ")V"
        }
    .end annotation

    .prologue
    .line 271
    .local p0, "testAccounts":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/facebook/TestSession$TestAccount;>;"
    const-class v3, Lcom/facebook/TestSession;

    monitor-enter v3

    :try_start_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/TestSession$TestAccount;

    .line 272
    .local v0, "testAccount":Lcom/facebook/TestSession$TestAccount;
    invoke-interface {v0}, Lcom/facebook/TestSession$TestAccount;->getId()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lcom/facebook/model/GraphUser;

    invoke-interface {p1, v4, v5}, Lcom/facebook/model/GraphObject;->getPropertyAs(Ljava/lang/String;Ljava/lang/Class;)Lcom/facebook/model/GraphObject;

    move-result-object v1

    check-cast v1, Lcom/facebook/model/GraphUser;

    .line 273
    .local v1, "testUser":Lcom/facebook/model/GraphUser;
    invoke-interface {v1}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/facebook/TestSession$TestAccount;->setName(Ljava/lang/String;)V

    .line 274
    invoke-static {v0}, Lcom/facebook/TestSession;->storeTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 271
    .end local v0    # "testAccount":Lcom/facebook/TestSession$TestAccount;
    .end local v1    # "testUser":Lcom/facebook/model/GraphUser;
    :catchall_0
    move-exception v2

    monitor-exit v3

    throw v2

    .line 276
    :cond_0
    monitor-exit v3

    return-void
.end method

.method private static declared-synchronized retrieveTestAccountsForAppIfNeeded()V
    .locals 13

    .prologue
    const/4 v12, 0x2

    .line 228
    const-class v9, Lcom/facebook/TestSession;

    monitor-enter v9

    :try_start_0
    sget-object v8, Lcom/facebook/TestSession;->appTestAccounts:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_0

    .line 266
    .local v0, "parameters":Landroid/os/Bundle;
    .local v1, "requestTestUserNames":Lcom/facebook/Request;
    .local v2, "requestTestUsers":Lcom/facebook/Request;
    .local v3, "responses":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/Response;>;"
    .local v4, "testAccounts":Lcom/facebook/model/GraphObjectList;, "Lcom/facebook/model/GraphObjectList<Lcom/facebook/TestSession$TestAccount;>;"
    .local v5, "testAccountsResponse":Lcom/facebook/TestSession$TestAccountsResponse;
    .local v6, "testUserNamesParam":Landroid/os/Bundle;
    .local v7, "userAccountsMap":Lcom/facebook/model/GraphObject;
    :goto_0
    monitor-exit v9

    return-void

    .line 232
    .end local v0    # "parameters":Landroid/os/Bundle;
    .end local v1    # "requestTestUserNames":Lcom/facebook/Request;
    .end local v2    # "requestTestUsers":Lcom/facebook/Request;
    .end local v3    # "responses":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/Response;>;"
    .end local v4    # "testAccounts":Lcom/facebook/model/GraphObjectList;, "Lcom/facebook/model/GraphObjectList<Lcom/facebook/TestSession$TestAccount;>;"
    .end local v5    # "testAccountsResponse":Lcom/facebook/TestSession$TestAccountsResponse;
    .end local v6    # "testUserNamesParam":Landroid/os/Bundle;
    .end local v7    # "userAccountsMap":Lcom/facebook/model/GraphObject;
    :cond_0
    :try_start_1
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    sput-object v8, Lcom/facebook/TestSession;->appTestAccounts:Ljava/util/Map;

    .line 237
    sget-object v8, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    invoke-static {v8}, Lcom/facebook/Request;->setDefaultBatchApplicationId(Ljava/lang/String;)V

    .line 239
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 240
    .restart local v0    # "parameters":Landroid/os/Bundle;
    const-string v8, "access_token"

    invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v8, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    new-instance v2, Lcom/facebook/Request;

    const/4 v8, 0x0

    const-string v10, "app/accounts/test-users"

    const/4 v11, 0x0

    invoke-direct {v2, v8, v10, v0, v11}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 243
    .restart local v2    # "requestTestUsers":Lcom/facebook/Request;
    const-string v8, "testUsers"

    invoke-virtual {v2, v8}, Lcom/facebook/Request;->setBatchEntryName(Ljava/lang/String;)V

    .line 244
    const/4 v8, 0x0

    invoke-virtual {v2, v8}, Lcom/facebook/Request;->setBatchEntryOmitResultOnSuccess(Z)V

    .line 246
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 247
    .restart local v6    # "testUserNamesParam":Landroid/os/Bundle;
    const-string v8, "access_token"

    invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v8, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v8, "ids"

    const-string v10, "{result=testUsers:$.data.*.id}"

    invoke-virtual {v6, v8, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v8, "fields"

    const-string v10, "name"

    invoke-virtual {v6, v8, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    new-instance v1, Lcom/facebook/Request;

    const/4 v8, 0x0

    const-string v10, ""

    const/4 v11, 0x0

    invoke-direct {v1, v8, v10, v6, v11}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    .line 252
    .restart local v1    # "requestTestUserNames":Lcom/facebook/Request;
    const-string v8, "testUsers"

    invoke-virtual {v1, v8}, Lcom/facebook/Request;->setBatchEntryDependsOn(Ljava/lang/String;)V

    .line 254
    const/4 v8, 0x2

    new-array v8, v8, [Lcom/facebook/Request;

    const/4 v10, 0x0

    aput-object v2, v8, v10

    const/4 v10, 0x1

    aput-object v1, v8, v10

    invoke-static {v8}, Lcom/facebook/Request;->executeBatchAndWait([Lcom/facebook/Request;)Ljava/util/List;

    move-result-object v3

    .line 255
    .restart local v3    # "responses":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/Response;>;"
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    if-eq v8, v12, :cond_2

    .line 256
    :cond_1
    new-instance v8, Lcom/facebook/FacebookException;

    const-string v10, "Unexpected number of results from TestUsers batch query"

    invoke-direct {v8, v10}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    .end local v1    # "requestTestUserNames":Lcom/facebook/Request;
    .end local v2    # "requestTestUsers":Lcom/facebook/Request;
    .end local v3    # "responses":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/Response;>;"
    .end local v6    # "testUserNamesParam":Landroid/os/Bundle;
    :catchall_0
    move-exception v8

    monitor-exit v9

    throw v8

    .line 259
    .restart local v1    # "requestTestUserNames":Lcom/facebook/Request;
    .restart local v2    # "requestTestUsers":Lcom/facebook/Request;
    .restart local v3    # "responses":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/Response;>;"
    .restart local v6    # "testUserNamesParam":Landroid/os/Bundle;
    :cond_2
    const/4 v8, 0x0

    :try_start_2
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/Response;

    const-class v10, Lcom/facebook/TestSession$TestAccountsResponse;

    invoke-virtual {v8, v10}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;

    move-result-object v5

    check-cast v5, Lcom/facebook/TestSession$TestAccountsResponse;

    .line 260
    .restart local v5    # "testAccountsResponse":Lcom/facebook/TestSession$TestAccountsResponse;
    invoke-interface {v5}, Lcom/facebook/TestSession$TestAccountsResponse;->getData()Lcom/facebook/model/GraphObjectList;

    move-result-object v4

    .line 263
    .restart local v4    # "testAccounts":Lcom/facebook/model/GraphObjectList;, "Lcom/facebook/model/GraphObjectList<Lcom/facebook/TestSession$TestAccount;>;"
    const/4 v8, 0x1

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/Response;

    invoke-virtual {v8}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v7

    .line 265
    .restart local v7    # "userAccountsMap":Lcom/facebook/model/GraphObject;
    invoke-static {v4, v7}, Lcom/facebook/TestSession;->populateTestAccounts(Ljava/util/Collection;Lcom/facebook/model/GraphObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method public static declared-synchronized setTestApplicationId(Ljava/lang/String;)V
    .locals 3
    .param p0, "applicationId"    # Ljava/lang/String;

    .prologue
    .line 166
    const-class v1, Lcom/facebook/TestSession;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v2, "Can\'t have more than one test application ID"

    invoke-direct {v0, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 169
    :cond_0
    :try_start_1
    sput-object p0, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    monitor-exit v1

    return-void
.end method

.method public static declared-synchronized setTestApplicationSecret(Ljava/lang/String;)V
    .locals 3
    .param p0, "applicationSecret"    # Ljava/lang/String;

    .prologue
    .line 188
    const-class v1, Lcom/facebook/TestSession;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v2, "Can\'t have more than one test application secret"

    invoke-direct {v0, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 191
    :cond_0
    :try_start_1
    sput-object p0, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    monitor-exit v1

    return-void
.end method

.method private static declared-synchronized storeTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    .locals 3
    .param p0, "testAccount"    # Lcom/facebook/TestSession$TestAccount;

    .prologue
    .line 279
    const-class v1, Lcom/facebook/TestSession;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/TestSession;->appTestAccounts:Ljava/util/Map;

    invoke-interface {p0}, Lcom/facebook/TestSession$TestAccount;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    monitor-exit v1

    return-void

    .line 279
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private validNameStringFromInteger(J)Ljava/lang/String;
    .locals 9
    .param p1, "i"    # J

    .prologue
    .line 442
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    .line 443
    .local v3, "s":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Perm"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 448
    .local v2, "result":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 449
    .local v1, "lastChar":C
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    array-length v6, v5

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v6, :cond_1

    aget-char v0, v5, v4

    .line 450
    .local v0, "c":C
    if-ne v0, v1, :cond_0

    .line 451
    add-int/lit8 v7, v0, 0xa

    int-to-char v0, v7

    .line 453
    :cond_0
    add-int/lit8 v7, v0, 0x61

    add-int/lit8 v7, v7, -0x30

    int-to-char v7, v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 454
    move v1, v0

    .line 449
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 457
    .end local v0    # "c":C
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method


# virtual methods
.method authorize(Lcom/facebook/Session$AuthorizationRequest;)V
    .locals 2
    .param p1, "request"    # Lcom/facebook/Session$AuthorizationRequest;

    .prologue
    .line 303
    iget-object v0, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;

    sget-object v1, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;

    if-ne v0, v1, :cond_0

    .line 304
    invoke-direct {p0}, Lcom/facebook/TestSession;->createTestAccountAndFinishAuth()Lcom/facebook/TestSession$TestAccount;

    .line 308
    :goto_0
    return-void

    .line 306
    :cond_0
    invoke-direct {p0}, Lcom/facebook/TestSession;->findOrCreateSharedTestAccount()V

    goto :goto_0
.end method

.method extendAccessToken()V
    .locals 1

    .prologue
    .line 343
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z

    .line 344
    invoke-super {p0}, Lcom/facebook/Session;->extendAccessToken()V

    .line 345
    return-void
.end method

.method fakeTokenRefreshAttempt()V
    .locals 1

    .prologue
    .line 348
    new-instance v0, Lcom/facebook/Session$TokenRefreshRequest;

    invoke-direct {v0, p0}, Lcom/facebook/Session$TokenRefreshRequest;-><init>(Lcom/facebook/Session;)V

    invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setCurrentTokenRefreshRequest(Lcom/facebook/Session$TokenRefreshRequest;)V

    .line 349
    return-void
.end method

.method forceExtendAccessToken(Z)V
    .locals 10
    .param p1, "forceExtendAccessToken"    # Z

    .prologue
    const-wide/16 v8, 0x0

    .line 327
    invoke-virtual {p0}, Lcom/facebook/TestSession;->getTokenInfo()Lcom/facebook/AccessToken;

    move-result-object v7

    .line 328
    .local v7, "currentToken":Lcom/facebook/AccessToken;
    new-instance v0, Lcom/facebook/AccessToken;

    .line 329
    invoke-virtual {v7}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/List;

    move-result-object v3

    .line 330
    invoke-virtual {v7}, Lcom/facebook/AccessToken;->getDeclinedPermissions()Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/facebook/AccessTokenSource;->TEST_USER:Lcom/facebook/AccessTokenSource;

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V

    .line 328
    invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setTokenInfo(Lcom/facebook/AccessToken;)V

    .line 331
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setLastAttemptedTokenExtendDate(Ljava/util/Date;)V

    .line 332
    return-void
.end method

.method public final getTestUserId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTestUserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/TestSession;->testAccountUserName:Ljava/lang/String;

    return-object v0
.end method

.method getWasAskedToExtendAccessToken()Z
    .locals 1

    .prologue
    .line 323
    iget-boolean v0, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z

    return v0
.end method

.method postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 3
    .param p1, "oldState"    # Lcom/facebook/SessionState;
    .param p2, "newState"    # Lcom/facebook/SessionState;
    .param p3, "error"    # Ljava/lang/Exception;

    .prologue
    .line 313
    iget-object v0, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;

    .line 315
    .local v0, "id":Ljava/lang/String;
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 317
    invoke-virtual {p2}, Lcom/facebook/SessionState;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;

    sget-object v2, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;

    if-ne v1, v2, :cond_0

    .line 318
    invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/TestSession;->deleteTestAccount(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    :cond_0
    return-void
.end method

.method shouldExtendAccessToken()Z
    .locals 2

    .prologue
    .line 336
    invoke-super {p0}, Lcom/facebook/Session;->shouldExtendAccessToken()Z

    move-result v0

    .line 337
    .local v0, "result":Z
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z

    .line 338
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 295
    invoke-super {p0}, Lcom/facebook/Session;->toString()Ljava/lang/String;

    move-result-object v0

    .line 297
    .local v0, "superString":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{TestSession"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " testUserId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    .line 298
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
