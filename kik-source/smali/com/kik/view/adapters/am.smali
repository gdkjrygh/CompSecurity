.class final Lcom/kik/view/adapters/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/al;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/al;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->e(Lcom/kik/view/adapters/ak;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->c:Landroid/media/MediaPlayer$OnPreparedListener;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 200
    iget-object v0, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->c:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-interface {v0, p1}, Landroid/media/MediaPlayer$OnPreparedListener;->onPrepared(Landroid/media/MediaPlayer;)V

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/am;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->f(Lcom/kik/view/adapters/ak;)Z

    .line 205
    return-void
.end method
