.class final Lcom/crashlytics/android/ae;
.super Lcom/crashlytics/android/b;
.source "SourceFile"

# interfaces
.implements Lcom/crashlytics/android/ay;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/crashlytics/android/d;->a:Lcom/crashlytics/android/d;

    invoke-direct {p0, p1, p2, v0}, Lcom/crashlytics/android/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/aj;)V

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lcom/crashlytics/android/aw;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 48
    .line 52
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "build_version"

    iget-object v3, p1, Lcom/crashlytics/android/aw;->e:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "display_version"

    iget-object v3, p1, Lcom/crashlytics/android/aw;->d:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "source"

    iget v3, p1, Lcom/crashlytics/android/aw;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "icon_hash"

    iget-object v3, p1, Lcom/crashlytics/android/aw;->g:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p1, Lcom/crashlytics/android/aw;->c:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/aB;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "instance"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_0
    invoke-virtual {p0, v0}, Lcom/crashlytics/android/ae;->a(Ljava/util/Map;)Lcom/crashlytics/android/HttpRequest;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 54
    :try_start_1
    const-string v3, "X-CRASHLYTICS-API-KEY"

    iget-object v4, p1, Lcom/crashlytics/android/aw;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-CLIENT-TYPE"

    const-string v5, "android"

    invoke-virtual {v3, v4, v5}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-D"

    iget-object v5, p1, Lcom/crashlytics/android/aw;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-API-CLIENT-VERSION"

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getCrashlyticsVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v3

    const-string v4, "Accept"

    const-string v5, "application/json"

    invoke-virtual {v3, v4, v5}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v2

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Requesting settings from "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/crashlytics/android/ae;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Settings query params were: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 59
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {v2}, Lcom/crashlytics/android/HttpRequest;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-eqz v2, :cond_1

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Settings request ID: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v2, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 68
    :cond_1
    :goto_0
    return-object v0

    .line 60
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 61
    :goto_1
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to retrieve settings from "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/crashlytics/android/ae;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    if-eqz v2, :cond_3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Settings request ID: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v2, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_2

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Settings request ID: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v2, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    :cond_2
    throw v0

    .line 63
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 60
    :catch_1
    move-exception v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method
