.class Lcom/facebook/analytics/bd;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/service/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/analytics/bd;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 317
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bd;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/service/i;
    .locals 11

    .prologue
    .line 322
    new-instance v0, Lcom/facebook/analytics/service/i;

    invoke-virtual {p0}, Lcom/facebook/analytics/bd;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/analytics/c/e;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/c/e;

    const-class v3, Lcom/facebook/analytics/c/g;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/c/g;

    const-class v4, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/base/a/d;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    const-class v6, Ljava/util/concurrent/Executor;

    const-class v7, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/Executor;

    const-class v7, Lcom/facebook/analytics/bq;

    invoke-virtual {p0, v7}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/analytics/bq;

    const-class v8, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v8}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v9, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v9}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/common/v/f;

    const-class v10, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v10}, Lcom/facebook/analytics/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/common/process/d;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/analytics/service/i;-><init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Lcom/facebook/analytics/c/g;Lcom/facebook/base/a/d;Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;Lcom/facebook/analytics/bq;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/v/f;Lcom/facebook/common/process/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    invoke-virtual {p0}, Lcom/facebook/analytics/bd;->a()Lcom/facebook/analytics/service/i;

    move-result-object v0

    return-object v0
.end method
