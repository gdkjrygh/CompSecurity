.class public Lcom/facebook/http/protocol/s;
.super Ljava/lang/Object;
.source "ApiResponseChecker.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/http/protocol/s;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 26
    return-void
.end method

.method private static b(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 33
    if-nez p0, :cond_1

    .line 81
    :cond_0
    return-void

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 40
    const-string v0, "error_code"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 42
    new-instance v0, Lcom/facebook/http/protocol/ApiErrorResult;

    const-string v1, "error_code"

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    const-string v2, "error_msg"

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "error_data"

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V

    .line 73
    :goto_0
    if-eqz v0, :cond_0

    .line 74
    new-instance v1, Lcom/facebook/http/protocol/e;

    invoke-direct {v1, v0}, Lcom/facebook/http/protocol/e;-><init>(Lcom/facebook/http/protocol/ApiErrorResult;)V

    throw v1

    .line 47
    :cond_2
    const-string v0, "error"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "error"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isInt()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 49
    new-instance v0, Lcom/facebook/http/protocol/ApiErrorResult;

    const-string v2, "error"

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v2

    const-string v3, "error_description"

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V

    goto :goto_0

    .line 54
    :cond_3
    const-string v0, "error"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "error"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 55
    const-string v0, "error"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 56
    const-string v0, "code"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "description"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 58
    new-instance v0, Lcom/facebook/http/protocol/ApiErrorResult;

    const-string v3, "code"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v3

    const-string v4, "description"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/facebook/http/protocol/d;->GRAPHQL_KERROR_DOMAIN:Lcom/facebook/http/protocol/d;

    invoke-direct {v0, v3, v2, v1, v4}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V

    goto :goto_0

    .line 63
    :cond_4
    const-string v0, "message"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 64
    const-string v0, "code"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "code"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    .line 65
    :goto_1
    new-instance v1, Lcom/facebook/http/protocol/ApiErrorResult;

    const-string v3, "message"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "error_data"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/facebook/http/protocol/d;->API_EC_DOMAIN:Lcom/facebook/http/protocol/d;

    invoke-direct {v1, v0, v3, v2, v4}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/facebook/http/protocol/d;)V

    move-object v0, v1

    goto/16 :goto_0

    .line 64
    :cond_5
    const/4 v0, 0x0

    goto :goto_1

    .line 76
    :cond_6
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/fasterxml/jackson/databind/JsonMappingException;

    const-string v1, "Response was neither an array or a dictionary"

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object v0, v1

    goto/16 :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/http/protocol/s;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/http/protocol/s;->b(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 1

    .prologue
    .line 99
    if-nez p1, :cond_0

    .line 111
    :goto_0
    return-void

    .line 103
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/facebook/http/protocol/s;->b(Lcom/fasterxml/jackson/databind/JsonNode;)V
    :try_end_0
    .catch Lcom/facebook/http/protocol/e; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 104
    :catch_0
    move-exception v0

    .line 105
    throw v0

    .line 106
    :catch_1
    move-exception v0

    goto :goto_0

    .line 108
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 84
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    :goto_0
    return-void

    .line 88
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/s;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/facebook/http/protocol/e; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    throw v0

    .line 91
    :catch_1
    move-exception v0

    goto :goto_0

    .line 93
    :catch_2
    move-exception v0

    goto :goto_0
.end method
