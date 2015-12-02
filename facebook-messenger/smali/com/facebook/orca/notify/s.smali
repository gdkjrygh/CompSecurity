.class public Lcom/facebook/orca/notify/s;
.super Lcom/facebook/base/activity/a;
.source "InAppMessagingNotificationHandler.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/j;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 375
    iput-object p1, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0, p1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Landroid/app/Activity;)Landroid/app/Activity;

    .line 380
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 384
    iget-object v0, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0, v2}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Landroid/app/Activity;)Landroid/app/Activity;

    .line 385
    iget-object v0, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->d(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/v;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->d(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/v;

    move-result-object v0

    .line 390
    iget-object v1, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v1, v2}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/v;)Lcom/facebook/orca/notify/v;

    .line 391
    new-instance v1, Lcom/facebook/orca/notify/t;

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/notify/t;-><init>(Lcom/facebook/orca/notify/s;Landroid/view/View;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->c(Lcom/facebook/orca/notify/j;)V

    .line 399
    return-void
.end method
