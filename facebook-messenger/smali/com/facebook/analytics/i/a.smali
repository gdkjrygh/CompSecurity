.class public Lcom/facebook/analytics/i/a;
.super Ljava/lang/Object;
.source "AnalyticsDeviceUtils.java"


# instance fields
.field private final a:Lcom/facebook/common/hardware/k;

.field private final b:Lcom/facebook/analytics/a;

.field private final c:Lcom/facebook/analytics/cache/d;

.field private final d:Lcom/facebook/analytics/j/a;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/analytics/d/a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/analytics/b/b;

.field private g:J

.field private h:J


# direct methods
.method public constructor <init>(Lcom/facebook/common/hardware/k;Lcom/facebook/analytics/a;Lcom/facebook/analytics/cache/d;Lcom/facebook/analytics/j/a;Ljava/util/Set;Lcom/facebook/analytics/b/b;)V
    .locals 3
    .param p6    # Lcom/facebook/analytics/b/b;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/hardware/k;",
            "Lcom/facebook/analytics/a;",
            "Lcom/facebook/analytics/cache/d;",
            "Lcom/facebook/analytics/j/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/analytics/d/a;",
            ">;",
            "Lcom/facebook/analytics/b/b;",
            ")V"
        }
    .end annotation

    .prologue
    const-wide/16 v1, 0x0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/facebook/analytics/i/a;->a:Lcom/facebook/common/hardware/k;

    .line 63
    iput-object p2, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    .line 64
    iput-object p3, p0, Lcom/facebook/analytics/i/a;->c:Lcom/facebook/analytics/cache/d;

    .line 65
    iput-object p4, p0, Lcom/facebook/analytics/i/a;->d:Lcom/facebook/analytics/j/a;

    .line 66
    iput-object p6, p0, Lcom/facebook/analytics/i/a;->f:Lcom/facebook/analytics/b/b;

    .line 67
    invoke-static {p5}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/i/a;->e:Ljava/util/Set;

    .line 69
    iput-wide v1, p0, Lcom/facebook/analytics/i/a;->g:J

    .line 70
    iput-wide v1, p0, Lcom/facebook/analytics/i/a;->h:J

    .line 72
    invoke-direct {p0}, Lcom/facebook/analytics/i/a;->a()V

    .line 73
    return-void
.end method

.method private a()V
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    .line 231
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_1

    .line 232
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    .line 233
    invoke-static {v0}, Landroid/net/TrafficStats;->getUidRxBytes(I)J

    move-result-wide v1

    .line 234
    cmp-long v3, v1, v4

    if-eqz v3, :cond_0

    .line 235
    iput-wide v1, p0, Lcom/facebook/analytics/i/a;->g:J

    .line 238
    :cond_0
    invoke-static {v0}, Landroid/net/TrafficStats;->getUidTxBytes(I)J

    move-result-wide v0

    .line 239
    cmp-long v2, v0, v4

    if-eqz v2, :cond_1

    .line 240
    iput-wide v0, p0, Lcom/facebook/analytics/i/a;->h:J

    .line 243
    :cond_1
    return-void
.end method

