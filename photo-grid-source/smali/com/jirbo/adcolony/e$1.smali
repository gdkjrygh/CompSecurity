.class Lcom/jirbo/adcolony/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 3

    .prologue
    .line 307
    iget-object v0, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    iput v1, v0, Lcom/jirbo/adcolony/e;->s:I

    .line 308
    iget-object v0, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    iput v1, v0, Lcom/jirbo/adcolony/e;->t:I

    .line 309
    iget-object v0, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->s:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    iget v0, v0, Lcom/jirbo/adcolony/e;->t:I

    if-eqz v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    iget v1, v1, Lcom/jirbo/adcolony/e;->s:I

    iget-object v2, p0, Lcom/jirbo/adcolony/e$1;->a:Lcom/jirbo/adcolony/e;

    iget v2, v2, Lcom/jirbo/adcolony/e;->t:I

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 312
    :cond_0
    return-void
.end method
