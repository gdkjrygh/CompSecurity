.class public Lme/grantland/twitter/Twitter;
.super Ljava/lang/Object;
.source "Twitter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/grantland/twitter/Twitter$DialogListener;
    }
.end annotation


# static fields
.field public static final ACCESS_TOKEN:Ljava/lang/String; = "https://twitter.com/oauth/access_token"

.field public static final AUTHORIZE:Ljava/lang/String; = "https://twitter.com/oauth/authorize"

.field public static final CALLBACK_SCHEME:Ljava/lang/String; = "gc"

.field public static final CALLBACK_URI:Ljava/lang/String; = "gc://twitt"

.field public static final DEBUG:Z = false

.field public static final DEFAULT_AUTH_ACTIVITY_CODE:I = 0x1092

.field public static final DENIED:Ljava/lang/String; = "denied"

.field public static final EXTRA_ACCESS_KEY:Ljava/lang/String; = "access_key"

.field public static final EXTRA_ACCESS_SECRET:Ljava/lang/String; = "access_secret"

.field public static final EXTRA_AUTHORIZE_PARAMS:Ljava/lang/String; = "params"

.field public static final EXTRA_CONSUMER:Ljava/lang/String; = "consumer"

.field public static final EXTRA_ERROR:Ljava/lang/String; = "error"

.field public static final REQUEST_TOKEN:Ljava/lang/String; = "https://twitter.com/oauth/request_token"

.field public static final TAG:Ljava/lang/String; = "me.grantland.twitter"


# instance fields
.field private mConsumer:Loauth/signpost/OAuthConsumer;

.field private mListener:Lme/grantland/twitter/Twitter$DialogListener;

.field private mRequestCode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "consumerKey"    # Ljava/lang/String;
    .param p2, "consumerSecret"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 47
    iput-object v0, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    .line 50
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 51
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 52
    const-string v1, "You must specify your consumer key and secret when instantiating a Twitter object. See README for details."

    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_1
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    invoke-direct {v0, p1, p2}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 56
    return-void
.end method

.method static synthetic access$0(Lme/grantland/twitter/Twitter;)Loauth/signpost/OAuthConsumer;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    return-object v0
.end method

.method private startTwitterActivity(Landroid/app/Activity;Ljava/lang/String;ILme/grantland/twitter/Twitter$DialogListener;)Z
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "authorizeParams"    # Ljava/lang/String;
    .param p3, "activityCode"    # I
    .param p4, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 150
    iput p3, p0, Lme/grantland/twitter/Twitter;->mRequestCode:I

    .line 151
    iput-object p4, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    .line 153
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lme/grantland/twitter/TwitterActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 154
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "consumer"

    iget-object v2, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 155
    const-string v1, "params"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    const/16 v1, 0x1092

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 158
    const/4 v1, 0x1

    return v1
.end method

.method private startTwitterDialog(Landroid/app/Activity;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)Z
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "authorizeParams"    # Ljava/lang/String;
    .param p3, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 163
    new-instance v0, Lme/grantland/twitter/TwitterDialog;

    iget-object v1, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 164
    new-instance v2, Lme/grantland/twitter/Twitter$1;

    invoke-direct {v2, p0, p3}, Lme/grantland/twitter/Twitter$1;-><init>(Lme/grantland/twitter/Twitter;Lme/grantland/twitter/Twitter$DialogListener;)V

    .line 163
    invoke-direct {v0, p1, v1, p2, v2}, Lme/grantland/twitter/TwitterDialog;-><init>(Landroid/content/Context;Loauth/signpost/OAuthConsumer;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)V

    .line 187
    .local v0, "dialog":Lme/grantland/twitter/TwitterDialog;
    invoke-virtual {v0}, Lme/grantland/twitter/TwitterDialog;->show()V

    .line 189
    const/4 v1, 0x1

    return v1
.end method


# virtual methods
.method public authorize(Landroid/app/Activity;Lme/grantland/twitter/Twitter$DialogListener;)Z
    .locals 6
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 71
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x1092

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lme/grantland/twitter/Twitter;->authorize(Landroid/app/Activity;ZLjava/lang/String;ILme/grantland/twitter/Twitter$DialogListener;)Z

    move-result v0

    return v0
.end method

