.class public Lcom/hmobile/twitter/TwitterProvider;
.super Lcom/hmobile/twitter/BaseProvider;
.source "TwitterProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/TwitterProvider$Tweeter;
    }
.end annotation


# static fields
.field public static CALL_BACK_URL:Ljava/lang/String; = null

.field public static final ID_PATTERN:Ljava/util/regex/Pattern;

.field public static final SCREEN_NAME_PATTERN:Ljava/util/regex/Pattern;

.field public static TWITPIC_API_KEY:Ljava/lang/String; = null

.field public static TWITTER_CONSUMER_KEY:Ljava/lang/String; = null

.field public static TWITTER_CONSUMER_SECRET:Ljava/lang/String; = null

.field public static final TWITTER_OAUTH_ACCESS_TOKEN_ENDPOINT:Ljava/lang/String; = "http://twitter.com/oauth/access_token"

.field public static final TWITTER_OAUTH_AUTHORIZE_ENDPOINT:Ljava/lang/String; = "http://twitter.com/oauth/authorize"

.field public static final TWITTER_OAUTH_REQUEST_TOKEN_ENDPOINT:Ljava/lang/String; = "http://twitter.com/oauth/request_token"

.field public static TWITTER_POST_MESSAGE_URL:Ljava/lang/String;

.field private static volatile _instance:Lcom/hmobile/twitter/TwitterProvider;


# instance fields
.field accessToken:Ljava/lang/String;

.field private commonsHttpOAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

.field private commonsHttpOAuthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

.field private dialogListener:Lcom/hmobile/twitter/Twitter$DialogListener;

.field m_context:Landroid/content/Context;

.field public m_drawable:Landroid/graphics/drawable/Drawable;

.field m_listner:Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;

.field secretToken:Ljava/lang/String;

.field tweet:Lcom/hmobile/twitter/TwitterProvider$Tweeter;

.field twitter:Lcom/hmobile/twitter/Twitter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-string v0, ""

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_KEY:Ljava/lang/String;

    .line 40
    const-string v0, ""

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_SECRET:Ljava/lang/String;

    .line 41
    const-string v0, ""

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->TWITPIC_API_KEY:Ljava/lang/String;

    .line 42
    const-string v0, "twitter-oauth://callback"

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->CALL_BACK_URL:Ljava/lang/String;

    .line 43
    const-string v0, "http://twitter.com/statuses/update.json"

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_POST_MESSAGE_URL:Ljava/lang/String;

    .line 51
    const-string v0, ".*?\"id_str\":\"(\\d*)\".*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 50
    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->ID_PATTERN:Ljava/util/regex/Pattern;

    .line 53
    const-string v0, ".*?\"screen_name\":\"([^\"]*).*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 52
    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->SCREEN_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/hmobile/twitter/BaseProvider;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/twitter/TwitterProvider;->m_drawable:Landroid/graphics/drawable/Drawable;

    .line 48
    new-instance v0, Lcom/hmobile/twitter/Twitter;

    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_drawable:Landroid/graphics/drawable/Drawable;

    invoke-direct {v0, v1}, Lcom/hmobile/twitter/Twitter;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/hmobile/twitter/TwitterProvider;->twitter:Lcom/hmobile/twitter/Twitter;

    .line 228
    new-instance v0, Lcom/hmobile/twitter/TwitterProvider$1;

    invoke-direct {v0, p0}, Lcom/hmobile/twitter/TwitterProvider$1;-><init>(Lcom/hmobile/twitter/TwitterProvider;)V

    iput-object v0, p0, Lcom/hmobile/twitter/TwitterProvider;->dialogListener:Lcom/hmobile/twitter/Twitter$DialogListener;

    .line 28
    return-void
.end method


# virtual methods
.method public Instance()Lcom/hmobile/twitter/TwitterProvider;
    .locals 2

    .prologue
    .line 58
    sget-object v0, Lcom/hmobile/twitter/TwitterProvider;->_instance:Lcom/hmobile/twitter/TwitterProvider;

    if-nez v0, :cond_1

    .line 59
    const-class v1, Lcom/hmobile/twitter/TwitterProvider;

    monitor-enter v1

    .line 60
    :try_start_0
    sget-object v0, Lcom/hmobile/twitter/TwitterProvider;->_instance:Lcom/hmobile/twitter/TwitterProvider;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Lcom/hmobile/twitter/TwitterProvider;

    invoke-direct {v0}, Lcom/hmobile/twitter/TwitterProvider;-><init>()V

    sput-object v0, Lcom/hmobile/twitter/TwitterProvider;->_instance:Lcom/hmobile/twitter/TwitterProvider;

    .line 59
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    :cond_1
    sget-object v0, Lcom/hmobile/twitter/TwitterProvider;->_instance:Lcom/hmobile/twitter/TwitterProvider;

    return-object v0

    .line 59
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public isLoggedIn()Z
    .locals 1

    .prologue
    .line 152
    const/4 v0, 0x0

    return v0
.end method

