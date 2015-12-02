.class public Lcom/facebook/nux/status/l;
.super Ljava/lang/Object;
.source "UpdateNuxStatusMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/nux/status/UpdateNuxStatusParams;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/facebook/nux/status/n;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/nux/status/n;->COMPLETE:Lcom/facebook/nux/status/n;

    if-ne p1, v0, :cond_0

    .line 49
    const-string v0, "COMPLETE"

    .line 51
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "SKIPPED"

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/nux/status/UpdateNuxStatusParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 24
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 25
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "JSON"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "nux_id"

    invoke-virtual {p1}, Lcom/facebook/nux/status/UpdateNuxStatusParams;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "step"

    invoke-virtual {p1}, Lcom/facebook/nux/status/UpdateNuxStatusParams;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "status"

    invoke-virtual {p1}, Lcom/facebook/nux/status/UpdateNuxStatusParams;->c()Lcom/facebook/nux/status/n;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/nux/status/l;->a(Lcom/facebook/nux/status/n;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "updateNuxStatus"

    const-string v2, "GET"

    const-string v3, "method/user.updateNuxStatus"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    .line 38
    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/nux/status/UpdateNuxStatusParams;

    invoke-virtual {p0, p1}, Lcom/facebook/nux/status/l;->a(Lcom/facebook/nux/status/UpdateNuxStatusParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/nux/status/UpdateNuxStatusParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 44
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/nux/status/UpdateNuxStatusParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/nux/status/l;->a(Lcom/facebook/nux/status/UpdateNuxStatusParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
