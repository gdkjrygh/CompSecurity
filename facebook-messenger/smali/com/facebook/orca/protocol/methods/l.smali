.class public Lcom/facebook/orca/protocol/methods/l;
.super Ljava/lang/Object;
.source "FetchMoreThreadsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchMoreThreadsParams;",
        "Lcom/facebook/orca/server/FetchMoreThreadsResult;",
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
    const-class v0, Lcom/facebook/orca/protocol/methods/l;

    sput-object v0, Lcom/facebook/orca/protocol/methods/l;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/l;->b:Lcom/facebook/orca/protocol/methods/p;

    .line 38
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 81
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 82
    new-instance v1, Lcom/facebook/http/e/a;

    invoke-direct {v1}, Lcom/facebook/http/e/a;-><init>()V

    .line 83
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/l;->b:Lcom/facebook/orca/protocol/methods/p;

    const-string v3, "folder=\'%1$s\' AND archived=0 AND timestamp <= %2$d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderType;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v7

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v1, v0, v3, v7}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZ)V

    .line 90
    invoke-virtual {v1}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 42
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 43
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/l;->b(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchThreads"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/l;->a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchMoreThreadsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMoreThreadsResult;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/facebook/http/e/b;

    invoke-direct {v2, v1}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 59
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v1

    .line 60
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/l;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v3, v2, v0, v1}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;

    move-result-object v4

    .line 65
    iget v1, v4, Lcom/facebook/orca/protocol/methods/r;->e:I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    if-ge v1, v2, :cond_0

    const/4 v0, 0x1

    .line 68
    :cond_0
    new-instance v3, Lcom/facebook/orca/threads/ThreadsCollection;

    iget-object v1, v4, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-direct {v3, v1, v0}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 72
    new-instance v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v2

    iget-object v4, v4, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreThreadsResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;J)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/l;->a(Lcom/facebook/orca/server/FetchMoreThreadsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMoreThreadsResult;

    move-result-object v0

    return-object v0
.end method