.method public authorize(Landroid/app/Activity;ZLjava/lang/String;ILme/grantland/twitter/Twitter$DialogListener;)Z
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "forceLogin"    # Z
    .param p3, "screenName"    # Ljava/lang/String;
    .param p4, "activityCode"    # I
    .param p5, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 125
    const-string v0, ""

    .line 126
    .local v0, "authorizeParams":Ljava/lang/String;
    if-eqz p2, :cond_0

    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "?force_login="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 129
    :cond_0
    if-eqz p3, :cond_1

    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "&"

    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 131
    const-string v2, "screen_name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 138
    :cond_1
    if-lez p4, :cond_3

    .line 139
    invoke-direct {p0, p1, v0, p4, p5}, Lme/grantland/twitter/Twitter;->startTwitterActivity(Landroid/app/Activity;Ljava/lang/String;ILme/grantland/twitter/Twitter$DialogListener;)Z

    .line 145
    :goto_1
    const/4 v1, 0x1

    return v1

    .line 130
    :cond_2
    const-string v1, "?"

    goto :goto_0

    .line 142
    :cond_3
    invoke-direct {p0, p1, v0, p5}, Lme/grantland/twitter/Twitter;->startTwitterDialog(Landroid/app/Activity;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)Z

    goto :goto_1
.end method

.method public authorize(Landroid/app/Activity;ZLjava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)Z
    .locals 6
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "forceLogin"    # Z
    .param p3, "screenName"    # Ljava/lang/String;
    .param p4, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 95
    .line 96
    const/16 v4, 0x1092

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 95
    invoke-virtual/range {v0 .. v5}, Lme/grantland/twitter/Twitter;->authorize(Landroid/app/Activity;ZLjava/lang/String;ILme/grantland/twitter/Twitter$DialogListener;)Z

    move-result v0

    return v0
.end method

.method public authorizeCallback(IILandroid/content/Intent;)V
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 208
    iget v3, p0, Lme/grantland/twitter/Twitter;->mRequestCode:I

    if-eq v3, p1, :cond_1

    .line 239
    :cond_0
    :goto_0
    return-void

    .line 214
    :cond_1
    const/4 v3, -0x1

    if-ne v3, p2, :cond_3

    .line 215
    const-string v3, "error"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 216
    .local v2, "error":Ljava/lang/String;
    if-eqz v2, :cond_2

    .line 217
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    new-instance v4, Lme/grantland/twitter/TwitterError;

    invoke-direct {v4, v2}, Lme/grantland/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4}, Lme/grantland/twitter/Twitter$DialogListener;->onError(Lme/grantland/twitter/TwitterError;)V

    goto :goto_0

    .line 219
    :cond_2
    const-string v3, "access_key"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 220
    .local v0, "accessKey":Ljava/lang/String;
    const-string v3, "access_secret"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 227
    .local v1, "accessSecret":Ljava/lang/String;
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v3, v0, v1}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    if-eqz v3, :cond_0

    .line 230
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v3, v0, v1}, Lme/grantland/twitter/Twitter$DialogListener;->onComplete(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 234
    .end local v0    # "accessKey":Ljava/lang/String;
    .end local v1    # "accessSecret":Ljava/lang/String;
    .end local v2    # "error":Ljava/lang/String;
    :cond_3
    if-nez p2, :cond_0

    .line 235
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    if-eqz v3, :cond_0

    .line 236
    iget-object v3, p0, Lme/grantland/twitter/Twitter;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v3}, Lme/grantland/twitter/Twitter$DialogListener;->onCancel()V

    goto :goto_0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0}, Loauth/signpost/OAuthConsumer;->getToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAccessTokenSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0}, Loauth/signpost/OAuthConsumer;->getTokenSecret()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConsumerKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0}, Loauth/signpost/OAuthConsumer;->getConsumerKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConsumerSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0}, Loauth/signpost/OAuthConsumer;->getConsumerSecret()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isSessionValid()Z
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {p0}, Lme/grantland/twitter/Twitter;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lme/grantland/twitter/Twitter;->getAccessTokenSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 249
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setConsumerKeyAndSecret(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "consumerKey"    # Ljava/lang/String;
    .param p2, "consumerSecret"    # Ljava/lang/String;

    .prologue
    .line 275
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    invoke-direct {v0, p1, p2}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 276
    return-void
.end method

.method public setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "token"    # Ljava/lang/String;
    .param p2, "secret"    # Ljava/lang/String;

    .prologue
    .line 299
    iget-object v0, p0, Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0, p1, p2}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    return-void
.end method
