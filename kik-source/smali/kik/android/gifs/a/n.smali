.class public final Lkik/android/gifs/a/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    sput-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->b:Lkik/android/gifs/a/f$a;

    const-string v2, "webm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->a:Lkik/android/gifs/a/f$a;

    const-string v2, "mp4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->i:Lkik/android/gifs/a/f$a;

    const-string v2, "gif"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->f:Lkik/android/gifs/a/f$a;

    const-string v2, "nanogif"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->e:Lkik/android/gifs/a/f$a;

    const-string v2, "tinygif"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->c:Lkik/android/gifs/a/f$a;

    const-string v2, "tinywebm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->g:Lkik/android/gifs/a/f$a;

    const-string v2, "tinymp4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a/f$a;->d:Lkik/android/gifs/a/f$a;

    const-string v2, "nanowebm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    return-void
.end method

.method protected static a(Lorg/json/JSONObject;)Lkik/android/gifs/a/d;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 38
    :try_start_0
    const-string v1, "next"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    const-string v3, "results"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 42
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 43
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 44
    const-string v5, "media"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 45
    const-string v6, "id"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-static {v5}, Lkik/android/gifs/a/n;->c(Lorg/json/JSONObject;)Lkik/android/gifs/a/f;

    move-result-object v5

    .line 48
    invoke-virtual {v5, v4}, Lkik/android/gifs/a/f;->a(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v5}, Lkik/android/gifs/a/f;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 50
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 53
    :cond_1
    new-instance v0, Lkik/android/gifs/a/d;

    invoke-direct {v0, v2, v1}, Lkik/android/gifs/a/d;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;Lorg/json/JSONObject;)Lkik/android/gifs/a/e;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 77
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 79
    const-string v2, "url"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 80
    const-string v3, "null"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 93
    :goto_0
    return-object v0

    .line 84
    :cond_0
    const-string v3, "dims"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 85
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getInt(I)I

    move-result v4

    .line 86
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    .line 88
    const-string v5, "preview"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 90
    new-instance v1, Lkik/android/gifs/a/e;

    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v4, v3}, Landroid/graphics/Point;-><init>(II)V

    invoke-direct {v1, v2, v6, v5}, Lkik/android/gifs/a/e;-><init>(Ljava/lang/String;Landroid/graphics/Point;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 93
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected static b(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 6

    .prologue
    .line 124
    :try_start_0
    const-string v0, "tags"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 128
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 129
    const-string v4, "character"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 130
    const-string v5, "name"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 131
    new-instance v5, Lkik/android/gifs/a/a;

    invoke-direct {v5, v4, v3}, Lkik/android/gifs/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 136
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method private static c(Lorg/json/JSONObject;)Lkik/android/gifs/a/f;
    .locals 4

    .prologue
    .line 62
    new-instance v2, Lkik/android/gifs/a/f;

    invoke-direct {v2}, Lkik/android/gifs/a/f;-><init>()V

    .line 64
    sget-object v0, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/f$a;

    .line 65
    sget-object v1, Lkik/android/gifs/a/n;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, p0}, Lkik/android/gifs/a/n;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lkik/android/gifs/a/e;

    move-result-object v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    invoke-virtual {v2, v0, v1}, Lkik/android/gifs/a/f;->a(Lkik/android/gifs/a/f$a;Lkik/android/gifs/a/e;)V

    goto :goto_0

    .line 71
    :cond_1
    return-object v2
.end method
