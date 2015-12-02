.class public Lcom/facebook/orca/g/w;
.super Ljava/lang/Object;
.source "DbSharesSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/g/w;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 39
    return-void
.end method

.method private a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/messages/model/share/ShareProperty;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/node/ArrayNode;"
        }
    .end annotation

    .prologue
    .line 101
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 102
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareProperty;

    .line 103
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->a(Lcom/facebook/messages/model/share/ShareProperty;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 105
    :cond_0
    return-object v1
.end method

.method private a(Lcom/facebook/messages/model/share/ShareMediaPhoto;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 3

    .prologue
    .line 79
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 80
    const-string v1, "aid"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 81
    const-string v1, "pid"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 82
    const-string v1, "fbid"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 83
    const-string v1, "owner"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 84
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->e()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->f()I

    move-result v1

    if-eqz v1, :cond_0

    .line 85
    const-string v1, "width"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 86
    const-string v1, "height"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaPhoto;->f()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 88
    :cond_0
    return-object v0
.end method

.method private a(Lcom/facebook/messages/model/share/ShareMediaVideo;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 3

    .prologue
    .line 92
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 93
    const-string v1, "display_url"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaVideo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 94
    const-string v1, "source_url"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaVideo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 95
    const-string v1, "source_type"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaVideo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 96
    const-string v1, "owner"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMediaVideo;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 97
    return-object v0
.end method

.method private a(Lcom/facebook/messages/model/share/ShareProperty;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 3

    .prologue
    .line 109
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 110
    const-string v1, "name"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareProperty;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 111
    const-string v1, "text"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareProperty;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 112
    const-string v1, "href"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareProperty;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 113
    return-object v0
.end method

.method private b(Ljava/util/List;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/node/ArrayNode;"
        }
    .end annotation

    .prologue
    .line 61
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 62
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareMedia;

    .line 63
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 64
    const-string v4, "type"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 65
    const-string v4, "src"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 66
    const-string v4, "href"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 67
    const-string v4, "alt"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 68
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->e()Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 69
    const-string v4, "photo"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->e()Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->a(Lcom/facebook/messages/model/share/ShareMediaPhoto;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 73
    :cond_0
    :goto_1
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->f()Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 71
    const-string v4, "video"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->f()Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->a(Lcom/facebook/messages/model/share/ShareMediaVideo;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_1

    .line 75
    :cond_2
    return-object v1
.end method

.method private c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/Share;
    .locals 2

    .prologue
    .line 130
    new-instance v0, Lcom/facebook/messages/model/share/b;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/b;-><init>()V

    .line 131
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 132
    const-string v1, "caption"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 133
    const-string v1, "description"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 134
    const-string v1, "media"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/w;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->a(Ljava/util/List;)Lcom/facebook/messages/model/share/b;

    .line 135
    const-string v1, "href"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 136
    const-string v1, "sticker_id"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->e(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 137
    const-string v1, "properties"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/w;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->b(Ljava/util/List;)Lcom/facebook/messages/model/share/b;

    .line 138
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/b;->h()Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMedia;
    .locals 2

    .prologue
    .line 151
    new-instance v0, Lcom/facebook/messages/model/share/d;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/d;-><init>()V

    .line 152
    const-string v1, "href"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 153
    const-string v1, "alt"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 154
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 155
    const-string v1, "src"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 156
    const-string v1, "photo"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 157
    const-string v1, "photo"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/g/w;->e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Lcom/facebook/messages/model/share/ShareMediaPhoto;)Lcom/facebook/messages/model/share/d;

    .line 161
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/d;->g()Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    return-object v0

    .line 158
    :cond_1
    const-string v1, "video"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 159
    const-string v1, "video"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/g/w;->f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Lcom/facebook/messages/model/share/ShareMediaVideo;)Lcom/facebook/messages/model/share/d;

    goto :goto_0
.end method

.method private e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaPhoto;
    .locals 2

    .prologue
    .line 165
    new-instance v0, Lcom/facebook/messages/model/share/f;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/f;-><init>()V

    .line 166
    const-string v1, "aid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->a(Ljava/lang/String;)V

    .line 167
    const-string v1, "pid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->b(Ljava/lang/String;)V

    .line 168
    const-string v1, "fbid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->c(Ljava/lang/String;)V

    .line 169
    const-string v1, "owner"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->d(Ljava/lang/String;)V

    .line 170
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "width"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 171
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->b(I)V

    .line 172
    const-string v1, "width"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->a(I)V

    .line 174
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/f;->g()Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaVideo;
    .locals 2

    .prologue
    .line 178
    new-instance v0, Lcom/facebook/messages/model/share/h;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/h;-><init>()V

    .line 179
    const-string v1, "display_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->a(Ljava/lang/String;)V

    .line 180
    const-string v1, "source_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->b(Ljava/lang/String;)V

    .line 181
    const-string v1, "owner"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->c(Ljava/lang/String;)V

    .line 182
    const-string v1, "source_type"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->d(Ljava/lang/String;)V

    .line 183
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/h;->e()Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;"
        }
    .end annotation

    .prologue
    .line 142
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 143
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 144
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    .line 145
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 117
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 126
    :goto_0
    return-object v0

    .line 121
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/g/w;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 124
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method a(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 42
    if-nez p1, :cond_0

    .line 43
    const/4 v0, 0x0

    .line 57
    :goto_0
    return-object v0

    .line 45
    :cond_0
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 46
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/Share;

    .line 47
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 48
    const-string v4, "name"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 49
    const-string v4, "caption"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 50
    const-string v4, "description"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 51
    const-string v4, "href"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 52
    const-string v4, "sticker_id"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 53
    const-string v4, "media"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->d()Lcom/google/common/a/es;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/facebook/orca/g/w;->b(Ljava/util/List;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 54
    const-string v4, "properties"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->g()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/w;->a(Ljava/util/Collection;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 55
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 187
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 188
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 189
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 190
    const-string v3, "name"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "text"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 191
    new-instance v3, Lcom/facebook/messages/model/share/j;

    invoke-direct {v3}, Lcom/facebook/messages/model/share/j;-><init>()V

    .line 192
    const-string v4, "name"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/share/j;->a(Ljava/lang/String;)V

    .line 193
    const-string v4, "text"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/share/j;->b(Ljava/lang/String;)V

    .line 194
    const-string v4, "href"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/facebook/messages/model/share/j;->c(Ljava/lang/String;)V

    .line 195
    invoke-virtual {v3}, Lcom/facebook/messages/model/share/j;->d()Lcom/facebook/messages/model/share/ShareProperty;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 198
    :cond_1
    return-object v1
.end method
