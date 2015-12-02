.class Lcom/facebook/analytics/a/f;
.super Ljava/lang/Object;
.source "AnalyticsEventSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/a/a;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/a/a;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lcom/facebook/analytics/a/f;->a:Lcom/facebook/analytics/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/a/a;Lcom/facebook/analytics/a/b;)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1}, Lcom/facebook/analytics/a/f;-><init>(Lcom/facebook/analytics/a/a;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 268
    invoke-static {}, Lcom/facebook/analytics/a/a;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "SendRunnable.run()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/facebook/analytics/a/f;->a:Lcom/facebook/analytics/a/a;

    invoke-static {v0}, Lcom/facebook/analytics/a/a;->a(Lcom/facebook/analytics/a/a;)V

    .line 270
    return-void
.end method
