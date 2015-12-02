.class Lcom/facebook/common/v/b;
.super Ljava/lang/Object;
.source "AppUserInteractionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/v/a;


# direct methods
.method constructor <init>(Lcom/facebook/common/v/a;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/common/v/b;->a:Lcom/facebook/common/v/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/common/v/b;->a:Lcom/facebook/common/v/a;

    invoke-static {v0}, Lcom/facebook/common/v/a;->a(Lcom/facebook/common/v/a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This should have been canceled"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/common/v/b;->a:Lcom/facebook/common/v/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/common/v/a;->a(Lcom/facebook/common/v/a;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 65
    iget-object v0, p0, Lcom/facebook/common/v/b;->a:Lcom/facebook/common/v/a;

    invoke-static {v0}, Lcom/facebook/common/v/a;->b(Lcom/facebook/common/v/a;)Lcom/facebook/base/broadcast/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/v/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 66
    return-void

    .line 63
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
