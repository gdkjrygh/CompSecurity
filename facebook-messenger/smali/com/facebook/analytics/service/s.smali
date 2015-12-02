.class Lcom/facebook/analytics/service/s;
.super Ljava/lang/Object;
.source "DefaultHoneyAnalyticsPeriodicReporter.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/r;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/service/r;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/analytics/service/s;->a:Lcom/facebook/analytics/service/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/analytics/service/s;->a:Lcom/facebook/analytics/service/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/analytics/service/r;->a(Lcom/facebook/analytics/service/r;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 59
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 55
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/analytics/service/s;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/analytics/service/s;->a:Lcom/facebook/analytics/service/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/analytics/service/r;->a(Lcom/facebook/analytics/service/r;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 64
    return-void
.end method
