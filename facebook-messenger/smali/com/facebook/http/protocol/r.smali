.class public Lcom/facebook/http/protocol/r;
.super Ljava/lang/Object;
.source "ApiResponse.java"


# instance fields
.field private final a:I

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/lang/Object;

.field private final e:Lcom/facebook/http/protocol/s;


# direct methods
.method public constructor <init>(ILjava/util/List;Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/facebook/http/protocol/s;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 95
    invoke-direct/range {p0 .. p5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/Object;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method public constructor <init>(ILjava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Lcom/facebook/http/protocol/s;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct/range {p0 .. p5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/Object;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method private constructor <init>(ILjava/util/List;Ljava/lang/Object;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/facebook/http/protocol/s;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput p1, p0, Lcom/facebook/http/protocol/r;->a:I

    .line 105
    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/r;->b:Lcom/google/common/a/es;

    .line 106
    iput-object p3, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    .line 107
    iput-object p4, p0, Lcom/facebook/http/protocol/r;->e:Lcom/facebook/http/protocol/s;

    .line 108
    iput-object p5, p0, Lcom/facebook/http/protocol/r;->d:Ljava/lang/Object;

    .line 109
    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/String;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/facebook/http/protocol/s;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct/range {p0 .. p5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/Object;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    .line 45
    return-void
.end method

.method public constructor <init>(ILjava/util/List;Lorg/apache/http/HttpEntity;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;",
            "Lorg/apache/http/HttpEntity;",
            "Lcom/facebook/http/protocol/s;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 78
    invoke-direct/range {p0 .. p5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/Object;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V

    .line 79
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 117
    iget v0, p0, Lcom/facebook/http/protocol/r;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    const-string v1, "No response body."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 136
    invoke-virtual {p0}, Lcom/facebook/http/protocol/r;->f()V

    .line 137
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/fasterxml/jackson/databind/JsonNode;

    const-string v1, "No response json node."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 147
    invoke-virtual {p0}, Lcom/facebook/http/protocol/r;->f()V

    .line 148
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Lorg/apache/http/HttpEntity;

    if-eqz v0, :cond_1

    .line 191
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    :cond_0
    :goto_0
    return-void

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/fasterxml/jackson/core/JsonParser;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Lcom/fasterxml/jackson/core/JsonParser;

    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    goto :goto_0

    .line 192
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 206
    iget-object v1, p0, Lcom/facebook/http/protocol/r;->e:Lcom/facebook/http/protocol/s;

    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/s;->a(Ljava/lang/String;)V

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/fasterxml/jackson/databind/JsonNode;

    if-eqz v0, :cond_0

    .line 208
    iget-object v1, p0, Lcom/facebook/http/protocol/r;->e:Lcom/facebook/http/protocol/s;

    iget-object v0, p0, Lcom/facebook/http/protocol/r;->c:Ljava/lang/Object;

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/s;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0
.end method
