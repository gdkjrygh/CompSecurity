.class Lcom/crashlytics/android/SettingsController;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/crashlytics/android/aw;

.field private final b:Lcom/crashlytics/android/av;

.field private final c:Lcom/crashlytics/android/ac;

.field private final d:Lcom/crashlytics/android/m;

.field private final e:Lcom/crashlytics/android/ay;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/aw;Lcom/crashlytics/android/ac;Lcom/crashlytics/android/av;Lcom/crashlytics/android/m;Lcom/crashlytics/android/ay;)V
    .locals 0
    .param p1, "settingsRequest"    # Lcom/crashlytics/android/aw;
    .param p2, "currentTimeProvider"    # Lcom/crashlytics/android/ac;
    .param p3, "settingsJsonTransform"    # Lcom/crashlytics/android/av;
    .param p4, "cachedSettingsIo"    # Lcom/crashlytics/android/m;
    .param p5, "settingsSpiCall"    # Lcom/crashlytics/android/ay;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/crashlytics/android/SettingsController;->a:Lcom/crashlytics/android/aw;

    .line 29
    iput-object p2, p0, Lcom/crashlytics/android/SettingsController;->c:Lcom/crashlytics/android/ac;

    .line 30
    iput-object p3, p0, Lcom/crashlytics/android/SettingsController;->b:Lcom/crashlytics/android/av;

    .line 31
    iput-object p4, p0, Lcom/crashlytics/android/SettingsController;->d:Lcom/crashlytics/android/m;

    .line 32
    iput-object p5, p0, Lcom/crashlytics/android/SettingsController;->e:Lcom/crashlytics/android/ay;

    .line 33
    return-void
.end method

.method private b(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 68
    .line 71
    :try_start_0
    sget-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->SKIP_CACHE_LOOKUP:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/SettingsController$CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 72
    iget-object v0, p0, Lcom/crashlytics/android/SettingsController;->d:Lcom/crashlytics/android/m;

    invoke-virtual {v0}, Lcom/crashlytics/android/m;->a()Lorg/json/JSONObject;

    move-result-object v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    iget-object v0, p0, Lcom/crashlytics/android/SettingsController;->b:Lcom/crashlytics/android/av;

    iget-object v3, p0, Lcom/crashlytics/android/SettingsController;->c:Lcom/crashlytics/android/ac;

    invoke-virtual {v0, v3, v2}, Lcom/crashlytics/android/av;->a(Lcom/crashlytics/android/ac;Lorg/json/JSONObject;)Lcom/crashlytics/android/au;

    move-result-object v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Loaded cached settings: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 79
    iget-object v2, p0, Lcom/crashlytics/android/SettingsController;->c:Lcom/crashlytics/android/ac;

    invoke-virtual {v2}, Lcom/crashlytics/android/ac;->a()J

    move-result-wide v2

    .line 81
    sget-object v4, Lcom/crashlytics/android/SettingsController$CacheBehavior;->IGNORE_CACHE_EXPIRATION:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-virtual {v4, p1}, Lcom/crashlytics/android/SettingsController$CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0}, Lcom/crashlytics/android/au;->a()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    cmp-long v2, v4, v2

    if-gez v2, :cond_1

    const/4 v2, 0x1

    :goto_0
    if-nez v2, :cond_2

    .line 83
    :cond_0
    :try_start_1
    const-string v1, "Returning cached settings."

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    :goto_1
    return-object v0

    .line 81
    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    .line 85
    :cond_2
    :try_start_2
    const-string v0, "Cached settings have expired."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    :cond_3
    :goto_2
    move-object v0, v1

    .line 96
    goto :goto_1

    .line 88
    :cond_4
    const-string v0, "Failed to transform cached settings data."

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_1

    .line 91
    :cond_5
    const-string v0, "No cached settings data found."

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    .line 94
    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 95
    :goto_3
    const-string v2, "Failed to get cached settings"

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 94
    :catch_1
    move-exception v1

    goto :goto_3
.end method


# virtual methods
.method public a()Lcom/crashlytics/android/au;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->USE_CACHE:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/SettingsController;->a(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;
    .locals 6

    .prologue
    .line 40
    const/4 v1, 0x0

    .line 43
    :try_start_0
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/Crashlytics;->getDebugMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-direct {p0, p1}, Lcom/crashlytics/android/SettingsController;->b(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 47
    :cond_0
    if-nez v1, :cond_1

    .line 48
    :try_start_1
    iget-object v0, p0, Lcom/crashlytics/android/SettingsController;->e:Lcom/crashlytics/android/ay;

    iget-object v2, p0, Lcom/crashlytics/android/SettingsController;->a:Lcom/crashlytics/android/aw;

    invoke-interface {v0, v2}, Lcom/crashlytics/android/ay;->a(Lcom/crashlytics/android/aw;)Lorg/json/JSONObject;

    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    iget-object v2, p0, Lcom/crashlytics/android/SettingsController;->b:Lcom/crashlytics/android/av;

    iget-object v3, p0, Lcom/crashlytics/android/SettingsController;->c:Lcom/crashlytics/android/ac;

    invoke-virtual {v2, v3, v0}, Lcom/crashlytics/android/av;->a(Lcom/crashlytics/android/ac;Lorg/json/JSONObject;)Lcom/crashlytics/android/au;

    move-result-object v1

    .line 52
    iget-object v2, p0, Lcom/crashlytics/android/SettingsController;->d:Lcom/crashlytics/android/m;

    invoke-virtual {v1}, Lcom/crashlytics/android/au;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4, v0}, Lcom/crashlytics/android/m;->a(JLorg/json/JSONObject;)V

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Loaded settings: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    move-object v0, v1

    .line 58
    if-nez v0, :cond_2

    .line 59
    :try_start_2
    sget-object v1, Lcom/crashlytics/android/SettingsController$CacheBehavior;->IGNORE_CACHE_EXPIRATION:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-direct {p0, v1}, Lcom/crashlytics/android/SettingsController;->b(Lcom/crashlytics/android/SettingsController$CacheBehavior;)Lcom/crashlytics/android/au;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 64
    :cond_2
    :goto_0
    return-object v0

    .line 61
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    .line 62
    :goto_1
    const-string v2, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."

    invoke-static {v2, v1}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 61
    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1
.end method
