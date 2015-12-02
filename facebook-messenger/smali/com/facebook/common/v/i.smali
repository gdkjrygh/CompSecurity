.class public Lcom/facebook/common/v/i;
.super Lcom/facebook/base/activity/a;
.source "UserInteractionController.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/v/f;


# direct methods
.method public constructor <init>(Lcom/facebook/common/v/f;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/facebook/common/v/i;->a:Lcom/facebook/common/v/f;

    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/app/Activity;)V
    .locals 6

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/common/v/i;->a:Lcom/facebook/common/v/f;

    invoke-static {v0}, Lcom/facebook/common/v/f;->b(Lcom/facebook/common/v/f;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 255
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/v/i;->a:Lcom/facebook/common/v/f;

    invoke-static {v0}, Lcom/facebook/common/v/f;->c(Lcom/facebook/common/v/f;)Ljava/util/WeakHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 256
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 258
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    if-ne v3, p1, :cond_0

    .line 259
    const-string v3, "UserInteraction"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "View "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " was still marked as interacting when its"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " corresponding Activity was paused"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 264
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    iget-object v0, p0, Lcom/facebook/common/v/i;->a:Lcom/facebook/common/v/f;

    invoke-static {v0}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/f;)V

    .line 266
    return-void
.end method
