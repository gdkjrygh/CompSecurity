.class public Lcom/facebook/analytics/service/e;
.super Lcom/facebook/c/k;
.source "AnalyticsEventUploader.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/a;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/service/a;)V
    .locals 3

    .prologue
    .line 440
    iput-object p1, p0, Lcom/facebook/analytics/service/e;->a:Lcom/facebook/analytics/service/a;

    .line 441
    sget-object v0, Lcom/facebook/analytics/service/a;->b:Ljava/lang/String;

    new-instance v1, Lcom/facebook/analytics/service/c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/facebook/analytics/service/c;-><init>(Lcom/facebook/analytics/service/a;Lcom/facebook/analytics/service/b;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 442
    return-void
.end method
