.class public Lcom/facebook/orca/protocol/methods/i;
.super Ljava/lang/Object;
.source "FetchGroupThreadsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/FetchGroupThreadsParams;",
        "Lcom/facebook/orca/server/FetchGroupThreadsResult;",
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

.field private final c:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/protocol/methods/i;

    sput-object v0, Lcom/facebook/orca/protocol/methods/i;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/i;->b:Lcom/facebook/orca/protocol/methods/p;

    .line 41
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/i;->c:Lcom/facebook/common/time/a;

    .line 42
    return-void
.end method

.method private b(Lcom/facebook/orca/server/FetchGroupThreadsParams;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c()Ljava/lang/String;

    move-result-object v0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 61
    const-string v2, "CONTAINS(\'%1$s\', thread_and_participants_name) AND "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v6

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    :cond_0
    const-string v0, "folder=\'inbox\' AND not archived AND is_group_conversation=1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a()Lcom/facebook/orca/server/j;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    if-ne v0, v2, :cond_1

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/i;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    const-wide/32 v4, 0x48190800

    sub-long/2addr v2, v4

    .line 67
    const-string v0, " AND is_named_conversation=1 AND timestamp > "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    :cond_1
    new-instance v0, Lcom/facebook/http/e/a;

    invoke-direct {v0}, Lcom/facebook/http/e/a;-><init>()V

    .line 71
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/i;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;)V

    .line 72
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/i;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v0, v1, v3, v6}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZ)V

    .line 77
    invoke-virtual {v0}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchGroupThreadsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 46
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 47
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/i;->b(Lcom/facebook/orca/server/FetchGroupThreadsParams;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchGroupThreads"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 30
    check-cast p1, Lcom/facebook/orca/server/FetchGroupThreadsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/i;->a(Lcom/facebook/orca/server/FetchGroupThreadsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchGroupThreadsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchGroupThreadsResult;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 83
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 84
    new-instance v2, Lcom/facebook/http/e/b;

    invoke-direct {v2, v0}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 86
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b()I

    move-result v0

    .line 87
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/i;->b:Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {v3, v2, v1, v0}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;

    move-result-object v2

    .line 92
    iget v0, v2, Lcom/facebook/orca/protocol/methods/r;->e:I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    if-ge v0, v3, :cond_0

    const/4 v0, 0x1

    .line 95
    :goto_0
    new-instance v3, Lcom/facebook/orca/threads/ThreadsCollection;

    iget-object v4, v2, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    invoke-direct {v3, v4, v0}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 99
    invoke-static {}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->newBuilder()Lcom/facebook/orca/server/m;

    move-result-object v0

    sget-object v4, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/server/m;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/m;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/m;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/m;

    move-result-object v0

    iget-object v3, v2, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/m;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/m;

    move-result-object v0

    iget-object v3, v2, Lcom/facebook/orca/protocol/methods/r;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/m;->a(Ljava/util/List;)Lcom/facebook/orca/server/m;

    move-result-object v0

    iget-object v3, v2, Lcom/facebook/orca/protocol/methods/r;->c:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/m;->b(Ljava/util/List;)Lcom/facebook/orca/server/m;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/m;->a(Z)Lcom/facebook/orca/server/m;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/i;->c:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/facebook/orca/server/m;->a(J)Lcom/facebook/orca/server/m;

    move-result-object v0

    iget-wide v1, v2, Lcom/facebook/orca/protocol/methods/r;->f:J

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/server/m;->b(J)Lcom/facebook/orca/server/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/m;->j()Lcom/facebook/orca/server/FetchGroupThreadsResult;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    .line 92
    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    check-cast p1, Lcom/facebook/orca/server/FetchGroupThreadsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/i;->a(Lcom/facebook/orca/server/FetchGroupThreadsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchGroupThreadsResult;

    move-result-object v0

    return-object v0
.end method
