.class Lcom/facebook/analytics/bu;
.super Ljava/lang/Object;
.source "DefaultAnalyticsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/analytics/bt;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/bt;J)V
    .locals 0

    .prologue
    .line 322
    iput-object p1, p0, Lcom/facebook/analytics/bu;->b:Lcom/facebook/analytics/bt;

    iput-wide p2, p0, Lcom/facebook/analytics/bu;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/analytics/bu;->b:Lcom/facebook/analytics/bt;

    iget-wide v1, p0, Lcom/facebook/analytics/bu;->a:J

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;J)V

    .line 326
    return-void
.end method
