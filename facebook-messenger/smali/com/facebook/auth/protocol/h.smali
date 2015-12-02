.class public Lcom/facebook/auth/protocol/h;
.super Ljava/lang/Object;
.source "GetLoggedInUserMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/Void;",
        "Lcom/facebook/auth/protocol/GetLoggedInUserResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/auth/protocol/j;

.field private final b:Lcom/facebook/user/ac;

.field private final c:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/protocol/j;Lcom/facebook/user/ac;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/auth/protocol/h;->a:Lcom/facebook/auth/protocol/j;

    .line 38
    iput-object p2, p0, Lcom/facebook/auth/protocol/h;->b:Lcom/facebook/user/ac;

    .line 39
    iput-object p3, p0, Lcom/facebook/auth/protocol/h;->c:Lcom/facebook/common/time/a;

    .line 40
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 51
    new-instance v0, Lcom/facebook/http/e/a;

    invoke-direct {v0}, Lcom/facebook/http/e/a;-><init>()V

    .line 52
    const-string v1, "user"

    const-string v2, "SELECT uid, first_name, last_name, contact_email, phones, is_pushable, affiliations FROM user WHERE uid=me()"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v1, "profile"

    const-string v2, "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id=me()"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v0}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/auth/protocol/GetLoggedInUserResult;
    .locals 5

    .prologue
    .line 64
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 65
    new-instance v1, Lcom/facebook/http/e/b;

    invoke-direct {v1, v0}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 66
    const-string v0, "user"

    invoke-virtual {v1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 67
    const-string v2, "profile"

    invoke-virtual {v1, v2}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 68
    iget-object v2, p0, Lcom/facebook/auth/protocol/h;->a:Lcom/facebook/auth/protocol/j;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/auth/protocol/j;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/facebook/auth/protocol/h;->b:Lcom/facebook/user/ac;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 71
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - multiple result users"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 74
    new-instance v1, Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    iget-object v3, p0, Lcom/facebook/auth/protocol/h;->c:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/auth/protocol/GetLoggedInUserResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/user/User;J)V

    return-object v1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/h;->a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 44
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 45
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "queries"

    invoke-direct {p0}, Lcom/facebook/auth/protocol/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "meUser"

    const-string v2, "GET"

    const-string v3, "method/fql.multiquery"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/auth/protocol/h;->a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    move-result-object v0

    return-object v0
.end method
