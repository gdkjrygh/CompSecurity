.class Lcom/jirbo/adcolony/e$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 475
    iput-object p1, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 479
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iput p3, v0, Lcom/jirbo/adcolony/e;->u:I

    .line 480
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iput p4, v0, Lcom/jirbo/adcolony/e;->v:I

    .line 481
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->p:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 482
    :goto_0
    iget-object v3, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v3, v3, Lcom/jirbo/adcolony/e;->s:I

    if-ne v3, p3, :cond_3

    iget-object v3, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v3, v3, Lcom/jirbo/adcolony/e;->t:I

    if-ne v3, p4, :cond_3

    .line 483
    :goto_1
    iget-object v2, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v2, v2, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 484
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->B:I

    if-eqz v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->B:I

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->seekTo(I)V

    .line 487
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    .line 488
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_1

    .line 489
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    .line 492
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 481
    goto :goto_0

    :cond_3
    move v1, v2

    .line 482
    goto :goto_1
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .prologue
    .line 496
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iput-object p1, v0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    .line 498
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->o:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->p:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    .line 500
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, v1, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 501
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->d()V

    .line 505
    :goto_0
    return-void

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    invoke-static {v0}, Lcom/jirbo/adcolony/e;->a(Lcom/jirbo/adcolony/e;)V

    goto :goto_0
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .prologue
    .line 510
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/jirbo/adcolony/e;->q:Landroid/view/SurfaceHolder;

    .line 511
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 512
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->o:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    .line 513
    iget-object v0, p0, Lcom/jirbo/adcolony/e$6;->a:Lcom/jirbo/adcolony/e;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/e;->a(Lcom/jirbo/adcolony/e;Z)V

    .line 515
    :cond_1
    return-void
.end method
