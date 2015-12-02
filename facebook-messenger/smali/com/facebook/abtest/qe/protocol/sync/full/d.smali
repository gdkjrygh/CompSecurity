.class public Lcom/facebook/abtest/qe/protocol/sync/full/d;
.super Ljava/lang/Object;
.source "SyncQuickExperimentMetaInfoResultHelper.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    sput-object v0, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/d;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 50
    return-void
.end method

.method private static a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 12

    .prologue
    .line 139
    new-instance v2, Lcom/facebook/abtest/qe/protocol/sync/full/c;

    invoke-direct {v2}, Lcom/facebook/abtest/qe/protocol/sync/full/c;-><init>()V

    .line 142
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    const-string v0, "id"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    .line 150
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 153
    const-string v0, "groups"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 154
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v4

    .line 157
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 146
    :cond_0
    invoke-virtual {v2, p1}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 162
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 165
    :cond_2
    invoke-virtual {v2, v3}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a(Ljava/util/List;)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    .line 169
    new-instance v4, Lcom/google/common/a/ew;

    invoke-direct {v4}, Lcom/google/common/a/ew;-><init>()V

    .line 171
    const-string v0, "params"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    .line 172
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v6

    .line 173
    :cond_3
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 174
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 175
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    invoke-virtual {v5, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v7

    .line 180
    new-instance v8, Lcom/google/common/a/ew;

    invoke-direct {v8}, Lcom/google/common/a/ew;-><init>()V

    .line 181
    :cond_4
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 182
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 183
    invoke-virtual {v5, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    invoke-virtual {v9, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    .line 184
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v10

    if-nez v10, :cond_4

    .line 187
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v10

    if-eqz v10, :cond_6

    .line 188
    const-string v10, "type"

    invoke-virtual {v9, v10}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v10

    invoke-virtual {v10}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v10

    .line 189
    const-string v11, "value"

    invoke-virtual {v9, v11}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v9

    .line 190
    const/4 v11, 0x1

    if-eq v10, v11, :cond_5

    const/4 v11, 0x2

    if-ne v10, v11, :cond_4

    .line 191
    :cond_5
    invoke-virtual {v8, v0, v9}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_4

    .line 193
    :cond_6
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/JsonNode;->isTextual()Z

    move-result v10

    if-eqz v10, :cond_4

    .line 194
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v0, v9}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_4

    .line 198
    :cond_7
    invoke-virtual {v8}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_3

    .line 200
    :cond_8
    invoke-virtual {v4}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a(Lcom/google/common/a/ev;)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    .line 203
    const-string v0, "default_group"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v0, 0x0

    :goto_5
    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    .line 207
    const-string v0, "expiration"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 208
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asLong()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a(J)Lcom/facebook/abtest/qe/protocol/sync/full/c;

    .line 210
    invoke-virtual {v2}, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a()Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    return-object v0

    .line 204
    :cond_9
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    goto :goto_5
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 56
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 60
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 114
    if-nez p1, :cond_0

    .line 127
    :goto_0
    return-object v1

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/d;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    .line 121
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 122
    iget-object v2, p0, Lcom/facebook/abtest/qe/protocol/sync/full/d;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/TreeNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :goto_1
    invoke-static {v0, v1}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v1

    goto :goto_0

    .line 123
    :catch_0
    move-exception v0

    .line 124
    sget-object v2, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error parsing "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_1
.end method

.method public a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Ljava/lang/String;
    .locals 7

    .prologue
    .line 69
    if-nez p1, :cond_0

    .line 70
    const/4 v0, 0x0

    .line 107
    :goto_0
    return-object v0

    .line 73
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 74
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/d;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v0, v2, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v3

    .line 77
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 78
    const-string v0, "id"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "groups"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 80
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 81
    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 104
    :catch_0
    move-exception v0

    .line 105
    sget-object v1, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a:Ljava/lang/Class;

    const-string v2, "Exception while trying to convert SyncQuickExperimentMetaInfoResult to JSON"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    const-string v0, "{}"

    goto :goto_0

    .line 83
    :cond_1
    :try_start_1
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 85
    const-string v0, "params"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;->c()Lcom/google/common/a/ev;

    move-result-object v4

    .line 87
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 88
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 89
    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 90
    if-eqz v1, :cond_2

    .line 91
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 92
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 95
    :cond_2
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_2

    .line 97
    :cond_3
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 99
    const-string v0, "default_group"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "expiration"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;->e()J

    move-result-wide v4

    invoke-virtual {v3, v0, v4, v5}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;J)V

    .line 101
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 102
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 103
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method
