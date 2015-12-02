.class public Lcom/facebook/push/c2dm/ae;
.super Ljava/lang/Object;
.source "UnregisterPushTokenMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/push/c2dm/UnregisterPushTokenParams;",
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


# virtual methods
.method public a(Lcom/facebook/push/c2dm/UnregisterPushTokenParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 24
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 25
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "token"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "unregisterPush"

    const-string v2, "POST"

    const-string v3, "method/user.unregisterPushCallback"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;

    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/ae;->a(Lcom/facebook/push/c2dm/UnregisterPushTokenParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/push/c2dm/UnregisterPushTokenParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->b()Ljava/lang/String;

    move-result-object v0

    .line 40
    const-string v1, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/push/c2dm/ae;->a(Lcom/facebook/push/c2dm/UnregisterPushTokenParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
