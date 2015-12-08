.class final Lcom/facebook/AccessTokenManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final ACTION_CURRENT_ACCESS_TOKEN_CHANGED:Ljava/lang/String; = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

.field static final EXTRA_NEW_ACCESS_TOKEN:Ljava/lang/String; = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"

.field static final EXTRA_OLD_ACCESS_TOKEN:Ljava/lang/String; = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"

.field static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "com.facebook.AccessTokenManager.SharedPreferences"

.field private static final TOKEN_EXTEND_RETRY_SECONDS:I = 0xe10

.field private static final TOKEN_EXTEND_THRESHOLD_SECONDS:I = 0x15180

.field private static volatile instance:Lcom/facebook/AccessTokenManager;


# instance fields
.field private final accessTokenCache:Lcom/facebook/AccessTokenCache;

.field private currentAccessToken:Lcom/facebook/AccessToken;

.field private currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

.field private lastAttemptedTokenExtendDate:Ljava/util/Date;

.field private final localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method constructor <init>(Landroid/support/v4/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V
    .locals 4

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/facebook/AccessTokenManager;->lastAttemptedTokenExtendDate:Ljava/util/Date;

    .line 67
    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    const-string v0, "accessTokenCache"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iput-object p1, p0, Lcom/facebook/AccessTokenManager;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    .line 71
    iput-object p2, p0, Lcom/facebook/AccessTokenManager;->accessTokenCache:Lcom/facebook/AccessTokenCache;

    .line 72
    return-void
.end method

.method static synthetic access$002(Lcom/facebook/AccessTokenManager;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/AccessTokenManager;->lastAttemptedTokenExtendDate:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic access$100(Lcom/facebook/AccessTokenManager;)Lcom/facebook/AccessTokenManager$TokenRefreshRequest;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    return-object v0
.end method

.method static synthetic access$102(Lcom/facebook/AccessTokenManager;Lcom/facebook/AccessTokenManager$TokenRefreshRequest;)Lcom/facebook/AccessTokenManager$TokenRefreshRequest;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    return-object p1
.end method

.method static getInstance()Lcom/facebook/AccessTokenManager;
    .locals 4

    .prologue
    .line 75
    sget-object v0, Lcom/facebook/AccessTokenManager;->instance:Lcom/facebook/AccessTokenManager;

    if-nez v0, :cond_1

    .line 76
    const-class v1, Lcom/facebook/AccessTokenManager;

    monitor-enter v1

    .line 77
    :try_start_0
    sget-object v0, Lcom/facebook/AccessTokenManager;->instance:Lcom/facebook/AccessTokenManager;

    if-nez v0, :cond_0

    .line 78
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    .line 81
    new-instance v2, Lcom/facebook/AccessTokenCache;

    invoke-direct {v2}, Lcom/facebook/AccessTokenCache;-><init>()V

    .line 83
    new-instance v3, Lcom/facebook/AccessTokenManager;

    invoke-direct {v3, v0, v2}, Lcom/facebook/AccessTokenManager;-><init>(Landroid/support/v4/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V

    sput-object v3, Lcom/facebook/AccessTokenManager;->instance:Lcom/facebook/AccessTokenManager;

    .line 85
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_1
    sget-object v0, Lcom/facebook/AccessTokenManager;->instance:Lcom/facebook/AccessTokenManager;

    return-object v0

    .line 85
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private sendCurrentAccessTokenChangedBroadcast(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V
    .locals 2

    .prologue
    .line 131
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 133
    const-string v1, "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 134
    const-string v1, "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 136
    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->localBroadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 137
    return-void
.end method

.method private setCurrentAccessToken(Lcom/facebook/AccessToken;Z)V
    .locals 4

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    .line 112
    iput-object p1, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    .line 113
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    .line 114
    new-instance v1, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v1, p0, Lcom/facebook/AccessTokenManager;->lastAttemptedTokenExtendDate:Ljava/util/Date;

    .line 116
    if-eqz p2, :cond_0

    .line 117
    if-eqz p1, :cond_2

    .line 118
    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->accessTokenCache:Lcom/facebook/AccessTokenCache;

    invoke-virtual {v1, p1}, Lcom/facebook/AccessTokenCache;->save(Lcom/facebook/AccessToken;)V

    .line 124
    :cond_0
    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 125
    invoke-direct {p0, v0, p1}, Lcom/facebook/AccessTokenManager;->sendCurrentAccessTokenChangedBroadcast(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V

    .line 127
    :cond_1
    return-void

    .line 120
    :cond_2
    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->accessTokenCache:Lcom/facebook/AccessTokenCache;

    invoke-virtual {v1}, Lcom/facebook/AccessTokenCache;->clear()V

    goto :goto_0
.end method

.method private shouldExtendAccessToken()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 148
    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    if-eqz v1, :cond_1

    .line 153
    :cond_0
    :goto_0
    return v0

    .line 151
    :cond_1
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 153
    iget-object v2, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getSource()Lcom/facebook/AccessTokenSource;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/AccessTokenSource;->canExtendToken()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/facebook/AccessTokenManager;->lastAttemptedTokenExtendDate:Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x36ee80

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getLastRefresh()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x5265c00

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method final extendAccessTokenIfNeeded()V
    .locals 2

    .prologue
    .line 140
    invoke-direct {p0}, Lcom/facebook/AccessTokenManager;->shouldExtendAccessToken()Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    :goto_0
    return-void

    .line 143
    :cond_0
    new-instance v0, Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    invoke-direct {v0, p0, v1}, Lcom/facebook/AccessTokenManager$TokenRefreshRequest;-><init>(Lcom/facebook/AccessTokenManager;Lcom/facebook/AccessToken;)V

    iput-object v0, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    .line 144
    iget-object v0, p0, Lcom/facebook/AccessTokenManager;->currentTokenRefreshRequest:Lcom/facebook/AccessTokenManager$TokenRefreshRequest;

    invoke-virtual {v0}, Lcom/facebook/AccessTokenManager$TokenRefreshRequest;->bind()V

    goto :goto_0
.end method

.method final getCurrentAccessToken()Lcom/facebook/AccessToken;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/AccessTokenManager;->currentAccessToken:Lcom/facebook/AccessToken;

    return-object v0
.end method

.method final loadCurrentAccessToken()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 96
    iget-object v1, p0, Lcom/facebook/AccessTokenManager;->accessTokenCache:Lcom/facebook/AccessTokenCache;

    invoke-virtual {v1}, Lcom/facebook/AccessTokenCache;->load()Lcom/facebook/AccessToken;

    move-result-object v1

    .line 98
    if-eqz v1, :cond_0

    .line 99
    invoke-direct {p0, v1, v0}, Lcom/facebook/AccessTokenManager;->setCurrentAccessToken(Lcom/facebook/AccessToken;Z)V

    .line 100
    const/4 v0, 0x1

    .line 103
    :cond_0
    return v0
.end method

.method final setCurrentAccessToken(Lcom/facebook/AccessToken;)V
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/AccessTokenManager;->setCurrentAccessToken(Lcom/facebook/AccessToken;Z)V

    .line 108
    return-void
.end method
