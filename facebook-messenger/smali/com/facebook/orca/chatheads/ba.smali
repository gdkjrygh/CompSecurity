.class Lcom/facebook/orca/chatheads/ba;
.super Lcom/facebook/orca/chatheads/bw;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ag;

.field final synthetic b:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V
    .locals 1

    .prologue
    .line 2410
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/ba;->a:Lcom/facebook/orca/chatheads/ag;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/bw;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/am;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 2413
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2414
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ba;->a:Lcom/facebook/orca/chatheads/ag;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ag;->performHapticFeedback(I)Z

    .line 2416
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ba;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V

    .line 2417
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2418
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2419
    new-instance v1, Lcom/facebook/orca/chatheads/bb;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bb;-><init>(Lcom/facebook/orca/chatheads/ba;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 2426
    :cond_1
    return-void
.end method
