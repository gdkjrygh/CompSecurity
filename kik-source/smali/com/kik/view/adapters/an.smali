.class final Lcom/kik/view/adapters/an;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/al;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/al;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/kik/view/adapters/an;->a:Lcom/kik/view/adapters/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/kik/view/adapters/an;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->d(Lcom/kik/view/adapters/ak;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/kik/view/adapters/an;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ak;->c()V

    .line 214
    iget-object v0, p0, Lcom/kik/view/adapters/an;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->d:Landroid/media/MediaPlayer$OnCompletionListener;

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/kik/view/adapters/an;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->d:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-interface {v0, p1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 218
    :cond_0
    return-void
.end method
