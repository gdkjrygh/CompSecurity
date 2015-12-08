.class final Lcom/kik/view/adapters/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/al;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/al;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->g(Lcom/kik/view/adapters/ak;)Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->h(Lcom/kik/view/adapters/ak;)Lcom/kik/l/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v1, v1, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v1}, Lcom/kik/view/adapters/ak;->g(Lcom/kik/view/adapters/ak;)Lkik/a/d/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->d(Ljava/lang/String;)Z

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ak;->c()V

    .line 231
    iget-object v0, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    if-eqz v0, :cond_1

    .line 232
    iget-object v0, p0, Lcom/kik/view/adapters/ao;->a:Lcom/kik/view/adapters/al;

    iget-object v0, v0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    .line 234
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
