.class final Lb/a/a/a/a/g/l;
.super Lb/a/a/a/a/b/a;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/g/x;


# direct methods
.method public constructor <init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;)V
    .locals 6

    .prologue
    .line 59
    sget v5, Lb/a/a/a/a/e/c;->a:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lb/a/a/a/a/g/l;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;I)V

    .line 60
    return-void
.end method

.method private constructor <init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;I)V
    .locals 0

    .prologue
    .line 67
    invoke-direct/range {p0 .. p5}, Lb/a/a/a/a/b/a;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;I)V

    .line 68
    return-void
.end method

.method private a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .prologue
    .line 123
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :goto_0
    return-object v0

    .line 125
    :catch_0
    move-exception v0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to parse settings JSON from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/a/a/a/g/l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 127
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lb/a/a/a/a/g/w;)Lorg/json/JSONObject;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 72
    .line 76
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v1, "build_version"

    iget-object v3, p1, Lb/a/a/a/a/g/w;->e:Ljava/lang/String;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "display_version"

    iget-object v3, p1, Lb/a/a/a/a/g/w;->d:Ljava/lang/String;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "source"

    iget v3, p1, Lb/a/a/a/a/g/w;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lb/a/a/a/a/g/w;->g:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "icon_hash"

    iget-object v3, p1, Lb/a/a/a/a/g/w;->g:Ljava/lang/String;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p1, Lb/a/a/a/a/g/w;->c:Ljava/lang/String;

    invoke-static {v1}, Lb/a/a/a/a/b/j;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "instance"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_1
    invoke-virtual {p0, v2}, Lb/a/a/a/a/g/l;->a(Ljava/util/Map;)Lb/a/a/a/a/e/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 78
    :try_start_1
    const-string v3, "X-CRASHLYTICS-API-KEY"

    iget-object v4, p1, Lb/a/a/a/a/g/w;->a:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v5, "android"

    invoke-virtual {v3, v4, v5}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-D"

    iget-object v5, p1, Lb/a/a/a/a/g/w;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v3

    const-string v4, "X-CRASHLYTICS-API-CLIENT-VERSION"

    iget-object v5, p0, Lb/a/a/a/a/g/l;->a:Lb/a/a/a/l;

    invoke-virtual {v5}, Lb/a/a/a/l;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v3

    const-string v4, "Accept"

    const-string v5, "application/json"

    invoke-virtual {v3, v4, v5}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v1

    .line 80
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Requesting settings from "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/a/a/a/g/l;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Settings query params were: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {v1}, Lb/a/a/a/a/e/d;->b()I

    move-result v2

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    const/16 v3, 0xc8

    if-eq v2, v3, :cond_2

    const/16 v3, 0xc9

    if-eq v2, v3, :cond_2

    const/16 v3, 0xca

    if-eq v2, v3, :cond_2

    const/16 v3, 0xcb

    if-ne v2, v3, :cond_4

    :cond_2
    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lb/a/a/a/a/e/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb/a/a/a/a/g/l;->a(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 85
    :goto_1
    if-eqz v1, :cond_3

    .line 86
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Settings request ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v1, v3}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    :cond_3
    return-object v0

    .line 83
    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    :cond_5
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to retrieve settings from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb/a/a/a/a/g/l;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v1, :cond_6

    .line 86
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Settings request ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v1, v3}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    throw v0

    .line 85
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2
.end method
