.class public Lcom/facebook/orca/protocol/methods/k;
.super Ljava/lang/Object;
.source "FetchMoreMessagesMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchMoreMessagesParams;",
        "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/p;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    .line 35
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 90
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 91
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 93
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 94
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v3, "thread_id = \'%1$s\' AND timestamp >= %2$d"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v1, v0, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 113
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 103
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v3, "thread_id = \'%1$s\' AND timestamp >= %2$d AND timestamp <= %3$d"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v8

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v1, v0, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private c(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 117
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 118
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 120
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "thread_id IN (SELECT thread_id FROM #canonical_thread_id) AND timestamp >= %1$d"

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 143
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "thread_id IN (SELECT thread_id FROM #canonical_thread_id) AND timestamp >= %1$d AND timestamp <= %2$d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 39
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 40
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/k;->b(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    :goto_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchMoreMessages"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 44
    :cond_0
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/k;->c(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/k;->a(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchMoreMessagesParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMoreMessagesResult;
    .locals 7

    .prologue
    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 59
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 61
    new-instance v2, Lcom/facebook/http/e/b;

    invoke-direct {v2, v1}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 62
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/protocol/methods/p;->c(Lcom/facebook/http/e/b;)Ljava/lang/String;

    move-result-object v0

    .line 67
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/k;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;

    move-result-object v2

    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_1

    iget v3, v2, Lcom/facebook/orca/protocol/methods/q;->b:I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    if-ge v3, v4, :cond_1

    .line 75
    const/4 v1, 0x1

    .line 78
    :cond_1
    new-instance v3, Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v2, v2, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    invoke-direct {v3, v0, v2, v1}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    .line 83
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/MessagesCollection;J)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/k;->a(Lcom/facebook/orca/server/FetchMoreMessagesParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    return-object v0
.end method
