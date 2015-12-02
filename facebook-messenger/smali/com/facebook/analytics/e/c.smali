.class Lcom/facebook/analytics/e/c;
.super Ljava/lang/Object;
.source "DefaultPerformanceLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/e/g;

.field final synthetic b:Z

.field final synthetic c:J

.field final synthetic d:Lcom/facebook/analytics/e/a;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/g;ZJ)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    iput-object p2, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    iput-boolean p3, p0, Lcom/facebook/analytics/e/c;->b:Z

    iput-wide p4, p0, Lcom/facebook/analytics/e/c;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 496
    iget-object v0, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    iget-object v1, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v1}, Lcom/facebook/analytics/e/g;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v2}, Lcom/facebook/analytics/e/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 497
    iget-object v1, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    invoke-static {v1}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    .line 499
    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/facebook/analytics/e/c;->b:Z

    if-eqz v1, :cond_0

    .line 501
    iget-object v1, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    invoke-static {v1}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/e/j;

    .line 502
    iget-object v0, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    iget-object v2, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v2}, Lcom/facebook/analytics/e/g;->b()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lcom/facebook/analytics/e/c;->c:J

    iget-boolean v5, p0, Lcom/facebook/analytics/e/c;->b:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V

    .line 518
    :goto_0
    return-void

    .line 504
    :cond_0
    new-instance v1, Lcom/facebook/analytics/e/j;

    iget-object v0, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/e/g;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v2}, Lcom/facebook/analytics/e/g;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v3}, Lcom/facebook/analytics/e/g;->g()J

    move-result-wide v3

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/facebook/analytics/e/j;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 506
    iget-object v0, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/e/g;->i()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/e/j;->a(Ljava/util/Set;)V

    .line 507
    iget-object v0, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/e/g;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 508
    invoke-virtual {v1}, Lcom/facebook/analytics/e/j;->c()V

    .line 510
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/e/c;->d:Lcom/facebook/analytics/e/a;

    iget-object v2, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v2}, Lcom/facebook/analytics/e/g;->b()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lcom/facebook/analytics/e/c;->c:J

    iget-boolean v5, p0, Lcom/facebook/analytics/e/c;->b:Z

    iget-object v6, p0, Lcom/facebook/analytics/e/c;->a:Lcom/facebook/analytics/e/g;

    invoke-virtual {v6}, Lcom/facebook/analytics/e/g;->j()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V

    goto :goto_0
.end method