.method private a(Lcom/facebook/analytics/cb;Ljava/lang/String;Landroid/net/NetworkInfo;)V
    .locals 3

    .prologue
    .line 103
    if-eqz p3, :cond_1

    .line 104
    invoke-virtual {p3}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "connection"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "none"

    :cond_0
    invoke-virtual {p1, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 108
    invoke-virtual {p3}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "connection_subtype"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 113
    :cond_1
    return-void
.end method

.method private b()V
    .locals 12

    .prologue
    const-wide/32 v10, 0x1f400000

    const-wide/16 v8, 0x0

    const-wide/16 v2, -0x1

    .line 249
    iget-wide v0, p0, Lcom/facebook/analytics/i/a;->g:J

    .line 250
    iget-wide v4, p0, Lcom/facebook/analytics/i/a;->h:J

    .line 251
    invoke-direct {p0}, Lcom/facebook/analytics/i/a;->a()V

    .line 252
    iget-wide v6, p0, Lcom/facebook/analytics/i/a;->g:J

    sub-long v0, v6, v0

    .line 253
    cmp-long v6, v0, v8

    if-ltz v6, :cond_0

    cmp-long v6, v0, v10

    if-lez v6, :cond_1

    :cond_0
    move-wide v0, v2

    .line 258
    :cond_1
    iget-wide v6, p0, Lcom/facebook/analytics/i/a;->h:J

    sub-long v4, v6, v4

    .line 259
    cmp-long v6, v4, v8

    if-ltz v6, :cond_2

    cmp-long v6, v4, v10

    if-lez v6, :cond_3

    .line 264
    :cond_2
    :goto_0
    iget-object v4, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    const-string v5, "total_bytes_received"

    invoke-virtual {v4, v5, v0, v1}, Lcom/facebook/analytics/a;->b(Ljava/lang/String;J)V

    .line 265
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    const-string v1, "total_bytes_sent"

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/a;->b(Ljava/lang/String;J)V

    .line 266
    return-void

    :cond_3
    move-wide v2, v4

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/net/NetworkInfo;)Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0x5f

    .line 211
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    :cond_0
    const-string v0, "unknown"

    .line 220
    :goto_0
    return-object v0

    .line 216
    :cond_1
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 220
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Landroid/net/NetworkInfo;Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 121
    invoke-direct {p0}, Lcom/facebook/analytics/i/a;->b()V

    .line 123
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/a;->a(Lcom/facebook/analytics/cb;)V

    .line 124
    const-string v0, "connection"

    invoke-virtual {p0, p1}, Lcom/facebook/analytics/i/a;->a(Landroid/net/NetworkInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 125
    const-string v0, "counters"

    iget-object v1, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    invoke-virtual {v1}, Lcom/facebook/analytics/a;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 126
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->b:Lcom/facebook/analytics/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/a;->b()V

    .line 127
    return-void
.end method

.method public a(Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 80
    const-string v0, ""

    iget-object v1, p0, Lcom/facebook/analytics/i/a;->a:Lcom/facebook/common/hardware/k;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/k;->c()Landroid/net/NetworkInfo;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/analytics/i/a;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Landroid/net/NetworkInfo;)V

    .line 81
    return-void
.end method

.method public a(Lcom/facebook/analytics/cb;Landroid/net/NetworkInfo;)V
    .locals 1

    .prologue
    .line 89
    const-string v0, "previous_"

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/analytics/i/a;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Landroid/net/NetworkInfo;)V

    .line 90
    return-void
.end method

.method public a(Landroid/net/NetworkInfo;Landroid/net/NetworkInfo;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 193
    if-nez p1, :cond_2

    .line 194
    if-nez p2, :cond_1

    .line 201
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 194
    goto :goto_0

    .line 197
    :cond_2
    if-nez p2, :cond_3

    move v0, v1

    .line 198
    goto :goto_0

    .line 201
    :cond_3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    invoke-virtual {p2}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    if-ne v2, v3, :cond_4

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v2

    invoke-virtual {p2}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v3

    if-eq v2, v3, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public b(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->c:Lcom/facebook/analytics/cache/d;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cache/d;->a(Lcom/facebook/analytics/cb;)V

    .line 135
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->c:Lcom/facebook/analytics/cache/d;

    invoke-virtual {v0}, Lcom/facebook/analytics/cache/d;->b()V

    .line 136
    return-void
.end method

.method public c(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->d:Lcom/facebook/analytics/j/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/j/a;->a(Lcom/facebook/analytics/cb;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->d:Lcom/facebook/analytics/j/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/j/a;->b()V

    .line 145
    return-void
.end method

.method public d(Lcom/facebook/analytics/cb;)V
    .locals 6

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->f:Lcom/facebook/analytics/b/b;

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->f:Lcom/facebook/analytics/b/b;

    invoke-virtual {v0}, Lcom/facebook/analytics/b/b;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 156
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 157
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "_"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/facebook/analytics/cl;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/facebook/analytics/cl;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2, v5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    goto :goto_0

    .line 163
    :cond_1
    return-void
.end method

.method public e(Lcom/facebook/analytics/cb;)V
    .locals 6

    .prologue
    .line 170
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 171
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 172
    iget-object v0, p0, Lcom/facebook/analytics/i/a;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/d/a;

    .line 173
    invoke-interface {v0}, Lcom/facebook/analytics/d/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lcom/facebook/analytics/d/a;->b()Z

    move-result v5

    invoke-virtual {v1, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 177
    invoke-interface {v0}, Lcom/facebook/analytics/d/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lcom/facebook/analytics/d/a;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0

    .line 182
    :cond_0
    const-string v0, "features"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 183
    const-string v0, "features_extra_data"

    invoke-virtual {p1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 184
    return-void
.end method
