.class public Lcom/facebook/user/ac;
.super Ljava/lang/Object;
.source "UserSerialization.java"


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 371
    const-string v0, "^https://"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/ac;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lcom/facebook/user/ad;

    invoke-direct {v0, p0}, Lcom/facebook/user/ad;-><init>(Lcom/facebook/user/ac;)V

    iput-object v0, p0, Lcom/facebook/user/ac;->b:Ljava/lang/ThreadLocal;

    .line 49
    new-instance v0, Lcom/facebook/user/ae;

    invoke-direct {v0, p0}, Lcom/facebook/user/ae;-><init>(Lcom/facebook/user/ac;)V

    iput-object v0, p0, Lcom/facebook/user/ac;->c:Ljava/lang/ThreadLocal;

    .line 57
    iput-object p1, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 58
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 374
    if-nez p1, :cond_1

    .line 375
    const/4 p1, 0x0

    .line 381
    :cond_0
    :goto_0
    return-object p1

    .line 377
    :cond_1
    sget-object v0, Lcom/facebook/user/ac;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 378
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 379
    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/PicCropInfo;
    .locals 9

    .prologue
    .line 201
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "width"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "height"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "left"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "right"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "top"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "bottom"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/user/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 205
    const-string v0, "width"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v2

    .line 206
    const-string v0, "height"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v3

    .line 207
    const-string v0, "left"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v4

    double-to-float v4, v4

    .line 208
    const-string v0, "right"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v5

    double-to-float v6, v5

    .line 209
    const-string v0, "top"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v7

    double-to-float v5, v7

    .line 210
    const-string v0, "bottom"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v7

    double-to-float v7, v7

    .line 211
    new-instance v0, Lcom/facebook/user/PicCropInfo;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/user/PicCropInfo;-><init>(Ljava/lang/String;IIFFFF)V

    .line 213
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/User;
    .locals 3

    .prologue
    .line 147
    :try_start_0
    iget-object v0, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 148
    invoke-virtual {p0, p1, v0}, Lcom/facebook/user/ac;->b(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/User;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 149
    :catch_0
    move-exception v0

    .line 150
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected serialization exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Lcom/google/common/a/es;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/node/ArrayNode;"
        }
    .end annotation

    .prologue
    .line 257
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 258
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserEmailAddress;

    .line 259
    invoke-virtual {v0}, Lcom/facebook/user/UserEmailAddress;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 261
    :cond_0
    return-object v1
.end method

