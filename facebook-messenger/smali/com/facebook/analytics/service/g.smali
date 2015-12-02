.class final Lcom/facebook/analytics/service/g;
.super Ljava/lang/Object;
.source "AnalyticsEventUploader.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/a;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/analytics/service/g;->a:Lcom/facebook/analytics/service/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/service/a;Lcom/facebook/analytics/service/b;)V
    .locals 0

    .prologue
    .line 202
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/g;-><init>(Lcom/facebook/analytics/service/a;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 205
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    .line 206
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v2, "AnalyticsEventUploader"

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/g;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->a(Lcom/facebook/analytics/service/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 212
    return-void

    .line 210
    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method
