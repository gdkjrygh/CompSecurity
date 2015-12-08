.class public Lcom/dropbox/client2/android/AndroidAuthSession;
.super Lcom/dropbox/client2/session/AbstractSession;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/dropbox/client2/session/AppKeyPair;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0, p1}, Lcom/dropbox/client2/session/AbstractSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;)V

    .line 80
    return-void
.end method

.method public constructor <init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/AccessTokenPair;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/session/AbstractSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/AccessTokenPair;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/session/AbstractSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;Lcom/dropbox/client2/session/AccessTokenPair;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0, p1, p2, p3}, Lcom/dropbox/client2/session/AbstractSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;Lcom/dropbox/client2/session/AccessTokenPair;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Lcom/dropbox/client2/session/AppKeyPair;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 97
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/session/AbstractSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Ljava/lang/String;)V

    .line 98
    return-void
.end method


# virtual methods
.method public authenticationSuccessful()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 235
    sget-object v1, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 237
    if-nez v1, :cond_1

    .line 251
    :cond_0
    :goto_0
    return v0

    .line 241
    :cond_1
    const-string v2, "ACCESS_TOKEN"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 242
    const-string v3, "ACCESS_SECRET"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 243
    const-string v4, "UID"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 245
    if-eqz v2, :cond_0

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    if-eqz v3, :cond_0

    const-string v2, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 248
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public finishAuthentication()Ljava/lang/String;
    .locals 4

    .prologue
    .line 266
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 268
    if-nez v0, :cond_0

    .line 269
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 272
    :cond_0
    const-string v1, "ACCESS_TOKEN"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 273
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    .line 274
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid result intent passed in. Missing access token."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_2
    const-string v2, "ACCESS_SECRET"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 279
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_4

    .line 280
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid result intent passed in. Missing access secret."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 284
    :cond_4
    const-string v3, "UID"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 285
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_6

    .line 286
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid result intent passed in. Missing uid."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_6
    const-string v3, "oauth2:"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 291
    invoke-virtual {p0, v2}, Lcom/dropbox/client2/android/AndroidAuthSession;->setOAuth2AccessToken(Ljava/lang/String;)V

    .line 296
    :goto_0
    return-object v0

    .line 293
    :cond_7
    new-instance v3, Lcom/dropbox/client2/session/AccessTokenPair;

    invoke-direct {v3, v1, v2}, Lcom/dropbox/client2/session/AccessTokenPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/dropbox/client2/android/AndroidAuthSession;->setAccessTokenPair(Lcom/dropbox/client2/session/AccessTokenPair;)V

    goto :goto_0
.end method

.method public startAuthentication(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 212
    invoke-virtual {p0}, Lcom/dropbox/client2/android/AndroidAuthSession;->getAppKeyPair()Lcom/dropbox/client2/session/AppKeyPair;

    move-result-object v0

    .line 213
    iget-object v1, v0, Lcom/dropbox/client2/session/AppKeyPair;->key:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, Lcom/dropbox/client2/android/AuthActivity;->checkAppBeforeAuth(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 227
    :goto_0
    return-void

    .line 218
    :cond_0
    iget-object v1, v0, Lcom/dropbox/client2/session/AppKeyPair;->key:Ljava/lang/String;

    iget-object v0, v0, Lcom/dropbox/client2/session/AppKeyPair;->secret:Ljava/lang/String;

    invoke-static {v1, v0, v3, v3}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 219
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dropbox/client2/android/AuthActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 220
    instance-of v1, p1, Landroid/app/Activity;

    if-nez v1, :cond_1

    .line 224
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 226
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public startOAuth2Authentication(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->startOAuth2Authentication(Landroid/content/Context;[Ljava/lang/String;)V

    .line 117
    return-void
.end method

.method public startOAuth2Authentication(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 173
    invoke-virtual {p0}, Lcom/dropbox/client2/android/AndroidAuthSession;->getAppKeyPair()Lcom/dropbox/client2/session/AppKeyPair;

    move-result-object v0

    .line 174
    iget-object v1, v0, Lcom/dropbox/client2/session/AppKeyPair;->key:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, Lcom/dropbox/client2/android/AuthActivity;->checkAppBeforeAuth(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 192
    :goto_0
    return-void

    .line 178
    :cond_0
    if-eqz p3, :cond_1

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 179
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "desiredUid cannot be present in alreadyAuthedUids"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_1
    iget-object v0, v0, Lcom/dropbox/client2/session/AppKeyPair;->key:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, p3}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 184
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dropbox/client2/android/AuthActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 185
    instance-of v1, p1, Landroid/app/Activity;

    if-nez v1, :cond_2

    .line 189
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 191
    :cond_2
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public startOAuth2Authentication(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 143
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/dropbox/client2/android/AndroidAuthSession;->startOAuth2Authentication(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    .line 144
    return-void
.end method

.method public unlink()V
    .locals 1

    .prologue
    .line 301
    invoke-super {p0}, Lcom/dropbox/client2/session/AbstractSession;->unlink()V

    .line 302
    const/4 v0, 0x0

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 303
    return-void
.end method
