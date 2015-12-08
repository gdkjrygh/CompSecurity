.class public Lcom/mopub/network/ScribeRequest;
.super Lcom/mopub/volley/Request;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/volley/Request",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/mopub/common/event/EventSerializer;

.field private final c:Lcom/mopub/network/ScribeRequest$Listener;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/mopub/common/event/EventSerializer;Lcom/mopub/network/ScribeRequest$Listener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;",
            "Lcom/mopub/common/event/EventSerializer;",
            "Lcom/mopub/network/ScribeRequest$Listener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 41
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p4}, Lcom/mopub/volley/Request;-><init>(ILjava/lang/String;Lcom/mopub/volley/Response$ErrorListener;)V

    .line 43
    iput-object p2, p0, Lcom/mopub/network/ScribeRequest;->a:Ljava/util/List;

    .line 44
    iput-object p3, p0, Lcom/mopub/network/ScribeRequest;->b:Lcom/mopub/common/event/EventSerializer;

    .line 45
    iput-object p4, p0, Lcom/mopub/network/ScribeRequest;->c:Lcom/mopub/network/ScribeRequest$Listener;

    .line 47
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mopub/network/ScribeRequest;->setShouldCache(Z)Lcom/mopub/volley/Request;

    .line 50
    new-instance v0, Lcom/mopub/volley/DefaultRetryPolicy;

    invoke-direct {v0}, Lcom/mopub/volley/DefaultRetryPolicy;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mopub/network/ScribeRequest;->setRetryPolicy(Lcom/mopub/volley/RetryPolicy;)Lcom/mopub/volley/Request;

    .line 51
    return-void
.end method


# virtual methods
.method protected final a(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/NetworkResponse;",
            ")",
            "Lcom/mopub/volley/Response",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-static {p1}, Lcom/mopub/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Cache$Entry;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/volley/Response;->success(Ljava/lang/Object;Lcom/mopub/volley/Cache$Entry;)Lcom/mopub/volley/Response;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mopub/network/ScribeRequest;->b:Lcom/mopub/common/event/EventSerializer;

    iget-object v1, p0, Lcom/mopub/network/ScribeRequest;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/mopub/common/event/EventSerializer;->serializeAsJson(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    .line 59
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 60
    const-string v2, "log"

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    return-object v1
.end method

.method protected synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 23
    .line 1073
    iget-object v0, p0, Lcom/mopub/network/ScribeRequest;->c:Lcom/mopub/network/ScribeRequest$Listener;

    invoke-interface {v0}, Lcom/mopub/network/ScribeRequest$Listener;->onResponse()V

    .line 23
    return-void
.end method

.method public getEvents()Ljava/util/List;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 80
    iget-object v0, p0, Lcom/mopub/network/ScribeRequest;->a:Ljava/util/List;

    return-object v0
.end method
