.class public Lcom/facebook/contacts/c/a;
.super Ljava/lang/Object;
.source "GraphQLContactDeserializer.java"


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
    .line 29
    const-class v0, Lcom/facebook/contacts/c/a;

    sput-object v0, Lcom/facebook/contacts/c/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/b;
    .locals 10

    .prologue
    .line 32
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Server sent a null response for a contact"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_1
    const-string v0, "structured_name"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/c/a;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Name;

    move-result-object v0

    .line 37
    const-string v1, "phonetic_name"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/c/a;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Name;

    move-result-object v1

    .line 39
    invoke-static {}, Lcom/facebook/contacts/models/Contact;->newBuilder()Lcom/facebook/contacts/models/b;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/contacts/models/b;->a(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v2

    const-string v3, "graph_api_write_id"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/contacts/models/b;->c(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/models/b;->a(Lcom/facebook/user/Name;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/models/b;->b(Lcom/facebook/user/Name;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    const-string v1, "small_picture_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/models/b;->e(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    const-string v1, "big_picture_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/models/b;->f(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    const-string v1, "huge_picture_url"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/models/b;->g(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v6

    .line 48
    const-string v0, "represented_profile"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 55
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Server didn\'t include data for represented profile."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_2
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_7

    .line 58
    const-string v0, "id"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->b(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    .line 59
    const-string v0, "rank"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->e(Lcom/fasterxml/jackson/databind/JsonNode;)D

    move-result-wide v2

    double-to-float v0, v2

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(F)Lcom/facebook/contacts/models/b;

    .line 60
    const-string v0, "can_message"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(Z)Lcom/facebook/contacts/models/b;

    .line 61
    const-string v0, "is_mobile_pushable"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    .line 63
    if-eqz v0, :cond_4

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    :goto_0
    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(Lcom/facebook/common/w/q;)Lcom/facebook/contacts/models/b;

    .line 64
    const-string v0, "is_memorialized"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    .line 65
    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->b(Z)Lcom/facebook/contacts/models/b;

    .line 66
    const-string v0, "timeline_cover_photo"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_3

    .line 67
    const-string v0, "timeline_cover_photo"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->i(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    .line 70
    :cond_3
    const-string v0, "__type__"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/c/a;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/a/a;

    move-result-object v0

    .line 72
    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(Lcom/facebook/contacts/models/a/a;)Lcom/facebook/contacts/models/b;

    .line 74
    const-string v0, "name_search_tokens"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 77
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    .line 78
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v3, :cond_5

    .line 79
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 78
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 63
    :cond_4
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->b(Lcom/google/common/a/es;)V

    .line 87
    :cond_6
    :goto_2
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v7

    .line 89
    const-string v0, "phones"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 90
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v1

    if-nez v1, :cond_9

    .line 91
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->elements()Ljava/util/Iterator;

    move-result-object v8

    .line 92
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 93
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 94
    const-string v0, "primary_field"

    invoke-virtual {v5, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 95
    const-string v0, "phone"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    .line 96
    new-instance v0, Lcom/facebook/contacts/models/ContactPhone;

    const-string v1, "id"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "label"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "display_number"

    invoke-virtual {v4, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    const-string v9, "universal_number"

    invoke-virtual {v4, v9}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    const-string v9, "is_verified"

    invoke-virtual {v5, v9}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/models/ContactPhone;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 102
    invoke-virtual {v7, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_3

    .line 84
    :cond_7
    sget-object v0, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(Lcom/facebook/contacts/models/a/a;)Lcom/facebook/contacts/models/b;

    goto :goto_2

    .line 105
    :cond_8
    invoke-virtual {v7}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/contacts/models/b;->a(Lcom/google/common/a/es;)Lcom/facebook/contacts/models/b;

    .line 110
    :cond_9
    return-object v6
.end method

.method public b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/a/a;
    .locals 4

    .prologue
    .line 114
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 116
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 118
    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 119
    const-string v1, "User"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 120
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    .line 122
    :goto_1
    return-object v0

    .line 117
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 121
    :cond_1
    const-string v1, "Page"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 122
    sget-object v0, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    goto :goto_1

    .line 124
    :cond_2
    sget-object v1, Lcom/facebook/contacts/c/a;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Malformed contact type name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 125
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Malformed contact type name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/Name;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 130
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    :cond_0
    new-instance v0, Lcom/facebook/user/Name;

    invoke-direct {v0, v1, v1}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :goto_0
    return-object v0

    .line 134
    :cond_1
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 135
    const-string v0, "parts"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 139
    if-eqz v3, :cond_2

    if-nez v0, :cond_3

    .line 140
    :cond_2
    new-instance v0, Lcom/facebook/user/Name;

    invoke-direct {v0, v1, v1, v3}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_3
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v2, v1

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 147
    const-string v5, "offset"

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v5

    .line 148
    const-string v6, "length"

    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v6

    .line 149
    const-string v7, "part"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v7

    .line 152
    const/4 v0, 0x0

    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v0

    .line 153
    invoke-virtual {v3, v0, v6}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v5

    .line 154
    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 156
    const-string v5, "first"

    invoke-static {v7, v5}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_2
    move-object v2, v1

    move-object v1, v0

    .line 161
    goto :goto_1

    .line 158
    :cond_4
    const-string v5, "last"

    invoke-static {v7, v5}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v1, v2

    .line 159
    goto :goto_2

    .line 163
    :cond_5
    new-instance v0, Lcom/facebook/user/Name;

    invoke-direct {v0, v2, v1, v3}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v0, v1

    move-object v1, v2

    goto :goto_2
.end method
