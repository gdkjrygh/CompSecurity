.class Lcom/facebook/orca/notify/p;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/j;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 402
    iput-object p1, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/k;)V
    .locals 0

    .prologue
    .line 402
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/p;-><init>(Lcom/facebook/orca/notify/j;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    .line 411
    iget-object v0, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Z)Z

    .line 412
    iget-object v0, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->e(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/ap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 413
    iget-object v0, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->e(Lcom/facebook/orca/notify/j;)Lcom/facebook/orca/notify/ap;

    move-result-object v0

    .line 414
    iget-object v1, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/facebook/orca/notify/j;->b(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)Lcom/facebook/orca/notify/ap;

    .line 416
    iget-object v1, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v1}, Lcom/facebook/orca/notify/j;->f(Lcom/facebook/orca/notify/j;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/notify/q;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/notify/q;-><init>(Lcom/facebook/orca/notify/p;Lcom/facebook/orca/notify/ap;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 423
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 427
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Z)Z

    .line 407
    return-void
.end method
