.class public Lcom/facebook/abtest/qe/protocol/sync/full/a;
.super Ljava/lang/Object;
.source "SyncQuickExperimentMetaInfoMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;",
        "Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;",
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
.field private final b:Lcom/facebook/abtest/qe/protocol/sync/full/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/full/a;

    sput-object v0, Lcom/facebook/abtest/qe/protocol/sync/full/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/protocol/sync/full/d;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/a;->b:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    .line 28
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 2

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/a;->b:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 34
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 35
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "syncFullQE"

    const-string v2, "GET"

    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/a;->a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 18
    check-cast p1, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/full/a;->a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    check-cast p1, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/abtest/qe/protocol/sync/full/a;->a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    return-object v0
.end method
