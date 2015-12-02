.class Lcom/facebook/abtest/qe/service/module/g;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/full/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/g;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/g;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/protocol/sync/full/a;
    .locals 3

    .prologue
    .line 91
    new-instance v1, Lcom/facebook/abtest/qe/protocol/sync/full/a;

    new-instance v2, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v2, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/d;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    invoke-direct {v1, v2}, Lcom/facebook/abtest/qe/protocol/sync/full/a;-><init>(Lcom/facebook/abtest/qe/protocol/sync/full/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/g;->a()Lcom/facebook/abtest/qe/protocol/sync/full/a;

    move-result-object v0

    return-object v0
.end method
