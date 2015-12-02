.class Lcom/facebook/analytics/service/c;
.super Ljava/lang/Object;
.source "AnalyticsEventUploader.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/a;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 472
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/service/a;Lcom/facebook/analytics/service/b;)V
    .locals 0

    .prologue
    .line 445
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/c;-><init>(Lcom/facebook/analytics/service/a;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 456
    iget-object v0, p0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->e(Lcom/facebook/analytics/service/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    iget-object v0, p0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0, v1}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/service/a;Z)Z

    .line 458
    invoke-static {v1}, Lcom/facebook/analytics/service/a;->a(Z)Z

    .line 459
    iget-object v0, p0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->f(Lcom/facebook/analytics/service/a;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/service/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/service/d;-><init>(Lcom/facebook/analytics/service/c;Lcom/facebook/analytics/service/b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 464
    :goto_0
    return-void

    .line 461
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0, v2}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/service/a;Z)Z

    .line 462
    invoke-static {v2}, Lcom/facebook/analytics/service/a;->a(Z)Z

    goto :goto_0
.end method
