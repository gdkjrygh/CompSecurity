.class public Lcom/facebook/abtest/qe/a/a;
.super Lcom/facebook/analytics/cc;
.source "QuickExperimentAnalyticsEvent.java"


# direct methods
.method public constructor <init>(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/a/b;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 2

    .prologue
    .line 41
    const-string v0, "quick_experiment_event"

    invoke-direct {p0, v0}, Lcom/facebook/analytics/cc;-><init>(Ljava/lang/String;)V

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "__qe__"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/a/a;->e(Ljava/lang/String;)Lcom/facebook/analytics/cc;

    .line 45
    const-string v0, "group"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cc;

    .line 46
    const-string v0, "event"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/a/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cc;

    .line 47
    const-string v0, "context"

    invoke-virtual {p0, v0, p3}, Lcom/facebook/abtest/qe/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cc;

    .line 48
    if-eqz p4, :cond_0

    .line 49
    const-string v0, "extras"

    invoke-virtual {p0, v0, p4}, Lcom/facebook/abtest/qe/a/a;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cc;

    .line 51
    :cond_0
    return-void
.end method
