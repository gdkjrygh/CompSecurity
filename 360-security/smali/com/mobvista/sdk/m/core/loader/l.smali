.class public final Lcom/mobvista/sdk/m/core/loader/l;
.super Lcom/mobvista/sdk/m/a/a/c/a;
.source "360Security"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/c/a;-><init>()V

    .line 41
    return-void
.end method

.method private static a(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/m;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 111
    :try_start_0
    const-string/jumbo v0, "UTF-8"

    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 112
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    .line 114
    const-string/jumbo v0, "ProfileLoader"

    invoke-static {v0, v2}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 117
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/m;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/m;-><init>()V

    .line 120
    const-string/jumbo v2, "status"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/mobvista/sdk/m/core/loader/m;->a(I)V

    .line 121
    const-string/jumbo v2, "msg"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mobvista/sdk/m/core/loader/m;->a(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/loader/m;->a()I

    move-result v2

    sget v4, Lcom/mobvista/sdk/m/core/loader/m;->a:I

    if-ne v2, v4, :cond_b

    .line 125
    const-string/jumbo v2, "data"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 126
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v1, v4, :cond_a

    .line 128
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 129
    new-instance v5, Lcom/mobvista/sdk/m/core/entity/b;

    invoke-direct {v5}, Lcom/mobvista/sdk/m/core/entity/b;-><init>()V

    .line 130
    const-string/jumbo v6, "name"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 131
    const-string/jumbo v6, "name"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->a(Ljava/lang/String;)V

    .line 133
    :cond_0
    const-string/jumbo v6, "ver"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 134
    const-string/jumbo v6, "ver"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->a(I)V

    .line 136
    :cond_1
    const-string/jumbo v6, "url"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 137
    const-string/jumbo v6, "url"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->b(Ljava/lang/String;)V

    .line 139
    :cond_2
    const-string/jumbo v6, "check"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 140
    const-string/jumbo v6, "check"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->c(Ljava/lang/String;)V

    .line 142
    :cond_3
    const-string/jumbo v6, "state"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 143
    const-string/jumbo v6, "state"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->b(I)V

    .line 145
    :cond_4
    const-string/jumbo v6, "entryClass"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 146
    const-string/jumbo v6, "entryClass"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->e(Ljava/lang/String;)V

    .line 148
    :cond_5
    const-string/jumbo v6, "appID"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 149
    const-string/jumbo v6, "appID"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->d(Ljava/lang/String;)V

    .line 151
    :cond_6
    const-string/jumbo v6, "pubID"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 152
    const-string/jumbo v6, "pubID"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->g(Ljava/lang/String;)V

    .line 154
    :cond_7
    const-string/jumbo v6, "modPn"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 155
    const-string/jumbo v6, "modPn"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/core/entity/b;->f(Ljava/lang/String;)V

    .line 157
    :cond_8
    const-string/jumbo v6, "weight"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 158
    const-string/jumbo v6, "weight"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 159
    invoke-static {v4}, Lcom/mobvista/sdk/m/core/loader/l;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v4

    .line 160
    invoke-virtual {v5, v4}, Lcom/mobvista/sdk/m/core/entity/b;->a(Ljava/util/Map;)V

    .line 162
    :cond_9
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 164
    :cond_a
    invoke-virtual {v0, v3}, Lcom/mobvista/sdk/m/core/loader/m;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 173
    :cond_b
    :goto_1
    return-object v0

    .line 168
    :catch_0
    move-exception v0

    .line 169
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 173
    :goto_2
    const/4 v0, 0x0

    goto :goto_1

    .line 170
    :catch_1
    move-exception v0

    .line 171
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_2
.end method

.method private a([B)Lcom/mobvista/sdk/m/core/loader/m;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 90
    if-eqz p1, :cond_0

    array-length v1, p1

    if-lez v1, :cond_0

    .line 91
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    .line 92
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 97
    :cond_0
    :goto_0
    return-object v0

    .line 95
    :cond_1
    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/l;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/loader/m;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 6

    .prologue
    .line 179
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 181
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 182
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 184
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 186
    new-instance v4, Lcom/mobvista/sdk/m/core/entity/c;

    invoke-direct {v4}, Lcom/mobvista/sdk/m/core/entity/c;-><init>()V

    .line 187
    invoke-virtual {v4, v0}, Lcom/mobvista/sdk/m/core/entity/c;->a(Ljava/lang/String;)V

    .line 188
    const-string/jumbo v5, "unitID"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/mobvista/sdk/m/core/entity/c;->b(Ljava/lang/String;)V

    .line 189
    const-string/jumbo v5, "weight"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/mobvista/sdk/m/core/entity/c;->a(I)V

    .line 190
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 192
    :cond_0
    return-object v1
.end method

.method private b()Ljava/lang/String;
    .locals 5

    .prologue
    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 204
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 206
    :try_start_0
    const-string/jumbo v2, "appID"

    sget-object v3, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    const-string/jumbo v2, "unit_id"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 208
    const-string/jumbo v2, "appVer"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    const-string/jumbo v2, "pID"

    const-string/jumbo v3, "-"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    const-string/jumbo v2, "sdkVer"

    const-string/jumbo v3, "6.1.2 M"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 211
    const-string/jumbo v2, "pkName"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    const-string/jumbo v2, "appName"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    const-string/jumbo v2, "aID"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 214
    const-string/jumbo v2, "pl"

    const-string/jumbo v3, "android"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 215
    const-string/jumbo v2, "gmsVer"

    const-string/jumbo v3, "0"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    const-string/jumbo v2, "imei"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    const-string/jumbo v2, "imsi"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 218
    const-string/jumbo v2, "mac"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 219
    const-string/jumbo v2, "cl"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    const-string/jumbo v2, "osVer"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    const-string/jumbo v2, "brand"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    const-string/jumbo v2, "model"

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    const-string/jumbo v2, "res"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/f/b;->k(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/f/b;->l(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    const-string/jumbo v2, "net"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->q(Landroid/content/Context;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    const-string/jumbo v2, "ts"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "6.1.2 M"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/f/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 229
    const-string/jumbo v2, "s"

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v1

    .line 232
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    :goto_0
    return-object v0

    .line 235
    :catch_0
    move-exception v0

    .line 236
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 238
    const-string/jumbo v0, ""

    goto :goto_0
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/util/Map;[B)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/core/loader/l;->a([B)Lcom/mobvista/sdk/m/core/loader/m;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 58
    const-string/jumbo v0, ""

    .line 60
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "?d="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/l;->b()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 64
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "http://net.rayjump.com/mdt/get_profile.php"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 61
    :catch_0
    move-exception v1

    .line 62
    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/l;->c:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/l;->d:Ljava/lang/String;

    .line 46
    return-void
.end method
