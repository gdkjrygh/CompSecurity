.class public Lcom/facebook/contacts/g/f;
.super Ljava/lang/Object;
.source "FetchAllContactsMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchAllContactsParams;",
        "Lcom/facebook/contacts/server/FetchAllContactsResult;",
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
.field private final b:Lcom/facebook/contacts/c/d;

.field private final c:Lcom/facebook/contacts/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/contacts/g/f;

    sput-object v0, Lcom/facebook/contacts/g/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/c/d;Lcom/facebook/contacts/c/a;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/contacts/g/f;->b:Lcom/facebook/contacts/c/d;

    .line 47
    iput-object p2, p0, Lcom/facebook/contacts/g/f;->c:Lcom/facebook/contacts/c/a;

    .line 48
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchAllContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchAllContactsResult;
    .locals 8

    .prologue
    .line 70
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 72
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 73
    const-string v1, "contacts"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 75
    const-string v1, "page_info"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 76
    const-string v2, "end_cursor"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 77
    const-string v2, "has_next_page"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v4

    .line 78
    const-string v2, "delta_cursor"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 80
    const-string v1, "nodes"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 82
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 84
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v6

    if-ge v0, v6, :cond_0

    .line 85
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    .line 86
    iget-object v7, p0, Lcom/facebook/contacts/g/f;->c:Lcom/facebook/contacts/c/a;

    invoke-virtual {v7, v6}, Lcom/facebook/contacts/c/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/contacts/models/b;

    move-result-object v6

    .line 87
    invoke-virtual {v6}, Lcom/facebook/contacts/models/b;->u()Lcom/facebook/contacts/models/Contact;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 84
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 90
    sget-object v0, Lcom/facebook/contacts/g/f;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Got result: "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 92
    new-instance v0, Lcom/facebook/contacts/server/FetchAllContactsResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/server/FetchAllContactsResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;Ljava/lang/String;ZLjava/lang/String;J)V

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/FetchAllContactsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 52
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 54
    iget-object v0, p0, Lcom/facebook/contacts/g/f;->b:Lcom/facebook/contacts/c/d;

    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchAllContactsParams;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchAllContactsParams;->b()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/contacts/c/e;->FULL:Lcom/facebook/contacts/c/e;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/contacts/c/d;->a(ILjava/lang/String;Lcom/facebook/contacts/c/e;)Ljava/lang/String;

    move-result-object v0

    .line 59
    sget-object v1, Lcom/facebook/contacts/g/f;->a:Ljava/lang/Class;

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

    .line 61
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "q"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
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
    .line 35
    check-cast p1, Lcom/facebook/contacts/server/FetchAllContactsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/f;->a(Lcom/facebook/contacts/server/FetchAllContactsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    check-cast p1, Lcom/facebook/contacts/server/FetchAllContactsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/f;->a(Lcom/facebook/contacts/server/FetchAllContactsParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchAllContactsResult;

    move-result-object v0

    return-object v0
.end method
