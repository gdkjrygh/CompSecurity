.class public Lcom/facebook/analytics/cb;
.super Lcom/facebook/analytics/ca;
.source "HoneyClientEvent.java"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/fasterxml/jackson/databind/node/ObjectNode;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 34
    const-string v0, "AUTO_SET"

    invoke-direct {p0, p1, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 37
    const-string v0, "client_event"

    invoke-direct {p0, v0, p2}, Lcom/facebook/analytics/ca;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lcom/facebook/analytics/cb;->b:Ljava/lang/String;

    .line 39
    return-void
.end method

.method private j(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 188
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Invalid Key"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v0, :cond_2

    move-object v0, v1

    .line 198
    :cond_0
    :goto_1
    return-object v0

    .line 188
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 194
    :cond_2
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 195
    if-nez v0, :cond_0

    move-object v0, v1

    .line 196
    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p1}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;
    .locals 4

    .prologue
    .line 65
    const-string v0, "%4.2f"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 53
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 57
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    iput-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 73
    return-object p0
.end method

.method public a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 61
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-nez v0, :cond_0

    .line 43
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    iput-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 46
    :cond_0
    if-eqz p2, :cond_1

    .line 47
    iget-object v0, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 49
    :cond_1
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/analytics/cb;->c:Ljava/lang/String;

    .line 78
    return-object p0
.end method

.method public e()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 4

    .prologue
    .line 119
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 121
    const-string v1, "time"

    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/facebook/analytics/i/b;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 123
    const-string v1, "log_type"

    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 125
    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 127
    iget-object v1, p0, Lcom/facebook/analytics/cb;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 128
    const-string v1, "module"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 131
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/cb;->d:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 132
    const-string v1, "obj_type"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 135
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/cb;->e:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 136
    const-string v1, "obj_id"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 139
    :cond_2
    iget-object v1, p0, Lcom/facebook/analytics/cb;->f:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 140
    const-string v1, "uuid"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 143
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->f()Ljava/lang/String;

    move-result-object v1

    .line 144
    if-eqz v1, :cond_4

    .line 145
    const-string v2, "process"

    invoke-virtual {p0, v2, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 148
    :cond_4
    iget-object v1, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    if-eqz v1, :cond_5

    .line 149
    const-string v1, "extra"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->h:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 152
    :cond_5
    iget-object v1, p0, Lcom/facebook/analytics/cb;->g:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 153
    const-string v1, "interface"

    iget-object v2, p0, Lcom/facebook/analytics/cb;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 156
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 157
    const-string v1, "bg"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 160
    :cond_7
    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/analytics/cb;->d:Ljava/lang/String;

    .line 87
    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/analytics/cb;->e:Ljava/lang/String;

    .line 92
    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/analytics/cb;->f:Ljava/lang/String;

    .line 109
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 208
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/analytics/cb;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/analytics/cb;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/facebook/analytics/cb;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/analytics/cb;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 175
    invoke-direct {p0, p1}, Lcom/facebook/analytics/cb;->j(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 176
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/analytics/cb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/analytics/cb;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
