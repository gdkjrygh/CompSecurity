.class Lcom/facebook/analytics/a/d;
.super Ljava/lang/Object;
.source "AnalyticsEventSender.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/a/a;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/a/a;)V
    .locals 0

    .prologue
    .line 328
    iput-object p1, p0, Lcom/facebook/analytics/a/d;->a:Lcom/facebook/analytics/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/a/a;Lcom/facebook/analytics/a/b;)V
    .locals 0

    .prologue
    .line 328
    invoke-direct {p0, p1}, Lcom/facebook/analytics/a/d;-><init>(Lcom/facebook/analytics/a/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/analytics/a/d;->a:Lcom/facebook/analytics/a/a;

    invoke-static {v0}, Lcom/facebook/analytics/a/a;->b(Lcom/facebook/analytics/a/a;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 338
    iget-object v0, p0, Lcom/facebook/analytics/a/d;->a:Lcom/facebook/analytics/a/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/a/a;->d()V

    .line 339
    return-void
.end method

.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 344
    sget-object v0, Lcom/facebook/prefs/shared/aj;->m:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p2, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/facebook/analytics/a/d;->a:Lcom/facebook/analytics/a/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/a/a;->d()V

    .line 347
    :cond_0
    return-void
.end method

.method public run()V
    .locals 0

    .prologue
    .line 333
    invoke-virtual {p0}, Lcom/facebook/analytics/a/d;->a()V

    .line 334
    return-void
.end method
