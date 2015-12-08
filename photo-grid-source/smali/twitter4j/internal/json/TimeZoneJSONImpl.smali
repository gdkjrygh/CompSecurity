.class public Ltwitter4j/internal/json/TimeZoneJSONImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/TimeZone;


# instance fields
.field private final NAME:Ljava/lang/String;

.field private final TZINFO_NAME:Ljava/lang/String;

.field private final UTC_OFFSET:I


# direct methods
.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    :try_start_0
    const-string v0, "utc_offset"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->UTC_OFFSET:I

    .line 37
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->NAME:Ljava/lang/String;

    .line 38
    const-string v0, "tzinfo_name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->TZINFO_NAME:Ljava/lang/String;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-void

    .line 39
    :catch_0
    move-exception v0

    .line 40
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->NAME:Ljava/lang/String;

    return-object v0
.end method

.method public tzinfoName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->TZINFO_NAME:Ljava/lang/String;

    return-object v0
.end method

.method public utcOffset()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Ltwitter4j/internal/json/TimeZoneJSONImpl;->UTC_OFFSET:I

    return v0
.end method
