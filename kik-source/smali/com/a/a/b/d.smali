.class final Lcom/a/a/b/d;
.super Lb/a/a/a/a/b/a;
.source "SourceFile"


# instance fields
.field private final b:Lcom/a/a/b/f;


# direct methods
.method public constructor <init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;Lcom/a/a/b/f;)V
    .locals 6

    .prologue
    .line 29
    sget v5, Lb/a/a/a/a/e/c;->a:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lb/a/a/a/a/b/a;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;I)V

    .line 30
    iput-object p5, p0, Lcom/a/a/b/d;->b:Lcom/a/a/b/f;

    .line 31
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/a/a/b/b;)Lcom/a/a/b/e;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 35
    .line 38
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "build_version"

    iget-object v2, p3, Lcom/a/a/b/b;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "display_version"

    iget-object v2, p3, Lcom/a/a/b/b;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "instance"

    iget-object v2, p3, Lcom/a/a/b/b;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "source"

    const-string v2, "3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    invoke-virtual {p0, v0}, Lcom/a/a/b/d;->a(Ljava/util/Map;)Lb/a/a/a/a/e/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 40
    :try_start_1
    const-string v2, "Accept"

    const-string v3, "application/json"

    invoke-virtual {v1, v2, v3}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "User-Agent"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Crashlytics Android SDK/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/a/a/b/d;->a:Lb/a/a/a/l;

    invoke-virtual {v5}, Lb/a/a/a/l;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    const-string v4, "bca6990fc3c15a8105800c0673517a4b579634a1"

    invoke-virtual {v2, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v4, "android"

    invoke-virtual {v2, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "X-CRASHLYTICS-API-CLIENT-VERSION"

    iget-object v4, p0, Lcom/a/a/b/d;->a:Lb/a/a/a/l;

    invoke-virtual {v4}, Lb/a/a/a/l;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "X-CRASHLYTICS-API-KEY"

    invoke-virtual {v2, v3, p1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v2

    const-string v3, "X-CRASHLYTICS-D"

    invoke-virtual {v2, v3, p2}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v8

    .line 42
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Checking for updates from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/a/a/b/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Checking for updates query params are: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    const/16 v0, 0xc8

    invoke-virtual {v8}, Lb/a/a/a/a/e/d;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    .line 46
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 47
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {v8}, Lb/a/a/a/a/e/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 48
    const-string v1, "url"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "version_string"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "build_version"

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "display_version"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "identifier"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "instance_identifier"

    const/4 v9, 0x0

    invoke-virtual {v0, v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Lcom/a/a/b/e;

    invoke-direct/range {v0 .. v6}, Lcom/a/a/b/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 56
    if-eqz v8, :cond_0

    .line 57
    const-string v1, "X-REQUEST-ID"

    invoke-virtual {v8, v1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 62
    :cond_0
    :goto_1
    return-object v0

    .line 45
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 50
    :cond_2
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v1, "Beta"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Checking for updates failed. Response code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lb/a/a/a/a/e/d;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 56
    if-eqz v8, :cond_3

    .line 57
    const-string v0, "X-REQUEST-ID"

    invoke-virtual {v8, v0}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    :cond_3
    :goto_2
    move-object v0, v7

    .line 62
    goto :goto_1

    .line 53
    :catch_0
    move-exception v0

    move-object v1, v7

    .line 54
    :goto_3
    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Beta"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error while checking for updates from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/a/a/b/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    const-string v0, "X-REQUEST-ID"

    invoke-virtual {v1, v0}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_2

    .line 56
    :catchall_0
    move-exception v0

    move-object v8, v7

    :goto_4
    if-eqz v8, :cond_4

    .line 57
    const-string v1, "X-REQUEST-ID"

    invoke-virtual {v8, v1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 59
    :cond_4
    throw v0

    .line 56
    :catchall_1
    move-exception v0

    move-object v8, v1

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_4

    .line 53
    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v1, v8

    goto :goto_3
.end method
