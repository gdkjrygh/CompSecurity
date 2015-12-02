.class public Lcom/facebook/analytics/g/g;
.super Ljava/lang/Object;
.source "TimeWindowThrottlingPolicy.java"

# interfaces
.implements Lcom/facebook/analytics/g/e;


# instance fields
.field private a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/g/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    iput-object p1, p0, Lcom/facebook/analytics/g/g;->b:Lcom/facebook/common/time/a;

    .line 55
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/am;)Z
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 59
    const-string v0, "throttle_key"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "throttle_duration"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    const-string v0, "throttle_key"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 65
    :try_start_0
    const-string v0, "throttle_duration"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v3

    .line 71
    iget-object v0, p0, Lcom/facebook/analytics/g/g;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    .line 72
    iget-object v0, p0, Lcom/facebook/analytics/g/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 74
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sub-long v7, v5, v7

    cmp-long v0, v7, v3

    if-lez v0, :cond_1

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/g/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    .line 81
    :goto_0
    return v0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    const-string v2, "Invalid throttle duration tag."

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 68
    goto :goto_0

    .line 78
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 81
    goto :goto_0
.end method
