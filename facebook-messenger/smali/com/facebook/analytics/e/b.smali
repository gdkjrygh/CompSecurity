.class Lcom/facebook/analytics/e/b;
.super Ljava/lang/Object;
.source "DefaultPerformanceLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:J

.field final synthetic e:Ljava/util/Map;

.field final synthetic f:Lcom/facebook/analytics/e/a;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    .locals 0

    .prologue
    .line 330
    iput-object p1, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    iput-object p2, p0, Lcom/facebook/analytics/e/b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/analytics/e/b;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/facebook/analytics/e/b;->c:Z

    iput-wide p5, p0, Lcom/facebook/analytics/e/b;->d:J

    iput-object p7, p0, Lcom/facebook/analytics/e/b;->e:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 333
    iget-object v0, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    iget-object v1, p0, Lcom/facebook/analytics/e/b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/analytics/e/b;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 334
    iget-object v1, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    invoke-static {v1}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    .line 335
    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/facebook/analytics/e/b;->c:Z

    if-eqz v1, :cond_0

    .line 337
    iget-object v1, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    invoke-static {v1}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/e/j;

    .line 338
    iget-object v0, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    iget-object v2, p0, Lcom/facebook/analytics/e/b;->b:Ljava/lang/String;

    iget-wide v3, p0, Lcom/facebook/analytics/e/b;->d:J

    iget-boolean v5, p0, Lcom/facebook/analytics/e/b;->c:Z

    iget-object v6, p0, Lcom/facebook/analytics/e/b;->e:Ljava/util/Map;

    invoke-static/range {v0 .. v6}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V

    .line 342
    :goto_0
    return-void

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/e/b;->f:Lcom/facebook/analytics/e/a;

    new-instance v1, Lcom/facebook/analytics/e/j;

    iget-object v2, p0, Lcom/facebook/analytics/e/b;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/facebook/analytics/e/j;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/analytics/e/b;->b:Ljava/lang/String;

    iget-wide v3, p0, Lcom/facebook/analytics/e/b;->d:J

    iget-boolean v5, p0, Lcom/facebook/analytics/e/b;->c:Z

    iget-object v6, p0, Lcom/facebook/analytics/e/b;->e:Ljava/util/Map;

    invoke-static/range {v0 .. v6}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Ljava/lang/String;JZLjava/util/Map;)V

    goto :goto_0
.end method
