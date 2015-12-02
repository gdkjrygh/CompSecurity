.class Lcom/facebook/analytics/bv;
.super Landroid/content/BroadcastReceiver;
.source "DefaultAnalyticsLogger.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/bt;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 680
    iput-object p1, p0, Lcom/facebook/analytics/bv;->a:Lcom/facebook/analytics/bt;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 684
    invoke-virtual {p0}, Lcom/facebook/analytics/bv;->isInitialStickyBroadcast()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 694
    :cond_0
    :goto_0
    return-void

    .line 689
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/bv;->a:Lcom/facebook/analytics/bt;

    invoke-static {v0}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 693
    iget-object v0, p0, Lcom/facebook/analytics/bv;->a:Lcom/facebook/analytics/bt;

    invoke-static {v0, p1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Landroid/content/Context;)V

    goto :goto_0
.end method
