.class Lcom/facebook/orca/compose/e;
.super Ljava/lang/Object;
.source "AudioComposerView.java"

# interfaces
.implements Lcom/facebook/orca/d/ao;


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic b:Lcom/facebook/orca/compose/AudioComposerView;

.field private c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 423
    iput-object p1, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    iput-object p2, p0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 428
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->b(Lcom/facebook/orca/compose/AudioComposerView;Z)Z

    .line 429
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->j(Lcom/facebook/orca/compose/AudioComposerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->b(Lcom/facebook/orca/compose/AudioComposerView;)V

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->k(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->c()V

    .line 436
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/time/c;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;J)J

    .line 438
    new-instance v0, Lcom/facebook/orca/compose/f;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/f;-><init>(Lcom/facebook/orca/compose/e;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    .line 445
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 446
    return-void
.end method

.method public a(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 461
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 462
    if-eqz p1, :cond_0

    .line 463
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;Landroid/net/Uri;)V

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->e(Lcom/facebook/orca/compose/AudioComposerView;)V

    .line 466
    return-void
.end method

.method public a(Landroid/net/Uri;I)V
    .locals 2

    .prologue
    .line 451
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->c(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/h;->a(Landroid/net/Uri;)V

    .line 453
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 454
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->k(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/aq;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/d/aq;->a(I)V

    .line 455
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->l(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->c()V

    .line 456
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;I)V

    .line 457
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 470
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 471
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/compose/e;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 475
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    iget-object v1, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v1}, Lcom/facebook/orca/compose/AudioComposerView;->m(Lcom/facebook/orca/compose/AudioComposerView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->e(Lcom/facebook/orca/compose/AudioComposerView;)V

    .line 477
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 483
    iget-object v0, p0, Lcom/facebook/orca/compose/e;->b:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->audio_recording_attachment_error:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 485
    return-void
.end method
