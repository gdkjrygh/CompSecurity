.class Lcom/qihoo/security/widget/a$3;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 414
    if-nez p2, :cond_1

    .line 466
    :cond_0
    :goto_0
    return-void

    .line 416
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 418
    const-string/jumbo v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 419
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->d(Lcom/qihoo/security/widget/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->e(Lcom/qihoo/security/widget/a;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 421
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->f(Lcom/qihoo/security/widget/a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->f(Lcom/qihoo/security/widget/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->f(Lcom/qihoo/security/widget/a;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 423
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->g(Lcom/qihoo/security/widget/a;)V

    .line 424
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->h(Lcom/qihoo/security/widget/a;)V

    .line 425
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->e(Lcom/qihoo/security/widget/a;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 426
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;Landroid/hardware/Camera;)Landroid/hardware/Camera;

    .line 427
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;Z)Z

    .line 433
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->i(Lcom/qihoo/security/widget/a;)V

    .line 434
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/widget/a$3$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/widget/a$3$1;-><init>(Lcom/qihoo/security/widget/a$3;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 445
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 446
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/qihoo/security/widget/a$a;->b(Z)V

    .line 448
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->j(Lcom/qihoo/security/widget/a;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->j(Lcom/qihoo/security/widget/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->j(Lcom/qihoo/security/widget/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 452
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 458
    :cond_5
    const-string/jumbo v1, "com.qihoo.security.action.TURN_OFF_LIGHT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 460
    iget-object v0, p0, Lcom/qihoo/security/widget/a$3;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/a;->b(Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/widget/a$a;->a()V

    goto/16 :goto_0
.end method
