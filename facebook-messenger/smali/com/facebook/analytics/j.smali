.class Lcom/facebook/analytics/j;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/facebook/analytics/j;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 215
    invoke-direct {p0, p1}, Lcom/facebook/analytics/j;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/a/a;
    .locals 8

    .prologue
    .line 220
    new-instance v0, Lcom/facebook/analytics/a/a;

    invoke-virtual {p0}, Lcom/facebook/analytics/j;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v6}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/e/h;

    const-class v7, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v7}, Lcom/facebook/analytics/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/v/f;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/analytics/a/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/executors/a;Lcom/facebook/common/e/h;Lcom/facebook/common/v/f;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/facebook/analytics/j;->a()Lcom/facebook/analytics/a/a;

    move-result-object v0

    return-object v0
.end method
