.class public Lcom/facebook/orca/stickers/k;
.super Ljava/lang/Object;
.source "StickerPackSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/orca/stickers/k;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 30
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 129
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 130
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 131
    const-string v3, "id"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 132
    const-string v4, "uri"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/facebook/orca/stickers/k;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v4

    .line 133
    const-string v5, "animated_uri"

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/stickers/k;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v2

    .line 134
    new-instance v5, Lcom/facebook/orca/stickers/Sticker;

    invoke-direct {v5, v3, v4, v2}, Lcom/facebook/orca/stickers/Sticker;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 136
    :cond_0
    return-object v1
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 140
    invoke-static {p1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 141
    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Ljava/util/List;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/node/ArrayNode;"
        }
    .end annotation

    .prologue
    .line 64
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/Sticker;

    .line 66
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 67
    const-string v4, "id"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/Sticker;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 68
    const-string v4, "uri"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/Sticker;->b()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/facebook/orca/stickers/k;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 69
    const-string v4, "animated_uri"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/Sticker;->c()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/k;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 70
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 72
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;"
        }
    .end annotation

    .prologue
    .line 81
    invoke-static/range {p1 .. p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    const/4 v1, 0x0

    .line 114
    :goto_0
    return-object v1

    .line 85
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/stickers/k;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-object/from16 v0, p1

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v13

    .line 88
    new-instance v14, Lcom/google/common/a/et;

    invoke-direct {v14}, Lcom/google/common/a/et;-><init>()V

    .line 89
    const/4 v1, 0x0

    move v12, v1

    :goto_1
    invoke-virtual {v13}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    if-ge v12, v1, :cond_1

    .line 90
    invoke-virtual {v13, v12}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v11

    .line 91
    const-string v1, "id"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 92
    const-string v1, "name"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 93
    const-string v1, "description"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 94
    const-string v1, "thumbnailUri"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 95
    const-string v1, "previewUri"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 96
    const-string v1, "tabIconUri"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 97
    const-string v1, "price"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt(I)I

    move-result v8

    .line 98
    const-string v1, "isFeatured"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v9

    .line 99
    const-string v1, "isPromoted"

    invoke-virtual {v11, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const/4 v10, 0x0

    invoke-virtual {v1, v10}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v10

    .line 101
    new-instance v1, Lcom/facebook/orca/stickers/StickerPack;

    const-string v15, "stickers"

    invoke-virtual {v11, v15}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v11

    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/facebook/orca/stickers/k;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Lcom/facebook/orca/stickers/StickerPack;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;IZZLjava/util/List;)V

    invoke-virtual {v14, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 89
    add-int/lit8 v1, v12, 0x1

    move v12, v1

    goto/16 :goto_1

    .line 114
    :cond_1
    invoke-virtual {v14}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    goto/16 :goto_0
.end method

.method public a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 33
    if-nez p1, :cond_0

    .line 34
    const/4 v0, 0x0

    .line 52
    :goto_0
    return-object v0

    .line 37
    :cond_0
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 38
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 39
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 40
    const-string v4, "id"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 41
    const-string v4, "name"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 42
    const-string v4, "description"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 43
    const-string v4, "thumbnailUri"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->d()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/facebook/orca/stickers/k;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 44
    const-string v4, "previewUri"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->e()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/facebook/orca/stickers/k;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 45
    const-string v4, "tabIconUri"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->f()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/facebook/orca/stickers/k;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 46
    const-string v4, "price"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->g()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 47
    const-string v4, "isFeatured"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->h()Z

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 48
    const-string v4, "isPromoted"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->i()Z

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 49
    const-string v4, "stickers"

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/stickers/k;->c(Ljava/util/List;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 50
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public b(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 56
    if-nez p1, :cond_0

    .line 57
    const/4 v0, 0x0

    .line 60
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/k;->c(Ljava/util/List;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 119
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const/4 v0, 0x0

    .line 124
    :goto_0
    return-object v0

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/k;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Lcom/facebook/orca/stickers/k;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method
