.class Lcom/facebook/analytics/ae;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/e/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/facebook/analytics/ae;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 321
    invoke-direct {p0, p1}, Lcom/facebook/analytics/ae;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/e/a;
    .locals 4

    .prologue
    .line 324
    new-instance v3, Lcom/facebook/analytics/e/a;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ae;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v2, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/analytics/ae;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/ae;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/analytics/e/a;-><init>(Lcom/facebook/analytics/av;Ljava/util/concurrent/Executor;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 321
    invoke-virtual {p0}, Lcom/facebook/analytics/ae;->a()Lcom/facebook/analytics/e/a;

    move-result-object v0

    return-object v0
.end method
