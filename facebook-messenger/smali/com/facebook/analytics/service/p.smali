.class Lcom/facebook/analytics/service/p;
.super Ljava/lang/Object;
.source "AnalyticsService.java"

# interfaces
.implements Lcom/facebook/analytics/service/f;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/AnalyticsService;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/service/AnalyticsService;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/facebook/analytics/service/p;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/service/AnalyticsService;Lcom/facebook/analytics/service/n;)V
    .locals 0

    .prologue
    .line 140
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/p;-><init>(Lcom/facebook/analytics/service/AnalyticsService;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/analytics/service/p;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-static {v0}, Lcom/facebook/analytics/service/AnalyticsService;->a(Lcom/facebook/analytics/service/AnalyticsService;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/p;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-static {v0}, Lcom/facebook/analytics/service/AnalyticsService;->b(Lcom/facebook/analytics/service/AnalyticsService;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/facebook/analytics/service/p;->a:Lcom/facebook/analytics/service/AnalyticsService;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/analytics/service/AnalyticsService;->a(Lcom/facebook/analytics/service/AnalyticsService;Z)Z

    .line 148
    iget-object v0, p0, Lcom/facebook/analytics/service/p;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-virtual {v0}, Lcom/facebook/analytics/service/AnalyticsService;->stopSelf()V

    .line 150
    :cond_0
    monitor-exit v1

    .line 151
    return-void

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
