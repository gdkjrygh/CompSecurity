.class Lcom/facebook/inject/ae;
.super Ljava/lang/Object;
.source "LessEagerUiThreadSingletonInitializer.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/facebook/inject/ad;


# direct methods
.method constructor <init>(Lcom/facebook/inject/ad;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/facebook/inject/ae;->b:Lcom/facebook/inject/ad;

    iput-object p2, p0, Lcom/facebook/inject/ae;->a:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 9

    .prologue
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 35
    const-string v0, "LessEagerUiThreadSingletonInitializer"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 36
    iget-object v0, p0, Lcom/facebook/inject/ae;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 37
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 39
    iget-object v5, p0, Lcom/facebook/inject/ae;->b:Lcom/facebook/inject/ad;

    invoke-static {v5}, Lcom/facebook/inject/ad;->a(Lcom/facebook/inject/ad;)Lcom/facebook/inject/t;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v1

    const-wide/16 v7, 0x32

    cmp-long v0, v5, v7

    if-lez v0, :cond_0

    .line 46
    :cond_1
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    .line 47
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method
