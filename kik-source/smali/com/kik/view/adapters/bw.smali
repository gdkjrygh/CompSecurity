.class final Lcom/kik/view/adapters/bw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Landroid/view/TextureView;

.field final synthetic d:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Landroid/view/TextureView;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bw;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/bw;->b:Lkik/a/d/s;

    iput-object p4, p0, Lcom/kik/view/adapters/bw;->c:Landroid/view/TextureView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    .line 455
    iget-object v0, p0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->s:Landroid/os/Handler;

    new-instance v1, Lcom/kik/view/adapters/bx;

    invoke-direct {v1, p0, p2}, Lcom/kik/view/adapters/bx;-><init>(Lcom/kik/view/adapters/bw;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 474
    const/4 v0, 0x0

    return v0
.end method
