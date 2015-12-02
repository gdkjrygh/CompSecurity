.class Lcom/facebook/analytics/bz;
.super Landroid/content/BroadcastReceiver;
.source "DefaultAnalyticsLogger.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/bt;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 890
    iput-object p1, p0, Lcom/facebook/analytics/bz;->a:Lcom/facebook/analytics/bt;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 893
    iget-object v0, p0, Lcom/facebook/analytics/bz;->a:Lcom/facebook/analytics/bt;

    sget-object v1, Lcom/facebook/analytics/h/e;->CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/h/e;Z)V

    .line 894
    return-void
.end method
