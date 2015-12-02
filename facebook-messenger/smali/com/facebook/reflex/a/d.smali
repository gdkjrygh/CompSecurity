.class public Lcom/facebook/reflex/a/d;
.super Lcom/facebook/reflex/a/a;
.source "DriverInfoPeriodicReporter.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/reflex/a/a;-><init>(Lcom/facebook/prefs/shared/d;)V

    .line 35
    return-void
.end method


# virtual methods
.method a()Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/facebook/reflex/ae;->d:Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public declared-synchronized a(JLjava/lang/String;)Ljava/util/List;
    .locals 6
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
    .line 69
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/reflex/a/d;->b(J)V

    .line 70
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v0, "gl_info"

    invoke-direct {v1, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 71
    const-string v0, "vendor"

    iget-object v2, p0, Lcom/facebook/reflex/a/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 72
    const-string v0, "device"

    iget-object v2, p0, Lcom/facebook/reflex/a/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 73
    const-string v0, "version"

    iget-object v2, p0, Lcom/facebook/reflex/a/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 74
    iget-object v0, p0, Lcom/facebook/reflex/a/d;->d:Ljava/lang/String;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 75
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 76
    array-length v4, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v2, v0

    .line 77
    invoke-virtual {v3, v5}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 76
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 79
    :cond_0
    const-string v0, "extensions"

    invoke-virtual {v1, v0, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 80
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 42
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/reflex/a/d;->a:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/facebook/reflex/a/d;->b:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Lcom/facebook/reflex/a/d;->c:Ljava/lang/String;

    .line 45
    iput-object p4, p0, Lcom/facebook/reflex/a/d;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    .line 42
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(J)Z
    .locals 1

    .prologue
    .line 50
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/reflex/a/d;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    .line 52
    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/a/a;->a(J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b()J
    .locals 2

    .prologue
    .line 62
    const-wide/32 v0, 0x240c8400

    return-wide v0
.end method