.method public login()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/twitter/SocialException;
        }
    .end annotation

    .prologue
    .line 89
    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_context:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 90
    new-instance v1, Lcom/hmobile/twitter/SocialException;

    sget-object v2, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ContextNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-direct {v1, v2}, Lcom/hmobile/twitter/SocialException;-><init>(Lcom/hmobile/twitter/SocialException$SocialExceptionType;)V

    throw v1

    .line 92
    :cond_0
    sget-object v1, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_KEY:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    .line 93
    new-instance v1, Lcom/hmobile/twitter/SocialException;

    sget-object v2, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-direct {v1, v2}, Lcom/hmobile/twitter/SocialException;-><init>(Lcom/hmobile/twitter/SocialException$SocialExceptionType;)V

    throw v1

    .line 95
    :cond_1
    sget-object v1, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_SECRET:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_2

    .line 96
    new-instance v1, Lcom/hmobile/twitter/SocialException;

    sget-object v2, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-direct {v1, v2}, Lcom/hmobile/twitter/SocialException;-><init>(Lcom/hmobile/twitter/SocialException$SocialExceptionType;)V

    throw v1

    .line 98
    :cond_2
    sget-object v1, Lcom/hmobile/twitter/TwitterProvider;->TWITPIC_API_KEY:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_3

    .line 99
    new-instance v1, Lcom/hmobile/twitter/SocialException;

    sget-object v2, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-direct {v1, v2}, Lcom/hmobile/twitter/SocialException;-><init>(Lcom/hmobile/twitter/SocialException$SocialExceptionType;)V

    throw v1

    .line 101
    :cond_3
    new-instance v1, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    .line 102
    const-string v2, "http://twitter.com/oauth/request_token"

    .line 103
    const-string v3, "http://twitter.com/oauth/access_token"

    .line 104
    const-string v4, "http://twitter.com/oauth/authorize"

    invoke-direct {v1, v2, v3, v4}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iput-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->commonsHttpOAuthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    .line 105
    new-instance v1, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 106
    sget-object v2, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_KEY:Ljava/lang/String;

    sget-object v3, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_SECRET:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    iput-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->commonsHttpOAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 108
    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->commonsHttpOAuthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;->setOAuth10a(Z)V

    .line 109
    new-instance v0, Lcom/hmobile/twitter/TwDialog;

    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_context:Landroid/content/Context;

    iget-object v2, p0, Lcom/hmobile/twitter/TwitterProvider;->commonsHttpOAuthProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    .line 110
    iget-object v3, p0, Lcom/hmobile/twitter/TwitterProvider;->commonsHttpOAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    iget-object v4, p0, Lcom/hmobile/twitter/TwitterProvider;->dialogListener:Lcom/hmobile/twitter/Twitter$DialogListener;

    iget-object v5, p0, Lcom/hmobile/twitter/TwitterProvider;->m_drawable:Landroid/graphics/drawable/Drawable;

    .line 109
    invoke-direct/range {v0 .. v5}, Lcom/hmobile/twitter/TwDialog;-><init>(Landroid/content/Context;Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;Lcom/hmobile/twitter/Twitter$DialogListener;Landroid/graphics/drawable/Drawable;)V

    .line 111
    .local v0, "dialog":Lcom/hmobile/twitter/TwDialog;
    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog;->show()V

    .line 113
    return-void
.end method

.method public logout()V
    .locals 3

    .prologue
    .line 119
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->twitter:Lcom/hmobile/twitter/Twitter;

    iget-object v2, p0, Lcom/hmobile/twitter/TwitterProvider;->m_context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/hmobile/twitter/Twitter;->logout(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 127
    :goto_0
    return-void

    .line 120
    :catch_0
    move-exception v0

    .line 121
    .local v0, "e":Ljava/net/MalformedURLException;
    invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V

    goto :goto_0

    .line 123
    .end local v0    # "e":Ljava/net/MalformedURLException;
    :catch_1
    move-exception v0

    .line 124
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public post(Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 132
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->tweet:Lcom/hmobile/twitter/TwitterProvider$Tweeter;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->upload(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v0

    .line 135
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public postImage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "image_path"    # Ljava/lang/String;

    .prologue
    .line 143
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/twitter/TwitterProvider;->tweet:Lcom/hmobile/twitter/TwitterProvider$Tweeter;

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v2}, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->upload(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :goto_0
    return-void

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public setConsumerData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "consumer_key"    # Ljava/lang/String;
    .param p2, "consumer_secret"    # Ljava/lang/String;
    .param p3, "twitpic_api_key"    # Ljava/lang/String;

    .prologue
    .line 78
    sput-object p1, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_KEY:Ljava/lang/String;

    .line 79
    sput-object p2, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_SECRET:Ljava/lang/String;

    .line 80
    sput-object p3, Lcom/hmobile/twitter/TwitterProvider;->TWITPIC_API_KEY:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setContext(Landroid/content/Context;)V
    .locals 0
    .param p1, "ctx"    # Landroid/content/Context;

    .prologue
    .line 69
    iput-object p1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_context:Landroid/content/Context;

    .line 70
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 84
    iput-object p1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_drawable:Landroid/graphics/drawable/Drawable;

    .line 85
    return-void
.end method

.method public setTwitterProviderListener(Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;)V
    .locals 0
    .param p1, "listener"    # Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;

    .prologue
    .line 73
    iput-object p1, p0, Lcom/hmobile/twitter/TwitterProvider;->m_listner:Lcom/hmobile/twitter/BaseProvider$TwitterCallbacks;

    .line 74
    return-void
.end method
