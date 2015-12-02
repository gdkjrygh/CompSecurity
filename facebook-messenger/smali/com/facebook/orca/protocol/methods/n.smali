.class public Lcom/facebook/orca/protocol/methods/n;
.super Ljava/lang/Object;
.source "FetchThreadListMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchThreadListParams;",
        "Lcom/facebook/orca/server/FetchThreadListResult;",
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
    .line 34
    const-class v0, Lcom/facebook/orca/protocol/methods/n;

    sput-object v0, Lcom/facebook/orca/protocol/methods/n;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    .line 40
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchThreadListParams;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 60
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 61
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 62
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;)V

    .line 63
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Lcom/facebook/orca/threads/FolderName;)V

    .line 66
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    const-string v3, "folder=\'%1$s\' AND archived=0"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderType;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v1, v0, v3, v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZ)V

    .line 72
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/orca/server/FetchThreadListParams;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 78
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 79
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 80
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;)V

    .line 81
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Lcom/facebook/orca/threads/FolderName;)V

    .line 82
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    const-string v3, "folder=\'%1$s\' AND action_id > %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderType;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x64

    invoke-virtual {v2, v1, v0, v3, v7}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZ)V

    .line 89
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 44
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 45
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/n;->b(Lcom/facebook/orca/server/FetchThreadListParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :goto_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchThreads"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 49
    :cond_0
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/n;->c(Lcom/facebook/orca/server/FetchThreadListParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 30
    check-cast p1, Lcom/facebook/orca/server/FetchThreadListParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/n;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadListParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 95
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 96
    new-instance v3, Lcom/facebook/http/e/b;

    invoke-direct {v3, v0}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 98
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    move v0, v1

    .line 99
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v4

    .line 100
    iget-object v5, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v5, v3, v0, v4}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;

    move-result-object v4

    .line 105
    if-nez v0, :cond_1

    iget v5, v4, Lcom/facebook/orca/protocol/methods/r;->e:I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    if-ge v5, v6, :cond_1

    .line 109
    :goto_1
    new-instance v2, Lcom/facebook/orca/threads/ThreadsCollection;

    iget-object v5, v4, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-direct {v2, v5, v1}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 113
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/protocol/methods/p;->d(Lcom/facebook/http/e/b;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    .line 114
    iget-object v5, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v5, v3}, Lcom/facebook/orca/protocol/methods/p;->e(Lcom/facebook/http/e/b;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v5

    .line 115
    iget-object v6, p0, Lcom/facebook/orca/protocol/methods/n;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v6, v3}, Lcom/facebook/orca/protocol/methods/p;->f(Lcom/facebook/http/e/b;)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v3

    .line 118
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v6

    sget-object v7, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v6, v7}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    iget-object v2, v4, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    iget-object v2, v4, Lcom/facebook/orca/protocol/methods/r;->b:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/aa;->a(Ljava/util/List;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    iget-object v2, v4, Lcom/facebook/orca/protocol/methods/r;->c:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/aa;->b(Ljava/util/List;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/aa;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/aa;->a(Z)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/server/aa;->a(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v1

    iget-wide v3, v4, Lcom/facebook/orca/protocol/methods/r;->f:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/server/aa;->b(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v2

    .line 98
    goto :goto_0

    :cond_1
    move v1, v2

    .line 105
    goto :goto_1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    check-cast p1, Lcom/facebook/orca/server/FetchThreadListParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/n;->a(Lcom/facebook/orca/server/FetchThreadListParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    return-object v0
.end method
