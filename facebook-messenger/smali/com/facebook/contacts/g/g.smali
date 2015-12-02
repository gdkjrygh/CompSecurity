.class public Lcom/facebook/contacts/g/g;
.super Ljava/lang/Object;
.source "FetchChatContextMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchChatContextParams;",
        "Lcom/facebook/contacts/server/FetchChatContextResult;",
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

.field private static final b:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/contacts/server/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/user/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Lcom/facebook/common/time/a;

.field private final e:Lcom/facebook/contacts/server/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 41
    const-class v0, Lcom/facebook/contacts/g/g;

    sput-object v0, Lcom/facebook/contacts/g/g;->a:Ljava/lang/Class;

    .line 44
    sget-object v0, Lcom/facebook/contacts/server/x;->TOP_FRIENDS:Lcom/facebook/contacts/server/x;

    sget-object v1, Lcom/facebook/contacts/server/x;->FAVORITE_FRIENDS:Lcom/facebook/contacts/server/x;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/g/g;->b:Ljava/util/EnumSet;

    .line 53
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    .line 54
    const-string v1, "nearby"

    sget-object v2, Lcom/facebook/user/d;->NEARBY:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "visiting"

    sget-object v2, Lcom/facebook/user/d;->VISITING:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "birthday"

    sget-object v2, Lcom/facebook/user/d;->BIRTHDAY:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "checkin"

    sget-object v2, Lcom/facebook/user/d;->CHECKIN:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "celebration"

    sget-object v2, Lcom/facebook/user/d;->CELEBRATION:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "neighbourhood"

    sget-object v2, Lcom/facebook/user/d;->NEIGHBORHOOD:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "listening"

    sget-object v2, Lcom/facebook/user/d;->LISTENING:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "presence"

    sget-object v2, Lcom/facebook/user/d;->PRESENCE:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "other"

    sget-object v2, Lcom/facebook/user/d;->OTHER:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/g/g;->c:Lcom/google/common/a/ev;

    .line 65
    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/contacts/server/w;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/facebook/contacts/g/g;->d:Lcom/facebook/common/time/a;

    .line 72
    iput-object p2, p0, Lcom/facebook/contacts/g/g;->e:Lcom/facebook/contacts/server/w;

    .line 73
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/ChatContext;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 117
    if-nez p1, :cond_0

    move-object v0, v1

    .line 130
    :goto_0
    return-object v0

    .line 121
    :cond_0
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "subtext"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v1

    .line 122
    goto :goto_0

    .line 124
    :cond_2
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 125
    sget-object v0, Lcom/facebook/contacts/g/g;->c:Lcom/google/common/a/ev;

    invoke-virtual {v0, v2}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/d;

    .line 126
    if-nez v0, :cond_3

    .line 127
    sget-object v0, Lcom/facebook/contacts/g/g;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid chat context type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 128
    goto :goto_0

    .line 130
    :cond_3
    new-instance v1, Lcom/facebook/user/ChatContext;

    const-string v2, "subtext"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "distance"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->f(Lcom/fasterxml/jackson/databind/JsonNode;)F

    move-result v3

    invoke-direct {v1, v2, v0, v3}, Lcom/facebook/user/ChatContext;-><init>(Ljava/lang/String;Lcom/facebook/user/d;F)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchChatContextParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchChatContextResult;
    .locals 7

    .prologue
    .line 97
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 98
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 100
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 101
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 102
    const-string v3, "uid"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 103
    const-string v4, "chat_context"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/g/g;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/ChatContext;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_0

    .line 105
    sget-object v4, Lcom/facebook/contacts/g/g;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Adding chat context: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " for uid "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 106
    new-instance v4, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v4, v5, v3}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v1, v4, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 110
    :cond_1
    new-instance v0, Lcom/facebook/contacts/server/FetchChatContextResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    iget-object v3, p0, Lcom/facebook/contacts/g/g;->d:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/facebook/contacts/server/FetchChatContextResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/google/common/a/ev;)V

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/FetchChatContextParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 77
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 78
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "query"

    iget-object v2, p0, Lcom/facebook/contacts/g/g;->e:Lcom/facebook/contacts/server/w;

    sget-object v3, Lcom/facebook/contacts/g/g;->b:Ljava/util/EnumSet;

    const/16 v5, 0x12c

    invoke-virtual {v2, v3, v5}, Lcom/facebook/contacts/server/w;->b(Ljava/util/EnumSet;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchChatContextMethod"

    const-string v2, "GET"

    const-string v3, "method/fql.query"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 38
    check-cast p1, Lcom/facebook/contacts/server/FetchChatContextParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/g;->a(Lcom/facebook/contacts/server/FetchChatContextParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    check-cast p1, Lcom/facebook/contacts/server/FetchChatContextParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/g;->a(Lcom/facebook/contacts/server/FetchChatContextParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchChatContextResult;

    move-result-object v0

    return-object v0
.end method
