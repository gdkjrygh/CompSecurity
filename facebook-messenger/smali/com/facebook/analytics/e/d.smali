.class Lcom/facebook/analytics/e/d;
.super Ljava/lang/Object;
.source "DefaultPerformanceLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Lcom/facebook/analytics/e/a;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
    .locals 0

    .prologue
    .line 631
    iput-object p1, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    iput-object p2, p0, Lcom/facebook/analytics/e/d;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/analytics/e/d;->b:Ljava/lang/String;

    iput-wide p4, p0, Lcom/facebook/analytics/e/d;->c:J

    iput-object p6, p0, Lcom/facebook/analytics/e/d;->d:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 634
    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    iget-object v1, p0, Lcom/facebook/analytics/e/d;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/analytics/e/d;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 635
    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    invoke-static {v0}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/e/j;

    .line 636
    if-nez v1, :cond_0

    .line 649
    :goto_0
    return-void

    .line 643
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/analytics/e/j;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    invoke-static {v0}, Lcom/facebook/analytics/e/a;->b(Lcom/facebook/analytics/e/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 644
    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    invoke-static {v0}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    sget-object v2, Lcom/facebook/analytics/e/h;->STOP:Lcom/facebook/analytics/e/h;

    iget-wide v3, p0, Lcom/facebook/analytics/e/d;->c:J

    iget-object v5, p0, Lcom/facebook/analytics/e/d;->d:Ljava/util/Map;

    invoke-static/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V

    .line 648
    iget-object v0, p0, Lcom/facebook/analytics/e/d;->e:Lcom/facebook/analytics/e/a;

    invoke-static {v0}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
