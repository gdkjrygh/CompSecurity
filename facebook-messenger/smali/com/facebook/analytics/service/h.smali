.class Lcom/facebook/analytics/service/h;
.super Lcom/facebook/base/broadcast/o;
.source "AnalyticsEventUploader.java"


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/a;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/service/a;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 408
    iput-object p1, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    .line 409
    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/o;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 410
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 414
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 415
    iget-object v1, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v1}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/service/a;)Lcom/facebook/common/time/a;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 416
    const-string v3, "android.intent.action.SCREEN_ON"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 417
    invoke-static {}, Lcom/facebook/analytics/service/a;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "Screen on, maybe sending pending events, turning event throttling off."

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 418
    invoke-static {}, Lcom/facebook/analytics/service/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->c(Lcom/facebook/analytics/service/a;)V

    .line 421
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    const/4 v3, 0x1

    invoke-static {v0, v3}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/a;Z)Z

    .line 423
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/a;J)J

    .line 424
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/am;)V

    .line 433
    :cond_1
    :goto_0
    return-void

    .line 425
    :cond_2
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    invoke-static {}, Lcom/facebook/analytics/service/a;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Screen off, event uploading throttled to once per hour."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 427
    invoke-static {}, Lcom/facebook/analytics/service/a;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 428
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->d(Lcom/facebook/analytics/service/a;)V

    .line 430
    :cond_3
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/a;J)J

    .line 431
    iget-object v0, p0, Lcom/facebook/analytics/service/h;->a:Lcom/facebook/analytics/service/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/a;Z)Z

    goto :goto_0
.end method
