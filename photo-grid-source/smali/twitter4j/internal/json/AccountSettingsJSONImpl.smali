.class Ltwitter4j/internal/json/AccountSettingsJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/AccountSettings;


# static fields
.field private static final serialVersionUID:J = 0x6eca9ae824b25838L


# instance fields
.field private final ALWAYS_USE_HTTPS:Z

.field private final DISCOVERABLE_BY_EMAIL:Z

.field private final GEO_ENABLED:Z

.field private final LANGUAGE:Ljava/lang/String;

.field private final SCREEN_NAME:Ljava/lang/String;

.field private final SLEEP_END_TIME:Ljava/lang/String;

.field private final SLEEP_START_TIME:Ljava/lang/String;

.field private final SLEEP_TIME_ENABLED:Z

.field private final TIMEZONE:Ltwitter4j/TimeZone;

.field private final TREND_LOCATION:[Ltwitter4j/Location;


# direct methods
.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ltwitter4j/internal/json/AccountSettingsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V

    .line 77
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 79
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_0
    return-void
.end method

.method private constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 51
    :try_start_0
    const-string v1, "sleep_time"

    invoke-virtual {p2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    .line 52
    const-string v2, "enabled"

    invoke-static {v2, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v2

    iput-boolean v2, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_TIME_ENABLED:Z

    .line 53
    const-string v2, "start_time"

    invoke-virtual {v1, v2}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_START_TIME:Ljava/lang/String;

    .line 54
    const-string v2, "end_time"

    invoke-virtual {v1, v2}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_END_TIME:Ljava/lang/String;

    .line 55
    const-string v1, "trend_location"

    invoke-virtual {p2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/Location;

    iput-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TREND_LOCATION:[Ltwitter4j/Location;

    .line 64
    :cond_0
    const-string v0, "geo_enabled"

    invoke-static {v0, p2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->GEO_ENABLED:Z

    .line 65
    const-string v0, "language"

    invoke-virtual {p2, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->LANGUAGE:Ljava/lang/String;

    .line 66
    const-string v0, "always_use_https"

    invoke-static {v0, p2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->ALWAYS_USE_HTTPS:Z

    .line 67
    const-string v0, "discoverable_by_email"

    invoke-static {v0, p2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->DISCOVERABLE_BY_EMAIL:Z

    .line 68
    new-instance v0, Ltwitter4j/internal/json/TimeZoneJSONImpl;

    const-string v1, "time_zone"

    invoke-virtual {p2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/json/TimeZoneJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    iput-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TIMEZONE:Ltwitter4j/TimeZone;

    .line 69
    const-string v0, "screen_name"

    invoke-virtual {p2, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SCREEN_NAME:Ljava/lang/String;

    .line 72
    return-void

    .line 58
    :cond_1
    const-string v1, "trend_location"

    invoke-virtual {p2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [Ltwitter4j/Location;

    iput-object v2, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TREND_LOCATION:[Ltwitter4j/Location;

    .line 60
    :goto_0
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 61
    iget-object v2, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TREND_LOCATION:[Ltwitter4j/Location;

    new-instance v3, Ltwitter4j/internal/json/LocationJSONImpl;

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v4

    invoke-direct {v3, v4}, Ltwitter4j/internal/json/LocationJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v3, v2, v0
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Ltwitter4j/internal/json/AccountSettingsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V

    .line 85
    return-void
.end method


# virtual methods
.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->LANGUAGE:Ljava/lang/String;

    return-object v0
.end method

.method public getScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SCREEN_NAME:Ljava/lang/String;

    return-object v0
.end method

.method public getSleepEndTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_END_TIME:Ljava/lang/String;

    return-object v0
.end method

.method public getSleepStartTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_START_TIME:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeZone()Ltwitter4j/TimeZone;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TIMEZONE:Ltwitter4j/TimeZone;

    return-object v0
.end method

.method public getTrendLocations()[Ltwitter4j/Location;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->TREND_LOCATION:[Ltwitter4j/Location;

    return-object v0
.end method

.method public isAlwaysUseHttps()Z
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->ALWAYS_USE_HTTPS:Z

    return v0
.end method

.method public isDiscoverableByEmail()Z
    .locals 1

    .prologue
    .line 114
    iget-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->DISCOVERABLE_BY_EMAIL:Z

    return v0
.end method

.method public isGeoEnabled()Z
    .locals 1

    .prologue
    .line 109
    iget-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->GEO_ENABLED:Z

    return v0
.end method

.method public isSleepTimeEnabled()Z
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;->SLEEP_TIME_ENABLED:Z

    return v0
.end method
