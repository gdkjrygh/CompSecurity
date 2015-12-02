.class Lcom/facebook/analytics/l;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/g/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 513
    iput-object p1, p0, Lcom/facebook/analytics/l;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 513
    invoke-direct {p0, p1}, Lcom/facebook/analytics/l;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/g/a;
    .locals 4

    .prologue
    .line 518
    new-instance v2, Lcom/facebook/analytics/g/a;

    const-class v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/common/time/MonotonicSinceBoot;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/l;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v3, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/analytics/l;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/g/a;-><init>(Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0}, Lcom/facebook/analytics/l;->a()Lcom/facebook/analytics/g/a;

    move-result-object v0

    return-object v0
.end method
