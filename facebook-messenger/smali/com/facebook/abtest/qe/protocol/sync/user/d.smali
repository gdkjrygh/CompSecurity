.class public Lcom/facebook/abtest/qe/protocol/sync/user/d;
.super Ljava/lang/Object;
.source "SyncQuickExperimentUserInfoResultHelper.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/user/d;

    sput-object v0, Lcom/facebook/abtest/qe/protocol/sync/user/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;
    .locals 8
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 46
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 87
    :cond_0
    :goto_0
    return-object v0

    .line 50
    :cond_1
    const-string v1, "data"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 51
    if-eqz v1, :cond_0

    .line 55
    new-instance v2, Lcom/facebook/abtest/qe/protocol/sync/user/c;

    invoke-direct {v2}, Lcom/facebook/abtest/qe/protocol/sync/user/c;-><init>()V

    .line 57
    invoke-virtual {p2}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;

    .line 60
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v3, "in_experiment"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v0

    .line 61
    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a(Z)Lcom/facebook/abtest/qe/protocol/sync/user/c;

    .line 63
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v3, "hash"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;

    .line 66
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v3, "group"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    const-string v0, "local_default_group"

    .line 70
    :cond_2
    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;

    .line 72
    new-instance v3, Lcom/google/common/a/ew;

    invoke-direct {v3}, Lcom/google/common/a/ew;-><init>()V

    .line 74
    invoke-virtual {v1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v1, "params"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 75
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v4

    .line 76
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 78
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    const-string v6, "type"

    invoke-virtual {v5, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v5

    .line 79
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    const-string v7, "value"

    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v6

    .line 81
    const/4 v7, 0x1

    if-eq v5, v7, :cond_4

    const/4 v7, 0x2

    if-ne v5, v7, :cond_3

    .line 82
    :cond_4
    invoke-virtual {v3, v0, v6}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 85
    :cond_5
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a(Lcom/google/common/a/ev;)Lcom/facebook/abtest/qe/protocol/sync/user/c;

    .line 87
    invoke-virtual {v2}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a()Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    move-result-object v0

    goto/16 :goto_0
.end method
