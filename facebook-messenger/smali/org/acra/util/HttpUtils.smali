.class public Lorg/acra/util/HttpUtils;
.super Ljava/lang/Object;
.source "HttpUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static doPost(Ljava/util/Map;Ljava/net/URL;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;",
            "Ljava/net/URL;",
            ")V"
        }
    .end annotation

    .prologue
    .line 40
    const-string v0, "application/x-www-form-urlencoded"

    invoke-static {p0, p1, v0}, Lorg/acra/util/HttpUtils;->doPost(Ljava/util/Map;Ljava/net/URL;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method public static doPost(Ljava/util/Map;Ljava/net/URL;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;",
            "Ljava/net/URL;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 55
    const-string v0, "application/json"

    if-ne p2, v0, :cond_0

    .line 56
    invoke-static {p0}, Lorg/acra/util/HttpUtils;->encodeParametersJson(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 62
    :goto_0
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v1

    invoke-interface {v1}, Lorg/acra/reporter/ReportsCrashes;->checkSSLCertsOnCrashReport()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 63
    new-instance v1, Lorg/acra/util/SSLConnectionProvider;

    invoke-direct {v1}, Lorg/acra/util/SSLConnectionProvider;-><init>()V

    .line 68
    :goto_1
    new-instance v2, Lorg/acra/util/HttpRequest;

    invoke-direct {v2, v1}, Lorg/acra/util/HttpRequest;-><init>(Lorg/acra/util/HttpConnectionProvider;)V

    .line 69
    new-instance v1, Lorg/acra/util/ACRAResponse;

    invoke-direct {v1}, Lorg/acra/util/ACRAResponse;-><init>()V

    invoke-virtual {v2, p1, v0, v1, p2}, Lorg/acra/util/HttpRequest;->sendPost(Ljava/net/URL;Ljava/lang/String;Lorg/acra/util/ACRAResponse;Ljava/lang/String;)V

    .line 70
    return-void

    .line 58
    :cond_0
    invoke-static {p0}, Lorg/acra/util/HttpUtils;->encodeParametersFormUrlEncoded(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 65
    :cond_1
    new-instance v1, Lorg/acra/util/UnsafeConnectionProvider;

    invoke-direct {v1}, Lorg/acra/util/UnsafeConnectionProvider;-><init>()V

    goto :goto_1
.end method

.method public static encodeParametersFormUrlEncoded(Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const/16 v0, 0x26

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    :cond_0
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    const-string v0, ""

    .line 82
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x3d

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "UTF-8"

    invoke-static {v0, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encodeParametersJson(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<**>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 91
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 92
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
