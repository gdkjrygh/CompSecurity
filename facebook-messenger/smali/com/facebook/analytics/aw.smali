.class public Lcom/facebook/analytics/aw;
.super Lcom/facebook/inject/c;
.source "AnalyticsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 17
    new-instance v0, Lcom/facebook/analytics/ay;

    invoke-direct {v0}, Lcom/facebook/analytics/ay;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/aw;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 18
    new-instance v0, Lcom/facebook/analytics/f;

    invoke-direct {v0}, Lcom/facebook/analytics/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/aw;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 19
    return-void
.end method
