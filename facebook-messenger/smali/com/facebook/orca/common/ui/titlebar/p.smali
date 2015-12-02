.class Lcom/facebook/orca/common/ui/titlebar/p;
.super Ljava/lang/Object;
.source "FilterSessionManager.java"


# instance fields
.field private a:Lcom/facebook/analytics/av;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->a:Lcom/facebook/analytics/av;

    .line 37
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->b:Ljava/util/Set;

    .line 38
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 113
    new-instance v0, Lcom/facebook/analytics/cb;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "chat_bar"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "queryStrings"

    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/p;->d()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "queryAttempts"

    iget v2, p0, Lcom/facebook/orca/common/ui/titlebar/p;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 119
    if-eqz p2, :cond_0

    .line 120
    const-string v1, "contact_type"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "index"

    invoke-virtual {v1, v2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 124
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 125
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 127
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 108
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/p;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 109
    return-void
.end method

.method private d()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    .line 100
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 102
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 104
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 90
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->d:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_0
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->d:I

    .line 97
    :goto_0
    return-void

    .line 95
    :cond_1
    const-string v0, "Tried to add a query string to a session but no session is ongoing"

    invoke-static {v0}, Lcom/facebook/debug/log/f;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 80
    const-string v0, "chat_bar_search_result_selected"

    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/p;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 86
    :goto_0
    return-void

    .line 83
    :cond_0
    const-string v0, "Tried to terminate a search session but no session is ongoing"

    invoke-static {v0}, Lcom/facebook/debug/log/f;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 49
    const-string v0, "Starting search session with one already ongoing"

    invoke-static {v0}, Lcom/facebook/debug/log/f;->b(Ljava/lang/String;)V

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->d:I

    .line 53
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    .line 54
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "chat_bar_search_began"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "chat_bar"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/p;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 59
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/p;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 66
    const-string v0, "chat_bar_search_result_ended"

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/p;->b(Ljava/lang/String;)V

    .line 71
    :goto_0
    return-void

    .line 68
    :cond_0
    const-string v0, "Tried to cancel a search session but no session is ongoing"

    invoke-static {v0}, Lcom/facebook/debug/log/f;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
