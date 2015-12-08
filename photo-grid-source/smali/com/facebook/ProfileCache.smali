.class final Lcom/facebook/ProfileCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CACHED_PROFILE_KEY:Ljava/lang/String; = "com.facebook.ProfileManager.CachedProfile"

.field static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "com.facebook.AccessTokenManager.SharedPreferences"


# instance fields
.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.facebook.AccessTokenManager.SharedPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ProfileCache;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 42
    return-void
.end method


# virtual methods
.method final clear()V
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/ProfileCache;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.facebook.ProfileManager.CachedProfile"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 73
    return-void
.end method

.method final load()Lcom/facebook/Profile;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 45
    iget-object v0, p0, Lcom/facebook/ProfileCache;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v2, "com.facebook.ProfileManager.CachedProfile"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 48
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 49
    new-instance v0, Lcom/facebook/Profile;

    invoke-direct {v0, v2}, Lcom/facebook/Profile;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method final save(Lcom/facebook/Profile;)V
    .locals 3

    .prologue
    .line 58
    const-string v0, "profile"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lcom/facebook/Profile;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    iget-object v1, p0, Lcom/facebook/ProfileCache;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "com.facebook.ProfileManager.CachedProfile"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 66
    :cond_0
    return-void
.end method
