.class public Lcom/facebook/orca/protocol/methods/o;
.super Ljava/lang/Object;
.source "FetchThreadMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchThreadParams;",
        "Lcom/facebook/orca/server/FetchThreadResult;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/protocol/methods/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/orca/protocol/methods/o;

    sput-object v0, Lcom/facebook/orca/protocol/methods/o;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    .line 38
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 62
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 63
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "thread_id=\'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V

    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "thread_id=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 80
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "thread_id=\'"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "\'"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V

    .line 87
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "thread_id=\'%1$s\' AND timestamp > %2$d"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v5, v3

    invoke-static {v2, v5}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 97
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 101
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/protocol/methods/p;->b(Lcom/facebook/http/e/a;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "single_recipient=\'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V

    .line 112
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "thread_id IN (SELECT thread_id FROM #threads)"

    const-string v3, "timestamp DESC"

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 119
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/http/protocol/n;
    .locals 7

    .prologue
    .line 42
    const-string v3, "fql"

    .line 43
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 44
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 47
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/o;->d(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    :goto_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchThread"

    const-string v2, "GET"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v0

    const-wide/16 v5, -0x1

    cmp-long v0, v0, v5

    if-nez v0, :cond_1

    .line 49
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/o;->b(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 51
    :cond_1
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/o;->c(Lcom/facebook/orca/server/FetchThreadParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 29
    check-cast p1, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/o;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 11

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 125
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 126
    new-instance v4, Lcom/facebook/http/e/b;

    invoke-direct {v4, v3}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 128
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v3, v4, v1, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;

    move-result-object v6

    .line 133
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 134
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v3, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;)Lcom/facebook/user/User;

    move-result-object v5

    .line 135
    if-nez v5, :cond_1

    .line 136
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Couldn\'t find canonical user"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v5, v2

    .line 141
    :cond_1
    iget-object v3, v6, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-nez v3, :cond_3

    .line 142
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-nez v0, :cond_2

    .line 143
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Couldn\'t find thread"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 146
    :cond_2
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object v3, v2

    move-object v4, v2

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    .line 173
    :goto_0
    return-object v0

    .line 154
    :cond_3
    iget-object v2, v6, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v2

    if-le v2, v0, :cond_4

    .line 155
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - multiple threads in fetchThread"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_4
    iget-object v2, v6, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-virtual {v2, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/ThreadSummary;

    .line 161
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/o;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v7

    invoke-virtual {v3, v4, v7}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;

    move-result-object v4

    .line 166
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v3, v7, v9

    if-gez v3, :cond_5

    iget v3, v4, Lcom/facebook/orca/protocol/methods/q;->b:I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v7

    if-ge v3, v7, :cond_5

    .line 170
    :goto_1
    new-instance v3, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v4, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    invoke-direct {v3, v1, v4, v0}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    .line 173
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    iget-object v4, v6, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    goto :goto_0

    :cond_5
    move v0, v1

    .line 166
    goto :goto_1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    check-cast p1, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/o;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    return-object v0
.end method
