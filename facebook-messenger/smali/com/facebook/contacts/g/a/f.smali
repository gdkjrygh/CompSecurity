.class public Lcom/facebook/contacts/g/a/f;
.super Ljava/lang/Object;
.source "FetchMobileAppDataMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/Integer;",
        "Lcom/facebook/contacts/server/FetchMobileAppDataResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/user/ac;


# direct methods
.method public constructor <init>(Lcom/facebook/user/ac;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/contacts/g/a/f;->a:Lcom/facebook/user/ac;

    .line 33
    return-void
.end method

.method private b(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    const-string v1, "SELECT uid, mobile_app_data FROM user WHERE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    const-string v1, "uid in (SELECT uid2 FROM  friend WHERE uid1=me() order by communication_rank desc LIMIT %d)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchMobileAppDataResult;
    .locals 5

    .prologue
    .line 61
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 62
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 64
    iget-object v1, p0, Lcom/facebook/contacts/g/a/f;->a:Lcom/facebook/user/ac;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 66
    new-instance v1, Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    return-object v1
.end method

.method public a(Ljava/lang/Integer;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 38
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 39
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "query"

    invoke-direct {p0, p1}, Lcom/facebook/contacts/g/a/f;->b(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchMobileAppDataMethod"

    const-string v2, "GET"

    const-string v3, "method/fql.query"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/f;->a(Ljava/lang/Integer;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/f;->a(Ljava/lang/Integer;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    move-result-object v0

    return-object v0
.end method
