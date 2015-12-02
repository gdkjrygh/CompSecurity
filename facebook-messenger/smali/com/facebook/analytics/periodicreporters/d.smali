.class public Lcom/facebook/analytics/periodicreporters/d;
.super Ljava/lang/Object;
.source "DataUsagePeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;


# instance fields
.field private final a:Lcom/facebook/base/a/d;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/analytics/bq;

.field private d:J


# direct methods
.method public constructor <init>(Lcom/facebook/base/a/d;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/bq;)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/d;->d:J

    .line 38
    iput-object p1, p0, Lcom/facebook/analytics/periodicreporters/d;->a:Lcom/facebook/base/a/d;

    .line 39
    iput-object p2, p0, Lcom/facebook/analytics/periodicreporters/d;->b:Lcom/facebook/prefs/shared/d;

    .line 40
    iput-object p3, p0, Lcom/facebook/analytics/periodicreporters/d;->c:Lcom/facebook/analytics/bq;

    .line 41
    return-void
.end method

.method private a()J
    .locals 4

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/d;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->n:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v2, 0x36ee80

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private a(JLjava/lang/String;JJLjava/util/List;)Lcom/facebook/analytics/cb;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/List",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/facebook/analytics/cb;"
        }
    .end annotation

    .prologue
    .line 119
    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v0, "counters"

    invoke-direct {v2, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2, p1, p2}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 121
    invoke-virtual {v2, p3}, Lcom/facebook/analytics/cb;->c(Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 122
    const-string v0, "app"

    invoke-virtual {v2, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 125
    const-string v0, "from"

    invoke-static {p4, p5}, Lcom/facebook/analytics/i/b;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 126
    const-string v0, "to"

    invoke-static {p6, p7}, Lcom/facebook/analytics/i/b;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 128
    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 129
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 130
    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 131
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v3, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Long;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_0

    .line 133
    :cond_0
    const-string v0, "data"

    invoke-virtual {v2, v0, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 136
    :cond_1
    return-object v2
.end method

.method private a(JLjava/lang/String;IJ)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "IJ)",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 84
    new-instance v10, Ljava/util/LinkedList;

    invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V

    .line 87
    div-long v1, p1, p5

    mul-long v11, v1, p5

    .line 89
    move/from16 v0, p4

    int-to-long v1, v0

    mul-long v1, v1, p5

    sub-long v5, v11, v1

    .line 92
    :goto_0
    cmp-long v1, v5, v11

    if-gez v1, :cond_1

    .line 93
    add-long v7, v5, p5

    .line 94
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/d;->c:Lcom/facebook/analytics/bq;

    invoke-virtual {v1, v5, v6, v7, v8}, Lcom/facebook/analytics/bq;->a(JJ)Ljava/util/List;

    move-result-object v9

    .line 97
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, p0

    move-wide v2, p1

    move-object/from16 v4, p3

    .line 98
    invoke-direct/range {v1 .. v9}, Lcom/facebook/analytics/periodicreporters/d;->a(JLjava/lang/String;JJLjava/util/List;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_0
    add-long v5, v5, p5

    goto :goto_0

    .line 103
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/d;->c:Lcom/facebook/analytics/bq;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3, v11, v12}, Lcom/facebook/analytics/bq;->b(JJ)I

    .line 104
    return-object v10
.end method


# virtual methods
.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    iput-wide p1, p0, Lcom/facebook/analytics/periodicreporters/d;->d:J

    .line 58
    const/16 v4, 0x18

    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/d;->a()J

    move-result-wide v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/periodicreporters/d;->a(JLjava/lang/String;IJ)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 46
    iget-object v1, p0, Lcom/facebook/analytics/periodicreporters/d;->a:Lcom/facebook/base/a/d;

    invoke-virtual {v1}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 49
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-wide v1, p0, Lcom/facebook/analytics/periodicreporters/d;->d:J

    sub-long v1, p1, v1

    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/d;->a()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
