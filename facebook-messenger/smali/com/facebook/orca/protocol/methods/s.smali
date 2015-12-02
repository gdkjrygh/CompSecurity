.class public Lcom/facebook/orca/protocol/methods/s;
.super Ljava/lang/Object;
.source "FetchThreadsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchThreadParams;",
        "Lcom/google/common/a/es",
        "<",
        "Lcom/facebook/orca/server/FetchThreadResult;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/p;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    .line 44
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;JI)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;JI)",
            "Lcom/facebook/orca/threads/MessagesCollection;"
        }
    .end annotation

    .prologue
    .line 169
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gez v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p5, :cond_0

    const/4 v0, 0x1

    .line 170
    :goto_0
    new-instance v1, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v1, p1, v2, v0}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    return-object v1

    .line 169
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)Lcom/facebook/user/User;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/facebook/user/User;"
        }
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 146
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 147
    return-object v0

    .line 150
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No matching user was found in the returned users list"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/util/Map;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 156
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 157
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 158
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 160
    :cond_0
    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/http/protocol/n;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 48
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 51
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 52
    const-string v0, ","

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/server/ThreadCriteria;->c()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v3

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/protocol/methods/p;->c(Lcom/facebook/http/e/a;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "single_recipient in ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ")"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "thread_id IN (SELECT thread_id FROM #threads)"

    const-string v4, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v5

    add-int/2addr v3, v5

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 72
    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 73
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v0, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "q"

    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchThreads"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    :cond_1
    move v0, v4

    .line 49
    goto/16 :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 37
    check-cast p1, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/s;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/es;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            "Lcom/facebook/http/protocol/r;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/server/ThreadCriteria;->c()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v4

    .line 87
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 88
    new-instance v3, Lcom/facebook/http/e/b;

    invoke-direct {v3, v2}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 91
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;

    move-result-object v5

    .line 97
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v16

    .line 98
    iget-object v2, v5, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/User;

    .line 99
    invoke-virtual {v2}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v7

    move-object/from16 v0, v16

    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 103
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/protocol/methods/p;->b(Lcom/facebook/http/e/b;)Lcom/google/common/a/es;

    move-result-object v17

    .line 105
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/methods/s;->a:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v6

    invoke-virtual {v2, v3, v6}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;

    move-result-object v2

    .line 110
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v18

    .line 111
    iget-object v2, v2, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/messages/model/threads/Message;

    .line 112
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 113
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x1

    new-array v7, v7, [Lcom/facebook/messages/model/threads/Message;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    invoke-static {v7}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 115
    :cond_1
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 116
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 121
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v2

    div-int v7, v2, v4

    .line 122
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v19

    .line 123
    iget-object v2, v5, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :cond_3
    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/threads/ThreadSummary;

    .line 124
    invoke-virtual {v10}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 127
    new-instance v8, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v9, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v10}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v5

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/facebook/orca/protocol/methods/s;->a(Ljava/lang/String;Ljava/util/List;JI)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v11

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1, v10}, Lcom/facebook/orca/protocol/methods/s;->a(Ljava/util/Map;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/google/common/a/es;

    move-result-object v12

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v10, v1}, Lcom/facebook/orca/protocol/methods/s;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)Lcom/facebook/user/User;

    move-result-object v13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-direct/range {v8 .. v15}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    .line 139
    move-object/from16 v0, v19

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 141
    :cond_4
    invoke-static/range {v19 .. v19}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    return-object v2
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    check-cast p1, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/s;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
