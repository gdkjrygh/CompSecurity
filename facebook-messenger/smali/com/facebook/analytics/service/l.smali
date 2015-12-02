.class final Lcom/facebook/analytics/service/l;
.super Ljava/lang/Object;
.source "AnalyticsEventsDataStore.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/i;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/service/i;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lcom/facebook/analytics/service/l;->a:Lcom/facebook/analytics/service/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/service/i;Lcom/facebook/analytics/service/j;)V
    .locals 0

    .prologue
    .line 181
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/l;-><init>(Lcom/facebook/analytics/service/i;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 184
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "AnalyticsEventsDataStore"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/facebook/analytics/service/l;->a:Lcom/facebook/analytics/service/i;

    invoke-static {v0}, Lcom/facebook/analytics/service/i;->a(Lcom/facebook/analytics/service/i;)V

    .line 186
    return-void
.end method
