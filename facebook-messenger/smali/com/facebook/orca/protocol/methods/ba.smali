.class public Lcom/facebook/orca/protocol/methods/ba;
.super Ljava/lang/Object;
.source "ShareDeserializer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMedia;
    .locals 2

    .prologue
    .line 79
    new-instance v0, Lcom/facebook/messages/model/share/d;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/d;-><init>()V

    .line 80
    const-string v1, "href"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 81
    const-string v1, "alt"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 82
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 83
    const-string v1, "src"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    .line 84
    const-string v1, "photo"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 85
    const-string v1, "photo"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/protocol/methods/ba;->f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Lcom/facebook/messages/model/share/ShareMediaPhoto;)Lcom/facebook/messages/model/share/d;

    .line 89
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/d;->g()Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    return-object v0

    .line 86
    :cond_1
    const-string v1, "video"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 87
    const-string v1, "video"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/protocol/methods/ba;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Lcom/facebook/messages/model/share/ShareMediaVideo;)Lcom/facebook/messages/model/share/d;

    goto :goto_0
.end method

.method private f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaPhoto;
    .locals 2

    .prologue
    .line 93
    new-instance v0, Lcom/facebook/messages/model/share/f;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/f;-><init>()V

    .line 94
    const-string v1, "aid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->a(Ljava/lang/String;)V

    .line 95
    const-string v1, "pid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->b(Ljava/lang/String;)V

    .line 96
    const-string v1, "fbid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->c(Ljava/lang/String;)V

    .line 97
    const-string v1, "owner"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->d(Ljava/lang/String;)V

    .line 98
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "width"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 99
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->b(I)V

    .line 100
    const-string v1, "width"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/f;->a(I)V

    .line 102
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/f;->g()Lcom/facebook/messages/model/share/ShareMediaPhoto;

    move-result-object v0

    return-object v0
.end method

.method private g(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMediaVideo;
    .locals 2

    .prologue
    .line 106
    new-instance v0, Lcom/facebook/messages/model/share/h;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/h;-><init>()V

    .line 107
    const-string v1, "display_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->a(Ljava/lang/String;)V

    .line 108
    const-string v1, "source_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->b(Ljava/lang/String;)V

    .line 109
    const-string v1, "owner"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->c(Ljava/lang/String;)V

    .line 110
    const-string v1, "source_type"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/h;->d(Ljava/lang/String;)V

    .line 111
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
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 30
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 31
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/methods/ba;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/Share;
    .locals 2

    .prologue
    .line 39
    new-instance v0, Lcom/facebook/messages/model/share/b;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/b;-><init>()V

    .line 40
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 41
    const-string v1, "caption"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 42
    const-string v1, "description"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 43
    const-string v1, "href"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 44
    const-string v1, "sticker_id"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->e(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    .line 46
    const-string v1, "media"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    const-string v1, "media"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/methods/ba;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->a(Ljava/util/List;)Lcom/facebook/messages/model/share/b;

    .line 49
    :cond_0
    const-string v1, "properties"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 50
    const-string v1, "properties"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/methods/ba;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/b;->b(Ljava/util/List;)Lcom/facebook/messages/model/share/b;

    .line 52
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/b;->h()Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    return-object v0
.end method

.method c(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;
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
    .line 56
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 57
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 58
    const-string v3, "name"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "text"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 59
    new-instance v3, Lcom/facebook/messages/model/share/j;

    invoke-direct {v3}, Lcom/facebook/messages/model/share/j;-><init>()V

    .line 60
    const-string v4, "name"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/share/j;->a(Ljava/lang/String;)V

    .line 61
    const-string v4, "text"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/messages/model/share/j;->b(Ljava/lang/String;)V

    .line 62
    const-string v4, "href"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/messages/model/share/j;->c(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v3}, Lcom/facebook/messages/model/share/j;->d()Lcom/facebook/messages/model/share/ShareProperty;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_1
    return-object v1
.end method

.method d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
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
    .line 70
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 71
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 72
    invoke-direct {p0, v0}, Lcom/facebook/orca/protocol/methods/ba;->e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
