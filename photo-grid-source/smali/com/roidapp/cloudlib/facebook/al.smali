.class public final Lcom/roidapp/cloudlib/facebook/al;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 39
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v1

    if-nez v1, :cond_0

    .line 41
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 43
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 65
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 66
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/LoginManager;->logOut()V

    .line 67
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->l(Landroid/content/Context;)V

    .line 68
    return-void
.end method

.method public static a([Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 57
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v1

    .line 58
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 61
    :cond_0
    :goto_0
    return v0

    .line 60
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v1

    .line 61
    if-eqz v1, :cond_0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b()Lcom/facebook/AccessToken;
    .locals 1

    .prologue
    .line 47
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 48
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 52
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 53
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d()Z
    .locals 2

    .prologue
    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 72
    const/4 v0, 0x0

    .line 74
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
