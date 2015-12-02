.class public Lcom/facebook/analytics/j/a;
.super Lcom/facebook/analytics/a;
.source "WebRequestCounters.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/facebook/analytics/ak;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/ak;Lcom/facebook/analytics/b/c;)V
    .locals 1
    .param p2    # Lcom/facebook/analytics/b/c;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 35
    invoke-direct {p0, p2}, Lcom/facebook/analytics/a;-><init>(Lcom/facebook/analytics/b/c;)V

    .line 20
    const-string v0, "total_request"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->a:Ljava/lang/String;

    .line 21
    const-string v0, "unique_request"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->b:Ljava/lang/String;

    .line 22
    const-string v0, "total_succeed"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->c:Ljava/lang/String;

    .line 23
    const-string v0, "succeed_on_first_try"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->d:Ljava/lang/String;

    .line 24
    const-string v0, "succeed_on_second_try"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->e:Ljava/lang/String;

    .line 25
    const-string v0, "succeed_on_third_try"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->f:Ljava/lang/String;

    .line 26
    const-string v0, "succeed_on_fourth_onward_try"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->g:Ljava/lang/String;

    .line 27
    const-string v0, "ignored_request_due_to_cache_failure"

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->h:Ljava/lang/String;

    .line 36
    iput-object p1, p0, Lcom/facebook/analytics/j/a;->j:Lcom/facebook/analytics/ak;

    .line 37
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/j/a;->i:Ljava/util/Map;

    .line 38
    return-void
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/analytics/j/a;->j:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    const-string v0, "web_request_counters"

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 46
    invoke-direct {p0}, Lcom/facebook/analytics/j/a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    :goto_0
    return-void

    .line 50
    :cond_0
    const-string v0, "total_request"

    invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    .line 52
    iget-object v0, p0, Lcom/facebook/analytics/j/a;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 53
    if-eqz v0, :cond_1

    .line 54
    iget-object v1, p0, Lcom/facebook/analytics/j/a;->i:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/j/a;->i:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    const-string v0, "unique_request"

    invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .prologue
    const-wide/16 v1, 0x1

    .line 63
    invoke-direct {p0}, Lcom/facebook/analytics/j/a;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 86
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    const-string v0, "total_succeed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    .line 69
    iget-object v0, p0, Lcom/facebook/analytics/j/a;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 70
    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 82
    const-string v0, "succeed_on_fourth_onward_try"

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 73
    :pswitch_0
    const-string v0, "succeed_on_first_try"

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 76
    :pswitch_1
    const-string v0, "succeed_on_second_try"

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 79
    :pswitch_2
    const-string v0, "succeed_on_third_try"

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 71
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e()V
    .locals 3

    .prologue
    .line 89
    invoke-direct {p0}, Lcom/facebook/analytics/j/a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    :goto_0
    return-void

    .line 93
    :cond_0
    const-string v0, "ignored_request_due_to_cache_failure"

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/j/a;->a(Ljava/lang/String;J)V

    goto :goto_0
.end method
