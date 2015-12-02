.class Lcom/facebook/http/protocol/ap;
.super Lcom/facebook/http/protocol/a;
.source "MethodBatcherImpl.java"


# instance fields
.field final synthetic a:Lcom/facebook/http/protocol/an;


# direct methods
.method private constructor <init>(Lcom/facebook/http/protocol/an;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-direct {p0}, Lcom/facebook/http/protocol/a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/protocol/an;Lcom/facebook/http/protocol/ao;)V
    .locals 0

    .prologue
    .line 108
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ap;-><init>(Lcom/facebook/http/protocol/an;)V

    return-void
.end method

.method private a(Lcom/fasterxml/jackson/core/JsonParser;)V
    .locals 2

    .prologue
    .line 357
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_0

    .line 360
    iget-object v0, p0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v0}, Lcom/facebook/http/protocol/an;->m(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/TreeNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 361
    iget-object v1, p0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/s;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 362
    new-instance v0, Lcom/fasterxml/jackson/databind/JsonMappingException;

    const-string v1, "Batch request must return an array"

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 364
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/http/protocol/l;)V
    .locals 16
    .param p2    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 113
    if-nez p2, :cond_0

    .line 114
    new-instance p2, Lcom/facebook/http/protocol/l;

    invoke-direct/range {p2 .. p2}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 117
    :cond_0
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/http/protocol/ap;->a()Ljava/util/List;

    move-result-object v11

    .line 120
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 121
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v12

    .line 122
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/y;

    .line 124
    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->a()Lcom/facebook/http/protocol/f;

    move-result-object v2

    .line 126
    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->b()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/facebook/http/protocol/f;->a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;

    move-result-object v6

    .line 127
    new-instance v7, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v7, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 128
    const-string v2, "method"

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v2, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 130
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->a(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/q;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/facebook/http/protocol/q;->a(Lcom/facebook/http/protocol/n;)Ljava/util/List;

    move-result-object v8

    .line 132
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->b(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 133
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v9, "phprof_sample"

    const-string v10, "1"

    invoke-direct {v2, v9, v10}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    if-eqz v2, :cond_1

    .line 136
    new-instance v9, Lorg/apache/http/message/BasicNameValuePair;

    const-string v10, "phprof_user"

    invoke-direct {v9, v10, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->d(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 140
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v9, "teak_sample"

    const-string v10, "1"

    invoke-direct {v2, v9, v10}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 142
    if-eqz v2, :cond_2

    .line 143
    new-instance v9, Lorg/apache/http/message/BasicNameValuePair;

    const-string v10, "teak_user"

    invoke-direct {v9, v10, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->e(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 147
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v9, "wirehog_sample"

    const-string v10, "1"

    invoke-direct {v2, v9, v10}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v2

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 149
    if-eqz v2, :cond_3

    .line 150
    new-instance v9, Lorg/apache/http/message/BasicNameValuePair;

    const-string v10, "wirehog_user"

    invoke-direct {v9, v10, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    :cond_3
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->c()Ljava/lang/String;

    move-result-object v2

    .line 155
    const-string v9, "GET"

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 156
    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 157
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v9, "?"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 167
    :goto_1
    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    .line 168
    const-string v8, "name"

    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 170
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->d()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 171
    const-string v8, "depends_on"

    invoke-virtual {v1}, Lcom/facebook/http/protocol/y;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v8, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 173
    :cond_5
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->e()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 174
    new-instance v8, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v8, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 175
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/a/a/a/a;

    .line 176
    invoke-virtual {v1}, Lcom/facebook/http/a/a/a/a;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/facebook/http/a/a/a/a;->d()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v13

    invoke-virtual {v8, v10, v13}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 177
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 158
    :cond_6
    const-string v9, "POST"

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 159
    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 160
    const-string v9, "body"

    invoke-virtual {v7, v9, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_1

    .line 161
    :cond_7
    const-string v9, "DELETE"

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 162
    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 163
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v9, "?"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    .line 165
    :cond_8
    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 179
    :cond_9
    const-string v1, "attached_files"

    invoke-virtual {v7, v1, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 181
    :cond_a
    const-string v1, "omit_response_on_success"

    const/4 v8, 0x0

    invoke-virtual {v7, v1, v8}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 182
    const-string v1, "relative_url"

    invoke-virtual {v7, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 183
    invoke-virtual {v3, v7}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 184
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 187
    :cond_b
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->f(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 188
    new-instance v5, Lcom/facebook/http/a/a/a/i;

    invoke-direct {v5}, Lcom/facebook/http/a/a/a/i;-><init>()V

    .line 189
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v1

    .line 190
    :goto_3
    if-nez v1, :cond_d

    .line 191
    new-instance v1, Lcom/facebook/http/protocol/u;

    const-string v2, "auth token is null, user logged out?"

    invoke-direct {v1, v2}, Lcom/facebook/http/protocol/u;-><init>(Ljava/lang/String;)V

    throw v1

    .line 189
    :cond_c
    const/4 v1, 0x0

    goto :goto_3

    .line 193
    :cond_d
    const-string v2, "access_token"

    new-instance v6, Lcom/facebook/http/a/a/a/a/d;

    sget-object v7, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v6, v1, v7}, Lcom/facebook/http/a/a/a/a/d;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-virtual {v5, v2, v6}, Lcom/facebook/http/a/a/a/i;->a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    .line 194
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v1

    .line 195
    const/4 v2, 0x2

    invoke-static {v2}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 196
    invoke-static {}, Lcom/facebook/http/protocol/an;->b()Ljava/lang/Class;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Request JSON: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 198
    :cond_e
    const-string v2, "batch"

    new-instance v3, Lcom/facebook/http/a/a/a/a/d;

    sget-object v6, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v6}, Lcom/facebook/http/a/a/a/a/d;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-virtual {v5, v2, v3}, Lcom/facebook/http/a/a/a/i;->a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    .line 199
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/a/a/a/a;

    .line 200
    invoke-virtual {v1}, Lcom/facebook/http/a/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v1

    invoke-virtual {v5, v3, v1}, Lcom/facebook/http/a/a/a/i;->a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    goto :goto_4

    .line 204
    :cond_f
    sget-object v1, Lcom/facebook/http/protocol/ao;->a:[I

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/http/protocol/l;->c()Lcom/facebook/http/protocol/m;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/http/protocol/m;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 213
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->i(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/c/i;

    move-object v2, v1

    .line 217
    :goto_5
    invoke-interface {v2}, Lcom/facebook/http/c/i;->b()Landroid/net/Uri$Builder;

    move-result-object v3

    .line 218
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->b(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 219
    const-string v1, "phprof_sample"

    const-string v4, "1"

    invoke-virtual {v3, v1, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 220
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 221
    if-eqz v1, :cond_10

    .line 222
    const-string v4, "phprof_user"

    invoke-virtual {v3, v4, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 225
    :cond_10
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->e(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 226
    const-string v1, "wirehog_sample"

    const-string v4, "1"

    invoke-virtual {v3, v1, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 227
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;

    move-result-object v1

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 228
    if-eqz v1, :cond_11

    .line 229
    const-string v4, "wirehog_user"

    invoke-virtual {v3, v4, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 233
    :cond_11
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->a(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/q;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/http/protocol/q;->a(Landroid/net/Uri$Builder;)V

    .line 235
    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v1, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 238
    invoke-interface {v2}, Lcom/facebook/http/c/i;->e()Ljava/lang/String;

    move-result-object v3

    .line 239
    if-eqz v3, :cond_12

    .line 240
    const-string v4, "User-Agent"

    invoke-virtual {v1, v4, v3}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    :cond_12
    invoke-interface {v2}, Lcom/facebook/http/c/i;->f()Ljava/lang/String;

    move-result-object v2

    .line 244
    if-eqz v2, :cond_13

    .line 245
    const-string v3, "X-FB-Connection-Type"

    invoke-virtual {v1, v3, v2}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    :cond_13
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/http/protocol/l;->b()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 249
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/http/protocol/l;->b()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/http/client/methods/HttpPost;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 252
    :cond_14
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->j(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/b/ap;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 253
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v13

    .line 254
    const/4 v2, 0x0

    .line 256
    :try_start_0
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    .line 257
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v4

    .line 258
    const/16 v3, 0x12c

    if-le v4, v3, :cond_19

    .line 259
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v1

    .line 262
    if-nez v13, :cond_18

    const/4 v3, 0x0

    .line 264
    :goto_6
    if-eqz v3, :cond_15

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 268
    :cond_15
    const/16 v5, 0x190

    if-ne v4, v5, :cond_16

    .line 269
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v5}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/facebook/http/protocol/s;->a(Ljava/lang/String;)V

    .line 271
    :cond_16
    new-instance v3, Lorg/apache/http/client/HttpResponseException;

    invoke-direct {v3, v4, v1}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    :catchall_0
    move-exception v1

    :goto_7
    if-eqz v2, :cond_17

    .line 350
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 352
    :cond_17
    invoke-interface {v13}, Lorg/apache/http/HttpEntity;->consumeContent()V

    throw v1

    .line 206
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->g(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/c/i;

    move-result-object v1

    move-object v2, v1

    .line 207
    goto/16 :goto_5

    .line 209
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->h(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/c/i;

    move-result-object v1

    move-object v2, v1

    .line 210
    goto/16 :goto_5

    .line 262
    :cond_18
    :try_start_1
    invoke-static {v13}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    .line 274
    :cond_19
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->l(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v1

    invoke-interface {v13}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v9

    .line 276
    :try_start_2
    invoke-virtual {v9}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 277
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/facebook/http/protocol/ap;->a(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 279
    const/4 v8, 0x0

    .line 281
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->m(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v1

    const-class v2, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v1, v9, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValues(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/MappingIterator;

    move-result-object v14

    .line 282
    const/4 v1, 0x0

    move v10, v1

    .line 283
    :goto_8
    invoke-virtual {v14}, Lcom/fasterxml/jackson/databind/MappingIterator;->hasNextValue()Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 284
    invoke-virtual {v14}, Lcom/fasterxml/jackson/databind/MappingIterator;->nextValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 285
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/facebook/http/protocol/y;

    move-object v7, v0

    .line 287
    invoke-virtual {v7}, Lcom/facebook/http/protocol/y;->a()Lcom/facebook/http/protocol/f;

    move-result-object v15

    .line 288
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/facebook/http/protocol/n;

    move-object v6, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 291
    :try_start_3
    sget-object v2, Lcom/fasterxml/jackson/databind/node/NullNode;->instance:Lcom/fasterxml/jackson/databind/node/NullNode;

    if-ne v1, v2, :cond_1a

    .line 292
    new-instance v1, Lcom/facebook/http/protocol/x;

    invoke-virtual {v7}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/http/protocol/x;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catch Lcom/facebook/http/protocol/e; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 332
    :catch_0
    move-exception v1

    move-object v2, v1

    .line 333
    if-nez v8, :cond_23

    move-object v1, v2

    .line 336
    :goto_9
    :try_start_4
    invoke-virtual {v7}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v2}, Lcom/facebook/http/protocol/ap;->a(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 338
    :goto_a
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    move-object v8, v1

    .line 339
    goto :goto_8

    .line 294
    :cond_1a
    :try_start_5
    new-instance v3, Lcom/facebook/http/protocol/ac;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v2}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/facebook/http/protocol/ac;-><init>(Lcom/facebook/http/protocol/s;)V

    .line 296
    invoke-virtual {v3, v1}, Lcom/facebook/http/protocol/ac;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 299
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->JSONPARSER:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1b

    .line 300
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->l(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v4

    .line 301
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v1}, Lcom/facebook/http/protocol/an;->m(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/fasterxml/jackson/core/JsonParser;->setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    .line 302
    new-instance v1, Lcom/facebook/http/protocol/r;

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->b()I

    move-result v2

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->a()Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v5}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v5

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    .line 330
    :goto_b
    invoke-virtual {v7}, Lcom/facebook/http/protocol/y;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v15, v2, v1}, Lcom/facebook/http/protocol/f;->a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;

    move-result-object v1

    .line 331
    invoke-virtual {v7}, Lcom/facebook/http/protocol/y;->c()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v1}, Lcom/facebook/http/protocol/ap;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v1, v8

    .line 337
    goto :goto_a

    .line 308
    :cond_1b
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1c

    .line 309
    new-instance v1, Lcom/facebook/http/protocol/r;

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->b()I

    move-result v2

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->a()Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v5}, Lcom/facebook/http/protocol/an;->m(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v5}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v5

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    goto :goto_b

    .line 349
    :catchall_1
    move-exception v1

    move-object v2, v9

    goto/16 :goto_7

    .line 315
    :cond_1c
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1d

    .line 316
    new-instance v1, Lcom/facebook/http/protocol/r;

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->b()I

    move-result v2

    invoke-virtual {v3}, Lcom/facebook/http/protocol/ac;->a()Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/http/protocol/ap;->a:Lcom/facebook/http/protocol/an;

    invoke-static {v5}, Lcom/facebook/http/protocol/an;->k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;

    move-result-object v5

    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    goto :goto_b

    .line 322
    :cond_1d
    invoke-virtual {v6}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->ENTITY:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1e

    .line 323
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Response type entity not supported for batch requests"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 326
    :cond_1e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown api response type"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catch Lcom/facebook/http/protocol/e; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 340
    :cond_1f
    :try_start_6
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    if-eq v10, v1, :cond_20

    .line 341
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Received wrong number of batches in response"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 344
    :cond_20
    if-eqz v8, :cond_21

    .line 346
    throw v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 349
    :cond_21
    if-eqz v9, :cond_22

    .line 350
    invoke-virtual {v9}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 352
    :cond_22
    invoke-interface {v13}, Lorg/apache/http/HttpEntity;->consumeContent()V

    .line 354
    return-void

    :cond_23
    move-object v1, v8

    goto/16 :goto_9

    .line 204
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
