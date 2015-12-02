.class Lcom/facebook/analytics/bw;
.super Ljava/lang/Object;
.source "DefaultAnalyticsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/bt;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 905
    iput-object p1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/bu;)V
    .locals 0

    .prologue
    .line 905
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bw;-><init>(Lcom/facebook/analytics/bt;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 911
    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->d(Lcom/facebook/analytics/bt;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 913
    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->e(Lcom/facebook/analytics/bt;)V

    .line 915
    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/ak;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v3

    .line 916
    sget-object v1, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    if-eq v3, v1, :cond_0

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-eq v3, v1, :cond_0

    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->f(Lcom/facebook/analytics/bt;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->g(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/al;

    move-result-object v1

    sget-object v4, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    if-eq v1, v4, :cond_0

    iget-object v1, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->g(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/al;

    move-result-object v1

    sget-object v4, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v1, v4, :cond_3

    :cond_0
    move v1, v2

    .line 922
    :goto_0
    sget-object v4, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-eq v3, v4, :cond_1

    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3}, Lcom/facebook/analytics/bt;->f(Lcom/facebook/analytics/bt;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3}, Lcom/facebook/analytics/bt;->g(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/al;

    move-result-object v3

    sget-object v4, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v3, v4, :cond_4

    .line 924
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v0}, Lcom/facebook/analytics/bt;->h(Lcom/facebook/analytics/bt;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/ca;

    if-eqz v0, :cond_9

    .line 925
    invoke-virtual {v0}, Lcom/facebook/analytics/ca;->h()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 926
    if-nez v1, :cond_2

    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 927
    :cond_2
    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)V

    goto :goto_1

    :cond_3
    move v1, v0

    .line 916
    goto :goto_0

    :cond_4
    move v2, v0

    .line 922
    goto :goto_1

    .line 929
    :cond_5
    invoke-static {}, Lcom/facebook/analytics/bt;->f()Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Core Event not logged: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/analytics/ca;->e()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 933
    :cond_6
    if-nez v2, :cond_7

    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3, v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 934
    :cond_7
    iget-object v3, p0, Lcom/facebook/analytics/bw;->a:Lcom/facebook/analytics/bt;

    invoke-static {v3, v0}, Lcom/facebook/analytics/bt;->b(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/ca;)V

    goto :goto_1

    .line 936
    :cond_8
    invoke-static {}, Lcom/facebook/analytics/bt;->f()Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Event not logged: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/analytics/ca;->e()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 940
    :cond_9
    return-void
.end method
