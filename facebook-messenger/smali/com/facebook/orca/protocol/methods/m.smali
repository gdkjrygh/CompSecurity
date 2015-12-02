.class public Lcom/facebook/orca/protocol/methods/m;
.super Ljava/lang/Object;
.source "FetchStickerPacksMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchStickerPacksParams;",
        "Lcom/facebook/orca/server/FetchStickerPacksResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/protocol/methods/m;

    sput-object v0, Lcom/facebook/orca/protocol/methods/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 136
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 143
    if-nez p1, :cond_1

    .line 147
    :cond_0
    :goto_0
    return-object v0

    .line 146
    :cond_1
    const-string v1, "uri"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 147
    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchStickerPacksParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 55
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 57
    const-string v0, "viewer(){sticker_store{%s{nodes{id,name,description,thumbnail_image,is_featured,is_promoted,price,preview_image,tray_button{selected.scale(2)},stickers{nodes{id,image,animated_image.media_type(image/webp)}}}}}}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchStickerPacksParams;->a()Lcom/facebook/orca/server/v;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/server/v;->getFieldName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 60
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "q"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchUserStickerPacks"

    const-string v2, "GET"

    const-string v3, "graphql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 31
    check-cast p1, Lcom/facebook/orca/server/FetchStickerPacksParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/m;->a(Lcom/facebook/orca/server/FetchStickerPacksParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchStickerPacksParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 22

    .prologue
    .line 70
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 71
    const-string v4, "viewer"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    const-string v4, "sticker_store"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/server/FetchStickerPacksParams;->a()Lcom/facebook/orca/server/v;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/orca/server/v;->getFieldName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    const-string v4, "nodes"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v15

    .line 78
    new-instance v16, Lcom/google/common/a/et;

    invoke-direct/range {v16 .. v16}, Lcom/google/common/a/et;-><init>()V

    .line 79
    const/4 v3, 0x0

    move v14, v3

    :goto_0
    invoke-virtual {v15}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    if-ge v14, v3, :cond_1

    .line 80
    invoke-virtual {v15, v14}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 82
    :try_start_0
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 83
    const-string v5, "name"

    invoke-virtual {v3, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 84
    const-string v6, "description"

    invoke-virtual {v3, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 85
    const-string v7, "thumbnail_image"

    invoke-virtual {v3, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v7

    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/facebook/orca/protocol/methods/m;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v7

    .line 86
    const-string v8, "preview_image"

    invoke-virtual {v3, v8}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v8

    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/facebook/orca/protocol/methods/m;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v8

    .line 87
    const-string v9, "tray_button"

    invoke-virtual {v3, v9}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    const-string v10, "selected"

    invoke-virtual {v9, v10}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/facebook/orca/protocol/methods/m;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v9

    .line 88
    const-string v10, "price"

    invoke-virtual {v3, v10}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt(I)I

    move-result v10

    .line 89
    const-string v11, "is_featured"

    invoke-virtual {v3, v11}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v11

    .line 90
    const-string v12, "is_promoted"

    invoke-virtual {v3, v12}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v12

    .line 91
    const-string v13, "stickers"

    invoke-virtual {v3, v13}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    const-string v13, "nodes"

    invoke-virtual {v3, v13}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v17

    .line 94
    new-instance v18, Lcom/google/common/a/et;

    invoke-direct/range {v18 .. v18}, Lcom/google/common/a/et;-><init>()V

    .line 95
    const/4 v3, 0x0

    move v13, v3

    :goto_1
    invoke-virtual/range {v17 .. v17}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    if-ge v13, v3, :cond_0

    .line 96
    move-object/from16 v0, v17

    invoke-virtual {v0, v13}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 98
    :try_start_1
    const-string v19, "id"

    move-object/from16 v0, v19

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v19

    .line 99
    const-string v20, "image"

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v20

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Lcom/facebook/orca/protocol/methods/m;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v20

    .line 100
    const-string v21, "animated_image"

    move-object/from16 v0, v21

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/facebook/orca/protocol/methods/m;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Landroid/net/Uri;

    move-result-object v3

    .line 101
    new-instance v21, Lcom/facebook/orca/stickers/Sticker;

    move-object/from16 v0, v21

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/stickers/Sticker;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V

    move-object/from16 v0, v18

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    :goto_2
    add-int/lit8 v3, v13, 0x1

    move v13, v3

    goto :goto_1

    .line 102
    :catch_0
    move-exception v3

    .line 103
    :try_start_2
    sget-object v19, Lcom/facebook/orca/protocol/methods/m;->a:Ljava/lang/Class;

    const-string v20, "Error parsing sticker node"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 119
    :catch_1
    move-exception v3

    .line 120
    sget-object v4, Lcom/facebook/orca/protocol/methods/m;->a:Ljava/lang/Class;

    const-string v5, "Error parsing sticker pack node"

    invoke-static {v4, v5, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    :goto_3
    add-int/lit8 v3, v14, 0x1

    move v14, v3

    goto/16 :goto_0

    .line 107
    :cond_0
    :try_start_3
    new-instance v3, Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual/range {v18 .. v18}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v13

    invoke-direct/range {v3 .. v13}, Lcom/facebook/orca/stickers/StickerPack;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;IZZLjava/util/List;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    .line 124
    :cond_1
    new-instance v3, Lcom/facebook/orca/server/FetchStickerPacksResult;

    sget-object v4, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual/range {v16 .. v16}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V

    return-object v3
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    check-cast p1, Lcom/facebook/orca/server/FetchStickerPacksParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/m;->a(Lcom/facebook/orca/server/FetchStickerPacksParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v0

    return-object v0
.end method
