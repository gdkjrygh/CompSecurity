.class public Lcom/facebook/contacts/g/e;
.super Ljava/lang/Object;
.source "DeleteContactClaimMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/DeleteContactClaimParams;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/DeleteContactClaimParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 26
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 28
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "contact_id"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/DeleteContactClaimParams;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "field_type"

    const-string v2, "PHONE"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "deleteContactClaim"

    const-string v2, "DELETE"

    invoke-virtual {p1}, Lcom/facebook/contacts/server/DeleteContactClaimParams;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 22
    check-cast p1, Lcom/facebook/contacts/server/DeleteContactClaimParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/e;->a(Lcom/facebook/contacts/server/DeleteContactClaimParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/DeleteContactClaimParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 43
    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    check-cast p1, Lcom/facebook/contacts/server/DeleteContactClaimParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/e;->a(Lcom/facebook/contacts/server/DeleteContactClaimParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
