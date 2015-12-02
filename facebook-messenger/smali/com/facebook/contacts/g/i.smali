.class public Lcom/facebook/contacts/g/i;
.super Ljava/lang/Object;
.source "FetchContactsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchContactsParams;",
        "Lcom/facebook/contacts/server/FetchContactsResult;",
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
.field private final b:Lcom/facebook/contacts/c/a;

.field private final c:Lcom/facebook/contacts/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/facebook/contacts/g/i;

    sput-object v0, Lcom/facebook/contacts/g/i;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/c/a;Lcom/facebook/contacts/c/b;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/contacts/g/i;->b:Lcom/facebook/contacts/c/a;

    .line 49
    iput-object p2, p0, Lcom/facebook/contacts/g/i;->c:Lcom/facebook/contacts/c/b;

    .line 50
    return-void
.end method

.method private a(Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 96
    invoke-static {p1}, Lcom/facebook/g/a/a;->a(Ljava/lang/Iterable;)Lcom/facebook/g/a/b;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/facebook/contacts/g/i;->c:Lcom/facebook/contacts/c/b;

    invoke-interface {v1, v0}, Lcom/facebook/contacts/c/b;->a(Lcom/facebook/g/a/b;)V

    .line 101
    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchContactsResult;
    .locals 5

    .prologue
    .line 69
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 71
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v3

    .line 72
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 74
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 75
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 78
    :try_start_0
    iget-object v4, p0, Lcom/facebook/contacts/g/i;->b:Lcom/facebook/contacts/c/a;

    invoke-virtual {v4, v0}, Lcom/facebook/contacts/c/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/facebook/contacts/models/b;->u()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    sget-object v2, Lcom/facebook/contacts/g/i;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Couldn\'t deserialize contact: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", error: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 81
    throw v0

    .line 86
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 87
    sget-object v1, Lcom/facebook/contacts/g/i;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 89
    new-instance v1, Lcom/facebook/contacts/server/FetchContactsResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/facebook/contacts/server/FetchContactsResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/google/common/a/es;)V

    return-object v1
.end method

.method public a(Lcom/facebook/contacts/server/FetchContactsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 54
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 56
    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchContactsParams;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/i;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 58
    sget-object v1, Lcom/facebook/contacts/g/i;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sending query: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 60
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "q"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchContacts"

    const-string v2, "GET"

    const-string v3, "graphql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 36
    check-cast p1, Lcom/facebook/contacts/server/FetchContactsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/i;->a(Lcom/facebook/contacts/server/FetchContactsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    check-cast p1, Lcom/facebook/contacts/server/FetchContactsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/i;->a(Lcom/facebook/contacts/server/FetchContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchContactsResult;

    move-result-object v0

    return-object v0
.end method
