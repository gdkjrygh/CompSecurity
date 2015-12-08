.class public Lcom/kik/cards/web/config/XDataPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/j/m;

.field private b:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lkik/a/j/m;)V
    .locals 3

    .prologue
    .line 45
    const-string v0, "XData"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    .line 50
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    const-string v1, "sticker_pack"

    const-class v2, Lcom/kik/n/a/f/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    const-string v1, "enc_messaging_priv_key"

    const-class v2, Lcom/kik/n/a/g/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    const-string v1, "messaging_pub_key"

    const-class v2, Lcom/kik/n/a/g/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 257
    if-nez p0, :cond_0

    .line 258
    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 305
    :goto_0
    return-object p0

    .line 260
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 261
    check-cast p0, Ljava/lang/String;

    goto :goto_0

    .line 263
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_5

    move-object v0, p0

    .line 264
    check-cast v0, Ljava/lang/Number;

    .line 266
    instance-of v1, p0, Ljava/lang/Float;

    if-nez v1, :cond_2

    instance-of v1, p0, Ljava/lang/Double;

    if-eqz v1, :cond_3

    .line 267
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    goto :goto_0

    .line 269
    :cond_3
    instance-of v1, p0, Ljava/lang/Long;

    if-eqz v1, :cond_4

    .line 270
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_0

    .line 272
    :cond_4
    instance-of v1, p0, Ljava/lang/Integer;

    if-eqz v1, :cond_9

    .line 273
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    .line 276
    :cond_5
    instance-of v0, p0, Lcom/b/a/b;

    if-eqz v0, :cond_6

    .line 277
    check-cast p0, Lcom/b/a/b;

    .line 278
    invoke-virtual {p0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 282
    :cond_6
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_8

    .line 283
    const/4 v0, 0x0

    .line 285
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 287
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 288
    invoke-static {v3}, Lcom/kik/cards/web/config/XDataPlugin;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 290
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 292
    add-int/lit8 v0, v0, 0x1

    .line 293
    goto :goto_1

    :cond_7
    move-object p0, v1

    .line 295
    goto :goto_0

    .line 297
    :cond_8
    instance-of v0, p0, Lcom/b/a/n;

    if-eqz v0, :cond_9

    .line 298
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 300
    check-cast p0, Lcom/b/a/n;

    invoke-static {p0, v0}, Lcom/kik/cards/web/config/XDataPlugin;->a(Lcom/b/a/n;Lorg/json/JSONObject;)V

    move-object p0, v0

    .line 302
    goto :goto_0

    .line 305
    :cond_9
    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Class;)Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Lcom/kik/cards/web/config/XDataPlugin;->a(Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Class;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Class;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 159
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 161
    const-string v0, "enc_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    check-cast p2, Lcom/kik/n/a/e/a;

    .line 164
    invoke-virtual {p2}, Lcom/kik/n/a/e/a;->b()Lcom/b/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-virtual {p2}, Lcom/kik/n/a/e/a;->c()Lcom/b/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/b/a/b;->c()[B

    move-result-object v3

    invoke-static {v3}, Lkik/android/util/cq;->a([B)Ljava/lang/String;

    move-result-object v3

    .line 168
    iget-object v4, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    invoke-interface {v4}, Lkik/a/j/m;->a()[B

    move-result-object v4

    .line 169
    invoke-static {p2, v4}, Lkik/a/h/o;->a(Lcom/kik/n/a/e/a;[B)[B

    move-result-object v4

    .line 172
    :try_start_0
    const-string v5, "keyId"

    invoke-virtual {v2, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    const-string v0, "iv"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    const-string v0, "encrypted"

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    :goto_0
    if-eqz p3, :cond_3

    .line 183
    invoke-static {v4, p3}, Lkik/a/h/g;->a([BLjava/lang/Class;)Lcom/b/a/n;

    move-result-object p2

    .line 190
    :cond_0
    :goto_1
    if-eqz p3, :cond_2

    .line 191
    if-nez p2, :cond_4

    move-object v0, v1

    .line 196
    :goto_2
    if-nez v0, :cond_1

    .line 197
    :try_start_1
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 200
    :cond_1
    const-string v1, "description"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    :cond_2
    :goto_3
    return-object v2

    .line 178
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_3
    move-object p2, v1

    .line 186
    goto :goto_1

    .line 191
    :cond_4
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p2, v0}, Lcom/kik/cards/web/config/XDataPlugin;->a(Lcom/b/a/n;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 202
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3
.end method

.method private static a(Lcom/b/a/n;Lorg/json/JSONObject;)V
    .locals 9

    .prologue
    .line 225
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 228
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v4, v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    aget-object v5, v3, v1

    .line 229
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    .line 230
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v7

    .line 234
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v7

    if-nez v7, :cond_0

    .line 238
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 244
    :try_start_0
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 249
    :goto_1
    invoke-static {v0}, Lcom/kik/cards/web/config/XDataPlugin;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 251
    invoke-virtual {p1, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v5

    goto :goto_1

    .line 253
    :cond_1
    return-void
.end method


# virtual methods
.method public deleteRecord(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 311
    const-string v0, "primaryKey"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 312
    const-string v1, "subKey"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 314
    iget-object v2, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v1, v3}, Lkik/a/j/m;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/config/e;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/config/e;-><init>(Lcom/kik/cards/web/config/XDataPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 328
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0
.end method

.method public getAllRecords(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 97
    const-string v0, "primaryKey"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 99
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 102
    const-string v1, "enc_"

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    const-class v1, Lcom/kik/n/a/e/a;

    .line 107
    :goto_0
    new-instance v3, Lcom/kik/cards/web/config/c;

    invoke-direct {v3, p0, v2, v0}, Lcom/kik/cards/web/config/c;-><init>(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Ljava/lang/Class;)V

    .line 115
    if-eqz v1, :cond_0

    .line 116
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    invoke-interface {v0, v2, v1}, Lkik/a/j/m;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    .line 117
    invoke-static {v3}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v1

    .line 119
    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/config/d;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/config/d;-><init>(Lcom/kik/cards/web/config/XDataPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 154
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0

    .line 151
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method public getPrimaryKeys(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 334
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    invoke-interface {v0}, Lkik/a/j/m;->b()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/config/f;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/config/f;-><init>(Lcom/kik/cards/web/config/XDataPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 352
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0
.end method

.method public getRecord(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 5
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 58
    const-string v0, "primaryKey"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 59
    const-string v0, "subKey"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 61
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 64
    const-string v1, "enc_"

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 66
    const-class v1, Lcom/kik/n/a/e/a;

    .line 69
    :goto_0
    new-instance v4, Lcom/kik/cards/web/config/b;

    invoke-direct {v4, p0, v2, v0, p1}, Lcom/kik/cards/web/config/b;-><init>(Lcom/kik/cards/web/config/XDataPlugin;Ljava/lang/String;Ljava/lang/Class;Lcom/kik/cards/web/plugin/a;)V

    .line 79
    if-eqz v1, :cond_1

    .line 80
    if-eqz v3, :cond_0

    .line 81
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    invoke-interface {v0, v2, v3, v1}, Lkik/a/j/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 91
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/config/XDataPlugin;->a:Lkik/a/j/m;

    invoke-interface {v0, v2, v1}, Lkik/a/j/m;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1

    .line 88
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method
