.class public Lcom/EnterpriseMobileBanking/AppFeatures;
.super Ljava/lang/Object;
.source "AppFeatures.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AppFeatures"

.field private static final instance:Lcom/EnterpriseMobileBanking/AppFeatures;

.field private static platformFeatures:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    new-instance v0, Lcom/EnterpriseMobileBanking/AppFeatures;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/AppFeatures;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/AppFeatures;->instance:Lcom/EnterpriseMobileBanking/AppFeatures;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/EnterpriseMobileBanking/AppFeatures;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/EnterpriseMobileBanking/AppFeatures;->instance:Lcom/EnterpriseMobileBanking/AppFeatures;

    return-object v0
.end method

.method public static declared-synchronized setPlatformFeatures(Lorg/json/JSONObject;)V
    .locals 2
    .param p0, "j"    # Lorg/json/JSONObject;

    .prologue
    .line 64
    const-class v0, Lcom/EnterpriseMobileBanking/AppFeatures;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/EnterpriseMobileBanking/AppFeatures;->platformFeatures:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    monitor-exit v0

    return-void

    .line 64
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public getPlatformFeature(Ljava/lang/String;)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 74
    sget-object v1, Lcom/EnterpriseMobileBanking/AppFeatures;->platformFeatures:Lorg/json/JSONObject;

    if-nez v1, :cond_0

    .line 78
    :goto_0
    return v0

    :cond_0
    sget-object v1, Lcom/EnterpriseMobileBanking/AppFeatures;->platformFeatures:Lorg/json/JSONObject;

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public getPlatformFeatures()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/EnterpriseMobileBanking/AppFeatures;->platformFeatures:Lorg/json/JSONObject;

    return-object v0
.end method

.method public isFeatureEnabled(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "featureId"    # Ljava/lang/String;

    .prologue
    .line 31
    const/4 v0, 0x0

    .line 34
    .local v0, "bResult":Z
    :try_start_0
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 35
    .local v2, "preferences":Landroid/content/SharedPreferences;
    const/4 v3, 0x0

    invoke-interface {v2, p2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 41
    .end local v2    # "preferences":Landroid/content/SharedPreferences;
    :goto_0
    return v0

    .line 37
    :catch_0
    move-exception v1

    .line 39
    .local v1, "e":Ljava/lang/Exception;
    const-string v3, "AppFeatures"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isFeatureEnabled: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setFeatureEnabled(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "b"    # Z

    .prologue
    .line 49
    :try_start_0
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 50
    .local v2, "preferences":Landroid/content/SharedPreferences;
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 51
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 52
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    .end local v2    # "preferences":Landroid/content/SharedPreferences;
    :goto_0
    return-void

    .line 54
    :catch_0
    move-exception v0

    .line 56
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "AppFeatures"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setFeatureEnabled: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
