.class public Lcom/facebook/orca/protocol/methods/a;
.super Ljava/lang/Object;
.source "AddMembersMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/AddMembersParams;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/ad;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/ad;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/a;->a:Lcom/facebook/orca/protocol/methods/ad;

    .line 27
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/AddMembersParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 31
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 32
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/a;->a:Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/AddMembersParams;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/methods/ad;->a(Ljava/util/List;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 33
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "id"

    invoke-virtual {p1}, Lcom/facebook/orca/server/AddMembersParams;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "to"

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "addMembers"

    const-string v2, "POST"

    const-string v3, "/participants"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/server/AddMembersParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/a;->a(Lcom/facebook/orca/server/AddMembersParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/server/AddMembersParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/a;->a(Lcom/facebook/orca/server/AddMembersParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/AddMembersParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 42
    const/4 v0, 0x0

    return-object v0
.end method
