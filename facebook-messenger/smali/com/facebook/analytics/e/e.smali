.class Lcom/facebook/analytics/e/e;
.super Ljava/lang/Object;
.source "DefaultPerformanceLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:D

.field final synthetic d:J

.field final synthetic e:Lcom/facebook/analytics/e/a;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;DJ)V
    .locals 0

    .prologue
    .line 808
    iput-object p1, p0, Lcom/facebook/analytics/e/e;->e:Lcom/facebook/analytics/e/a;

    iput-object p2, p0, Lcom/facebook/analytics/e/e;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/analytics/e/e;->b:Ljava/lang/String;

    iput-wide p4, p0, Lcom/facebook/analytics/e/e;->c:D

    iput-wide p6, p0, Lcom/facebook/analytics/e/e;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 811
    iget-object v0, p0, Lcom/facebook/analytics/e/e;->e:Lcom/facebook/analytics/e/a;

    iget-object v1, p0, Lcom/facebook/analytics/e/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/analytics/e/e;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 812
    iget-object v1, p0, Lcom/facebook/analytics/e/e;->e:Lcom/facebook/analytics/e/a;

    invoke-static {v1}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/e/j;

    .line 813
    if-eqz v1, :cond_0

    .line 814
    iget-wide v2, p0, Lcom/facebook/analytics/e/e;->c:D

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/e/j;->a(D)V

    .line 815
    iget-object v0, p0, Lcom/facebook/analytics/e/e;->e:Lcom/facebook/analytics/e/a;

    sget-object v2, Lcom/facebook/analytics/e/h;->VALUE:Lcom/facebook/analytics/e/h;

    iget-wide v3, p0, Lcom/facebook/analytics/e/e;->d:J

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/facebook/analytics/e/a;->a(Lcom/facebook/analytics/e/a;Lcom/facebook/analytics/e/j;Lcom/facebook/analytics/e/h;JLjava/util/Map;)V

    .line 817
    :cond_0
    return-void
.end method
