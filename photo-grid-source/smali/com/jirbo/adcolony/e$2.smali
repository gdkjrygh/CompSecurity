.class Lcom/jirbo/adcolony/e$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 315
    iput-object p1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x1

    .line 317
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    const/4 v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/e;->o:I

    .line 319
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v2, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iput-boolean v3, v2, Lcom/jirbo/adcolony/e;->E:Z

    iput-boolean v3, v1, Lcom/jirbo/adcolony/e;->D:Z

    iput-boolean v3, v0, Lcom/jirbo/adcolony/e;->C:Z

    .line 321
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->y:Landroid/media/MediaPlayer$OnPreparedListener;

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->y:Landroid/media/MediaPlayer$OnPreparedListener;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, v1, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnPreparedListener;->onPrepared(Landroid/media/MediaPlayer;)V

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_1

    .line 325
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0, v3}, Landroid/widget/MediaController;->setEnabled(Z)V

    .line 327
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    iput v1, v0, Lcom/jirbo/adcolony/e;->s:I

    .line 328
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    iput v1, v0, Lcom/jirbo/adcolony/e;->t:I

    .line 330
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->B:I

    .line 332
    if-eqz v0, :cond_2

    .line 333
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/e;->seekTo(I)V

    .line 335
    :cond_2
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->s:I

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->t:I

    if-eqz v1, :cond_6

    .line 337
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    iget-object v2, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v2, v2, Lcom/jirbo/adcolony/e;->s:I

    iget-object v3, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v3, v3, Lcom/jirbo/adcolony/e;->t:I

    invoke-interface {v1, v2, v3}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 338
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->u:I

    iget-object v2, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v2, v2, Lcom/jirbo/adcolony/e;->s:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->v:I

    iget-object v2, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v2, v2, Lcom/jirbo/adcolony/e;->t:I

    if-ne v1, v2, :cond_3

    .line 342
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->p:I

    if-ne v1, v4, :cond_4

    .line 343
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    .line 344
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_3

    .line 345
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    .line 362
    :cond_3
    :goto_0
    return-void

    .line 347
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    .line 348
    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    if-lez v0, :cond_3

    .line 349
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_3

    .line 351
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->show(I)V

    goto :goto_0

    .line 358
    :cond_6
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->p:I

    if-ne v0, v4, :cond_3

    .line 359
    iget-object v0, p0, Lcom/jirbo/adcolony/e$2;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    goto :goto_0
.end method