.method public a(Lcom/facebook/user/LastActive;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 6

    .prologue
    .line 409
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 410
    const-string v1, "time"

    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 411
    const-string v1, "active"

    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->b()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 412
    return-object v0
.end method

.method public a(Lcom/facebook/user/MobileAppData;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 4

    .prologue
    .line 416
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 417
    const-string v1, "has_push"

    iget-object v2, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/user/MobileAppData;->a()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-static {v3}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->valueToTree(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 419
    const-string v1, "is_installed"

    iget-object v2, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/user/MobileAppData;->b()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-static {v3}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->valueToTree(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 421
    const-string v1, "last_used"

    iget-object v2, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/user/MobileAppData;->c()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-static {v3}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->valueToTree(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 423
    return-object v0
.end method

.method public a(Lcom/facebook/user/PicCropInfo;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 3

    .prologue
    .line 217
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 218
    const-string v1, "uri"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 219
    const-string v1, "width"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 220
    const-string v1, "height"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 221
    const-string v1, "left"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->e()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;F)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 222
    const-string v1, "right"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->g()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;F)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 223
    const-string v1, "top"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->f()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;F)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 224
    const-string v1, "bottom"

    invoke-virtual {p1}, Lcom/facebook/user/PicCropInfo;->h()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;F)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 225
    return-object v0
.end method

.method public a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/n;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 62
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 63
    invoke-virtual {p0, p1, v0}, Lcom/facebook/user/ac;->b(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/user/User;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 155
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 156
    const-string v0, "uid"

    invoke-virtual {p1}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 157
    invoke-virtual {p1}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/facebook/user/Name;)V

    .line 158
    invoke-virtual {p1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    const-string v0, "emails"

    invoke-virtual {p1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/facebook/user/ac;->a(Lcom/google/common/a/es;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 161
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 162
    const-string v0, "phones"

    invoke-virtual {p1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/facebook/user/ac;->b(Lcom/google/common/a/es;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 164
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/user/User;->p()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 165
    const-string v0, "pic_big"

    invoke-virtual {p1}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 167
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 168
    const-string v0, "pic_square"

    invoke-virtual {p1}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 170
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 171
    const-string v0, "pic_crop"

    invoke-virtual {p1}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/PicCropInfo;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 173
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/user/User;->w()F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_5

    .line 174
    const-string v0, "rank"

    invoke-virtual {p1}, Lcom/facebook/user/User;->w()F

    move-result v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;F)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 176
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/user/User;->x()Lcom/facebook/common/w/q;

    move-result-object v0

    sget-object v3, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-eq v0, v3, :cond_6

    .line 177
    const-string v3, "is_pushable"

    invoke-virtual {p1}, Lcom/facebook/user/User;->x()Lcom/facebook/common/w/q;

    move-result-object v0

    sget-object v4, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v4, :cond_d

    move v0, v1

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 179
    :cond_6
    invoke-virtual {p1}, Lcom/facebook/user/User;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 180
    const-string v0, "is_employee"

    invoke-virtual {v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 182
    :cond_7
    invoke-virtual {p1}, Lcom/facebook/user/User;->z()Lcom/facebook/user/Birthday;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 183
    invoke-virtual {p1}, Lcom/facebook/user/User;->z()Lcom/facebook/user/Birthday;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/facebook/user/Birthday;)V

    .line 185
    :cond_8
    invoke-virtual {p1}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 186
    const-string v0, "last_active"

    invoke-virtual {p1}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/LastActive;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 188
    :cond_9
    invoke-virtual {p1}, Lcom/facebook/user/User;->D()Lcom/facebook/user/MobileAppData;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 189
    const-string v0, "mobile_app_data"

    invoke-virtual {p1}, Lcom/facebook/user/User;->D()Lcom/facebook/user/MobileAppData;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/MobileAppData;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 191
    :cond_a
    invoke-virtual {p1}, Lcom/facebook/user/User;->E()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 192
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/facebook/user/User;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 194
    :cond_b
    invoke-virtual {p1}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 195
    const-string v0, "auth_token"

    invoke-virtual {p1}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 197
    :cond_c
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 177
    :cond_d
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/facebook/user/Birthday;)V
    .locals 4

    .prologue
    .line 358
    const/4 v0, 0x0

    .line 359
    invoke-virtual {p2}, Lcom/facebook/user/Birthday;->b()I

    move-result v1

    .line 360
    invoke-virtual {p2}, Lcom/facebook/user/Birthday;->a()I

    move-result v2

    .line 361
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 362
    new-instance v0, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 363
    invoke-virtual {p2}, Lcom/facebook/user/Birthday;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 364
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/user/Birthday;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 368
    :cond_0
    const-string v1, "birthday_date"

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 369
    return-void
.end method

.method public a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/facebook/user/Name;)V
    .locals 2

    .prologue
    .line 245
    invoke-virtual {p2}, Lcom/facebook/user/Name;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    const-string v0, "first_name"

    invoke-virtual {p2}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 248
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/user/Name;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    const-string v0, "last_name"

    invoke-virtual {p2}, Lcom/facebook/user/Name;->getLastName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 251
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/user/Name;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 252
    const-string v0, "name"

    invoke-virtual {p2}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 254
    :cond_2
    return-void
.end method

.method public b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Name;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 229
    .line 232
    const-string v0, "first_name"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    const-string v0, "first_name"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 235
    :goto_0
    const-string v2, "last_name"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 236
    const-string v2, "last_name"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 238
    :goto_1
    const-string v3, "name"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 239
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 241
    :cond_0
    new-instance v3, Lcom/facebook/user/Name;

    invoke-direct {v3, v0, v2, v1}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_1
    move-object v2, v1

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public b(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/User;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 69
    new-instance v1, Lcom/facebook/user/o;

    invoke-direct {v1}, Lcom/facebook/user/o;-><init>()V

    .line 71
    const-string v0, "uid"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Missing id field on profile"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 72
    const-string v0, "uid"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 73
    if-nez v0, :cond_0

    .line 74
    const-string v0, "id"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 76
    :cond_0
    invoke-virtual {v1, p1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    .line 78
    const-string v0, "contact_email"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 80
    new-instance v0, Lcom/facebook/user/UserEmailAddress;

    const-string v2, "contact_email"

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Lcom/facebook/user/UserEmailAddress;-><init>(Ljava/lang/String;I)V

    .line 82
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Ljava/util/List;)Lcom/facebook/user/o;

    .line 88
    :cond_1
    :goto_0
    const-string v0, "phones"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    const-string v0, "phones"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/user/ac;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->b(Ljava/util/List;)Lcom/facebook/user/o;

    .line 92
    :cond_2
    invoke-virtual {p0, p2}, Lcom/facebook/user/ac;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    .line 93
    invoke-virtual {p0, p2}, Lcom/facebook/user/ac;->e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Birthday;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Birthday;)Lcom/facebook/user/o;

    .line 95
    const-string v0, "pic_square"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    const-string v0, "pic_square"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/user/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 99
    :cond_3
    const-string v0, "pic_big"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 100
    const-string v0, "pic_big"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/user/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->c(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 102
    :cond_4
    const-string v0, "pic_crop"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 103
    const-string v0, "pic_crop"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/user/ac;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;

    .line 105
    :cond_5
    const-string v0, "rank"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 106
    const-string v0, "rank"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v2

    double-to-float v0, v2

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(F)Lcom/facebook/user/o;

    .line 108
    :cond_6
    const-string v0, "is_pushable"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 109
    const-string v0, "is_pushable"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    :goto_1
    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/common/w/q;)Lcom/facebook/user/o;

    .line 114
    :goto_2
    const-string v0, "affiliations"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 116
    const-string v0, "affiliations"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 118
    const-string v3, "nid"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v3

    const-wide/32 v5, 0x30186a0

    cmp-long v0, v3, v5

    if-nez v0, :cond_7

    .line 119
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Z)V

    goto :goto_3

    .line 83
    :cond_8
    const-string v0, "emails"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    const-string v0, "emails"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/user/ac;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Ljava/util/List;)Lcom/facebook/user/o;

    goto/16 :goto_0

    .line 109
    :cond_9
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_1

    .line 112
    :cond_a
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/common/w/q;)Lcom/facebook/user/o;

    goto :goto_2

    .line 124
    :cond_b
    const-string v0, "is_employee"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Z)V

    .line 126
    :cond_c
    const-string v0, "last_active"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 127
    const-string v0, "last_active"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 128
    invoke-virtual {p0, v0}, Lcom/facebook/user/ac;->f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/LastActive;)Lcom/facebook/user/o;

    .line 131
    :cond_d
    const-string v0, "mobile_app_data"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 132
    const-string v0, "mobile_app_data"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 133
    invoke-virtual {p0, v0}, Lcom/facebook/user/ac;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/MobileAppData;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/MobileAppData;)Lcom/facebook/user/o;

    .line 136
    :cond_e
    const-string v0, "type"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 137
    const-string v0, "type"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->f(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 139
    :cond_f
    const-string v0, "auth_token"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 140
    const-string v0, "auth_token"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->g(Ljava/lang/String;)V

    .line 142
    :cond_10
    invoke-virtual {v1}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/common/a/es;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/JsonNode;"
        }
    .end annotation

    .prologue
    .line 313
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 314
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserPhoneNumber;

    .line 315
    new-instance v4, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v4, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 316
    const-string v1, "full_number"

    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 317
    const-string v1, "display_number"

    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 318
    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->g()Lcom/facebook/common/w/q;

    move-result-object v1

    sget-object v5, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-eq v1, v5, :cond_0

    .line 319
    const-string v5, "is_verified"

    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->g()Lcom/facebook/common/w/q;

    move-result-object v1

    sget-object v6, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v1, v6, :cond_1

    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v4, v5, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 321
    :cond_0
    const-string v1, "android_type"

    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->f()I

    move-result v0

    invoke-virtual {v4, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 322
    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 319
    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    .line 324
    :cond_2
    return-object v2
.end method

.method public c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation

    .prologue
    .line 265
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 266
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 267
    new-instance v3, Lcom/facebook/user/UserEmailAddress;

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lcom/facebook/user/UserEmailAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;"
        }
    .end annotation

    .prologue
    .line 273
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v5

    .line 274
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 277
    const-string v1, "full_number"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 279
    const-string v1, "full_number"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 280
    const-string v1, "display_number"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 288
    :goto_1
    sget-object v3, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 289
    const-string v4, "is_verified"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 290
    const-string v3, "is_verified"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    .line 292
    :cond_0
    :goto_2
    const/4 v4, 0x0

    .line 293
    const-string v7, "android_type"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 294
    const-string v4, "android_type"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    .line 307
    :goto_3
    new-instance v4, Lcom/facebook/user/UserPhoneNumber;

    invoke-direct {v4, v1, v2, v0, v3}, Lcom/facebook/user/UserPhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/common/w/q;)V

    invoke-virtual {v5, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 283
    :cond_1
    const-string v1, "country_code"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 284
    const-string v2, "number"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 285
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "+"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .line 286
    goto :goto_1

    .line 290
    :cond_2
    sget-object v3, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_2

    .line 296
    :cond_3
    const-string v7, "type"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 297
    const-string v7, "type"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 298
    const-string v7, "other_phone"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 299
    const/4 v0, 0x7

    goto :goto_3

    .line 300
    :cond_4
    const-string v7, "cell"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 301
    const/4 v0, 0x2

    goto :goto_3

    .line 309
    :cond_5
    invoke-virtual {v5}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    :cond_6
    move v0, v4

    goto :goto_3
.end method

.method public e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Birthday;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 329
    .line 332
    const-string v0, "birthday_date"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 333
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v2

    if-nez v2, :cond_2

    .line 334
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v3

    .line 338
    iget-object v0, p0, Lcom/facebook/user/ac;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    new-instance v2, Ljava/text/ParsePosition;

    invoke-direct {v2, v1}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-virtual {v0, v3, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 339
    const/4 v0, 0x1

    move-object v4, v2

    .line 345
    :goto_0
    if-eqz v4, :cond_2

    .line 346
    invoke-virtual {v4}, Ljava/util/Date;->getMonth()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    .line 347
    invoke-virtual {v4}, Ljava/util/Date;->getDate()I

    move-result v2

    .line 348
    if-eqz v0, :cond_1

    .line 349
    invoke-virtual {v4}, Ljava/util/Date;->getYear()I

    move-result v0

    add-int/lit16 v0, v0, 0x76c

    move v1, v2

    move v2, v3

    .line 354
    :goto_1
    new-instance v3, Lcom/facebook/user/Birthday;

    invoke-direct {v3, v2, v1, v0}, Lcom/facebook/user/Birthday;-><init>(III)V

    return-object v3

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/ac;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    new-instance v2, Ljava/text/ParsePosition;

    invoke-direct {v2, v1}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-virtual {v0, v3, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v0

    move-object v4, v0

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v1

    move v1, v2

    move v2, v3

    goto :goto_1

    :cond_2
    move v0, v1

    move v2, v1

    goto :goto_1
.end method

.method public f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/LastActive;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 391
    if-nez p1, :cond_1

    .line 397
    :cond_0
    :goto_0
    return-object v0

    .line 394
    :cond_1
    const-string v1, "time"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "active"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 397
    new-instance v0, Lcom/facebook/user/LastActive;

    const-string v1, "time"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    const-string v3, "active"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/user/LastActive;-><init>(JZ)V

    goto :goto_0
.end method

.method public g(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/MobileAppData;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 427
    if-nez p1, :cond_1

    .line 453
    :cond_0
    :goto_0
    return-object v0

    .line 431
    :cond_1
    const-string v1, "has_push"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "is_installed"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "last_used"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 438
    :try_start_0
    iget-object v0, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-string v1, "has_push"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/user/af;

    invoke-direct {v2, p0}, Lcom/facebook/user/af;-><init>(Lcom/facebook/user/ac;)V

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/core/type/TypeReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 440
    iget-object v1, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-string v2, "is_installed"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/user/ag;

    invoke-direct {v3, p0}, Lcom/facebook/user/ag;-><init>(Lcom/facebook/user/ac;)V

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/core/type/TypeReference;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 442
    iget-object v2, p0, Lcom/facebook/user/ac;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-string v3, "last_used"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/facebook/user/ah;

    invoke-direct {v4, p0}, Lcom/facebook/user/ah;-><init>(Lcom/facebook/user/ac;)V

    invoke-virtual {v2, v3, v4}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/core/type/TypeReference;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .line 446
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 447
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 448
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    .line 449
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/fasterxml/jackson/databind/JsonMappingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 457
    :catch_0
    move-exception v0

    .line 458
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected serialization exception with mobile_app_data"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 453
    :cond_3
    :try_start_1
    new-instance v3, Lcom/facebook/user/MobileAppData;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    invoke-static {v1}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v1

    invoke-static {v2}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v2

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/user/MobileAppData;-><init>(Lcom/google/common/a/ev;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)V
    :try_end_1
    .catch Lcom/fasterxml/jackson/core/JsonParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/fasterxml/jackson/databind/JsonMappingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v0, v3

    goto/16 :goto_0

    .line 459
    :catch_1
    move-exception v0

    .line 460
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected serialization exception with mobile_app_data"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 461
    :catch_2
    move-exception v0

    .line 462
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected serialization exception with mobile_app_data"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
