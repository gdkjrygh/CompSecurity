.class public Lcom/hmobile/twitter/Twitter;
.super Ljava/lang/Object;
.source "Twitter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/Twitter$DialogListener;
    }
.end annotation


# static fields
.field public static final ACCESS_TOKEN:Ljava/lang/String; = "access_token"

.field public static final AUTHORIZE:Ljava/lang/String; = "authorize"

.field public static final CALLBACK_SCHEME:Ljava/lang/String; = "gc"

.field public static final CALLBACK_URI:Ljava/lang/String; = "gc://twitt"

.field public static final CANCEL_URI:Ljava/lang/String; = "twitter://cancel"

.field protected static OAUTH_ACCESS_TOKEN:Ljava/lang/String; = null

.field protected static OAUTH_AUTHORIZE:Ljava/lang/String; = null

.field protected static OAUTH_REQUEST_TOKEN:Ljava/lang/String; = null

.field public static final REQUEST:Ljava/lang/String; = "request"

.field protected static REQUEST_ENDPOINT:Ljava/lang/String; = null

.field public static final SECRET_TOKEN:Ljava/lang/String; = "secret_token"

.field public static final TAG:Ljava/lang/String; = "twitter"


# instance fields
.field private mAccessToken:Ljava/lang/String;

.field private mHttpOauthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

.field private mHttpOauthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

.field private mIcon:Landroid/graphics/drawable/Drawable;

.field private mSecretToken:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "https://api.twitter.com/1"

    sput-object v0, Lcom/hmobile/twitter/Twitter;->REQUEST_ENDPOINT:Ljava/lang/String;

    .line 35
    const-string v0, "https://api.twitter.com/oauth/request_token"

    sput-object v0, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    .line 36
    const-string v0, "https://api.twitter.com/oauth/access_token"

    sput-object v0, Lcom/hmobile/twitter/Twitter;->OAUTH_ACCESS_TOKEN:Ljava/lang/String;

    .line 37
    const-string v0, "https://api.twitter.com/oauth/authorize"

    sput-object v0, Lcom/hmobile/twitter/Twitter;->OAUTH_AUTHORIZE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    const/4 v0, 0x0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object v0, p0, Lcom/hmobile/twitter/Twitter;->mAccessToken:Ljava/lang/String;

    .line 40
    iput-object v0, p0, Lcom/hmobile/twitter/Twitter;->mSecretToken:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Lcom/hmobile/twitter/Twitter;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 48
    return-void
.end method


# virtual methods
.method public authorize(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Lcom/hmobile/twitter/Twitter$DialogListener;)V
    .locals 4
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "handler"    # Landroid/os/Handler;
    .param p3, "consumerKey"    # Ljava/lang/String;
    .param p4, "consumerSecret"    # Ljava/lang/String;
    .param p5, "listener"    # Lcom/hmobile/twitter/Twitter$DialogListener;

    .prologue
    .line 52
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 53
    invoke-direct {v0, p3, p4}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iput-object v0, p0, Lcom/hmobile/twitter/Twitter;->mHttpOauthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 54
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    sget-object v1, Lcom/hmobile/twitter/Twitter;->OAUTH_REQUEST_TOKEN:Ljava/lang/String;

    .line 55
    sget-object v2, Lcom/hmobile/twitter/Twitter;->OAUTH_ACCESS_TOKEN:Ljava/lang/String;

    sget-object v3, Lcom/hmobile/twitter/Twitter;->OAUTH_AUTHORIZE:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iput-object v0, p0, Lcom/hmobile/twitter/Twitter;->mHttpOauthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    .line 56
    invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 57
    new-instance v0, Lcom/hmobile/twitter/Twitter$1;

    invoke-direct {v0, p0, p5}, Lcom/hmobile/twitter/Twitter$1;-><init>(Lcom/hmobile/twitter/Twitter;Lcom/hmobile/twitter/Twitter$DialogListener;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/hmobile/twitter/Twitter;->dialog(Landroid/content/Context;Landroid/os/Handler;Lcom/hmobile/twitter/Twitter$DialogListener;)V

    .line 93
    return-void
.end method

.method public dialog(Landroid/content/Context;Landroid/os/Handler;Lcom/hmobile/twitter/Twitter$DialogListener;)V
    .locals 6
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "handler"    # Landroid/os/Handler;
    .param p3, "listener"    # Lcom/hmobile/twitter/Twitter$DialogListener;

    .prologue
    .line 102
    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const-string v0, "Error"

    .line 104
    const-string v1, "Application requires permission to access the Internet"

    .line 103
    invoke-static {p1, v0, v1}, Lcom/hmobile/twitter/Util;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :goto_0
    return-void

    .line 107
    :cond_0
    new-instance v0, Lcom/hmobile/twitter/TwDialog;

    iget-object v2, p0, Lcom/hmobile/twitter/Twitter;->mHttpOauthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    iget-object v3, p0, Lcom/hmobile/twitter/Twitter;->mHttpOauthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 108
    iget-object v5, p0, Lcom/hmobile/twitter/Twitter;->mIcon:Landroid/graphics/drawable/Drawable;

    move-object v1, p1

    move-object v4, p3

    .line 107
    invoke-direct/range {v0 .. v5}, Lcom/hmobile/twitter/TwDialog;-><init>(Landroid/content/Context;Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;Lcom/hmobile/twitter/Twitter$DialogListener;Landroid/graphics/drawable/Drawable;)V

    .line 108
    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog;->show()V

    goto :goto_0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter;->mAccessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getSecretToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/hmobile/twitter/Twitter;->mSecretToken:Ljava/lang/String;

    return-object v0
.end method

.method public isSessionValid()Z
    .locals 1

    .prologue
    .line 112
    invoke-virtual {p0}, Lcom/hmobile/twitter/Twitter;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/hmobile/twitter/Twitter;->getSecretToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public logout(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 97
    const-string v0, "true"

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0
    .param p1, "accessToken"    # Ljava/lang/String;

    .prologue
    .line 120
    iput-object p1, p0, Lcom/hmobile/twitter/Twitter;->mAccessToken:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 143
    return-void
.end method

.method public setSecretToken(Ljava/lang/String;)V
    .locals 0
    .param p1, "secretToken"    # Ljava/lang/String;

    .prologue
    .line 128
    iput-object p1, p0, Lcom/hmobile/twitter/Twitter;->mSecretToken:Ljava/lang/String;

    .line 129
    return-void
.end method
