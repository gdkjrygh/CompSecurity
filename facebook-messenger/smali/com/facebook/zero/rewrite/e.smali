.class public Lcom/facebook/zero/rewrite/e;
.super Ljava/lang/Object;
.source "ZeroUrlRewriteRuleSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final b:Lcom/fasterxml/jackson/core/JsonFactory;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/zero/rewrite/e;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 28
    iput-object p2, p0, Lcom/facebook/zero/rewrite/e;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 29
    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 32
    new-instance v1, Lcom/google/common/a/et;

    invoke-direct {v1}, Lcom/google/common/a/et;-><init>()V

    .line 35
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->elements()Ljava/util/Iterator;

    move-result-object v2

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 39
    const-string v3, "matcher"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 40
    const-string v4, "replacer"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    .line 41
    const-string v5, "mode"

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 42
    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 46
    new-instance v5, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v3, v4, v0}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/zero/rewrite/e;->b:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->readValueAsTree()Lcom/fasterxml/jackson/core/TreeNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 57
    invoke-virtual {p0, v0}, Lcom/facebook/zero/rewrite/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/common/a/es;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 63
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    .line 65
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/e;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
