.class Lcom/facebook/fbservice/ops/z;
.super Lcom/facebook/fbservice/ops/n;
.source "DefaultBlueServiceOperationFactory.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/r;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/fbservice/ops/z;->a:Lcom/facebook/fbservice/ops/r;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/n;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/ops/q;)V
    .locals 0

    .prologue
    .line 119
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/z;-><init>(Lcom/facebook/fbservice/ops/r;)V

    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 135
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/z;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    :goto_0
    return-void

    .line 142
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v0, v3, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Cannot call get on main thread for unfinished operation"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/fbservice/ops/z;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->b(Lcom/facebook/fbservice/ops/r;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v0, v3, :cond_2

    :goto_2
    const-string v0, "Cannot call get on the operation\'s handler thread for unfinished operation"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    move v0, v2

    .line 142
    goto :goto_1

    :cond_2
    move v1, v2

    .line 145
    goto :goto_2
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 124
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/z;->e()V

    .line 125
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/fbservice/ops/n;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    return-object v0
.end method

.method public a(Lcom/facebook/fbservice/service/OperationResult;)Z
    .locals 1
    .param p1    # Lcom/facebook/fbservice/service/OperationResult;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 152
    invoke-super {p0, p1}, Lcom/facebook/fbservice/ops/n;->a_(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic a_(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 119
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/ops/z;->a(Lcom/facebook/fbservice/service/OperationResult;)Z

    move-result v0

    return v0
.end method

.method public a_(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    .line 157
    invoke-super {p0, p1}, Lcom/facebook/fbservice/ops/n;->a_(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method

.method public b()Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/z;->e()V

    .line 131
    invoke-super {p0}, Lcom/facebook/fbservice/ops/n;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    return-object v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/z;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/fbservice/ops/z;->a(JLjava/util/concurrent/TimeUnit;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
