.class Lcom/facebook/analytics/e/f;
.super Lcom/facebook/analytics/cb;
.source "HoneyPerformanceEvent.java"


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;)V
    .locals 2

    .prologue
    .line 37
    const-string v0, "perf"

    invoke-direct {p0, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p6, p7}, Lcom/facebook/analytics/e/f;->a(J)Lcom/facebook/analytics/ca;

    .line 39
    invoke-static {p1}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 40
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/e/f;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 42
    invoke-static {p2}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 43
    invoke-virtual {p0, p2}, Lcom/facebook/analytics/e/f;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 45
    invoke-static {p3}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 46
    const-string v0, "marker"

    invoke-virtual {p0, v0, p3}, Lcom/facebook/analytics/e/f;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 48
    const-wide/16 v0, 0x0

    cmpl-double v0, p4, v0

    if-eqz v0, :cond_0

    .line 49
    const-string v0, "value"

    invoke-virtual {p0, v0, p4, p5}, Lcom/facebook/analytics/e/f;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 52
    :cond_0
    if-eqz p8, :cond_1

    .line 53
    const-string v0, "scenario"

    invoke-virtual {p0, v0, p8}, Lcom/facebook/analytics/e/f;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 55
    :cond_1
    iput-object p3, p0, Lcom/facebook/analytics/e/f;->b:Ljava/lang/String;

    .line 56
    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 3

    .prologue
    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/analytics/e/f;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/facebook/analytics/e/f;->j()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/facebook/analytics/e/f;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "perf:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/analytics/e/f;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/analytics/e/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
