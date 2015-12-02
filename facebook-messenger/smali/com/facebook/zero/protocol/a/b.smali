.class public Lcom/facebook/zero/protocol/a/b;
.super Ljava/lang/Object;
.source "FetchZeroTokenMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/zero/server/FetchZeroTokenParams;",
        "Lcom/facebook/zero/server/FetchZeroTokenResult;",
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
.field private final b:Lcom/facebook/zero/ui/p;

.field private final c:Lcom/facebook/zero/rewrite/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/zero/protocol/a/b;

    sput-object v0, Lcom/facebook/zero/protocol/a/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/zero/protocol/a/b;->b:Lcom/facebook/zero/ui/p;

    .line 43
    iput-object p2, p0, Lcom/facebook/zero/protocol/a/b;->c:Lcom/facebook/zero/rewrite/e;

    .line 44
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/zero/server/FetchZeroTokenParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 48
    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenParams;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenParams;->b()Lcom/facebook/zero/server/c;

    move-result-object v1

    .line 51
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 52
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "carrier_mcc"

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "carrier_mnc"

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "sim_mcc"

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "sim_mnc"

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v0, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "interface"

    invoke-virtual {v1}, Lcom/facebook/zero/server/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object v0, Lcom/facebook/zero/protocol/a/b;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requesting zero rating token with params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchZeroToken"

    const-string v2, "GET"

    const-string v3, "method/mobile.zeroCampaign"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 32
    check-cast p1, Lcom/facebook/zero/server/FetchZeroTokenParams;

    invoke-virtual {p0, p1}, Lcom/facebook/zero/protocol/a/b;->a(Lcom/facebook/zero/server/FetchZeroTokenParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/zero/server/FetchZeroTokenParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/zero/server/FetchZeroTokenResult;
    .locals 5

    .prologue
    .line 75
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 76
    if-nez v1, :cond_0

    .line 77
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Expected response to be a struct"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    const-string v0, "id"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, ""

    invoke-static {v0, v2}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 81
    const-string v0, "status"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v3, "unknown"

    invoke-static {v0, v3}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 85
    const-string v0, "enabled_ui_features"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 86
    iget-object v0, p0, Lcom/facebook/zero/protocol/a/b;->b:Lcom/facebook/zero/ui/p;

    const-string v4, "enabled_ui_features"

    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/facebook/zero/ui/p;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 92
    :goto_0
    const-string v4, "rewrite_rules"

    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    iget-object v4, p0, Lcom/facebook/zero/protocol/a/b;->c:Lcom/facebook/zero/rewrite/e;

    invoke-virtual {v4, v1}, Lcom/facebook/zero/rewrite/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v1

    .line 100
    :goto_1
    new-instance v4, Lcom/facebook/zero/server/FetchZeroTokenResult;

    invoke-direct {v4, v2, v3, v0, v1}, Lcom/facebook/zero/server/FetchZeroTokenResult;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 102
    sget-object v0, Lcom/facebook/zero/protocol/a/b;->a:Ljava/lang/Class;

    const-string v1, "FetchZeroTokenResult: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-object v4

    .line 89
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 97
    :cond_2
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    goto :goto_1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    check-cast p1, Lcom/facebook/zero/server/FetchZeroTokenParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/zero/protocol/a/b;->a(Lcom/facebook/zero/server/FetchZeroTokenParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/zero/server/FetchZeroTokenResult;

    move-result-object v0

    return-object v0
.end method
