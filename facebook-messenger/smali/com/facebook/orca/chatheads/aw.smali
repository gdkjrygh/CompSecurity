.class Lcom/facebook/orca/chatheads/aw;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/util/List",
        "<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 1522
    iput-object p1, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1522
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/aw;->a(Ljava/util/List;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 1558
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1559
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to updatePositions: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 1561
    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v4, 0xb

    const/4 v3, 0x0

    .line 1525
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->w(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1526
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Z)Z

    .line 1527
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->x(Lcom/facebook/orca/chatheads/al;)V

    .line 1533
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->z(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v0, v0, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/bo;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1535
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 1536
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1540
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1541
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->j()V

    .line 1542
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->f()V

    .line 1543
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1544
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->m()V

    .line 1554
    :cond_2
    :goto_0
    return-void

    .line 1547
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1549
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;I)V

    .line 1552
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aw;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->B(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0
.end method
