.class public Lcom/facebook/nux/status/a;
.super Ljava/lang/Object;
.source "FetchNuxStatusesMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/nux/status/FetchNuxStatusesParams;",
        "Lcom/facebook/nux/status/FetchNuxStatusesResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/nux/status/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/nux/status/e;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/nux/status/a;->a:Ljava/util/Set;

    .line 45
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/nux/status/NuxStatusResult;
    .locals 5

    .prologue
    .line 102
    const-string v0, "steps"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 103
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 104
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 105
    invoke-direct {p0, v0}, Lcom/facebook/nux/status/a;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/nux/status/NuxStep;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 108
    :cond_0
    const-string v0, "extra_data"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 109
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 110
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v3

    .line 111
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 113
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 116
    :cond_1
    new-instance v0, Lcom/facebook/nux/status/NuxStatusResult;

    const-string v3, "nux_id"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "is_eligible"

    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v4

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/facebook/nux/status/NuxStatusResult;-><init>(Ljava/lang/String;ZLcom/google/common/a/es;Lcom/google/common/a/ev;)V

    return-object v0
.end method

.method private a()Lcom/google/common/a/fi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/nux/status/a;->a:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 95
    iget-object v0, p0, Lcom/facebook/nux/status/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/e;

    .line 96
    invoke-interface {v0}, Lcom/facebook/nux/status/e;->a()Ljava/lang/Iterable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/nux/status/NuxStep;
    .locals 3

    .prologue
    .line 125
    new-instance v0, Lcom/facebook/nux/status/NuxStep;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_current"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/nux/status/NuxStep;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/nux/status/FetchNuxStatusesParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 50
    if-nez p1, :cond_0

    .line 51
    invoke-direct {p0}, Lcom/facebook/nux/status/a;->a()Lcom/google/common/a/fi;

    move-result-object v0

    .line 56
    :goto_0
    invoke-static {v0}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 57
    const-string v1, "SELECT %s FROM %s WHERE nux_id IN %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "nux_id, steps, is_eligible, extra_data"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "user_nux_status"

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 63
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "query"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "get_nux_statuses_method"

    const-string v2, "GET"

    const-string v3, "method/fql.query"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 53
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/nux/status/FetchNuxStatusesParams;->a()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 35
    check-cast p1, Lcom/facebook/nux/status/FetchNuxStatusesParams;

    invoke-virtual {p0, p1}, Lcom/facebook/nux/status/a;->a(Lcom/facebook/nux/status/FetchNuxStatusesParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/nux/status/FetchNuxStatusesParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/nux/status/FetchNuxStatusesResult;
    .locals 3

    .prologue
    .line 78
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 79
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result v1

    if-nez v1, :cond_0

    .line 82
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Result must be an array"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 85
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 86
    invoke-direct {p0, v0}, Lcom/facebook/nux/status/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/nux/status/NuxStatusResult;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 88
    :cond_1
    new-instance v0, Lcom/facebook/nux/status/FetchNuxStatusesResult;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/nux/status/FetchNuxStatusesResult;-><init>(Lcom/google/common/a/es;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    check-cast p1, Lcom/facebook/nux/status/FetchNuxStatusesParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/nux/status/a;->a(Lcom/facebook/nux/status/FetchNuxStatusesParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/nux/status/FetchNuxStatusesResult;

    move-result-object v0

    return-object v0
.end method
