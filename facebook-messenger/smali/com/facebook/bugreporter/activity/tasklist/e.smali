.class public Lcom/facebook/bugreporter/activity/tasklist/e;
.super Ljava/lang/Object;
.source "TaskListFetcherMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/f;",
        "Lcom/google/common/a/es",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/Task;",
        ">;>;"
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/e;

    sput-object v0, Lcom/facebook/bugreporter/activity/tasklist/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/bugreporter/activity/tasklist/f;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 33
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 34
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "app"

    const-string v2, "android"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json-strings"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "limit"

    const-string v2, "10"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "category_id"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/activity/tasklist/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 41
    invoke-virtual {p1}, Lcom/facebook/bugreporter/activity/tasklist/f;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 42
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/Long;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "tag_ids"

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "taskListFetcher"

    const-string v2, "POST"

    const-string v3, "method/bug.searchbytags"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/facebook/bugreporter/activity/tasklist/f;

    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/e;->a(Lcom/facebook/bugreporter/activity/tasklist/f;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/bugreporter/activity/tasklist/f;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/bugreporter/activity/tasklist/f;",
            "Lcom/facebook/http/protocol/r;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;"
        }
    .end annotation

    .prologue
    .line 56
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 57
    sget-object v0, Lcom/facebook/bugreporter/activity/tasklist/e;->a:Ljava/lang/Class;

    const-string v1, "TaskListFetching failed: error code: %d, msg: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->d()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    .line 61
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    .line 62
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 63
    const-class v1, Lcom/facebook/bugreporter/activity/tasklist/Task;

    invoke-static {v0, v1}, Lcom/facebook/common/json/jsonmirror/g;->b(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/facebook/bugreporter/activity/tasklist/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/bugreporter/activity/tasklist/e;->a(Lcom/facebook/bugreporter/activity/tasklist/f;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
