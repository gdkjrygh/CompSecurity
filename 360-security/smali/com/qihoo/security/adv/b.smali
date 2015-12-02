.class public Lcom/qihoo/security/adv/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/a;
    .locals 4

    .prologue
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    new-instance v0, Lcom/qihoo/security/adv/a;

    invoke-direct {v0}, Lcom/qihoo/security/adv/a;-><init>()V

    .line 24
    const-string/jumbo v1, "responseTime"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/adv/a;->a(J)V

    .line 25
    const-string/jumbo v1, "result"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a;->a(I)V

    .line 26
    const-string/jumbo v1, "expired"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/adv/a;->b(J)V

    .line 27
    const-string/jumbo v1, "data"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/adv/b;->a(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a;->a(Ljava/util/List;)V

    .line 28
    const-string/jumbo v1, "standby"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/adv/b;->c(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a;->b(Ljava/util/List;)V

    .line 30
    :cond_0
    return-object v0
.end method

.method public static a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    if-eqz p0, :cond_1

    .line 37
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 38
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 39
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/security/adv/b;->b(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/d;

    move-result-object v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 45
    :cond_1
    return-object v1
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/d;
    .locals 2

    .prologue
    .line 49
    const/4 v0, 0x0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    new-instance v0, Lcom/qihoo/security/adv/d;

    invoke-direct {v0}, Lcom/qihoo/security/adv/d;-><init>()V

    .line 52
    const-string/jumbo v1, "pid"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->b(I)V

    .line 53
    const-string/jumbo v1, "tp"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->c(I)V

    .line 54
    const-string/jumbo v1, "state"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->d(I)V

    .line 55
    const-string/jumbo v1, "p1"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->a(Ljava/lang/String;)V

    .line 56
    const-string/jumbo v1, "p2"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->b(Ljava/lang/String;)V

    .line 57
    const-string/jumbo v1, "source"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    const-string/jumbo v1, "source"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/adv/b;->b(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->a(Ljava/util/List;)V

    .line 60
    :cond_0
    const-string/jumbo v1, "ad"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 61
    const-string/jumbo v1, "ad"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/adv/b;->d(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->a(Lcom/qihoo/security/adv/e;)V

    .line 64
    :cond_1
    return-object v0
.end method

.method public static b(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/adv/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    if-eqz p0, :cond_1

    .line 71
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 72
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 73
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/security/adv/b;->c(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/c;

    move-result-object v3

    .line 74
    if-eqz v3, :cond_0

    .line 75
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 79
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 80
    return-object v1
.end method

.method public static c(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/c;
    .locals 2

    .prologue
    .line 84
    const/4 v0, 0x0

    .line 85
    if-eqz p0, :cond_0

    .line 86
    new-instance v0, Lcom/qihoo/security/adv/c;

    invoke-direct {v0}, Lcom/qihoo/security/adv/c;-><init>()V

    .line 87
    const-string/jumbo v1, "key"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/c;->a(Ljava/lang/String;)V

    .line 88
    const-string/jumbo v1, "level"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/c;->a(I)V

    .line 89
    const-string/jumbo v1, "sid"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/c;->b(I)V

    .line 91
    :cond_0
    return-object v0
.end method

.method public static c(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 95
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    if-eqz p0, :cond_1

    .line 98
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 99
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 100
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/security/adv/b;->d(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/e;

    move-result-object v3

    .line 101
    if-eqz v3, :cond_0

    .line 102
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :cond_1
    return-object v1
.end method

.method public static d(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/e;
    .locals 4

    .prologue
    .line 110
    const/4 v0, 0x0

    .line 111
    if-eqz p0, :cond_0

    .line 112
    new-instance v0, Lcom/qihoo/security/adv/e;

    invoke-direct {v0}, Lcom/qihoo/security/adv/e;-><init>()V

    .line 113
    const-string/jumbo v1, "adid"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->c(Ljava/lang/String;)V

    .line 114
    const-string/jumbo v1, "title"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->d(Ljava/lang/String;)V

    .line 115
    const-string/jumbo v1, "des"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->e(Ljava/lang/String;)V

    .line 116
    const-string/jumbo v1, "pkg"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->f(Ljava/lang/String;)V

    .line 117
    const-string/jumbo v1, "size"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->g(Ljava/lang/String;)V

    .line 118
    const-string/jumbo v1, "sc"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->h(Ljava/lang/String;)V

    .line 119
    const-string/jumbo v1, "icon"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->i(Ljava/lang/String;)V

    .line 121
    const-string/jumbo v1, "creatives"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 122
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->j(Ljava/lang/String;)V

    .line 123
    const-string/jumbo v1, "dev"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->k(Ljava/lang/String;)V

    .line 124
    const-string/jumbo v1, "openType"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->a(I)V

    .line 125
    const-string/jumbo v1, "openUrl"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->l(Ljava/lang/String;)V

    .line 126
    const-string/jumbo v1, "installs"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->m(Ljava/lang/String;)V

    .line 127
    const-string/jumbo v1, "impr"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->n(Ljava/lang/String;)V

    .line 128
    const-string/jumbo v1, "c1"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->o(Ljava/lang/String;)V

    .line 129
    const-string/jumbo v1, "c2"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->p(Ljava/lang/String;)V

    .line 130
    const-string/jumbo v1, "c3"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->q(Ljava/lang/String;)V

    .line 131
    const-string/jumbo v1, "btndesc"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->b(Ljava/lang/String;)V

    .line 132
    const-string/jumbo v1, "btnname"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/e;->a(Ljava/lang/String;)V

    .line 134
    :cond_0
    return-object v0
.end method
