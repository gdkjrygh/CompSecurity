.class public Lcom/splunk/mint/network/MonitorRegistry;
.super Ljava/lang/Object;
.source "MonitorRegistry.java"


# instance fields
.field private metrics:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/splunk/mint/network/Metric",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/MonitorRegistry;->metrics:Ljava/util/Set;

    .line 14
    return-void
.end method


# virtual methods
.method public add(Lcom/splunk/mint/network/Metric;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/splunk/mint/network/Metric",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 19
    .local p1, "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    iget-object v0, p0, Lcom/splunk/mint/network/MonitorRegistry;->metrics:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    return-void
.end method

.method public declared-synchronized getMetricsForName(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/splunk/mint/network/Metric",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 23
    monitor-enter p0

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .local v2, "returnedMetrics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/splunk/mint/network/Metric<*>;>;"
    iget-object v3, p0, Lcom/splunk/mint/network/MonitorRegistry;->metrics:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 27
    .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/splunk/mint/network/Metric<*>;>;"
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/splunk/mint/network/Metric;

    .line 29
    .local v1, "metric":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    invoke-virtual {v1}, Lcom/splunk/mint/network/Metric;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1}, Lcom/splunk/mint/network/Metric;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "-"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 30
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 23
    .end local v0    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/splunk/mint/network/Metric<*>;>;"
    .end local v1    # "metric":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    .end local v2    # "returnedMetrics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/splunk/mint/network/Metric<*>;>;"
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3

    .line 44
    .restart local v0    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/splunk/mint/network/Metric<*>;>;"
    .restart local v2    # "returnedMetrics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/splunk/mint/network/Metric<*>;>;"
    :cond_1
    monitor-exit p0

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 62
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 63
    .local v2, "strBuf":Ljava/lang/StringBuffer;
    iget-object v3, p0, Lcom/splunk/mint/network/MonitorRegistry;->metrics:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/splunk/mint/network/Metric;

    .line 64
    .local v1, "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/splunk/mint/network/Metric;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/splunk/mint/network/Metric;->getValue()Ljava/io/Serializable;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 66
    .end local v1    # "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method
