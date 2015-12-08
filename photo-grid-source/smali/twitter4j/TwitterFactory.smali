.class public final Ltwitter4j/TwitterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final DEFAULT_AUTHORIZATION:Ltwitter4j/auth/Authorization;

.field private static final SINGLETON:Ltwitter4j/Twitter;

.field private static final TWITTER_CONSTRUCTOR:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor",
            "<",
            "Ltwitter4j/Twitter;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x481470a850d0e763L


# instance fields
.field private final conf:Ltwitter4j/conf/Configuration;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 39
    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/auth/AuthorizationFactory;->getInstance(Ltwitter4j/conf/Configuration;)Ltwitter4j/auth/Authorization;

    move-result-object v0

    sput-object v0, Ltwitter4j/TwitterFactory;->DEFAULT_AUTHORIZATION:Ltwitter4j/auth/Authorization;

    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v1

    invoke-interface {v1}, Ltwitter4j/conf/Configuration;->isGAE()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 49
    :try_start_0
    const-string v1, "twitter4j.AppEngineTwitterImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    const-string v0, "twitter4j.AppEngineTwitterImpl"
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5

    .line 54
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 55
    const-string v0, "twitter4j.TwitterImpl"

    .line 60
    :cond_1
    :try_start_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 61
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ltwitter4j/conf/Configuration;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-class v3, Ltwitter4j/auth/Authorization;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 67
    sput-object v0, Ltwitter4j/TwitterFactory;->TWITTER_CONSTRUCTOR:Ljava/lang/reflect/Constructor;

    .line 70
    :try_start_2
    sget-object v0, Ltwitter4j/TwitterFactory;->TWITTER_CONSTRUCTOR:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, Ltwitter4j/TwitterFactory;->DEFAULT_AUTHORIZATION:Ltwitter4j/auth/Authorization;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/Twitter;

    sput-object v0, Ltwitter4j/TwitterFactory;->SINGLETON:Ltwitter4j/Twitter;
    :try_end_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_4

    .line 77
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 64
    :catch_1
    move-exception v0

    .line 65
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 71
    :catch_2
    move-exception v0

    .line 72
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 73
    :catch_3
    move-exception v0

    .line 74
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 75
    :catch_4
    move-exception v0

    .line 76
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catch_5
    move-exception v1

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 84
    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v0

    invoke-direct {p0, v0}, Ltwitter4j/TwitterFactory;-><init>(Ltwitter4j/conf/Configuration;)V

    .line 85
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 106
    invoke-static {p1}, Ltwitter4j/conf/ConfigurationContext;->getInstance(Ljava/lang/String;)Ltwitter4j/conf/Configuration;

    move-result-object v0

    invoke-direct {p0, v0}, Ltwitter4j/TwitterFactory;-><init>(Ltwitter4j/conf/Configuration;)V

    .line 107
    return-void
.end method

.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    if-nez p1, :cond_0

    .line 95
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "configuration cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_0
    iput-object p1, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    .line 98
    return-void
.end method

.method public static getSingleton()Ltwitter4j/Twitter;
    .locals 1

    .prologue
    .line 157
    sget-object v0, Ltwitter4j/TwitterFactory;->SINGLETON:Ltwitter4j/Twitter;

    return-object v0
.end method


# virtual methods
.method public final getInstance()Ltwitter4j/Twitter;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {v0}, Ltwitter4j/auth/AuthorizationFactory;->getInstance(Ltwitter4j/conf/Configuration;)Ltwitter4j/auth/Authorization;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltwitter4j/TwitterFactory;->getInstance(Ltwitter4j/auth/Authorization;)Ltwitter4j/Twitter;

    move-result-object v0

    return-object v0
.end method

.method public final getInstance(Ltwitter4j/auth/AccessToken;)Ltwitter4j/Twitter;
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getOAuthConsumerKey()Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v1}, Ltwitter4j/conf/Configuration;->getOAuthConsumerSecret()Ljava/lang/String;

    move-result-object v1

    .line 130
    if-nez v0, :cond_0

    if-nez v1, :cond_0

    .line 131
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Consumer key and Consumer secret not supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_0
    new-instance v0, Ltwitter4j/auth/OAuthAuthorization;

    iget-object v1, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, v1}, Ltwitter4j/auth/OAuthAuthorization;-><init>(Ltwitter4j/conf/Configuration;)V

    .line 134
    invoke-virtual {v0, p1}, Ltwitter4j/auth/OAuthAuthorization;->setOAuthAccessToken(Ltwitter4j/auth/AccessToken;)V

    .line 135
    invoke-virtual {p0, v0}, Ltwitter4j/TwitterFactory;->getInstance(Ltwitter4j/auth/Authorization;)Ltwitter4j/Twitter;

    move-result-object v0

    return-object v0
.end method

.method public final getInstance(Ltwitter4j/auth/Authorization;)Ltwitter4j/Twitter;
    .locals 4

    .prologue
    .line 140
    :try_start_0
    sget-object v0, Ltwitter4j/TwitterFactory;->TWITTER_CONSTRUCTOR:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ltwitter4j/TwitterFactory;->conf:Ltwitter4j/conf/Configuration;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/Twitter;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v0

    .line 141
    :catch_0
    move-exception v0

    .line 142
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 143
    :catch_1
    move-exception v0

    .line 144
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 145
    :catch_2
    move-exception v0

    .line 146
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
