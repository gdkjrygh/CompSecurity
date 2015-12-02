.class public Lcom/facebook/analytics/service/o;
.super Lcom/facebook/analytics/ce;
.source "AnalyticsService.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/AnalyticsService;


# direct methods
.method protected constructor <init>(Lcom/facebook/analytics/service/AnalyticsService;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/facebook/analytics/service/o;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-direct {p0}, Lcom/facebook/analytics/ce;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/analytics/AnalyticsServiceEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/analytics/service/o;->a:Lcom/facebook/analytics/service/AnalyticsService;

    invoke-static {v0, p1}, Lcom/facebook/analytics/service/AnalyticsService;->a(Lcom/facebook/analytics/service/AnalyticsService;Ljava/util/List;)V

    .line 161
    return-void
.end method
